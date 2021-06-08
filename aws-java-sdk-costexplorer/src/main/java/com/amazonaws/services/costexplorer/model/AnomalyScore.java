/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Quantifies the anomaly. The higher score means that it is more anomalous.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/AnomalyScore" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnomalyScore implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The maximum score observed during the <code>AnomalyDateInterval</code>.
     * </p>
     */
    private Double maxScore;
    /**
     * <p>
     * The last observed score.
     * </p>
     */
    private Double currentScore;

    /**
     * <p>
     * The maximum score observed during the <code>AnomalyDateInterval</code>.
     * </p>
     * 
     * @param maxScore
     *        The maximum score observed during the <code>AnomalyDateInterval</code>.
     */

    public void setMaxScore(Double maxScore) {
        this.maxScore = maxScore;
    }

    /**
     * <p>
     * The maximum score observed during the <code>AnomalyDateInterval</code>.
     * </p>
     * 
     * @return The maximum score observed during the <code>AnomalyDateInterval</code>.
     */

    public Double getMaxScore() {
        return this.maxScore;
    }

    /**
     * <p>
     * The maximum score observed during the <code>AnomalyDateInterval</code>.
     * </p>
     * 
     * @param maxScore
     *        The maximum score observed during the <code>AnomalyDateInterval</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalyScore withMaxScore(Double maxScore) {
        setMaxScore(maxScore);
        return this;
    }

    /**
     * <p>
     * The last observed score.
     * </p>
     * 
     * @param currentScore
     *        The last observed score.
     */

    public void setCurrentScore(Double currentScore) {
        this.currentScore = currentScore;
    }

    /**
     * <p>
     * The last observed score.
     * </p>
     * 
     * @return The last observed score.
     */

    public Double getCurrentScore() {
        return this.currentScore;
    }

    /**
     * <p>
     * The last observed score.
     * </p>
     * 
     * @param currentScore
     *        The last observed score.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalyScore withCurrentScore(Double currentScore) {
        setCurrentScore(currentScore);
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
        if (getMaxScore() != null)
            sb.append("MaxScore: ").append(getMaxScore()).append(",");
        if (getCurrentScore() != null)
            sb.append("CurrentScore: ").append(getCurrentScore());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnomalyScore == false)
            return false;
        AnomalyScore other = (AnomalyScore) obj;
        if (other.getMaxScore() == null ^ this.getMaxScore() == null)
            return false;
        if (other.getMaxScore() != null && other.getMaxScore().equals(this.getMaxScore()) == false)
            return false;
        if (other.getCurrentScore() == null ^ this.getCurrentScore() == null)
            return false;
        if (other.getCurrentScore() != null && other.getCurrentScore().equals(this.getCurrentScore()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxScore() == null) ? 0 : getMaxScore().hashCode());
        hashCode = prime * hashCode + ((getCurrentScore() == null) ? 0 : getCurrentScore().hashCode());
        return hashCode;
    }

    @Override
    public AnomalyScore clone() {
        try {
            return (AnomalyScore) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.AnomalyScoreMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
