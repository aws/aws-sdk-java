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
 * Artifacts that are generation during a job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/AutoMLJobArtifacts" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoMLJobArtifacts implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The URL to the notebook location.
     * </p>
     */
    private String candidateDefinitionNotebookLocation;
    /**
     * <p>
     * The URL to the notebook location.
     * </p>
     */
    private String dataExplorationNotebookLocation;

    /**
     * <p>
     * The URL to the notebook location.
     * </p>
     * 
     * @param candidateDefinitionNotebookLocation
     *        The URL to the notebook location.
     */

    public void setCandidateDefinitionNotebookLocation(String candidateDefinitionNotebookLocation) {
        this.candidateDefinitionNotebookLocation = candidateDefinitionNotebookLocation;
    }

    /**
     * <p>
     * The URL to the notebook location.
     * </p>
     * 
     * @return The URL to the notebook location.
     */

    public String getCandidateDefinitionNotebookLocation() {
        return this.candidateDefinitionNotebookLocation;
    }

    /**
     * <p>
     * The URL to the notebook location.
     * </p>
     * 
     * @param candidateDefinitionNotebookLocation
     *        The URL to the notebook location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoMLJobArtifacts withCandidateDefinitionNotebookLocation(String candidateDefinitionNotebookLocation) {
        setCandidateDefinitionNotebookLocation(candidateDefinitionNotebookLocation);
        return this;
    }

    /**
     * <p>
     * The URL to the notebook location.
     * </p>
     * 
     * @param dataExplorationNotebookLocation
     *        The URL to the notebook location.
     */

    public void setDataExplorationNotebookLocation(String dataExplorationNotebookLocation) {
        this.dataExplorationNotebookLocation = dataExplorationNotebookLocation;
    }

    /**
     * <p>
     * The URL to the notebook location.
     * </p>
     * 
     * @return The URL to the notebook location.
     */

    public String getDataExplorationNotebookLocation() {
        return this.dataExplorationNotebookLocation;
    }

    /**
     * <p>
     * The URL to the notebook location.
     * </p>
     * 
     * @param dataExplorationNotebookLocation
     *        The URL to the notebook location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoMLJobArtifacts withDataExplorationNotebookLocation(String dataExplorationNotebookLocation) {
        setDataExplorationNotebookLocation(dataExplorationNotebookLocation);
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
        if (getCandidateDefinitionNotebookLocation() != null)
            sb.append("CandidateDefinitionNotebookLocation: ").append(getCandidateDefinitionNotebookLocation()).append(",");
        if (getDataExplorationNotebookLocation() != null)
            sb.append("DataExplorationNotebookLocation: ").append(getDataExplorationNotebookLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoMLJobArtifacts == false)
            return false;
        AutoMLJobArtifacts other = (AutoMLJobArtifacts) obj;
        if (other.getCandidateDefinitionNotebookLocation() == null ^ this.getCandidateDefinitionNotebookLocation() == null)
            return false;
        if (other.getCandidateDefinitionNotebookLocation() != null
                && other.getCandidateDefinitionNotebookLocation().equals(this.getCandidateDefinitionNotebookLocation()) == false)
            return false;
        if (other.getDataExplorationNotebookLocation() == null ^ this.getDataExplorationNotebookLocation() == null)
            return false;
        if (other.getDataExplorationNotebookLocation() != null
                && other.getDataExplorationNotebookLocation().equals(this.getDataExplorationNotebookLocation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCandidateDefinitionNotebookLocation() == null) ? 0 : getCandidateDefinitionNotebookLocation().hashCode());
        hashCode = prime * hashCode + ((getDataExplorationNotebookLocation() == null) ? 0 : getDataExplorationNotebookLocation().hashCode());
        return hashCode;
    }

    @Override
    public AutoMLJobArtifacts clone() {
        try {
            return (AutoMLJobArtifacts) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.AutoMLJobArtifactsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
