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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Common Vulnerability Scoring System (CVSS) version 3 details for the vulnerability.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/Cvss3" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Cvss3 implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The CVSS v3 base score for the vulnerability.
     * </p>
     */
    private Double baseScore;
    /**
     * <p>
     * The scoring vector associated with the CVSS v3 score.
     * </p>
     */
    private String scoringVector;

    /**
     * <p>
     * The CVSS v3 base score for the vulnerability.
     * </p>
     * 
     * @param baseScore
     *        The CVSS v3 base score for the vulnerability.
     */

    public void setBaseScore(Double baseScore) {
        this.baseScore = baseScore;
    }

    /**
     * <p>
     * The CVSS v3 base score for the vulnerability.
     * </p>
     * 
     * @return The CVSS v3 base score for the vulnerability.
     */

    public Double getBaseScore() {
        return this.baseScore;
    }

    /**
     * <p>
     * The CVSS v3 base score for the vulnerability.
     * </p>
     * 
     * @param baseScore
     *        The CVSS v3 base score for the vulnerability.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cvss3 withBaseScore(Double baseScore) {
        setBaseScore(baseScore);
        return this;
    }

    /**
     * <p>
     * The scoring vector associated with the CVSS v3 score.
     * </p>
     * 
     * @param scoringVector
     *        The scoring vector associated with the CVSS v3 score.
     */

    public void setScoringVector(String scoringVector) {
        this.scoringVector = scoringVector;
    }

    /**
     * <p>
     * The scoring vector associated with the CVSS v3 score.
     * </p>
     * 
     * @return The scoring vector associated with the CVSS v3 score.
     */

    public String getScoringVector() {
        return this.scoringVector;
    }

    /**
     * <p>
     * The scoring vector associated with the CVSS v3 score.
     * </p>
     * 
     * @param scoringVector
     *        The scoring vector associated with the CVSS v3 score.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cvss3 withScoringVector(String scoringVector) {
        setScoringVector(scoringVector);
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
            sb.append("ScoringVector: ").append(getScoringVector());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Cvss3 == false)
            return false;
        Cvss3 other = (Cvss3) obj;
        if (other.getBaseScore() == null ^ this.getBaseScore() == null)
            return false;
        if (other.getBaseScore() != null && other.getBaseScore().equals(this.getBaseScore()) == false)
            return false;
        if (other.getScoringVector() == null ^ this.getScoringVector() == null)
            return false;
        if (other.getScoringVector() != null && other.getScoringVector().equals(this.getScoringVector()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBaseScore() == null) ? 0 : getBaseScore().hashCode());
        hashCode = prime * hashCode + ((getScoringVector() == null) ? 0 : getScoringVector().hashCode());
        return hashCode;
    }

    @Override
    public Cvss3 clone() {
        try {
            return (Cvss3) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.Cvss3Marshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
