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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A schedule configures how often and when a pipeline will automatically create a new image.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/Schedule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Schedule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The expression determines how often EC2 Image Builder evaluates your <code>pipelineExecutionStartCondition</code>
     * .
     * </p>
     */
    private String scheduleExpression;
    /**
     * <p>
     * The condition configures when the pipeline should trigger a new image build. When the
     * <code>pipelineExecutionStartCondition</code> is set to
     * <code>EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE</code>, EC2 Image Builder will build a new image only
     * when there are known changes pending. When it is set to <code>EXPRESSION_MATCH_ONLY</code>, it will build a new
     * image every time the CRON expression matches the current time.
     * </p>
     */
    private String pipelineExecutionStartCondition;

    /**
     * <p>
     * The expression determines how often EC2 Image Builder evaluates your <code>pipelineExecutionStartCondition</code>
     * .
     * </p>
     * 
     * @param scheduleExpression
     *        The expression determines how often EC2 Image Builder evaluates your
     *        <code>pipelineExecutionStartCondition</code>.
     */

    public void setScheduleExpression(String scheduleExpression) {
        this.scheduleExpression = scheduleExpression;
    }

    /**
     * <p>
     * The expression determines how often EC2 Image Builder evaluates your <code>pipelineExecutionStartCondition</code>
     * .
     * </p>
     * 
     * @return The expression determines how often EC2 Image Builder evaluates your
     *         <code>pipelineExecutionStartCondition</code>.
     */

    public String getScheduleExpression() {
        return this.scheduleExpression;
    }

    /**
     * <p>
     * The expression determines how often EC2 Image Builder evaluates your <code>pipelineExecutionStartCondition</code>
     * .
     * </p>
     * 
     * @param scheduleExpression
     *        The expression determines how often EC2 Image Builder evaluates your
     *        <code>pipelineExecutionStartCondition</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Schedule withScheduleExpression(String scheduleExpression) {
        setScheduleExpression(scheduleExpression);
        return this;
    }

    /**
     * <p>
     * The condition configures when the pipeline should trigger a new image build. When the
     * <code>pipelineExecutionStartCondition</code> is set to
     * <code>EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE</code>, EC2 Image Builder will build a new image only
     * when there are known changes pending. When it is set to <code>EXPRESSION_MATCH_ONLY</code>, it will build a new
     * image every time the CRON expression matches the current time.
     * </p>
     * 
     * @param pipelineExecutionStartCondition
     *        The condition configures when the pipeline should trigger a new image build. When the
     *        <code>pipelineExecutionStartCondition</code> is set to
     *        <code>EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE</code>, EC2 Image Builder will build a new image
     *        only when there are known changes pending. When it is set to <code>EXPRESSION_MATCH_ONLY</code>, it will
     *        build a new image every time the CRON expression matches the current time.
     * @see PipelineExecutionStartCondition
     */

    public void setPipelineExecutionStartCondition(String pipelineExecutionStartCondition) {
        this.pipelineExecutionStartCondition = pipelineExecutionStartCondition;
    }

    /**
     * <p>
     * The condition configures when the pipeline should trigger a new image build. When the
     * <code>pipelineExecutionStartCondition</code> is set to
     * <code>EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE</code>, EC2 Image Builder will build a new image only
     * when there are known changes pending. When it is set to <code>EXPRESSION_MATCH_ONLY</code>, it will build a new
     * image every time the CRON expression matches the current time.
     * </p>
     * 
     * @return The condition configures when the pipeline should trigger a new image build. When the
     *         <code>pipelineExecutionStartCondition</code> is set to
     *         <code>EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE</code>, EC2 Image Builder will build a new image
     *         only when there are known changes pending. When it is set to <code>EXPRESSION_MATCH_ONLY</code>, it will
     *         build a new image every time the CRON expression matches the current time.
     * @see PipelineExecutionStartCondition
     */

    public String getPipelineExecutionStartCondition() {
        return this.pipelineExecutionStartCondition;
    }

    /**
     * <p>
     * The condition configures when the pipeline should trigger a new image build. When the
     * <code>pipelineExecutionStartCondition</code> is set to
     * <code>EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE</code>, EC2 Image Builder will build a new image only
     * when there are known changes pending. When it is set to <code>EXPRESSION_MATCH_ONLY</code>, it will build a new
     * image every time the CRON expression matches the current time.
     * </p>
     * 
     * @param pipelineExecutionStartCondition
     *        The condition configures when the pipeline should trigger a new image build. When the
     *        <code>pipelineExecutionStartCondition</code> is set to
     *        <code>EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE</code>, EC2 Image Builder will build a new image
     *        only when there are known changes pending. When it is set to <code>EXPRESSION_MATCH_ONLY</code>, it will
     *        build a new image every time the CRON expression matches the current time.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PipelineExecutionStartCondition
     */

    public Schedule withPipelineExecutionStartCondition(String pipelineExecutionStartCondition) {
        setPipelineExecutionStartCondition(pipelineExecutionStartCondition);
        return this;
    }

    /**
     * <p>
     * The condition configures when the pipeline should trigger a new image build. When the
     * <code>pipelineExecutionStartCondition</code> is set to
     * <code>EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE</code>, EC2 Image Builder will build a new image only
     * when there are known changes pending. When it is set to <code>EXPRESSION_MATCH_ONLY</code>, it will build a new
     * image every time the CRON expression matches the current time.
     * </p>
     * 
     * @param pipelineExecutionStartCondition
     *        The condition configures when the pipeline should trigger a new image build. When the
     *        <code>pipelineExecutionStartCondition</code> is set to
     *        <code>EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE</code>, EC2 Image Builder will build a new image
     *        only when there are known changes pending. When it is set to <code>EXPRESSION_MATCH_ONLY</code>, it will
     *        build a new image every time the CRON expression matches the current time.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PipelineExecutionStartCondition
     */

    public Schedule withPipelineExecutionStartCondition(PipelineExecutionStartCondition pipelineExecutionStartCondition) {
        this.pipelineExecutionStartCondition = pipelineExecutionStartCondition.toString();
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
        if (getScheduleExpression() != null)
            sb.append("ScheduleExpression: ").append(getScheduleExpression()).append(",");
        if (getPipelineExecutionStartCondition() != null)
            sb.append("PipelineExecutionStartCondition: ").append(getPipelineExecutionStartCondition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Schedule == false)
            return false;
        Schedule other = (Schedule) obj;
        if (other.getScheduleExpression() == null ^ this.getScheduleExpression() == null)
            return false;
        if (other.getScheduleExpression() != null && other.getScheduleExpression().equals(this.getScheduleExpression()) == false)
            return false;
        if (other.getPipelineExecutionStartCondition() == null ^ this.getPipelineExecutionStartCondition() == null)
            return false;
        if (other.getPipelineExecutionStartCondition() != null
                && other.getPipelineExecutionStartCondition().equals(this.getPipelineExecutionStartCondition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScheduleExpression() == null) ? 0 : getScheduleExpression().hashCode());
        hashCode = prime * hashCode + ((getPipelineExecutionStartCondition() == null) ? 0 : getPipelineExecutionStartCondition().hashCode());
        return hashCode;
    }

    @Override
    public Schedule clone() {
        try {
            return (Schedule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.imagebuilder.model.transform.ScheduleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
