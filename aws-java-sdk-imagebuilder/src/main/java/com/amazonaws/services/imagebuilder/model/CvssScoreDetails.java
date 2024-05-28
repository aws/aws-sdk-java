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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about the source of the score, and the factors that determined the adjustments to create the final score.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/CvssScoreDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CvssScoreDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The source for the CVSS score.
     * </p>
     */
    private String scoreSource;
    /**
     * <p>
     * The source of the finding.
     * </p>
     */
    private String cvssSource;
    /**
     * <p>
     * The CVSS version that generated the score.
     * </p>
     */
    private String version;
    /**
     * <p>
     * The CVSS score.
     * </p>
     */
    private Double score;
    /**
     * <p>
     * A vector that measures the severity of the vulnerability.
     * </p>
     */
    private String scoringVector;
    /**
     * <p>
     * An object that contains details about an adjustment that Amazon Inspector made to the CVSS score for the finding.
     * </p>
     */
    private java.util.List<CvssScoreAdjustment> adjustments;

    /**
     * <p>
     * The source for the CVSS score.
     * </p>
     * 
     * @param scoreSource
     *        The source for the CVSS score.
     */

    public void setScoreSource(String scoreSource) {
        this.scoreSource = scoreSource;
    }

    /**
     * <p>
     * The source for the CVSS score.
     * </p>
     * 
     * @return The source for the CVSS score.
     */

    public String getScoreSource() {
        return this.scoreSource;
    }

    /**
     * <p>
     * The source for the CVSS score.
     * </p>
     * 
     * @param scoreSource
     *        The source for the CVSS score.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CvssScoreDetails withScoreSource(String scoreSource) {
        setScoreSource(scoreSource);
        return this;
    }

    /**
     * <p>
     * The source of the finding.
     * </p>
     * 
     * @param cvssSource
     *        The source of the finding.
     */

    public void setCvssSource(String cvssSource) {
        this.cvssSource = cvssSource;
    }

    /**
     * <p>
     * The source of the finding.
     * </p>
     * 
     * @return The source of the finding.
     */

    public String getCvssSource() {
        return this.cvssSource;
    }

    /**
     * <p>
     * The source of the finding.
     * </p>
     * 
     * @param cvssSource
     *        The source of the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CvssScoreDetails withCvssSource(String cvssSource) {
        setCvssSource(cvssSource);
        return this;
    }

    /**
     * <p>
     * The CVSS version that generated the score.
     * </p>
     * 
     * @param version
     *        The CVSS version that generated the score.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The CVSS version that generated the score.
     * </p>
     * 
     * @return The CVSS version that generated the score.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The CVSS version that generated the score.
     * </p>
     * 
     * @param version
     *        The CVSS version that generated the score.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CvssScoreDetails withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The CVSS score.
     * </p>
     * 
     * @param score
     *        The CVSS score.
     */

    public void setScore(Double score) {
        this.score = score;
    }

    /**
     * <p>
     * The CVSS score.
     * </p>
     * 
     * @return The CVSS score.
     */

    public Double getScore() {
        return this.score;
    }

    /**
     * <p>
     * The CVSS score.
     * </p>
     * 
     * @param score
     *        The CVSS score.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CvssScoreDetails withScore(Double score) {
        setScore(score);
        return this;
    }

    /**
     * <p>
     * A vector that measures the severity of the vulnerability.
     * </p>
     * 
     * @param scoringVector
     *        A vector that measures the severity of the vulnerability.
     */

    public void setScoringVector(String scoringVector) {
        this.scoringVector = scoringVector;
    }

    /**
     * <p>
     * A vector that measures the severity of the vulnerability.
     * </p>
     * 
     * @return A vector that measures the severity of the vulnerability.
     */

    public String getScoringVector() {
        return this.scoringVector;
    }

    /**
     * <p>
     * A vector that measures the severity of the vulnerability.
     * </p>
     * 
     * @param scoringVector
     *        A vector that measures the severity of the vulnerability.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CvssScoreDetails withScoringVector(String scoringVector) {
        setScoringVector(scoringVector);
        return this;
    }

    /**
     * <p>
     * An object that contains details about an adjustment that Amazon Inspector made to the CVSS score for the finding.
     * </p>
     * 
     * @return An object that contains details about an adjustment that Amazon Inspector made to the CVSS score for the
     *         finding.
     */

    public java.util.List<CvssScoreAdjustment> getAdjustments() {
        return adjustments;
    }

    /**
     * <p>
     * An object that contains details about an adjustment that Amazon Inspector made to the CVSS score for the finding.
     * </p>
     * 
     * @param adjustments
     *        An object that contains details about an adjustment that Amazon Inspector made to the CVSS score for the
     *        finding.
     */

    public void setAdjustments(java.util.Collection<CvssScoreAdjustment> adjustments) {
        if (adjustments == null) {
            this.adjustments = null;
            return;
        }

        this.adjustments = new java.util.ArrayList<CvssScoreAdjustment>(adjustments);
    }

    /**
     * <p>
     * An object that contains details about an adjustment that Amazon Inspector made to the CVSS score for the finding.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdjustments(java.util.Collection)} or {@link #withAdjustments(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param adjustments
     *        An object that contains details about an adjustment that Amazon Inspector made to the CVSS score for the
     *        finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CvssScoreDetails withAdjustments(CvssScoreAdjustment... adjustments) {
        if (this.adjustments == null) {
            setAdjustments(new java.util.ArrayList<CvssScoreAdjustment>(adjustments.length));
        }
        for (CvssScoreAdjustment ele : adjustments) {
            this.adjustments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An object that contains details about an adjustment that Amazon Inspector made to the CVSS score for the finding.
     * </p>
     * 
     * @param adjustments
     *        An object that contains details about an adjustment that Amazon Inspector made to the CVSS score for the
     *        finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CvssScoreDetails withAdjustments(java.util.Collection<CvssScoreAdjustment> adjustments) {
        setAdjustments(adjustments);
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
        if (getScoreSource() != null)
            sb.append("ScoreSource: ").append(getScoreSource()).append(",");
        if (getCvssSource() != null)
            sb.append("CvssSource: ").append(getCvssSource()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getScore() != null)
            sb.append("Score: ").append(getScore()).append(",");
        if (getScoringVector() != null)
            sb.append("ScoringVector: ").append(getScoringVector()).append(",");
        if (getAdjustments() != null)
            sb.append("Adjustments: ").append(getAdjustments());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CvssScoreDetails == false)
            return false;
        CvssScoreDetails other = (CvssScoreDetails) obj;
        if (other.getScoreSource() == null ^ this.getScoreSource() == null)
            return false;
        if (other.getScoreSource() != null && other.getScoreSource().equals(this.getScoreSource()) == false)
            return false;
        if (other.getCvssSource() == null ^ this.getCvssSource() == null)
            return false;
        if (other.getCvssSource() != null && other.getCvssSource().equals(this.getCvssSource()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getScore() == null ^ this.getScore() == null)
            return false;
        if (other.getScore() != null && other.getScore().equals(this.getScore()) == false)
            return false;
        if (other.getScoringVector() == null ^ this.getScoringVector() == null)
            return false;
        if (other.getScoringVector() != null && other.getScoringVector().equals(this.getScoringVector()) == false)
            return false;
        if (other.getAdjustments() == null ^ this.getAdjustments() == null)
            return false;
        if (other.getAdjustments() != null && other.getAdjustments().equals(this.getAdjustments()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScoreSource() == null) ? 0 : getScoreSource().hashCode());
        hashCode = prime * hashCode + ((getCvssSource() == null) ? 0 : getCvssSource().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getScore() == null) ? 0 : getScore().hashCode());
        hashCode = prime * hashCode + ((getScoringVector() == null) ? 0 : getScoringVector().hashCode());
        hashCode = prime * hashCode + ((getAdjustments() == null) ? 0 : getAdjustments().hashCode());
        return hashCode;
    }

    @Override
    public CvssScoreDetails clone() {
        try {
            return (CvssScoreDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.imagebuilder.model.transform.CvssScoreDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
