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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The input argument to the <a>AddJobFlowSteps</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/AddJobFlowSteps" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddJobFlowStepsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A string that uniquely identifies the job flow. This identifier is returned by <a>RunJobFlow</a> and can also be
     * obtained from <a>ListClusters</a>.
     * </p>
     */
    private String jobFlowId;
    /**
     * <p>
     * A list of <a>StepConfig</a> to be executed by the job flow.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<StepConfig> steps;

    /**
     * Default constructor for AddJobFlowStepsRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public AddJobFlowStepsRequest() {
    }

    /**
     * Constructs a new AddJobFlowStepsRequest object. Callers should use the setter or fluent setter (with...) methods
     * to initialize any additional object members.
     * 
     * @param jobFlowId
     *        A string that uniquely identifies the job flow. This identifier is returned by <a>RunJobFlow</a> and can
     *        also be obtained from <a>ListClusters</a>.
     */
    public AddJobFlowStepsRequest(String jobFlowId) {
        setJobFlowId(jobFlowId);
    }

    /**
     * Constructs a new AddJobFlowStepsRequest object. Callers should use the setter or fluent setter (with...) methods
     * to initialize any additional object members.
     * 
     * @param jobFlowId
     *        A string that uniquely identifies the job flow. This identifier is returned by <a>RunJobFlow</a> and can
     *        also be obtained from <a>ListClusters</a>.
     * @param steps
     *        A list of <a>StepConfig</a> to be executed by the job flow.
     */
    public AddJobFlowStepsRequest(String jobFlowId, java.util.List<StepConfig> steps) {
        setJobFlowId(jobFlowId);
        setSteps(steps);
    }

    /**
     * <p>
     * A string that uniquely identifies the job flow. This identifier is returned by <a>RunJobFlow</a> and can also be
     * obtained from <a>ListClusters</a>.
     * </p>
     * 
     * @param jobFlowId
     *        A string that uniquely identifies the job flow. This identifier is returned by <a>RunJobFlow</a> and can
     *        also be obtained from <a>ListClusters</a>.
     */

    public void setJobFlowId(String jobFlowId) {
        this.jobFlowId = jobFlowId;
    }

    /**
     * <p>
     * A string that uniquely identifies the job flow. This identifier is returned by <a>RunJobFlow</a> and can also be
     * obtained from <a>ListClusters</a>.
     * </p>
     * 
     * @return A string that uniquely identifies the job flow. This identifier is returned by <a>RunJobFlow</a> and can
     *         also be obtained from <a>ListClusters</a>.
     */

    public String getJobFlowId() {
        return this.jobFlowId;
    }

    /**
     * <p>
     * A string that uniquely identifies the job flow. This identifier is returned by <a>RunJobFlow</a> and can also be
     * obtained from <a>ListClusters</a>.
     * </p>
     * 
     * @param jobFlowId
     *        A string that uniquely identifies the job flow. This identifier is returned by <a>RunJobFlow</a> and can
     *        also be obtained from <a>ListClusters</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddJobFlowStepsRequest withJobFlowId(String jobFlowId) {
        setJobFlowId(jobFlowId);
        return this;
    }

    /**
     * <p>
     * A list of <a>StepConfig</a> to be executed by the job flow.
     * </p>
     * 
     * @return A list of <a>StepConfig</a> to be executed by the job flow.
     */

    public java.util.List<StepConfig> getSteps() {
        if (steps == null) {
            steps = new com.amazonaws.internal.SdkInternalList<StepConfig>();
        }
        return steps;
    }

    /**
     * <p>
     * A list of <a>StepConfig</a> to be executed by the job flow.
     * </p>
     * 
     * @param steps
     *        A list of <a>StepConfig</a> to be executed by the job flow.
     */

    public void setSteps(java.util.Collection<StepConfig> steps) {
        if (steps == null) {
            this.steps = null;
            return;
        }

        this.steps = new com.amazonaws.internal.SdkInternalList<StepConfig>(steps);
    }

    /**
     * <p>
     * A list of <a>StepConfig</a> to be executed by the job flow.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSteps(java.util.Collection)} or {@link #withSteps(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param steps
     *        A list of <a>StepConfig</a> to be executed by the job flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddJobFlowStepsRequest withSteps(StepConfig... steps) {
        if (this.steps == null) {
            setSteps(new com.amazonaws.internal.SdkInternalList<StepConfig>(steps.length));
        }
        for (StepConfig ele : steps) {
            this.steps.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <a>StepConfig</a> to be executed by the job flow.
     * </p>
     * 
     * @param steps
     *        A list of <a>StepConfig</a> to be executed by the job flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddJobFlowStepsRequest withSteps(java.util.Collection<StepConfig> steps) {
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
        if (getJobFlowId() != null)
            sb.append("JobFlowId: ").append(getJobFlowId()).append(",");
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

        if (obj instanceof AddJobFlowStepsRequest == false)
            return false;
        AddJobFlowStepsRequest other = (AddJobFlowStepsRequest) obj;
        if (other.getJobFlowId() == null ^ this.getJobFlowId() == null)
            return false;
        if (other.getJobFlowId() != null && other.getJobFlowId().equals(this.getJobFlowId()) == false)
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

        hashCode = prime * hashCode + ((getJobFlowId() == null) ? 0 : getJobFlowId().hashCode());
        hashCode = prime * hashCode + ((getSteps() == null) ? 0 : getSteps().hashCode());
        return hashCode;
    }

    @Override
    public AddJobFlowStepsRequest clone() {
        return (AddJobFlowStepsRequest) super.clone();
    }

}
