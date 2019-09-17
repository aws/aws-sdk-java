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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/CreateApplicationVersion"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateApplicationVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The semantic version of the new version.
     * </p>
     */
    private String semanticVersion;
    /**
     * <p>
     * A link to the S3 object that contains the ZIP archive of the source code for this version of your application.
     * </p>
     * <p>
     * Maximum size 50 MB
     * </p>
     */
    private String sourceCodeArchiveUrl;
    /**
     * <p>
     * A link to a public repository for the source code of your application, for example the URL of a specific GitHub
     * commit.
     * </p>
     */
    private String sourceCodeUrl;
    /**
     * <p>
     * The raw packaged AWS SAM template of your application.
     * </p>
     */
    private String templateBody;
    /**
     * <p>
     * A link to the packaged AWS SAM template of your application.
     * </p>
     */
    private String templateUrl;

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

    public CreateApplicationVersionRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The semantic version of the new version.
     * </p>
     * 
     * @param semanticVersion
     *        The semantic version of the new version.
     */

    public void setSemanticVersion(String semanticVersion) {
        this.semanticVersion = semanticVersion;
    }

    /**
     * <p>
     * The semantic version of the new version.
     * </p>
     * 
     * @return The semantic version of the new version.
     */

    public String getSemanticVersion() {
        return this.semanticVersion;
    }

    /**
     * <p>
     * The semantic version of the new version.
     * </p>
     * 
     * @param semanticVersion
     *        The semantic version of the new version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationVersionRequest withSemanticVersion(String semanticVersion) {
        setSemanticVersion(semanticVersion);
        return this;
    }

    /**
     * <p>
     * A link to the S3 object that contains the ZIP archive of the source code for this version of your application.
     * </p>
     * <p>
     * Maximum size 50 MB
     * </p>
     * 
     * @param sourceCodeArchiveUrl
     *        A link to the S3 object that contains the ZIP archive of the source code for this version of your
     *        application.</p>
     *        <p>
     *        Maximum size 50 MB
     */

    public void setSourceCodeArchiveUrl(String sourceCodeArchiveUrl) {
        this.sourceCodeArchiveUrl = sourceCodeArchiveUrl;
    }

    /**
     * <p>
     * A link to the S3 object that contains the ZIP archive of the source code for this version of your application.
     * </p>
     * <p>
     * Maximum size 50 MB
     * </p>
     * 
     * @return A link to the S3 object that contains the ZIP archive of the source code for this version of your
     *         application.</p>
     *         <p>
     *         Maximum size 50 MB
     */

    public String getSourceCodeArchiveUrl() {
        return this.sourceCodeArchiveUrl;
    }

    /**
     * <p>
     * A link to the S3 object that contains the ZIP archive of the source code for this version of your application.
     * </p>
     * <p>
     * Maximum size 50 MB
     * </p>
     * 
     * @param sourceCodeArchiveUrl
     *        A link to the S3 object that contains the ZIP archive of the source code for this version of your
     *        application.</p>
     *        <p>
     *        Maximum size 50 MB
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationVersionRequest withSourceCodeArchiveUrl(String sourceCodeArchiveUrl) {
        setSourceCodeArchiveUrl(sourceCodeArchiveUrl);
        return this;
    }

    /**
     * <p>
     * A link to a public repository for the source code of your application, for example the URL of a specific GitHub
     * commit.
     * </p>
     * 
     * @param sourceCodeUrl
     *        A link to a public repository for the source code of your application, for example the URL of a specific
     *        GitHub commit.
     */

    public void setSourceCodeUrl(String sourceCodeUrl) {
        this.sourceCodeUrl = sourceCodeUrl;
    }

    /**
     * <p>
     * A link to a public repository for the source code of your application, for example the URL of a specific GitHub
     * commit.
     * </p>
     * 
     * @return A link to a public repository for the source code of your application, for example the URL of a specific
     *         GitHub commit.
     */

    public String getSourceCodeUrl() {
        return this.sourceCodeUrl;
    }

    /**
     * <p>
     * A link to a public repository for the source code of your application, for example the URL of a specific GitHub
     * commit.
     * </p>
     * 
     * @param sourceCodeUrl
     *        A link to a public repository for the source code of your application, for example the URL of a specific
     *        GitHub commit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationVersionRequest withSourceCodeUrl(String sourceCodeUrl) {
        setSourceCodeUrl(sourceCodeUrl);
        return this;
    }

    /**
     * <p>
     * The raw packaged AWS SAM template of your application.
     * </p>
     * 
     * @param templateBody
     *        The raw packaged AWS SAM template of your application.
     */

    public void setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
    }

    /**
     * <p>
     * The raw packaged AWS SAM template of your application.
     * </p>
     * 
     * @return The raw packaged AWS SAM template of your application.
     */

    public String getTemplateBody() {
        return this.templateBody;
    }

    /**
     * <p>
     * The raw packaged AWS SAM template of your application.
     * </p>
     * 
     * @param templateBody
     *        The raw packaged AWS SAM template of your application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationVersionRequest withTemplateBody(String templateBody) {
        setTemplateBody(templateBody);
        return this;
    }

    /**
     * <p>
     * A link to the packaged AWS SAM template of your application.
     * </p>
     * 
     * @param templateUrl
     *        A link to the packaged AWS SAM template of your application.
     */

    public void setTemplateUrl(String templateUrl) {
        this.templateUrl = templateUrl;
    }

    /**
     * <p>
     * A link to the packaged AWS SAM template of your application.
     * </p>
     * 
     * @return A link to the packaged AWS SAM template of your application.
     */

    public String getTemplateUrl() {
        return this.templateUrl;
    }

    /**
     * <p>
     * A link to the packaged AWS SAM template of your application.
     * </p>
     * 
     * @param templateUrl
     *        A link to the packaged AWS SAM template of your application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationVersionRequest withTemplateUrl(String templateUrl) {
        setTemplateUrl(templateUrl);
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
        if (getSemanticVersion() != null)
            sb.append("SemanticVersion: ").append(getSemanticVersion()).append(",");
        if (getSourceCodeArchiveUrl() != null)
            sb.append("SourceCodeArchiveUrl: ").append(getSourceCodeArchiveUrl()).append(",");
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
        if (other.getSourceCodeArchiveUrl() == null ^ this.getSourceCodeArchiveUrl() == null)
            return false;
        if (other.getSourceCodeArchiveUrl() != null && other.getSourceCodeArchiveUrl().equals(this.getSourceCodeArchiveUrl()) == false)
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
        hashCode = prime * hashCode + ((getSourceCodeArchiveUrl() == null) ? 0 : getSourceCodeArchiveUrl().hashCode());
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
