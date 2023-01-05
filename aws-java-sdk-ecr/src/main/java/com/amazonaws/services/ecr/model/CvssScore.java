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
 * The CVSS score for a finding.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/CvssScore" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CvssScore implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The base CVSS score used for the finding.
     * </p>
     */
    private Double baseScore;
    /**
     * <p>
     * The vector string of the CVSS score.
     * </p>
     */
    private String scoringVector;
    /**
     * <p>
     * The source of the CVSS score.
     * </p>
     */
    private String source;
    /**
     * <p>
     * The version of CVSS used for the score.
     * </p>
     */
    private String version;

    /**
     * <p>
     * The base CVSS score used for the finding.
     * </p>
     * 
     * @param baseScore
     *        The base CVSS score used for the finding.
     */

    public void setBaseScore(Double baseScore) {
        this.baseScore = baseScore;
    }

    /**
     * <p>
     * The base CVSS score used for the finding.
     * </p>
     * 
     * @return The base CVSS score used for the finding.
     */

    public Double getBaseScore() {
        return this.baseScore;
    }

    /**
     * <p>
     * The base CVSS score used for the finding.
     * </p>
     * 
     * @param baseScore
     *        The base CVSS score used for the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CvssScore withBaseScore(Double baseScore) {
        setBaseScore(baseScore);
        return this;
    }

    /**
     * <p>
     * The vector string of the CVSS score.
     * </p>
     * 
     * @param scoringVector
     *        The vector string of the CVSS score.
     */

    public void setScoringVector(String scoringVector) {
        this.scoringVector = scoringVector;
    }

    /**
     * <p>
     * The vector string of the CVSS score.
     * </p>
     * 
     * @return The vector string of the CVSS score.
     */

    public String getScoringVector() {
        return this.scoringVector;
    }

    /**
     * <p>
     * The vector string of the CVSS score.
     * </p>
     * 
     * @param scoringVector
     *        The vector string of the CVSS score.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CvssScore withScoringVector(String scoringVector) {
        setScoringVector(scoringVector);
        return this;
    }

    /**
     * <p>
     * The source of the CVSS score.
     * </p>
     * 
     * @param source
     *        The source of the CVSS score.
     */

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * The source of the CVSS score.
     * </p>
     * 
     * @return The source of the CVSS score.
     */

    public String getSource() {
        return this.source;
    }

    /**
     * <p>
     * The source of the CVSS score.
     * </p>
     * 
     * @param source
     *        The source of the CVSS score.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CvssScore withSource(String source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * The version of CVSS used for the score.
     * </p>
     * 
     * @param version
     *        The version of CVSS used for the score.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of CVSS used for the score.
     * </p>
     * 
     * @return The version of CVSS used for the score.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version of CVSS used for the score.
     * </p>
     * 
     * @param version
     *        The version of CVSS used for the score.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CvssScore withVersion(String version) {
        setVersion(version);
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
        if (getBaseScore() != null)
            sb.append("BaseScore: ").append(getBaseScore()).append(",");
        if (getScoringVector() != null)
            sb.append("ScoringVector: ").append(getScoringVector()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CvssScore == false)
            return false;
        CvssScore other = (CvssScore) obj;
        if (other.getBaseScore() == null ^ this.getBaseScore() == null)
            return false;
        if (other.getBaseScore() != null && other.getBaseScore().equals(this.getBaseScore()) == false)
            return false;
        if (other.getScoringVector() == null ^ this.getScoringVector() == null)
            return false;
        if (other.getScoringVector() != null && other.getScoringVector().equals(this.getScoringVector()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBaseScore() == null) ? 0 : getBaseScore().hashCode());
        hashCode = prime * hashCode + ((getScoringVector() == null) ? 0 : getScoringVector().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public CvssScore clone() {
        try {
            return (CvssScore) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecr.model.transform.CvssScoreMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
