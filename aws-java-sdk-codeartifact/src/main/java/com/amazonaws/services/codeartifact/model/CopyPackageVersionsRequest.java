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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/CopyPackageVersions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CopyPackageVersionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the domain that contains the source and destination repositories.
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
     * The name of the repository that contains the package versions to copy.
     * </p>
     */
    private String sourceRepository;
    /**
     * <p>
     * The name of the repository into which package versions are copied.
     * </p>
     */
    private String destinationRepository;
    /**
     * <p>
     * The format of the package that is copied. The valid package types are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>npm</code>: A Node Package Manager (npm) package.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pypi</code>: A Python Package Index (PyPI) package.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>maven</code>: A Maven package that contains compiled code in a distributable format, such as a JAR file.
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
     * The name of the package that is copied.
     * </p>
     */
    private String packageValue;
    /**
     * <p>
     * The versions of the package to copy.
     * </p>
     * <note>
     * <p>
     * You must specify <code>versions</code> or <code>versionRevisions</code>. You cannot specify both.
     * </p>
     * </note>
     */
    private java.util.List<String> versions;
    /**
     * <p>
     * A list of key-value pairs. The keys are package versions and the values are package version revisions. A
     * <code>CopyPackageVersion</code> operation succeeds if the specified versions in the source repository match the
     * specified package version revision.
     * </p>
     * <note>
     * <p>
     * You must specify <code>versions</code> or <code>versionRevisions</code>. You cannot specify both.
     * </p>
     * </note>
     */
    private java.util.Map<String, String> versionRevisions;
    /**
     * <p>
     * Set to true to overwrite a package version that already exists in the destination repository. If set to false and
     * the package version already exists in the destination repository, the package version is returned in the
     * <code>failedVersions</code> field of the response with an <code>ALREADY_EXISTS</code> error code.
     * </p>
     */
    private Boolean allowOverwrite;
    /**
     * <p>
     * Set to true to copy packages from repositories that are upstream from the source repository to the destination
     * repository. The default setting is false. For more information, see <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/ug/repos-upstream.html">Working with upstream
     * repositories</a>.
     * </p>
     */
    private Boolean includeFromUpstream;

    /**
     * <p>
     * The name of the domain that contains the source and destination repositories.
     * </p>
     * 
     * @param domain
     *        The name of the domain that contains the source and destination repositories.
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The name of the domain that contains the source and destination repositories.
     * </p>
     * 
     * @return The name of the domain that contains the source and destination repositories.
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The name of the domain that contains the source and destination repositories.
     * </p>
     * 
     * @param domain
     *        The name of the domain that contains the source and destination repositories.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyPackageVersionsRequest withDomain(String domain) {
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

    public CopyPackageVersionsRequest withDomainOwner(String domainOwner) {
        setDomainOwner(domainOwner);
        return this;
    }

    /**
     * <p>
     * The name of the repository that contains the package versions to copy.
     * </p>
     * 
     * @param sourceRepository
     *        The name of the repository that contains the package versions to copy.
     */

    public void setSourceRepository(String sourceRepository) {
        this.sourceRepository = sourceRepository;
    }

    /**
     * <p>
     * The name of the repository that contains the package versions to copy.
     * </p>
     * 
     * @return The name of the repository that contains the package versions to copy.
     */

    public String getSourceRepository() {
        return this.sourceRepository;
    }

    /**
     * <p>
     * The name of the repository that contains the package versions to copy.
     * </p>
     * 
     * @param sourceRepository
     *        The name of the repository that contains the package versions to copy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyPackageVersionsRequest withSourceRepository(String sourceRepository) {
        setSourceRepository(sourceRepository);
        return this;
    }

    /**
     * <p>
     * The name of the repository into which package versions are copied.
     * </p>
     * 
     * @param destinationRepository
     *        The name of the repository into which package versions are copied.
     */

    public void setDestinationRepository(String destinationRepository) {
        this.destinationRepository = destinationRepository;
    }

    /**
     * <p>
     * The name of the repository into which package versions are copied.
     * </p>
     * 
     * @return The name of the repository into which package versions are copied.
     */

    public String getDestinationRepository() {
        return this.destinationRepository;
    }

    /**
     * <p>
     * The name of the repository into which package versions are copied.
     * </p>
     * 
     * @param destinationRepository
     *        The name of the repository into which package versions are copied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyPackageVersionsRequest withDestinationRepository(String destinationRepository) {
        setDestinationRepository(destinationRepository);
        return this;
    }

    /**
     * <p>
     * The format of the package that is copied. The valid package types are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>npm</code>: A Node Package Manager (npm) package.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pypi</code>: A Python Package Index (PyPI) package.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>maven</code>: A Maven package that contains compiled code in a distributable format, such as a JAR file.
     * </p>
     * </li>
     * </ul>
     * 
     * @param format
     *        The format of the package that is copied. The valid package types are: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>npm</code>: A Node Package Manager (npm) package.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pypi</code>: A Python Package Index (PyPI) package.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>maven</code>: A Maven package that contains compiled code in a distributable format, such as a JAR
     *        file.
     *        </p>
     *        </li>
     * @see PackageFormat
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The format of the package that is copied. The valid package types are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>npm</code>: A Node Package Manager (npm) package.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pypi</code>: A Python Package Index (PyPI) package.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>maven</code>: A Maven package that contains compiled code in a distributable format, such as a JAR file.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The format of the package that is copied. The valid package types are: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>npm</code>: A Node Package Manager (npm) package.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>pypi</code>: A Python Package Index (PyPI) package.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>maven</code>: A Maven package that contains compiled code in a distributable format, such as a JAR
     *         file.
     *         </p>
     *         </li>
     * @see PackageFormat
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * The format of the package that is copied. The valid package types are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>npm</code>: A Node Package Manager (npm) package.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pypi</code>: A Python Package Index (PyPI) package.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>maven</code>: A Maven package that contains compiled code in a distributable format, such as a JAR file.
     * </p>
     * </li>
     * </ul>
     * 
     * @param format
     *        The format of the package that is copied. The valid package types are: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>npm</code>: A Node Package Manager (npm) package.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pypi</code>: A Python Package Index (PyPI) package.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>maven</code>: A Maven package that contains compiled code in a distributable format, such as a JAR
     *        file.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageFormat
     */

    public CopyPackageVersionsRequest withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * The format of the package that is copied. The valid package types are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>npm</code>: A Node Package Manager (npm) package.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pypi</code>: A Python Package Index (PyPI) package.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>maven</code>: A Maven package that contains compiled code in a distributable format, such as a JAR file.
     * </p>
     * </li>
     * </ul>
     * 
     * @param format
     *        The format of the package that is copied. The valid package types are: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>npm</code>: A Node Package Manager (npm) package.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pypi</code>: A Python Package Index (PyPI) package.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>maven</code>: A Maven package that contains compiled code in a distributable format, such as a JAR
     *        file.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageFormat
     */

    public CopyPackageVersionsRequest withFormat(PackageFormat format) {
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

    public CopyPackageVersionsRequest withNamespace(String namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * <p>
     * The name of the package that is copied.
     * </p>
     * 
     * @param packageValue
     *        The name of the package that is copied.
     */

    public void setPackage(String packageValue) {
        this.packageValue = packageValue;
    }

    /**
     * <p>
     * The name of the package that is copied.
     * </p>
     * 
     * @return The name of the package that is copied.
     */

    public String getPackage() {
        return this.packageValue;
    }

    /**
     * <p>
     * The name of the package that is copied.
     * </p>
     * 
     * @param packageValue
     *        The name of the package that is copied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyPackageVersionsRequest withPackage(String packageValue) {
        setPackage(packageValue);
        return this;
    }

    /**
     * <p>
     * The versions of the package to copy.
     * </p>
     * <note>
     * <p>
     * You must specify <code>versions</code> or <code>versionRevisions</code>. You cannot specify both.
     * </p>
     * </note>
     * 
     * @return The versions of the package to copy. </p> <note>
     *         <p>
     *         You must specify <code>versions</code> or <code>versionRevisions</code>. You cannot specify both.
     *         </p>
     */

    public java.util.List<String> getVersions() {
        return versions;
    }

    /**
     * <p>
     * The versions of the package to copy.
     * </p>
     * <note>
     * <p>
     * You must specify <code>versions</code> or <code>versionRevisions</code>. You cannot specify both.
     * </p>
     * </note>
     * 
     * @param versions
     *        The versions of the package to copy. </p> <note>
     *        <p>
     *        You must specify <code>versions</code> or <code>versionRevisions</code>. You cannot specify both.
     *        </p>
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
     * The versions of the package to copy.
     * </p>
     * <note>
     * <p>
     * You must specify <code>versions</code> or <code>versionRevisions</code>. You cannot specify both.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVersions(java.util.Collection)} or {@link #withVersions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param versions
     *        The versions of the package to copy. </p> <note>
     *        <p>
     *        You must specify <code>versions</code> or <code>versionRevisions</code>. You cannot specify both.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyPackageVersionsRequest withVersions(String... versions) {
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
     * The versions of the package to copy.
     * </p>
     * <note>
     * <p>
     * You must specify <code>versions</code> or <code>versionRevisions</code>. You cannot specify both.
     * </p>
     * </note>
     * 
     * @param versions
     *        The versions of the package to copy. </p> <note>
     *        <p>
     *        You must specify <code>versions</code> or <code>versionRevisions</code>. You cannot specify both.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyPackageVersionsRequest withVersions(java.util.Collection<String> versions) {
        setVersions(versions);
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs. The keys are package versions and the values are package version revisions. A
     * <code>CopyPackageVersion</code> operation succeeds if the specified versions in the source repository match the
     * specified package version revision.
     * </p>
     * <note>
     * <p>
     * You must specify <code>versions</code> or <code>versionRevisions</code>. You cannot specify both.
     * </p>
     * </note>
     * 
     * @return A list of key-value pairs. The keys are package versions and the values are package version revisions. A
     *         <code>CopyPackageVersion</code> operation succeeds if the specified versions in the source repository
     *         match the specified package version revision. </p> <note>
     *         <p>
     *         You must specify <code>versions</code> or <code>versionRevisions</code>. You cannot specify both.
     *         </p>
     */

    public java.util.Map<String, String> getVersionRevisions() {
        return versionRevisions;
    }

    /**
     * <p>
     * A list of key-value pairs. The keys are package versions and the values are package version revisions. A
     * <code>CopyPackageVersion</code> operation succeeds if the specified versions in the source repository match the
     * specified package version revision.
     * </p>
     * <note>
     * <p>
     * You must specify <code>versions</code> or <code>versionRevisions</code>. You cannot specify both.
     * </p>
     * </note>
     * 
     * @param versionRevisions
     *        A list of key-value pairs. The keys are package versions and the values are package version revisions. A
     *        <code>CopyPackageVersion</code> operation succeeds if the specified versions in the source repository
     *        match the specified package version revision. </p> <note>
     *        <p>
     *        You must specify <code>versions</code> or <code>versionRevisions</code>. You cannot specify both.
     *        </p>
     */

    public void setVersionRevisions(java.util.Map<String, String> versionRevisions) {
        this.versionRevisions = versionRevisions;
    }

    /**
     * <p>
     * A list of key-value pairs. The keys are package versions and the values are package version revisions. A
     * <code>CopyPackageVersion</code> operation succeeds if the specified versions in the source repository match the
     * specified package version revision.
     * </p>
     * <note>
     * <p>
     * You must specify <code>versions</code> or <code>versionRevisions</code>. You cannot specify both.
     * </p>
     * </note>
     * 
     * @param versionRevisions
     *        A list of key-value pairs. The keys are package versions and the values are package version revisions. A
     *        <code>CopyPackageVersion</code> operation succeeds if the specified versions in the source repository
     *        match the specified package version revision. </p> <note>
     *        <p>
     *        You must specify <code>versions</code> or <code>versionRevisions</code>. You cannot specify both.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyPackageVersionsRequest withVersionRevisions(java.util.Map<String, String> versionRevisions) {
        setVersionRevisions(versionRevisions);
        return this;
    }

    /**
     * Add a single VersionRevisions entry
     *
     * @see CopyPackageVersionsRequest#withVersionRevisions
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CopyPackageVersionsRequest addVersionRevisionsEntry(String key, String value) {
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

    public CopyPackageVersionsRequest clearVersionRevisionsEntries() {
        this.versionRevisions = null;
        return this;
    }

    /**
     * <p>
     * Set to true to overwrite a package version that already exists in the destination repository. If set to false and
     * the package version already exists in the destination repository, the package version is returned in the
     * <code>failedVersions</code> field of the response with an <code>ALREADY_EXISTS</code> error code.
     * </p>
     * 
     * @param allowOverwrite
     *        Set to true to overwrite a package version that already exists in the destination repository. If set to
     *        false and the package version already exists in the destination repository, the package version is
     *        returned in the <code>failedVersions</code> field of the response with an <code>ALREADY_EXISTS</code>
     *        error code.
     */

    public void setAllowOverwrite(Boolean allowOverwrite) {
        this.allowOverwrite = allowOverwrite;
    }

    /**
     * <p>
     * Set to true to overwrite a package version that already exists in the destination repository. If set to false and
     * the package version already exists in the destination repository, the package version is returned in the
     * <code>failedVersions</code> field of the response with an <code>ALREADY_EXISTS</code> error code.
     * </p>
     * 
     * @return Set to true to overwrite a package version that already exists in the destination repository. If set to
     *         false and the package version already exists in the destination repository, the package version is
     *         returned in the <code>failedVersions</code> field of the response with an <code>ALREADY_EXISTS</code>
     *         error code.
     */

    public Boolean getAllowOverwrite() {
        return this.allowOverwrite;
    }

    /**
     * <p>
     * Set to true to overwrite a package version that already exists in the destination repository. If set to false and
     * the package version already exists in the destination repository, the package version is returned in the
     * <code>failedVersions</code> field of the response with an <code>ALREADY_EXISTS</code> error code.
     * </p>
     * 
     * @param allowOverwrite
     *        Set to true to overwrite a package version that already exists in the destination repository. If set to
     *        false and the package version already exists in the destination repository, the package version is
     *        returned in the <code>failedVersions</code> field of the response with an <code>ALREADY_EXISTS</code>
     *        error code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyPackageVersionsRequest withAllowOverwrite(Boolean allowOverwrite) {
        setAllowOverwrite(allowOverwrite);
        return this;
    }

    /**
     * <p>
     * Set to true to overwrite a package version that already exists in the destination repository. If set to false and
     * the package version already exists in the destination repository, the package version is returned in the
     * <code>failedVersions</code> field of the response with an <code>ALREADY_EXISTS</code> error code.
     * </p>
     * 
     * @return Set to true to overwrite a package version that already exists in the destination repository. If set to
     *         false and the package version already exists in the destination repository, the package version is
     *         returned in the <code>failedVersions</code> field of the response with an <code>ALREADY_EXISTS</code>
     *         error code.
     */

    public Boolean isAllowOverwrite() {
        return this.allowOverwrite;
    }

    /**
     * <p>
     * Set to true to copy packages from repositories that are upstream from the source repository to the destination
     * repository. The default setting is false. For more information, see <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/ug/repos-upstream.html">Working with upstream
     * repositories</a>.
     * </p>
     * 
     * @param includeFromUpstream
     *        Set to true to copy packages from repositories that are upstream from the source repository to the
     *        destination repository. The default setting is false. For more information, see <a
     *        href="https://docs.aws.amazon.com/codeartifact/latest/ug/repos-upstream.html">Working with upstream
     *        repositories</a>.
     */

    public void setIncludeFromUpstream(Boolean includeFromUpstream) {
        this.includeFromUpstream = includeFromUpstream;
    }

    /**
     * <p>
     * Set to true to copy packages from repositories that are upstream from the source repository to the destination
     * repository. The default setting is false. For more information, see <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/ug/repos-upstream.html">Working with upstream
     * repositories</a>.
     * </p>
     * 
     * @return Set to true to copy packages from repositories that are upstream from the source repository to the
     *         destination repository. The default setting is false. For more information, see <a
     *         href="https://docs.aws.amazon.com/codeartifact/latest/ug/repos-upstream.html">Working with upstream
     *         repositories</a>.
     */

    public Boolean getIncludeFromUpstream() {
        return this.includeFromUpstream;
    }

    /**
     * <p>
     * Set to true to copy packages from repositories that are upstream from the source repository to the destination
     * repository. The default setting is false. For more information, see <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/ug/repos-upstream.html">Working with upstream
     * repositories</a>.
     * </p>
     * 
     * @param includeFromUpstream
     *        Set to true to copy packages from repositories that are upstream from the source repository to the
     *        destination repository. The default setting is false. For more information, see <a
     *        href="https://docs.aws.amazon.com/codeartifact/latest/ug/repos-upstream.html">Working with upstream
     *        repositories</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyPackageVersionsRequest withIncludeFromUpstream(Boolean includeFromUpstream) {
        setIncludeFromUpstream(includeFromUpstream);
        return this;
    }

    /**
     * <p>
     * Set to true to copy packages from repositories that are upstream from the source repository to the destination
     * repository. The default setting is false. For more information, see <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/ug/repos-upstream.html">Working with upstream
     * repositories</a>.
     * </p>
     * 
     * @return Set to true to copy packages from repositories that are upstream from the source repository to the
     *         destination repository. The default setting is false. For more information, see <a
     *         href="https://docs.aws.amazon.com/codeartifact/latest/ug/repos-upstream.html">Working with upstream
     *         repositories</a>.
     */

    public Boolean isIncludeFromUpstream() {
        return this.includeFromUpstream;
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
        if (getSourceRepository() != null)
            sb.append("SourceRepository: ").append(getSourceRepository()).append(",");
        if (getDestinationRepository() != null)
            sb.append("DestinationRepository: ").append(getDestinationRepository()).append(",");
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
        if (getAllowOverwrite() != null)
            sb.append("AllowOverwrite: ").append(getAllowOverwrite()).append(",");
        if (getIncludeFromUpstream() != null)
            sb.append("IncludeFromUpstream: ").append(getIncludeFromUpstream());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CopyPackageVersionsRequest == false)
            return false;
        CopyPackageVersionsRequest other = (CopyPackageVersionsRequest) obj;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getDomainOwner() == null ^ this.getDomainOwner() == null)
            return false;
        if (other.getDomainOwner() != null && other.getDomainOwner().equals(this.getDomainOwner()) == false)
            return false;
        if (other.getSourceRepository() == null ^ this.getSourceRepository() == null)
            return false;
        if (other.getSourceRepository() != null && other.getSourceRepository().equals(this.getSourceRepository()) == false)
            return false;
        if (other.getDestinationRepository() == null ^ this.getDestinationRepository() == null)
            return false;
        if (other.getDestinationRepository() != null && other.getDestinationRepository().equals(this.getDestinationRepository()) == false)
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
        if (other.getAllowOverwrite() == null ^ this.getAllowOverwrite() == null)
            return false;
        if (other.getAllowOverwrite() != null && other.getAllowOverwrite().equals(this.getAllowOverwrite()) == false)
            return false;
        if (other.getIncludeFromUpstream() == null ^ this.getIncludeFromUpstream() == null)
            return false;
        if (other.getIncludeFromUpstream() != null && other.getIncludeFromUpstream().equals(this.getIncludeFromUpstream()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getDomainOwner() == null) ? 0 : getDomainOwner().hashCode());
        hashCode = prime * hashCode + ((getSourceRepository() == null) ? 0 : getSourceRepository().hashCode());
        hashCode = prime * hashCode + ((getDestinationRepository() == null) ? 0 : getDestinationRepository().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getPackage() == null) ? 0 : getPackage().hashCode());
        hashCode = prime * hashCode + ((getVersions() == null) ? 0 : getVersions().hashCode());
        hashCode = prime * hashCode + ((getVersionRevisions() == null) ? 0 : getVersionRevisions().hashCode());
        hashCode = prime * hashCode + ((getAllowOverwrite() == null) ? 0 : getAllowOverwrite().hashCode());
        hashCode = prime * hashCode + ((getIncludeFromUpstream() == null) ? 0 : getIncludeFromUpstream().hashCode());
        return hashCode;
    }

    @Override
    public CopyPackageVersionsRequest clone() {
        return (CopyPackageVersionsRequest) super.clone();
    }

}
