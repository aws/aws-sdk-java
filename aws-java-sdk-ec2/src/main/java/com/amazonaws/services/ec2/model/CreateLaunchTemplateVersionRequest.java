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

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.CreateLaunchTemplateVersionRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLaunchTemplateVersionRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<CreateLaunchTemplateVersionRequest> {

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more information, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * <p>
     * Constraint: Maximum 128 ASCII characters.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The ID of the launch template. You must specify either the launch template ID or launch template name in the
     * request.
     * </p>
     */
    private String launchTemplateId;
    /**
     * <p>
     * The name of the launch template. You must specify either the launch template ID or launch template name in the
     * request.
     * </p>
     */
    private String launchTemplateName;
    /**
     * <p>
     * The version number of the launch template version on which to base the new version. The new version inherits the
     * same launch parameters as the source version, except for parameters that you specify in LaunchTemplateData.
     * </p>
     */
    private String sourceVersion;
    /**
     * <p>
     * A description for the version of the launch template.
     * </p>
     */
    private String versionDescription;
    /**
     * <p>
     * The information for the launch template.
     * </p>
     */
    private RequestLaunchTemplateData launchTemplateData;

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more information, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * <p>
     * Constraint: Maximum 128 ASCII characters.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        Idempotency</a>.</p>
     *        <p>
     *        Constraint: Maximum 128 ASCII characters.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more information, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * <p>
     * Constraint: Maximum 128 ASCII characters.
     * </p>
     * 
     * @return Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *         Idempotency</a>.</p>
     *         <p>
     *         Constraint: Maximum 128 ASCII characters.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more information, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * <p>
     * Constraint: Maximum 128 ASCII characters.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        Idempotency</a>.</p>
     *        <p>
     *        Constraint: Maximum 128 ASCII characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLaunchTemplateVersionRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The ID of the launch template. You must specify either the launch template ID or launch template name in the
     * request.
     * </p>
     * 
     * @param launchTemplateId
     *        The ID of the launch template. You must specify either the launch template ID or launch template name in
     *        the request.
     */

    public void setLaunchTemplateId(String launchTemplateId) {
        this.launchTemplateId = launchTemplateId;
    }

    /**
     * <p>
     * The ID of the launch template. You must specify either the launch template ID or launch template name in the
     * request.
     * </p>
     * 
     * @return The ID of the launch template. You must specify either the launch template ID or launch template name in
     *         the request.
     */

    public String getLaunchTemplateId() {
        return this.launchTemplateId;
    }

    /**
     * <p>
     * The ID of the launch template. You must specify either the launch template ID or launch template name in the
     * request.
     * </p>
     * 
     * @param launchTemplateId
     *        The ID of the launch template. You must specify either the launch template ID or launch template name in
     *        the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLaunchTemplateVersionRequest withLaunchTemplateId(String launchTemplateId) {
        setLaunchTemplateId(launchTemplateId);
        return this;
    }

    /**
     * <p>
     * The name of the launch template. You must specify either the launch template ID or launch template name in the
     * request.
     * </p>
     * 
     * @param launchTemplateName
     *        The name of the launch template. You must specify either the launch template ID or launch template name in
     *        the request.
     */

    public void setLaunchTemplateName(String launchTemplateName) {
        this.launchTemplateName = launchTemplateName;
    }

    /**
     * <p>
     * The name of the launch template. You must specify either the launch template ID or launch template name in the
     * request.
     * </p>
     * 
     * @return The name of the launch template. You must specify either the launch template ID or launch template name
     *         in the request.
     */

    public String getLaunchTemplateName() {
        return this.launchTemplateName;
    }

    /**
     * <p>
     * The name of the launch template. You must specify either the launch template ID or launch template name in the
     * request.
     * </p>
     * 
     * @param launchTemplateName
     *        The name of the launch template. You must specify either the launch template ID or launch template name in
     *        the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLaunchTemplateVersionRequest withLaunchTemplateName(String launchTemplateName) {
        setLaunchTemplateName(launchTemplateName);
        return this;
    }

    /**
     * <p>
     * The version number of the launch template version on which to base the new version. The new version inherits the
     * same launch parameters as the source version, except for parameters that you specify in LaunchTemplateData.
     * </p>
     * 
     * @param sourceVersion
     *        The version number of the launch template version on which to base the new version. The new version
     *        inherits the same launch parameters as the source version, except for parameters that you specify in
     *        LaunchTemplateData.
     */

    public void setSourceVersion(String sourceVersion) {
        this.sourceVersion = sourceVersion;
    }

    /**
     * <p>
     * The version number of the launch template version on which to base the new version. The new version inherits the
     * same launch parameters as the source version, except for parameters that you specify in LaunchTemplateData.
     * </p>
     * 
     * @return The version number of the launch template version on which to base the new version. The new version
     *         inherits the same launch parameters as the source version, except for parameters that you specify in
     *         LaunchTemplateData.
     */

    public String getSourceVersion() {
        return this.sourceVersion;
    }

    /**
     * <p>
     * The version number of the launch template version on which to base the new version. The new version inherits the
     * same launch parameters as the source version, except for parameters that you specify in LaunchTemplateData.
     * </p>
     * 
     * @param sourceVersion
     *        The version number of the launch template version on which to base the new version. The new version
     *        inherits the same launch parameters as the source version, except for parameters that you specify in
     *        LaunchTemplateData.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLaunchTemplateVersionRequest withSourceVersion(String sourceVersion) {
        setSourceVersion(sourceVersion);
        return this;
    }

    /**
     * <p>
     * A description for the version of the launch template.
     * </p>
     * 
     * @param versionDescription
     *        A description for the version of the launch template.
     */

    public void setVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
    }

    /**
     * <p>
     * A description for the version of the launch template.
     * </p>
     * 
     * @return A description for the version of the launch template.
     */

    public String getVersionDescription() {
        return this.versionDescription;
    }

    /**
     * <p>
     * A description for the version of the launch template.
     * </p>
     * 
     * @param versionDescription
     *        A description for the version of the launch template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLaunchTemplateVersionRequest withVersionDescription(String versionDescription) {
        setVersionDescription(versionDescription);
        return this;
    }

    /**
     * <p>
     * The information for the launch template.
     * </p>
     * 
     * @param launchTemplateData
     *        The information for the launch template.
     */

    public void setLaunchTemplateData(RequestLaunchTemplateData launchTemplateData) {
        this.launchTemplateData = launchTemplateData;
    }

    /**
     * <p>
     * The information for the launch template.
     * </p>
     * 
     * @return The information for the launch template.
     */

    public RequestLaunchTemplateData getLaunchTemplateData() {
        return this.launchTemplateData;
    }

    /**
     * <p>
     * The information for the launch template.
     * </p>
     * 
     * @param launchTemplateData
     *        The information for the launch template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLaunchTemplateVersionRequest withLaunchTemplateData(RequestLaunchTemplateData launchTemplateData) {
        setLaunchTemplateData(launchTemplateData);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CreateLaunchTemplateVersionRequest> getDryRunRequest() {
        Request<CreateLaunchTemplateVersionRequest> request = new CreateLaunchTemplateVersionRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getLaunchTemplateId() != null)
            sb.append("LaunchTemplateId: ").append(getLaunchTemplateId()).append(",");
        if (getLaunchTemplateName() != null)
            sb.append("LaunchTemplateName: ").append(getLaunchTemplateName()).append(",");
        if (getSourceVersion() != null)
            sb.append("SourceVersion: ").append(getSourceVersion()).append(",");
        if (getVersionDescription() != null)
            sb.append("VersionDescription: ").append(getVersionDescription()).append(",");
        if (getLaunchTemplateData() != null)
            sb.append("LaunchTemplateData: ").append(getLaunchTemplateData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateLaunchTemplateVersionRequest == false)
            return false;
        CreateLaunchTemplateVersionRequest other = (CreateLaunchTemplateVersionRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getLaunchTemplateId() == null ^ this.getLaunchTemplateId() == null)
            return false;
        if (other.getLaunchTemplateId() != null && other.getLaunchTemplateId().equals(this.getLaunchTemplateId()) == false)
            return false;
        if (other.getLaunchTemplateName() == null ^ this.getLaunchTemplateName() == null)
            return false;
        if (other.getLaunchTemplateName() != null && other.getLaunchTemplateName().equals(this.getLaunchTemplateName()) == false)
            return false;
        if (other.getSourceVersion() == null ^ this.getSourceVersion() == null)
            return false;
        if (other.getSourceVersion() != null && other.getSourceVersion().equals(this.getSourceVersion()) == false)
            return false;
        if (other.getVersionDescription() == null ^ this.getVersionDescription() == null)
            return false;
        if (other.getVersionDescription() != null && other.getVersionDescription().equals(this.getVersionDescription()) == false)
            return false;
        if (other.getLaunchTemplateData() == null ^ this.getLaunchTemplateData() == null)
            return false;
        if (other.getLaunchTemplateData() != null && other.getLaunchTemplateData().equals(this.getLaunchTemplateData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getLaunchTemplateId() == null) ? 0 : getLaunchTemplateId().hashCode());
        hashCode = prime * hashCode + ((getLaunchTemplateName() == null) ? 0 : getLaunchTemplateName().hashCode());
        hashCode = prime * hashCode + ((getSourceVersion() == null) ? 0 : getSourceVersion().hashCode());
        hashCode = prime * hashCode + ((getVersionDescription() == null) ? 0 : getVersionDescription().hashCode());
        hashCode = prime * hashCode + ((getLaunchTemplateData() == null) ? 0 : getLaunchTemplateData().hashCode());
        return hashCode;
    }

    @Override
    public CreateLaunchTemplateVersionRequest clone() {
        return (CreateLaunchTemplateVersionRequest) super.clone();
    }
}
