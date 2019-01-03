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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a launch template version that could not be deleted.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DeleteLaunchTemplateVersionsResponseErrorItem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteLaunchTemplateVersionsResponseErrorItem implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the launch template.
     * </p>
     */
    private String launchTemplateId;
    /**
     * <p>
     * The name of the launch template.
     * </p>
     */
    private String launchTemplateName;
    /**
     * <p>
     * The version number of the launch template.
     * </p>
     */
    private Long versionNumber;
    /**
     * <p>
     * Information about the error.
     * </p>
     */
    private ResponseError responseError;

    /**
     * <p>
     * The ID of the launch template.
     * </p>
     * 
     * @param launchTemplateId
     *        The ID of the launch template.
     */

    public void setLaunchTemplateId(String launchTemplateId) {
        this.launchTemplateId = launchTemplateId;
    }

    /**
     * <p>
     * The ID of the launch template.
     * </p>
     * 
     * @return The ID of the launch template.
     */

    public String getLaunchTemplateId() {
        return this.launchTemplateId;
    }

    /**
     * <p>
     * The ID of the launch template.
     * </p>
     * 
     * @param launchTemplateId
     *        The ID of the launch template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteLaunchTemplateVersionsResponseErrorItem withLaunchTemplateId(String launchTemplateId) {
        setLaunchTemplateId(launchTemplateId);
        return this;
    }

    /**
     * <p>
     * The name of the launch template.
     * </p>
     * 
     * @param launchTemplateName
     *        The name of the launch template.
     */

    public void setLaunchTemplateName(String launchTemplateName) {
        this.launchTemplateName = launchTemplateName;
    }

    /**
     * <p>
     * The name of the launch template.
     * </p>
     * 
     * @return The name of the launch template.
     */

    public String getLaunchTemplateName() {
        return this.launchTemplateName;
    }

    /**
     * <p>
     * The name of the launch template.
     * </p>
     * 
     * @param launchTemplateName
     *        The name of the launch template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteLaunchTemplateVersionsResponseErrorItem withLaunchTemplateName(String launchTemplateName) {
        setLaunchTemplateName(launchTemplateName);
        return this;
    }

    /**
     * <p>
     * The version number of the launch template.
     * </p>
     * 
     * @param versionNumber
     *        The version number of the launch template.
     */

    public void setVersionNumber(Long versionNumber) {
        this.versionNumber = versionNumber;
    }

    /**
     * <p>
     * The version number of the launch template.
     * </p>
     * 
     * @return The version number of the launch template.
     */

    public Long getVersionNumber() {
        return this.versionNumber;
    }

    /**
     * <p>
     * The version number of the launch template.
     * </p>
     * 
     * @param versionNumber
     *        The version number of the launch template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteLaunchTemplateVersionsResponseErrorItem withVersionNumber(Long versionNumber) {
        setVersionNumber(versionNumber);
        return this;
    }

    /**
     * <p>
     * Information about the error.
     * </p>
     * 
     * @param responseError
     *        Information about the error.
     */

    public void setResponseError(ResponseError responseError) {
        this.responseError = responseError;
    }

    /**
     * <p>
     * Information about the error.
     * </p>
     * 
     * @return Information about the error.
     */

    public ResponseError getResponseError() {
        return this.responseError;
    }

    /**
     * <p>
     * Information about the error.
     * </p>
     * 
     * @param responseError
     *        Information about the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteLaunchTemplateVersionsResponseErrorItem withResponseError(ResponseError responseError) {
        setResponseError(responseError);
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
        if (getLaunchTemplateId() != null)
            sb.append("LaunchTemplateId: ").append(getLaunchTemplateId()).append(",");
        if (getLaunchTemplateName() != null)
            sb.append("LaunchTemplateName: ").append(getLaunchTemplateName()).append(",");
        if (getVersionNumber() != null)
            sb.append("VersionNumber: ").append(getVersionNumber()).append(",");
        if (getResponseError() != null)
            sb.append("ResponseError: ").append(getResponseError());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteLaunchTemplateVersionsResponseErrorItem == false)
            return false;
        DeleteLaunchTemplateVersionsResponseErrorItem other = (DeleteLaunchTemplateVersionsResponseErrorItem) obj;
        if (other.getLaunchTemplateId() == null ^ this.getLaunchTemplateId() == null)
            return false;
        if (other.getLaunchTemplateId() != null && other.getLaunchTemplateId().equals(this.getLaunchTemplateId()) == false)
            return false;
        if (other.getLaunchTemplateName() == null ^ this.getLaunchTemplateName() == null)
            return false;
        if (other.getLaunchTemplateName() != null && other.getLaunchTemplateName().equals(this.getLaunchTemplateName()) == false)
            return false;
        if (other.getVersionNumber() == null ^ this.getVersionNumber() == null)
            return false;
        if (other.getVersionNumber() != null && other.getVersionNumber().equals(this.getVersionNumber()) == false)
            return false;
        if (other.getResponseError() == null ^ this.getResponseError() == null)
            return false;
        if (other.getResponseError() != null && other.getResponseError().equals(this.getResponseError()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLaunchTemplateId() == null) ? 0 : getLaunchTemplateId().hashCode());
        hashCode = prime * hashCode + ((getLaunchTemplateName() == null) ? 0 : getLaunchTemplateName().hashCode());
        hashCode = prime * hashCode + ((getVersionNumber() == null) ? 0 : getVersionNumber().hashCode());
        hashCode = prime * hashCode + ((getResponseError() == null) ? 0 : getResponseError().hashCode());
        return hashCode;
    }

    @Override
    public DeleteLaunchTemplateVersionsResponseErrorItem clone() {
        try {
            return (DeleteLaunchTemplateVersionsResponseErrorItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
