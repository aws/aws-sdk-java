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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/UpdatePackageVersionsStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdatePackageVersionsStatusRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the domain that contains the repository that contains the package versions with a status to be
     * updated.
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
     * The repository that contains the package versions with the status you want to update.
     * </p>
     */
    private String repository;
    /**
     * <p>
     * A format that specifies the type of the package with the statuses to update. The valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>npm</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pypi</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>maven</code>
     * </p>
     * </li>
     * </ul>
     */
    private String format;
    /**
     * <p>
     * The namespace of the package. The package component that specifies its namespace depends on its type. For
     * example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The namespace of a Maven package is its <code>groupId</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The namespace of an npm package is its <code>scope</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * A Python package does not contain a corresponding component, so Python packages do not have a namespace.
     * </p>
     * </li>
     * </ul>
     */
    private String namespace;
    /**
     * <p>
     * The name of the package with the version statuses to update.
     * </p>
     */
    private String packageValue;
    /**
     * <p>
     * An array of strings that specify the versions of the package with the statuses to update.
     * </p>
     */
    private java.util.List<String> versions;
    /**
     * <p>
     * A map of package versions and package version revisions. The map <code>key</code> is the package version (for
     * example, <code>3.5.2</code>), and the map <code>value</code> is the package version revision.
     * </p>
     */
    private java.util.Map<String, String> versionRevisions;
    /**
     * <p>
     * The package version’s expected status before it is updated. If <code>expectedStatus</code> is provided, the
     * package version's status is updated only if its status at the time <code>UpdatePackageVersionsStatus</code> is
     * called matches <code>expectedStatus</code>.
     * </p>
     */
    private String expectedStatus;
    /**
     * <p>
     * The status you want to change the package version status to.
     * </p>
     */
    private String targetStatus;

    /**
     * <p>
     * The name of the domain that contains the repository that contains the package versions with a status to be
     * updated.
     * </p>
     * 
     * @param domain
     *        The name of the domain that contains the repository that contains the package versions with a status to be
     *        updated.
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The name of the domain that contains the repository that contains the package versions with a status to be
     * updated.
     * </p>
     * 
     * @return The name of the domain that contains the repository that contains the package versions with a status to
     *         be updated.
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The name of the domain that contains the repository that contains the package versions with a status to be
     * updated.
     * </p>
     * 
     * @param domain
     *        The name of the domain that contains the repository that contains the package versions with a status to be
     *        updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePackageVersionsStatusRequest withDomain(String domain) {
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

    public UpdatePackageVersionsStatusRequest withDomainOwner(String domainOwner) {
        setDomainOwner(domainOwner);
        return this;
    }

    /**
     * <p>
     * The repository that contains the package versions with the status you want to update.
     * </p>
     * 
     * @param repository
     *        The repository that contains the package versions with the status you want to update.
     */

    public void setRepository(String repository) {
        this.repository = repository;
    }

    /**
     * <p>
     * The repository that contains the package versions with the status you want to update.
     * </p>
     * 
     * @return The repository that contains the package versions with the status you want to update.
     */

    public String getRepository() {
        return this.repository;
    }

    /**
     * <p>
     * The repository that contains the package versions with the status you want to update.
     * </p>
     * 
     * @param repository
     *        The repository that contains the package versions with the status you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePackageVersionsStatusRequest withRepository(String repository) {
        setRepository(repository);
        return this;
    }

    /**
     * <p>
     * A format that specifies the type of the package with the statuses to update. The valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>npm</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pypi</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>maven</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param format
     *        A format that specifies the type of the package with the statuses to update. The valid values are: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>npm</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pypi</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>maven</code>
     *        </p>
     *        </li>
     * @see PackageFormat
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * A format that specifies the type of the package with the statuses to update. The valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>npm</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pypi</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>maven</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return A format that specifies the type of the package with the statuses to update. The valid values are: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>npm</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>pypi</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>maven</code>
     *         </p>
     *         </li>
     * @see PackageFormat
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * A format that specifies the type of the package with the statuses to update. The valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>npm</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pypi</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>maven</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param format
     *        A format that specifies the type of the package with the statuses to update. The valid values are: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>npm</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pypi</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>maven</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageFormat
     */

    public UpdatePackageVersionsStatusRequest withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * A format that specifies the type of the package with the statuses to update. The valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>npm</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pypi</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>maven</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param format
     *        A format that specifies the type of the package with the statuses to update. The valid values are: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>npm</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pypi</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>maven</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageFormat
     */

    public UpdatePackageVersionsStatusRequest withFormat(PackageFormat format) {
        this.format = format.toString();
        return this;
    }

    /**
     * <p>
     * The namespace of the package. The package component that specifies its namespace depends on its type. For
     * example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The namespace of a Maven package is its <code>groupId</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The namespace of an npm package is its <code>scope</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * A Python package does not contain a corresponding component, so Python packages do not have a namespace.
     * </p>
     * </li>
     * </ul>
     * 
     * @param namespace
     *        The namespace of the package. The package component that specifies its namespace depends on its type. For
     *        example: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The namespace of a Maven package is its <code>groupId</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The namespace of an npm package is its <code>scope</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A Python package does not contain a corresponding component, so Python packages do not have a namespace.
     *        </p>
     *        </li>
     */

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The namespace of the package. The package component that specifies its namespace depends on its type. For
     * example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The namespace of a Maven package is its <code>groupId</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The namespace of an npm package is its <code>scope</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * A Python package does not contain a corresponding component, so Python packages do not have a namespace.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The namespace of the package. The package component that specifies its namespace depends on its type. For
     *         example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The namespace of a Maven package is its <code>groupId</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The namespace of an npm package is its <code>scope</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A Python package does not contain a corresponding component, so Python packages do not have a namespace.
     *         </p>
     *         </li>
     */

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * The namespace of the package. The package component that specifies its namespace depends on its type. For
     * example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The namespace of a Maven package is its <code>groupId</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The namespace of an npm package is its <code>scope</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * A Python package does not contain a corresponding component, so Python packages do not have a namespace.
     * </p>
     * </li>
     * </ul>
     * 
     * @param namespace
     *        The namespace of the package. The package component that specifies its namespace depends on its type. For
     *        example: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The namespace of a Maven package is its <code>groupId</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The namespace of an npm package is its <code>scope</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A Python package does not contain a corresponding component, so Python packages do not have a namespace.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePackageVersionsStatusRequest withNamespace(String namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * <p>
     * The name of the package with the version statuses to update.
     * </p>
     * 
     * @param packageValue
     *        The name of the package with the version statuses to update.
     */

    public void setPackage(String packageValue) {
        this.packageValue = packageValue;
    }

    /**
     * <p>
     * The name of the package with the version statuses to update.
     * </p>
     * 
     * @return The name of the package with the version statuses to update.
     */

    public String getPackage() {
        return this.packageValue;
    }

    /**
     * <p>
     * The name of the package with the version statuses to update.
     * </p>
     * 
     * @param packageValue
     *        The name of the package with the version statuses to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePackageVersionsStatusRequest withPackage(String packageValue) {
        setPackage(packageValue);
        return this;
    }

    /**
     * <p>
     * An array of strings that specify the versions of the package with the statuses to update.
     * </p>
     * 
     * @return An array of strings that specify the versions of the package with the statuses to update.
     */

    public java.util.List<String> getVersions() {
        return versions;
    }

    /**
     * <p>
     * An array of strings that specify the versions of the package with the statuses to update.
     * </p>
     * 
     * @param versions
     *        An array of strings that specify the versions of the package with the statuses to update.
     */

    public void setVersions(java.util.Collection<String> versions) {
        if (versions == null) {
            this.versions = null;
            return;
        }

        this.versions = new java.util.ArrayList<String>(versions);
    }

    /**
     * <p>
     * An array of strings that specify the versions of the package with the statuses to update.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVersions(java.util.Collection)} or {@link #withVersions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param versions
     *        An array of strings that specify the versions of the package with the statuses to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePackageVersionsStatusRequest withVersions(String... versions) {
        if (this.versions == null) {
            setVersions(new java.util.ArrayList<String>(versions.length));
        }
        for (String ele : versions) {
            this.versions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of strings that specify the versions of the package with the statuses to update.
     * </p>
     * 
     * @param versions
     *        An array of strings that specify the versions of the package with the statuses to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePackageVersionsStatusRequest withVersions(java.util.Collection<String> versions) {
        setVersions(versions);
        return this;
    }

    /**
     * <p>
     * A map of package versions and package version revisions. The map <code>key</code> is the package version (for
     * example, <code>3.5.2</code>), and the map <code>value</code> is the package version revision.
     * </p>
     * 
     * @return A map of package versions and package version revisions. The map <code>key</code> is the package version
     *         (for example, <code>3.5.2</code>), and the map <code>value</code> is the package version revision.
     */

    public java.util.Map<String, String> getVersionRevisions() {
        return versionRevisions;
    }

    /**
     * <p>
     * A map of package versions and package version revisions. The map <code>key</code> is the package version (for
     * example, <code>3.5.2</code>), and the map <code>value</code> is the package version revision.
     * </p>
     * 
     * @param versionRevisions
     *        A map of package versions and package version revisions. The map <code>key</code> is the package version
     *        (for example, <code>3.5.2</code>), and the map <code>value</code> is the package version revision.
     */

    public void setVersionRevisions(java.util.Map<String, String> versionRevisions) {
        this.versionRevisions = versionRevisions;
    }

    /**
     * <p>
     * A map of package versions and package version revisions. The map <code>key</code> is the package version (for
     * example, <code>3.5.2</code>), and the map <code>value</code> is the package version revision.
     * </p>
     * 
     * @param versionRevisions
     *        A map of package versions and package version revisions. The map <code>key</code> is the package version
     *        (for example, <code>3.5.2</code>), and the map <code>value</code> is the package version revision.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePackageVersionsStatusRequest withVersionRevisions(java.util.Map<String, String> versionRevisions) {
        setVersionRevisions(versionRevisions);
        return this;
    }

    /**
     * Add a single VersionRevisions entry
     *
     * @see UpdatePackageVersionsStatusRequest#withVersionRevisions
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePackageVersionsStatusRequest addVersionRevisionsEntry(String key, String value) {
        if (null == this.versionRevisions) {
            this.versionRevisions = new java.util.HashMap<String, String>();
        }
        if (this.versionRevisions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.versionRevisions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into VersionRevisions.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePackageVersionsStatusRequest clearVersionRevisionsEntries() {
        this.versionRevisions = null;
        return this;
    }

    /**
     * <p>
     * The package version’s expected status before it is updated. If <code>expectedStatus</code> is provided, the
     * package version's status is updated only if its status at the time <code>UpdatePackageVersionsStatus</code> is
     * called matches <code>expectedStatus</code>.
     * </p>
     * 
     * @param expectedStatus
     *        The package version’s expected status before it is updated. If <code>expectedStatus</code> is provided,
     *        the package version's status is updated only if its status at the time
     *        <code>UpdatePackageVersionsStatus</code> is called matches <code>expectedStatus</code>.
     * @see PackageVersionStatus
     */

    public void setExpectedStatus(String expectedStatus) {
        this.expectedStatus = expectedStatus;
    }

    /**
     * <p>
     * The package version’s expected status before it is updated. If <code>expectedStatus</code> is provided, the
     * package version's status is updated only if its status at the time <code>UpdatePackageVersionsStatus</code> is
     * called matches <code>expectedStatus</code>.
     * </p>
     * 
     * @return The package version’s expected status before it is updated. If <code>expectedStatus</code> is provided,
     *         the package version's status is updated only if its status at the time
     *         <code>UpdatePackageVersionsStatus</code> is called matches <code>expectedStatus</code>.
     * @see PackageVersionStatus
     */

    public String getExpectedStatus() {
        return this.expectedStatus;
    }

    /**
     * <p>
     * The package version’s expected status before it is updated. If <code>expectedStatus</code> is provided, the
     * package version's status is updated only if its status at the time <code>UpdatePackageVersionsStatus</code> is
     * called matches <code>expectedStatus</code>.
     * </p>
     * 
     * @param expectedStatus
     *        The package version’s expected status before it is updated. If <code>expectedStatus</code> is provided,
     *        the package version's status is updated only if its status at the time
     *        <code>UpdatePackageVersionsStatus</code> is called matches <code>expectedStatus</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageVersionStatus
     */

    public UpdatePackageVersionsStatusRequest withExpectedStatus(String expectedStatus) {
        setExpectedStatus(expectedStatus);
        return this;
    }

    /**
     * <p>
     * The package version’s expected status before it is updated. If <code>expectedStatus</code> is provided, the
     * package version's status is updated only if its status at the time <code>UpdatePackageVersionsStatus</code> is
     * called matches <code>expectedStatus</code>.
     * </p>
     * 
     * @param expectedStatus
     *        The package version’s expected status before it is updated. If <code>expectedStatus</code> is provided,
     *        the package version's status is updated only if its status at the time
     *        <code>UpdatePackageVersionsStatus</code> is called matches <code>expectedStatus</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageVersionStatus
     */

    public UpdatePackageVersionsStatusRequest withExpectedStatus(PackageVersionStatus expectedStatus) {
        this.expectedStatus = expectedStatus.toString();
        return this;
    }

    /**
     * <p>
     * The status you want to change the package version status to.
     * </p>
     * 
     * @param targetStatus
     *        The status you want to change the package version status to.
     * @see PackageVersionStatus
     */

    public void setTargetStatus(String targetStatus) {
        this.targetStatus = targetStatus;
    }

    /**
     * <p>
     * The status you want to change the package version status to.
     * </p>
     * 
     * @return The status you want to change the package version status to.
     * @see PackageVersionStatus
     */

    public String getTargetStatus() {
        return this.targetStatus;
    }

    /**
     * <p>
     * The status you want to change the package version status to.
     * </p>
     * 
     * @param targetStatus
     *        The status you want to change the package version status to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageVersionStatus
     */

    public UpdatePackageVersionsStatusRequest withTargetStatus(String targetStatus) {
        setTargetStatus(targetStatus);
        return this;
    }

    /**
     * <p>
     * The status you want to change the package version status to.
     * </p>
     * 
     * @param targetStatus
     *        The status you want to change the package version status to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageVersionStatus
     */

    public UpdatePackageVersionsStatusRequest withTargetStatus(PackageVersionStatus targetStatus) {
        this.targetStatus = targetStatus.toString();
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
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat()).append(",");
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace()).append(",");
        if (getPackage() != null)
            sb.append("Package: ").append(getPackage()).append(",");
        if (getVersions() != null)
            sb.append("Versions: ").append(getVersions()).append(",");
        if (getVersionRevisions() != null)
            sb.append("VersionRevisions: ").append(getVersionRevisions()).append(",");
        if (getExpectedStatus() != null)
            sb.append("ExpectedStatus: ").append(getExpectedStatus()).append(",");
        if (getTargetStatus() != null)
            sb.append("TargetStatus: ").append(getTargetStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdatePackageVersionsStatusRequest == false)
            return false;
        UpdatePackageVersionsStatusRequest other = (UpdatePackageVersionsStatusRequest) obj;
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
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        if (other.getPackage() == null ^ this.getPackage() == null)
            return false;
        if (other.getPackage() != null && other.getPackage().equals(this.getPackage()) == false)
            return false;
        if (other.getVersions() == null ^ this.getVersions() == null)
            return false;
        if (other.getVersions() != null && other.getVersions().equals(this.getVersions()) == false)
            return false;
        if (other.getVersionRevisions() == null ^ this.getVersionRevisions() == null)
            return false;
        if (other.getVersionRevisions() != null && other.getVersionRevisions().equals(this.getVersionRevisions()) == false)
            return false;
        if (other.getExpectedStatus() == null ^ this.getExpectedStatus() == null)
            return false;
        if (other.getExpectedStatus() != null && other.getExpectedStatus().equals(this.getExpectedStatus()) == false)
            return false;
        if (other.getTargetStatus() == null ^ this.getTargetStatus() == null)
            return false;
        if (other.getTargetStatus() != null && other.getTargetStatus().equals(this.getTargetStatus()) == false)
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
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getPackage() == null) ? 0 : getPackage().hashCode());
        hashCode = prime * hashCode + ((getVersions() == null) ? 0 : getVersions().hashCode());
        hashCode = prime * hashCode + ((getVersionRevisions() == null) ? 0 : getVersionRevisions().hashCode());
        hashCode = prime * hashCode + ((getExpectedStatus() == null) ? 0 : getExpectedStatus().hashCode());
        hashCode = prime * hashCode + ((getTargetStatus() == null) ? 0 : getTargetStatus().hashCode());
        return hashCode;
    }

    @Override
    public UpdatePackageVersionsStatusRequest clone() {
        return (UpdatePackageVersionsStatusRequest) super.clone();
    }

}
