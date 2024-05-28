/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateProjectRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the project to create.
     * </p>
     */
    private String projectName;
    /**
     * <p>
     * Specifies feature that is being customized. If no value is provided CUSTOM_LABELS is used as a default.
     * </p>
     */
    private String feature;
    /**
     * <p>
     * Specifies whether automatic retraining should be attempted for the versions of the project. Automatic retraining
     * is done as a best effort. Required argument for Content Moderation. Applicable only to adapters.
     * </p>
     */
    private String autoUpdate;

    /**
     * <p>
     * The name of the project to create.
     * </p>
     * 
     * @param projectName
     *        The name of the project to create.
     */

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * <p>
     * The name of the project to create.
     * </p>
     * 
     * @return The name of the project to create.
     */

    public String getProjectName() {
        return this.projectName;
    }

    /**
     * <p>
     * The name of the project to create.
     * </p>
     * 
     * @param projectName
     *        The name of the project to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectRequest withProjectName(String projectName) {
        setProjectName(projectName);
        return this;
    }

    /**
     * <p>
     * Specifies feature that is being customized. If no value is provided CUSTOM_LABELS is used as a default.
     * </p>
     * 
     * @param feature
     *        Specifies feature that is being customized. If no value is provided CUSTOM_LABELS is used as a default.
     * @see CustomizationFeature
     */

    public void setFeature(String feature) {
        this.feature = feature;
    }

    /**
     * <p>
     * Specifies feature that is being customized. If no value is provided CUSTOM_LABELS is used as a default.
     * </p>
     * 
     * @return Specifies feature that is being customized. If no value is provided CUSTOM_LABELS is used as a default.
     * @see CustomizationFeature
     */

    public String getFeature() {
        return this.feature;
    }

    /**
     * <p>
     * Specifies feature that is being customized. If no value is provided CUSTOM_LABELS is used as a default.
     * </p>
     * 
     * @param feature
     *        Specifies feature that is being customized. If no value is provided CUSTOM_LABELS is used as a default.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomizationFeature
     */

    public CreateProjectRequest withFeature(String feature) {
        setFeature(feature);
        return this;
    }

    /**
     * <p>
     * Specifies feature that is being customized. If no value is provided CUSTOM_LABELS is used as a default.
     * </p>
     * 
     * @param feature
     *        Specifies feature that is being customized. If no value is provided CUSTOM_LABELS is used as a default.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomizationFeature
     */

    public CreateProjectRequest withFeature(CustomizationFeature feature) {
        this.feature = feature.toString();
        return this;
    }

    /**
     * <p>
     * Specifies whether automatic retraining should be attempted for the versions of the project. Automatic retraining
     * is done as a best effort. Required argument for Content Moderation. Applicable only to adapters.
     * </p>
     * 
     * @param autoUpdate
     *        Specifies whether automatic retraining should be attempted for the versions of the project. Automatic
     *        retraining is done as a best effort. Required argument for Content Moderation. Applicable only to
     *        adapters.
     * @see ProjectAutoUpdate
     */

    public void setAutoUpdate(String autoUpdate) {
        this.autoUpdate = autoUpdate;
    }

    /**
     * <p>
     * Specifies whether automatic retraining should be attempted for the versions of the project. Automatic retraining
     * is done as a best effort. Required argument for Content Moderation. Applicable only to adapters.
     * </p>
     * 
     * @return Specifies whether automatic retraining should be attempted for the versions of the project. Automatic
     *         retraining is done as a best effort. Required argument for Content Moderation. Applicable only to
     *         adapters.
     * @see ProjectAutoUpdate
     */

    public String getAutoUpdate() {
        return this.autoUpdate;
    }

    /**
     * <p>
     * Specifies whether automatic retraining should be attempted for the versions of the project. Automatic retraining
     * is done as a best effort. Required argument for Content Moderation. Applicable only to adapters.
     * </p>
     * 
     * @param autoUpdate
     *        Specifies whether automatic retraining should be attempted for the versions of the project. Automatic
     *        retraining is done as a best effort. Required argument for Content Moderation. Applicable only to
     *        adapters.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProjectAutoUpdate
     */

    public CreateProjectRequest withAutoUpdate(String autoUpdate) {
        setAutoUpdate(autoUpdate);
        return this;
    }

    /**
     * <p>
     * Specifies whether automatic retraining should be attempted for the versions of the project. Automatic retraining
     * is done as a best effort. Required argument for Content Moderation. Applicable only to adapters.
     * </p>
     * 
     * @param autoUpdate
     *        Specifies whether automatic retraining should be attempted for the versions of the project. Automatic
     *        retraining is done as a best effort. Required argument for Content Moderation. Applicable only to
     *        adapters.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProjectAutoUpdate
     */

    public CreateProjectRequest withAutoUpdate(ProjectAutoUpdate autoUpdate) {
        this.autoUpdate = autoUpdate.toString();
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
        if (getProjectName() != null)
            sb.append("ProjectName: ").append(getProjectName()).append(",");
        if (getFeature() != null)
            sb.append("Feature: ").append(getFeature()).append(",");
        if (getAutoUpdate() != null)
            sb.append("AutoUpdate: ").append(getAutoUpdate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateProjectRequest == false)
            return false;
        CreateProjectRequest other = (CreateProjectRequest) obj;
        if (other.getProjectName() == null ^ this.getProjectName() == null)
            return false;
        if (other.getProjectName() != null && other.getProjectName().equals(this.getProjectName()) == false)
            return false;
        if (other.getFeature() == null ^ this.getFeature() == null)
            return false;
        if (other.getFeature() != null && other.getFeature().equals(this.getFeature()) == false)
            return false;
        if (other.getAutoUpdate() == null ^ this.getAutoUpdate() == null)
            return false;
        if (other.getAutoUpdate() != null && other.getAutoUpdate().equals(this.getAutoUpdate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProjectName() == null) ? 0 : getProjectName().hashCode());
        hashCode = prime * hashCode + ((getFeature() == null) ? 0 : getFeature().hashCode());
        hashCode = prime * hashCode + ((getAutoUpdate() == null) ? 0 : getAutoUpdate().hashCode());
        return hashCode;
    }

    @Override
    public CreateProjectRequest clone() {
        return (CreateProjectRequest) super.clone();
    }

}
