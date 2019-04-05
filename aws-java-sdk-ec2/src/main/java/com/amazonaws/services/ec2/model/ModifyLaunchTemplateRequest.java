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
import com.amazonaws.services.ec2.model.transform.ModifyLaunchTemplateRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyLaunchTemplateRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<ModifyLaunchTemplateRequest> {

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
     * The version number of the launch template to set as the default version.
     * </p>
     */
    private String defaultVersion;

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

    public ModifyLaunchTemplateRequest withClientToken(String clientToken) {
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

    public ModifyLaunchTemplateRequest withLaunchTemplateId(String launchTemplateId) {
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

    public ModifyLaunchTemplateRequest withLaunchTemplateName(String launchTemplateName) {
        setLaunchTemplateName(launchTemplateName);
        return this;
    }

    /**
     * <p>
     * The version number of the launch template to set as the default version.
     * </p>
     * 
     * @param defaultVersion
     *        The version number of the launch template to set as the default version.
     */

    public void setDefaultVersion(String defaultVersion) {
        this.defaultVersion = defaultVersion;
    }

    /**
     * <p>
     * The version number of the launch template to set as the default version.
     * </p>
     * 
     * @return The version number of the launch template to set as the default version.
     */

    public String getDefaultVersion() {
        return this.defaultVersion;
    }

    /**
     * <p>
     * The version number of the launch template to set as the default version.
     * </p>
     * 
     * @param defaultVersion
     *        The version number of the launch template to set as the default version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyLaunchTemplateRequest withDefaultVersion(String defaultVersion) {
        setDefaultVersion(defaultVersion);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ModifyLaunchTemplateRequest> getDryRunRequest() {
        Request<ModifyLaunchTemplateRequest> request = new ModifyLaunchTemplateRequestMarshaller().marshall(this);
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
        if (getDefaultVersion() != null)
            sb.append("DefaultVersion: ").append(getDefaultVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyLaunchTemplateRequest == false)
            return false;
        ModifyLaunchTemplateRequest other = (ModifyLaunchTemplateRequest) obj;
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
        if (other.getDefaultVersion() == null ^ this.getDefaultVersion() == null)
            return false;
        if (other.getDefaultVersion() != null && other.getDefaultVersion().equals(this.getDefaultVersion()) == false)
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
        hashCode = prime * hashCode + ((getDefaultVersion() == null) ? 0 : getDefaultVersion().hashCode());
        return hashCode;
    }

    @Override
    public ModifyLaunchTemplateRequest clone() {
        return (ModifyLaunchTemplateRequest) super.clone();
    }
}
