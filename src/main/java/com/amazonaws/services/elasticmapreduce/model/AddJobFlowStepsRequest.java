/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elasticmapreduce.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticmapreduce.AmazonElasticMapReduce#addJobFlowSteps(AddJobFlowStepsRequest) AddJobFlowSteps operation}.
 * <p>
 * AddJobFlowSteps adds new steps to a running job flow. A maximum of
 * 256 steps are allowed in each job flow.
 * </p>
 * <p>
 * A step specifies the location of a JAR file stored either on the
 * master node of the job flow or in Amazon S3. Each step is performed by
 * the main function of the main class of the JAR file. The main class
 * can be specified either in the manifest of the JAR or by using the
 * MainFunction parameter of the step.
 * </p>
 * <p>
 * Elastic MapReduce executes each step in the order listed. For a step
 * to be considered complete, the main function must exit with a zero
 * exit code and all Hadoop jobs started while the step was running must
 * have completed and run successfully.
 * </p>
 * <p>
 * You can only add steps to a job flow that is in one of the following
 * states: STARTING, BOOTSTAPPING, RUNNING, or WAITING.
 * </p>
 *
 * @see com.amazonaws.services.elasticmapreduce.AmazonElasticMapReduce#addJobFlowSteps(AddJobFlowStepsRequest)
 */
public class AddJobFlowStepsRequest extends AmazonWebServiceRequest {

    /**
     * A string that uniquely identifies the job flow. This identifier is
     * returned by <a>RunJobFlow</a> and can also be obtained from
     * <a>DescribeJobFlows</a> .
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String jobFlowId;

    /**
     * A list of <a>StepConfig</a> to be executed by the job flow.
     */
    private java.util.List<StepConfig> steps;

    /**
     * Default constructor for a new AddJobFlowStepsRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public AddJobFlowStepsRequest() {}
    
    /**
     * Constructs a new AddJobFlowStepsRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param jobFlowId A string that uniquely identifies the job flow. This
     * identifier is returned by <a>RunJobFlow</a> and can also be obtained
     * from <a>DescribeJobFlows</a> .
     */
    public AddJobFlowStepsRequest(String jobFlowId) {
        this.jobFlowId = jobFlowId;
    }
    
    /**
     * Constructs a new AddJobFlowStepsRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param jobFlowId A string that uniquely identifies the job flow. This
     * identifier is returned by <a>RunJobFlow</a> and can also be obtained
     * from <a>DescribeJobFlows</a> .
     * @param steps A list of <a>StepConfig</a> to be executed by the job
     * flow.
     */
    public AddJobFlowStepsRequest(String jobFlowId, java.util.List<StepConfig> steps) {
        this.jobFlowId = jobFlowId;
        this.steps = steps;
    }
    
    /**
     * A string that uniquely identifies the job flow. This identifier is
     * returned by <a>RunJobFlow</a> and can also be obtained from
     * <a>DescribeJobFlows</a> .
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return A string that uniquely identifies the job flow. This identifier is
     *         returned by <a>RunJobFlow</a> and can also be obtained from
     *         <a>DescribeJobFlows</a> .
     */
    public String getJobFlowId() {
        return jobFlowId;
    }
    
    /**
     * A string that uniquely identifies the job flow. This identifier is
     * returned by <a>RunJobFlow</a> and can also be obtained from
     * <a>DescribeJobFlows</a> .
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param jobFlowId A string that uniquely identifies the job flow. This identifier is
     *         returned by <a>RunJobFlow</a> and can also be obtained from
     *         <a>DescribeJobFlows</a> .
     */
    public void setJobFlowId(String jobFlowId) {
        this.jobFlowId = jobFlowId;
    }
    
    /**
     * A string that uniquely identifies the job flow. This identifier is
     * returned by <a>RunJobFlow</a> and can also be obtained from
     * <a>DescribeJobFlows</a> .
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param jobFlowId A string that uniquely identifies the job flow. This identifier is
     *         returned by <a>RunJobFlow</a> and can also be obtained from
     *         <a>DescribeJobFlows</a> .
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AddJobFlowStepsRequest withJobFlowId(String jobFlowId) {
        this.jobFlowId = jobFlowId;
        return this;
    }
    
    
    /**
     * A list of <a>StepConfig</a> to be executed by the job flow.
     *
     * @return A list of <a>StepConfig</a> to be executed by the job flow.
     */
    public java.util.List<StepConfig> getSteps() {
        if (steps == null) {
            steps = new java.util.ArrayList<StepConfig>();
        }
        return steps;
    }
    
    /**
     * A list of <a>StepConfig</a> to be executed by the job flow.
     *
     * @param steps A list of <a>StepConfig</a> to be executed by the job flow.
     */
    public void setSteps(java.util.Collection<StepConfig> steps) {
        java.util.List<StepConfig> stepsCopy = new java.util.ArrayList<StepConfig>();
        if (steps != null) {
            stepsCopy.addAll(steps);
        }
        this.steps = stepsCopy;
    }
    
    /**
     * A list of <a>StepConfig</a> to be executed by the job flow.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param steps A list of <a>StepConfig</a> to be executed by the job flow.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AddJobFlowStepsRequest withSteps(StepConfig... steps) {
        for (StepConfig value : steps) {
            getSteps().add(value);
        }
        return this;
    }
    
    /**
     * A list of <a>StepConfig</a> to be executed by the job flow.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param steps A list of <a>StepConfig</a> to be executed by the job flow.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AddJobFlowStepsRequest withSteps(java.util.Collection<StepConfig> steps) {
        java.util.List<StepConfig> stepsCopy = new java.util.ArrayList<StepConfig>();
        if (steps != null) {
            stepsCopy.addAll(steps);
        }
        this.steps = stepsCopy;

        return this;
    }
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("JobFlowId: " + jobFlowId + ", ");
        sb.append("Steps: " + steps + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    