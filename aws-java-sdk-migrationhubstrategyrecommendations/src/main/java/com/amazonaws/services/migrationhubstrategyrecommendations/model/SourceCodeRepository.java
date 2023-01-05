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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/SourceCodeRepository"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SourceCodeRepository implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The branch of the source code.
     * </p>
     */
    private String branch;
    /**
     * <p>
     * The name of the project.
     * </p>
     */
    private String projectName;
    /**
     * <p>
     * The repository name for the source code.
     * </p>
     */
    private String repository;
    /**
     * <p>
     * The type of repository to use for the source code.
     * </p>
     */
    private String versionControlType;

    /**
     * <p>
     * The branch of the source code.
     * </p>
     * 
     * @param branch
     *        The branch of the source code.
     */

    public void setBranch(String branch) {
        this.branch = branch;
    }

    /**
     * <p>
     * The branch of the source code.
     * </p>
     * 
     * @return The branch of the source code.
     */

    public String getBranch() {
        return this.branch;
    }

    /**
     * <p>
     * The branch of the source code.
     * </p>
     * 
     * @param branch
     *        The branch of the source code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceCodeRepository withBranch(String branch) {
        setBranch(branch);
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

    public SourceCodeRepository withProjectName(String projectName) {
        setProjectName(projectName);
        return this;
    }

    /**
     * <p>
     * The repository name for the source code.
     * </p>
     * 
     * @param repository
     *        The repository name for the source code.
     */

    public void setRepository(String repository) {
        this.repository = repository;
    }

    /**
     * <p>
     * The repository name for the source code.
     * </p>
     * 
     * @return The repository name for the source code.
     */

    public String getRepository() {
        return this.repository;
    }

    /**
     * <p>
     * The repository name for the source code.
     * </p>
     * 
     * @param repository
     *        The repository name for the source code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceCodeRepository withRepository(String repository) {
        setRepository(repository);
        return this;
    }

    /**
     * <p>
     * The type of repository to use for the source code.
     * </p>
     * 
     * @param versionControlType
     *        The type of repository to use for the source code.
     */

    public void setVersionControlType(String versionControlType) {
        this.versionControlType = versionControlType;
    }

    /**
     * <p>
     * The type of repository to use for the source code.
     * </p>
     * 
     * @return The type of repository to use for the source code.
     */

    public String getVersionControlType() {
        return this.versionControlType;
    }

    /**
     * <p>
     * The type of repository to use for the source code.
     * </p>
     * 
     * @param versionControlType
     *        The type of repository to use for the source code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceCodeRepository withVersionControlType(String versionControlType) {
        setVersionControlType(versionControlType);
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
        if (getBranch() != null)
            sb.append("Branch: ").append(getBranch()).append(",");
        if (getProjectName() != null)
            sb.append("ProjectName: ").append(getProjectName()).append(",");
        if (getRepository() != null)
            sb.append("Repository: ").append(getRepository()).append(",");
        if (getVersionControlType() != null)
            sb.append("VersionControlType: ").append(getVersionControlType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SourceCodeRepository == false)
            return false;
        SourceCodeRepository other = (SourceCodeRepository) obj;
        if (other.getBranch() == null ^ this.getBranch() == null)
            return false;
        if (other.getBranch() != null && other.getBranch().equals(this.getBranch()) == false)
            return false;
        if (other.getProjectName() == null ^ this.getProjectName() == null)
            return false;
        if (other.getProjectName() != null && other.getProjectName().equals(this.getProjectName()) == false)
            return false;
        if (other.getRepository() == null ^ this.getRepository() == null)
            return false;
        if (other.getRepository() != null && other.getRepository().equals(this.getRepository()) == false)
            return false;
        if (other.getVersionControlType() == null ^ this.getVersionControlType() == null)
            return false;
        if (other.getVersionControlType() != null && other.getVersionControlType().equals(this.getVersionControlType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBranch() == null) ? 0 : getBranch().hashCode());
        hashCode = prime * hashCode + ((getProjectName() == null) ? 0 : getProjectName().hashCode());
        hashCode = prime * hashCode + ((getRepository() == null) ? 0 : getRepository().hashCode());
        hashCode = prime * hashCode + ((getVersionControlType() == null) ? 0 : getVersionControlType().hashCode());
        return hashCode;
    }

    @Override
    public SourceCodeRepository clone() {
        try {
            return (SourceCodeRepository) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.migrationhubstrategyrecommendations.model.transform.SourceCodeRepositoryMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
