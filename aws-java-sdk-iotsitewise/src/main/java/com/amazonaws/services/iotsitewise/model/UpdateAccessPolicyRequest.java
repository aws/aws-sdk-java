/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/UpdateAccessPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAccessPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the access policy.
     * </p>
     */
    private String accessPolicyId;
    /**
     * <p>
     * The identity for this access policy. Choose an Amazon Web Services SSO user, an Amazon Web Services SSO group, or
     * an IAM user.
     * </p>
     */
    private Identity accessPolicyIdentity;
    /**
     * <p>
     * The IoT SiteWise Monitor resource for this access policy. Choose either a portal or a project.
     * </p>
     */
    private Resource accessPolicyResource;
    /**
     * <p>
     * The permission level for this access policy. Note that a project <code>ADMINISTRATOR</code> is also known as a
     * project owner.
     * </p>
     */
    private String accessPolicyPermission;
    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse
     * this client token if a new idempotent request is required.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The ID of the access policy.
     * </p>
     * 
     * @param accessPolicyId
     *        The ID of the access policy.
     */

    public void setAccessPolicyId(String accessPolicyId) {
        this.accessPolicyId = accessPolicyId;
    }

    /**
     * <p>
     * The ID of the access policy.
     * </p>
     * 
     * @return The ID of the access policy.
     */

    public String getAccessPolicyId() {
        return this.accessPolicyId;
    }

    /**
     * <p>
     * The ID of the access policy.
     * </p>
     * 
     * @param accessPolicyId
     *        The ID of the access policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAccessPolicyRequest withAccessPolicyId(String accessPolicyId) {
        setAccessPolicyId(accessPolicyId);
        return this;
    }

    /**
     * <p>
     * The identity for this access policy. Choose an Amazon Web Services SSO user, an Amazon Web Services SSO group, or
     * an IAM user.
     * </p>
     * 
     * @param accessPolicyIdentity
     *        The identity for this access policy. Choose an Amazon Web Services SSO user, an Amazon Web Services SSO
     *        group, or an IAM user.
     */

    public void setAccessPolicyIdentity(Identity accessPolicyIdentity) {
        this.accessPolicyIdentity = accessPolicyIdentity;
    }

    /**
     * <p>
     * The identity for this access policy. Choose an Amazon Web Services SSO user, an Amazon Web Services SSO group, or
     * an IAM user.
     * </p>
     * 
     * @return The identity for this access policy. Choose an Amazon Web Services SSO user, an Amazon Web Services SSO
     *         group, or an IAM user.
     */

    public Identity getAccessPolicyIdentity() {
        return this.accessPolicyIdentity;
    }

    /**
     * <p>
     * The identity for this access policy. Choose an Amazon Web Services SSO user, an Amazon Web Services SSO group, or
     * an IAM user.
     * </p>
     * 
     * @param accessPolicyIdentity
     *        The identity for this access policy. Choose an Amazon Web Services SSO user, an Amazon Web Services SSO
     *        group, or an IAM user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAccessPolicyRequest withAccessPolicyIdentity(Identity accessPolicyIdentity) {
        setAccessPolicyIdentity(accessPolicyIdentity);
        return this;
    }

    /**
     * <p>
     * The IoT SiteWise Monitor resource for this access policy. Choose either a portal or a project.
     * </p>
     * 
     * @param accessPolicyResource
     *        The IoT SiteWise Monitor resource for this access policy. Choose either a portal or a project.
     */

    public void setAccessPolicyResource(Resource accessPolicyResource) {
        this.accessPolicyResource = accessPolicyResource;
    }

    /**
     * <p>
     * The IoT SiteWise Monitor resource for this access policy. Choose either a portal or a project.
     * </p>
     * 
     * @return The IoT SiteWise Monitor resource for this access policy. Choose either a portal or a project.
     */

    public Resource getAccessPolicyResource() {
        return this.accessPolicyResource;
    }

    /**
     * <p>
     * The IoT SiteWise Monitor resource for this access policy. Choose either a portal or a project.
     * </p>
     * 
     * @param accessPolicyResource
     *        The IoT SiteWise Monitor resource for this access policy. Choose either a portal or a project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAccessPolicyRequest withAccessPolicyResource(Resource accessPolicyResource) {
        setAccessPolicyResource(accessPolicyResource);
        return this;
    }

    /**
     * <p>
     * The permission level for this access policy. Note that a project <code>ADMINISTRATOR</code> is also known as a
     * project owner.
     * </p>
     * 
     * @param accessPolicyPermission
     *        The permission level for this access policy. Note that a project <code>ADMINISTRATOR</code> is also known
     *        as a project owner.
     * @see Permission
     */

    public void setAccessPolicyPermission(String accessPolicyPermission) {
        this.accessPolicyPermission = accessPolicyPermission;
    }

    /**
     * <p>
     * The permission level for this access policy. Note that a project <code>ADMINISTRATOR</code> is also known as a
     * project owner.
     * </p>
     * 
     * @return The permission level for this access policy. Note that a project <code>ADMINISTRATOR</code> is also known
     *         as a project owner.
     * @see Permission
     */

    public String getAccessPolicyPermission() {
        return this.accessPolicyPermission;
    }

    /**
     * <p>
     * The permission level for this access policy. Note that a project <code>ADMINISTRATOR</code> is also known as a
     * project owner.
     * </p>
     * 
     * @param accessPolicyPermission
     *        The permission level for this access policy. Note that a project <code>ADMINISTRATOR</code> is also known
     *        as a project owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Permission
     */

    public UpdateAccessPolicyRequest withAccessPolicyPermission(String accessPolicyPermission) {
        setAccessPolicyPermission(accessPolicyPermission);
        return this;
    }

    /**
     * <p>
     * The permission level for this access policy. Note that a project <code>ADMINISTRATOR</code> is also known as a
     * project owner.
     * </p>
     * 
     * @param accessPolicyPermission
     *        The permission level for this access policy. Note that a project <code>ADMINISTRATOR</code> is also known
     *        as a project owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Permission
     */

    public UpdateAccessPolicyRequest withAccessPolicyPermission(Permission accessPolicyPermission) {
        this.accessPolicyPermission = accessPolicyPermission.toString();
        return this;
    }

    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse
     * this client token if a new idempotent request is required.
     * </p>
     * 
     * @param clientToken
     *        A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't
     *        reuse this client token if a new idempotent request is required.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse
     * this client token if a new idempotent request is required.
     * </p>
     * 
     * @return A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't
     *         reuse this client token if a new idempotent request is required.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse
     * this client token if a new idempotent request is required.
     * </p>
     * 
     * @param clientToken
     *        A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't
     *        reuse this client token if a new idempotent request is required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAccessPolicyRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getAccessPolicyId() != null)
            sb.append("AccessPolicyId: ").append(getAccessPolicyId()).append(",");
        if (getAccessPolicyIdentity() != null)
            sb.append("AccessPolicyIdentity: ").append(getAccessPolicyIdentity()).append(",");
        if (getAccessPolicyResource() != null)
            sb.append("AccessPolicyResource: ").append(getAccessPolicyResource()).append(",");
        if (getAccessPolicyPermission() != null)
            sb.append("AccessPolicyPermission: ").append(getAccessPolicyPermission()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAccessPolicyRequest == false)
            return false;
        UpdateAccessPolicyRequest other = (UpdateAccessPolicyRequest) obj;
        if (other.getAccessPolicyId() == null ^ this.getAccessPolicyId() == null)
            return false;
        if (other.getAccessPolicyId() != null && other.getAccessPolicyId().equals(this.getAccessPolicyId()) == false)
            return false;
        if (other.getAccessPolicyIdentity() == null ^ this.getAccessPolicyIdentity() == null)
            return false;
        if (other.getAccessPolicyIdentity() != null && other.getAccessPolicyIdentity().equals(this.getAccessPolicyIdentity()) == false)
            return false;
        if (other.getAccessPolicyResource() == null ^ this.getAccessPolicyResource() == null)
            return false;
        if (other.getAccessPolicyResource() != null && other.getAccessPolicyResource().equals(this.getAccessPolicyResource()) == false)
            return false;
        if (other.getAccessPolicyPermission() == null ^ this.getAccessPolicyPermission() == null)
            return false;
        if (other.getAccessPolicyPermission() != null && other.getAccessPolicyPermission().equals(this.getAccessPolicyPermission()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessPolicyId() == null) ? 0 : getAccessPolicyId().hashCode());
        hashCode = prime * hashCode + ((getAccessPolicyIdentity() == null) ? 0 : getAccessPolicyIdentity().hashCode());
        hashCode = prime * hashCode + ((getAccessPolicyResource() == null) ? 0 : getAccessPolicyResource().hashCode());
        hashCode = prime * hashCode + ((getAccessPolicyPermission() == null) ? 0 : getAccessPolicyPermission().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAccessPolicyRequest clone() {
        return (UpdateAccessPolicyRequest) super.clone();
    }

}
