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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the Amazon Inspector score given to a finding.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/InspectorScoreDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InspectorScoreDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An object that contains details about the CVSS score given to a finding.
     * </p>
     */
    private CvssScoreDetails adjustedCvss;

    /**
     * <p>
     * An object that contains details about the CVSS score given to a finding.
     * </p>
     * 
     * @param adjustedCvss
     *        An object that contains details about the CVSS score given to a finding.
     */

    public void setAdjustedCvss(CvssScoreDetails adjustedCvss) {
        this.adjustedCvss = adjustedCvss;
    }

    /**
     * <p>
     * An object that contains details about the CVSS score given to a finding.
     * </p>
     * 
     * @return An object that contains details about the CVSS score given to a finding.
     */

    public CvssScoreDetails getAdjustedCvss() {
        return this.adjustedCvss;
    }

    /**
     * <p>
     * An object that contains details about the CVSS score given to a finding.
     * </p>
     * 
     * @param adjustedCvss
     *        An object that contains details about the CVSS score given to a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InspectorScoreDetails withAdjustedCvss(CvssScoreDetails adjustedCvss) {
        setAdjustedCvss(adjustedCvss);
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
        if (getAdjustedCvss() != null)
            sb.append("AdjustedCvss: ").append(getAdjustedCvss());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InspectorScoreDetails == false)
            return false;
        InspectorScoreDetails other = (InspectorScoreDetails) obj;
        if (other.getAdjustedCvss() == null ^ this.getAdjustedCvss() == null)
            return false;
        if (other.getAdjustedCvss() != null && other.getAdjustedCvss().equals(this.getAdjustedCvss()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdjustedCvss() == null) ? 0 : getAdjustedCvss().hashCode());
        return hashCode;
    }

    @Override
    public InspectorScoreDetails clone() {
        try {
            return (InspectorScoreDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.InspectorScoreDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
