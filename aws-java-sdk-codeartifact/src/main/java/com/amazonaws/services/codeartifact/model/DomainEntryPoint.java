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
package com.amazonaws.services.codeartifact.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about how a package originally entered the CodeArtifact domain. For packages published directly to
 * CodeArtifact, the entry point is the repository it was published to. For packages ingested from an external
 * repository, the entry point is the external connection that it was ingested from. An external connection is a
 * CodeArtifact repository that is connected to an external repository such as the npm registry or NuGet gallery.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/DomainEntryPoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DomainEntryPoint implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the repository that a package was originally published to.
     * </p>
     */
    private String repositoryName;
    /**
     * <p>
     * The name of the external connection that a package was ingested from.
     * </p>
     */
    private String externalConnectionName;

    /**
     * <p>
     * The name of the repository that a package was originally published to.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository that a package was originally published to.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository that a package was originally published to.
     * </p>
     * 
     * @return The name of the repository that a package was originally published to.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The name of the repository that a package was originally published to.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository that a package was originally published to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainEntryPoint withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * The name of the external connection that a package was ingested from.
     * </p>
     * 
     * @param externalConnectionName
     *        The name of the external connection that a package was ingested from.
     */

    public void setExternalConnectionName(String externalConnectionName) {
        this.externalConnectionName = externalConnectionName;
    }

    /**
     * <p>
     * The name of the external connection that a package was ingested from.
     * </p>
     * 
     * @return The name of the external connection that a package was ingested from.
     */

    public String getExternalConnectionName() {
        return this.externalConnectionName;
    }

    /**
     * <p>
     * The name of the external connection that a package was ingested from.
     * </p>
     * 
     * @param externalConnectionName
     *        The name of the external connection that a package was ingested from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainEntryPoint withExternalConnectionName(String externalConnectionName) {
        setExternalConnectionName(externalConnectionName);
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
        if (getRepositoryName() != null)
            sb.append("RepositoryName: ").append(getRepositoryName()).append(",");
        if (getExternalConnectionName() != null)
            sb.append("ExternalConnectionName: ").append(getExternalConnectionName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DomainEntryPoint == false)
            return false;
        DomainEntryPoint other = (DomainEntryPoint) obj;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getExternalConnectionName() == null ^ this.getExternalConnectionName() == null)
            return false;
        if (other.getExternalConnectionName() != null && other.getExternalConnectionName().equals(this.getExternalConnectionName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getExternalConnectionName() == null) ? 0 : getExternalConnectionName().hashCode());
        return hashCode;
    }

    @Override
    public DomainEntryPoint clone() {
        try {
            return (DomainEntryPoint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codeartifact.model.transform.DomainEntryPointMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
