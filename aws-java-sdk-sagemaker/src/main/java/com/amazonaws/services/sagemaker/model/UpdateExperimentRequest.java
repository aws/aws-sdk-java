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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateExperiment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateExperimentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the experiment to update.
     * </p>
     */
    private String experimentName;
    /**
     * <p>
     * The name of the experiment as displayed. The name doesn't need to be unique. If <code>DisplayName</code> isn't
     * specified, <code>ExperimentName</code> is displayed.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The description of the experiment.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The name of the experiment to update.
     * </p>
     * 
     * @param experimentName
     *        The name of the experiment to update.
     */

    public void setExperimentName(String experimentName) {
        this.experimentName = experimentName;
    }

    /**
     * <p>
     * The name of the experiment to update.
     * </p>
     * 
     * @return The name of the experiment to update.
     */

    public String getExperimentName() {
        return this.experimentName;
    }

    /**
     * <p>
     * The name of the experiment to update.
     * </p>
     * 
     * @param experimentName
     *        The name of the experiment to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateExperimentRequest withExperimentName(String experimentName) {
        setExperimentName(experimentName);
        return this;
    }

    /**
     * <p>
     * The name of the experiment as displayed. The name doesn't need to be unique. If <code>DisplayName</code> isn't
     * specified, <code>ExperimentName</code> is displayed.
     * </p>
     * 
     * @param displayName
     *        The name of the experiment as displayed. The name doesn't need to be unique. If <code>DisplayName</code>
     *        isn't specified, <code>ExperimentName</code> is displayed.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The name of the experiment as displayed. The name doesn't need to be unique. If <code>DisplayName</code> isn't
     * specified, <code>ExperimentName</code> is displayed.
     * </p>
     * 
     * @return The name of the experiment as displayed. The name doesn't need to be unique. If <code>DisplayName</code>
     *         isn't specified, <code>ExperimentName</code> is displayed.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The name of the experiment as displayed. The name doesn't need to be unique. If <code>DisplayName</code> isn't
     * specified, <code>ExperimentName</code> is displayed.
     * </p>
     * 
     * @param displayName
     *        The name of the experiment as displayed. The name doesn't need to be unique. If <code>DisplayName</code>
     *        isn't specified, <code>ExperimentName</code> is displayed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateExperimentRequest withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The description of the experiment.
     * </p>
     * 
     * @param description
     *        The description of the experiment.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the experiment.
     * </p>
     * 
     * @return The description of the experiment.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the experiment.
     * </p>
     * 
     * @param description
     *        The description of the experiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateExperimentRequest withDescription(String description) {
        setDescription(description);
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
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateExperimentRequest == false)
            return false;
        UpdateExperimentRequest other = (UpdateExperimentRequest) obj;
        if (other.getExperimentName() == null ^ this.getExperimentName() == null)
            return false;
        if (other.getExperimentName() != null && other.getExperimentName().equals(this.getExperimentName()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExperimentName() == null) ? 0 : getExperimentName().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public UpdateExperimentRequest clone() {
        return (UpdateExperimentRequest) super.clone();
    }

}
