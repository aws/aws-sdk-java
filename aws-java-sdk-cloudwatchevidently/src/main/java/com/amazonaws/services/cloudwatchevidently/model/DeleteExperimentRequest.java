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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/DeleteExperiment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteExperimentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the experiment to delete.
     * </p>
     */
    private String experiment;
    /**
     * <p>
     * The name or ARN of the project that contains the experiment to delete.
     * </p>
     */
    private String project;

    /**
     * <p>
     * The name of the experiment to delete.
     * </p>
     * 
     * @param experiment
     *        The name of the experiment to delete.
     */

    public void setExperiment(String experiment) {
        this.experiment = experiment;
    }

    /**
     * <p>
     * The name of the experiment to delete.
     * </p>
     * 
     * @return The name of the experiment to delete.
     */

    public String getExperiment() {
        return this.experiment;
    }

    /**
     * <p>
     * The name of the experiment to delete.
     * </p>
     * 
     * @param experiment
     *        The name of the experiment to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteExperimentRequest withExperiment(String experiment) {
        setExperiment(experiment);
        return this;
    }

    /**
     * <p>
     * The name or ARN of the project that contains the experiment to delete.
     * </p>
     * 
     * @param project
     *        The name or ARN of the project that contains the experiment to delete.
     */

    public void setProject(String project) {
        this.project = project;
    }

    /**
     * <p>
     * The name or ARN of the project that contains the experiment to delete.
     * </p>
     * 
     * @return The name or ARN of the project that contains the experiment to delete.
     */

    public String getProject() {
        return this.project;
    }

    /**
     * <p>
     * The name or ARN of the project that contains the experiment to delete.
     * </p>
     * 
     * @param project
     *        The name or ARN of the project that contains the experiment to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteExperimentRequest withProject(String project) {
        setProject(project);
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
        if (getExperiment() != null)
            sb.append("Experiment: ").append(getExperiment()).append(",");
        if (getProject() != null)
            sb.append("Project: ").append(getProject());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteExperimentRequest == false)
            return false;
        DeleteExperimentRequest other = (DeleteExperimentRequest) obj;
        if (other.getExperiment() == null ^ this.getExperiment() == null)
            return false;
        if (other.getExperiment() != null && other.getExperiment().equals(this.getExperiment()) == false)
            return false;
        if (other.getProject() == null ^ this.getProject() == null)
            return false;
        if (other.getProject() != null && other.getProject().equals(this.getProject()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExperiment() == null) ? 0 : getExperiment().hashCode());
        hashCode = prime * hashCode + ((getProject() == null) ? 0 : getProject().hashCode());
        return hashCode;
    }

    @Override
    public DeleteExperimentRequest clone() {
        return (DeleteExperimentRequest) super.clone();
    }

}
