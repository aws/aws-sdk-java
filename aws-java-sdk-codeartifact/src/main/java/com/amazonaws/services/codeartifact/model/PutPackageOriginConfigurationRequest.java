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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/PutPackageOriginConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutPackageOriginConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the domain that contains the repository that contains the package.
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
     * The name of the repository that contains the package.
     * </p>
     */
    private String repository;
    /**
     * <p>
     * A format that specifies the type of the package to be updated.
     * </p>
     */
    private String format;
    /**
     * <p>
     * The namespace of the package to be updated. The package component that specifies its namespace depends on its
     * type. For example:
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
     * Python and NuGet packages do not contain a corresponding component, packages of those formats do not have a
     * namespace.
     * </p>
     * </li>
     * </ul>
     */
    private String namespace;
    /**
     * <p>
     * The name of the package to be updated.
     * </p>
     */
    private String packageValue;
    /**
     * <p>
     * A <a href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageOriginRestrictions.html">
     * PackageOriginRestrictions</a> object that contains information about the <code>upstream</code> and
     * <code>publish</code> package origin restrictions. The <code>upstream</code> restriction determines if new package
     * versions can be ingested or retained from external connections or upstream repositories. The <code>publish</code>
     * restriction determines if new package versions can be published directly to the repository.
     * </p>
     * <p>
     * You must include both the desired <code>upstream</code> and <code>publish</code> restrictions.
     * </p>
     */
    private PackageOriginRestrictions restrictions;

    /**
     * <p>
     * The name of the domain that contains the repository that contains the package.
     * </p>
     * 
     * @param domain
     *        The name of the domain that contains the repository that contains the package.
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The name of the domain that contains the repository that contains the package.
     * </p>
     * 
     * @return The name of the domain that contains the repository that contains the package.
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The name of the domain that contains the repository that contains the package.
     * </p>
     * 
     * @param domain
     *        The name of the domain that contains the repository that contains the package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutPackageOriginConfigurationRequest withDomain(String domain) {
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

    public PutPackageOriginConfigurationRequest withDomainOwner(String domainOwner) {
        setDomainOwner(domainOwner);
        return this;
    }

    /**
     * <p>
     * The name of the repository that contains the package.
     * </p>
     * 
     * @param repository
     *        The name of the repository that contains the package.
     */

    public void setRepository(String repository) {
        this.repository = repository;
    }

    /**
     * <p>
     * The name of the repository that contains the package.
     * </p>
     * 
     * @return The name of the repository that contains the package.
     */

    public String getRepository() {
        return this.repository;
    }

    /**
     * <p>
     * The name of the repository that contains the package.
     * </p>
     * 
     * @param repository
     *        The name of the repository that contains the package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutPackageOriginConfigurationRequest withRepository(String repository) {
        setRepository(repository);
        return this;
    }

    /**
     * <p>
     * A format that specifies the type of the package to be updated.
     * </p>
     * 
     * @param format
     *        A format that specifies the type of the package to be updated.
     * @see PackageFormat
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * A format that specifies the type of the package to be updated.
     * </p>
     * 
     * @return A format that specifies the type of the package to be updated.
     * @see PackageFormat
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * A format that specifies the type of the package to be updated.
     * </p>
     * 
     * @param format
     *        A format that specifies the type of the package to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageFormat
     */

    public PutPackageOriginConfigurationRequest withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * A format that specifies the type of the package to be updated.
     * </p>
     * 
     * @param format
     *        A format that specifies the type of the package to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageFormat
     */

    public PutPackageOriginConfigurationRequest withFormat(PackageFormat format) {
        this.format = format.toString();
        return this;
    }

    /**
     * <p>
     * The namespace of the package to be updated. The package component that specifies its namespace depends on its
     * type. For example:
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
     * Python and NuGet packages do not contain a corresponding component, packages of those formats do not have a
     * namespace.
     * </p>
     * </li>
     * </ul>
     * 
     * @param namespace
     *        The namespace of the package to be updated. The package component that specifies its namespace depends on
     *        its type. For example:</p>
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
     *        Python and NuGet packages do not contain a corresponding component, packages of those formats do not have
     *        a namespace.
     *        </p>
     *        </li>
     */

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The namespace of the package to be updated. The package component that specifies its namespace depends on its
     * type. For example:
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
     * Python and NuGet packages do not contain a corresponding component, packages of those formats do not have a
     * namespace.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The namespace of the package to be updated. The package component that specifies its namespace depends on
     *         its type. For example:</p>
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
     *         Python and NuGet packages do not contain a corresponding component, packages of those formats do not have
     *         a namespace.
     *         </p>
     *         </li>
     */

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * The namespace of the package to be updated. The package component that specifies its namespace depends on its
     * type. For example:
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
     * Python and NuGet packages do not contain a corresponding component, packages of those formats do not have a
     * namespace.
     * </p>
     * </li>
     * </ul>
     * 
     * @param namespace
     *        The namespace of the package to be updated. The package component that specifies its namespace depends on
     *        its type. For example:</p>
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
     *        Python and NuGet packages do not contain a corresponding component, packages of those formats do not have
     *        a namespace.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutPackageOriginConfigurationRequest withNamespace(String namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * <p>
     * The name of the package to be updated.
     * </p>
     * 
     * @param packageValue
     *        The name of the package to be updated.
     */

    public void setPackage(String packageValue) {
        this.packageValue = packageValue;
    }

    /**
     * <p>
     * The name of the package to be updated.
     * </p>
     * 
     * @return The name of the package to be updated.
     */

    public String getPackage() {
        return this.packageValue;
    }

    /**
     * <p>
     * The name of the package to be updated.
     * </p>
     * 
     * @param packageValue
     *        The name of the package to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutPackageOriginConfigurationRequest withPackage(String packageValue) {
        setPackage(packageValue);
        return this;
    }

    /**
     * <p>
     * A <a href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageOriginRestrictions.html">
     * PackageOriginRestrictions</a> object that contains information about the <code>upstream</code> and
     * <code>publish</code> package origin restrictions. The <code>upstream</code> restriction determines if new package
     * versions can be ingested or retained from external connections or upstream repositories. The <code>publish</code>
     * restriction determines if new package versions can be published directly to the repository.
     * </p>
     * <p>
     * You must include both the desired <code>upstream</code> and <code>publish</code> restrictions.
     * </p>
     * 
     * @param restrictions
     *        A <a
     *        href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageOriginRestrictions.html"
     *        >PackageOriginRestrictions</a> object that contains information about the <code>upstream</code> and
     *        <code>publish</code> package origin restrictions. The <code>upstream</code> restriction determines if new
     *        package versions can be ingested or retained from external connections or upstream repositories. The
     *        <code>publish</code> restriction determines if new package versions can be published directly to the
     *        repository.</p>
     *        <p>
     *        You must include both the desired <code>upstream</code> and <code>publish</code> restrictions.
     */

    public void setRestrictions(PackageOriginRestrictions restrictions) {
        this.restrictions = restrictions;
    }

    /**
     * <p>
     * A <a href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageOriginRestrictions.html">
     * PackageOriginRestrictions</a> object that contains information about the <code>upstream</code> and
     * <code>publish</code> package origin restrictions. The <code>upstream</code> restriction determines if new package
     * versions can be ingested or retained from external connections or upstream repositories. The <code>publish</code>
     * restriction determines if new package versions can be published directly to the repository.
     * </p>
     * <p>
     * You must include both the desired <code>upstream</code> and <code>publish</code> restrictions.
     * </p>
     * 
     * @return A <a
     *         href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageOriginRestrictions.html"
     *         >PackageOriginRestrictions</a> object that contains information about the <code>upstream</code> and
     *         <code>publish</code> package origin restrictions. The <code>upstream</code> restriction determines if new
     *         package versions can be ingested or retained from external connections or upstream repositories. The
     *         <code>publish</code> restriction determines if new package versions can be published directly to the
     *         repository.</p>
     *         <p>
     *         You must include both the desired <code>upstream</code> and <code>publish</code> restrictions.
     */

    public PackageOriginRestrictions getRestrictions() {
        return this.restrictions;
    }

    /**
     * <p>
     * A <a href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageOriginRestrictions.html">
     * PackageOriginRestrictions</a> object that contains information about the <code>upstream</code> and
     * <code>publish</code> package origin restrictions. The <code>upstream</code> restriction determines if new package
     * versions can be ingested or retained from external connections or upstream repositories. The <code>publish</code>
     * restriction determines if new package versions can be published directly to the repository.
     * </p>
     * <p>
     * You must include both the desired <code>upstream</code> and <code>publish</code> restrictions.
     * </p>
     * 
     * @param restrictions
     *        A <a
     *        href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageOriginRestrictions.html"
     *        >PackageOriginRestrictions</a> object that contains information about the <code>upstream</code> and
     *        <code>publish</code> package origin restrictions. The <code>upstream</code> restriction determines if new
     *        package versions can be ingested or retained from external connections or upstream repositories. The
     *        <code>publish</code> restriction determines if new package versions can be published directly to the
     *        repository.</p>
     *        <p>
     *        You must include both the desired <code>upstream</code> and <code>publish</code> restrictions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutPackageOriginConfigurationRequest withRestrictions(PackageOriginRestrictions restrictions) {
        setRestrictions(restrictions);
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
        if (getRestrictions() != null)
            sb.append("Restrictions: ").append(getRestrictions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutPackageOriginConfigurationRequest == false)
            return false;
        PutPackageOriginConfigurationRequest other = (PutPackageOriginConfigurationRequest) obj;
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
        if (other.getRestrictions() == null ^ this.getRestrictions() == null)
            return false;
        if (other.getRestrictions() != null && other.getRestrictions().equals(this.getRestrictions()) == false)
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
        hashCode = prime * hashCode + ((getRestrictions() == null) ? 0 : getRestrictions().hashCode());
        return hashCode;
    }

    @Override
    public PutPackageOriginConfigurationRequest clone() {
        return (PutPackageOriginConfigurationRequest) super.clone();
    }

}
