/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.serverlessapplicationrepository.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/GetApplication" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetApplicationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The application Amazon Resource Name (ARN).
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The name of the author publishing the app.
     * </p>
     * <p>
     * Minimum length=1. Maximum length=127.
     * </p>
     * <p>
     * Pattern "^[a-z0-9](([a-z0-9]|-(?!-))*[a-z0-9])?$";
     * </p>
     */
    private String author;
    /**
     * <p>
     * The date and time this resource was created.
     * </p>
     */
    private String creationTime;
    /**
     * <p>
     * The description of the application.
     * </p>
     * <p>
     * Minimum length=1. Maximum length=256
     * </p>
     */
    private String description;
    /**
     * <p>
     * A URL with more information about the application, for example the location of your GitHub repository for the
     * application.
     * </p>
     */
    private String homePageUrl;
    /**
     * <p>
     * Labels to improve discovery of apps in search results.
     * </p>
     * <p>
     * Minimum length=1. Maximum length=127. Maximum number of labels: 10
     * </p>
     * <p>
     * Pattern: "^[a-zA-Z0-9+\\-_:\\/@]+$";
     * </p>
     */
    private java.util.List<String> labels;
    /**
     * <p>
     * A link to a license file of the app that matches the spdxLicenseID value of your application.
     * </p>
     * <p>
     * Maximum size 5 MB
     * </p>
     */
    private String licenseUrl;
    /**
     * <p>
     * The name of the application.
     * </p>
     * <p>
     * Minimum length=1. Maximum length=140
     * </p>
     * <p>
     * Pattern: "[a-zA-Z0-9\\-]+";
     * </p>
     */
    private String name;
    /**
     * <p>
     * A link to the readme file in Markdown language that contains a more detailed description of the application and
     * how it works.
     * </p>
     * <p>
     * Maximum size 5 MB
     * </p>
     */
    private String readmeUrl;
    /**
     * <p>
     * A valid identifier from https://spdx.org/licenses/.
     * </p>
     */
    private String spdxLicenseId;
    /**
     * <p>
     * Version information about the application.
     * </p>
     */
    private Version version;

    /**
     * <p>
     * The application Amazon Resource Name (ARN).
     * </p>
     * 
     * @param applicationId
     *        The application Amazon Resource Name (ARN).
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The application Amazon Resource Name (ARN).
     * </p>
     * 
     * @return The application Amazon Resource Name (ARN).
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The application Amazon Resource Name (ARN).
     * </p>
     * 
     * @param applicationId
     *        The application Amazon Resource Name (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationResult withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The name of the author publishing the app.
     * </p>
     * <p>
     * Minimum length=1. Maximum length=127.
     * </p>
     * <p>
     * Pattern "^[a-z0-9](([a-z0-9]|-(?!-))*[a-z0-9])?$";
     * </p>
     * 
     * @param author
     *        The name of the author publishing the app.</p>
     *        <p>
     *        Minimum length=1. Maximum length=127.
     *        </p>
     *        <p>
     *        Pattern "^[a-z0-9](([a-z0-9]|-(?!-))*[a-z0-9])?$";
     */

    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * <p>
     * The name of the author publishing the app.
     * </p>
     * <p>
     * Minimum length=1. Maximum length=127.
     * </p>
     * <p>
     * Pattern "^[a-z0-9](([a-z0-9]|-(?!-))*[a-z0-9])?$";
     * </p>
     * 
     * @return The name of the author publishing the app.</p>
     *         <p>
     *         Minimum length=1. Maximum length=127.
     *         </p>
     *         <p>
     *         Pattern "^[a-z0-9](([a-z0-9]|-(?!-))*[a-z0-9])?$";
     */

    public String getAuthor() {
        return this.author;
    }

    /**
     * <p>
     * The name of the author publishing the app.
     * </p>
     * <p>
     * Minimum length=1. Maximum length=127.
     * </p>
     * <p>
     * Pattern "^[a-z0-9](([a-z0-9]|-(?!-))*[a-z0-9])?$";
     * </p>
     * 
     * @param author
     *        The name of the author publishing the app.</p>
     *        <p>
     *        Minimum length=1. Maximum length=127.
     *        </p>
     *        <p>
     *        Pattern "^[a-z0-9](([a-z0-9]|-(?!-))*[a-z0-9])?$";
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationResult withAuthor(String author) {
        setAuthor(author);
        return this;
    }

    /**
     * <p>
     * The date and time this resource was created.
     * </p>
     * 
     * @param creationTime
     *        The date and time this resource was created.
     */

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The date and time this resource was created.
     * </p>
     * 
     * @return The date and time this resource was created.
     */

    public String getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The date and time this resource was created.
     * </p>
     * 
     * @param creationTime
     *        The date and time this resource was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationResult withCreationTime(String creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The description of the application.
     * </p>
     * <p>
     * Minimum length=1. Maximum length=256
     * </p>
     * 
     * @param description
     *        The description of the application.</p>
     *        <p>
     *        Minimum length=1. Maximum length=256
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the application.
     * </p>
     * <p>
     * Minimum length=1. Maximum length=256
     * </p>
     * 
     * @return The description of the application.</p>
     *         <p>
     *         Minimum length=1. Maximum length=256
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the application.
     * </p>
     * <p>
     * Minimum length=1. Maximum length=256
     * </p>
     * 
     * @param description
     *        The description of the application.</p>
     *        <p>
     *        Minimum length=1. Maximum length=256
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A URL with more information about the application, for example the location of your GitHub repository for the
     * application.
     * </p>
     * 
     * @param homePageUrl
     *        A URL with more information about the application, for example the location of your GitHub repository for
     *        the application.
     */

    public void setHomePageUrl(String homePageUrl) {
        this.homePageUrl = homePageUrl;
    }

    /**
     * <p>
     * A URL with more information about the application, for example the location of your GitHub repository for the
     * application.
     * </p>
     * 
     * @return A URL with more information about the application, for example the location of your GitHub repository for
     *         the application.
     */

    public String getHomePageUrl() {
        return this.homePageUrl;
    }

    /**
     * <p>
     * A URL with more information about the application, for example the location of your GitHub repository for the
     * application.
     * </p>
     * 
     * @param homePageUrl
     *        A URL with more information about the application, for example the location of your GitHub repository for
     *        the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationResult withHomePageUrl(String homePageUrl) {
        setHomePageUrl(homePageUrl);
        return this;
    }

    /**
     * <p>
     * Labels to improve discovery of apps in search results.
     * </p>
     * <p>
     * Minimum length=1. Maximum length=127. Maximum number of labels: 10
     * </p>
     * <p>
     * Pattern: "^[a-zA-Z0-9+\\-_:\\/@]+$";
     * </p>
     * 
     * @return Labels to improve discovery of apps in search results.</p>
     *         <p>
     *         Minimum length=1. Maximum length=127. Maximum number of labels: 10
     *         </p>
     *         <p>
     *         Pattern: "^[a-zA-Z0-9+\\-_:\\/@]+$";
     */

    public java.util.List<String> getLabels() {
        return labels;
    }

    /**
     * <p>
     * Labels to improve discovery of apps in search results.
     * </p>
     * <p>
     * Minimum length=1. Maximum length=127. Maximum number of labels: 10
     * </p>
     * <p>
     * Pattern: "^[a-zA-Z0-9+\\-_:\\/@]+$";
     * </p>
     * 
     * @param labels
     *        Labels to improve discovery of apps in search results.</p>
     *        <p>
     *        Minimum length=1. Maximum length=127. Maximum number of labels: 10
     *        </p>
     *        <p>
     *        Pattern: "^[a-zA-Z0-9+\\-_:\\/@]+$";
     */

    public void setLabels(java.util.Collection<String> labels) {
        if (labels == null) {
            this.labels = null;
            return;
        }

        this.labels = new java.util.ArrayList<String>(labels);
    }

    /**
     * <p>
     * Labels to improve discovery of apps in search results.
     * </p>
     * <p>
     * Minimum length=1. Maximum length=127. Maximum number of labels: 10
     * </p>
     * <p>
     * Pattern: "^[a-zA-Z0-9+\\-_:\\/@]+$";
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLabels(java.util.Collection)} or {@link #withLabels(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param labels
     *        Labels to improve discovery of apps in search results.</p>
     *        <p>
     *        Minimum length=1. Maximum length=127. Maximum number of labels: 10
     *        </p>
     *        <p>
     *        Pattern: "^[a-zA-Z0-9+\\-_:\\/@]+$";
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationResult withLabels(String... labels) {
        if (this.labels == null) {
            setLabels(new java.util.ArrayList<String>(labels.length));
        }
        for (String ele : labels) {
            this.labels.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Labels to improve discovery of apps in search results.
     * </p>
     * <p>
     * Minimum length=1. Maximum length=127. Maximum number of labels: 10
     * </p>
     * <p>
     * Pattern: "^[a-zA-Z0-9+\\-_:\\/@]+$";
     * </p>
     * 
     * @param labels
     *        Labels to improve discovery of apps in search results.</p>
     *        <p>
     *        Minimum length=1. Maximum length=127. Maximum number of labels: 10
     *        </p>
     *        <p>
     *        Pattern: "^[a-zA-Z0-9+\\-_:\\/@]+$";
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationResult withLabels(java.util.Collection<String> labels) {
        setLabels(labels);
        return this;
    }

    /**
     * <p>
     * A link to a license file of the app that matches the spdxLicenseID value of your application.
     * </p>
     * <p>
     * Maximum size 5 MB
     * </p>
     * 
     * @param licenseUrl
     *        A link to a license file of the app that matches the spdxLicenseID value of your application.</p>
     *        <p>
     *        Maximum size 5 MB
     */

    public void setLicenseUrl(String licenseUrl) {
        this.licenseUrl = licenseUrl;
    }

    /**
     * <p>
     * A link to a license file of the app that matches the spdxLicenseID value of your application.
     * </p>
     * <p>
     * Maximum size 5 MB
     * </p>
     * 
     * @return A link to a license file of the app that matches the spdxLicenseID value of your application.</p>
     *         <p>
     *         Maximum size 5 MB
     */

    public String getLicenseUrl() {
        return this.licenseUrl;
    }

    /**
     * <p>
     * A link to a license file of the app that matches the spdxLicenseID value of your application.
     * </p>
     * <p>
     * Maximum size 5 MB
     * </p>
     * 
     * @param licenseUrl
     *        A link to a license file of the app that matches the spdxLicenseID value of your application.</p>
     *        <p>
     *        Maximum size 5 MB
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationResult withLicenseUrl(String licenseUrl) {
        setLicenseUrl(licenseUrl);
        return this;
    }

    /**
     * <p>
     * The name of the application.
     * </p>
     * <p>
     * Minimum length=1. Maximum length=140
     * </p>
     * <p>
     * Pattern: "[a-zA-Z0-9\\-]+";
     * </p>
     * 
     * @param name
     *        The name of the application.</p>
     *        <p>
     *        Minimum length=1. Maximum length=140
     *        </p>
     *        <p>
     *        Pattern: "[a-zA-Z0-9\\-]+";
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the application.
     * </p>
     * <p>
     * Minimum length=1. Maximum length=140
     * </p>
     * <p>
     * Pattern: "[a-zA-Z0-9\\-]+";
     * </p>
     * 
     * @return The name of the application.</p>
     *         <p>
     *         Minimum length=1. Maximum length=140
     *         </p>
     *         <p>
     *         Pattern: "[a-zA-Z0-9\\-]+";
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the application.
     * </p>
     * <p>
     * Minimum length=1. Maximum length=140
     * </p>
     * <p>
     * Pattern: "[a-zA-Z0-9\\-]+";
     * </p>
     * 
     * @param name
     *        The name of the application.</p>
     *        <p>
     *        Minimum length=1. Maximum length=140
     *        </p>
     *        <p>
     *        Pattern: "[a-zA-Z0-9\\-]+";
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A link to the readme file in Markdown language that contains a more detailed description of the application and
     * how it works.
     * </p>
     * <p>
     * Maximum size 5 MB
     * </p>
     * 
     * @param readmeUrl
     *        A link to the readme file in Markdown language that contains a more detailed description of the
     *        application and how it works.</p>
     *        <p>
     *        Maximum size 5 MB
     */

    public void setReadmeUrl(String readmeUrl) {
        this.readmeUrl = readmeUrl;
    }

    /**
     * <p>
     * A link to the readme file in Markdown language that contains a more detailed description of the application and
     * how it works.
     * </p>
     * <p>
     * Maximum size 5 MB
     * </p>
     * 
     * @return A link to the readme file in Markdown language that contains a more detailed description of the
     *         application and how it works.</p>
     *         <p>
     *         Maximum size 5 MB
     */

    public String getReadmeUrl() {
        return this.readmeUrl;
    }

    /**
     * <p>
     * A link to the readme file in Markdown language that contains a more detailed description of the application and
     * how it works.
     * </p>
     * <p>
     * Maximum size 5 MB
     * </p>
     * 
     * @param readmeUrl
     *        A link to the readme file in Markdown language that contains a more detailed description of the
     *        application and how it works.</p>
     *        <p>
     *        Maximum size 5 MB
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationResult withReadmeUrl(String readmeUrl) {
        setReadmeUrl(readmeUrl);
        return this;
    }

    /**
     * <p>
     * A valid identifier from https://spdx.org/licenses/.
     * </p>
     * 
     * @param spdxLicenseId
     *        A valid identifier from https://spdx.org/licenses/.
     */

    public void setSpdxLicenseId(String spdxLicenseId) {
        this.spdxLicenseId = spdxLicenseId;
    }

    /**
     * <p>
     * A valid identifier from https://spdx.org/licenses/.
     * </p>
     * 
     * @return A valid identifier from https://spdx.org/licenses/.
     */

    public String getSpdxLicenseId() {
        return this.spdxLicenseId;
    }

    /**
     * <p>
     * A valid identifier from https://spdx.org/licenses/.
     * </p>
     * 
     * @param spdxLicenseId
     *        A valid identifier from https://spdx.org/licenses/.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationResult withSpdxLicenseId(String spdxLicenseId) {
        setSpdxLicenseId(spdxLicenseId);
        return this;
    }

    /**
     * <p>
     * Version information about the application.
     * </p>
     * 
     * @param version
     *        Version information about the application.
     */

    public void setVersion(Version version) {
        this.version = version;
    }

    /**
     * <p>
     * Version information about the application.
     * </p>
     * 
     * @return Version information about the application.
     */

    public Version getVersion() {
        return this.version;
    }

    /**
     * <p>
     * Version information about the application.
     * </p>
     * 
     * @param version
     *        Version information about the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationResult withVersion(Version version) {
        setVersion(version);
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getAuthor() != null)
            sb.append("Author: ").append(getAuthor()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getHomePageUrl() != null)
            sb.append("HomePageUrl: ").append(getHomePageUrl()).append(",");
        if (getLabels() != null)
            sb.append("Labels: ").append(getLabels()).append(",");
        if (getLicenseUrl() != null)
            sb.append("LicenseUrl: ").append(getLicenseUrl()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getReadmeUrl() != null)
            sb.append("ReadmeUrl: ").append(getReadmeUrl()).append(",");
        if (getSpdxLicenseId() != null)
            sb.append("SpdxLicenseId: ").append(getSpdxLicenseId()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetApplicationResult == false)
            return false;
        GetApplicationResult other = (GetApplicationResult) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getAuthor() == null ^ this.getAuthor() == null)
            return false;
        if (other.getAuthor() != null && other.getAuthor().equals(this.getAuthor()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getHomePageUrl() == null ^ this.getHomePageUrl() == null)
            return false;
        if (other.getHomePageUrl() != null && other.getHomePageUrl().equals(this.getHomePageUrl()) == false)
            return false;
        if (other.getLabels() == null ^ this.getLabels() == null)
            return false;
        if (other.getLabels() != null && other.getLabels().equals(this.getLabels()) == false)
            return false;
        if (other.getLicenseUrl() == null ^ this.getLicenseUrl() == null)
            return false;
        if (other.getLicenseUrl() != null && other.getLicenseUrl().equals(this.getLicenseUrl()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getReadmeUrl() == null ^ this.getReadmeUrl() == null)
            return false;
        if (other.getReadmeUrl() != null && other.getReadmeUrl().equals(this.getReadmeUrl()) == false)
            return false;
        if (other.getSpdxLicenseId() == null ^ this.getSpdxLicenseId() == null)
            return false;
        if (other.getSpdxLicenseId() != null && other.getSpdxLicenseId().equals(this.getSpdxLicenseId()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getAuthor() == null) ? 0 : getAuthor().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getHomePageUrl() == null) ? 0 : getHomePageUrl().hashCode());
        hashCode = prime * hashCode + ((getLabels() == null) ? 0 : getLabels().hashCode());
        hashCode = prime * hashCode + ((getLicenseUrl() == null) ? 0 : getLicenseUrl().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getReadmeUrl() == null) ? 0 : getReadmeUrl().hashCode());
        hashCode = prime * hashCode + ((getSpdxLicenseId() == null) ? 0 : getSpdxLicenseId().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public GetApplicationResult clone() {
        try {
            return (GetApplicationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
