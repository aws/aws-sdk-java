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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The time when journey will stop sending messages.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/ClosedDays" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClosedDays implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Rules for Email Channel.
     * </p>
     */
    private java.util.List<ClosedDaysRule> eMAIL;
    /**
     * <p>
     * Rules for SMS Channel.
     * </p>
     */
    private java.util.List<ClosedDaysRule> sMS;
    /**
     * <p>
     * Rules for Push Channel.
     * </p>
     */
    private java.util.List<ClosedDaysRule> pUSH;
    /**
     * <p>
     * Rules for Voice Channel.
     * </p>
     */
    private java.util.List<ClosedDaysRule> vOICE;
    /**
     * <p>
     * Rules for Custom Channel.
     * </p>
     */
    private java.util.List<ClosedDaysRule> cUSTOM;

    /**
     * <p>
     * Rules for Email Channel.
     * </p>
     * 
     * @return Rules for Email Channel.
     */

    public java.util.List<ClosedDaysRule> getEMAIL() {
        return eMAIL;
    }

    /**
     * <p>
     * Rules for Email Channel.
     * </p>
     * 
     * @param eMAIL
     *        Rules for Email Channel.
     */

    public void setEMAIL(java.util.Collection<ClosedDaysRule> eMAIL) {
        if (eMAIL == null) {
            this.eMAIL = null;
            return;
        }

        this.eMAIL = new java.util.ArrayList<ClosedDaysRule>(eMAIL);
    }

    /**
     * <p>
     * Rules for Email Channel.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEMAIL(java.util.Collection)} or {@link #withEMAIL(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param eMAIL
     *        Rules for Email Channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClosedDays withEMAIL(ClosedDaysRule... eMAIL) {
        if (this.eMAIL == null) {
            setEMAIL(new java.util.ArrayList<ClosedDaysRule>(eMAIL.length));
        }
        for (ClosedDaysRule ele : eMAIL) {
            this.eMAIL.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Rules for Email Channel.
     * </p>
     * 
     * @param eMAIL
     *        Rules for Email Channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClosedDays withEMAIL(java.util.Collection<ClosedDaysRule> eMAIL) {
        setEMAIL(eMAIL);
        return this;
    }

    /**
     * <p>
     * Rules for SMS Channel.
     * </p>
     * 
     * @return Rules for SMS Channel.
     */

    public java.util.List<ClosedDaysRule> getSMS() {
        return sMS;
    }

    /**
     * <p>
     * Rules for SMS Channel.
     * </p>
     * 
     * @param sMS
     *        Rules for SMS Channel.
     */

    public void setSMS(java.util.Collection<ClosedDaysRule> sMS) {
        if (sMS == null) {
            this.sMS = null;
            return;
        }

        this.sMS = new java.util.ArrayList<ClosedDaysRule>(sMS);
    }

    /**
     * <p>
     * Rules for SMS Channel.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSMS(java.util.Collection)} or {@link #withSMS(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param sMS
     *        Rules for SMS Channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClosedDays withSMS(ClosedDaysRule... sMS) {
        if (this.sMS == null) {
            setSMS(new java.util.ArrayList<ClosedDaysRule>(sMS.length));
        }
        for (ClosedDaysRule ele : sMS) {
            this.sMS.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Rules for SMS Channel.
     * </p>
     * 
     * @param sMS
     *        Rules for SMS Channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClosedDays withSMS(java.util.Collection<ClosedDaysRule> sMS) {
        setSMS(sMS);
        return this;
    }

    /**
     * <p>
     * Rules for Push Channel.
     * </p>
     * 
     * @return Rules for Push Channel.
     */

    public java.util.List<ClosedDaysRule> getPUSH() {
        return pUSH;
    }

    /**
     * <p>
     * Rules for Push Channel.
     * </p>
     * 
     * @param pUSH
     *        Rules for Push Channel.
     */

    public void setPUSH(java.util.Collection<ClosedDaysRule> pUSH) {
        if (pUSH == null) {
            this.pUSH = null;
            return;
        }

        this.pUSH = new java.util.ArrayList<ClosedDaysRule>(pUSH);
    }

    /**
     * <p>
     * Rules for Push Channel.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPUSH(java.util.Collection)} or {@link #withPUSH(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param pUSH
     *        Rules for Push Channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClosedDays withPUSH(ClosedDaysRule... pUSH) {
        if (this.pUSH == null) {
            setPUSH(new java.util.ArrayList<ClosedDaysRule>(pUSH.length));
        }
        for (ClosedDaysRule ele : pUSH) {
            this.pUSH.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Rules for Push Channel.
     * </p>
     * 
     * @param pUSH
     *        Rules for Push Channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClosedDays withPUSH(java.util.Collection<ClosedDaysRule> pUSH) {
        setPUSH(pUSH);
        return this;
    }

    /**
     * <p>
     * Rules for Voice Channel.
     * </p>
     * 
     * @return Rules for Voice Channel.
     */

    public java.util.List<ClosedDaysRule> getVOICE() {
        return vOICE;
    }

    /**
     * <p>
     * Rules for Voice Channel.
     * </p>
     * 
     * @param vOICE
     *        Rules for Voice Channel.
     */

    public void setVOICE(java.util.Collection<ClosedDaysRule> vOICE) {
        if (vOICE == null) {
            this.vOICE = null;
            return;
        }

        this.vOICE = new java.util.ArrayList<ClosedDaysRule>(vOICE);
    }

    /**
     * <p>
     * Rules for Voice Channel.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVOICE(java.util.Collection)} or {@link #withVOICE(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param vOICE
     *        Rules for Voice Channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClosedDays withVOICE(ClosedDaysRule... vOICE) {
        if (this.vOICE == null) {
            setVOICE(new java.util.ArrayList<ClosedDaysRule>(vOICE.length));
        }
        for (ClosedDaysRule ele : vOICE) {
            this.vOICE.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Rules for Voice Channel.
     * </p>
     * 
     * @param vOICE
     *        Rules for Voice Channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClosedDays withVOICE(java.util.Collection<ClosedDaysRule> vOICE) {
        setVOICE(vOICE);
        return this;
    }

    /**
     * <p>
     * Rules for Custom Channel.
     * </p>
     * 
     * @return Rules for Custom Channel.
     */

    public java.util.List<ClosedDaysRule> getCUSTOM() {
        return cUSTOM;
    }

    /**
     * <p>
     * Rules for Custom Channel.
     * </p>
     * 
     * @param cUSTOM
     *        Rules for Custom Channel.
     */

    public void setCUSTOM(java.util.Collection<ClosedDaysRule> cUSTOM) {
        if (cUSTOM == null) {
            this.cUSTOM = null;
            return;
        }

        this.cUSTOM = new java.util.ArrayList<ClosedDaysRule>(cUSTOM);
    }

    /**
     * <p>
     * Rules for Custom Channel.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCUSTOM(java.util.Collection)} or {@link #withCUSTOM(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param cUSTOM
     *        Rules for Custom Channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClosedDays withCUSTOM(ClosedDaysRule... cUSTOM) {
        if (this.cUSTOM == null) {
            setCUSTOM(new java.util.ArrayList<ClosedDaysRule>(cUSTOM.length));
        }
        for (ClosedDaysRule ele : cUSTOM) {
            this.cUSTOM.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Rules for Custom Channel.
     * </p>
     * 
     * @param cUSTOM
     *        Rules for Custom Channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClosedDays withCUSTOM(java.util.Collection<ClosedDaysRule> cUSTOM) {
        setCUSTOM(cUSTOM);
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
        if (getEMAIL() != null)
            sb.append("EMAIL: ").append(getEMAIL()).append(",");
        if (getSMS() != null)
            sb.append("SMS: ").append(getSMS()).append(",");
        if (getPUSH() != null)
            sb.append("PUSH: ").append(getPUSH()).append(",");
        if (getVOICE() != null)
            sb.append("VOICE: ").append(getVOICE()).append(",");
        if (getCUSTOM() != null)
            sb.append("CUSTOM: ").append(getCUSTOM());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClosedDays == false)
            return false;
        ClosedDays other = (ClosedDays) obj;
        if (other.getEMAIL() == null ^ this.getEMAIL() == null)
            return false;
        if (other.getEMAIL() != null && other.getEMAIL().equals(this.getEMAIL()) == false)
            return false;
        if (other.getSMS() == null ^ this.getSMS() == null)
            return false;
        if (other.getSMS() != null && other.getSMS().equals(this.getSMS()) == false)
            return false;
        if (other.getPUSH() == null ^ this.getPUSH() == null)
            return false;
        if (other.getPUSH() != null && other.getPUSH().equals(this.getPUSH()) == false)
            return false;
        if (other.getVOICE() == null ^ this.getVOICE() == null)
            return false;
        if (other.getVOICE() != null && other.getVOICE().equals(this.getVOICE()) == false)
            return false;
        if (other.getCUSTOM() == null ^ this.getCUSTOM() == null)
            return false;
        if (other.getCUSTOM() != null && other.getCUSTOM().equals(this.getCUSTOM()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEMAIL() == null) ? 0 : getEMAIL().hashCode());
        hashCode = prime * hashCode + ((getSMS() == null) ? 0 : getSMS().hashCode());
        hashCode = prime * hashCode + ((getPUSH() == null) ? 0 : getPUSH().hashCode());
        hashCode = prime * hashCode + ((getVOICE() == null) ? 0 : getVOICE().hashCode());
        hashCode = prime * hashCode + ((getCUSTOM() == null) ? 0 : getCUSTOM().hashCode());
        return hashCode;
    }

    @Override
    public ClosedDays clone() {
        try {
            return (ClosedDays) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.ClosedDaysMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
