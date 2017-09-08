/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/Condition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Condition implements Serializable, Cloneable, StructuredPojo {

    private String logicalOperator;

    private String jobName;

    private String state;

    /**
     * @param logicalOperator
     * @see LogicalOperator
     */

    public void setLogicalOperator(String logicalOperator) {
        this.logicalOperator = logicalOperator;
    }

    /**
     * @return
     * @see LogicalOperator
     */

    @com.fasterxml.jackson.annotation.JsonProperty("logicalOperator")
    public String getLogicalOperator() {
        return this.logicalOperator;
    }

    /**
     * @param logicalOperator
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogicalOperator
     */

    public Condition withLogicalOperator(String logicalOperator) {
        setLogicalOperator(logicalOperator);
        return this;
    }

    /**
     * @param logicalOperator
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogicalOperator
     */

    public Condition withLogicalOperator(LogicalOperator logicalOperator) {
        this.logicalOperator = logicalOperator.toString();
        return this;
    }

    /**
     * @param jobName
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * @return
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * @param jobName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Condition withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * @param state
     * @see JobRunState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return
     * @see JobRunState
     */

    @com.fasterxml.jackson.annotation.JsonProperty("state")
    public String getState() {
        return this.state;
    }

    /**
     * @param state
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobRunState
     */

    public Condition withState(String state) {
        setState(state);
        return this;
    }

    /**
     * @param state
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobRunState
     */

    public Condition withState(JobRunState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getLogicalOperator() != null)
            sb.append("LogicalOperator: ").append(getLogicalOperator()).append(",");
        if (getJobName() != null)
            sb.append("JobName: ").append(getJobName()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Condition == false)
            return false;
        Condition other = (Condition) obj;
        if (other.getLogicalOperator() == null ^ this.getLogicalOperator() == null)
            return false;
        if (other.getLogicalOperator() != null && other.getLogicalOperator().equals(this.getLogicalOperator()) == false)
            return false;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogicalOperator() == null) ? 0 : getLogicalOperator().hashCode());
        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public Condition clone() {
        try {
            return (Condition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.ConditionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
