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
package com.amazonaws.services.apprunner.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a source code repository.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/CodeRepository" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CodeRepository implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The location of the repository that contains the source code.
     * </p>
     */
    private String repositoryUrl;
    /**
     * <p>
     * The version that should be used within the source code repository.
     * </p>
     */
    private SourceCodeVersion sourceCodeVersion;
    /**
     * <p>
     * Configuration for building and running the service from a source code repository.
     * </p>
     */
    private CodeConfiguration codeConfiguration;

    /**
     * <p>
     * The location of the repository that contains the source code.
     * </p>
     * 
     * @param repositoryUrl
     *        The location of the repository that contains the source code.
     */

    public void setRepositoryUrl(String repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
    }

    /**
     * <p>
     * The location of the repository that contains the source code.
     * </p>
     * 
     * @return The location of the repository that contains the source code.
     */

    public String getRepositoryUrl() {
        return this.repositoryUrl;
    }

    /**
     * <p>
     * The location of the repository that contains the source code.
     * </p>
     * 
     * @param repositoryUrl
     *        The location of the repository that contains the source code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeRepository withRepositoryUrl(String repositoryUrl) {
        setRepositoryUrl(repositoryUrl);
        return this;
    }

    /**
     * <p>
     * The version that should be used within the source code repository.
     * </p>
     * 
     * @param sourceCodeVersion
     *        The version that should be used within the source code repository.
     */

    public void setSourceCodeVersion(SourceCodeVersion sourceCodeVersion) {
        this.sourceCodeVersion = sourceCodeVersion;
    }

    /**
     * <p>
     * The version that should be used within the source code repository.
     * </p>
     * 
     * @return The version that should be used within the source code repository.
     */

    public SourceCodeVersion getSourceCodeVersion() {
        return this.sourceCodeVersion;
    }

    /**
     * <p>
     * The version that should be used within the source code repository.
     * </p>
     * 
     * @param sourceCodeVersion
     *        The version that should be used within the source code repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeRepository withSourceCodeVersion(SourceCodeVersion sourceCodeVersion) {
        setSourceCodeVersion(sourceCodeVersion);
        return this;
    }

    /**
     * <p>
     * Configuration for building and running the service from a source code repository.
     * </p>
     * 
     * @param codeConfiguration
     *        Configuration for building and running the service from a source code repository.
     */

    public void setCodeConfiguration(CodeConfiguration codeConfiguration) {
        this.codeConfiguration = codeConfiguration;
    }

    /**
     * <p>
     * Configuration for building and running the service from a source code repository.
     * </p>
     * 
     * @return Configuration for building and running the service from a source code repository.
     */

    public CodeConfiguration getCodeConfiguration() {
        return this.codeConfiguration;
    }

    /**
     * <p>
     * Configuration for building and running the service from a source code repository.
     * </p>
     * 
     * @param codeConfiguration
     *        Configuration for building and running the service from a source code repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeRepository withCodeConfiguration(CodeConfiguration codeConfiguration) {
        setCodeConfiguration(codeConfiguration);
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
        if (getRepositoryUrl() != null)
            sb.append("RepositoryUrl: ").append(getRepositoryUrl()).append(",");
        if (getSourceCodeVersion() != null)
            sb.append("SourceCodeVersion: ").append(getSourceCodeVersion()).append(",");
        if (getCodeConfiguration() != null)
            sb.append("CodeConfiguration: ").append(getCodeConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CodeRepository == false)
            return false;
        CodeRepository other = (CodeRepository) obj;
        if (other.getRepositoryUrl() == null ^ this.getRepositoryUrl() == null)
            return false;
        if (other.getRepositoryUrl() != null && other.getRepositoryUrl().equals(this.getRepositoryUrl()) == false)
            return false;
        if (other.getSourceCodeVersion() == null ^ this.getSourceCodeVersion() == null)
            return false;
        if (other.getSourceCodeVersion() != null && other.getSourceCodeVersion().equals(this.getSourceCodeVersion()) == false)
            return false;
        if (other.getCodeConfiguration() == null ^ this.getCodeConfiguration() == null)
            return false;
        if (other.getCodeConfiguration() != null && other.getCodeConfiguration().equals(this.getCodeConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRepositoryUrl() == null) ? 0 : getRepositoryUrl().hashCode());
        hashCode = prime * hashCode + ((getSourceCodeVersion() == null) ? 0 : getSourceCodeVersion().hashCode());
        hashCode = prime * hashCode + ((getCodeConfiguration() == null) ? 0 : getCodeConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public CodeRepository clone() {
        try {
            return (CodeRepository) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apprunner.model.transform.CodeRepositoryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
