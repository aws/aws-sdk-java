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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a data quality result.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DataQualityResult" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataQualityResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique result ID for the data quality result.
     * </p>
     */
    private String resultId;
    /**
     * <p>
     * An aggregate data quality score. Represents the ratio of rules that passed to the total number of rules.
     * </p>
     */
    private Double score;
    /**
     * <p>
     * The table associated with the data quality result, if any.
     * </p>
     */
    private DataSource dataSource;
    /**
     * <p>
     * The name of the ruleset associated with the data quality result.
     * </p>
     */
    private String rulesetName;
    /**
     * <p>
     * In the context of a job in Glue Studio, each node in the canvas is typically assigned some sort of name and data
     * quality nodes will have names. In the case of multiple nodes, the <code>evaluationContext</code> can
     * differentiate the nodes.
     * </p>
     */
    private String evaluationContext;
    /**
     * <p>
     * The date and time when this data quality run started.
     * </p>
     */
    private java.util.Date startedOn;
    /**
     * <p>
     * The date and time when this data quality run completed.
     * </p>
     */
    private java.util.Date completedOn;
    /**
     * <p>
     * The job name associated with the data quality result, if any.
     * </p>
     */
    private String jobName;
    /**
     * <p>
     * The job run ID associated with the data quality result, if any.
     * </p>
     */
    private String jobRunId;
    /**
     * <p>
     * The unique run ID for the ruleset evaluation for this data quality result.
     * </p>
     */
    private String rulesetEvaluationRunId;
    /**
     * <p>
     * A list of <code>DataQualityRuleResult</code> objects representing the results for each rule.
     * </p>
     */
    private java.util.List<DataQualityRuleResult> ruleResults;

    /**
     * <p>
     * A unique result ID for the data quality result.
     * </p>
     * 
     * @param resultId
     *        A unique result ID for the data quality result.
     */

    public void setResultId(String resultId) {
        this.resultId = resultId;
    }

    /**
     * <p>
     * A unique result ID for the data quality result.
     * </p>
     * 
     * @return A unique result ID for the data quality result.
     */

    public String getResultId() {
        return this.resultId;
    }

    /**
     * <p>
     * A unique result ID for the data quality result.
     * </p>
     * 
     * @param resultId
     *        A unique result ID for the data quality result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataQualityResult withResultId(String resultId) {
        setResultId(resultId);
        return this;
    }

    /**
     * <p>
     * An aggregate data quality score. Represents the ratio of rules that passed to the total number of rules.
     * </p>
     * 
     * @param score
     *        An aggregate data quality score. Represents the ratio of rules that passed to the total number of rules.
     */

    public void setScore(Double score) {
        this.score = score;
    }

    /**
     * <p>
     * An aggregate data quality score. Represents the ratio of rules that passed to the total number of rules.
     * </p>
     * 
     * @return An aggregate data quality score. Represents the ratio of rules that passed to the total number of rules.
     */

    public Double getScore() {
        return this.score;
    }

    /**
     * <p>
     * An aggregate data quality score. Represents the ratio of rules that passed to the total number of rules.
     * </p>
     * 
     * @param score
     *        An aggregate data quality score. Represents the ratio of rules that passed to the total number of rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataQualityResult withScore(Double score) {
        setScore(score);
        return this;
    }

    /**
     * <p>
     * The table associated with the data quality result, if any.
     * </p>
     * 
     * @param dataSource
     *        The table associated with the data quality result, if any.
     */

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * <p>
     * The table associated with the data quality result, if any.
     * </p>
     * 
     * @return The table associated with the data quality result, if any.
     */

    public DataSource getDataSource() {
        return this.dataSource;
    }

    /**
     * <p>
     * The table associated with the data quality result, if any.
     * </p>
     * 
     * @param dataSource
     *        The table associated with the data quality result, if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataQualityResult withDataSource(DataSource dataSource) {
        setDataSource(dataSource);
        return this;
    }

    /**
     * <p>
     * The name of the ruleset associated with the data quality result.
     * </p>
     * 
     * @param rulesetName
     *        The name of the ruleset associated with the data quality result.
     */

    public void setRulesetName(String rulesetName) {
        this.rulesetName = rulesetName;
    }

    /**
     * <p>
     * The name of the ruleset associated with the data quality result.
     * </p>
     * 
     * @return The name of the ruleset associated with the data quality result.
     */

    public String getRulesetName() {
        return this.rulesetName;
    }

    /**
     * <p>
     * The name of the ruleset associated with the data quality result.
     * </p>
     * 
     * @param rulesetName
     *        The name of the ruleset associated with the data quality result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataQualityResult withRulesetName(String rulesetName) {
        setRulesetName(rulesetName);
        return this;
    }

    /**
     * <p>
     * In the context of a job in Glue Studio, each node in the canvas is typically assigned some sort of name and data
     * quality nodes will have names. In the case of multiple nodes, the <code>evaluationContext</code> can
     * differentiate the nodes.
     * </p>
     * 
     * @param evaluationContext
     *        In the context of a job in Glue Studio, each node in the canvas is typically assigned some sort of name
     *        and data quality nodes will have names. In the case of multiple nodes, the <code>evaluationContext</code>
     *        can differentiate the nodes.
     */

    public void setEvaluationContext(String evaluationContext) {
        this.evaluationContext = evaluationContext;
    }

    /**
     * <p>
     * In the context of a job in Glue Studio, each node in the canvas is typically assigned some sort of name and data
     * quality nodes will have names. In the case of multiple nodes, the <code>evaluationContext</code> can
     * differentiate the nodes.
     * </p>
     * 
     * @return In the context of a job in Glue Studio, each node in the canvas is typically assigned some sort of name
     *         and data quality nodes will have names. In the case of multiple nodes, the <code>evaluationContext</code>
     *         can differentiate the nodes.
     */

    public String getEvaluationContext() {
        return this.evaluationContext;
    }

    /**
     * <p>
     * In the context of a job in Glue Studio, each node in the canvas is typically assigned some sort of name and data
     * quality nodes will have names. In the case of multiple nodes, the <code>evaluationContext</code> can
     * differentiate the nodes.
     * </p>
     * 
     * @param evaluationContext
     *        In the context of a job in Glue Studio, each node in the canvas is typically assigned some sort of name
     *        and data quality nodes will have names. In the case of multiple nodes, the <code>evaluationContext</code>
     *        can differentiate the nodes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataQualityResult withEvaluationContext(String evaluationContext) {
        setEvaluationContext(evaluationContext);
        return this;
    }

    /**
     * <p>
     * The date and time when this data quality run started.
     * </p>
     * 
     * @param startedOn
     *        The date and time when this data quality run started.
     */

    public void setStartedOn(java.util.Date startedOn) {
        this.startedOn = startedOn;
    }

    /**
     * <p>
     * The date and time when this data quality run started.
     * </p>
     * 
     * @return The date and time when this data quality run started.
     */

    public java.util.Date getStartedOn() {
        return this.startedOn;
    }

    /**
     * <p>
     * The date and time when this data quality run started.
     * </p>
     * 
     * @param startedOn
     *        The date and time when this data quality run started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataQualityResult withStartedOn(java.util.Date startedOn) {
        setStartedOn(startedOn);
        return this;
    }

    /**
     * <p>
     * The date and time when this data quality run completed.
     * </p>
     * 
     * @param completedOn
     *        The date and time when this data quality run completed.
     */

    public void setCompletedOn(java.util.Date completedOn) {
        this.completedOn = completedOn;
    }

    /**
     * <p>
     * The date and time when this data quality run completed.
     * </p>
     * 
     * @return The date and time when this data quality run completed.
     */

    public java.util.Date getCompletedOn() {
        return this.completedOn;
    }

    /**
     * <p>
     * The date and time when this data quality run completed.
     * </p>
     * 
     * @param completedOn
     *        The date and time when this data quality run completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataQualityResult withCompletedOn(java.util.Date completedOn) {
        setCompletedOn(completedOn);
        return this;
    }

    /**
     * <p>
     * The job name associated with the data quality result, if any.
     * </p>
     * 
     * @param jobName
     *        The job name associated with the data quality result, if any.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The job name associated with the data quality result, if any.
     * </p>
     * 
     * @return The job name associated with the data quality result, if any.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * The job name associated with the data quality result, if any.
     * </p>
     * 
     * @param jobName
     *        The job name associated with the data quality result, if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataQualityResult withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * The job run ID associated with the data quality result, if any.
     * </p>
     * 
     * @param jobRunId
     *        The job run ID associated with the data quality result, if any.
     */

    public void setJobRunId(String jobRunId) {
        this.jobRunId = jobRunId;
    }

    /**
     * <p>
     * The job run ID associated with the data quality result, if any.
     * </p>
     * 
     * @return The job run ID associated with the data quality result, if any.
     */

    public String getJobRunId() {
        return this.jobRunId;
    }

    /**
     * <p>
     * The job run ID associated with the data quality result, if any.
     * </p>
     * 
     * @param jobRunId
     *        The job run ID associated with the data quality result, if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataQualityResult withJobRunId(String jobRunId) {
        setJobRunId(jobRunId);
        return this;
    }

    /**
     * <p>
     * The unique run ID for the ruleset evaluation for this data quality result.
     * </p>
     * 
     * @param rulesetEvaluationRunId
     *        The unique run ID for the ruleset evaluation for this data quality result.
     */

    public void setRulesetEvaluationRunId(String rulesetEvaluationRunId) {
        this.rulesetEvaluationRunId = rulesetEvaluationRunId;
    }

    /**
     * <p>
     * The unique run ID for the ruleset evaluation for this data quality result.
     * </p>
     * 
     * @return The unique run ID for the ruleset evaluation for this data quality result.
     */

    public String getRulesetEvaluationRunId() {
        return this.rulesetEvaluationRunId;
    }

    /**
     * <p>
     * The unique run ID for the ruleset evaluation for this data quality result.
     * </p>
     * 
     * @param rulesetEvaluationRunId
     *        The unique run ID for the ruleset evaluation for this data quality result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataQualityResult withRulesetEvaluationRunId(String rulesetEvaluationRunId) {
        setRulesetEvaluationRunId(rulesetEvaluationRunId);
        return this;
    }

    /**
     * <p>
     * A list of <code>DataQualityRuleResult</code> objects representing the results for each rule.
     * </p>
     * 
     * @return A list of <code>DataQualityRuleResult</code> objects representing the results for each rule.
     */

    public java.util.List<DataQualityRuleResult> getRuleResults() {
        return ruleResults;
    }

    /**
     * <p>
     * A list of <code>DataQualityRuleResult</code> objects representing the results for each rule.
     * </p>
     * 
     * @param ruleResults
     *        A list of <code>DataQualityRuleResult</code> objects representing the results for each rule.
     */

    public void setRuleResults(java.util.Collection<DataQualityRuleResult> ruleResults) {
        if (ruleResults == null) {
            this.ruleResults = null;
            return;
        }

        this.ruleResults = new java.util.ArrayList<DataQualityRuleResult>(ruleResults);
    }

    /**
     * <p>
     * A list of <code>DataQualityRuleResult</code> objects representing the results for each rule.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRuleResults(java.util.Collection)} or {@link #withRuleResults(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param ruleResults
     *        A list of <code>DataQualityRuleResult</code> objects representing the results for each rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataQualityResult withRuleResults(DataQualityRuleResult... ruleResults) {
        if (this.ruleResults == null) {
            setRuleResults(new java.util.ArrayList<DataQualityRuleResult>(ruleResults.length));
        }
        for (DataQualityRuleResult ele : ruleResults) {
            this.ruleResults.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>DataQualityRuleResult</code> objects representing the results for each rule.
     * </p>
     * 
     * @param ruleResults
     *        A list of <code>DataQualityRuleResult</code> objects representing the results for each rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataQualityResult withRuleResults(java.util.Collection<DataQualityRuleResult> ruleResults) {
        setRuleResults(ruleResults);
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
        if (getResultId() != null)
            sb.append("ResultId: ").append(getResultId()).append(",");
        if (getScore() != null)
            sb.append("Score: ").append(getScore()).append(",");
        if (getDataSource() != null)
            sb.append("DataSource: ").append(getDataSource()).append(",");
        if (getRulesetName() != null)
            sb.append("RulesetName: ").append(getRulesetName()).append(",");
        if (getEvaluationContext() != null)
            sb.append("EvaluationContext: ").append(getEvaluationContext()).append(",");
        if (getStartedOn() != null)
            sb.append("StartedOn: ").append(getStartedOn()).append(",");
        if (getCompletedOn() != null)
            sb.append("CompletedOn: ").append(getCompletedOn()).append(",");
        if (getJobName() != null)
            sb.append("JobName: ").append(getJobName()).append(",");
        if (getJobRunId() != null)
            sb.append("JobRunId: ").append(getJobRunId()).append(",");
        if (getRulesetEvaluationRunId() != null)
            sb.append("RulesetEvaluationRunId: ").append(getRulesetEvaluationRunId()).append(",");
        if (getRuleResults() != null)
            sb.append("RuleResults: ").append(getRuleResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataQualityResult == false)
            return false;
        DataQualityResult other = (DataQualityResult) obj;
        if (other.getResultId() == null ^ this.getResultId() == null)
            return false;
        if (other.getResultId() != null && other.getResultId().equals(this.getResultId()) == false)
            return false;
        if (other.getScore() == null ^ this.getScore() == null)
            return false;
        if (other.getScore() != null && other.getScore().equals(this.getScore()) == false)
            return false;
        if (other.getDataSource() == null ^ this.getDataSource() == null)
            return false;
        if (other.getDataSource() != null && other.getDataSource().equals(this.getDataSource()) == false)
            return false;
        if (other.getRulesetName() == null ^ this.getRulesetName() == null)
            return false;
        if (other.getRulesetName() != null && other.getRulesetName().equals(this.getRulesetName()) == false)
            return false;
        if (other.getEvaluationContext() == null ^ this.getEvaluationContext() == null)
            return false;
        if (other.getEvaluationContext() != null && other.getEvaluationContext().equals(this.getEvaluationContext()) == false)
            return false;
        if (other.getStartedOn() == null ^ this.getStartedOn() == null)
            return false;
        if (other.getStartedOn() != null && other.getStartedOn().equals(this.getStartedOn()) == false)
            return false;
        if (other.getCompletedOn() == null ^ this.getCompletedOn() == null)
            return false;
        if (other.getCompletedOn() != null && other.getCompletedOn().equals(this.getCompletedOn()) == false)
            return false;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getJobRunId() == null ^ this.getJobRunId() == null)
            return false;
        if (other.getJobRunId() != null && other.getJobRunId().equals(this.getJobRunId()) == false)
            return false;
        if (other.getRulesetEvaluationRunId() == null ^ this.getRulesetEvaluationRunId() == null)
            return false;
        if (other.getRulesetEvaluationRunId() != null && other.getRulesetEvaluationRunId().equals(this.getRulesetEvaluationRunId()) == false)
            return false;
        if (other.getRuleResults() == null ^ this.getRuleResults() == null)
            return false;
        if (other.getRuleResults() != null && other.getRuleResults().equals(this.getRuleResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResultId() == null) ? 0 : getResultId().hashCode());
        hashCode = prime * hashCode + ((getScore() == null) ? 0 : getScore().hashCode());
        hashCode = prime * hashCode + ((getDataSource() == null) ? 0 : getDataSource().hashCode());
        hashCode = prime * hashCode + ((getRulesetName() == null) ? 0 : getRulesetName().hashCode());
        hashCode = prime * hashCode + ((getEvaluationContext() == null) ? 0 : getEvaluationContext().hashCode());
        hashCode = prime * hashCode + ((getStartedOn() == null) ? 0 : getStartedOn().hashCode());
        hashCode = prime * hashCode + ((getCompletedOn() == null) ? 0 : getCompletedOn().hashCode());
        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getJobRunId() == null) ? 0 : getJobRunId().hashCode());
        hashCode = prime * hashCode + ((getRulesetEvaluationRunId() == null) ? 0 : getRulesetEvaluationRunId().hashCode());
        hashCode = prime * hashCode + ((getRuleResults() == null) ? 0 : getRuleResults().hashCode());
        return hashCode;
    }

    @Override
    public DataQualityResult clone() {
        try {
            return (DataQualityResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.DataQualityResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
