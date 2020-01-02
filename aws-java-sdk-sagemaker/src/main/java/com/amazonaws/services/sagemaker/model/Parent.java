/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The trial that a trial component is associated with and the experiment the trial is part of. A component might not be
 * associated with a trial. A component can be associated with multiple trials.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/Parent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Parent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the trial.
     * </p>
     */
    private String trialName;
    /**
     * <p>
     * The name of the experiment.
     * </p>
     */
    private String experimentName;

    /**
     * <p>
     * The name of the trial.
     * </p>
     * 
     * @param trialName
     *        The name of the trial.
     */

    public void setTrialName(String trialName) {
        this.trialName = trialName;
    }

    /**
     * <p>
     * The name of the trial.
     * </p>
     * 
     * @return The name of the trial.
     */

    public String getTrialName() {
        return this.trialName;
    }

    /**
     * <p>
     * The name of the trial.
     * </p>
     * 
     * @param trialName
     *        The name of the trial.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Parent withTrialName(String trialName) {
        setTrialName(trialName);
        return this;
    }

    /**
     * <p>
     * The name of the experiment.
     * </p>
     * 
     * @param experimentName
     *        The name of the experiment.
     */

    public void setExperimentName(String experimentName) {
        this.experimentName = experimentName;
    }

    /**
     * <p>
     * The name of the experiment.
     * </p>
     * 
     * @return The name of the experiment.
     */

    public String getExperimentName() {
        return this.experimentName;
    }

    /**
     * <p>
     * The name of the experiment.
     * </p>
     * 
     * @param experimentName
     *        The name of the experiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Parent withExperimentName(String experimentName) {
        setExperimentName(experimentName);
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
        if (getTrialName() != null)
            sb.append("TrialName: ").append(getTrialName()).append(",");
        if (getExperimentName() != null)
            sb.append("ExperimentName: ").append(getExperimentName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Parent == false)
            return false;
        Parent other = (Parent) obj;
        if (other.getTrialName() == null ^ this.getTrialName() == null)
            return false;
        if (other.getTrialName() != null && other.getTrialName().equals(this.getTrialName()) == false)
            return false;
        if (other.getExperimentName() == null ^ this.getExperimentName() == null)
            return false;
        if (other.getExperimentName() != null && other.getExperimentName().equals(this.getExperimentName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrialName() == null) ? 0 : getTrialName().hashCode());
        hashCode = prime * hashCode + ((getExperimentName() == null) ? 0 : getExperimentName().hashCode());
        return hashCode;
    }

    @Override
    public Parent clone() {
        try {
            return (Parent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ParentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
