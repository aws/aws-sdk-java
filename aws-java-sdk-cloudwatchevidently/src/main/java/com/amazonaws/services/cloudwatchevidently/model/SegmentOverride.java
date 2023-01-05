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
package com.amazonaws.services.cloudwatchevidently.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This structure specifies a segment that you have already created, and defines the traffic split for that segment to
 * be used in a launch.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/SegmentOverride" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SegmentOverride implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A number indicating the order to use to evaluate segment overrides, if there are more than one. Segment overrides
     * with lower numbers are evaluated first.
     * </p>
     */
    private Long evaluationOrder;
    /**
     * <p>
     * The ARN of the segment to use.
     * </p>
     */
    private String segment;
    /**
     * <p>
     * The traffic allocation percentages among the feature variations to assign to this segment. This is a set of
     * key-value pairs. The keys are variation names. The values represent the amount of traffic to allocate to that
     * variation for this segment. This is expressed in thousandths of a percent, so a weight of 50000 represents 50% of
     * traffic.
     * </p>
     */
    private java.util.Map<String, Long> weights;

    /**
     * <p>
     * A number indicating the order to use to evaluate segment overrides, if there are more than one. Segment overrides
     * with lower numbers are evaluated first.
     * </p>
     * 
     * @param evaluationOrder
     *        A number indicating the order to use to evaluate segment overrides, if there are more than one. Segment
     *        overrides with lower numbers are evaluated first.
     */

    public void setEvaluationOrder(Long evaluationOrder) {
        this.evaluationOrder = evaluationOrder;
    }

    /**
     * <p>
     * A number indicating the order to use to evaluate segment overrides, if there are more than one. Segment overrides
     * with lower numbers are evaluated first.
     * </p>
     * 
     * @return A number indicating the order to use to evaluate segment overrides, if there are more than one. Segment
     *         overrides with lower numbers are evaluated first.
     */

    public Long getEvaluationOrder() {
        return this.evaluationOrder;
    }

    /**
     * <p>
     * A number indicating the order to use to evaluate segment overrides, if there are more than one. Segment overrides
     * with lower numbers are evaluated first.
     * </p>
     * 
     * @param evaluationOrder
     *        A number indicating the order to use to evaluate segment overrides, if there are more than one. Segment
     *        overrides with lower numbers are evaluated first.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentOverride withEvaluationOrder(Long evaluationOrder) {
        setEvaluationOrder(evaluationOrder);
        return this;
    }

    /**
     * <p>
     * The ARN of the segment to use.
     * </p>
     * 
     * @param segment
     *        The ARN of the segment to use.
     */

    public void setSegment(String segment) {
        this.segment = segment;
    }

    /**
     * <p>
     * The ARN of the segment to use.
     * </p>
     * 
     * @return The ARN of the segment to use.
     */

    public String getSegment() {
        return this.segment;
    }

    /**
     * <p>
     * The ARN of the segment to use.
     * </p>
     * 
     * @param segment
     *        The ARN of the segment to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentOverride withSegment(String segment) {
        setSegment(segment);
        return this;
    }

    /**
     * <p>
     * The traffic allocation percentages among the feature variations to assign to this segment. This is a set of
     * key-value pairs. The keys are variation names. The values represent the amount of traffic to allocate to that
     * variation for this segment. This is expressed in thousandths of a percent, so a weight of 50000 represents 50% of
     * traffic.
     * </p>
     * 
     * @return The traffic allocation percentages among the feature variations to assign to this segment. This is a set
     *         of key-value pairs. The keys are variation names. The values represent the amount of traffic to allocate
     *         to that variation for this segment. This is expressed in thousandths of a percent, so a weight of 50000
     *         represents 50% of traffic.
     */

    public java.util.Map<String, Long> getWeights() {
        return weights;
    }

    /**
     * <p>
     * The traffic allocation percentages among the feature variations to assign to this segment. This is a set of
     * key-value pairs. The keys are variation names. The values represent the amount of traffic to allocate to that
     * variation for this segment. This is expressed in thousandths of a percent, so a weight of 50000 represents 50% of
     * traffic.
     * </p>
     * 
     * @param weights
     *        The traffic allocation percentages among the feature variations to assign to this segment. This is a set
     *        of key-value pairs. The keys are variation names. The values represent the amount of traffic to allocate
     *        to that variation for this segment. This is expressed in thousandths of a percent, so a weight of 50000
     *        represents 50% of traffic.
     */

    public void setWeights(java.util.Map<String, Long> weights) {
        this.weights = weights;
    }

    /**
     * <p>
     * The traffic allocation percentages among the feature variations to assign to this segment. This is a set of
     * key-value pairs. The keys are variation names. The values represent the amount of traffic to allocate to that
     * variation for this segment. This is expressed in thousandths of a percent, so a weight of 50000 represents 50% of
     * traffic.
     * </p>
     * 
     * @param weights
     *        The traffic allocation percentages among the feature variations to assign to this segment. This is a set
     *        of key-value pairs. The keys are variation names. The values represent the amount of traffic to allocate
     *        to that variation for this segment. This is expressed in thousandths of a percent, so a weight of 50000
     *        represents 50% of traffic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentOverride withWeights(java.util.Map<String, Long> weights) {
        setWeights(weights);
        return this;
    }

    /**
     * Add a single Weights entry
     *
     * @see SegmentOverride#withWeights
     * @returns a reference to this object so that method calls can be chained together.
     */

    public SegmentOverride addWeightsEntry(String key, Long value) {
        if (null == this.weights) {
            this.weights = new java.util.HashMap<String, Long>();
        }
        if (this.weights.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.weights.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Weights.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentOverride clearWeightsEntries() {
        this.weights = null;
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
        if (getEvaluationOrder() != null)
            sb.append("EvaluationOrder: ").append(getEvaluationOrder()).append(",");
        if (getSegment() != null)
            sb.append("Segment: ").append(getSegment()).append(",");
        if (getWeights() != null)
            sb.append("Weights: ").append(getWeights());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SegmentOverride == false)
            return false;
        SegmentOverride other = (SegmentOverride) obj;
        if (other.getEvaluationOrder() == null ^ this.getEvaluationOrder() == null)
            return false;
        if (other.getEvaluationOrder() != null && other.getEvaluationOrder().equals(this.getEvaluationOrder()) == false)
            return false;
        if (other.getSegment() == null ^ this.getSegment() == null)
            return false;
        if (other.getSegment() != null && other.getSegment().equals(this.getSegment()) == false)
            return false;
        if (other.getWeights() == null ^ this.getWeights() == null)
            return false;
        if (other.getWeights() != null && other.getWeights().equals(this.getWeights()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEvaluationOrder() == null) ? 0 : getEvaluationOrder().hashCode());
        hashCode = prime * hashCode + ((getSegment() == null) ? 0 : getSegment().hashCode());
        hashCode = prime * hashCode + ((getWeights() == null) ? 0 : getWeights().hashCode());
        return hashCode;
    }

    @Override
    public SegmentOverride clone() {
        try {
            return (SegmentOverride) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudwatchevidently.model.transform.SegmentOverrideMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
