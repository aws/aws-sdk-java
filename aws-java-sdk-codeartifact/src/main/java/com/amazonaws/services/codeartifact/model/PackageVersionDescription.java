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
 * Details about a package version.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/PackageVersionDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PackageVersionDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The format of the package version. The valid package formats are:
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
     * The name of the requested package.
     * </p>
     */
    private String packageName;
    /**
     * <p>
     * The name of the package that is displayed. The <code>displayName</code> varies depending on the package version's
     * format. For example, if an npm package is named <code>ui</code>, is in the namespace <code>vue</code>, and has
     * the format <code>npm</code>, then the <code>displayName</code> is <code>@vue/ui</code>.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The version of the package.
     * </p>
     */
    private String version;
    /**
     * <p>
     * A summary of the package version. The summary is extracted from the package. The information in and detail level
     * of the summary depends on the package version's format.
     * </p>
     */
    private String summary;
    /**
     * <p>
     * The homepage associated with the package.
     * </p>
     */
    private String homePage;
    /**
     * <p>
     * The repository for the source code in the package version, or the source code used to build it.
     * </p>
     */
    private String sourceCodeRepository;
    /**
     * <p>
     * A timestamp that contains the date and time the package version was published.
     * </p>
     */
    private java.util.Date publishedTime;
    /**
     * <p>
     * Information about licenses associated with the package version.
     * </p>
     */
    private java.util.List<LicenseInfo> licenses;
    /**
     * <p>
     * The revision of the package version.
     * </p>
     */
    private String revision;
    /**
     * <p>
     * A string that contains the status of the package version. It can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Published</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unfinished</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unlisted</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Archived</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Disposed</code>
     * </p>
     * </li>
     * </ul>
     */
    private String status;

    /**
     * <p>
     * The format of the package version. The valid package formats are:
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
     *        The format of the package version. The valid package formats are: </p>
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
     * The format of the package version. The valid package formats are:
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
     * @return The format of the package version. The valid package formats are: </p>
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
     * The format of the package version. The valid package formats are:
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
     *        The format of the package version. The valid package formats are: </p>
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

    public PackageVersionDescription withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * The format of the package version. The valid package formats are:
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
     *        The format of the package version. The valid package formats are: </p>
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

    public PackageVersionDescription withFormat(PackageFormat format) {
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

    public PackageVersionDescription withNamespace(String namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * <p>
     * The name of the requested package.
     * </p>
     * 
     * @param packageName
     *        The name of the requested package.
     */

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    /**
     * <p>
     * The name of the requested package.
     * </p>
     * 
     * @return The name of the requested package.
     */

    public String getPackageName() {
        return this.packageName;
    }

    /**
     * <p>
     * The name of the requested package.
     * </p>
     * 
     * @param packageName
     *        The name of the requested package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackageVersionDescription withPackageName(String packageName) {
        setPackageName(packageName);
        return this;
    }

    /**
     * <p>
     * The name of the package that is displayed. The <code>displayName</code> varies depending on the package version's
     * format. For example, if an npm package is named <code>ui</code>, is in the namespace <code>vue</code>, and has
     * the format <code>npm</code>, then the <code>displayName</code> is <code>@vue/ui</code>.
     * </p>
     * 
     * @param displayName
     *        The name of the package that is displayed. The <code>displayName</code> varies depending on the package
     *        version's format. For example, if an npm package is named <code>ui</code>, is in the namespace
     *        <code>vue</code>, and has the format <code>npm</code>, then the <code>displayName</code> is
     *        <code>@vue/ui</code>.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The name of the package that is displayed. The <code>displayName</code> varies depending on the package version's
     * format. For example, if an npm package is named <code>ui</code>, is in the namespace <code>vue</code>, and has
     * the format <code>npm</code>, then the <code>displayName</code> is <code>@vue/ui</code>.
     * </p>
     * 
     * @return The name of the package that is displayed. The <code>displayName</code> varies depending on the package
     *         version's format. For example, if an npm package is named <code>ui</code>, is in the namespace
     *         <code>vue</code>, and has the format <code>npm</code>, then the <code>displayName</code> is
     *         <code>@vue/ui</code>.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The name of the package that is displayed. The <code>displayName</code> varies depending on the package version's
     * format. For example, if an npm package is named <code>ui</code>, is in the namespace <code>vue</code>, and has
     * the format <code>npm</code>, then the <code>displayName</code> is <code>@vue/ui</code>.
     * </p>
     * 
     * @param displayName
     *        The name of the package that is displayed. The <code>displayName</code> varies depending on the package
     *        version's format. For example, if an npm package is named <code>ui</code>, is in the namespace
     *        <code>vue</code>, and has the format <code>npm</code>, then the <code>displayName</code> is
     *        <code>@vue/ui</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackageVersionDescription withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The version of the package.
     * </p>
     * 
     * @param version
     *        The version of the package.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the package.
     * </p>
     * 
     * @return The version of the package.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version of the package.
     * </p>
     * 
     * @param version
     *        The version of the package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackageVersionDescription withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * A summary of the package version. The summary is extracted from the package. The information in and detail level
     * of the summary depends on the package version's format.
     * </p>
     * 
     * @param summary
     *        A summary of the package version. The summary is extracted from the package. The information in and detail
     *        level of the summary depends on the package version's format.
     */

    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * <p>
     * A summary of the package version. The summary is extracted from the package. The information in and detail level
     * of the summary depends on the package version's format.
     * </p>
     * 
     * @return A summary of the package version. The summary is extracted from the package. The information in and
     *         detail level of the summary depends on the package version's format.
     */

    public String getSummary() {
        return this.summary;
    }

    /**
     * <p>
     * A summary of the package version. The summary is extracted from the package. The information in and detail level
     * of the summary depends on the package version's format.
     * </p>
     * 
     * @param summary
     *        A summary of the package version. The summary is extracted from the package. The information in and detail
     *        level of the summary depends on the package version's format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackageVersionDescription withSummary(String summary) {
        setSummary(summary);
        return this;
    }

    /**
     * <p>
     * The homepage associated with the package.
     * </p>
     * 
     * @param homePage
     *        The homepage associated with the package.
     */

    public void setHomePage(String homePage) {
        this.homePage = homePage;
    }

    /**
     * <p>
     * The homepage associated with the package.
     * </p>
     * 
     * @return The homepage associated with the package.
     */

    public String getHomePage() {
        return this.homePage;
    }

    /**
     * <p>
     * The homepage associated with the package.
     * </p>
     * 
     * @param homePage
     *        The homepage associated with the package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackageVersionDescription withHomePage(String homePage) {
        setHomePage(homePage);
        return this;
    }

    /**
     * <p>
     * The repository for the source code in the package version, or the source code used to build it.
     * </p>
     * 
     * @param sourceCodeRepository
     *        The repository for the source code in the package version, or the source code used to build it.
     */

    public void setSourceCodeRepository(String sourceCodeRepository) {
        this.sourceCodeRepository = sourceCodeRepository;
    }

    /**
     * <p>
     * The repository for the source code in the package version, or the source code used to build it.
     * </p>
     * 
     * @return The repository for the source code in the package version, or the source code used to build it.
     */

    public String getSourceCodeRepository() {
        return this.sourceCodeRepository;
    }

    /**
     * <p>
     * The repository for the source code in the package version, or the source code used to build it.
     * </p>
     * 
     * @param sourceCodeRepository
     *        The repository for the source code in the package version, or the source code used to build it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackageVersionDescription withSourceCodeRepository(String sourceCodeRepository) {
        setSourceCodeRepository(sourceCodeRepository);
        return this;
    }

    /**
     * <p>
     * A timestamp that contains the date and time the package version was published.
     * </p>
     * 
     * @param publishedTime
     *        A timestamp that contains the date and time the package version was published.
     */

    public void setPublishedTime(java.util.Date publishedTime) {
        this.publishedTime = publishedTime;
    }

    /**
     * <p>
     * A timestamp that contains the date and time the package version was published.
     * </p>
     * 
     * @return A timestamp that contains the date and time the package version was published.
     */

    public java.util.Date getPublishedTime() {
        return this.publishedTime;
    }

    /**
     * <p>
     * A timestamp that contains the date and time the package version was published.
     * </p>
     * 
     * @param publishedTime
     *        A timestamp that contains the date and time the package version was published.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackageVersionDescription withPublishedTime(java.util.Date publishedTime) {
        setPublishedTime(publishedTime);
        return this;
    }

    /**
     * <p>
     * Information about licenses associated with the package version.
     * </p>
     * 
     * @return Information about licenses associated with the package version.
     */

    public java.util.List<LicenseInfo> getLicenses() {
        return licenses;
    }

    /**
     * <p>
     * Information about licenses associated with the package version.
     * </p>
     * 
     * @param licenses
     *        Information about licenses associated with the package version.
     */

    public void setLicenses(java.util.Collection<LicenseInfo> licenses) {
        if (licenses == null) {
            this.licenses = null;
            return;
        }

        this.licenses = new java.util.ArrayList<LicenseInfo>(licenses);
    }

    /**
     * <p>
     * Information about licenses associated with the package version.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLicenses(java.util.Collection)} or {@link #withLicenses(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param licenses
     *        Information about licenses associated with the package version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackageVersionDescription withLicenses(LicenseInfo... licenses) {
        if (this.licenses == null) {
            setLicenses(new java.util.ArrayList<LicenseInfo>(licenses.length));
        }
        for (LicenseInfo ele : licenses) {
            this.licenses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about licenses associated with the package version.
     * </p>
     * 
     * @param licenses
     *        Information about licenses associated with the package version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackageVersionDescription withLicenses(java.util.Collection<LicenseInfo> licenses) {
        setLicenses(licenses);
        return this;
    }

    /**
     * <p>
     * The revision of the package version.
     * </p>
     * 
     * @param revision
     *        The revision of the package version.
     */

    public void setRevision(String revision) {
        this.revision = revision;
    }

    /**
     * <p>
     * The revision of the package version.
     * </p>
     * 
     * @return The revision of the package version.
     */

    public String getRevision() {
        return this.revision;
    }

    /**
     * <p>
     * The revision of the package version.
     * </p>
     * 
     * @param revision
     *        The revision of the package version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackageVersionDescription withRevision(String revision) {
        setRevision(revision);
        return this;
    }

    /**
     * <p>
     * A string that contains the status of the package version. It can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Published</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unfinished</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unlisted</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Archived</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Disposed</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        A string that contains the status of the package version. It can be one of the following: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Published</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Unfinished</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Unlisted</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Archived</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Disposed</code>
     *        </p>
     *        </li>
     * @see PackageVersionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * A string that contains the status of the package version. It can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Published</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unfinished</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unlisted</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Archived</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Disposed</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return A string that contains the status of the package version. It can be one of the following: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Published</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Unfinished</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Unlisted</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Archived</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Disposed</code>
     *         </p>
     *         </li>
     * @see PackageVersionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * A string that contains the status of the package version. It can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Published</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unfinished</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unlisted</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Archived</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Disposed</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        A string that contains the status of the package version. It can be one of the following: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Published</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Unfinished</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Unlisted</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Archived</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Disposed</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageVersionStatus
     */

    public PackageVersionDescription withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * A string that contains the status of the package version. It can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Published</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unfinished</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unlisted</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Archived</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Disposed</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        A string that contains the status of the package version. It can be one of the following: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Published</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Unfinished</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Unlisted</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Archived</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Disposed</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageVersionStatus
     */

    public PackageVersionDescription withStatus(PackageVersionStatus status) {
        this.status = status.toString();
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
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat()).append(",");
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace()).append(",");
        if (getPackageName() != null)
            sb.append("PackageName: ").append(getPackageName()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getSummary() != null)
            sb.append("Summary: ").append(getSummary()).append(",");
        if (getHomePage() != null)
            sb.append("HomePage: ").append(getHomePage()).append(",");
        if (getSourceCodeRepository() != null)
            sb.append("SourceCodeRepository: ").append(getSourceCodeRepository()).append(",");
        if (getPublishedTime() != null)
            sb.append("PublishedTime: ").append(getPublishedTime()).append(",");
        if (getLicenses() != null)
            sb.append("Licenses: ").append(getLicenses()).append(",");
        if (getRevision() != null)
            sb.append("Revision: ").append(getRevision()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PackageVersionDescription == false)
            return false;
        PackageVersionDescription other = (PackageVersionDescription) obj;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        if (other.getPackageName() == null ^ this.getPackageName() == null)
            return false;
        if (other.getPackageName() != null && other.getPackageName().equals(this.getPackageName()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getSummary() == null ^ this.getSummary() == null)
            return false;
        if (other.getSummary() != null && other.getSummary().equals(this.getSummary()) == false)
            return false;
        if (other.getHomePage() == null ^ this.getHomePage() == null)
            return false;
        if (other.getHomePage() != null && other.getHomePage().equals(this.getHomePage()) == false)
            return false;
        if (other.getSourceCodeRepository() == null ^ this.getSourceCodeRepository() == null)
            return false;
        if (other.getSourceCodeRepository() != null && other.getSourceCodeRepository().equals(this.getSourceCodeRepository()) == false)
            return false;
        if (other.getPublishedTime() == null ^ this.getPublishedTime() == null)
            return false;
        if (other.getPublishedTime() != null && other.getPublishedTime().equals(this.getPublishedTime()) == false)
            return false;
        if (other.getLicenses() == null ^ this.getLicenses() == null)
            return false;
        if (other.getLicenses() != null && other.getLicenses().equals(this.getLicenses()) == false)
            return false;
        if (other.getRevision() == null ^ this.getRevision() == null)
            return false;
        if (other.getRevision() != null && other.getRevision().equals(this.getRevision()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getPackageName() == null) ? 0 : getPackageName().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getSummary() == null) ? 0 : getSummary().hashCode());
        hashCode = prime * hashCode + ((getHomePage() == null) ? 0 : getHomePage().hashCode());
        hashCode = prime * hashCode + ((getSourceCodeRepository() == null) ? 0 : getSourceCodeRepository().hashCode());
        hashCode = prime * hashCode + ((getPublishedTime() == null) ? 0 : getPublishedTime().hashCode());
        hashCode = prime * hashCode + ((getLicenses() == null) ? 0 : getLicenses().hashCode());
        hashCode = prime * hashCode + ((getRevision() == null) ? 0 : getRevision().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public PackageVersionDescription clone() {
        try {
            return (PackageVersionDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codeartifact.model.transform.PackageVersionDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
