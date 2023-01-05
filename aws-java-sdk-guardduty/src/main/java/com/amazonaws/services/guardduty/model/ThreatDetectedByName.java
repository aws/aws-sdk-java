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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains details about identified threats organized by threat name.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ThreatDetectedByName" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ThreatDetectedByName implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Total number of infected files identified.
     * </p>
     */
    private Integer itemCount;
    /**
     * <p>
     * Total number of unique threats by name identified, as part of the malware scan.
     * </p>
     */
    private Integer uniqueThreatNameCount;
    /**
     * <p>
     * Flag to determine if the finding contains every single infected file-path and/or every threat.
     * </p>
     */
    private Boolean shortened;
    /**
     * <p>
     * List of identified threats with details, organized by threat name.
     * </p>
     */
    private java.util.List<ScanThreatName> threatNames;

    /**
     * <p>
     * Total number of infected files identified.
     * </p>
     * 
     * @param itemCount
     *        Total number of infected files identified.
     */

    public void setItemCount(Integer itemCount) {
        this.itemCount = itemCount;
    }

    /**
     * <p>
     * Total number of infected files identified.
     * </p>
     * 
     * @return Total number of infected files identified.
     */

    public Integer getItemCount() {
        return this.itemCount;
    }

    /**
     * <p>
     * Total number of infected files identified.
     * </p>
     * 
     * @param itemCount
     *        Total number of infected files identified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThreatDetectedByName withItemCount(Integer itemCount) {
        setItemCount(itemCount);
        return this;
    }

    /**
     * <p>
     * Total number of unique threats by name identified, as part of the malware scan.
     * </p>
     * 
     * @param uniqueThreatNameCount
     *        Total number of unique threats by name identified, as part of the malware scan.
     */

    public void setUniqueThreatNameCount(Integer uniqueThreatNameCount) {
        this.uniqueThreatNameCount = uniqueThreatNameCount;
    }

    /**
     * <p>
     * Total number of unique threats by name identified, as part of the malware scan.
     * </p>
     * 
     * @return Total number of unique threats by name identified, as part of the malware scan.
     */

    public Integer getUniqueThreatNameCount() {
        return this.uniqueThreatNameCount;
    }

    /**
     * <p>
     * Total number of unique threats by name identified, as part of the malware scan.
     * </p>
     * 
     * @param uniqueThreatNameCount
     *        Total number of unique threats by name identified, as part of the malware scan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThreatDetectedByName withUniqueThreatNameCount(Integer uniqueThreatNameCount) {
        setUniqueThreatNameCount(uniqueThreatNameCount);
        return this;
    }

    /**
     * <p>
     * Flag to determine if the finding contains every single infected file-path and/or every threat.
     * </p>
     * 
     * @param shortened
     *        Flag to determine if the finding contains every single infected file-path and/or every threat.
     */

    public void setShortened(Boolean shortened) {
        this.shortened = shortened;
    }

    /**
     * <p>
     * Flag to determine if the finding contains every single infected file-path and/or every threat.
     * </p>
     * 
     * @return Flag to determine if the finding contains every single infected file-path and/or every threat.
     */

    public Boolean getShortened() {
        return this.shortened;
    }

    /**
     * <p>
     * Flag to determine if the finding contains every single infected file-path and/or every threat.
     * </p>
     * 
     * @param shortened
     *        Flag to determine if the finding contains every single infected file-path and/or every threat.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThreatDetectedByName withShortened(Boolean shortened) {
        setShortened(shortened);
        return this;
    }

    /**
     * <p>
     * Flag to determine if the finding contains every single infected file-path and/or every threat.
     * </p>
     * 
     * @return Flag to determine if the finding contains every single infected file-path and/or every threat.
     */

    public Boolean isShortened() {
        return this.shortened;
    }

    /**
     * <p>
     * List of identified threats with details, organized by threat name.
     * </p>
     * 
     * @return List of identified threats with details, organized by threat name.
     */

    public java.util.List<ScanThreatName> getThreatNames() {
        return threatNames;
    }

    /**
     * <p>
     * List of identified threats with details, organized by threat name.
     * </p>
     * 
     * @param threatNames
     *        List of identified threats with details, organized by threat name.
     */

    public void setThreatNames(java.util.Collection<ScanThreatName> threatNames) {
        if (threatNames == null) {
            this.threatNames = null;
            return;
        }

        this.threatNames = new java.util.ArrayList<ScanThreatName>(threatNames);
    }

    /**
     * <p>
     * List of identified threats with details, organized by threat name.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setThreatNames(java.util.Collection)} or {@link #withThreatNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param threatNames
     *        List of identified threats with details, organized by threat name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThreatDetectedByName withThreatNames(ScanThreatName... threatNames) {
        if (this.threatNames == null) {
            setThreatNames(new java.util.ArrayList<ScanThreatName>(threatNames.length));
        }
        for (ScanThreatName ele : threatNames) {
            this.threatNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of identified threats with details, organized by threat name.
     * </p>
     * 
     * @param threatNames
     *        List of identified threats with details, organized by threat name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThreatDetectedByName withThreatNames(java.util.Collection<ScanThreatName> threatNames) {
        setThreatNames(threatNames);
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
        if (getItemCount() != null)
            sb.append("ItemCount: ").append(getItemCount()).append(",");
        if (getUniqueThreatNameCount() != null)
            sb.append("UniqueThreatNameCount: ").append(getUniqueThreatNameCount()).append(",");
        if (getShortened() != null)
            sb.append("Shortened: ").append(getShortened()).append(",");
        if (getThreatNames() != null)
            sb.append("ThreatNames: ").append(getThreatNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ThreatDetectedByName == false)
            return false;
        ThreatDetectedByName other = (ThreatDetectedByName) obj;
        if (other.getItemCount() == null ^ this.getItemCount() == null)
            return false;
        if (other.getItemCount() != null && other.getItemCount().equals(this.getItemCount()) == false)
            return false;
        if (other.getUniqueThreatNameCount() == null ^ this.getUniqueThreatNameCount() == null)
            return false;
        if (other.getUniqueThreatNameCount() != null && other.getUniqueThreatNameCount().equals(this.getUniqueThreatNameCount()) == false)
            return false;
        if (other.getShortened() == null ^ this.getShortened() == null)
            return false;
        if (other.getShortened() != null && other.getShortened().equals(this.getShortened()) == false)
            return false;
        if (other.getThreatNames() == null ^ this.getThreatNames() == null)
            return false;
        if (other.getThreatNames() != null && other.getThreatNames().equals(this.getThreatNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getItemCount() == null) ? 0 : getItemCount().hashCode());
        hashCode = prime * hashCode + ((getUniqueThreatNameCount() == null) ? 0 : getUniqueThreatNameCount().hashCode());
        hashCode = prime * hashCode + ((getShortened() == null) ? 0 : getShortened().hashCode());
        hashCode = prime * hashCode + ((getThreatNames() == null) ? 0 : getThreatNames().hashCode());
        return hashCode;
    }

    @Override
    public ThreatDetectedByName clone() {
        try {
            return (ThreatDetectedByName) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.ThreatDetectedByNameMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
