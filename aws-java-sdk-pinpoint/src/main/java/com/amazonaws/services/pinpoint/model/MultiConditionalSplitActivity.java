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
 * Specifies the settings for a multivariate split activity in a journey. This type of activity sends participants down
 * one of as many as five paths (including a default <i>Else</i> path) in a journey, based on conditions that you
 * specify.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/MultiConditionalSplitActivity"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MultiConditionalSplitActivity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The paths for the activity, including the conditions for entering each path and the activity to perform for each
     * path.
     * </p>
     */
    private java.util.List<MultiConditionalBranch> branches;
    /**
     * <p>
     * The unique identifier for the activity to perform for participants who don't meet any of the conditions specified
     * for other paths in the activity.
     * </p>
     */
    private String defaultActivity;
    /**
     * <p>
     * The amount of time to wait or the date and time when Amazon Pinpoint determines whether the conditions are met.
     * </p>
     */
    private WaitTime evaluationWaitTime;

    /**
     * <p>
     * The paths for the activity, including the conditions for entering each path and the activity to perform for each
     * path.
     * </p>
     * 
     * @return The paths for the activity, including the conditions for entering each path and the activity to perform
     *         for each path.
     */

    public java.util.List<MultiConditionalBranch> getBranches() {
        return branches;
    }

    /**
     * <p>
     * The paths for the activity, including the conditions for entering each path and the activity to perform for each
     * path.
     * </p>
     * 
     * @param branches
     *        The paths for the activity, including the conditions for entering each path and the activity to perform
     *        for each path.
     */

    public void setBranches(java.util.Collection<MultiConditionalBranch> branches) {
        if (branches == null) {
            this.branches = null;
            return;
        }

        this.branches = new java.util.ArrayList<MultiConditionalBranch>(branches);
    }

    /**
     * <p>
     * The paths for the activity, including the conditions for entering each path and the activity to perform for each
     * path.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBranches(java.util.Collection)} or {@link #withBranches(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param branches
     *        The paths for the activity, including the conditions for entering each path and the activity to perform
     *        for each path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MultiConditionalSplitActivity withBranches(MultiConditionalBranch... branches) {
        if (this.branches == null) {
            setBranches(new java.util.ArrayList<MultiConditionalBranch>(branches.length));
        }
        for (MultiConditionalBranch ele : branches) {
            this.branches.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The paths for the activity, including the conditions for entering each path and the activity to perform for each
     * path.
     * </p>
     * 
     * @param branches
     *        The paths for the activity, including the conditions for entering each path and the activity to perform
     *        for each path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MultiConditionalSplitActivity withBranches(java.util.Collection<MultiConditionalBranch> branches) {
        setBranches(branches);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the activity to perform for participants who don't meet any of the conditions specified
     * for other paths in the activity.
     * </p>
     * 
     * @param defaultActivity
     *        The unique identifier for the activity to perform for participants who don't meet any of the conditions
     *        specified for other paths in the activity.
     */

    public void setDefaultActivity(String defaultActivity) {
        this.defaultActivity = defaultActivity;
    }

    /**
     * <p>
     * The unique identifier for the activity to perform for participants who don't meet any of the conditions specified
     * for other paths in the activity.
     * </p>
     * 
     * @return The unique identifier for the activity to perform for participants who don't meet any of the conditions
     *         specified for other paths in the activity.
     */

    public String getDefaultActivity() {
        return this.defaultActivity;
    }

    /**
     * <p>
     * The unique identifier for the activity to perform for participants who don't meet any of the conditions specified
     * for other paths in the activity.
     * </p>
     * 
     * @param defaultActivity
     *        The unique identifier for the activity to perform for participants who don't meet any of the conditions
     *        specified for other paths in the activity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MultiConditionalSplitActivity withDefaultActivity(String defaultActivity) {
        setDefaultActivity(defaultActivity);
        return this;
    }

    /**
     * <p>
     * The amount of time to wait or the date and time when Amazon Pinpoint determines whether the conditions are met.
     * </p>
     * 
     * @param evaluationWaitTime
     *        The amount of time to wait or the date and time when Amazon Pinpoint determines whether the conditions are
     *        met.
     */

    public void setEvaluationWaitTime(WaitTime evaluationWaitTime) {
        this.evaluationWaitTime = evaluationWaitTime;
    }

    /**
     * <p>
     * The amount of time to wait or the date and time when Amazon Pinpoint determines whether the conditions are met.
     * </p>
     * 
     * @return The amount of time to wait or the date and time when Amazon Pinpoint determines whether the conditions
     *         are met.
     */

    public WaitTime getEvaluationWaitTime() {
        return this.evaluationWaitTime;
    }

    /**
     * <p>
     * The amount of time to wait or the date and time when Amazon Pinpoint determines whether the conditions are met.
     * </p>
     * 
     * @param evaluationWaitTime
     *        The amount of time to wait or the date and time when Amazon Pinpoint determines whether the conditions are
     *        met.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MultiConditionalSplitActivity withEvaluationWaitTime(WaitTime evaluationWaitTime) {
        setEvaluationWaitTime(evaluationWaitTime);
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
        if (getBranches() != null)
            sb.append("Branches: ").append(getBranches()).append(",");
        if (getDefaultActivity() != null)
            sb.append("DefaultActivity: ").append(getDefaultActivity()).append(",");
        if (getEvaluationWaitTime() != null)
            sb.append("EvaluationWaitTime: ").append(getEvaluationWaitTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MultiConditionalSplitActivity == false)
            return false;
        MultiConditionalSplitActivity other = (MultiConditionalSplitActivity) obj;
        if (other.getBranches() == null ^ this.getBranches() == null)
            return false;
        if (other.getBranches() != null && other.getBranches().equals(this.getBranches()) == false)
            return false;
        if (other.getDefaultActivity() == null ^ this.getDefaultActivity() == null)
            return false;
        if (other.getDefaultActivity() != null && other.getDefaultActivity().equals(this.getDefaultActivity()) == false)
            return false;
        if (other.getEvaluationWaitTime() == null ^ this.getEvaluationWaitTime() == null)
            return false;
        if (other.getEvaluationWaitTime() != null && other.getEvaluationWaitTime().equals(this.getEvaluationWaitTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBranches() == null) ? 0 : getBranches().hashCode());
        hashCode = prime * hashCode + ((getDefaultActivity() == null) ? 0 : getDefaultActivity().hashCode());
        hashCode = prime * hashCode + ((getEvaluationWaitTime() == null) ? 0 : getEvaluationWaitTime().hashCode());
        return hashCode;
    }

    @Override
    public MultiConditionalSplitActivity clone() {
        try {
            return (MultiConditionalSplitActivity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.MultiConditionalSplitActivityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
