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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/UpdateApplication" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateApplicationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application.
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
     * A text readme file in Markdown language that contains a more detailed description of the application and how it
     * works.
     * </p>
     * <p>
     * Maximum size 5 MB
     * </p>
     */
    private String readmeBody;
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
     * The Amazon Resource Name (ARN) of the application.
     * </p>
     * 
     * @param applicationId
     *        The Amazon Resource Name (ARN) of the application.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the application.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application.
     * </p>
     * 
     * @param applicationId
     *        The Amazon Resource Name (ARN) of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationRequest withApplicationId(String applicationId) {
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

    public UpdateApplicationRequest withAuthor(String author) {
        setAuthor(author);
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

    public UpdateApplicationRequest withDescription(String description) {
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

    public UpdateApplicationRequest withHomePageUrl(String homePageUrl) {
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

    public UpdateApplicationRequest withLabels(java.util.Collection<String> labels) {
        setLabels(labels);
        return this;
    }

    /**
     * <p>
     * A text readme file in Markdown language that contains a more detailed description of the application and how it
     * works.
     * </p>
     * <p>
     * Maximum size 5 MB
     * </p>
     * 
     * @param readmeBody
     *        A text readme file in Markdown language that contains a more detailed description of the application and
     *        how it works.</p>
     *        <p>
     *        Maximum size 5 MB
     */

    public void setReadmeBody(String readmeBody) {
        this.readmeBody = readmeBody;
    }

    /**
     * <p>
     * A text readme file in Markdown language that contains a more detailed description of the application and how it
     * works.
     * </p>
     * <p>
     * Maximum size 5 MB
     * </p>
     * 
     * @return A text readme file in Markdown language that contains a more detailed description of the application and
     *         how it works.</p>
     *         <p>
     *         Maximum size 5 MB
     */

    public String getReadmeBody() {
        return this.readmeBody;
    }

    /**
     * <p>
     * A text readme file in Markdown language that contains a more detailed description of the application and how it
     * works.
     * </p>
     * <p>
     * Maximum size 5 MB
     * </p>
     * 
     * @param readmeBody
     *        A text readme file in Markdown language that contains a more detailed description of the application and
     *        how it works.</p>
     *        <p>
     *        Maximum size 5 MB
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationRequest withReadmeBody(String readmeBody) {
        setReadmeBody(readmeBody);
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

    public UpdateApplicationRequest withReadmeUrl(String readmeUrl) {
        setReadmeUrl(readmeUrl);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getHomePageUrl() != null)
            sb.append("HomePageUrl: ").append(getHomePageUrl()).append(",");
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
        if (other.getHomePageUrl() == null ^ this.getHomePageUrl() == null)
            return false;
        if (other.getHomePageUrl() != null && other.getHomePageUrl().equals(this.getHomePageUrl()) == false)
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
        hashCode = prime * hashCode + ((getHomePageUrl() == null) ? 0 : getHomePageUrl().hashCode());
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
