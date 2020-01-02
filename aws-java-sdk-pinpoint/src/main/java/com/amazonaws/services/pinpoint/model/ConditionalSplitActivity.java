/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the settings for a yes/no split activity in a journey. This type of activity sends participants down one of
 * two paths in a journey, based on conditions that you specify.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/ConditionalSplitActivity" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConditionalSplitActivity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The conditions that define the paths for the activity, and the relationship between the conditions.
     * </p>
     */
    private Condition condition;
    /**
     * <p>
     * The amount of time to wait before determining whether the conditions are met, or the date and time when Amazon
     * Pinpoint determines whether the conditions are met.
     * </p>
     */
    private WaitTime evaluationWaitTime;
    /**
     * <p>
     * The unique identifier for the activity to perform if the conditions aren't met.
     * </p>
     */
    private String falseActivity;
    /**
     * <p>
     * The unique identifier for the activity to perform if the conditions are met.
     * </p>
     */
    private String trueActivity;

    /**
     * <p>
     * The conditions that define the paths for the activity, and the relationship between the conditions.
     * </p>
     * 
     * @param condition
     *        The conditions that define the paths for the activity, and the relationship between the conditions.
     */

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    /**
     * <p>
     * The conditions that define the paths for the activity, and the relationship between the conditions.
     * </p>
     * 
     * @return The conditions that define the paths for the activity, and the relationship between the conditions.
     */

    public Condition getCondition() {
        return this.condition;
    }

    /**
     * <p>
     * The conditions that define the paths for the activity, and the relationship between the conditions.
     * </p>
     * 
     * @param condition
     *        The conditions that define the paths for the activity, and the relationship between the conditions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConditionalSplitActivity withCondition(Condition condition) {
        setCondition(condition);
        return this;
    }

    /**
     * <p>
     * The amount of time to wait before determining whether the conditions are met, or the date and time when Amazon
     * Pinpoint determines whether the conditions are met.
     * </p>
     * 
     * @param evaluationWaitTime
     *        The amount of time to wait before determining whether the conditions are met, or the date and time when
     *        Amazon Pinpoint determines whether the conditions are met.
     */

    public void setEvaluationWaitTime(WaitTime evaluationWaitTime) {
        this.evaluationWaitTime = evaluationWaitTime;
    }

    /**
     * <p>
     * The amount of time to wait before determining whether the conditions are met, or the date and time when Amazon
     * Pinpoint determines whether the conditions are met.
     * </p>
     * 
     * @return The amount of time to wait before determining whether the conditions are met, or the date and time when
     *         Amazon Pinpoint determines whether the conditions are met.
     */

    public WaitTime getEvaluationWaitTime() {
        return this.evaluationWaitTime;
    }

    /**
     * <p>
     * The amount of time to wait before determining whether the conditions are met, or the date and time when Amazon
     * Pinpoint determines whether the conditions are met.
     * </p>
     * 
     * @param evaluationWaitTime
     *        The amount of time to wait before determining whether the conditions are met, or the date and time when
     *        Amazon Pinpoint determines whether the conditions are met.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConditionalSplitActivity withEvaluationWaitTime(WaitTime evaluationWaitTime) {
        setEvaluationWaitTime(evaluationWaitTime);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the activity to perform if the conditions aren't met.
     * </p>
     * 
     * @param falseActivity
     *        The unique identifier for the activity to perform if the conditions aren't met.
     */

    public void setFalseActivity(String falseActivity) {
        this.falseActivity = falseActivity;
    }

    /**
     * <p>
     * The unique identifier for the activity to perform if the conditions aren't met.
     * </p>
     * 
     * @return The unique identifier for the activity to perform if the conditions aren't met.
     */

    public String getFalseActivity() {
        return this.falseActivity;
    }

    /**
     * <p>
     * The unique identifier for the activity to perform if the conditions aren't met.
     * </p>
     * 
     * @param falseActivity
     *        The unique identifier for the activity to perform if the conditions aren't met.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConditionalSplitActivity withFalseActivity(String falseActivity) {
        setFalseActivity(falseActivity);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the activity to perform if the conditions are met.
     * </p>
     * 
     * @param trueActivity
     *        The unique identifier for the activity to perform if the conditions are met.
     */

    public void setTrueActivity(String trueActivity) {
        this.trueActivity = trueActivity;
    }

    /**
     * <p>
     * The unique identifier for the activity to perform if the conditions are met.
     * </p>
     * 
     * @return The unique identifier for the activity to perform if the conditions are met.
     */

    public String getTrueActivity() {
        return this.trueActivity;
    }

    /**
     * <p>
     * The unique identifier for the activity to perform if the conditions are met.
     * </p>
     * 
     * @param trueActivity
     *        The unique identifier for the activity to perform if the conditions are met.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConditionalSplitActivity withTrueActivity(String trueActivity) {
        setTrueActivity(trueActivity);
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
        if (getCondition() != null)
            sb.append("Condition: ").append(getCondition()).append(",");
        if (getEvaluationWaitTime() != null)
            sb.append("EvaluationWaitTime: ").append(getEvaluationWaitTime()).append(",");
        if (getFalseActivity() != null)
            sb.append("FalseActivity: ").append(getFalseActivity()).append(",");
        if (getTrueActivity() != null)
            sb.append("TrueActivity: ").append(getTrueActivity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConditionalSplitActivity == false)
            return false;
        ConditionalSplitActivity other = (ConditionalSplitActivity) obj;
        if (other.getCondition() == null ^ this.getCondition() == null)
            return false;
        if (other.getCondition() != null && other.getCondition().equals(this.getCondition()) == false)
            return false;
        if (other.getEvaluationWaitTime() == null ^ this.getEvaluationWaitTime() == null)
            return false;
        if (other.getEvaluationWaitTime() != null && other.getEvaluationWaitTime().equals(this.getEvaluationWaitTime()) == false)
            return false;
        if (other.getFalseActivity() == null ^ this.getFalseActivity() == null)
            return false;
        if (other.getFalseActivity() != null && other.getFalseActivity().equals(this.getFalseActivity()) == false)
            return false;
        if (other.getTrueActivity() == null ^ this.getTrueActivity() == null)
            return false;
        if (other.getTrueActivity() != null && other.getTrueActivity().equals(this.getTrueActivity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCondition() == null) ? 0 : getCondition().hashCode());
        hashCode = prime * hashCode + ((getEvaluationWaitTime() == null) ? 0 : getEvaluationWaitTime().hashCode());
        hashCode = prime * hashCode + ((getFalseActivity() == null) ? 0 : getFalseActivity().hashCode());
        hashCode = prime * hashCode + ((getTrueActivity() == null) ? 0 : getTrueActivity().hashCode());
        return hashCode;
    }

    @Override
    public ConditionalSplitActivity clone() {
        try {
            return (ConditionalSplitActivity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.ConditionalSplitActivityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
