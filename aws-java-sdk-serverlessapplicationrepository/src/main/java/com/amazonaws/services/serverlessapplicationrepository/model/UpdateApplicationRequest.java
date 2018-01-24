/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/UpdateApplication" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateApplicationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The id of the application to update */
    private String applicationId;
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
     * A raw text Readme file that contains a more detailed description of the application and how it works in markdown
     * language.\nMax size 5 MB
     */
    private String readmeBody;
    /**
     * A link to the Readme file that contains a more detailed description of the application and how it works in
     * markdown language.\nMax size 5 MB
     */
    private String readmeUrl;

    /**
     * The id of the application to update
     * 
     * @param applicationId
     *        The id of the application to update
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * The id of the application to update
     * 
     * @return The id of the application to update
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * The id of the application to update
     * 
     * @param applicationId
     *        The id of the application to update
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

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

    public UpdateApplicationRequest withAuthor(String author) {
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

    public UpdateApplicationRequest withDescription(String description) {
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

    public UpdateApplicationRequest withLabels(String... labels) {
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

    public UpdateApplicationRequest withLabels(java.util.Collection<String> labels) {
        setLabels(labels);
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

    public UpdateApplicationRequest withReadmeBody(String readmeBody) {
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

    public UpdateApplicationRequest withReadmeUrl(String readmeUrl) {
        setReadmeUrl(readmeUrl);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getLabels() != null)
            sb.append("Labels: ").append(getLabels()).append(",");
        if (getReadmeBody() != null)
            sb.append("ReadmeBody: ").append(getReadmeBody()).append(",");
        if (getReadmeUrl() != null)
            sb.append("ReadmeUrl: ").append(getReadmeUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateApplicationRequest == false)
            return false;
        UpdateApplicationRequest other = (UpdateApplicationRequest) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
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
        if (other.getReadmeBody() == null ^ this.getReadmeBody() == null)
            return false;
        if (other.getReadmeBody() != null && other.getReadmeBody().equals(this.getReadmeBody()) == false)
            return false;
        if (other.getReadmeUrl() == null ^ this.getReadmeUrl() == null)
            return false;
        if (other.getReadmeUrl() != null && other.getReadmeUrl().equals(this.getReadmeUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getAuthor() == null) ? 0 : getAuthor().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getLabels() == null) ? 0 : getLabels().hashCode());
        hashCode = prime * hashCode + ((getReadmeBody() == null) ? 0 : getReadmeBody().hashCode());
        hashCode = prime * hashCode + ((getReadmeUrl() == null) ? 0 : getReadmeUrl().hashCode());
        return hashCode;
    }

    @Override
    public UpdateApplicationRequest clone() {
        return (UpdateApplicationRequest) super.clone();
    }

}
