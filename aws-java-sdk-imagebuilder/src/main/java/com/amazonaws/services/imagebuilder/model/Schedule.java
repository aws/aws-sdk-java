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
     * The cron expression determines how often EC2 Image Builder evaluates your
     * <code>pipelineExecutionStartCondition</code>.
     * </p>
     * <p>
     * For information on how to format a cron expression in Image Builder, see <a
     * href="https://docs.aws.amazon.com/imagebuilder/latest/userguide/image-builder-cron.html">Use cron expressions in
     * EC2 Image Builder</a>.
     * </p>
     */
    private String scheduleExpression;
    /**
     * <p>
     * The timezone that applies to the scheduling expression. For example, "Etc/UTC", "America/Los_Angeles" in the <a
     * href="https://www.joda.org/joda-time/timezones.html">IANA timezone format</a>. If not specified this defaults to
     * UTC.
     * </p>
     */
    private String timezone;
    /**
     * <p>
     * The condition configures when the pipeline should trigger a new image build. When the
     * <code>pipelineExecutionStartCondition</code> is set to
     * <code>EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE</code>, and you use semantic version filters on the
     * source image or components in your image recipe, EC2 Image Builder will build a new image only when there are new
     * versions of the image or components in your recipe that match the semantic version filter. When it is set to
     * <code>EXPRESSION_MATCH_ONLY</code>, it will build a new image every time the CRON expression matches the current
     * time. For semantic version syntax, see <a
     * href="https://docs.aws.amazon.com/imagebuilder/latest/APIReference/API_CreateComponent.html">CreateComponent</a>
     * in the <i> EC2 Image Builder API Reference</i>.
     * </p>
     */
    private String pipelineExecutionStartCondition;

    /**
     * <p>
     * The cron expression determines how often EC2 Image Builder evaluates your
     * <code>pipelineExecutionStartCondition</code>.
     * </p>
     * <p>
     * For information on how to format a cron expression in Image Builder, see <a
     * href="https://docs.aws.amazon.com/imagebuilder/latest/userguide/image-builder-cron.html">Use cron expressions in
     * EC2 Image Builder</a>.
     * </p>
     * 
     * @param scheduleExpression
     *        The cron expression determines how often EC2 Image Builder evaluates your
     *        <code>pipelineExecutionStartCondition</code>.</p>
     *        <p>
     *        For information on how to format a cron expression in Image Builder, see <a
     *        href="https://docs.aws.amazon.com/imagebuilder/latest/userguide/image-builder-cron.html">Use cron
     *        expressions in EC2 Image Builder</a>.
     */

    public void setScheduleExpression(String scheduleExpression) {
        this.scheduleExpression = scheduleExpression;
    }

    /**
     * <p>
     * The cron expression determines how often EC2 Image Builder evaluates your
     * <code>pipelineExecutionStartCondition</code>.
     * </p>
     * <p>
     * For information on how to format a cron expression in Image Builder, see <a
     * href="https://docs.aws.amazon.com/imagebuilder/latest/userguide/image-builder-cron.html">Use cron expressions in
     * EC2 Image Builder</a>.
     * </p>
     * 
     * @return The cron expression determines how often EC2 Image Builder evaluates your
     *         <code>pipelineExecutionStartCondition</code>.</p>
     *         <p>
     *         For information on how to format a cron expression in Image Builder, see <a
     *         href="https://docs.aws.amazon.com/imagebuilder/latest/userguide/image-builder-cron.html">Use cron
     *         expressions in EC2 Image Builder</a>.
     */

    public String getScheduleExpression() {
        return this.scheduleExpression;
    }

    /**
     * <p>
     * The cron expression determines how often EC2 Image Builder evaluates your
     * <code>pipelineExecutionStartCondition</code>.
     * </p>
     * <p>
     * For information on how to format a cron expression in Image Builder, see <a
     * href="https://docs.aws.amazon.com/imagebuilder/latest/userguide/image-builder-cron.html">Use cron expressions in
     * EC2 Image Builder</a>.
     * </p>
     * 
     * @param scheduleExpression
     *        The cron expression determines how often EC2 Image Builder evaluates your
     *        <code>pipelineExecutionStartCondition</code>.</p>
     *        <p>
     *        For information on how to format a cron expression in Image Builder, see <a
     *        href="https://docs.aws.amazon.com/imagebuilder/latest/userguide/image-builder-cron.html">Use cron
     *        expressions in EC2 Image Builder</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Schedule withScheduleExpression(String scheduleExpression) {
        setScheduleExpression(scheduleExpression);
        return this;
    }

    /**
     * <p>
     * The timezone that applies to the scheduling expression. For example, "Etc/UTC", "America/Los_Angeles" in the <a
     * href="https://www.joda.org/joda-time/timezones.html">IANA timezone format</a>. If not specified this defaults to
     * UTC.
     * </p>
     * 
     * @param timezone
     *        The timezone that applies to the scheduling expression. For example, "Etc/UTC", "America/Los_Angeles" in
     *        the <a href="https://www.joda.org/joda-time/timezones.html">IANA timezone format</a>. If not specified
     *        this defaults to UTC.
     */

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     * <p>
     * The timezone that applies to the scheduling expression. For example, "Etc/UTC", "America/Los_Angeles" in the <a
     * href="https://www.joda.org/joda-time/timezones.html">IANA timezone format</a>. If not specified this defaults to
     * UTC.
     * </p>
     * 
     * @return The timezone that applies to the scheduling expression. For example, "Etc/UTC", "America/Los_Angeles" in
     *         the <a href="https://www.joda.org/joda-time/timezones.html">IANA timezone format</a>. If not specified
     *         this defaults to UTC.
     */

    public String getTimezone() {
        return this.timezone;
    }

    /**
     * <p>
     * The timezone that applies to the scheduling expression. For example, "Etc/UTC", "America/Los_Angeles" in the <a
     * href="https://www.joda.org/joda-time/timezones.html">IANA timezone format</a>. If not specified this defaults to
     * UTC.
     * </p>
     * 
     * @param timezone
     *        The timezone that applies to the scheduling expression. For example, "Etc/UTC", "America/Los_Angeles" in
     *        the <a href="https://www.joda.org/joda-time/timezones.html">IANA timezone format</a>. If not specified
     *        this defaults to UTC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Schedule withTimezone(String timezone) {
        setTimezone(timezone);
        return this;
    }

    /**
     * <p>
     * The condition configures when the pipeline should trigger a new image build. When the
     * <code>pipelineExecutionStartCondition</code> is set to
     * <code>EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE</code>, and you use semantic version filters on the
     * source image or components in your image recipe, EC2 Image Builder will build a new image only when there are new
     * versions of the image or components in your recipe that match the semantic version filter. When it is set to
     * <code>EXPRESSION_MATCH_ONLY</code>, it will build a new image every time the CRON expression matches the current
     * time. For semantic version syntax, see <a
     * href="https://docs.aws.amazon.com/imagebuilder/latest/APIReference/API_CreateComponent.html">CreateComponent</a>
     * in the <i> EC2 Image Builder API Reference</i>.
     * </p>
     * 
     * @param pipelineExecutionStartCondition
     *        The condition configures when the pipeline should trigger a new image build. When the
     *        <code>pipelineExecutionStartCondition</code> is set to
     *        <code>EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE</code>, and you use semantic version filters on
     *        the source image or components in your image recipe, EC2 Image Builder will build a new image only when
     *        there are new versions of the image or components in your recipe that match the semantic version filter.
     *        When it is set to <code>EXPRESSION_MATCH_ONLY</code>, it will build a new image every time the CRON
     *        expression matches the current time. For semantic version syntax, see <a
     *        href="https://docs.aws.amazon.com/imagebuilder/latest/APIReference/API_CreateComponent.html"
     *        >CreateComponent</a> in the <i> EC2 Image Builder API Reference</i>.
     * @see PipelineExecutionStartCondition
     */

    public void setPipelineExecutionStartCondition(String pipelineExecutionStartCondition) {
        this.pipelineExecutionStartCondition = pipelineExecutionStartCondition;
    }

    /**
     * <p>
     * The condition configures when the pipeline should trigger a new image build. When the
     * <code>pipelineExecutionStartCondition</code> is set to
     * <code>EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE</code>, and you use semantic version filters on the
     * source image or components in your image recipe, EC2 Image Builder will build a new image only when there are new
     * versions of the image or components in your recipe that match the semantic version filter. When it is set to
     * <code>EXPRESSION_MATCH_ONLY</code>, it will build a new image every time the CRON expression matches the current
     * time. For semantic version syntax, see <a
     * href="https://docs.aws.amazon.com/imagebuilder/latest/APIReference/API_CreateComponent.html">CreateComponent</a>
     * in the <i> EC2 Image Builder API Reference</i>.
     * </p>
     * 
     * @return The condition configures when the pipeline should trigger a new image build. When the
     *         <code>pipelineExecutionStartCondition</code> is set to
     *         <code>EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE</code>, and you use semantic version filters on
     *         the source image or components in your image recipe, EC2 Image Builder will build a new image only when
     *         there are new versions of the image or components in your recipe that match the semantic version filter.
     *         When it is set to <code>EXPRESSION_MATCH_ONLY</code>, it will build a new image every time the CRON
     *         expression matches the current time. For semantic version syntax, see <a
     *         href="https://docs.aws.amazon.com/imagebuilder/latest/APIReference/API_CreateComponent.html"
     *         >CreateComponent</a> in the <i> EC2 Image Builder API Reference</i>.
     * @see PipelineExecutionStartCondition
     */

    public String getPipelineExecutionStartCondition() {
        return this.pipelineExecutionStartCondition;
    }

    /**
     * <p>
     * The condition configures when the pipeline should trigger a new image build. When the
     * <code>pipelineExecutionStartCondition</code> is set to
     * <code>EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE</code>, and you use semantic version filters on the
     * source image or components in your image recipe, EC2 Image Builder will build a new image only when there are new
     * versions of the image or components in your recipe that match the semantic version filter. When it is set to
     * <code>EXPRESSION_MATCH_ONLY</code>, it will build a new image every time the CRON expression matches the current
     * time. For semantic version syntax, see <a
     * href="https://docs.aws.amazon.com/imagebuilder/latest/APIReference/API_CreateComponent.html">CreateComponent</a>
     * in the <i> EC2 Image Builder API Reference</i>.
     * </p>
     * 
     * @param pipelineExecutionStartCondition
     *        The condition configures when the pipeline should trigger a new image build. When the
     *        <code>pipelineExecutionStartCondition</code> is set to
     *        <code>EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE</code>, and you use semantic version filters on
     *        the source image or components in your image recipe, EC2 Image Builder will build a new image only when
     *        there are new versions of the image or components in your recipe that match the semantic version filter.
     *        When it is set to <code>EXPRESSION_MATCH_ONLY</code>, it will build a new image every time the CRON
     *        expression matches the current time. For semantic version syntax, see <a
     *        href="https://docs.aws.amazon.com/imagebuilder/latest/APIReference/API_CreateComponent.html"
     *        >CreateComponent</a> in the <i> EC2 Image Builder API Reference</i>.
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
     * <code>EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE</code>, and you use semantic version filters on the
     * source image or components in your image recipe, EC2 Image Builder will build a new image only when there are new
     * versions of the image or components in your recipe that match the semantic version filter. When it is set to
     * <code>EXPRESSION_MATCH_ONLY</code>, it will build a new image every time the CRON expression matches the current
     * time. For semantic version syntax, see <a
     * href="https://docs.aws.amazon.com/imagebuilder/latest/APIReference/API_CreateComponent.html">CreateComponent</a>
     * in the <i> EC2 Image Builder API Reference</i>.
     * </p>
     * 
     * @param pipelineExecutionStartCondition
     *        The condition configures when the pipeline should trigger a new image build. When the
     *        <code>pipelineExecutionStartCondition</code> is set to
     *        <code>EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE</code>, and you use semantic version filters on
     *        the source image or components in your image recipe, EC2 Image Builder will build a new image only when
     *        there are new versions of the image or components in your recipe that match the semantic version filter.
     *        When it is set to <code>EXPRESSION_MATCH_ONLY</code>, it will build a new image every time the CRON
     *        expression matches the current time. For semantic version syntax, see <a
     *        href="https://docs.aws.amazon.com/imagebuilder/latest/APIReference/API_CreateComponent.html"
     *        >CreateComponent</a> in the <i> EC2 Image Builder API Reference</i>.
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
        if (getTimezone() != null)
            sb.append("Timezone: ").append(getTimezone()).append(",");
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
        if (other.getTimezone() == null ^ this.getTimezone() == null)
            return false;
        if (other.getTimezone() != null && other.getTimezone().equals(this.getTimezone()) == false)
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
        hashCode = prime * hashCode + ((getTimezone() == null) ? 0 : getTimezone().hashCode());
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
