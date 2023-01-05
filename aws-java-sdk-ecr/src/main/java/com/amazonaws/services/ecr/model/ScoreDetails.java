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
package com.amazonaws.services.ecr.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the Amazon Inspector score given to a finding.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/ScoreDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScoreDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An object that contains details about the CVSS score given to a finding.
     * </p>
     */
    private CvssScoreDetails cvss;

    /**
     * <p>
     * An object that contains details about the CVSS score given to a finding.
     * </p>
     * 
     * @param cvss
     *        An object that contains details about the CVSS score given to a finding.
     */

    public void setCvss(CvssScoreDetails cvss) {
        this.cvss = cvss;
    }

    /**
     * <p>
     * An object that contains details about the CVSS score given to a finding.
     * </p>
     * 
     * @return An object that contains details about the CVSS score given to a finding.
     */

    public CvssScoreDetails getCvss() {
        return this.cvss;
    }

    /**
     * <p>
     * An object that contains details about the CVSS score given to a finding.
     * </p>
     * 
     * @param cvss
     *        An object that contains details about the CVSS score given to a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScoreDetails withCvss(CvssScoreDetails cvss) {
        setCvss(cvss);
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
        if (getCvss() != null)
            sb.append("Cvss: ").append(getCvss());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScoreDetails == false)
            return false;
        ScoreDetails other = (ScoreDetails) obj;
        if (other.getCvss() == null ^ this.getCvss() == null)
            return false;
        if (other.getCvss() != null && other.getCvss().equals(this.getCvss()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCvss() == null) ? 0 : getCvss().hashCode());
        return hashCode;
    }

    @Override
    public ScoreDetails clone() {
        try {
            return (ScoreDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecr.model.transform.ScoreDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
