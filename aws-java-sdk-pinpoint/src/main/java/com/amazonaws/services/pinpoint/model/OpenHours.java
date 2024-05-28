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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the times when message are allowed to be sent to endpoints.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/OpenHours" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OpenHours implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the schedule settings for the email channel.
     * </p>
     */
    private java.util.Map<String, java.util.List<OpenHoursRule>> eMAIL;
    /**
     * <p>
     * Specifies the schedule settings for the SMS channel.
     * </p>
     */
    private java.util.Map<String, java.util.List<OpenHoursRule>> sMS;
    /**
     * <p>
     * Specifies the schedule settings for the push channel.
     * </p>
     */
    private java.util.Map<String, java.util.List<OpenHoursRule>> pUSH;
    /**
     * <p>
     * Specifies the schedule settings for the voice channel.
     * </p>
     */
    private java.util.Map<String, java.util.List<OpenHoursRule>> vOICE;
    /**
     * <p>
     * Specifies the schedule settings for the custom channel.
     * </p>
     */
    private java.util.Map<String, java.util.List<OpenHoursRule>> cUSTOM;

    /**
     * <p>
     * Specifies the schedule settings for the email channel.
     * </p>
     * 
     * @return Specifies the schedule settings for the email channel.
     */

    public java.util.Map<String, java.util.List<OpenHoursRule>> getEMAIL() {
        return eMAIL;
    }

    /**
     * <p>
     * Specifies the schedule settings for the email channel.
     * </p>
     * 
     * @param eMAIL
     *        Specifies the schedule settings for the email channel.
     */

    public void setEMAIL(java.util.Map<String, java.util.List<OpenHoursRule>> eMAIL) {
        this.eMAIL = eMAIL;
    }

    /**
     * <p>
     * Specifies the schedule settings for the email channel.
     * </p>
     * 
     * @param eMAIL
     *        Specifies the schedule settings for the email channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpenHours withEMAIL(java.util.Map<String, java.util.List<OpenHoursRule>> eMAIL) {
        setEMAIL(eMAIL);
        return this;
    }

    /**
     * Add a single EMAIL entry
     *
     * @see OpenHours#withEMAIL
     * @returns a reference to this object so that method calls can be chained together.
     */

    public OpenHours addEMAILEntry(String key, java.util.List<OpenHoursRule> value) {
        if (null == this.eMAIL) {
            this.eMAIL = new java.util.HashMap<String, java.util.List<OpenHoursRule>>();
        }
        if (this.eMAIL.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.eMAIL.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into EMAIL.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpenHours clearEMAILEntries() {
        this.eMAIL = null;
        return this;
    }

    /**
     * <p>
     * Specifies the schedule settings for the SMS channel.
     * </p>
     * 
     * @return Specifies the schedule settings for the SMS channel.
     */

    public java.util.Map<String, java.util.List<OpenHoursRule>> getSMS() {
        return sMS;
    }

    /**
     * <p>
     * Specifies the schedule settings for the SMS channel.
     * </p>
     * 
     * @param sMS
     *        Specifies the schedule settings for the SMS channel.
     */

    public void setSMS(java.util.Map<String, java.util.List<OpenHoursRule>> sMS) {
        this.sMS = sMS;
    }

    /**
     * <p>
     * Specifies the schedule settings for the SMS channel.
     * </p>
     * 
     * @param sMS
     *        Specifies the schedule settings for the SMS channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpenHours withSMS(java.util.Map<String, java.util.List<OpenHoursRule>> sMS) {
        setSMS(sMS);
        return this;
    }

    /**
     * Add a single SMS entry
     *
     * @see OpenHours#withSMS
     * @returns a reference to this object so that method calls can be chained together.
     */

    public OpenHours addSMSEntry(String key, java.util.List<OpenHoursRule> value) {
        if (null == this.sMS) {
            this.sMS = new java.util.HashMap<String, java.util.List<OpenHoursRule>>();
        }
        if (this.sMS.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.sMS.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into SMS.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpenHours clearSMSEntries() {
        this.sMS = null;
        return this;
    }

    /**
     * <p>
     * Specifies the schedule settings for the push channel.
     * </p>
     * 
     * @return Specifies the schedule settings for the push channel.
     */

    public java.util.Map<String, java.util.List<OpenHoursRule>> getPUSH() {
        return pUSH;
    }

    /**
     * <p>
     * Specifies the schedule settings for the push channel.
     * </p>
     * 
     * @param pUSH
     *        Specifies the schedule settings for the push channel.
     */

    public void setPUSH(java.util.Map<String, java.util.List<OpenHoursRule>> pUSH) {
        this.pUSH = pUSH;
    }

    /**
     * <p>
     * Specifies the schedule settings for the push channel.
     * </p>
     * 
     * @param pUSH
     *        Specifies the schedule settings for the push channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpenHours withPUSH(java.util.Map<String, java.util.List<OpenHoursRule>> pUSH) {
        setPUSH(pUSH);
        return this;
    }

    /**
     * Add a single PUSH entry
     *
     * @see OpenHours#withPUSH
     * @returns a reference to this object so that method calls can be chained together.
     */

    public OpenHours addPUSHEntry(String key, java.util.List<OpenHoursRule> value) {
        if (null == this.pUSH) {
            this.pUSH = new java.util.HashMap<String, java.util.List<OpenHoursRule>>();
        }
        if (this.pUSH.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.pUSH.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into PUSH.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpenHours clearPUSHEntries() {
        this.pUSH = null;
        return this;
    }

    /**
     * <p>
     * Specifies the schedule settings for the voice channel.
     * </p>
     * 
     * @return Specifies the schedule settings for the voice channel.
     */

    public java.util.Map<String, java.util.List<OpenHoursRule>> getVOICE() {
        return vOICE;
    }

    /**
     * <p>
     * Specifies the schedule settings for the voice channel.
     * </p>
     * 
     * @param vOICE
     *        Specifies the schedule settings for the voice channel.
     */

    public void setVOICE(java.util.Map<String, java.util.List<OpenHoursRule>> vOICE) {
        this.vOICE = vOICE;
    }

    /**
     * <p>
     * Specifies the schedule settings for the voice channel.
     * </p>
     * 
     * @param vOICE
     *        Specifies the schedule settings for the voice channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpenHours withVOICE(java.util.Map<String, java.util.List<OpenHoursRule>> vOICE) {
        setVOICE(vOICE);
        return this;
    }

    /**
     * Add a single VOICE entry
     *
     * @see OpenHours#withVOICE
     * @returns a reference to this object so that method calls can be chained together.
     */

    public OpenHours addVOICEEntry(String key, java.util.List<OpenHoursRule> value) {
        if (null == this.vOICE) {
            this.vOICE = new java.util.HashMap<String, java.util.List<OpenHoursRule>>();
        }
        if (this.vOICE.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.vOICE.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into VOICE.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpenHours clearVOICEEntries() {
        this.vOICE = null;
        return this;
    }

    /**
     * <p>
     * Specifies the schedule settings for the custom channel.
     * </p>
     * 
     * @return Specifies the schedule settings for the custom channel.
     */

    public java.util.Map<String, java.util.List<OpenHoursRule>> getCUSTOM() {
        return cUSTOM;
    }

    /**
     * <p>
     * Specifies the schedule settings for the custom channel.
     * </p>
     * 
     * @param cUSTOM
     *        Specifies the schedule settings for the custom channel.
     */

    public void setCUSTOM(java.util.Map<String, java.util.List<OpenHoursRule>> cUSTOM) {
        this.cUSTOM = cUSTOM;
    }

    /**
     * <p>
     * Specifies the schedule settings for the custom channel.
     * </p>
     * 
     * @param cUSTOM
     *        Specifies the schedule settings for the custom channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpenHours withCUSTOM(java.util.Map<String, java.util.List<OpenHoursRule>> cUSTOM) {
        setCUSTOM(cUSTOM);
        return this;
    }

    /**
     * Add a single CUSTOM entry
     *
     * @see OpenHours#withCUSTOM
     * @returns a reference to this object so that method calls can be chained together.
     */

    public OpenHours addCUSTOMEntry(String key, java.util.List<OpenHoursRule> value) {
        if (null == this.cUSTOM) {
            this.cUSTOM = new java.util.HashMap<String, java.util.List<OpenHoursRule>>();
        }
        if (this.cUSTOM.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.cUSTOM.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into CUSTOM.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpenHours clearCUSTOMEntries() {
        this.cUSTOM = null;
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

        if (obj instanceof OpenHours == false)
            return false;
        OpenHours other = (OpenHours) obj;
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
    public OpenHours clone() {
        try {
            return (OpenHours) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.OpenHoursMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
