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
package com.amazonaws.services.codeartifact.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of a repository stored in AWS CodeArtifact. A CodeArtifact repository contains a set of package versions,
 * each of which maps to a set of assets. Repositories are polyglot—a single repository can contain packages of any
 * supported type. Each repository exposes endpoints for fetching and publishing packages using tools like the
 * <code>npm</code> CLI, the Maven CLI (<code>mvn</code>), and <code>pip</code>. You can create up to 100 repositories
 * per AWS account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/RepositoryDescription" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RepositoryDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the repository.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The 12-digit account number of the AWS account that manages the repository.
     * </p>
     */
    private String administratorAccount;
    /**
     * <p>
     * The name of the domain that contains the repository.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The 12-digit account number of the AWS account that owns the domain that contains the repository. It does not
     * include dashes or spaces.
     * </p>
     */
    private String domainOwner;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the repository.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * A text description of the repository.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A list of upstream repositories to associate with the repository. The order of the upstream repositories in the
     * list determines their priority order when AWS CodeArtifact looks for a requested package version. For more
     * information, see <a href="https://docs.aws.amazon.com/codeartifact/latest/ug/repos-upstream.html">Working with
     * upstream repositories</a>.
     * </p>
     */
    private java.util.List<UpstreamRepositoryInfo> upstreams;
    /**
     * <p>
     * An array of external connections associated with the repository.
     * </p>
     */
    private java.util.List<RepositoryExternalConnectionInfo> externalConnections;

    /**
     * <p>
     * The name of the repository.
     * </p>
     * 
     * @param name
     *        The name of the repository.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the repository.
     * </p>
     * 
     * @return The name of the repository.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the repository.
     * </p>
     * 
     * @param name
     *        The name of the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryDescription withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The 12-digit account number of the AWS account that manages the repository.
     * </p>
     * 
     * @param administratorAccount
     *        The 12-digit account number of the AWS account that manages the repository.
     */

    public void setAdministratorAccount(String administratorAccount) {
        this.administratorAccount = administratorAccount;
    }

    /**
     * <p>
     * The 12-digit account number of the AWS account that manages the repository.
     * </p>
     * 
     * @return The 12-digit account number of the AWS account that manages the repository.
     */

    public String getAdministratorAccount() {
        return this.administratorAccount;
    }

    /**
     * <p>
     * The 12-digit account number of the AWS account that manages the repository.
     * </p>
     * 
     * @param administratorAccount
     *        The 12-digit account number of the AWS account that manages the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryDescription withAdministratorAccount(String administratorAccount) {
        setAdministratorAccount(administratorAccount);
        return this;
    }

    /**
     * <p>
     * The name of the domain that contains the repository.
     * </p>
     * 
     * @param domainName
     *        The name of the domain that contains the repository.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of the domain that contains the repository.
     * </p>
     * 
     * @return The name of the domain that contains the repository.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The name of the domain that contains the repository.
     * </p>
     * 
     * @param domainName
     *        The name of the domain that contains the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryDescription withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The 12-digit account number of the AWS account that owns the domain that contains the repository. It does not
     * include dashes or spaces.
     * </p>
     * 
     * @param domainOwner
     *        The 12-digit account number of the AWS account that owns the domain that contains the repository. It does
     *        not include dashes or spaces.
     */

    public void setDomainOwner(String domainOwner) {
        this.domainOwner = domainOwner;
    }

    /**
     * <p>
     * The 12-digit account number of the AWS account that owns the domain that contains the repository. It does not
     * include dashes or spaces.
     * </p>
     * 
     * @return The 12-digit account number of the AWS account that owns the domain that contains the repository. It does
     *         not include dashes or spaces.
     */

    public String getDomainOwner() {
        return this.domainOwner;
    }

    /**
     * <p>
     * The 12-digit account number of the AWS account that owns the domain that contains the repository. It does not
     * include dashes or spaces.
     * </p>
     * 
     * @param domainOwner
     *        The 12-digit account number of the AWS account that owns the domain that contains the repository. It does
     *        not include dashes or spaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryDescription withDomainOwner(String domainOwner) {
        setDomainOwner(domainOwner);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the repository.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the repository.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the repository.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the repository.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the repository.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryDescription withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * A text description of the repository.
     * </p>
     * 
     * @param description
     *        A text description of the repository.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A text description of the repository.
     * </p>
     * 
     * @return A text description of the repository.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A text description of the repository.
     * </p>
     * 
     * @param description
     *        A text description of the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryDescription withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A list of upstream repositories to associate with the repository. The order of the upstream repositories in the
     * list determines their priority order when AWS CodeArtifact looks for a requested package version. For more
     * information, see <a href="https://docs.aws.amazon.com/codeartifact/latest/ug/repos-upstream.html">Working with
     * upstream repositories</a>.
     * </p>
     * 
     * @return A list of upstream repositories to associate with the repository. The order of the upstream repositories
     *         in the list determines their priority order when AWS CodeArtifact looks for a requested package version.
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/codeartifact/latest/ug/repos-upstream.html">Working with upstream
     *         repositories</a>.
     */

    public java.util.List<UpstreamRepositoryInfo> getUpstreams() {
        return upstreams;
    }

    /**
     * <p>
     * A list of upstream repositories to associate with the repository. The order of the upstream repositories in the
     * list determines their priority order when AWS CodeArtifact looks for a requested package version. For more
     * information, see <a href="https://docs.aws.amazon.com/codeartifact/latest/ug/repos-upstream.html">Working with
     * upstream repositories</a>.
     * </p>
     * 
     * @param upstreams
     *        A list of upstream repositories to associate with the repository. The order of the upstream repositories
     *        in the list determines their priority order when AWS CodeArtifact looks for a requested package version.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/codeartifact/latest/ug/repos-upstream.html">Working with upstream
     *        repositories</a>.
     */

    public void setUpstreams(java.util.Collection<UpstreamRepositoryInfo> upstreams) {
        if (upstreams == null) {
            this.upstreams = null;
            return;
        }

        this.upstreams = new java.util.ArrayList<UpstreamRepositoryInfo>(upstreams);
    }

    /**
     * <p>
     * A list of upstream repositories to associate with the repository. The order of the upstream repositories in the
     * list determines their priority order when AWS CodeArtifact looks for a requested package version. For more
     * information, see <a href="https://docs.aws.amazon.com/codeartifact/latest/ug/repos-upstream.html">Working with
     * upstream repositories</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUpstreams(java.util.Collection)} or {@link #withUpstreams(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param upstreams
     *        A list of upstream repositories to associate with the repository. The order of the upstream repositories
     *        in the list determines their priority order when AWS CodeArtifact looks for a requested package version.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/codeartifact/latest/ug/repos-upstream.html">Working with upstream
     *        repositories</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryDescription withUpstreams(UpstreamRepositoryInfo... upstreams) {
        if (this.upstreams == null) {
            setUpstreams(new java.util.ArrayList<UpstreamRepositoryInfo>(upstreams.length));
        }
        for (UpstreamRepositoryInfo ele : upstreams) {
            this.upstreams.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of upstream repositories to associate with the repository. The order of the upstream repositories in the
     * list determines their priority order when AWS CodeArtifact looks for a requested package version. For more
     * information, see <a href="https://docs.aws.amazon.com/codeartifact/latest/ug/repos-upstream.html">Working with
     * upstream repositories</a>.
     * </p>
     * 
     * @param upstreams
     *        A list of upstream repositories to associate with the repository. The order of the upstream repositories
     *        in the list determines their priority order when AWS CodeArtifact looks for a requested package version.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/codeartifact/latest/ug/repos-upstream.html">Working with upstream
     *        repositories</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryDescription withUpstreams(java.util.Collection<UpstreamRepositoryInfo> upstreams) {
        setUpstreams(upstreams);
        return this;
    }

    /**
     * <p>
     * An array of external connections associated with the repository.
     * </p>
     * 
     * @return An array of external connections associated with the repository.
     */

    public java.util.List<RepositoryExternalConnectionInfo> getExternalConnections() {
        return externalConnections;
    }

    /**
     * <p>
     * An array of external connections associated with the repository.
     * </p>
     * 
     * @param externalConnections
     *        An array of external connections associated with the repository.
     */

    public void setExternalConnections(java.util.Collection<RepositoryExternalConnectionInfo> externalConnections) {
        if (externalConnections == null) {
            this.externalConnections = null;
            return;
        }

        this.externalConnections = new java.util.ArrayList<RepositoryExternalConnectionInfo>(externalConnections);
    }

    /**
     * <p>
     * An array of external connections associated with the repository.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExternalConnections(java.util.Collection)} or {@link #withExternalConnections(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param externalConnections
     *        An array of external connections associated with the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryDescription withExternalConnections(RepositoryExternalConnectionInfo... externalConnections) {
        if (this.externalConnections == null) {
            setExternalConnections(new java.util.ArrayList<RepositoryExternalConnectionInfo>(externalConnections.length));
        }
        for (RepositoryExternalConnectionInfo ele : externalConnections) {
            this.externalConnections.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of external connections associated with the repository.
     * </p>
     * 
     * @param externalConnections
     *        An array of external connections associated with the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryDescription withExternalConnections(java.util.Collection<RepositoryExternalConnectionInfo> externalConnections) {
        setExternalConnections(externalConnections);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getAdministratorAccount() != null)
            sb.append("AdministratorAccount: ").append(getAdministratorAccount()).append(",");
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getDomainOwner() != null)
            sb.append("DomainOwner: ").append(getDomainOwner()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getUpstreams() != null)
            sb.append("Upstreams: ").append(getUpstreams()).append(",");
        if (getExternalConnections() != null)
            sb.append("ExternalConnections: ").append(getExternalConnections());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RepositoryDescription == false)
            return false;
        RepositoryDescription other = (RepositoryDescription) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getAdministratorAccount() == null ^ this.getAdministratorAccount() == null)
            return false;
        if (other.getAdministratorAccount() != null && other.getAdministratorAccount().equals(this.getAdministratorAccount()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getDomainOwner() == null ^ this.getDomainOwner() == null)
            return false;
        if (other.getDomainOwner() != null && other.getDomainOwner().equals(this.getDomainOwner()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getUpstreams() == null ^ this.getUpstreams() == null)
            return false;
        if (other.getUpstreams() != null && other.getUpstreams().equals(this.getUpstreams()) == false)
            return false;
        if (other.getExternalConnections() == null ^ this.getExternalConnections() == null)
            return false;
        if (other.getExternalConnections() != null && other.getExternalConnections().equals(this.getExternalConnections()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getAdministratorAccount() == null) ? 0 : getAdministratorAccount().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getDomainOwner() == null) ? 0 : getDomainOwner().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getUpstreams() == null) ? 0 : getUpstreams().hashCode());
        hashCode = prime * hashCode + ((getExternalConnections() == null) ? 0 : getExternalConnections().hashCode());
        return hashCode;
    }

    @Override
    public RepositoryDescription clone() {
        try {
            return (RepositoryDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codeartifact.model.transform.RepositoryDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
