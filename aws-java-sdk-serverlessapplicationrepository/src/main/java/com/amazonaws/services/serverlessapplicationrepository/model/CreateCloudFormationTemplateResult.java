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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/CreateCloudFormationTemplate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCloudFormationTemplateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The application Amazon Resource Name (ARN).
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The date and time this resource was created.
     * </p>
     */
    private String creationTime;
    /**
     * <p>
     * The date and time this template expires. Templates expire 1 hour after creation.
     * </p>
     */
    private String expirationTime;
    /**
     * <p>
     * The semantic version of the application:
     * </p>
     * <p>
     * <a href="https://semver.org/">https://semver.org/</a>
     * </p>
     */
    private String semanticVersion;
    /**
     * <p>
     * Status of the template creation workflow.
     * </p>
     * <p>
     * Possible values: PREPARING | ACTIVE | EXPIRED
     * </p>
     */
    private String status;
    /**
     * <p>
     * The UUID returned by CreateCloudFormationTemplate.
     * </p>
     * <p>
     * Pattern: [0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{12}
     * </p>
     */
    private String templateId;
    /**
     * <p>
     * A link to the template that can be used to deploy the application using AWS CloudFormation.
     * </p>
     */
    private String templateUrl;

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

    public CreateCloudFormationTemplateResult withApplicationId(String applicationId) {
        setApplicationId(applicationId);
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

    public CreateCloudFormationTemplateResult withCreationTime(String creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The date and time this template expires. Templates expire 1 hour after creation.
     * </p>
     * 
     * @param expirationTime
     *        The date and time this template expires. Templates expire 1 hour after creation.
     */

    public void setExpirationTime(String expirationTime) {
        this.expirationTime = expirationTime;
    }

    /**
     * <p>
     * The date and time this template expires. Templates expire 1 hour after creation.
     * </p>
     * 
     * @return The date and time this template expires. Templates expire 1 hour after creation.
     */

    public String getExpirationTime() {
        return this.expirationTime;
    }

    /**
     * <p>
     * The date and time this template expires. Templates expire 1 hour after creation.
     * </p>
     * 
     * @param expirationTime
     *        The date and time this template expires. Templates expire 1 hour after creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCloudFormationTemplateResult withExpirationTime(String expirationTime) {
        setExpirationTime(expirationTime);
        return this;
    }

    /**
     * <p>
     * The semantic version of the application:
     * </p>
     * <p>
     * <a href="https://semver.org/">https://semver.org/</a>
     * </p>
     * 
     * @param semanticVersion
     *        The semantic version of the application:</p>
     *        <p>
     *        <a href="https://semver.org/">https://semver.org/</a>
     */

    public void setSemanticVersion(String semanticVersion) {
        this.semanticVersion = semanticVersion;
    }

    /**
     * <p>
     * The semantic version of the application:
     * </p>
     * <p>
     * <a href="https://semver.org/">https://semver.org/</a>
     * </p>
     * 
     * @return The semantic version of the application:</p>
     *         <p>
     *         <a href="https://semver.org/">https://semver.org/</a>
     */

    public String getSemanticVersion() {
        return this.semanticVersion;
    }

    /**
     * <p>
     * The semantic version of the application:
     * </p>
     * <p>
     * <a href="https://semver.org/">https://semver.org/</a>
     * </p>
     * 
     * @param semanticVersion
     *        The semantic version of the application:</p>
     *        <p>
     *        <a href="https://semver.org/">https://semver.org/</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCloudFormationTemplateResult withSemanticVersion(String semanticVersion) {
        setSemanticVersion(semanticVersion);
        return this;
    }

    /**
     * <p>
     * Status of the template creation workflow.
     * </p>
     * <p>
     * Possible values: PREPARING | ACTIVE | EXPIRED
     * </p>
     * 
     * @param status
     *        Status of the template creation workflow.</p>
     *        <p>
     *        Possible values: PREPARING | ACTIVE | EXPIRED
     * @see Status
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Status of the template creation workflow.
     * </p>
     * <p>
     * Possible values: PREPARING | ACTIVE | EXPIRED
     * </p>
     * 
     * @return Status of the template creation workflow.</p>
     *         <p>
     *         Possible values: PREPARING | ACTIVE | EXPIRED
     * @see Status
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Status of the template creation workflow.
     * </p>
     * <p>
     * Possible values: PREPARING | ACTIVE | EXPIRED
     * </p>
     * 
     * @param status
     *        Status of the template creation workflow.</p>
     *        <p>
     *        Possible values: PREPARING | ACTIVE | EXPIRED
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public CreateCloudFormationTemplateResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Status of the template creation workflow.
     * </p>
     * <p>
     * Possible values: PREPARING | ACTIVE | EXPIRED
     * </p>
     * 
     * @param status
     *        Status of the template creation workflow.</p>
     *        <p>
     *        Possible values: PREPARING | ACTIVE | EXPIRED
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public CreateCloudFormationTemplateResult withStatus(Status status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The UUID returned by CreateCloudFormationTemplate.
     * </p>
     * <p>
     * Pattern: [0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{12}
     * </p>
     * 
     * @param templateId
     *        The UUID returned by CreateCloudFormationTemplate.</p>
     *        <p>
     *        Pattern: [0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{12}
     */

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    /**
     * <p>
     * The UUID returned by CreateCloudFormationTemplate.
     * </p>
     * <p>
     * Pattern: [0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{12}
     * </p>
     * 
     * @return The UUID returned by CreateCloudFormationTemplate.</p>
     *         <p>
     *         Pattern: [0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{12}
     */

    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * <p>
     * The UUID returned by CreateCloudFormationTemplate.
     * </p>
     * <p>
     * Pattern: [0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{12}
     * </p>
     * 
     * @param templateId
     *        The UUID returned by CreateCloudFormationTemplate.</p>
     *        <p>
     *        Pattern: [0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{12}
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCloudFormationTemplateResult withTemplateId(String templateId) {
        setTemplateId(templateId);
        return this;
    }

    /**
     * <p>
     * A link to the template that can be used to deploy the application using AWS CloudFormation.
     * </p>
     * 
     * @param templateUrl
     *        A link to the template that can be used to deploy the application using AWS CloudFormation.
     */

    public void setTemplateUrl(String templateUrl) {
        this.templateUrl = templateUrl;
    }

    /**
     * <p>
     * A link to the template that can be used to deploy the application using AWS CloudFormation.
     * </p>
     * 
     * @return A link to the template that can be used to deploy the application using AWS CloudFormation.
     */

    public String getTemplateUrl() {
        return this.templateUrl;
    }

    /**
     * <p>
     * A link to the template that can be used to deploy the application using AWS CloudFormation.
     * </p>
     * 
     * @param templateUrl
     *        A link to the template that can be used to deploy the application using AWS CloudFormation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCloudFormationTemplateResult withTemplateUrl(String templateUrl) {
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
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getExpirationTime() != null)
            sb.append("ExpirationTime: ").append(getExpirationTime()).append(",");
        if (getSemanticVersion() != null)
            sb.append("SemanticVersion: ").append(getSemanticVersion()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTemplateId() != null)
            sb.append("TemplateId: ").append(getTemplateId()).append(",");
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

        if (obj instanceof CreateCloudFormationTemplateResult == false)
            return false;
        CreateCloudFormationTemplateResult other = (CreateCloudFormationTemplateResult) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getExpirationTime() == null ^ this.getExpirationTime() == null)
            return false;
        if (other.getExpirationTime() != null && other.getExpirationTime().equals(this.getExpirationTime()) == false)
            return false;
        if (other.getSemanticVersion() == null ^ this.getSemanticVersion() == null)
            return false;
        if (other.getSemanticVersion() != null && other.getSemanticVersion().equals(this.getSemanticVersion()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTemplateId() == null ^ this.getTemplateId() == null)
            return false;
        if (other.getTemplateId() != null && other.getTemplateId().equals(this.getTemplateId()) == false)
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
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getExpirationTime() == null) ? 0 : getExpirationTime().hashCode());
        hashCode = prime * hashCode + ((getSemanticVersion() == null) ? 0 : getSemanticVersion().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTemplateId() == null) ? 0 : getTemplateId().hashCode());
        hashCode = prime * hashCode + ((getTemplateUrl() == null) ? 0 : getTemplateUrl().hashCode());
        return hashCode;
    }

    @Override
    public CreateCloudFormationTemplateResult clone() {
        try {
            return (CreateCloudFormationTemplateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
