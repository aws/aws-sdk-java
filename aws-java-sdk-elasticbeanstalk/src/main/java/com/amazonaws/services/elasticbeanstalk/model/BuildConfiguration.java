/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;

/**
 * 
 */
public class BuildConfiguration implements Serializable, Cloneable {

    private String artifactName;

    private String codeBuildServiceRole;

    private String computeType;

    private String image;

    private Integer timeoutInMinutes;

    /**
     * @param artifactName
     */

    public void setArtifactName(String artifactName) {
        this.artifactName = artifactName;
    }

    /**
     * @return
     */

    public String getArtifactName() {
        return this.artifactName;
    }

    /**
     * @param artifactName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildConfiguration withArtifactName(String artifactName) {
        setArtifactName(artifactName);
        return this;
    }

    /**
     * @param codeBuildServiceRole
     */

    public void setCodeBuildServiceRole(String codeBuildServiceRole) {
        this.codeBuildServiceRole = codeBuildServiceRole;
    }

    /**
     * @return
     */

    public String getCodeBuildServiceRole() {
        return this.codeBuildServiceRole;
    }

    /**
     * @param codeBuildServiceRole
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildConfiguration withCodeBuildServiceRole(String codeBuildServiceRole) {
        setCodeBuildServiceRole(codeBuildServiceRole);
        return this;
    }

    /**
     * @param computeType
     * @see ComputeType
     */

    public void setComputeType(String computeType) {
        this.computeType = computeType;
    }

    /**
     * @return
     * @see ComputeType
     */

    public String getComputeType() {
        return this.computeType;
    }

    /**
     * @param computeType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComputeType
     */

    public BuildConfiguration withComputeType(String computeType) {
        setComputeType(computeType);
        return this;
    }

    /**
     * @param computeType
     * @see ComputeType
     */

    public void setComputeType(ComputeType computeType) {
        this.computeType = computeType.toString();
    }

    /**
     * @param computeType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComputeType
     */

    public BuildConfiguration withComputeType(ComputeType computeType) {
        setComputeType(computeType);
        return this;
    }

    /**
     * @param image
     */

    public void setImage(String image) {
        this.image = image;
    }

    /**
     * @return
     */

    public String getImage() {
        return this.image;
    }

    /**
     * @param image
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildConfiguration withImage(String image) {
        setImage(image);
        return this;
    }

    /**
     * @param timeoutInMinutes
     */

    public void setTimeoutInMinutes(Integer timeoutInMinutes) {
        this.timeoutInMinutes = timeoutInMinutes;
    }

    /**
     * @return
     */

    public Integer getTimeoutInMinutes() {
        return this.timeoutInMinutes;
    }

    /**
     * @param timeoutInMinutes
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildConfiguration withTimeoutInMinutes(Integer timeoutInMinutes) {
        setTimeoutInMinutes(timeoutInMinutes);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getArtifactName() != null)
            sb.append("ArtifactName: " + getArtifactName() + ",");
        if (getCodeBuildServiceRole() != null)
            sb.append("CodeBuildServiceRole: " + getCodeBuildServiceRole() + ",");
        if (getComputeType() != null)
            sb.append("ComputeType: " + getComputeType() + ",");
        if (getImage() != null)
            sb.append("Image: " + getImage() + ",");
        if (getTimeoutInMinutes() != null)
            sb.append("TimeoutInMinutes: " + getTimeoutInMinutes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BuildConfiguration == false)
            return false;
        BuildConfiguration other = (BuildConfiguration) obj;
        if (other.getArtifactName() == null ^ this.getArtifactName() == null)
            return false;
        if (other.getArtifactName() != null && other.getArtifactName().equals(this.getArtifactName()) == false)
            return false;
        if (other.getCodeBuildServiceRole() == null ^ this.getCodeBuildServiceRole() == null)
            return false;
        if (other.getCodeBuildServiceRole() != null && other.getCodeBuildServiceRole().equals(this.getCodeBuildServiceRole()) == false)
            return false;
        if (other.getComputeType() == null ^ this.getComputeType() == null)
            return false;
        if (other.getComputeType() != null && other.getComputeType().equals(this.getComputeType()) == false)
            return false;
        if (other.getImage() == null ^ this.getImage() == null)
            return false;
        if (other.getImage() != null && other.getImage().equals(this.getImage()) == false)
            return false;
        if (other.getTimeoutInMinutes() == null ^ this.getTimeoutInMinutes() == null)
            return false;
        if (other.getTimeoutInMinutes() != null && other.getTimeoutInMinutes().equals(this.getTimeoutInMinutes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArtifactName() == null) ? 0 : getArtifactName().hashCode());
        hashCode = prime * hashCode + ((getCodeBuildServiceRole() == null) ? 0 : getCodeBuildServiceRole().hashCode());
        hashCode = prime * hashCode + ((getComputeType() == null) ? 0 : getComputeType().hashCode());
        hashCode = prime * hashCode + ((getImage() == null) ? 0 : getImage().hashCode());
        hashCode = prime * hashCode + ((getTimeoutInMinutes() == null) ? 0 : getTimeoutInMinutes().hashCode());
        return hashCode;
    }

    @Override
    public BuildConfiguration clone() {
        try {
            return (BuildConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
