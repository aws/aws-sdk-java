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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetDataQualityRulesetEvaluationRun"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDataQualityRulesetEvaluationRunResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The unique run identifier associated with this run.
     * </p>
     */
    private String runId;
    /**
     * <p>
     * The data source (an Glue table) associated with this evaluation run.
     * </p>
     */
    private DataSource dataSource;
    /**
     * <p>
     * An IAM role supplied to encrypt the results of the run.
     * </p>
     */
    private String role;
    /**
     * <p>
     * The number of <code>G.1X</code> workers to be used in the run. The default is 5.
     * </p>
     */
    private Integer numberOfWorkers;
    /**
     * <p>
     * The timeout for a run in minutes. This is the maximum time that a run can consume resources before it is
     * terminated and enters <code>TIMEOUT</code> status. The default is 2,880 minutes (48 hours).
     * </p>
     */
    private Integer timeout;
    /**
     * <p>
     * Additional run options you can specify for an evaluation run.
     * </p>
     */
    private DataQualityEvaluationRunAdditionalRunOptions additionalRunOptions;
    /**
     * <p>
     * The status for this run.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The error strings that are associated with the run.
     * </p>
     */
    private String errorString;
    /**
     * <p>
     * The date and time when this run started.
     * </p>
     */
    private java.util.Date startedOn;
    /**
     * <p>
     * A timestamp. The last point in time when this data quality rule recommendation run was modified.
     * </p>
     */
    private java.util.Date lastModifiedOn;
    /**
     * <p>
     * The date and time when this run was completed.
     * </p>
     */
    private java.util.Date completedOn;
    /**
     * <p>
     * The amount of time (in seconds) that the run consumed resources.
     * </p>
     */
    private Integer executionTime;
    /**
     * <p>
     * A list of ruleset names for the run.
     * </p>
     */
    private java.util.List<String> rulesetNames;
    /**
     * <p>
     * A list of result IDs for the data quality results for the run.
     * </p>
     */
    private java.util.List<String> resultIds;

    /**
     * <p>
     * The unique run identifier associated with this run.
     * </p>
     * 
     * @param runId
     *        The unique run identifier associated with this run.
     */

    public void setRunId(String runId) {
        this.runId = runId;
    }

    /**
     * <p>
     * The unique run identifier associated with this run.
     * </p>
     * 
     * @return The unique run identifier associated with this run.
     */

    public String getRunId() {
        return this.runId;
    }

    /**
     * <p>
     * The unique run identifier associated with this run.
     * </p>
     * 
     * @param runId
     *        The unique run identifier associated with this run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataQualityRulesetEvaluationRunResult withRunId(String runId) {
        setRunId(runId);
        return this;
    }

    /**
     * <p>
     * The data source (an Glue table) associated with this evaluation run.
     * </p>
     * 
     * @param dataSource
     *        The data source (an Glue table) associated with this evaluation run.
     */

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * <p>
     * The data source (an Glue table) associated with this evaluation run.
     * </p>
     * 
     * @return The data source (an Glue table) associated with this evaluation run.
     */

    public DataSource getDataSource() {
        return this.dataSource;
    }

    /**
     * <p>
     * The data source (an Glue table) associated with this evaluation run.
     * </p>
     * 
     * @param dataSource
     *        The data source (an Glue table) associated with this evaluation run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataQualityRulesetEvaluationRunResult withDataSource(DataSource dataSource) {
        setDataSource(dataSource);
        return this;
    }

    /**
     * <p>
     * An IAM role supplied to encrypt the results of the run.
     * </p>
     * 
     * @param role
     *        An IAM role supplied to encrypt the results of the run.
     */

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * An IAM role supplied to encrypt the results of the run.
     * </p>
     * 
     * @return An IAM role supplied to encrypt the results of the run.
     */

    public String getRole() {
        return this.role;
    }

    /**
     * <p>
     * An IAM role supplied to encrypt the results of the run.
     * </p>
     * 
     * @param role
     *        An IAM role supplied to encrypt the results of the run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataQualityRulesetEvaluationRunResult withRole(String role) {
        setRole(role);
        return this;
    }

    /**
     * <p>
     * The number of <code>G.1X</code> workers to be used in the run. The default is 5.
     * </p>
     * 
     * @param numberOfWorkers
     *        The number of <code>G.1X</code> workers to be used in the run. The default is 5.
     */

    public void setNumberOfWorkers(Integer numberOfWorkers) {
        this.numberOfWorkers = numberOfWorkers;
    }

    /**
     * <p>
     * The number of <code>G.1X</code> workers to be used in the run. The default is 5.
     * </p>
     * 
     * @return The number of <code>G.1X</code> workers to be used in the run. The default is 5.
     */

    public Integer getNumberOfWorkers() {
        return this.numberOfWorkers;
    }

    /**
     * <p>
     * The number of <code>G.1X</code> workers to be used in the run. The default is 5.
     * </p>
     * 
     * @param numberOfWorkers
     *        The number of <code>G.1X</code> workers to be used in the run. The default is 5.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataQualityRulesetEvaluationRunResult withNumberOfWorkers(Integer numberOfWorkers) {
        setNumberOfWorkers(numberOfWorkers);
        return this;
    }

    /**
     * <p>
     * The timeout for a run in minutes. This is the maximum time that a run can consume resources before it is
     * terminated and enters <code>TIMEOUT</code> status. The default is 2,880 minutes (48 hours).
     * </p>
     * 
     * @param timeout
     *        The timeout for a run in minutes. This is the maximum time that a run can consume resources before it is
     *        terminated and enters <code>TIMEOUT</code> status. The default is 2,880 minutes (48 hours).
     */

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    /**
     * <p>
     * The timeout for a run in minutes. This is the maximum time that a run can consume resources before it is
     * terminated and enters <code>TIMEOUT</code> status. The default is 2,880 minutes (48 hours).
     * </p>
     * 
     * @return The timeout for a run in minutes. This is the maximum time that a run can consume resources before it is
     *         terminated and enters <code>TIMEOUT</code> status. The default is 2,880 minutes (48 hours).
     */

    public Integer getTimeout() {
        return this.timeout;
    }

    /**
     * <p>
     * The timeout for a run in minutes. This is the maximum time that a run can consume resources before it is
     * terminated and enters <code>TIMEOUT</code> status. The default is 2,880 minutes (48 hours).
     * </p>
     * 
     * @param timeout
     *        The timeout for a run in minutes. This is the maximum time that a run can consume resources before it is
     *        terminated and enters <code>TIMEOUT</code> status. The default is 2,880 minutes (48 hours).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataQualityRulesetEvaluationRunResult withTimeout(Integer timeout) {
        setTimeout(timeout);
        return this;
    }

    /**
     * <p>
     * Additional run options you can specify for an evaluation run.
     * </p>
     * 
     * @param additionalRunOptions
     *        Additional run options you can specify for an evaluation run.
     */

    public void setAdditionalRunOptions(DataQualityEvaluationRunAdditionalRunOptions additionalRunOptions) {
        this.additionalRunOptions = additionalRunOptions;
    }

    /**
     * <p>
     * Additional run options you can specify for an evaluation run.
     * </p>
     * 
     * @return Additional run options you can specify for an evaluation run.
     */

    public DataQualityEvaluationRunAdditionalRunOptions getAdditionalRunOptions() {
        return this.additionalRunOptions;
    }

    /**
     * <p>
     * Additional run options you can specify for an evaluation run.
     * </p>
     * 
     * @param additionalRunOptions
     *        Additional run options you can specify for an evaluation run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataQualityRulesetEvaluationRunResult withAdditionalRunOptions(DataQualityEvaluationRunAdditionalRunOptions additionalRunOptions) {
        setAdditionalRunOptions(additionalRunOptions);
        return this;
    }

    /**
     * <p>
     * The status for this run.
     * </p>
     * 
     * @param status
     *        The status for this run.
     * @see TaskStatusType
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status for this run.
     * </p>
     * 
     * @return The status for this run.
     * @see TaskStatusType
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status for this run.
     * </p>
     * 
     * @param status
     *        The status for this run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskStatusType
     */

    public GetDataQualityRulesetEvaluationRunResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status for this run.
     * </p>
     * 
     * @param status
     *        The status for this run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskStatusType
     */

    public GetDataQualityRulesetEvaluationRunResult withStatus(TaskStatusType status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The error strings that are associated with the run.
     * </p>
     * 
     * @param errorString
     *        The error strings that are associated with the run.
     */

    public void setErrorString(String errorString) {
        this.errorString = errorString;
    }

    /**
     * <p>
     * The error strings that are associated with the run.
     * </p>
     * 
     * @return The error strings that are associated with the run.
     */

    public String getErrorString() {
        return this.errorString;
    }

    /**
     * <p>
     * The error strings that are associated with the run.
     * </p>
     * 
     * @param errorString
     *        The error strings that are associated with the run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataQualityRulesetEvaluationRunResult withErrorString(String errorString) {
        setErrorString(errorString);
        return this;
    }

    /**
     * <p>
     * The date and time when this run started.
     * </p>
     * 
     * @param startedOn
     *        The date and time when this run started.
     */

    public void setStartedOn(java.util.Date startedOn) {
        this.startedOn = startedOn;
    }

    /**
     * <p>
     * The date and time when this run started.
     * </p>
     * 
     * @return The date and time when this run started.
     */

    public java.util.Date getStartedOn() {
        return this.startedOn;
    }

    /**
     * <p>
     * The date and time when this run started.
     * </p>
     * 
     * @param startedOn
     *        The date and time when this run started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataQualityRulesetEvaluationRunResult withStartedOn(java.util.Date startedOn) {
        setStartedOn(startedOn);
        return this;
    }

    /**
     * <p>
     * A timestamp. The last point in time when this data quality rule recommendation run was modified.
     * </p>
     * 
     * @param lastModifiedOn
     *        A timestamp. The last point in time when this data quality rule recommendation run was modified.
     */

    public void setLastModifiedOn(java.util.Date lastModifiedOn) {
        this.lastModifiedOn = lastModifiedOn;
    }

    /**
     * <p>
     * A timestamp. The last point in time when this data quality rule recommendation run was modified.
     * </p>
     * 
     * @return A timestamp. The last point in time when this data quality rule recommendation run was modified.
     */

    public java.util.Date getLastModifiedOn() {
        return this.lastModifiedOn;
    }

    /**
     * <p>
     * A timestamp. The last point in time when this data quality rule recommendation run was modified.
     * </p>
     * 
     * @param lastModifiedOn
     *        A timestamp. The last point in time when this data quality rule recommendation run was modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataQualityRulesetEvaluationRunResult withLastModifiedOn(java.util.Date lastModifiedOn) {
        setLastModifiedOn(lastModifiedOn);
        return this;
    }

    /**
     * <p>
     * The date and time when this run was completed.
     * </p>
     * 
     * @param completedOn
     *        The date and time when this run was completed.
     */

    public void setCompletedOn(java.util.Date completedOn) {
        this.completedOn = completedOn;
    }

    /**
     * <p>
     * The date and time when this run was completed.
     * </p>
     * 
     * @return The date and time when this run was completed.
     */

    public java.util.Date getCompletedOn() {
        return this.completedOn;
    }

    /**
     * <p>
     * The date and time when this run was completed.
     * </p>
     * 
     * @param completedOn
     *        The date and time when this run was completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataQualityRulesetEvaluationRunResult withCompletedOn(java.util.Date completedOn) {
        setCompletedOn(completedOn);
        return this;
    }

    /**
     * <p>
     * The amount of time (in seconds) that the run consumed resources.
     * </p>
     * 
     * @param executionTime
     *        The amount of time (in seconds) that the run consumed resources.
     */

    public void setExecutionTime(Integer executionTime) {
        this.executionTime = executionTime;
    }

    /**
     * <p>
     * The amount of time (in seconds) that the run consumed resources.
     * </p>
     * 
     * @return The amount of time (in seconds) that the run consumed resources.
     */

    public Integer getExecutionTime() {
        return this.executionTime;
    }

    /**
     * <p>
     * The amount of time (in seconds) that the run consumed resources.
     * </p>
     * 
     * @param executionTime
     *        The amount of time (in seconds) that the run consumed resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataQualityRulesetEvaluationRunResult withExecutionTime(Integer executionTime) {
        setExecutionTime(executionTime);
        return this;
    }

    /**
     * <p>
     * A list of ruleset names for the run.
     * </p>
     * 
     * @return A list of ruleset names for the run.
     */

    public java.util.List<String> getRulesetNames() {
        return rulesetNames;
    }

    /**
     * <p>
     * A list of ruleset names for the run.
     * </p>
     * 
     * @param rulesetNames
     *        A list of ruleset names for the run.
     */

    public void setRulesetNames(java.util.Collection<String> rulesetNames) {
        if (rulesetNames == null) {
            this.rulesetNames = null;
            return;
        }

        this.rulesetNames = new java.util.ArrayList<String>(rulesetNames);
    }

    /**
     * <p>
     * A list of ruleset names for the run.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRulesetNames(java.util.Collection)} or {@link #withRulesetNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param rulesetNames
     *        A list of ruleset names for the run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataQualityRulesetEvaluationRunResult withRulesetNames(String... rulesetNames) {
        if (this.rulesetNames == null) {
            setRulesetNames(new java.util.ArrayList<String>(rulesetNames.length));
        }
        for (String ele : rulesetNames) {
            this.rulesetNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of ruleset names for the run.
     * </p>
     * 
     * @param rulesetNames
     *        A list of ruleset names for the run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataQualityRulesetEvaluationRunResult withRulesetNames(java.util.Collection<String> rulesetNames) {
        setRulesetNames(rulesetNames);
        return this;
    }

    /**
     * <p>
     * A list of result IDs for the data quality results for the run.
     * </p>
     * 
     * @return A list of result IDs for the data quality results for the run.
     */

    public java.util.List<String> getResultIds() {
        return resultIds;
    }

    /**
     * <p>
     * A list of result IDs for the data quality results for the run.
     * </p>
     * 
     * @param resultIds
     *        A list of result IDs for the data quality results for the run.
     */

    public void setResultIds(java.util.Collection<String> resultIds) {
        if (resultIds == null) {
            this.resultIds = null;
            return;
        }

        this.resultIds = new java.util.ArrayList<String>(resultIds);
    }

    /**
     * <p>
     * A list of result IDs for the data quality results for the run.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResultIds(java.util.Collection)} or {@link #withResultIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resultIds
     *        A list of result IDs for the data quality results for the run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataQualityRulesetEvaluationRunResult withResultIds(String... resultIds) {
        if (this.resultIds == null) {
            setResultIds(new java.util.ArrayList<String>(resultIds.length));
        }
        for (String ele : resultIds) {
            this.resultIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of result IDs for the data quality results for the run.
     * </p>
     * 
     * @param resultIds
     *        A list of result IDs for the data quality results for the run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataQualityRulesetEvaluationRunResult withResultIds(java.util.Collection<String> resultIds) {
        setResultIds(resultIds);
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
        if (getRunId() != null)
            sb.append("RunId: ").append(getRunId()).append(",");
        if (getDataSource() != null)
            sb.append("DataSource: ").append(getDataSource()).append(",");
        if (getRole() != null)
            sb.append("Role: ").append(getRole()).append(",");
        if (getNumberOfWorkers() != null)
            sb.append("NumberOfWorkers: ").append(getNumberOfWorkers()).append(",");
        if (getTimeout() != null)
            sb.append("Timeout: ").append(getTimeout()).append(",");
        if (getAdditionalRunOptions() != null)
            sb.append("AdditionalRunOptions: ").append(getAdditionalRunOptions()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getErrorString() != null)
            sb.append("ErrorString: ").append(getErrorString()).append(",");
        if (getStartedOn() != null)
            sb.append("StartedOn: ").append(getStartedOn()).append(",");
        if (getLastModifiedOn() != null)
            sb.append("LastModifiedOn: ").append(getLastModifiedOn()).append(",");
        if (getCompletedOn() != null)
            sb.append("CompletedOn: ").append(getCompletedOn()).append(",");
        if (getExecutionTime() != null)
            sb.append("ExecutionTime: ").append(getExecutionTime()).append(",");
        if (getRulesetNames() != null)
            sb.append("RulesetNames: ").append(getRulesetNames()).append(",");
        if (getResultIds() != null)
            sb.append("ResultIds: ").append(getResultIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDataQualityRulesetEvaluationRunResult == false)
            return false;
        GetDataQualityRulesetEvaluationRunResult other = (GetDataQualityRulesetEvaluationRunResult) obj;
        if (other.getRunId() == null ^ this.getRunId() == null)
            return false;
        if (other.getRunId() != null && other.getRunId().equals(this.getRunId()) == false)
            return false;
        if (other.getDataSource() == null ^ this.getDataSource() == null)
            return false;
        if (other.getDataSource() != null && other.getDataSource().equals(this.getDataSource()) == false)
            return false;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        if (other.getNumberOfWorkers() == null ^ this.getNumberOfWorkers() == null)
            return false;
        if (other.getNumberOfWorkers() != null && other.getNumberOfWorkers().equals(this.getNumberOfWorkers()) == false)
            return false;
        if (other.getTimeout() == null ^ this.getTimeout() == null)
            return false;
        if (other.getTimeout() != null && other.getTimeout().equals(this.getTimeout()) == false)
            return false;
        if (other.getAdditionalRunOptions() == null ^ this.getAdditionalRunOptions() == null)
            return false;
        if (other.getAdditionalRunOptions() != null && other.getAdditionalRunOptions().equals(this.getAdditionalRunOptions()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getErrorString() == null ^ this.getErrorString() == null)
            return false;
        if (other.getErrorString() != null && other.getErrorString().equals(this.getErrorString()) == false)
            return false;
        if (other.getStartedOn() == null ^ this.getStartedOn() == null)
            return false;
        if (other.getStartedOn() != null && other.getStartedOn().equals(this.getStartedOn()) == false)
            return false;
        if (other.getLastModifiedOn() == null ^ this.getLastModifiedOn() == null)
            return false;
        if (other.getLastModifiedOn() != null && other.getLastModifiedOn().equals(this.getLastModifiedOn()) == false)
            return false;
        if (other.getCompletedOn() == null ^ this.getCompletedOn() == null)
            return false;
        if (other.getCompletedOn() != null && other.getCompletedOn().equals(this.getCompletedOn()) == false)
            return false;
        if (other.getExecutionTime() == null ^ this.getExecutionTime() == null)
            return false;
        if (other.getExecutionTime() != null && other.getExecutionTime().equals(this.getExecutionTime()) == false)
            return false;
        if (other.getRulesetNames() == null ^ this.getRulesetNames() == null)
            return false;
        if (other.getRulesetNames() != null && other.getRulesetNames().equals(this.getRulesetNames()) == false)
            return false;
        if (other.getResultIds() == null ^ this.getResultIds() == null)
            return false;
        if (other.getResultIds() != null && other.getResultIds().equals(this.getResultIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRunId() == null) ? 0 : getRunId().hashCode());
        hashCode = prime * hashCode + ((getDataSource() == null) ? 0 : getDataSource().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime * hashCode + ((getNumberOfWorkers() == null) ? 0 : getNumberOfWorkers().hashCode());
        hashCode = prime * hashCode + ((getTimeout() == null) ? 0 : getTimeout().hashCode());
        hashCode = prime * hashCode + ((getAdditionalRunOptions() == null) ? 0 : getAdditionalRunOptions().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getErrorString() == null) ? 0 : getErrorString().hashCode());
        hashCode = prime * hashCode + ((getStartedOn() == null) ? 0 : getStartedOn().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedOn() == null) ? 0 : getLastModifiedOn().hashCode());
        hashCode = prime * hashCode + ((getCompletedOn() == null) ? 0 : getCompletedOn().hashCode());
        hashCode = prime * hashCode + ((getExecutionTime() == null) ? 0 : getExecutionTime().hashCode());
        hashCode = prime * hashCode + ((getRulesetNames() == null) ? 0 : getRulesetNames().hashCode());
        hashCode = prime * hashCode + ((getResultIds() == null) ? 0 : getResultIds().hashCode());
        return hashCode;
    }

    @Override
    public GetDataQualityRulesetEvaluationRunResult clone() {
        try {
            return (GetDataQualityRulesetEvaluationRunResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
