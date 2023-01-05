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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The subtype containing details about the Codestar connection <code>Type</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/CodeStarParameters" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CodeStarParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The CodeStar ARN, which is the connection between Service Catalog and the external repository.
     * </p>
     */
    private String connectionArn;
    /**
     * <p>
     * The specific repository where the product’s artifact-to-be-synced resides, formatted as "Account/Repo."
     * </p>
     */
    private String repository;
    /**
     * <p>
     * The specific branch where the artifact resides.
     * </p>
     */
    private String branch;
    /**
     * <p>
     * The absolute path wehre the artifact resides within the repo and branch, formatted as "folder/file.json."
     * </p>
     */
    private String artifactPath;

    /**
     * <p>
     * The CodeStar ARN, which is the connection between Service Catalog and the external repository.
     * </p>
     * 
     * @param connectionArn
     *        The CodeStar ARN, which is the connection between Service Catalog and the external repository.
     */

    public void setConnectionArn(String connectionArn) {
        this.connectionArn = connectionArn;
    }

    /**
     * <p>
     * The CodeStar ARN, which is the connection between Service Catalog and the external repository.
     * </p>
     * 
     * @return The CodeStar ARN, which is the connection between Service Catalog and the external repository.
     */

    public String getConnectionArn() {
        return this.connectionArn;
    }

    /**
     * <p>
     * The CodeStar ARN, which is the connection between Service Catalog and the external repository.
     * </p>
     * 
     * @param connectionArn
     *        The CodeStar ARN, which is the connection between Service Catalog and the external repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeStarParameters withConnectionArn(String connectionArn) {
        setConnectionArn(connectionArn);
        return this;
    }

    /**
     * <p>
     * The specific repository where the product’s artifact-to-be-synced resides, formatted as "Account/Repo."
     * </p>
     * 
     * @param repository
     *        The specific repository where the product’s artifact-to-be-synced resides, formatted as "Account/Repo."
     */

    public void setRepository(String repository) {
        this.repository = repository;
    }

    /**
     * <p>
     * The specific repository where the product’s artifact-to-be-synced resides, formatted as "Account/Repo."
     * </p>
     * 
     * @return The specific repository where the product’s artifact-to-be-synced resides, formatted as "Account/Repo."
     */

    public String getRepository() {
        return this.repository;
    }

    /**
     * <p>
     * The specific repository where the product’s artifact-to-be-synced resides, formatted as "Account/Repo."
     * </p>
     * 
     * @param repository
     *        The specific repository where the product’s artifact-to-be-synced resides, formatted as "Account/Repo."
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeStarParameters withRepository(String repository) {
        setRepository(repository);
        return this;
    }

    /**
     * <p>
     * The specific branch where the artifact resides.
     * </p>
     * 
     * @param branch
     *        The specific branch where the artifact resides.
     */

    public void setBranch(String branch) {
        this.branch = branch;
    }

    /**
     * <p>
     * The specific branch where the artifact resides.
     * </p>
     * 
     * @return The specific branch where the artifact resides.
     */

    public String getBranch() {
        return this.branch;
    }

    /**
     * <p>
     * The specific branch where the artifact resides.
     * </p>
     * 
     * @param branch
     *        The specific branch where the artifact resides.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeStarParameters withBranch(String branch) {
        setBranch(branch);
        return this;
    }

    /**
     * <p>
     * The absolute path wehre the artifact resides within the repo and branch, formatted as "folder/file.json."
     * </p>
     * 
     * @param artifactPath
     *        The absolute path wehre the artifact resides within the repo and branch, formatted as "folder/file.json."
     */

    public void setArtifactPath(String artifactPath) {
        this.artifactPath = artifactPath;
    }

    /**
     * <p>
     * The absolute path wehre the artifact resides within the repo and branch, formatted as "folder/file.json."
     * </p>
     * 
     * @return The absolute path wehre the artifact resides within the repo and branch, formatted as "folder/file.json."
     */

    public String getArtifactPath() {
        return this.artifactPath;
    }

    /**
     * <p>
     * The absolute path wehre the artifact resides within the repo and branch, formatted as "folder/file.json."
     * </p>
     * 
     * @param artifactPath
     *        The absolute path wehre the artifact resides within the repo and branch, formatted as "folder/file.json."
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeStarParameters withArtifactPath(String artifactPath) {
        setArtifactPath(artifactPath);
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
        if (getConnectionArn() != null)
            sb.append("ConnectionArn: ").append(getConnectionArn()).append(",");
        if (getRepository() != null)
            sb.append("Repository: ").append(getRepository()).append(",");
        if (getBranch() != null)
            sb.append("Branch: ").append(getBranch()).append(",");
        if (getArtifactPath() != null)
            sb.append("ArtifactPath: ").append(getArtifactPath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CodeStarParameters == false)
            return false;
        CodeStarParameters other = (CodeStarParameters) obj;
        if (other.getConnectionArn() == null ^ this.getConnectionArn() == null)
            return false;
        if (other.getConnectionArn() != null && other.getConnectionArn().equals(this.getConnectionArn()) == false)
            return false;
        if (other.getRepository() == null ^ this.getRepository() == null)
            return false;
        if (other.getRepository() != null && other.getRepository().equals(this.getRepository()) == false)
            return false;
        if (other.getBranch() == null ^ this.getBranch() == null)
            return false;
        if (other.getBranch() != null && other.getBranch().equals(this.getBranch()) == false)
            return false;
        if (other.getArtifactPath() == null ^ this.getArtifactPath() == null)
            return false;
        if (other.getArtifactPath() != null && other.getArtifactPath().equals(this.getArtifactPath()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectionArn() == null) ? 0 : getConnectionArn().hashCode());
        hashCode = prime * hashCode + ((getRepository() == null) ? 0 : getRepository().hashCode());
        hashCode = prime * hashCode + ((getBranch() == null) ? 0 : getBranch().hashCode());
        hashCode = prime * hashCode + ((getArtifactPath() == null) ? 0 : getArtifactPath().hashCode());
        return hashCode;
    }

    @Override
    public CodeStarParameters clone() {
        try {
            return (CodeStarParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servicecatalog.model.transform.CodeStarParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
