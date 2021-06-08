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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Associates a SageMaker job as a trial component with an experiment and trial. Specified when you call the following
 * APIs:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateProcessingJob</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>CreateTrainingJob</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>CreateTransformJob</a>
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ExperimentConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExperimentConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of an existing experiment to associate the trial component with.
     * </p>
     */
    private String experimentName;
    /**
     * <p>
     * The name of an existing trial to associate the trial component with. If not specified, a new trial is created.
     * </p>
     */
    private String trialName;
    /**
     * <p>
     * The display name for the trial component. If this key isn't specified, the display name is the trial component
     * name.
     * </p>
     */
    private String trialComponentDisplayName;

    /**
     * <p>
     * The name of an existing experiment to associate the trial component with.
     * </p>
     * 
     * @param experimentName
     *        The name of an existing experiment to associate the trial component with.
     */

    public void setExperimentName(String experimentName) {
        this.experimentName = experimentName;
    }

    /**
     * <p>
     * The name of an existing experiment to associate the trial component with.
     * </p>
     * 
     * @return The name of an existing experiment to associate the trial component with.
     */

    public String getExperimentName() {
        return this.experimentName;
    }

    /**
     * <p>
     * The name of an existing experiment to associate the trial component with.
     * </p>
     * 
     * @param experimentName
     *        The name of an existing experiment to associate the trial component with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExperimentConfig withExperimentName(String experimentName) {
        setExperimentName(experimentName);
        return this;
    }

    /**
     * <p>
     * The name of an existing trial to associate the trial component with. If not specified, a new trial is created.
     * </p>
     * 
     * @param trialName
     *        The name of an existing trial to associate the trial component with. If not specified, a new trial is
     *        created.
     */

    public void setTrialName(String trialName) {
        this.trialName = trialName;
    }

    /**
     * <p>
     * The name of an existing trial to associate the trial component with. If not specified, a new trial is created.
     * </p>
     * 
     * @return The name of an existing trial to associate the trial component with. If not specified, a new trial is
     *         created.
     */

    public String getTrialName() {
        return this.trialName;
    }

    /**
     * <p>
     * The name of an existing trial to associate the trial component with. If not specified, a new trial is created.
     * </p>
     * 
     * @param trialName
     *        The name of an existing trial to associate the trial component with. If not specified, a new trial is
     *        created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExperimentConfig withTrialName(String trialName) {
        setTrialName(trialName);
        return this;
    }

    /**
     * <p>
     * The display name for the trial component. If this key isn't specified, the display name is the trial component
     * name.
     * </p>
     * 
     * @param trialComponentDisplayName
     *        The display name for the trial component. If this key isn't specified, the display name is the trial
     *        component name.
     */

    public void setTrialComponentDisplayName(String trialComponentDisplayName) {
        this.trialComponentDisplayName = trialComponentDisplayName;
    }

    /**
     * <p>
     * The display name for the trial component. If this key isn't specified, the display name is the trial component
     * name.
     * </p>
     * 
     * @return The display name for the trial component. If this key isn't specified, the display name is the trial
     *         component name.
     */

    public String getTrialComponentDisplayName() {
        return this.trialComponentDisplayName;
    }

    /**
     * <p>
     * The display name for the trial component. If this key isn't specified, the display name is the trial component
     * name.
     * </p>
     * 
     * @param trialComponentDisplayName
     *        The display name for the trial component. If this key isn't specified, the display name is the trial
     *        component name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExperimentConfig withTrialComponentDisplayName(String trialComponentDisplayName) {
        setTrialComponentDisplayName(trialComponentDisplayName);
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
        if (getExperimentName() != null)
            sb.append("ExperimentName: ").append(getExperimentName()).append(",");
        if (getTrialName() != null)
            sb.append("TrialName: ").append(getTrialName()).append(",");
        if (getTrialComponentDisplayName() != null)
            sb.append("TrialComponentDisplayName: ").append(getTrialComponentDisplayName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExperimentConfig == false)
            return false;
        ExperimentConfig other = (ExperimentConfig) obj;
        if (other.getExperimentName() == null ^ this.getExperimentName() == null)
            return false;
        if (other.getExperimentName() != null && other.getExperimentName().equals(this.getExperimentName()) == false)
            return false;
        if (other.getTrialName() == null ^ this.getTrialName() == null)
            return false;
        if (other.getTrialName() != null && other.getTrialName().equals(this.getTrialName()) == false)
            return false;
        if (other.getTrialComponentDisplayName() == null ^ this.getTrialComponentDisplayName() == null)
            return false;
        if (other.getTrialComponentDisplayName() != null && other.getTrialComponentDisplayName().equals(this.getTrialComponentDisplayName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExperimentName() == null) ? 0 : getExperimentName().hashCode());
        hashCode = prime * hashCode + ((getTrialName() == null) ? 0 : getTrialName().hashCode());
        hashCode = prime * hashCode + ((getTrialComponentDisplayName() == null) ? 0 : getTrialComponentDisplayName().hashCode());
        return hashCode;
    }

    @Override
    public ExperimentConfig clone() {
        try {
            return (ExperimentConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ExperimentConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
