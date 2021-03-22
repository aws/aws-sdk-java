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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/CreateRepository" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRepositoryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the domain that contains the created repository.
     * </p>
     */
    private String domain;
    /**
     * <p>
     * The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces.
     * </p>
     */
    private String domainOwner;
    /**
     * <p>
     * The name of the repository to create.
     * </p>
     */
    private String repository;
    /**
     * <p>
     * A description of the created repository.
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
    private java.util.List<UpstreamRepository> upstreams;
    /**
     * <p>
     * One or more tag key-value pairs for the repository.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the domain that contains the created repository.
     * </p>
     * 
     * @param domain
     *        The name of the domain that contains the created repository.
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The name of the domain that contains the created repository.
     * </p>
     * 
     * @return The name of the domain that contains the created repository.
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The name of the domain that contains the created repository.
     * </p>
     * 
     * @param domain
     *        The name of the domain that contains the created repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRepositoryRequest withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces.
     * </p>
     * 
     * @param domainOwner
     *        The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces.
     */

    public void setDomainOwner(String domainOwner) {
        this.domainOwner = domainOwner;
    }

    /**
     * <p>
     * The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces.
     * </p>
     * 
     * @return The 12-digit account number of the AWS account that owns the domain. It does not include dashes or
     *         spaces.
     */

    public String getDomainOwner() {
        return this.domainOwner;
    }

    /**
     * <p>
     * The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces.
     * </p>
     * 
     * @param domainOwner
     *        The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRepositoryRequest withDomainOwner(String domainOwner) {
        setDomainOwner(domainOwner);
        return this;
    }

    /**
     * <p>
     * The name of the repository to create.
     * </p>
     * 
     * @param repository
     *        The name of the repository to create.
     */

    public void setRepository(String repository) {
        this.repository = repository;
    }

    /**
     * <p>
     * The name of the repository to create.
     * </p>
     * 
     * @return The name of the repository to create.
     */

    public String getRepository() {
        return this.repository;
    }

    /**
     * <p>
     * The name of the repository to create.
     * </p>
     * 
     * @param repository
     *        The name of the repository to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRepositoryRequest withRepository(String repository) {
        setRepository(repository);
        return this;
    }

    /**
     * <p>
     * A description of the created repository.
     * </p>
     * 
     * @param description
     *        A description of the created repository.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the created repository.
     * </p>
     * 
     * @return A description of the created repository.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the created repository.
     * </p>
     * 
     * @param description
     *        A description of the created repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRepositoryRequest withDescription(String description) {
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

    public java.util.List<UpstreamRepository> getUpstreams() {
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

    public void setUpstreams(java.util.Collection<UpstreamRepository> upstreams) {
        if (upstreams == null) {
            this.upstreams = null;
            return;
        }

        this.upstreams = new java.util.ArrayList<UpstreamRepository>(upstreams);
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

    public CreateRepositoryRequest withUpstreams(UpstreamRepository... upstreams) {
        if (this.upstreams == null) {
            setUpstreams(new java.util.ArrayList<UpstreamRepository>(upstreams.length));
        }
        for (UpstreamRepository ele : upstreams) {
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

    public CreateRepositoryRequest withUpstreams(java.util.Collection<UpstreamRepository> upstreams) {
        setUpstreams(upstreams);
        return this;
    }

    /**
     * <p>
     * One or more tag key-value pairs for the repository.
     * </p>
     * 
     * @return One or more tag key-value pairs for the repository.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * One or more tag key-value pairs for the repository.
     * </p>
     * 
     * @param tags
     *        One or more tag key-value pairs for the repository.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * One or more tag key-value pairs for the repository.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        One or more tag key-value pairs for the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRepositoryRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more tag key-value pairs for the repository.
     * </p>
     * 
     * @param tags
     *        One or more tag key-value pairs for the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRepositoryRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain()).append(",");
        if (getDomainOwner() != null)
            sb.append("DomainOwner: ").append(getDomainOwner()).append(",");
        if (getRepository() != null)
            sb.append("Repository: ").append(getRepository()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getUpstreams() != null)
            sb.append("Upstreams: ").append(getUpstreams()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRepositoryRequest == false)
            return false;
        CreateRepositoryRequest other = (CreateRepositoryRequest) obj;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getDomainOwner() == null ^ this.getDomainOwner() == null)
            return false;
        if (other.getDomainOwner() != null && other.getDomainOwner().equals(this.getDomainOwner()) == false)
            return false;
        if (other.getRepository() == null ^ this.getRepository() == null)
            return false;
        if (other.getRepository() != null && other.getRepository().equals(this.getRepository()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getUpstreams() == null ^ this.getUpstreams() == null)
            return false;
        if (other.getUpstreams() != null && other.getUpstreams().equals(this.getUpstreams()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getDomainOwner() == null) ? 0 : getDomainOwner().hashCode());
        hashCode = prime * hashCode + ((getRepository() == null) ? 0 : getRepository().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getUpstreams() == null) ? 0 : getUpstreams().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateRepositoryRequest clone() {
        return (CreateRepositoryRequest) super.clone();
    }

}
