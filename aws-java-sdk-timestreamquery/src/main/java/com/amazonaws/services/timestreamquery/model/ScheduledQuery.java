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
package com.amazonaws.services.timestreamquery.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Scheduled Query
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/ScheduledQuery" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScheduledQuery implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the scheduled query.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The creation time of the scheduled query.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * State of scheduled query.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The last time the scheduled query was run.
     * </p>
     */
    private java.util.Date previousInvocationTime;
    /**
     * <p>
     * The next time the scheduled query is to be run.
     * </p>
     */
    private java.util.Date nextInvocationTime;
    /**
     * <p>
     * Configuration for scheduled query error reporting.
     * </p>
     */
    private ErrorReportConfiguration errorReportConfiguration;
    /**
     * <p>
     * Target data source where final scheduled query result will be written.
     * </p>
     */
    private TargetDestination targetDestination;
    /**
     * <p>
     * Status of the last scheduled query run.
     * </p>
     */
    private String lastRunStatus;

    /**
     * <p>
     * The Amazon Resource Name.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name.
     * </p>
     * 
     * @return The Amazon Resource Name.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledQuery withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the scheduled query.
     * </p>
     * 
     * @param name
     *        The name of the scheduled query.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the scheduled query.
     * </p>
     * 
     * @return The name of the scheduled query.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the scheduled query.
     * </p>
     * 
     * @param name
     *        The name of the scheduled query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledQuery withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The creation time of the scheduled query.
     * </p>
     * 
     * @param creationTime
     *        The creation time of the scheduled query.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The creation time of the scheduled query.
     * </p>
     * 
     * @return The creation time of the scheduled query.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The creation time of the scheduled query.
     * </p>
     * 
     * @param creationTime
     *        The creation time of the scheduled query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledQuery withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * State of scheduled query.
     * </p>
     * 
     * @param state
     *        State of scheduled query.
     * @see ScheduledQueryState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * State of scheduled query.
     * </p>
     * 
     * @return State of scheduled query.
     * @see ScheduledQueryState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * State of scheduled query.
     * </p>
     * 
     * @param state
     *        State of scheduled query.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScheduledQueryState
     */

    public ScheduledQuery withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * State of scheduled query.
     * </p>
     * 
     * @param state
     *        State of scheduled query.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScheduledQueryState
     */

    public ScheduledQuery withState(ScheduledQueryState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The last time the scheduled query was run.
     * </p>
     * 
     * @param previousInvocationTime
     *        The last time the scheduled query was run.
     */

    public void setPreviousInvocationTime(java.util.Date previousInvocationTime) {
        this.previousInvocationTime = previousInvocationTime;
    }

    /**
     * <p>
     * The last time the scheduled query was run.
     * </p>
     * 
     * @return The last time the scheduled query was run.
     */

    public java.util.Date getPreviousInvocationTime() {
        return this.previousInvocationTime;
    }

    /**
     * <p>
     * The last time the scheduled query was run.
     * </p>
     * 
     * @param previousInvocationTime
     *        The last time the scheduled query was run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledQuery withPreviousInvocationTime(java.util.Date previousInvocationTime) {
        setPreviousInvocationTime(previousInvocationTime);
        return this;
    }

    /**
     * <p>
     * The next time the scheduled query is to be run.
     * </p>
     * 
     * @param nextInvocationTime
     *        The next time the scheduled query is to be run.
     */

    public void setNextInvocationTime(java.util.Date nextInvocationTime) {
        this.nextInvocationTime = nextInvocationTime;
    }

    /**
     * <p>
     * The next time the scheduled query is to be run.
     * </p>
     * 
     * @return The next time the scheduled query is to be run.
     */

    public java.util.Date getNextInvocationTime() {
        return this.nextInvocationTime;
    }

    /**
     * <p>
     * The next time the scheduled query is to be run.
     * </p>
     * 
     * @param nextInvocationTime
     *        The next time the scheduled query is to be run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledQuery withNextInvocationTime(java.util.Date nextInvocationTime) {
        setNextInvocationTime(nextInvocationTime);
        return this;
    }

    /**
     * <p>
     * Configuration for scheduled query error reporting.
     * </p>
     * 
     * @param errorReportConfiguration
     *        Configuration for scheduled query error reporting.
     */

    public void setErrorReportConfiguration(ErrorReportConfiguration errorReportConfiguration) {
        this.errorReportConfiguration = errorReportConfiguration;
    }

    /**
     * <p>
     * Configuration for scheduled query error reporting.
     * </p>
     * 
     * @return Configuration for scheduled query error reporting.
     */

    public ErrorReportConfiguration getErrorReportConfiguration() {
        return this.errorReportConfiguration;
    }

    /**
     * <p>
     * Configuration for scheduled query error reporting.
     * </p>
     * 
     * @param errorReportConfiguration
     *        Configuration for scheduled query error reporting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledQuery withErrorReportConfiguration(ErrorReportConfiguration errorReportConfiguration) {
        setErrorReportConfiguration(errorReportConfiguration);
        return this;
    }

    /**
     * <p>
     * Target data source where final scheduled query result will be written.
     * </p>
     * 
     * @param targetDestination
     *        Target data source where final scheduled query result will be written.
     */

    public void setTargetDestination(TargetDestination targetDestination) {
        this.targetDestination = targetDestination;
    }

    /**
     * <p>
     * Target data source where final scheduled query result will be written.
     * </p>
     * 
     * @return Target data source where final scheduled query result will be written.
     */

    public TargetDestination getTargetDestination() {
        return this.targetDestination;
    }

    /**
     * <p>
     * Target data source where final scheduled query result will be written.
     * </p>
     * 
     * @param targetDestination
     *        Target data source where final scheduled query result will be written.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledQuery withTargetDestination(TargetDestination targetDestination) {
        setTargetDestination(targetDestination);
        return this;
    }

    /**
     * <p>
     * Status of the last scheduled query run.
     * </p>
     * 
     * @param lastRunStatus
     *        Status of the last scheduled query run.
     * @see ScheduledQueryRunStatus
     */

    public void setLastRunStatus(String lastRunStatus) {
        this.lastRunStatus = lastRunStatus;
    }

    /**
     * <p>
     * Status of the last scheduled query run.
     * </p>
     * 
     * @return Status of the last scheduled query run.
     * @see ScheduledQueryRunStatus
     */

    public String getLastRunStatus() {
        return this.lastRunStatus;
    }

    /**
     * <p>
     * Status of the last scheduled query run.
     * </p>
     * 
     * @param lastRunStatus
     *        Status of the last scheduled query run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScheduledQueryRunStatus
     */

    public ScheduledQuery withLastRunStatus(String lastRunStatus) {
        setLastRunStatus(lastRunStatus);
        return this;
    }

    /**
     * <p>
     * Status of the last scheduled query run.
     * </p>
     * 
     * @param lastRunStatus
     *        Status of the last scheduled query run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScheduledQueryRunStatus
     */

    public ScheduledQuery withLastRunStatus(ScheduledQueryRunStatus lastRunStatus) {
        this.lastRunStatus = lastRunStatus.toString();
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getPreviousInvocationTime() != null)
            sb.append("PreviousInvocationTime: ").append(getPreviousInvocationTime()).append(",");
        if (getNextInvocationTime() != null)
            sb.append("NextInvocationTime: ").append(getNextInvocationTime()).append(",");
        if (getErrorReportConfiguration() != null)
            sb.append("ErrorReportConfiguration: ").append(getErrorReportConfiguration()).append(",");
        if (getTargetDestination() != null)
            sb.append("TargetDestination: ").append(getTargetDestination()).append(",");
        if (getLastRunStatus() != null)
            sb.append("LastRunStatus: ").append(getLastRunStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScheduledQuery == false)
            return false;
        ScheduledQuery other = (ScheduledQuery) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getPreviousInvocationTime() == null ^ this.getPreviousInvocationTime() == null)
            return false;
        if (other.getPreviousInvocationTime() != null && other.getPreviousInvocationTime().equals(this.getPreviousInvocationTime()) == false)
            return false;
        if (other.getNextInvocationTime() == null ^ this.getNextInvocationTime() == null)
            return false;
        if (other.getNextInvocationTime() != null && other.getNextInvocationTime().equals(this.getNextInvocationTime()) == false)
            return false;
        if (other.getErrorReportConfiguration() == null ^ this.getErrorReportConfiguration() == null)
            return false;
        if (other.getErrorReportConfiguration() != null && other.getErrorReportConfiguration().equals(this.getErrorReportConfiguration()) == false)
            return false;
        if (other.getTargetDestination() == null ^ this.getTargetDestination() == null)
            return false;
        if (other.getTargetDestination() != null && other.getTargetDestination().equals(this.getTargetDestination()) == false)
            return false;
        if (other.getLastRunStatus() == null ^ this.getLastRunStatus() == null)
            return false;
        if (other.getLastRunStatus() != null && other.getLastRunStatus().equals(this.getLastRunStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getPreviousInvocationTime() == null) ? 0 : getPreviousInvocationTime().hashCode());
        hashCode = prime * hashCode + ((getNextInvocationTime() == null) ? 0 : getNextInvocationTime().hashCode());
        hashCode = prime * hashCode + ((getErrorReportConfiguration() == null) ? 0 : getErrorReportConfiguration().hashCode());
        hashCode = prime * hashCode + ((getTargetDestination() == null) ? 0 : getTargetDestination().hashCode());
        hashCode = prime * hashCode + ((getLastRunStatus() == null) ? 0 : getLastRunStatus().hashCode());
        return hashCode;
    }

    @Override
    public ScheduledQuery clone() {
        try {
            return (ScheduledQuery) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.timestreamquery.model.transform.ScheduledQueryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
