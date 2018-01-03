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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/CreateApplicationVersion"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateApplicationVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The id of the application to create a new version for */
    private String applicationId;
    /** The semantic version of the new version */
    private String semanticVersion;
    /** A link to a public repository for the source code of your application. */
    private String sourceCodeUrl;
    /** The raw packaged SAM template of your application. */
    private String templateBody;
    /** A link to the packaged SAM template of your application. */
    private String templateUrl;

    /**
     * The id of the application to create a new version for
     * 
     * @param applicationId
     *        The id of the application to create a new version for
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * The id of the application to create a new version for
     * 
     * @return The id of the application to create a new version for
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * The id of the application to create a new version for
     * 
     * @param applicationId
     *        The id of the application to create a new version for
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationVersionRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * The semantic version of the new version
     * 
     * @param semanticVersion
     *        The semantic version of the new version
     */

    public void setSemanticVersion(String semanticVersion) {
        this.semanticVersion = semanticVersion;
    }

    /**
     * The semantic version of the new version
     * 
     * @return The semantic version of the new version
     */

    public String getSemanticVersion() {
        return this.semanticVersion;
    }

    /**
     * The semantic version of the new version
     * 
     * @param semanticVersion
     *        The semantic version of the new version
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationVersionRequest withSemanticVersion(String semanticVersion) {
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

    public CreateApplicationVersionRequest withSourceCodeUrl(String sourceCodeUrl) {
        setSourceCodeUrl(sourceCodeUrl);
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

    public CreateApplicationVersionRequest withTemplateBody(String templateBody) {
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

    public CreateApplicationVersionRequest withTemplateUrl(String templateUrl) {
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getSemanticVersion() != null)
            sb.append("SemanticVersion: ").append(getSemanticVersion()).append(",");
        if (getSourceCodeUrl() != null)
            sb.append("SourceCodeUrl: ").append(getSourceCodeUrl()).append(",");
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

        if (obj instanceof CreateApplicationVersionRequest == false)
            return false;
        CreateApplicationVersionRequest other = (CreateApplicationVersionRequest) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getSemanticVersion() == null ^ this.getSemanticVersion() == null)
            return false;
        if (other.getSemanticVersion() != null && other.getSemanticVersion().equals(this.getSemanticVersion()) == false)
            return false;
        if (other.getSourceCodeUrl() == null ^ this.getSourceCodeUrl() == null)
            return false;
        if (other.getSourceCodeUrl() != null && other.getSourceCodeUrl().equals(this.getSourceCodeUrl()) == false)
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

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getSemanticVersion() == null) ? 0 : getSemanticVersion().hashCode());
        hashCode = prime * hashCode + ((getSourceCodeUrl() == null) ? 0 : getSourceCodeUrl().hashCode());
        hashCode = prime * hashCode + ((getTemplateBody() == null) ? 0 : getTemplateBody().hashCode());
        hashCode = prime * hashCode + ((getTemplateUrl() == null) ? 0 : getTemplateUrl().hashCode());
        return hashCode;
    }

    @Override
    public CreateApplicationVersionRequest clone() {
        return (CreateApplicationVersionRequest) super.clone();
    }

}
