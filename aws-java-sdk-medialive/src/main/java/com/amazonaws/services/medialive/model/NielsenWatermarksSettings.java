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
 * Nielsen Watermarks Settings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/NielsenWatermarksSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NielsenWatermarksSettings implements Serializable, Cloneable, StructuredPojo {

    /** Complete these fields only if you want to insert watermarks of type Nielsen CBET */
    private NielsenCBET nielsenCbetSettings;
    /**
     * Choose the distribution types that you want to assign to the watermarks: - PROGRAM_CONTENT - FINAL_DISTRIBUTOR
     */
    private String nielsenDistributionType;
    /**
     * Complete these fields only if you want to insert watermarks of type Nielsen NAES II (N2) and Nielsen NAES VI
     * (NW).
     */
    private NielsenNaesIiNw nielsenNaesIiNwSettings;

    /**
     * Complete these fields only if you want to insert watermarks of type Nielsen CBET
     * 
     * @param nielsenCbetSettings
     *        Complete these fields only if you want to insert watermarks of type Nielsen CBET
     */

    public void setNielsenCbetSettings(NielsenCBET nielsenCbetSettings) {
        this.nielsenCbetSettings = nielsenCbetSettings;
    }

    /**
     * Complete these fields only if you want to insert watermarks of type Nielsen CBET
     * 
     * @return Complete these fields only if you want to insert watermarks of type Nielsen CBET
     */

    public NielsenCBET getNielsenCbetSettings() {
        return this.nielsenCbetSettings;
    }

    /**
     * Complete these fields only if you want to insert watermarks of type Nielsen CBET
     * 
     * @param nielsenCbetSettings
     *        Complete these fields only if you want to insert watermarks of type Nielsen CBET
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NielsenWatermarksSettings withNielsenCbetSettings(NielsenCBET nielsenCbetSettings) {
        setNielsenCbetSettings(nielsenCbetSettings);
        return this;
    }

    /**
     * Choose the distribution types that you want to assign to the watermarks: - PROGRAM_CONTENT - FINAL_DISTRIBUTOR
     * 
     * @param nielsenDistributionType
     *        Choose the distribution types that you want to assign to the watermarks: - PROGRAM_CONTENT -
     *        FINAL_DISTRIBUTOR
     * @see NielsenWatermarksDistributionTypes
     */

    public void setNielsenDistributionType(String nielsenDistributionType) {
        this.nielsenDistributionType = nielsenDistributionType;
    }

    /**
     * Choose the distribution types that you want to assign to the watermarks: - PROGRAM_CONTENT - FINAL_DISTRIBUTOR
     * 
     * @return Choose the distribution types that you want to assign to the watermarks: - PROGRAM_CONTENT -
     *         FINAL_DISTRIBUTOR
     * @see NielsenWatermarksDistributionTypes
     */

    public String getNielsenDistributionType() {
        return this.nielsenDistributionType;
    }

    /**
     * Choose the distribution types that you want to assign to the watermarks: - PROGRAM_CONTENT - FINAL_DISTRIBUTOR
     * 
     * @param nielsenDistributionType
     *        Choose the distribution types that you want to assign to the watermarks: - PROGRAM_CONTENT -
     *        FINAL_DISTRIBUTOR
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NielsenWatermarksDistributionTypes
     */

    public NielsenWatermarksSettings withNielsenDistributionType(String nielsenDistributionType) {
        setNielsenDistributionType(nielsenDistributionType);
        return this;
    }

    /**
     * Choose the distribution types that you want to assign to the watermarks: - PROGRAM_CONTENT - FINAL_DISTRIBUTOR
     * 
     * @param nielsenDistributionType
     *        Choose the distribution types that you want to assign to the watermarks: - PROGRAM_CONTENT -
     *        FINAL_DISTRIBUTOR
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NielsenWatermarksDistributionTypes
     */

    public NielsenWatermarksSettings withNielsenDistributionType(NielsenWatermarksDistributionTypes nielsenDistributionType) {
        this.nielsenDistributionType = nielsenDistributionType.toString();
        return this;
    }

    /**
     * Complete these fields only if you want to insert watermarks of type Nielsen NAES II (N2) and Nielsen NAES VI
     * (NW).
     * 
     * @param nielsenNaesIiNwSettings
     *        Complete these fields only if you want to insert watermarks of type Nielsen NAES II (N2) and Nielsen NAES
     *        VI (NW).
     */

    public void setNielsenNaesIiNwSettings(NielsenNaesIiNw nielsenNaesIiNwSettings) {
        this.nielsenNaesIiNwSettings = nielsenNaesIiNwSettings;
    }

    /**
     * Complete these fields only if you want to insert watermarks of type Nielsen NAES II (N2) and Nielsen NAES VI
     * (NW).
     * 
     * @return Complete these fields only if you want to insert watermarks of type Nielsen NAES II (N2) and Nielsen NAES
     *         VI (NW).
     */

    public NielsenNaesIiNw getNielsenNaesIiNwSettings() {
        return this.nielsenNaesIiNwSettings;
    }

    /**
     * Complete these fields only if you want to insert watermarks of type Nielsen NAES II (N2) and Nielsen NAES VI
     * (NW).
     * 
     * @param nielsenNaesIiNwSettings
     *        Complete these fields only if you want to insert watermarks of type Nielsen NAES II (N2) and Nielsen NAES
     *        VI (NW).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NielsenWatermarksSettings withNielsenNaesIiNwSettings(NielsenNaesIiNw nielsenNaesIiNwSettings) {
        setNielsenNaesIiNwSettings(nielsenNaesIiNwSettings);
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
        if (getNielsenCbetSettings() != null)
            sb.append("NielsenCbetSettings: ").append(getNielsenCbetSettings()).append(",");
        if (getNielsenDistributionType() != null)
            sb.append("NielsenDistributionType: ").append(getNielsenDistributionType()).append(",");
        if (getNielsenNaesIiNwSettings() != null)
            sb.append("NielsenNaesIiNwSettings: ").append(getNielsenNaesIiNwSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NielsenWatermarksSettings == false)
            return false;
        NielsenWatermarksSettings other = (NielsenWatermarksSettings) obj;
        if (other.getNielsenCbetSettings() == null ^ this.getNielsenCbetSettings() == null)
            return false;
        if (other.getNielsenCbetSettings() != null && other.getNielsenCbetSettings().equals(this.getNielsenCbetSettings()) == false)
            return false;
        if (other.getNielsenDistributionType() == null ^ this.getNielsenDistributionType() == null)
            return false;
        if (other.getNielsenDistributionType() != null && other.getNielsenDistributionType().equals(this.getNielsenDistributionType()) == false)
            return false;
        if (other.getNielsenNaesIiNwSettings() == null ^ this.getNielsenNaesIiNwSettings() == null)
            return false;
        if (other.getNielsenNaesIiNwSettings() != null && other.getNielsenNaesIiNwSettings().equals(this.getNielsenNaesIiNwSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNielsenCbetSettings() == null) ? 0 : getNielsenCbetSettings().hashCode());
        hashCode = prime * hashCode + ((getNielsenDistributionType() == null) ? 0 : getNielsenDistributionType().hashCode());
        hashCode = prime * hashCode + ((getNielsenNaesIiNwSettings() == null) ? 0 : getNielsenNaesIiNwSettings().hashCode());
        return hashCode;
    }

    @Override
    public NielsenWatermarksSettings clone() {
        try {
            return (NielsenWatermarksSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.NielsenWatermarksSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
