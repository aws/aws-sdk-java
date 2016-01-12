/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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

package com.amazonaws.services.inspector.model;

import java.io.Serializable;

/**
 * <p>
 * A snapshot of an Inspector assessment that contains the assessment's
 * findings.
 * </p>
 * <p>
 * This data type is used as the response element in the <a>DescribeRun</a>
 * action.
 * </p>
 */
public class Run implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the run.
     * </p>
     */
    private String runArn;
    /**
     * <p>
     * The auto-generated name for the run.
     * </p>
     */
    private String runName;
    /**
     * <p>
     * The ARN of the assessment that is associated with the run.
     * </p>
     */
    private String assessmentArn;
    /**
     * <p>
     * The state of the run. Values can be set to <i>DataCollectionComplete</i>,
     * <i>EvaluatingPolicies</i>, <i>EvaluatingPoliciesErrorCanRetry</i>,
     * <i>Completed</i>, <i>Failed</i>, <i>TombStoned</i>.
     * </p>
     */
    private String runState;
    /**
     * <p>
     * Rules packages selected for the run of the assessment.
     * </p>
     */
    private java.util.List<String> rulesPackages;
    /**
     * <p>
     * Run creation time that corresponds to the data collection completion time
     * or failure.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * Run completion time that corresponds to the rules packages evaluation
     * completion time or failure.
     * </p>
     */
    private java.util.Date completionTime;

    /**
     * <p>
     * The ARN of the run.
     * </p>
     * 
     * @param runArn
     *        The ARN of the run.
     */
    public void setRunArn(String runArn) {
        this.runArn = runArn;
    }

    /**
     * <p>
     * The ARN of the run.
     * </p>
     * 
     * @return The ARN of the run.
     */
    public String getRunArn() {
        return this.runArn;
    }

    /**
     * <p>
     * The ARN of the run.
     * </p>
     * 
     * @param runArn
     *        The ARN of the run.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Run withRunArn(String runArn) {
        setRunArn(runArn);
        return this;
    }

    /**
     * <p>
     * The auto-generated name for the run.
     * </p>
     * 
     * @param runName
     *        The auto-generated name for the run.
     */
    public void setRunName(String runName) {
        this.runName = runName;
    }

    /**
     * <p>
     * The auto-generated name for the run.
     * </p>
     * 
     * @return The auto-generated name for the run.
     */
    public String getRunName() {
        return this.runName;
    }

    /**
     * <p>
     * The auto-generated name for the run.
     * </p>
     * 
     * @param runName
     *        The auto-generated name for the run.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Run withRunName(String runName) {
        setRunName(runName);
        return this;
    }

    /**
     * <p>
     * The ARN of the assessment that is associated with the run.
     * </p>
     * 
     * @param assessmentArn
     *        The ARN of the assessment that is associated with the run.
     */
    public void setAssessmentArn(String assessmentArn) {
        this.assessmentArn = assessmentArn;
    }

    /**
     * <p>
     * The ARN of the assessment that is associated with the run.
     * </p>
     * 
     * @return The ARN of the assessment that is associated with the run.
     */
    public String getAssessmentArn() {
        return this.assessmentArn;
    }

    /**
     * <p>
     * The ARN of the assessment that is associated with the run.
     * </p>
     * 
     * @param assessmentArn
     *        The ARN of the assessment that is associated with the run.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Run withAssessmentArn(String assessmentArn) {
        setAssessmentArn(assessmentArn);
        return this;
    }

    /**
     * <p>
     * The state of the run. Values can be set to <i>DataCollectionComplete</i>,
     * <i>EvaluatingPolicies</i>, <i>EvaluatingPoliciesErrorCanRetry</i>,
     * <i>Completed</i>, <i>Failed</i>, <i>TombStoned</i>.
     * </p>
     * 
     * @param runState
     *        The state of the run. Values can be set to
     *        <i>DataCollectionComplete</i>, <i>EvaluatingPolicies</i>,
     *        <i>EvaluatingPoliciesErrorCanRetry</i>, <i>Completed</i>,
     *        <i>Failed</i>, <i>TombStoned</i>.
     */
    public void setRunState(String runState) {
        this.runState = runState;
    }

    /**
     * <p>
     * The state of the run. Values can be set to <i>DataCollectionComplete</i>,
     * <i>EvaluatingPolicies</i>, <i>EvaluatingPoliciesErrorCanRetry</i>,
     * <i>Completed</i>, <i>Failed</i>, <i>TombStoned</i>.
     * </p>
     * 
     * @return The state of the run. Values can be set to
     *         <i>DataCollectionComplete</i>, <i>EvaluatingPolicies</i>,
     *         <i>EvaluatingPoliciesErrorCanRetry</i>, <i>Completed</i>,
     *         <i>Failed</i>, <i>TombStoned</i>.
     */
    public String getRunState() {
        return this.runState;
    }

    /**
     * <p>
     * The state of the run. Values can be set to <i>DataCollectionComplete</i>,
     * <i>EvaluatingPolicies</i>, <i>EvaluatingPoliciesErrorCanRetry</i>,
     * <i>Completed</i>, <i>Failed</i>, <i>TombStoned</i>.
     * </p>
     * 
     * @param runState
     *        The state of the run. Values can be set to
     *        <i>DataCollectionComplete</i>, <i>EvaluatingPolicies</i>,
     *        <i>EvaluatingPoliciesErrorCanRetry</i>, <i>Completed</i>,
     *        <i>Failed</i>, <i>TombStoned</i>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Run withRunState(String runState) {
        setRunState(runState);
        return this;
    }

    /**
     * <p>
     * Rules packages selected for the run of the assessment.
     * </p>
     * 
     * @return Rules packages selected for the run of the assessment.
     */
    public java.util.List<String> getRulesPackages() {
        return rulesPackages;
    }

    /**
     * <p>
     * Rules packages selected for the run of the assessment.
     * </p>
     * 
     * @param rulesPackages
     *        Rules packages selected for the run of the assessment.
     */
    public void setRulesPackages(java.util.Collection<String> rulesPackages) {
        if (rulesPackages == null) {
            this.rulesPackages = null;
            return;
        }

        this.rulesPackages = new java.util.ArrayList<String>(rulesPackages);
    }

    /**
     * <p>
     * Rules packages selected for the run of the assessment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setRulesPackages(java.util.Collection)} or
     * {@link #withRulesPackages(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param rulesPackages
     *        Rules packages selected for the run of the assessment.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Run withRulesPackages(String... rulesPackages) {
        if (this.rulesPackages == null) {
            setRulesPackages(new java.util.ArrayList<String>(
                    rulesPackages.length));
        }
        for (String ele : rulesPackages) {
            this.rulesPackages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Rules packages selected for the run of the assessment.
     * </p>
     * 
     * @param rulesPackages
     *        Rules packages selected for the run of the assessment.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Run withRulesPackages(java.util.Collection<String> rulesPackages) {
        setRulesPackages(rulesPackages);
        return this;
    }

    /**
     * <p>
     * Run creation time that corresponds to the data collection completion time
     * or failure.
     * </p>
     * 
     * @param creationTime
     *        Run creation time that corresponds to the data collection
     *        completion time or failure.
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * Run creation time that corresponds to the data collection completion time
     * or failure.
     * </p>
     * 
     * @return Run creation time that corresponds to the data collection
     *         completion time or failure.
     */
    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * Run creation time that corresponds to the data collection completion time
     * or failure.
     * </p>
     * 
     * @param creationTime
     *        Run creation time that corresponds to the data collection
     *        completion time or failure.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Run withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * Run completion time that corresponds to the rules packages evaluation
     * completion time or failure.
     * </p>
     * 
     * @param completionTime
     *        Run completion time that corresponds to the rules packages
     *        evaluation completion time or failure.
     */
    public void setCompletionTime(java.util.Date completionTime) {
        this.completionTime = completionTime;
    }

    /**
     * <p>
     * Run completion time that corresponds to the rules packages evaluation
     * completion time or failure.
     * </p>
     * 
     * @return Run completion time that corresponds to the rules packages
     *         evaluation completion time or failure.
     */
    public java.util.Date getCompletionTime() {
        return this.completionTime;
    }

    /**
     * <p>
     * Run completion time that corresponds to the rules packages evaluation
     * completion time or failure.
     * </p>
     * 
     * @param completionTime
     *        Run completion time that corresponds to the rules packages
     *        evaluation completion time or failure.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Run withCompletionTime(java.util.Date completionTime) {
        setCompletionTime(completionTime);
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
        if (getRunArn() != null)
            sb.append("RunArn: " + getRunArn() + ",");
        if (getRunName() != null)
            sb.append("RunName: " + getRunName() + ",");
        if (getAssessmentArn() != null)
            sb.append("AssessmentArn: " + getAssessmentArn() + ",");
        if (getRunState() != null)
            sb.append("RunState: " + getRunState() + ",");
        if (getRulesPackages() != null)
            sb.append("RulesPackages: " + getRulesPackages() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getCompletionTime() != null)
            sb.append("CompletionTime: " + getCompletionTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Run == false)
            return false;
        Run other = (Run) obj;
        if (other.getRunArn() == null ^ this.getRunArn() == null)
            return false;
        if (other.getRunArn() != null
                && other.getRunArn().equals(this.getRunArn()) == false)
            return false;
        if (other.getRunName() == null ^ this.getRunName() == null)
            return false;
        if (other.getRunName() != null
                && other.getRunName().equals(this.getRunName()) == false)
            return false;
        if (other.getAssessmentArn() == null ^ this.getAssessmentArn() == null)
            return false;
        if (other.getAssessmentArn() != null
                && other.getAssessmentArn().equals(this.getAssessmentArn()) == false)
            return false;
        if (other.getRunState() == null ^ this.getRunState() == null)
            return false;
        if (other.getRunState() != null
                && other.getRunState().equals(this.getRunState()) == false)
            return false;
        if (other.getRulesPackages() == null ^ this.getRulesPackages() == null)
            return false;
        if (other.getRulesPackages() != null
                && other.getRulesPackages().equals(this.getRulesPackages()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getCompletionTime() == null
                ^ this.getCompletionTime() == null)
            return false;
        if (other.getCompletionTime() != null
                && other.getCompletionTime().equals(this.getCompletionTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRunArn() == null) ? 0 : getRunArn().hashCode());
        hashCode = prime * hashCode
                + ((getRunName() == null) ? 0 : getRunName().hashCode());
        hashCode = prime
                * hashCode
                + ((getAssessmentArn() == null) ? 0 : getAssessmentArn()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getRunState() == null) ? 0 : getRunState().hashCode());
        hashCode = prime
                * hashCode
                + ((getRulesPackages() == null) ? 0 : getRulesPackages()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getCompletionTime() == null) ? 0 : getCompletionTime()
                        .hashCode());
        return hashCode;
    }

    @Override
    public Run clone() {
        try {
            return (Run) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}