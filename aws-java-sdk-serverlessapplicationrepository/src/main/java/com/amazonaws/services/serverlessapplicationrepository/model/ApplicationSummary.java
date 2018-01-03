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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Summary of details about the application.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/ApplicationSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplicationSummary implements Serializable, Cloneable, StructuredPojo {

    /** The application ARN. */
    private String applicationId;
    /**
     * The name of the author publishing the app\nMin Length=1. Max Length=127.\nPattern
     * "^[a-z0-9](([a-z0-9]|-(?!-))*[a-z0-9])?$";
     */
    private String author;
    /** The date/time this resource was created. */
    private String creationTime;
    /** The description of the application.\nMin Length=1. Max Length=256 */
    private String description;
    /**
     * Labels to improve discovery of apps in search results.\nMin Length=1. Max Length=127. Maximum number of labels:
     * 10\nPattern: "^[a-zA-Z0-9+\\-_:\\/@]+$";
     */
    private java.util.List<String> labels;
    /** The name of the application.\nMin Length=1. Max Length=140\nPattern: "[a-zA-Z0-9\\-]+"; */
    private String name;
    /** A valid identifier from https://spdx.org/licenses/ . */
    private String spdxLicenseId;

    /**
     * The application ARN.
     * 
     * @param applicationId
     *        The application ARN.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * The application ARN.
     * 
     * @return The application ARN.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * The application ARN.
     * 
     * @param applicationId
     *        The application ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationSummary withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * The name of the author publishing the app\nMin Length=1. Max Length=127.\nPattern
     * "^[a-z0-9](([a-z0-9]|-(?!-))*[a-z0-9])?$";
     * 
     * @param author
     *        The name of the author publishing the app\nMin Length=1. Max Length=127.\nPattern
     *        "^[a-z0-9](([a-z0-9]|-(?!-))*[a-z0-9])?$";
     */

    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * The name of the author publishing the app\nMin Length=1. Max Length=127.\nPattern
     * "^[a-z0-9](([a-z0-9]|-(?!-))*[a-z0-9])?$";
     * 
     * @return The name of the author publishing the app\nMin Length=1. Max Length=127.\nPattern
     *         "^[a-z0-9](([a-z0-9]|-(?!-))*[a-z0-9])?$";
     */

    public String getAuthor() {
        return this.author;
    }

    /**
     * The name of the author publishing the app\nMin Length=1. Max Length=127.\nPattern
     * "^[a-z0-9](([a-z0-9]|-(?!-))*[a-z0-9])?$";
     * 
     * @param author
     *        The name of the author publishing the app\nMin Length=1. Max Length=127.\nPattern
     *        "^[a-z0-9](([a-z0-9]|-(?!-))*[a-z0-9])?$";
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationSummary withAuthor(String author) {
        setAuthor(author);
        return this;
    }

    /**
     * The date/time this resource was created.
     * 
     * @param creationTime
     *        The date/time this resource was created.
     */

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * The date/time this resource was created.
     * 
     * @return The date/time this resource was created.
     */

    public String getCreationTime() {
        return this.creationTime;
    }

    /**
     * The date/time this resource was created.
     * 
     * @param creationTime
     *        The date/time this resource was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationSummary withCreationTime(String creationTime) {
        setCreationTime(creationTime);
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

    public ApplicationSummary withDescription(String description) {
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

    public ApplicationSummary withLabels(String... labels) {
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

    public ApplicationSummary withLabels(java.util.Collection<String> labels) {
        setLabels(labels);
        return this;
    }

    /**
     * The name of the application.\nMin Length=1. Max Length=140\nPattern: "[a-zA-Z0-9\\-]+";
     * 
     * @param name
     *        The name of the application.\nMin Length=1. Max Length=140\nPattern: "[a-zA-Z0-9\\-]+";
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The name of the application.\nMin Length=1. Max Length=140\nPattern: "[a-zA-Z0-9\\-]+";
     * 
     * @return The name of the application.\nMin Length=1. Max Length=140\nPattern: "[a-zA-Z0-9\\-]+";
     */

    public String getName() {
        return this.name;
    }

    /**
     * The name of the application.\nMin Length=1. Max Length=140\nPattern: "[a-zA-Z0-9\\-]+";
     * 
     * @param name
     *        The name of the application.\nMin Length=1. Max Length=140\nPattern: "[a-zA-Z0-9\\-]+";
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationSummary withName(String name) {
        setName(name);
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

    public ApplicationSummary withSpdxLicenseId(String spdxLicenseId) {
        setSpdxLicenseId(spdxLicenseId);
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getAuthor() != null)
            sb.append("Author: ").append(getAuthor()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getLabels() != null)
            sb.append("Labels: ").append(getLabels()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSpdxLicenseId() != null)
            sb.append("SpdxLicenseId: ").append(getSpdxLicenseId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApplicationSummary == false)
            return false;
        ApplicationSummary other = (ApplicationSummary) obj;
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
        if (other.getLabels() == null ^ this.getLabels() == null)
            return false;
        if (other.getLabels() != null && other.getLabels().equals(this.getLabels()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSpdxLicenseId() == null ^ this.getSpdxLicenseId() == null)
            return false;
        if (other.getSpdxLicenseId() != null && other.getSpdxLicenseId().equals(this.getSpdxLicenseId()) == false)
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
        hashCode = prime * hashCode + ((getLabels() == null) ? 0 : getLabels().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSpdxLicenseId() == null) ? 0 : getSpdxLicenseId().hashCode());
        return hashCode;
    }

    @Override
    public ApplicationSummary clone() {
        try {
            return (ApplicationSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.serverlessapplicationrepository.model.transform.ApplicationSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
