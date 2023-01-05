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
package com.amazonaws.services.migrationhubstrategyrecommendations.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Object containing source code information that is linked to an application component.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/SourceCode" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SourceCode implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The repository name for the source code.
     * </p>
     */
    private String location;
    /**
     * <p>
     * The name of the project.
     * </p>
     */
    private String projectName;
    /**
     * <p>
     * The branch of the source code.
     * </p>
     */
    private String sourceVersion;
    /**
     * <p>
     * The type of repository to use for the source code.
     * </p>
     */
    private String versionControl;

    /**
     * <p>
     * The repository name for the source code.
     * </p>
     * 
     * @param location
     *        The repository name for the source code.
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * The repository name for the source code.
     * </p>
     * 
     * @return The repository name for the source code.
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The repository name for the source code.
     * </p>
     * 
     * @param location
     *        The repository name for the source code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceCode withLocation(String location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * The name of the project.
     * </p>
     * 
     * @param projectName
     *        The name of the project.
     */

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * <p>
     * The name of the project.
     * </p>
     * 
     * @return The name of the project.
     */

    public String getProjectName() {
        return this.projectName;
    }

    /**
     * <p>
     * The name of the project.
     * </p>
     * 
     * @param projectName
     *        The name of the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceCode withProjectName(String projectName) {
        setProjectName(projectName);
        return this;
    }

    /**
     * <p>
     * The branch of the source code.
     * </p>
     * 
     * @param sourceVersion
     *        The branch of the source code.
     */

    public void setSourceVersion(String sourceVersion) {
        this.sourceVersion = sourceVersion;
    }

    /**
     * <p>
     * The branch of the source code.
     * </p>
     * 
     * @return The branch of the source code.
     */

    public String getSourceVersion() {
        return this.sourceVersion;
    }

    /**
     * <p>
     * The branch of the source code.
     * </p>
     * 
     * @param sourceVersion
     *        The branch of the source code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceCode withSourceVersion(String sourceVersion) {
        setSourceVersion(sourceVersion);
        return this;
    }

    /**
     * <p>
     * The type of repository to use for the source code.
     * </p>
     * 
     * @param versionControl
     *        The type of repository to use for the source code.
     * @see VersionControl
     */

    public void setVersionControl(String versionControl) {
        this.versionControl = versionControl;
    }

    /**
     * <p>
     * The type of repository to use for the source code.
     * </p>
     * 
     * @return The type of repository to use for the source code.
     * @see VersionControl
     */

    public String getVersionControl() {
        return this.versionControl;
    }

    /**
     * <p>
     * The type of repository to use for the source code.
     * </p>
     * 
     * @param versionControl
     *        The type of repository to use for the source code.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VersionControl
     */

    public SourceCode withVersionControl(String versionControl) {
        setVersionControl(versionControl);
        return this;
    }

    /**
     * <p>
     * The type of repository to use for the source code.
     * </p>
     * 
     * @param versionControl
     *        The type of repository to use for the source code.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VersionControl
     */

    public SourceCode withVersionControl(VersionControl versionControl) {
        this.versionControl = versionControl.toString();
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
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getProjectName() != null)
            sb.append("ProjectName: ").append(getProjectName()).append(",");
        if (getSourceVersion() != null)
            sb.append("SourceVersion: ").append(getSourceVersion()).append(",");
        if (getVersionControl() != null)
            sb.append("VersionControl: ").append(getVersionControl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SourceCode == false)
            return false;
        SourceCode other = (SourceCode) obj;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getProjectName() == null ^ this.getProjectName() == null)
            return false;
        if (other.getProjectName() != null && other.getProjectName().equals(this.getProjectName()) == false)
            return false;
        if (other.getSourceVersion() == null ^ this.getSourceVersion() == null)
            return false;
        if (other.getSourceVersion() != null && other.getSourceVersion().equals(this.getSourceVersion()) == false)
            return false;
        if (other.getVersionControl() == null ^ this.getVersionControl() == null)
            return false;
        if (other.getVersionControl() != null && other.getVersionControl().equals(this.getVersionControl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getProjectName() == null) ? 0 : getProjectName().hashCode());
        hashCode = prime * hashCode + ((getSourceVersion() == null) ? 0 : getSourceVersion().hashCode());
        hashCode = prime * hashCode + ((getVersionControl() == null) ? 0 : getVersionControl().hashCode());
        return hashCode;
    }

    @Override
    public SourceCode clone() {
        try {
            return (SourceCode) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.migrationhubstrategyrecommendations.model.transform.SourceCodeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
