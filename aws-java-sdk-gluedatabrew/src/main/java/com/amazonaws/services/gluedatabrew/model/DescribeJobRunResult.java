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
package com.amazonaws.services.gluedatabrew.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/DescribeJobRun" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeJobRunResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The number of times that DataBrew has attempted to run the job.
     * </p>
     */
    private Integer attempt;
    /**
     * <p>
     * The date and time when the job completed processing.
     * </p>
     */
    private java.util.Date completedOn;
    /**
     * <p>
     * The name of the dataset for the job to process.
     * </p>
     */
    private String datasetName;
    /**
     * <p>
     * A message indicating an error (if any) that was encountered when the job ran.
     * </p>
     */
    private String errorMessage;
    /**
     * <p>
     * The amount of time, in seconds, during which a job run consumed resources.
     * </p>
     */
    private Integer executionTime;
    /**
     * <p>
     * The name of the job being processed during this run.
     * </p>
     */
    private String jobName;
    /**
     * <p>
     * The unique identifier of the job run.
     * </p>
     */
    private String runId;
    /**
     * <p>
     * The current state of the job run entity itself.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The current status of Amazon CloudWatch logging for the job run.
     * </p>
     */
    private String logSubscription;
    /**
     * <p>
     * The name of an Amazon CloudWatch log group, where the job writes diagnostic messages when it runs.
     * </p>
     */
    private String logGroupName;
    /**
     * <p>
     * One or more output artifacts from a job run.
     * </p>
     */
    private java.util.List<Output> outputs;

    private RecipeReference recipeReference;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who initiated the job run.
     * </p>
     */
    private String startedBy;
    /**
     * <p>
     * The date and time when the job run began.
     * </p>
     */
    private java.util.Date startedOn;

    /**
     * <p>
     * The number of times that DataBrew has attempted to run the job.
     * </p>
     * 
     * @param attempt
     *        The number of times that DataBrew has attempted to run the job.
     */

    public void setAttempt(Integer attempt) {
        this.attempt = attempt;
    }

    /**
     * <p>
     * The number of times that DataBrew has attempted to run the job.
     * </p>
     * 
     * @return The number of times that DataBrew has attempted to run the job.
     */

    public Integer getAttempt() {
        return this.attempt;
    }

    /**
     * <p>
     * The number of times that DataBrew has attempted to run the job.
     * </p>
     * 
     * @param attempt
     *        The number of times that DataBrew has attempted to run the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobRunResult withAttempt(Integer attempt) {
        setAttempt(attempt);
        return this;
    }

    /**
     * <p>
     * The date and time when the job completed processing.
     * </p>
     * 
     * @param completedOn
     *        The date and time when the job completed processing.
     */

    public void setCompletedOn(java.util.Date completedOn) {
        this.completedOn = completedOn;
    }

    /**
     * <p>
     * The date and time when the job completed processing.
     * </p>
     * 
     * @return The date and time when the job completed processing.
     */

    public java.util.Date getCompletedOn() {
        return this.completedOn;
    }

    /**
     * <p>
     * The date and time when the job completed processing.
     * </p>
     * 
     * @param completedOn
     *        The date and time when the job completed processing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobRunResult withCompletedOn(java.util.Date completedOn) {
        setCompletedOn(completedOn);
        return this;
    }

    /**
     * <p>
     * The name of the dataset for the job to process.
     * </p>
     * 
     * @param datasetName
     *        The name of the dataset for the job to process.
     */

    public void setDatasetName(String datasetName) {
        this.datasetName = datasetName;
    }

    /**
     * <p>
     * The name of the dataset for the job to process.
     * </p>
     * 
     * @return The name of the dataset for the job to process.
     */

    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * <p>
     * The name of the dataset for the job to process.
     * </p>
     * 
     * @param datasetName
     *        The name of the dataset for the job to process.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobRunResult withDatasetName(String datasetName) {
        setDatasetName(datasetName);
        return this;
    }

    /**
     * <p>
     * A message indicating an error (if any) that was encountered when the job ran.
     * </p>
     * 
     * @param errorMessage
     *        A message indicating an error (if any) that was encountered when the job ran.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * A message indicating an error (if any) that was encountered when the job ran.
     * </p>
     * 
     * @return A message indicating an error (if any) that was encountered when the job ran.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * A message indicating an error (if any) that was encountered when the job ran.
     * </p>
     * 
     * @param errorMessage
     *        A message indicating an error (if any) that was encountered when the job ran.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobRunResult withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * <p>
     * The amount of time, in seconds, during which a job run consumed resources.
     * </p>
     * 
     * @param executionTime
     *        The amount of time, in seconds, during which a job run consumed resources.
     */

    public void setExecutionTime(Integer executionTime) {
        this.executionTime = executionTime;
    }

    /**
     * <p>
     * The amount of time, in seconds, during which a job run consumed resources.
     * </p>
     * 
     * @return The amount of time, in seconds, during which a job run consumed resources.
     */

    public Integer getExecutionTime() {
        return this.executionTime;
    }

    /**
     * <p>
     * The amount of time, in seconds, during which a job run consumed resources.
     * </p>
     * 
     * @param executionTime
     *        The amount of time, in seconds, during which a job run consumed resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobRunResult withExecutionTime(Integer executionTime) {
        setExecutionTime(executionTime);
        return this;
    }

    /**
     * <p>
     * The name of the job being processed during this run.
     * </p>
     * 
     * @param jobName
     *        The name of the job being processed during this run.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The name of the job being processed during this run.
     * </p>
     * 
     * @return The name of the job being processed during this run.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * The name of the job being processed during this run.
     * </p>
     * 
     * @param jobName
     *        The name of the job being processed during this run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobRunResult withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the job run.
     * </p>
     * 
     * @param runId
     *        The unique identifier of the job run.
     */

    public void setRunId(String runId) {
        this.runId = runId;
    }

    /**
     * <p>
     * The unique identifier of the job run.
     * </p>
     * 
     * @return The unique identifier of the job run.
     */

    public String getRunId() {
        return this.runId;
    }

    /**
     * <p>
     * The unique identifier of the job run.
     * </p>
     * 
     * @param runId
     *        The unique identifier of the job run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobRunResult withRunId(String runId) {
        setRunId(runId);
        return this;
    }

    /**
     * <p>
     * The current state of the job run entity itself.
     * </p>
     * 
     * @param state
     *        The current state of the job run entity itself.
     * @see JobRunState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the job run entity itself.
     * </p>
     * 
     * @return The current state of the job run entity itself.
     * @see JobRunState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state of the job run entity itself.
     * </p>
     * 
     * @param state
     *        The current state of the job run entity itself.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobRunState
     */

    public DescribeJobRunResult withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current state of the job run entity itself.
     * </p>
     * 
     * @param state
     *        The current state of the job run entity itself.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobRunState
     */

    public DescribeJobRunResult withState(JobRunState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The current status of Amazon CloudWatch logging for the job run.
     * </p>
     * 
     * @param logSubscription
     *        The current status of Amazon CloudWatch logging for the job run.
     * @see LogSubscription
     */

    public void setLogSubscription(String logSubscription) {
        this.logSubscription = logSubscription;
    }

    /**
     * <p>
     * The current status of Amazon CloudWatch logging for the job run.
     * </p>
     * 
     * @return The current status of Amazon CloudWatch logging for the job run.
     * @see LogSubscription
     */

    public String getLogSubscription() {
        return this.logSubscription;
    }

    /**
     * <p>
     * The current status of Amazon CloudWatch logging for the job run.
     * </p>
     * 
     * @param logSubscription
     *        The current status of Amazon CloudWatch logging for the job run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogSubscription
     */

    public DescribeJobRunResult withLogSubscription(String logSubscription) {
        setLogSubscription(logSubscription);
        return this;
    }

    /**
     * <p>
     * The current status of Amazon CloudWatch logging for the job run.
     * </p>
     * 
     * @param logSubscription
     *        The current status of Amazon CloudWatch logging for the job run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogSubscription
     */

    public DescribeJobRunResult withLogSubscription(LogSubscription logSubscription) {
        this.logSubscription = logSubscription.toString();
        return this;
    }

    /**
     * <p>
     * The name of an Amazon CloudWatch log group, where the job writes diagnostic messages when it runs.
     * </p>
     * 
     * @param logGroupName
     *        The name of an Amazon CloudWatch log group, where the job writes diagnostic messages when it runs.
     */

    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    /**
     * <p>
     * The name of an Amazon CloudWatch log group, where the job writes diagnostic messages when it runs.
     * </p>
     * 
     * @return The name of an Amazon CloudWatch log group, where the job writes diagnostic messages when it runs.
     */

    public String getLogGroupName() {
        return this.logGroupName;
    }

    /**
     * <p>
     * The name of an Amazon CloudWatch log group, where the job writes diagnostic messages when it runs.
     * </p>
     * 
     * @param logGroupName
     *        The name of an Amazon CloudWatch log group, where the job writes diagnostic messages when it runs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobRunResult withLogGroupName(String logGroupName) {
        setLogGroupName(logGroupName);
        return this;
    }

    /**
     * <p>
     * One or more output artifacts from a job run.
     * </p>
     * 
     * @return One or more output artifacts from a job run.
     */

    public java.util.List<Output> getOutputs() {
        return outputs;
    }

    /**
     * <p>
     * One or more output artifacts from a job run.
     * </p>
     * 
     * @param outputs
     *        One or more output artifacts from a job run.
     */

    public void setOutputs(java.util.Collection<Output> outputs) {
        if (outputs == null) {
            this.outputs = null;
            return;
        }

        this.outputs = new java.util.ArrayList<Output>(outputs);
    }

    /**
     * <p>
     * One or more output artifacts from a job run.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutputs(java.util.Collection)} or {@link #withOutputs(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param outputs
     *        One or more output artifacts from a job run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobRunResult withOutputs(Output... outputs) {
        if (this.outputs == null) {
            setOutputs(new java.util.ArrayList<Output>(outputs.length));
        }
        for (Output ele : outputs) {
            this.outputs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more output artifacts from a job run.
     * </p>
     * 
     * @param outputs
     *        One or more output artifacts from a job run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobRunResult withOutputs(java.util.Collection<Output> outputs) {
        setOutputs(outputs);
        return this;
    }

    /**
     * @param recipeReference
     */

    public void setRecipeReference(RecipeReference recipeReference) {
        this.recipeReference = recipeReference;
    }

    /**
     * @return
     */

    public RecipeReference getRecipeReference() {
        return this.recipeReference;
    }

    /**
     * @param recipeReference
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobRunResult withRecipeReference(RecipeReference recipeReference) {
        setRecipeReference(recipeReference);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who initiated the job run.
     * </p>
     * 
     * @param startedBy
     *        The Amazon Resource Name (ARN) of the user who initiated the job run.
     */

    public void setStartedBy(String startedBy) {
        this.startedBy = startedBy;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who initiated the job run.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the user who initiated the job run.
     */

    public String getStartedBy() {
        return this.startedBy;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who initiated the job run.
     * </p>
     * 
     * @param startedBy
     *        The Amazon Resource Name (ARN) of the user who initiated the job run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobRunResult withStartedBy(String startedBy) {
        setStartedBy(startedBy);
        return this;
    }

    /**
     * <p>
     * The date and time when the job run began.
     * </p>
     * 
     * @param startedOn
     *        The date and time when the job run began.
     */

    public void setStartedOn(java.util.Date startedOn) {
        this.startedOn = startedOn;
    }

    /**
     * <p>
     * The date and time when the job run began.
     * </p>
     * 
     * @return The date and time when the job run began.
     */

    public java.util.Date getStartedOn() {
        return this.startedOn;
    }

    /**
     * <p>
     * The date and time when the job run began.
     * </p>
     * 
     * @param startedOn
     *        The date and time when the job run began.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobRunResult withStartedOn(java.util.Date startedOn) {
        setStartedOn(startedOn);
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
        if (getAttempt() != null)
            sb.append("Attempt: ").append(getAttempt()).append(",");
        if (getCompletedOn() != null)
            sb.append("CompletedOn: ").append(getCompletedOn()).append(",");
        if (getDatasetName() != null)
            sb.append("DatasetName: ").append(getDatasetName()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage()).append(",");
        if (getExecutionTime() != null)
            sb.append("ExecutionTime: ").append(getExecutionTime()).append(",");
        if (getJobName() != null)
            sb.append("JobName: ").append(getJobName()).append(",");
        if (getRunId() != null)
            sb.append("RunId: ").append(getRunId()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getLogSubscription() != null)
            sb.append("LogSubscription: ").append(getLogSubscription()).append(",");
        if (getLogGroupName() != null)
            sb.append("LogGroupName: ").append(getLogGroupName()).append(",");
        if (getOutputs() != null)
            sb.append("Outputs: ").append(getOutputs()).append(",");
        if (getRecipeReference() != null)
            sb.append("RecipeReference: ").append(getRecipeReference()).append(",");
        if (getStartedBy() != null)
            sb.append("StartedBy: ").append(getStartedBy()).append(",");
        if (getStartedOn() != null)
            sb.append("StartedOn: ").append(getStartedOn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeJobRunResult == false)
            return false;
        DescribeJobRunResult other = (DescribeJobRunResult) obj;
        if (other.getAttempt() == null ^ this.getAttempt() == null)
            return false;
        if (other.getAttempt() != null && other.getAttempt().equals(this.getAttempt()) == false)
            return false;
        if (other.getCompletedOn() == null ^ this.getCompletedOn() == null)
            return false;
        if (other.getCompletedOn() != null && other.getCompletedOn().equals(this.getCompletedOn()) == false)
            return false;
        if (other.getDatasetName() == null ^ this.getDatasetName() == null)
            return false;
        if (other.getDatasetName() != null && other.getDatasetName().equals(this.getDatasetName()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getExecutionTime() == null ^ this.getExecutionTime() == null)
            return false;
        if (other.getExecutionTime() != null && other.getExecutionTime().equals(this.getExecutionTime()) == false)
            return false;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getRunId() == null ^ this.getRunId() == null)
            return false;
        if (other.getRunId() != null && other.getRunId().equals(this.getRunId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getLogSubscription() == null ^ this.getLogSubscription() == null)
            return false;
        if (other.getLogSubscription() != null && other.getLogSubscription().equals(this.getLogSubscription()) == false)
            return false;
        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null)
            return false;
        if (other.getLogGroupName() != null && other.getLogGroupName().equals(this.getLogGroupName()) == false)
            return false;
        if (other.getOutputs() == null ^ this.getOutputs() == null)
            return false;
        if (other.getOutputs() != null && other.getOutputs().equals(this.getOutputs()) == false)
            return false;
        if (other.getRecipeReference() == null ^ this.getRecipeReference() == null)
            return false;
        if (other.getRecipeReference() != null && other.getRecipeReference().equals(this.getRecipeReference()) == false)
            return false;
        if (other.getStartedBy() == null ^ this.getStartedBy() == null)
            return false;
        if (other.getStartedBy() != null && other.getStartedBy().equals(this.getStartedBy()) == false)
            return false;
        if (other.getStartedOn() == null ^ this.getStartedOn() == null)
            return false;
        if (other.getStartedOn() != null && other.getStartedOn().equals(this.getStartedOn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttempt() == null) ? 0 : getAttempt().hashCode());
        hashCode = prime * hashCode + ((getCompletedOn() == null) ? 0 : getCompletedOn().hashCode());
        hashCode = prime * hashCode + ((getDatasetName() == null) ? 0 : getDatasetName().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getExecutionTime() == null) ? 0 : getExecutionTime().hashCode());
        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getRunId() == null) ? 0 : getRunId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getLogSubscription() == null) ? 0 : getLogSubscription().hashCode());
        hashCode = prime * hashCode + ((getLogGroupName() == null) ? 0 : getLogGroupName().hashCode());
        hashCode = prime * hashCode + ((getOutputs() == null) ? 0 : getOutputs().hashCode());
        hashCode = prime * hashCode + ((getRecipeReference() == null) ? 0 : getRecipeReference().hashCode());
        hashCode = prime * hashCode + ((getStartedBy() == null) ? 0 : getStartedBy().hashCode());
        hashCode = prime * hashCode + ((getStartedOn() == null) ? 0 : getStartedOn().hashCode());
        return hashCode;
    }

    @Override
    public DescribeJobRunResult clone() {
        try {
            return (DescribeJobRunResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
