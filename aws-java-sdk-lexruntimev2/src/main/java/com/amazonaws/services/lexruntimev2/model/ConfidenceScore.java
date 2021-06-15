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
package com.amazonaws.services.lexruntimev2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides a score that indicates the confidence that Amazon Lex V2 has that an intent is the one that satisfies the
 * user's intent.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/runtime.lex.v2-2020-08-07/ConfidenceScore" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfidenceScore implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A score that indicates how confident Amazon Lex V2 is that an intent satisfies the user's intent. Ranges between
     * 0.00 and 1.00. Higher scores indicate higher confidence.
     * </p>
     */
    private Double score;

    /**
     * <p>
     * A score that indicates how confident Amazon Lex V2 is that an intent satisfies the user's intent. Ranges between
     * 0.00 and 1.00. Higher scores indicate higher confidence.
     * </p>
     * 
     * @param score
     *        A score that indicates how confident Amazon Lex V2 is that an intent satisfies the user's intent. Ranges
     *        between 0.00 and 1.00. Higher scores indicate higher confidence.
     */

    public void setScore(Double score) {
        this.score = score;
    }

    /**
     * <p>
     * A score that indicates how confident Amazon Lex V2 is that an intent satisfies the user's intent. Ranges between
     * 0.00 and 1.00. Higher scores indicate higher confidence.
     * </p>
     * 
     * @return A score that indicates how confident Amazon Lex V2 is that an intent satisfies the user's intent. Ranges
     *         between 0.00 and 1.00. Higher scores indicate higher confidence.
     */

    public Double getScore() {
        return this.score;
    }

    /**
     * <p>
     * A score that indicates how confident Amazon Lex V2 is that an intent satisfies the user's intent. Ranges between
     * 0.00 and 1.00. Higher scores indicate higher confidence.
     * </p>
     * 
     * @param score
     *        A score that indicates how confident Amazon Lex V2 is that an intent satisfies the user's intent. Ranges
     *        between 0.00 and 1.00. Higher scores indicate higher confidence.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfidenceScore withScore(Double score) {
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

        if (obj instanceof ConfidenceScore == false)
            return false;
        ConfidenceScore other = (ConfidenceScore) obj;
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

        hashCode = prime * hashCode + ((getScore() == null) ? 0 : getScore().hashCode());
        return hashCode;
    }

    @Override
    public ConfidenceScore clone() {
        try {
            return (ConfidenceScore) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexruntimev2.model.transform.ConfidenceScoreMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
