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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A compliance score is the percentage of the number of compliant rule-resource combinations in a conformance pack
 * compared to the number of total possible rule-resource combinations in the conformance pack. This metric provides you
 * with a high-level view of the compliance state of your conformance packs. You can use it to identify, investigate,
 * and understand the level of compliance in your conformance packs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/ConformancePackComplianceScore"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConformancePackComplianceScore implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Compliance score for the conformance pack. Conformance packs with no evaluation results will have a compliance
     * score of <code>INSUFFICIENT_DATA</code>.
     * </p>
     */
    private String score;
    /**
     * <p>
     * The name of the conformance pack.
     * </p>
     */
    private String conformancePackName;
    /**
     * <p>
     * The time that the conformance pack compliance score was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;

    /**
     * <p>
     * Compliance score for the conformance pack. Conformance packs with no evaluation results will have a compliance
     * score of <code>INSUFFICIENT_DATA</code>.
     * </p>
     * 
     * @param score
     *        Compliance score for the conformance pack. Conformance packs with no evaluation results will have a
     *        compliance score of <code>INSUFFICIENT_DATA</code>.
     */

    public void setScore(String score) {
        this.score = score;
    }

    /**
     * <p>
     * Compliance score for the conformance pack. Conformance packs with no evaluation results will have a compliance
     * score of <code>INSUFFICIENT_DATA</code>.
     * </p>
     * 
     * @return Compliance score for the conformance pack. Conformance packs with no evaluation results will have a
     *         compliance score of <code>INSUFFICIENT_DATA</code>.
     */

    public String getScore() {
        return this.score;
    }

    /**
     * <p>
     * Compliance score for the conformance pack. Conformance packs with no evaluation results will have a compliance
     * score of <code>INSUFFICIENT_DATA</code>.
     * </p>
     * 
     * @param score
     *        Compliance score for the conformance pack. Conformance packs with no evaluation results will have a
     *        compliance score of <code>INSUFFICIENT_DATA</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConformancePackComplianceScore withScore(String score) {
        setScore(score);
        return this;
    }

    /**
     * <p>
     * The name of the conformance pack.
     * </p>
     * 
     * @param conformancePackName
     *        The name of the conformance pack.
     */

    public void setConformancePackName(String conformancePackName) {
        this.conformancePackName = conformancePackName;
    }

    /**
     * <p>
     * The name of the conformance pack.
     * </p>
     * 
     * @return The name of the conformance pack.
     */

    public String getConformancePackName() {
        return this.conformancePackName;
    }

    /**
     * <p>
     * The name of the conformance pack.
     * </p>
     * 
     * @param conformancePackName
     *        The name of the conformance pack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConformancePackComplianceScore withConformancePackName(String conformancePackName) {
        setConformancePackName(conformancePackName);
        return this;
    }

    /**
     * <p>
     * The time that the conformance pack compliance score was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The time that the conformance pack compliance score was last updated.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The time that the conformance pack compliance score was last updated.
     * </p>
     * 
     * @return The time that the conformance pack compliance score was last updated.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * The time that the conformance pack compliance score was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The time that the conformance pack compliance score was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConformancePackComplianceScore withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
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
        if (getScore() != null)
            sb.append("Score: ").append(getScore()).append(",");
        if (getConformancePackName() != null)
            sb.append("ConformancePackName: ").append(getConformancePackName()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConformancePackComplianceScore == false)
            return false;
        ConformancePackComplianceScore other = (ConformancePackComplianceScore) obj;
        if (other.getScore() == null ^ this.getScore() == null)
            return false;
        if (other.getScore() != null && other.getScore().equals(this.getScore()) == false)
            return false;
        if (other.getConformancePackName() == null ^ this.getConformancePackName() == null)
            return false;
        if (other.getConformancePackName() != null && other.getConformancePackName().equals(this.getConformancePackName()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScore() == null) ? 0 : getScore().hashCode());
        hashCode = prime * hashCode + ((getConformancePackName() == null) ? 0 : getConformancePackName().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        return hashCode;
    }

    @Override
    public ConformancePackComplianceScore clone() {
        try {
            return (ConformancePackComplianceScore) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.ConformancePackComplianceScoreMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
