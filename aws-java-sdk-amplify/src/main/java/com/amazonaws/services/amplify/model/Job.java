/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.amplify.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Structure for an execution job for an Amplify App.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/Job" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Job implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Summary for an execution job for an Amplify App.
     * </p>
     */
    private JobSummary summary;
    /**
     * <p>
     * Execution steps for an execution job, for an Amplify App.
     * </p>
     */
    private java.util.List<Step> steps;

    /**
     * <p>
     * Summary for an execution job for an Amplify App.
     * </p>
     * 
     * @param summary
     *        Summary for an execution job for an Amplify App.
     */

    public void setSummary(JobSummary summary) {
        this.summary = summary;
    }

    /**
     * <p>
     * Summary for an execution job for an Amplify App.
     * </p>
     * 
     * @return Summary for an execution job for an Amplify App.
     */

    public JobSummary getSummary() {
        return this.summary;
    }

    /**
     * <p>
     * Summary for an execution job for an Amplify App.
     * </p>
     * 
     * @param summary
     *        Summary for an execution job for an Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withSummary(JobSummary summary) {
        setSummary(summary);
        return this;
    }

    /**
     * <p>
     * Execution steps for an execution job, for an Amplify App.
     * </p>
     * 
     * @return Execution steps for an execution job, for an Amplify App.
     */

    public java.util.List<Step> getSteps() {
        return steps;
    }

    /**
     * <p>
     * Execution steps for an execution job, for an Amplify App.
     * </p>
     * 
     * @param steps
     *        Execution steps for an execution job, for an Amplify App.
     */

    public void setSteps(java.util.Collection<Step> steps) {
        if (steps == null) {
            this.steps = null;
            return;
        }

        this.steps = new java.util.ArrayList<Step>(steps);
    }

    /**
     * <p>
     * Execution steps for an execution job, for an Amplify App.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSteps(java.util.Collection)} or {@link #withSteps(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param steps
     *        Execution steps for an execution job, for an Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withSteps(Step... steps) {
        if (this.steps == null) {
            setSteps(new java.util.ArrayList<Step>(steps.length));
        }
        for (Step ele : steps) {
            this.steps.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Execution steps for an execution job, for an Amplify App.
     * </p>
     * 
     * @param steps
     *        Execution steps for an execution job, for an Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withSteps(java.util.Collection<Step> steps) {
        setSteps(steps);
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
        if (getSummary() != null)
            sb.append("Summary: ").append(getSummary()).append(",");
        if (getSteps() != null)
            sb.append("Steps: ").append(getSteps());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Job == false)
            return false;
        Job other = (Job) obj;
        if (other.getSummary() == null ^ this.getSummary() == null)
            return false;
        if (other.getSummary() != null && other.getSummary().equals(this.getSummary()) == false)
            return false;
        if (other.getSteps() == null ^ this.getSteps() == null)
            return false;
        if (other.getSteps() != null && other.getSteps().equals(this.getSteps()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSummary() == null) ? 0 : getSummary().hashCode());
        hashCode = prime * hashCode + ((getSteps() == null) ? 0 : getSteps().hashCode());
        return hashCode;
    }

    @Override
    public Job clone() {
        try {
            return (Job) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplify.model.transform.JobMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
