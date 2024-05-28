/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/ListPackages" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPackagesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the domain that contains the repository that contains the requested packages.
     * </p>
     */
    private String domain;
    /**
     * <p>
     * The 12-digit account number of the Amazon Web Services account that owns the domain. It does not include dashes
     * or spaces.
     * </p>
     */
    private String domainOwner;
    /**
     * <p>
     * The name of the repository that contains the requested packages.
     * </p>
     */
    private String repository;
    /**
     * <p>
     * The format used to filter requested packages. Only packages from the provided format will be returned.
     * </p>
     */
    private String format;
    /**
     * <p>
     * The namespace prefix used to filter requested packages. Only packages with a namespace that starts with the
     * provided string value are returned. Note that although this option is called <code>--namespace</code> and not
     * <code>--namespace-prefix</code>, it has prefix-matching behavior.
     * </p>
     * <p>
     * Each package format uses namespace as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The namespace of a Maven package version is its <code>groupId</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The namespace of an npm or Swift package version is its <code>scope</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The namespace of a generic package is its <code>namespace</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Python, NuGet, and Ruby package versions do not contain a corresponding component, package versions of those
     * formats do not have a namespace.
     * </p>
     * </li>
     * </ul>
     */
    private String namespace;
    /**
     * <p>
     * A prefix used to filter requested packages. Only packages with names that start with <code>packagePrefix</code>
     * are returned.
     * </p>
     */
    private String packagePrefix;
    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The value of the <code>Publish</code> package origin control restriction used to filter requested packages. Only
     * packages with the provided restriction are returned. For more information, see <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageOriginRestrictions.html"
     * >PackageOriginRestrictions</a>.
     * </p>
     */
    private String publish;
    /**
     * <p>
     * The value of the <code>Upstream</code> package origin control restriction used to filter requested packages. Only
     * packages with the provided restriction are returned. For more information, see <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageOriginRestrictions.html"
     * >PackageOriginRestrictions</a>.
     * </p>
     */
    private String upstream;

    /**
     * <p>
     * The name of the domain that contains the repository that contains the requested packages.
     * </p>
     * 
     * @param domain
     *        The name of the domain that contains the repository that contains the requested packages.
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The name of the domain that contains the repository that contains the requested packages.
     * </p>
     * 
     * @return The name of the domain that contains the repository that contains the requested packages.
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The name of the domain that contains the repository that contains the requested packages.
     * </p>
     * 
     * @param domain
     *        The name of the domain that contains the repository that contains the requested packages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPackagesRequest withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * The 12-digit account number of the Amazon Web Services account that owns the domain. It does not include dashes
     * or spaces.
     * </p>
     * 
     * @param domainOwner
     *        The 12-digit account number of the Amazon Web Services account that owns the domain. It does not include
     *        dashes or spaces.
     */

    public void setDomainOwner(String domainOwner) {
        this.domainOwner = domainOwner;
    }

    /**
     * <p>
     * The 12-digit account number of the Amazon Web Services account that owns the domain. It does not include dashes
     * or spaces.
     * </p>
     * 
     * @return The 12-digit account number of the Amazon Web Services account that owns the domain. It does not include
     *         dashes or spaces.
     */

    public String getDomainOwner() {
        return this.domainOwner;
    }

    /**
     * <p>
     * The 12-digit account number of the Amazon Web Services account that owns the domain. It does not include dashes
     * or spaces.
     * </p>
     * 
     * @param domainOwner
     *        The 12-digit account number of the Amazon Web Services account that owns the domain. It does not include
     *        dashes or spaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPackagesRequest withDomainOwner(String domainOwner) {
        setDomainOwner(domainOwner);
        return this;
    }

    /**
     * <p>
     * The name of the repository that contains the requested packages.
     * </p>
     * 
     * @param repository
     *        The name of the repository that contains the requested packages.
     */

    public void setRepository(String repository) {
        this.repository = repository;
    }

    /**
     * <p>
     * The name of the repository that contains the requested packages.
     * </p>
     * 
     * @return The name of the repository that contains the requested packages.
     */

    public String getRepository() {
        return this.repository;
    }

    /**
     * <p>
     * The name of the repository that contains the requested packages.
     * </p>
     * 
     * @param repository
     *        The name of the repository that contains the requested packages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPackagesRequest withRepository(String repository) {
        setRepository(repository);
        return this;
    }

    /**
     * <p>
     * The format used to filter requested packages. Only packages from the provided format will be returned.
     * </p>
     * 
     * @param format
     *        The format used to filter requested packages. Only packages from the provided format will be returned.
     * @see PackageFormat
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The format used to filter requested packages. Only packages from the provided format will be returned.
     * </p>
     * 
     * @return The format used to filter requested packages. Only packages from the provided format will be returned.
     * @see PackageFormat
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * The format used to filter requested packages. Only packages from the provided format will be returned.
     * </p>
     * 
     * @param format
     *        The format used to filter requested packages. Only packages from the provided format will be returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageFormat
     */

    public ListPackagesRequest withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * The format used to filter requested packages. Only packages from the provided format will be returned.
     * </p>
     * 
     * @param format
     *        The format used to filter requested packages. Only packages from the provided format will be returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageFormat
     */

    public ListPackagesRequest withFormat(PackageFormat format) {
        this.format = format.toString();
        return this;
    }

    /**
     * <p>
     * The namespace prefix used to filter requested packages. Only packages with a namespace that starts with the
     * provided string value are returned. Note that although this option is called <code>--namespace</code> and not
     * <code>--namespace-prefix</code>, it has prefix-matching behavior.
     * </p>
     * <p>
     * Each package format uses namespace as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The namespace of a Maven package version is its <code>groupId</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The namespace of an npm or Swift package version is its <code>scope</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The namespace of a generic package is its <code>namespace</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Python, NuGet, and Ruby package versions do not contain a corresponding component, package versions of those
     * formats do not have a namespace.
     * </p>
     * </li>
     * </ul>
     * 
     * @param namespace
     *        The namespace prefix used to filter requested packages. Only packages with a namespace that starts with
     *        the provided string value are returned. Note that although this option is called <code>--namespace</code>
     *        and not <code>--namespace-prefix</code>, it has prefix-matching behavior.</p>
     *        <p>
     *        Each package format uses namespace as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The namespace of a Maven package version is its <code>groupId</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The namespace of an npm or Swift package version is its <code>scope</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The namespace of a generic package is its <code>namespace</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Python, NuGet, and Ruby package versions do not contain a corresponding component, package versions of
     *        those formats do not have a namespace.
     *        </p>
     *        </li>
     */

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The namespace prefix used to filter requested packages. Only packages with a namespace that starts with the
     * provided string value are returned. Note that although this option is called <code>--namespace</code> and not
     * <code>--namespace-prefix</code>, it has prefix-matching behavior.
     * </p>
     * <p>
     * Each package format uses namespace as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The namespace of a Maven package version is its <code>groupId</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The namespace of an npm or Swift package version is its <code>scope</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The namespace of a generic package is its <code>namespace</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Python, NuGet, and Ruby package versions do not contain a corresponding component, package versions of those
     * formats do not have a namespace.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The namespace prefix used to filter requested packages. Only packages with a namespace that starts with
     *         the provided string value are returned. Note that although this option is called <code>--namespace</code>
     *         and not <code>--namespace-prefix</code>, it has prefix-matching behavior.</p>
     *         <p>
     *         Each package format uses namespace as follows:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The namespace of a Maven package version is its <code>groupId</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The namespace of an npm or Swift package version is its <code>scope</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The namespace of a generic package is its <code>namespace</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Python, NuGet, and Ruby package versions do not contain a corresponding component, package versions of
     *         those formats do not have a namespace.
     *         </p>
     *         </li>
     */

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * The namespace prefix used to filter requested packages. Only packages with a namespace that starts with the
     * provided string value are returned. Note that although this option is called <code>--namespace</code> and not
     * <code>--namespace-prefix</code>, it has prefix-matching behavior.
     * </p>
     * <p>
     * Each package format uses namespace as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The namespace of a Maven package version is its <code>groupId</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The namespace of an npm or Swift package version is its <code>scope</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The namespace of a generic package is its <code>namespace</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Python, NuGet, and Ruby package versions do not contain a corresponding component, package versions of those
     * formats do not have a namespace.
     * </p>
     * </li>
     * </ul>
     * 
     * @param namespace
     *        The namespace prefix used to filter requested packages. Only packages with a namespace that starts with
     *        the provided string value are returned. Note that although this option is called <code>--namespace</code>
     *        and not <code>--namespace-prefix</code>, it has prefix-matching behavior.</p>
     *        <p>
     *        Each package format uses namespace as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The namespace of a Maven package version is its <code>groupId</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The namespace of an npm or Swift package version is its <code>scope</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The namespace of a generic package is its <code>namespace</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Python, NuGet, and Ruby package versions do not contain a corresponding component, package versions of
     *        those formats do not have a namespace.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPackagesRequest withNamespace(String namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * <p>
     * A prefix used to filter requested packages. Only packages with names that start with <code>packagePrefix</code>
     * are returned.
     * </p>
     * 
     * @param packagePrefix
     *        A prefix used to filter requested packages. Only packages with names that start with
     *        <code>packagePrefix</code> are returned.
     */

    public void setPackagePrefix(String packagePrefix) {
        this.packagePrefix = packagePrefix;
    }

    /**
     * <p>
     * A prefix used to filter requested packages. Only packages with names that start with <code>packagePrefix</code>
     * are returned.
     * </p>
     * 
     * @return A prefix used to filter requested packages. Only packages with names that start with
     *         <code>packagePrefix</code> are returned.
     */

    public String getPackagePrefix() {
        return this.packagePrefix;
    }

    /**
     * <p>
     * A prefix used to filter requested packages. Only packages with names that start with <code>packagePrefix</code>
     * are returned.
     * </p>
     * 
     * @param packagePrefix
     *        A prefix used to filter requested packages. Only packages with names that start with
     *        <code>packagePrefix</code> are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPackagesRequest withPackagePrefix(String packagePrefix) {
        setPackagePrefix(packagePrefix);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return per page.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     * 
     * @return The maximum number of results to return per page.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return per page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPackagesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. Use the value returned in the previous response in the next request
     *        to retrieve the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * 
     * @return The token for the next set of results. Use the value returned in the previous response in the next
     *         request to retrieve the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. Use the value returned in the previous response in the next request
     *        to retrieve the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPackagesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The value of the <code>Publish</code> package origin control restriction used to filter requested packages. Only
     * packages with the provided restriction are returned. For more information, see <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageOriginRestrictions.html"
     * >PackageOriginRestrictions</a>.
     * </p>
     * 
     * @param publish
     *        The value of the <code>Publish</code> package origin control restriction used to filter requested
     *        packages. Only packages with the provided restriction are returned. For more information, see <a
     *        href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageOriginRestrictions.html"
     *        >PackageOriginRestrictions</a>.
     * @see AllowPublish
     */

    public void setPublish(String publish) {
        this.publish = publish;
    }

    /**
     * <p>
     * The value of the <code>Publish</code> package origin control restriction used to filter requested packages. Only
     * packages with the provided restriction are returned. For more information, see <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageOriginRestrictions.html"
     * >PackageOriginRestrictions</a>.
     * </p>
     * 
     * @return The value of the <code>Publish</code> package origin control restriction used to filter requested
     *         packages. Only packages with the provided restriction are returned. For more information, see <a
     *         href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageOriginRestrictions.html"
     *         >PackageOriginRestrictions</a>.
     * @see AllowPublish
     */

    public String getPublish() {
        return this.publish;
    }

    /**
     * <p>
     * The value of the <code>Publish</code> package origin control restriction used to filter requested packages. Only
     * packages with the provided restriction are returned. For more information, see <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageOriginRestrictions.html"
     * >PackageOriginRestrictions</a>.
     * </p>
     * 
     * @param publish
     *        The value of the <code>Publish</code> package origin control restriction used to filter requested
     *        packages. Only packages with the provided restriction are returned. For more information, see <a
     *        href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageOriginRestrictions.html"
     *        >PackageOriginRestrictions</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AllowPublish
     */

    public ListPackagesRequest withPublish(String publish) {
        setPublish(publish);
        return this;
    }

    /**
     * <p>
     * The value of the <code>Publish</code> package origin control restriction used to filter requested packages. Only
     * packages with the provided restriction are returned. For more information, see <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageOriginRestrictions.html"
     * >PackageOriginRestrictions</a>.
     * </p>
     * 
     * @param publish
     *        The value of the <code>Publish</code> package origin control restriction used to filter requested
     *        packages. Only packages with the provided restriction are returned. For more information, see <a
     *        href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageOriginRestrictions.html"
     *        >PackageOriginRestrictions</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AllowPublish
     */

    public ListPackagesRequest withPublish(AllowPublish publish) {
        this.publish = publish.toString();
        return this;
    }

    /**
     * <p>
     * The value of the <code>Upstream</code> package origin control restriction used to filter requested packages. Only
     * packages with the provided restriction are returned. For more information, see <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageOriginRestrictions.html"
     * >PackageOriginRestrictions</a>.
     * </p>
     * 
     * @param upstream
     *        The value of the <code>Upstream</code> package origin control restriction used to filter requested
     *        packages. Only packages with the provided restriction are returned. For more information, see <a
     *        href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageOriginRestrictions.html"
     *        >PackageOriginRestrictions</a>.
     * @see AllowUpstream
     */

    public void setUpstream(String upstream) {
        this.upstream = upstream;
    }

    /**
     * <p>
     * The value of the <code>Upstream</code> package origin control restriction used to filter requested packages. Only
     * packages with the provided restriction are returned. For more information, see <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageOriginRestrictions.html"
     * >PackageOriginRestrictions</a>.
     * </p>
     * 
     * @return The value of the <code>Upstream</code> package origin control restriction used to filter requested
     *         packages. Only packages with the provided restriction are returned. For more information, see <a
     *         href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageOriginRestrictions.html"
     *         >PackageOriginRestrictions</a>.
     * @see AllowUpstream
     */

    public String getUpstream() {
        return this.upstream;
    }

    /**
     * <p>
     * The value of the <code>Upstream</code> package origin control restriction used to filter requested packages. Only
     * packages with the provided restriction are returned. For more information, see <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageOriginRestrictions.html"
     * >PackageOriginRestrictions</a>.
     * </p>
     * 
     * @param upstream
     *        The value of the <code>Upstream</code> package origin control restriction used to filter requested
     *        packages. Only packages with the provided restriction are returned. For more information, see <a
     *        href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageOriginRestrictions.html"
     *        >PackageOriginRestrictions</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AllowUpstream
     */

    public ListPackagesRequest withUpstream(String upstream) {
        setUpstream(upstream);
        return this;
    }

    /**
     * <p>
     * The value of the <code>Upstream</code> package origin control restriction used to filter requested packages. Only
     * packages with the provided restriction are returned. For more information, see <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageOriginRestrictions.html"
     * >PackageOriginRestrictions</a>.
     * </p>
     * 
     * @param upstream
     *        The value of the <code>Upstream</code> package origin control restriction used to filter requested
     *        packages. Only packages with the provided restriction are returned. For more information, see <a
     *        href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageOriginRestrictions.html"
     *        >PackageOriginRestrictions</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AllowUpstream
     */

    public ListPackagesRequest withUpstream(AllowUpstream upstream) {
        this.upstream = upstream.toString();
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
        if (getPackagePrefix() != null)
            sb.append("PackagePrefix: ").append(getPackagePrefix()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getPublish() != null)
            sb.append("Publish: ").append(getPublish()).append(",");
        if (getUpstream() != null)
            sb.append("Upstream: ").append(getUpstream());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPackagesRequest == false)
            return false;
        ListPackagesRequest other = (ListPackagesRequest) obj;
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
        if (other.getPackagePrefix() == null ^ this.getPackagePrefix() == null)
            return false;
        if (other.getPackagePrefix() != null && other.getPackagePrefix().equals(this.getPackagePrefix()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getPublish() == null ^ this.getPublish() == null)
            return false;
        if (other.getPublish() != null && other.getPublish().equals(this.getPublish()) == false)
            return false;
        if (other.getUpstream() == null ^ this.getUpstream() == null)
            return false;
        if (other.getUpstream() != null && other.getUpstream().equals(this.getUpstream()) == false)
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
        hashCode = prime * hashCode + ((getPackagePrefix() == null) ? 0 : getPackagePrefix().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getPublish() == null) ? 0 : getPublish().hashCode());
        hashCode = prime * hashCode + ((getUpstream() == null) ? 0 : getUpstream().hashCode());
        return hashCode;
    }

    @Override
    public ListPackagesRequest clone() {
        return (ListPackagesRequest) super.clone();
    }

}
