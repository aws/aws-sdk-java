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
import com.amazonaws.services.ec2.model.transform.DeleteLaunchTemplateVersionsRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteLaunchTemplateVersionsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DeleteLaunchTemplateVersionsRequest> {

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
     * The version numbers of one or more launch template versions to delete.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> versions;

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

    public DeleteLaunchTemplateVersionsRequest withLaunchTemplateId(String launchTemplateId) {
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

    public DeleteLaunchTemplateVersionsRequest withLaunchTemplateName(String launchTemplateName) {
        setLaunchTemplateName(launchTemplateName);
        return this;
    }

    /**
     * <p>
     * The version numbers of one or more launch template versions to delete.
     * </p>
     * 
     * @return The version numbers of one or more launch template versions to delete.
     */

    public java.util.List<String> getVersions() {
        if (versions == null) {
            versions = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return versions;
    }

    /**
     * <p>
     * The version numbers of one or more launch template versions to delete.
     * </p>
     * 
     * @param versions
     *        The version numbers of one or more launch template versions to delete.
     */

    public void setVersions(java.util.Collection<String> versions) {
        if (versions == null) {
            this.versions = null;
            return;
        }

        this.versions = new com.amazonaws.internal.SdkInternalList<String>(versions);
    }

    /**
     * <p>
     * The version numbers of one or more launch template versions to delete.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVersions(java.util.Collection)} or {@link #withVersions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param versions
     *        The version numbers of one or more launch template versions to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteLaunchTemplateVersionsRequest withVersions(String... versions) {
        if (this.versions == null) {
            setVersions(new com.amazonaws.internal.SdkInternalList<String>(versions.length));
        }
        for (String ele : versions) {
            this.versions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The version numbers of one or more launch template versions to delete.
     * </p>
     * 
     * @param versions
     *        The version numbers of one or more launch template versions to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteLaunchTemplateVersionsRequest withVersions(java.util.Collection<String> versions) {
        setVersions(versions);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DeleteLaunchTemplateVersionsRequest> getDryRunRequest() {
        Request<DeleteLaunchTemplateVersionsRequest> request = new DeleteLaunchTemplateVersionsRequestMarshaller().marshall(this);
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
        if (getLaunchTemplateId() != null)
            sb.append("LaunchTemplateId: ").append(getLaunchTemplateId()).append(",");
        if (getLaunchTemplateName() != null)
            sb.append("LaunchTemplateName: ").append(getLaunchTemplateName()).append(",");
        if (getVersions() != null)
            sb.append("Versions: ").append(getVersions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteLaunchTemplateVersionsRequest == false)
            return false;
        DeleteLaunchTemplateVersionsRequest other = (DeleteLaunchTemplateVersionsRequest) obj;
        if (other.getLaunchTemplateId() == null ^ this.getLaunchTemplateId() == null)
            return false;
        if (other.getLaunchTemplateId() != null && other.getLaunchTemplateId().equals(this.getLaunchTemplateId()) == false)
            return false;
        if (other.getLaunchTemplateName() == null ^ this.getLaunchTemplateName() == null)
            return false;
        if (other.getLaunchTemplateName() != null && other.getLaunchTemplateName().equals(this.getLaunchTemplateName()) == false)
            return false;
        if (other.getVersions() == null ^ this.getVersions() == null)
            return false;
        if (other.getVersions() != null && other.getVersions().equals(this.getVersions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLaunchTemplateId() == null) ? 0 : getLaunchTemplateId().hashCode());
        hashCode = prime * hashCode + ((getLaunchTemplateName() == null) ? 0 : getLaunchTemplateName().hashCode());
        hashCode = prime * hashCode + ((getVersions() == null) ? 0 : getVersions().hashCode());
        return hashCode;
    }

    @Override
    public DeleteLaunchTemplateVersionsRequest clone() {
        return (DeleteLaunchTemplateVersionsRequest) super.clone();
    }
}
