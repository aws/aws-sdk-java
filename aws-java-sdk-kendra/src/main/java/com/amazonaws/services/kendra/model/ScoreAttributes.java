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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides a relative ranking that indicates how confident Amazon Kendra is that the response matches the query.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ScoreAttributes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScoreAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A relative ranking for how well the response matches the query.
     * </p>
     */
    private String scoreConfidence;

    /**
     * <p>
     * A relative ranking for how well the response matches the query.
     * </p>
     * 
     * @param scoreConfidence
     *        A relative ranking for how well the response matches the query.
     * @see ScoreConfidence
     */

    public void setScoreConfidence(String scoreConfidence) {
        this.scoreConfidence = scoreConfidence;
    }

    /**
     * <p>
     * A relative ranking for how well the response matches the query.
     * </p>
     * 
     * @return A relative ranking for how well the response matches the query.
     * @see ScoreConfidence
     */

    public String getScoreConfidence() {
        return this.scoreConfidence;
    }

    /**
     * <p>
     * A relative ranking for how well the response matches the query.
     * </p>
     * 
     * @param scoreConfidence
     *        A relative ranking for how well the response matches the query.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScoreConfidence
     */

    public ScoreAttributes withScoreConfidence(String scoreConfidence) {
        setScoreConfidence(scoreConfidence);
        return this;
    }

    /**
     * <p>
     * A relative ranking for how well the response matches the query.
     * </p>
     * 
     * @param scoreConfidence
     *        A relative ranking for how well the response matches the query.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScoreConfidence
     */

    public ScoreAttributes withScoreConfidence(ScoreConfidence scoreConfidence) {
        this.scoreConfidence = scoreConfidence.toString();
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
        if (getScoreConfidence() != null)
            sb.append("ScoreConfidence: ").append(getScoreConfidence());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScoreAttributes == false)
            return false;
        ScoreAttributes other = (ScoreAttributes) obj;
        if (other.getScoreConfidence() == null ^ this.getScoreConfidence() == null)
            return false;
        if (other.getScoreConfidence() != null && other.getScoreConfidence().equals(this.getScoreConfidence()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScoreConfidence() == null) ? 0 : getScoreConfidence().hashCode());
        return hashCode;
    }

    @Override
    public ScoreAttributes clone() {
        try {
            return (ScoreAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.ScoreAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
