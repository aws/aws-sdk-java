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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Nielsen CBET
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/NielsenCBET" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NielsenCBET implements Serializable, Cloneable, StructuredPojo {

    /** Enter the CBET check digits to use in the watermark. */
    private String cbetCheckDigitString;
    /** Determines the method of CBET insertion mode when prior encoding is detected on the same layer. */
    private String cbetStepaside;
    /** Enter the CBET Source ID (CSID) to use in the watermark */
    private String csid;

    /**
     * Enter the CBET check digits to use in the watermark.
     * 
     * @param cbetCheckDigitString
     *        Enter the CBET check digits to use in the watermark.
     */

    public void setCbetCheckDigitString(String cbetCheckDigitString) {
        this.cbetCheckDigitString = cbetCheckDigitString;
    }

    /**
     * Enter the CBET check digits to use in the watermark.
     * 
     * @return Enter the CBET check digits to use in the watermark.
     */

    public String getCbetCheckDigitString() {
        return this.cbetCheckDigitString;
    }

    /**
     * Enter the CBET check digits to use in the watermark.
     * 
     * @param cbetCheckDigitString
     *        Enter the CBET check digits to use in the watermark.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NielsenCBET withCbetCheckDigitString(String cbetCheckDigitString) {
        setCbetCheckDigitString(cbetCheckDigitString);
        return this;
    }

    /**
     * Determines the method of CBET insertion mode when prior encoding is detected on the same layer.
     * 
     * @param cbetStepaside
     *        Determines the method of CBET insertion mode when prior encoding is detected on the same layer.
     * @see NielsenWatermarksCbetStepaside
     */

    public void setCbetStepaside(String cbetStepaside) {
        this.cbetStepaside = cbetStepaside;
    }

    /**
     * Determines the method of CBET insertion mode when prior encoding is detected on the same layer.
     * 
     * @return Determines the method of CBET insertion mode when prior encoding is detected on the same layer.
     * @see NielsenWatermarksCbetStepaside
     */

    public String getCbetStepaside() {
        return this.cbetStepaside;
    }

    /**
     * Determines the method of CBET insertion mode when prior encoding is detected on the same layer.
     * 
     * @param cbetStepaside
     *        Determines the method of CBET insertion mode when prior encoding is detected on the same layer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NielsenWatermarksCbetStepaside
     */

    public NielsenCBET withCbetStepaside(String cbetStepaside) {
        setCbetStepaside(cbetStepaside);
        return this;
    }

    /**
     * Determines the method of CBET insertion mode when prior encoding is detected on the same layer.
     * 
     * @param cbetStepaside
     *        Determines the method of CBET insertion mode when prior encoding is detected on the same layer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NielsenWatermarksCbetStepaside
     */

    public NielsenCBET withCbetStepaside(NielsenWatermarksCbetStepaside cbetStepaside) {
        this.cbetStepaside = cbetStepaside.toString();
        return this;
    }

    /**
     * Enter the CBET Source ID (CSID) to use in the watermark
     * 
     * @param csid
     *        Enter the CBET Source ID (CSID) to use in the watermark
     */

    public void setCsid(String csid) {
        this.csid = csid;
    }

    /**
     * Enter the CBET Source ID (CSID) to use in the watermark
     * 
     * @return Enter the CBET Source ID (CSID) to use in the watermark
     */

    public String getCsid() {
        return this.csid;
    }

    /**
     * Enter the CBET Source ID (CSID) to use in the watermark
     * 
     * @param csid
     *        Enter the CBET Source ID (CSID) to use in the watermark
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NielsenCBET withCsid(String csid) {
        setCsid(csid);
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
        if (getCbetCheckDigitString() != null)
            sb.append("CbetCheckDigitString: ").append(getCbetCheckDigitString()).append(",");
        if (getCbetStepaside() != null)
            sb.append("CbetStepaside: ").append(getCbetStepaside()).append(",");
        if (getCsid() != null)
            sb.append("Csid: ").append(getCsid());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NielsenCBET == false)
            return false;
        NielsenCBET other = (NielsenCBET) obj;
        if (other.getCbetCheckDigitString() == null ^ this.getCbetCheckDigitString() == null)
            return false;
        if (other.getCbetCheckDigitString() != null && other.getCbetCheckDigitString().equals(this.getCbetCheckDigitString()) == false)
            return false;
        if (other.getCbetStepaside() == null ^ this.getCbetStepaside() == null)
            return false;
        if (other.getCbetStepaside() != null && other.getCbetStepaside().equals(this.getCbetStepaside()) == false)
            return false;
        if (other.getCsid() == null ^ this.getCsid() == null)
            return false;
        if (other.getCsid() != null && other.getCsid().equals(this.getCsid()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCbetCheckDigitString() == null) ? 0 : getCbetCheckDigitString().hashCode());
        hashCode = prime * hashCode + ((getCbetStepaside() == null) ? 0 : getCbetStepaside().hashCode());
        hashCode = prime * hashCode + ((getCsid() == null) ? 0 : getCsid().hashCode());
        return hashCode;
    }

    @Override
    public NielsenCBET clone() {
        try {
            return (NielsenCBET) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.NielsenCBETMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
