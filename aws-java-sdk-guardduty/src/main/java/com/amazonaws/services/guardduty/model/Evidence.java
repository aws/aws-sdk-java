/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Contains information about the reason that the finding was generated.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/Evidence" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Evidence implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of threat intelligence details related to the evidence.
     * </p>
     */
    private java.util.List<ThreatIntelligenceDetail> threatIntelligenceDetails;

    /**
     * <p>
     * A list of threat intelligence details related to the evidence.
     * </p>
     * 
     * @return A list of threat intelligence details related to the evidence.
     */

    public java.util.List<ThreatIntelligenceDetail> getThreatIntelligenceDetails() {
        return threatIntelligenceDetails;
    }

    /**
     * <p>
     * A list of threat intelligence details related to the evidence.
     * </p>
     * 
     * @param threatIntelligenceDetails
     *        A list of threat intelligence details related to the evidence.
     */

    public void setThreatIntelligenceDetails(java.util.Collection<ThreatIntelligenceDetail> threatIntelligenceDetails) {
        if (threatIntelligenceDetails == null) {
            this.threatIntelligenceDetails = null;
            return;
        }

        this.threatIntelligenceDetails = new java.util.ArrayList<ThreatIntelligenceDetail>(threatIntelligenceDetails);
    }

    /**
     * <p>
     * A list of threat intelligence details related to the evidence.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setThreatIntelligenceDetails(java.util.Collection)} or
     * {@link #withThreatIntelligenceDetails(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param threatIntelligenceDetails
     *        A list of threat intelligence details related to the evidence.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Evidence withThreatIntelligenceDetails(ThreatIntelligenceDetail... threatIntelligenceDetails) {
        if (this.threatIntelligenceDetails == null) {
            setThreatIntelligenceDetails(new java.util.ArrayList<ThreatIntelligenceDetail>(threatIntelligenceDetails.length));
        }
        for (ThreatIntelligenceDetail ele : threatIntelligenceDetails) {
            this.threatIntelligenceDetails.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of threat intelligence details related to the evidence.
     * </p>
     * 
     * @param threatIntelligenceDetails
     *        A list of threat intelligence details related to the evidence.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Evidence withThreatIntelligenceDetails(java.util.Collection<ThreatIntelligenceDetail> threatIntelligenceDetails) {
        setThreatIntelligenceDetails(threatIntelligenceDetails);
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
        if (getThreatIntelligenceDetails() != null)
            sb.append("ThreatIntelligenceDetails: ").append(getThreatIntelligenceDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Evidence == false)
            return false;
        Evidence other = (Evidence) obj;
        if (other.getThreatIntelligenceDetails() == null ^ this.getThreatIntelligenceDetails() == null)
            return false;
        if (other.getThreatIntelligenceDetails() != null && other.getThreatIntelligenceDetails().equals(this.getThreatIntelligenceDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getThreatIntelligenceDetails() == null) ? 0 : getThreatIntelligenceDetails().hashCode());
        return hashCode;
    }

    @Override
    public Evidence clone() {
        try {
            return (Evidence) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.EvidenceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
