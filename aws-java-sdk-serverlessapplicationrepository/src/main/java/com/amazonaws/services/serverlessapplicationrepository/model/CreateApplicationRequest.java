/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/CreateApplication" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateApplicationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The name of the author publishing the app.\nMin Length=1. Max Length=127.\nPattern
     * "^[a-z0-9](([a-z0-9]|-(?!-))*[a-z0-9])?$";
     */
    private String author;
    /** The description of the application.\nMin Length=1. Max Length=256 */
    private String description;
    /**
     * Labels to improve discovery of apps in search results.\nMin Length=1. Max Length=127. Maximum number of labels:
     * 10\nPattern: "^[a-zA-Z0-9+\\-_:\\/@]+$";
     */
    private java.util.List<String> labels;
    /**
     * A raw text file that contains the license of the app that matches the spdxLicenseID of your application.\nMax
     * size 5 MB
     */
    private String licenseBody;
    /** A link to a license file of the app that matches the spdxLicenseID of your application.\nMax size 5 MB */
    private String licenseUrl;
    /** The name of the application you want to publish.\nMin Length=1. Max Length=140\nPattern: "[a-zA-Z0-9\\-]+"; */
    private String name;
    /**
     * A raw text Readme file that contains a more detailed description of the application and how it works in markdown
     * language.\nMax size 5 MB
     */
    private String readmeBody;
    /**
     * A link to the Readme file that contains a more detailed description of the application and how it works in
     * markdown language.\nMax size 5 MB
     */
    private String readmeUrl;
    /** The semantic version of the application:\n\n https://semver.org/ */
    private String semanticVersion;
    /** A link to a public repository for the source code of your application. */
    private String sourceCodeUrl;
    /** A valid identifier from https://spdx.org/licenses/ . */
    private String spdxLicenseId;
    /** The raw packaged SAM template of your application. */
    private String templateBody;
    /** A link to the packaged SAM template of your application. */
    private String templateUrl;

    /**
     * The name of the author publishing the app.\nMin Length=1. Max Length=127.\nPattern
     * "^[a-z0-9](([a-z0-9]|-(?!-))*[a-z0-9])?$";
     * 
     * @param author
     *        The name of the author publishing the app.\nMin Length=1. Max Length=127.\nPattern
     *        "^[a-z0-9](([a-z0-9]|-(?!-))*[a-z0-9])?$";
     */

    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * The name of the author publishing the app.\nMin Length=1. Max Length=127.\nPattern
     * "^[a-z0-9](([a-z0-9]|-(?!-))*[a-z0-9])?$";
     * 
     * @return The name of the author publishing the app.\nMin Length=1. Max Length=127.\nPattern
     *         "^[a-z0-9](([a-z0-9]|-(?!-))*[a-z0-9])?$";
     */

    public String getAuthor() {
        return this.author;
    }

    /**
     * The name of the author publishing the app.\nMin Length=1. Max Length=127.\nPattern
     * "^[a-z0-9](([a-z0-9]|-(?!-))*[a-z0-9])?$";
     * 
     * @param author
     *        The name of the author publishing the app.\nMin Length=1. Max Length=127.\nPattern
     *        "^[a-z0-9](([a-z0-9]|-(?!-))*[a-z0-9])?$";
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withAuthor(String author) {
        setAuthor(author);
        return this;
    }

    /**
     * The description of the application.\nMin Length=1. Max Length=256
     * 
     * @param description
     *        The description of the application.\nMin Length=1. Max Length=256
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * The description of the application.\nMin Length=1. Max Length=256
     * 
     * @return The description of the application.\nMin Length=1. Max Length=256
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * The description of the application.\nMin Length=1. Max Length=256
     * 
     * @param description
     *        The description of the application.\nMin Length=1. Max Length=256
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * Labels to improve discovery of apps in search results.\nMin Length=1. Max Length=127. Maximum number of labels:
     * 10\nPattern: "^[a-zA-Z0-9+\\-_:\\/@]+$";
     * 
     * @return Labels to improve discovery of apps in search results.\nMin Length=1. Max Length=127. Maximum number of
     *         labels: 10\nPattern: "^[a-zA-Z0-9+\\-_:\\/@]+$";
     */

    public java.util.List<String> getLabels() {
        return labels;
    }

    /**
     * Labels to improve discovery of apps in search results.\nMin Length=1. Max Length=127. Maximum number of labels:
     * 10\nPattern: "^[a-zA-Z0-9+\\-_:\\/@]+$";
     * 
     * @param labels
     *        Labels to improve discovery of apps in search results.\nMin Length=1. Max Length=127. Maximum number of
     *        labels: 10\nPattern: "^[a-zA-Z0-9+\\-_:\\/@]+$";
     */

    public void setLabels(java.util.Collection<String> labels) {
        if (labels == null) {
            this.labels = null;
            return;
        }

        this.labels = new java.util.ArrayList<String>(labels);
    }

    /**
     * Labels to improve discovery of apps in search results.\nMin Length=1. Max Length=127. Maximum number of labels:
     * 10\nPattern: "^[a-zA-Z0-9+\\-_:\\/@]+$";
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLabels(java.util.Collection)} or {@link #withLabels(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param labels
     *        Labels to improve discovery of apps in search results.\nMin Length=1. Max Length=127. Maximum number of
     *        labels: 10\nPattern: "^[a-zA-Z0-9+\\-_:\\/@]+$";
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withLabels(String... labels) {
        if (this.labels == null) {
            setLabels(new java.util.ArrayList<String>(labels.length));
        }
        for (String ele : labels) {
            this.labels.add(ele);
        }
        return this;
    }

    /**
     * Labels to improve discovery of apps in search results.\nMin Length=1. Max Length=127. Maximum number of labels:
     * 10\nPattern: "^[a-zA-Z0-9+\\-_:\\/@]+$";
     * 
     * @param labels
     *        Labels to improve discovery of apps in search results.\nMin Length=1. Max Length=127. Maximum number of
     *        labels: 10\nPattern: "^[a-zA-Z0-9+\\-_:\\/@]+$";
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withLabels(java.util.Collection<String> labels) {
        setLabels(labels);
        return this;
    }

    /**
     * A raw text file that contains the license of the app that matches the spdxLicenseID of your application.\nMax
     * size 5 MB
     * 
     * @param licenseBody
     *        A raw text file that contains the license of the app that matches the spdxLicenseID of your
     *        application.\nMax size 5 MB
     */

    public void setLicenseBody(String licenseBody) {
        this.licenseBody = licenseBody;
    }

    /**
     * A raw text file that contains the license of the app that matches the spdxLicenseID of your application.\nMax
     * size 5 MB
     * 
     * @return A raw text file that contains the license of the app that matches the spdxLicenseID of your
     *         application.\nMax size 5 MB
     */

    public String getLicenseBody() {
        return this.licenseBody;
    }

    /**
     * A raw text file that contains the license of the app that matches the spdxLicenseID of your application.\nMax
     * size 5 MB
     * 
     * @param licenseBody
     *        A raw text file that contains the license of the app that matches the spdxLicenseID of your
     *        application.\nMax size 5 MB
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withLicenseBody(String licenseBody) {
        setLicenseBody(licenseBody);
        return this;
    }

    /**
     * A link to a license file of the app that matches the spdxLicenseID of your application.\nMax size 5 MB
     * 
     * @param licenseUrl
     *        A link to a license file of the app that matches the spdxLicenseID of your application.\nMax size 5 MB
     */

    public void setLicenseUrl(String licenseUrl) {
        this.licenseUrl = licenseUrl;
    }

    /**
     * A link to a license file of the app that matches the spdxLicenseID of your application.\nMax size 5 MB
     * 
     * @return A link to a license file of the app that matches the spdxLicenseID of your application.\nMax size 5 MB
     */

    public String getLicenseUrl() {
        return this.licenseUrl;
    }

    /**
     * A link to a license file of the app that matches the spdxLicenseID of your application.\nMax size 5 MB
     * 
     * @param licenseUrl
     *        A link to a license file of the app that matches the spdxLicenseID of your application.\nMax size 5 MB
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withLicenseUrl(String licenseUrl) {
        setLicenseUrl(licenseUrl);
        return this;
    }

    /**
     * The name of the application you want to publish.\nMin Length=1. Max Length=140\nPattern: "[a-zA-Z0-9\\-]+";
     * 
     * @param name
     *        The name of the application you want to publish.\nMin Length=1. Max Length=140\nPattern:
     *        "[a-zA-Z0-9\\-]+";
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The name of the application you want to publish.\nMin Length=1. Max Length=140\nPattern: "[a-zA-Z0-9\\-]+";
     * 
     * @return The name of the application you want to publish.\nMin Length=1. Max Length=140\nPattern:
     *         "[a-zA-Z0-9\\-]+";
     */

    public String getName() {
        return this.name;
    }

    /**
     * The name of the application you want to publish.\nMin Length=1. Max Length=140\nPattern: "[a-zA-Z0-9\\-]+";
     * 
     * @param name
     *        The name of the application you want to publish.\nMin Length=1. Max Length=140\nPattern:
     *        "[a-zA-Z0-9\\-]+";
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * A raw text Readme file that contains a more detailed description of the application and how it works in markdown
     * language.\nMax size 5 MB
     * 
     * @param readmeBody
     *        A raw text Readme file that contains a more detailed description of the application and how it works in
     *        markdown language.\nMax size 5 MB
     */

    public void setReadmeBody(String readmeBody) {
        this.readmeBody = readmeBody;
    }

    /**
     * A raw text Readme file that contains a more detailed description of the application and how it works in markdown
     * language.\nMax size 5 MB
     * 
     * @return A raw text Readme file that contains a more detailed description of the application and how it works in
     *         markdown language.\nMax size 5 MB
     */

    public String getReadmeBody() {
        return this.readmeBody;
    }

    /**
     * A raw text Readme file that contains a more detailed description of the application and how it works in markdown
     * language.\nMax size 5 MB
     * 
     * @param readmeBody
     *        A raw text Readme file that contains a more detailed description of the application and how it works in
     *        markdown language.\nMax size 5 MB
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withReadmeBody(String readmeBody) {
        setReadmeBody(readmeBody);
        return this;
    }

    /**
     * A link to the Readme file that contains a more detailed description of the application and how it works in
     * markdown language.\nMax size 5 MB
     * 
     * @param readmeUrl
     *        A link to the Readme file that contains a more detailed description of the application and how it works in
     *        markdown language.\nMax size 5 MB
     */

    public void setReadmeUrl(String readmeUrl) {
        this.readmeUrl = readmeUrl;
    }

    /**
     * A link to the Readme file that contains a more detailed description of the application and how it works in
     * markdown language.\nMax size 5 MB
     * 
     * @return A link to the Readme file that contains a more detailed description of the application and how it works
     *         in markdown language.\nMax size 5 MB
     */

    public String getReadmeUrl() {
        return this.readmeUrl;
    }

    /**
     * A link to the Readme file that contains a more detailed description of the application and how it works in
     * markdown language.\nMax size 5 MB
     * 
     * @param readmeUrl
     *        A link to the Readme file that contains a more detailed description of the application and how it works in
     *        markdown language.\nMax size 5 MB
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withReadmeUrl(String readmeUrl) {
        setReadmeUrl(readmeUrl);
        return this;
    }

    /**
     * The semantic version of the application:\n\n https://semver.org/
     * 
     * @param semanticVersion
     *        The semantic version of the application:\n\n https://semver.org/
     */

    public void setSemanticVersion(String semanticVersion) {
        this.semanticVersion = semanticVersion;
    }

    /**
     * The semantic version of the application:\n\n https://semver.org/
     * 
     * @return The semantic version of the application:\n\n https://semver.org/
     */

    public String getSemanticVersion() {
        return this.semanticVersion;
    }

    /**
     * The semantic version of the application:\n\n https://semver.org/
     * 
     * @param semanticVersion
     *        The semantic version of the application:\n\n https://semver.org/
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withSemanticVersion(String semanticVersion) {
        setSemanticVersion(semanticVersion);
        return this;
    }

    /**
     * A link to a public repository for the source code of your application.
     * 
     * @param sourceCodeUrl
     *        A link to a public repository for the source code of your application.
     */

    public void setSourceCodeUrl(String sourceCodeUrl) {
        this.sourceCodeUrl = sourceCodeUrl;
    }

    /**
     * A link to a public repository for the source code of your application.
     * 
     * @return A link to a public repository for the source code of your application.
     */

    public String getSourceCodeUrl() {
        return this.sourceCodeUrl;
    }

    /**
     * A link to a public repository for the source code of your application.
     * 
     * @param sourceCodeUrl
     *        A link to a public repository for the source code of your application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withSourceCodeUrl(String sourceCodeUrl) {
        setSourceCodeUrl(sourceCodeUrl);
        return this;
    }

    /**
     * A valid identifier from https://spdx.org/licenses/ .
     * 
     * @param spdxLicenseId
     *        A valid identifier from https://spdx.org/licenses/ .
     */

    public void setSpdxLicenseId(String spdxLicenseId) {
        this.spdxLicenseId = spdxLicenseId;
    }

    /**
     * A valid identifier from https://spdx.org/licenses/ .
     * 
     * @return A valid identifier from https://spdx.org/licenses/ .
     */

    public String getSpdxLicenseId() {
        return this.spdxLicenseId;
    }

    /**
     * A valid identifier from https://spdx.org/licenses/ .
     * 
     * @param spdxLicenseId
     *        A valid identifier from https://spdx.org/licenses/ .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withSpdxLicenseId(String spdxLicenseId) {
        setSpdxLicenseId(spdxLicenseId);
        return this;
    }

    /**
     * The raw packaged SAM template of your application.
     * 
     * @param templateBody
     *        The raw packaged SAM template of your application.
     */

    public void setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
    }

    /**
     * The raw packaged SAM template of your application.
     * 
     * @return The raw packaged SAM template of your application.
     */

    public String getTemplateBody() {
        return this.templateBody;
    }

    /**
     * The raw packaged SAM template of your application.
     * 
     * @param templateBody
     *        The raw packaged SAM template of your application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withTemplateBody(String templateBody) {
        setTemplateBody(templateBody);
        return this;
    }

    /**
     * A link to the packaged SAM template of your application.
     * 
     * @param templateUrl
     *        A link to the packaged SAM template of your application.
     */

    public void setTemplateUrl(String templateUrl) {
        this.templateUrl = templateUrl;
    }

    /**
     * A link to the packaged SAM template of your application.
     * 
     * @return A link to the packaged SAM template of your application.
     */

    public String getTemplateUrl() {
        return this.templateUrl;
    }

    /**
     * A link to the packaged SAM template of your application.
     * 
     * @param templateUrl
     *        A link to the packaged SAM template of your application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withTemplateUrl(String templateUrl) {
        setTemplateUrl(templateUrl);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAuthor() != null)
            sb.append("Author: ").append(getAuthor()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getLabels() != null)
            sb.append("Labels: ").append(getLabels()).append(",");
        if (getLicenseBody() != null)
            sb.append("LicenseBody: ").append(getLicenseBody()).append(",");
        if (getLicenseUrl() != null)
            sb.append("LicenseUrl: ").append(getLicenseUrl()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getReadmeBody() != null)
            sb.append("ReadmeBody: ").append(getReadmeBody()).append(",");
        if (getReadmeUrl() != null)
            sb.append("ReadmeUrl: ").append(getReadmeUrl()).append(",");
        if (getSemanticVersion() != null)
            sb.append("SemanticVersion: ").append(getSemanticVersion()).append(",");
        if (getSourceCodeUrl() != null)
            sb.append("SourceCodeUrl: ").append(getSourceCodeUrl()).append(",");
        if (getSpdxLicenseId() != null)
            sb.append("SpdxLicenseId: ").append(getSpdxLicenseId()).append(",");
        if (getTemplateBody() != null)
            sb.append("TemplateBody: ").append(getTemplateBody()).append(",");
        if (getTemplateUrl() != null)
            sb.append("TemplateUrl: ").append(getTemplateUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateApplicationRequest == false)
            return false;
        CreateApplicationRequest other = (CreateApplicationRequest) obj;
        if (other.getAuthor() == null ^ this.getAuthor() == null)
            return false;
        if (other.getAuthor() != null && other.getAuthor().equals(this.getAuthor()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getLabels() == null ^ this.getLabels() == null)
            return false;
        if (other.getLabels() != null && other.getLabels().equals(this.getLabels()) == false)
            return false;
        if (other.getLicenseBody() == null ^ this.getLicenseBody() == null)
            return false;
        if (other.getLicenseBody() != null && other.getLicenseBody().equals(this.getLicenseBody()) == false)
            return false;
        if (other.getLicenseUrl() == null ^ this.getLicenseUrl() == null)
            return false;
        if (other.getLicenseUrl() != null && other.getLicenseUrl().equals(this.getLicenseUrl()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getReadmeBody() == null ^ this.getReadmeBody() == null)
            return false;
        if (other.getReadmeBody() != null && other.getReadmeBody().equals(this.getReadmeBody()) == false)
            return false;
        if (other.getReadmeUrl() == null ^ this.getReadmeUrl() == null)
            return false;
        if (other.getReadmeUrl() != null && other.getReadmeUrl().equals(this.getReadmeUrl()) == false)
            return false;
        if (other.getSemanticVersion() == null ^ this.getSemanticVersion() == null)
            return false;
        if (other.getSemanticVersion() != null && other.getSemanticVersion().equals(this.getSemanticVersion()) == false)
            return false;
        if (other.getSourceCodeUrl() == null ^ this.getSourceCodeUrl() == null)
            return false;
        if (other.getSourceCodeUrl() != null && other.getSourceCodeUrl().equals(this.getSourceCodeUrl()) == false)
            return false;
        if (other.getSpdxLicenseId() == null ^ this.getSpdxLicenseId() == null)
            return false;
        if (other.getSpdxLicenseId() != null && other.getSpdxLicenseId().equals(this.getSpdxLicenseId()) == false)
            return false;
        if (other.getTemplateBody() == null ^ this.getTemplateBody() == null)
            return false;
        if (other.getTemplateBody() != null && other.getTemplateBody().equals(this.getTemplateBody()) == false)
            return false;
        if (other.getTemplateUrl() == null ^ this.getTemplateUrl() == null)
            return false;
        if (other.getTemplateUrl() != null && other.getTemplateUrl().equals(this.getTemplateUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthor() == null) ? 0 : getAuthor().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getLabels() == null) ? 0 : getLabels().hashCode());
        hashCode = prime * hashCode + ((getLicenseBody() == null) ? 0 : getLicenseBody().hashCode());
        hashCode = prime * hashCode + ((getLicenseUrl() == null) ? 0 : getLicenseUrl().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getReadmeBody() == null) ? 0 : getReadmeBody().hashCode());
        hashCode = prime * hashCode + ((getReadmeUrl() == null) ? 0 : getReadmeUrl().hashCode());
        hashCode = prime * hashCode + ((getSemanticVersion() == null) ? 0 : getSemanticVersion().hashCode());
        hashCode = prime * hashCode + ((getSourceCodeUrl() == null) ? 0 : getSourceCodeUrl().hashCode());
        hashCode = prime * hashCode + ((getSpdxLicenseId() == null) ? 0 : getSpdxLicenseId().hashCode());
        hashCode = prime * hashCode + ((getTemplateBody() == null) ? 0 : getTemplateBody().hashCode());
        hashCode = prime * hashCode + ((getTemplateUrl() == null) ? 0 : getTemplateUrl().hashCode());
        return hashCode;
    }

    @Override
    public CreateApplicationRequest clone() {
        return (CreateApplicationRequest) super.clone();
    }

}
