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
package com.amazonaws.services.cloudwatchevidently.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/StopExperiment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopExperimentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specify whether the experiment is to be considered <code>COMPLETED</code> or <code>CANCELLED</code> after it
     * stops.
     * </p>
     */
    private String desiredState;
    /**
     * <p>
     * The name of the experiment to stop.
     * </p>
     */
    private String experiment;
    /**
     * <p>
     * The name or ARN of the project that contains the experiment to stop.
     * </p>
     */
    private String project;
    /**
     * <p>
     * A string that describes why you are stopping the experiment.
     * </p>
     */
    private String reason;

    /**
     * <p>
     * Specify whether the experiment is to be considered <code>COMPLETED</code> or <code>CANCELLED</code> after it
     * stops.
     * </p>
     * 
     * @param desiredState
     *        Specify whether the experiment is to be considered <code>COMPLETED</code> or <code>CANCELLED</code> after
     *        it stops.
     * @see ExperimentStopDesiredState
     */

    public void setDesiredState(String desiredState) {
        this.desiredState = desiredState;
    }

    /**
     * <p>
     * Specify whether the experiment is to be considered <code>COMPLETED</code> or <code>CANCELLED</code> after it
     * stops.
     * </p>
     * 
     * @return Specify whether the experiment is to be considered <code>COMPLETED</code> or <code>CANCELLED</code> after
     *         it stops.
     * @see ExperimentStopDesiredState
     */

    public String getDesiredState() {
        return this.desiredState;
    }

    /**
     * <p>
     * Specify whether the experiment is to be considered <code>COMPLETED</code> or <code>CANCELLED</code> after it
     * stops.
     * </p>
     * 
     * @param desiredState
     *        Specify whether the experiment is to be considered <code>COMPLETED</code> or <code>CANCELLED</code> after
     *        it stops.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExperimentStopDesiredState
     */

    public StopExperimentRequest withDesiredState(String desiredState) {
        setDesiredState(desiredState);
        return this;
    }

    /**
     * <p>
     * Specify whether the experiment is to be considered <code>COMPLETED</code> or <code>CANCELLED</code> after it
     * stops.
     * </p>
     * 
     * @param desiredState
     *        Specify whether the experiment is to be considered <code>COMPLETED</code> or <code>CANCELLED</code> after
     *        it stops.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExperimentStopDesiredState
     */

    public StopExperimentRequest withDesiredState(ExperimentStopDesiredState desiredState) {
        this.desiredState = desiredState.toString();
        return this;
    }

    /**
     * <p>
     * The name of the experiment to stop.
     * </p>
     * 
     * @param experiment
     *        The name of the experiment to stop.
     */

    public void setExperiment(String experiment) {
        this.experiment = experiment;
    }

    /**
     * <p>
     * The name of the experiment to stop.
     * </p>
     * 
     * @return The name of the experiment to stop.
     */

    public String getExperiment() {
        return this.experiment;
    }

    /**
     * <p>
     * The name of the experiment to stop.
     * </p>
     * 
     * @param experiment
     *        The name of the experiment to stop.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopExperimentRequest withExperiment(String experiment) {
        setExperiment(experiment);
        return this;
    }

    /**
     * <p>
     * The name or ARN of the project that contains the experiment to stop.
     * </p>
     * 
     * @param project
     *        The name or ARN of the project that contains the experiment to stop.
     */

    public void setProject(String project) {
        this.project = project;
    }

    /**
     * <p>
     * The name or ARN of the project that contains the experiment to stop.
     * </p>
     * 
     * @return The name or ARN of the project that contains the experiment to stop.
     */

    public String getProject() {
        return this.project;
    }

    /**
     * <p>
     * The name or ARN of the project that contains the experiment to stop.
     * </p>
     * 
     * @param project
     *        The name or ARN of the project that contains the experiment to stop.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopExperimentRequest withProject(String project) {
        setProject(project);
        return this;
    }

    /**
     * <p>
     * A string that describes why you are stopping the experiment.
     * </p>
     * 
     * @param reason
     *        A string that describes why you are stopping the experiment.
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * A string that describes why you are stopping the experiment.
     * </p>
     * 
     * @return A string that describes why you are stopping the experiment.
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * A string that describes why you are stopping the experiment.
     * </p>
     * 
     * @param reason
     *        A string that describes why you are stopping the experiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopExperimentRequest withReason(String reason) {
        setReason(reason);
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
        if (getDesiredState() != null)
            sb.append("DesiredState: ").append(getDesiredState()).append(",");
        if (getExperiment() != null)
            sb.append("Experiment: ").append(getExperiment()).append(",");
        if (getProject() != null)
            sb.append("Project: ").append(getProject()).append(",");
        if (getReason() != null)
            sb.append("Reason: ").append(getReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopExperimentRequest == false)
            return false;
        StopExperimentRequest other = (StopExperimentRequest) obj;
        if (other.getDesiredState() == null ^ this.getDesiredState() == null)
            return false;
        if (other.getDesiredState() != null && other.getDesiredState().equals(this.getDesiredState()) == false)
            return false;
        if (other.getExperiment() == null ^ this.getExperiment() == null)
            return false;
        if (other.getExperiment() != null && other.getExperiment().equals(this.getExperiment()) == false)
            return false;
        if (other.getProject() == null ^ this.getProject() == null)
            return false;
        if (other.getProject() != null && other.getProject().equals(this.getProject()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDesiredState() == null) ? 0 : getDesiredState().hashCode());
        hashCode = prime * hashCode + ((getExperiment() == null) ? 0 : getExperiment().hashCode());
        hashCode = prime * hashCode + ((getProject() == null) ? 0 : getProject().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        return hashCode;
    }

    @Override
    public StopExperimentRequest clone() {
        return (StopExperimentRequest) super.clone();
    }

}
