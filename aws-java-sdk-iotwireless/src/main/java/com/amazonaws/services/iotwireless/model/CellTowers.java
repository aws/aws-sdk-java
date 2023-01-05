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
 * The cell towers that were used to perform the measurements.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/CellTowers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CellTowers implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * GSM object information.
     * </p>
     */
    private java.util.List<GsmObj> gsm;
    /**
     * <p>
     * WCDMA object information.
     * </p>
     */
    private java.util.List<WcdmaObj> wcdma;
    /**
     * <p>
     * TD-SCDMA object information.
     * </p>
     */
    private java.util.List<TdscdmaObj> tdscdma;
    /**
     * <p>
     * LTE object information.
     * </p>
     */
    private java.util.List<LteObj> lte;
    /**
     * <p>
     * CDMA object information.
     * </p>
     */
    private java.util.List<CdmaObj> cdma;

    /**
     * <p>
     * GSM object information.
     * </p>
     * 
     * @return GSM object information.
     */

    public java.util.List<GsmObj> getGsm() {
        return gsm;
    }

    /**
     * <p>
     * GSM object information.
     * </p>
     * 
     * @param gsm
     *        GSM object information.
     */

    public void setGsm(java.util.Collection<GsmObj> gsm) {
        if (gsm == null) {
            this.gsm = null;
            return;
        }

        this.gsm = new java.util.ArrayList<GsmObj>(gsm);
    }

    /**
     * <p>
     * GSM object information.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGsm(java.util.Collection)} or {@link #withGsm(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param gsm
     *        GSM object information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CellTowers withGsm(GsmObj... gsm) {
        if (this.gsm == null) {
            setGsm(new java.util.ArrayList<GsmObj>(gsm.length));
        }
        for (GsmObj ele : gsm) {
            this.gsm.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * GSM object information.
     * </p>
     * 
     * @param gsm
     *        GSM object information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CellTowers withGsm(java.util.Collection<GsmObj> gsm) {
        setGsm(gsm);
        return this;
    }

    /**
     * <p>
     * WCDMA object information.
     * </p>
     * 
     * @return WCDMA object information.
     */

    public java.util.List<WcdmaObj> getWcdma() {
        return wcdma;
    }

    /**
     * <p>
     * WCDMA object information.
     * </p>
     * 
     * @param wcdma
     *        WCDMA object information.
     */

    public void setWcdma(java.util.Collection<WcdmaObj> wcdma) {
        if (wcdma == null) {
            this.wcdma = null;
            return;
        }

        this.wcdma = new java.util.ArrayList<WcdmaObj>(wcdma);
    }

    /**
     * <p>
     * WCDMA object information.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWcdma(java.util.Collection)} or {@link #withWcdma(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param wcdma
     *        WCDMA object information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CellTowers withWcdma(WcdmaObj... wcdma) {
        if (this.wcdma == null) {
            setWcdma(new java.util.ArrayList<WcdmaObj>(wcdma.length));
        }
        for (WcdmaObj ele : wcdma) {
            this.wcdma.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * WCDMA object information.
     * </p>
     * 
     * @param wcdma
     *        WCDMA object information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CellTowers withWcdma(java.util.Collection<WcdmaObj> wcdma) {
        setWcdma(wcdma);
        return this;
    }

    /**
     * <p>
     * TD-SCDMA object information.
     * </p>
     * 
     * @return TD-SCDMA object information.
     */

    public java.util.List<TdscdmaObj> getTdscdma() {
        return tdscdma;
    }

    /**
     * <p>
     * TD-SCDMA object information.
     * </p>
     * 
     * @param tdscdma
     *        TD-SCDMA object information.
     */

    public void setTdscdma(java.util.Collection<TdscdmaObj> tdscdma) {
        if (tdscdma == null) {
            this.tdscdma = null;
            return;
        }

        this.tdscdma = new java.util.ArrayList<TdscdmaObj>(tdscdma);
    }

    /**
     * <p>
     * TD-SCDMA object information.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTdscdma(java.util.Collection)} or {@link #withTdscdma(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param tdscdma
     *        TD-SCDMA object information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CellTowers withTdscdma(TdscdmaObj... tdscdma) {
        if (this.tdscdma == null) {
            setTdscdma(new java.util.ArrayList<TdscdmaObj>(tdscdma.length));
        }
        for (TdscdmaObj ele : tdscdma) {
            this.tdscdma.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * TD-SCDMA object information.
     * </p>
     * 
     * @param tdscdma
     *        TD-SCDMA object information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CellTowers withTdscdma(java.util.Collection<TdscdmaObj> tdscdma) {
        setTdscdma(tdscdma);
        return this;
    }

    /**
     * <p>
     * LTE object information.
     * </p>
     * 
     * @return LTE object information.
     */

    public java.util.List<LteObj> getLte() {
        return lte;
    }

    /**
     * <p>
     * LTE object information.
     * </p>
     * 
     * @param lte
     *        LTE object information.
     */

    public void setLte(java.util.Collection<LteObj> lte) {
        if (lte == null) {
            this.lte = null;
            return;
        }

        this.lte = new java.util.ArrayList<LteObj>(lte);
    }

    /**
     * <p>
     * LTE object information.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLte(java.util.Collection)} or {@link #withLte(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param lte
     *        LTE object information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CellTowers withLte(LteObj... lte) {
        if (this.lte == null) {
            setLte(new java.util.ArrayList<LteObj>(lte.length));
        }
        for (LteObj ele : lte) {
            this.lte.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * LTE object information.
     * </p>
     * 
     * @param lte
     *        LTE object information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CellTowers withLte(java.util.Collection<LteObj> lte) {
        setLte(lte);
        return this;
    }

    /**
     * <p>
     * CDMA object information.
     * </p>
     * 
     * @return CDMA object information.
     */

    public java.util.List<CdmaObj> getCdma() {
        return cdma;
    }

    /**
     * <p>
     * CDMA object information.
     * </p>
     * 
     * @param cdma
     *        CDMA object information.
     */

    public void setCdma(java.util.Collection<CdmaObj> cdma) {
        if (cdma == null) {
            this.cdma = null;
            return;
        }

        this.cdma = new java.util.ArrayList<CdmaObj>(cdma);
    }

    /**
     * <p>
     * CDMA object information.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCdma(java.util.Collection)} or {@link #withCdma(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param cdma
     *        CDMA object information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CellTowers withCdma(CdmaObj... cdma) {
        if (this.cdma == null) {
            setCdma(new java.util.ArrayList<CdmaObj>(cdma.length));
        }
        for (CdmaObj ele : cdma) {
            this.cdma.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * CDMA object information.
     * </p>
     * 
     * @param cdma
     *        CDMA object information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CellTowers withCdma(java.util.Collection<CdmaObj> cdma) {
        setCdma(cdma);
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
        if (getGsm() != null)
            sb.append("Gsm: ").append(getGsm()).append(",");
        if (getWcdma() != null)
            sb.append("Wcdma: ").append(getWcdma()).append(",");
        if (getTdscdma() != null)
            sb.append("Tdscdma: ").append(getTdscdma()).append(",");
        if (getLte() != null)
            sb.append("Lte: ").append(getLte()).append(",");
        if (getCdma() != null)
            sb.append("Cdma: ").append(getCdma());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CellTowers == false)
            return false;
        CellTowers other = (CellTowers) obj;
        if (other.getGsm() == null ^ this.getGsm() == null)
            return false;
        if (other.getGsm() != null && other.getGsm().equals(this.getGsm()) == false)
            return false;
        if (other.getWcdma() == null ^ this.getWcdma() == null)
            return false;
        if (other.getWcdma() != null && other.getWcdma().equals(this.getWcdma()) == false)
            return false;
        if (other.getTdscdma() == null ^ this.getTdscdma() == null)
            return false;
        if (other.getTdscdma() != null && other.getTdscdma().equals(this.getTdscdma()) == false)
            return false;
        if (other.getLte() == null ^ this.getLte() == null)
            return false;
        if (other.getLte() != null && other.getLte().equals(this.getLte()) == false)
            return false;
        if (other.getCdma() == null ^ this.getCdma() == null)
            return false;
        if (other.getCdma() != null && other.getCdma().equals(this.getCdma()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGsm() == null) ? 0 : getGsm().hashCode());
        hashCode = prime * hashCode + ((getWcdma() == null) ? 0 : getWcdma().hashCode());
        hashCode = prime * hashCode + ((getTdscdma() == null) ? 0 : getTdscdma().hashCode());
        hashCode = prime * hashCode + ((getLte() == null) ? 0 : getLte().hashCode());
        hashCode = prime * hashCode + ((getCdma() == null) ? 0 : getCdma().hashCode());
        return hashCode;
    }

    @Override
    public CellTowers clone() {
        try {
            return (CellTowers) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.CellTowersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
