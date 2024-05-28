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
package com.amazonaws.services.cleanroomsml.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The relevance score of a generated audience.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/RelevanceMetric" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RelevanceMetric implements Serializable, Cloneable, StructuredPojo {

    private AudienceSize audienceSize;
    /**
     * <p>
     * The relevance score of the generated audience.
     * </p>
     */
    private Double score;

    /**
     * @param audienceSize
     */

    public void setAudienceSize(AudienceSize audienceSize) {
        this.audienceSize = audienceSize;
    }

    /**
     * @return
     */

    public AudienceSize getAudienceSize() {
        return this.audienceSize;
    }

    /**
     * @param audienceSize
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelevanceMetric withAudienceSize(AudienceSize audienceSize) {
        setAudienceSize(audienceSize);
        return this;
    }

    /**
     * <p>
     * The relevance score of the generated audience.
     * </p>
     * 
     * @param score
     *        The relevance score of the generated audience.
     */

    public void setScore(Double score) {
        this.score = score;
    }

    /**
     * <p>
     * The relevance score of the generated audience.
     * </p>
     * 
     * @return The relevance score of the generated audience.
     */

    public Double getScore() {
        return this.score;
    }

    /**
     * <p>
     * The relevance score of the generated audience.
     * </p>
     * 
     * @param score
     *        The relevance score of the generated audience.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelevanceMetric withScore(Double score) {
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
        if (getAudienceSize() != null)
            sb.append("AudienceSize: ").append(getAudienceSize()).append(",");
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

        if (obj instanceof RelevanceMetric == false)
            return false;
        RelevanceMetric other = (RelevanceMetric) obj;
        if (other.getAudienceSize() == null ^ this.getAudienceSize() == null)
            return false;
        if (other.getAudienceSize() != null && other.getAudienceSize().equals(this.getAudienceSize()) == false)
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

        hashCode = prime * hashCode + ((getAudienceSize() == null) ? 0 : getAudienceSize().hashCode());
        hashCode = prime * hashCode + ((getScore() == null) ? 0 : getScore().hashCode());
        return hashCode;
    }

    @Override
    public RelevanceMetric clone() {
        try {
            return (RelevanceMetric) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanroomsml.model.transform.RelevanceMetricMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
