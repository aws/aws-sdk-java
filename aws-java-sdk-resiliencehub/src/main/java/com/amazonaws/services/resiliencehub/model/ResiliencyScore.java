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
package com.amazonaws.services.resiliencehub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The overall resiliency score, returned as an object that includes the disruption score and outage score.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ResiliencyScore" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResiliencyScore implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The disruption score for a valid key.
     * </p>
     */
    private java.util.Map<String, Double> disruptionScore;
    /**
     * <p>
     * The outage score for a valid key.
     * </p>
     */
    private Double score;

    /**
     * <p>
     * The disruption score for a valid key.
     * </p>
     * 
     * @return The disruption score for a valid key.
     */

    public java.util.Map<String, Double> getDisruptionScore() {
        return disruptionScore;
    }

    /**
     * <p>
     * The disruption score for a valid key.
     * </p>
     * 
     * @param disruptionScore
     *        The disruption score for a valid key.
     */

    public void setDisruptionScore(java.util.Map<String, Double> disruptionScore) {
        this.disruptionScore = disruptionScore;
    }

    /**
     * <p>
     * The disruption score for a valid key.
     * </p>
     * 
     * @param disruptionScore
     *        The disruption score for a valid key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResiliencyScore withDisruptionScore(java.util.Map<String, Double> disruptionScore) {
        setDisruptionScore(disruptionScore);
        return this;
    }

    /**
     * Add a single DisruptionScore entry
     *
     * @see ResiliencyScore#withDisruptionScore
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ResiliencyScore addDisruptionScoreEntry(String key, Double value) {
        if (null == this.disruptionScore) {
            this.disruptionScore = new java.util.HashMap<String, Double>();
        }
        if (this.disruptionScore.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.disruptionScore.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into DisruptionScore.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResiliencyScore clearDisruptionScoreEntries() {
        this.disruptionScore = null;
        return this;
    }

    /**
     * <p>
     * The outage score for a valid key.
     * </p>
     * 
     * @param score
     *        The outage score for a valid key.
     */

    public void setScore(Double score) {
        this.score = score;
    }

    /**
     * <p>
     * The outage score for a valid key.
     * </p>
     * 
     * @return The outage score for a valid key.
     */

    public Double getScore() {
        return this.score;
    }

    /**
     * <p>
     * The outage score for a valid key.
     * </p>
     * 
     * @param score
     *        The outage score for a valid key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResiliencyScore withScore(Double score) {
        setScore(score);
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
        if (getDisruptionScore() != null)
            sb.append("DisruptionScore: ").append(getDisruptionScore()).append(",");
        if (getScore() != null)
            sb.append("Score: ").append(getScore());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResiliencyScore == false)
            return false;
        ResiliencyScore other = (ResiliencyScore) obj;
        if (other.getDisruptionScore() == null ^ this.getDisruptionScore() == null)
            return false;
        if (other.getDisruptionScore() != null && other.getDisruptionScore().equals(this.getDisruptionScore()) == false)
            return false;
        if (other.getScore() == null ^ this.getScore() == null)
            return false;
        if (other.getScore() != null && other.getScore().equals(this.getScore()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDisruptionScore() == null) ? 0 : getDisruptionScore().hashCode());
        hashCode = prime * hashCode + ((getScore() == null) ? 0 : getScore().hashCode());
        return hashCode;
    }

    @Override
    public ResiliencyScore clone() {
        try {
            return (ResiliencyScore) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.resiliencehub.model.transform.ResiliencyScoreMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
