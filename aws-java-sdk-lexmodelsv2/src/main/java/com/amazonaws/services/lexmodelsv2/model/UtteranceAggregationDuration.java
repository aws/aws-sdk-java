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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides parameters for setting the time window and duration for aggregating utterance data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/UtteranceAggregationDuration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UtteranceAggregationDuration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The desired time window for aggregating utterances.
     * </p>
     */
    private RelativeAggregationDuration relativeAggregationDuration;

    /**
     * <p>
     * The desired time window for aggregating utterances.
     * </p>
     * 
     * @param relativeAggregationDuration
     *        The desired time window for aggregating utterances.
     */

    public void setRelativeAggregationDuration(RelativeAggregationDuration relativeAggregationDuration) {
        this.relativeAggregationDuration = relativeAggregationDuration;
    }

    /**
     * <p>
     * The desired time window for aggregating utterances.
     * </p>
     * 
     * @return The desired time window for aggregating utterances.
     */

    public RelativeAggregationDuration getRelativeAggregationDuration() {
        return this.relativeAggregationDuration;
    }

    /**
     * <p>
     * The desired time window for aggregating utterances.
     * </p>
     * 
     * @param relativeAggregationDuration
     *        The desired time window for aggregating utterances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UtteranceAggregationDuration withRelativeAggregationDuration(RelativeAggregationDuration relativeAggregationDuration) {
        setRelativeAggregationDuration(relativeAggregationDuration);
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
        if (getRelativeAggregationDuration() != null)
            sb.append("RelativeAggregationDuration: ").append(getRelativeAggregationDuration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UtteranceAggregationDuration == false)
            return false;
        UtteranceAggregationDuration other = (UtteranceAggregationDuration) obj;
        if (other.getRelativeAggregationDuration() == null ^ this.getRelativeAggregationDuration() == null)
            return false;
        if (other.getRelativeAggregationDuration() != null && other.getRelativeAggregationDuration().equals(this.getRelativeAggregationDuration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRelativeAggregationDuration() == null) ? 0 : getRelativeAggregationDuration().hashCode());
        return hashCode;
    }

    @Override
    public UtteranceAggregationDuration clone() {
        try {
            return (UtteranceAggregationDuration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.UtteranceAggregationDurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
