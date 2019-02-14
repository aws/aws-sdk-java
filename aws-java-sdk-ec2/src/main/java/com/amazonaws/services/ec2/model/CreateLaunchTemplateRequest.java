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
import com.amazonaws.services.ec2.model.transform.CreateLaunchTemplateRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLaunchTemplateRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<CreateLaunchTemplateRequest> {

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
     * A name for the launch template.
     * </p>
     */
    private String launchTemplateName;
    /**
     * <p>
     * A description for the first version of the launch template.
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

    public CreateLaunchTemplateRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * A name for the launch template.
     * </p>
     * 
     * @param launchTemplateName
     *        A name for the launch template.
     */

    public void setLaunchTemplateName(String launchTemplateName) {
        this.launchTemplateName = launchTemplateName;
    }

    /**
     * <p>
     * A name for the launch template.
     * </p>
     * 
     * @return A name for the launch template.
     */

    public String getLaunchTemplateName() {
        return this.launchTemplateName;
    }

    /**
     * <p>
     * A name for the launch template.
     * </p>
     * 
     * @param launchTemplateName
     *        A name for the launch template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLaunchTemplateRequest withLaunchTemplateName(String launchTemplateName) {
        setLaunchTemplateName(launchTemplateName);
        return this;
    }

    /**
     * <p>
     * A description for the first version of the launch template.
     * </p>
     * 
     * @param versionDescription
     *        A description for the first version of the launch template.
     */

    public void setVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
    }

    /**
     * <p>
     * A description for the first version of the launch template.
     * </p>
     * 
     * @return A description for the first version of the launch template.
     */

    public String getVersionDescription() {
        return this.versionDescription;
    }

    /**
     * <p>
     * A description for the first version of the launch template.
     * </p>
     * 
     * @param versionDescription
     *        A description for the first version of the launch template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLaunchTemplateRequest withVersionDescription(String versionDescription) {
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

    public CreateLaunchTemplateRequest withLaunchTemplateData(RequestLaunchTemplateData launchTemplateData) {
        setLaunchTemplateData(launchTemplateData);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CreateLaunchTemplateRequest> getDryRunRequest() {
        Request<CreateLaunchTemplateRequest> request = new CreateLaunchTemplateRequestMarshaller().marshall(this);
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
        if (getLaunchTemplateName() != null)
            sb.append("LaunchTemplateName: ").append(getLaunchTemplateName()).append(",");
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

        if (obj instanceof CreateLaunchTemplateRequest == false)
            return false;
        CreateLaunchTemplateRequest other = (CreateLaunchTemplateRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getLaunchTemplateName() == null ^ this.getLaunchTemplateName() == null)
            return false;
        if (other.getLaunchTemplateName() != null && other.getLaunchTemplateName().equals(this.getLaunchTemplateName()) == false)
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
        hashCode = prime * hashCode + ((getLaunchTemplateName() == null) ? 0 : getLaunchTemplateName().hashCode());
        hashCode = prime * hashCode + ((getVersionDescription() == null) ? 0 : getVersionDescription().hashCode());
        hashCode = prime * hashCode + ((getLaunchTemplateData() == null) ? 0 : getLaunchTemplateData().hashCode());
        return hashCode;
    }

    @Override
    public CreateLaunchTemplateRequest clone() {
        return (CreateLaunchTemplateRequest) super.clone();
    }
}
