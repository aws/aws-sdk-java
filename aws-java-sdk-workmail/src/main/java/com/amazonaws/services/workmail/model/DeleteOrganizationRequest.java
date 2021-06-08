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
package com.amazonaws.services.workmail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeleteOrganization" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteOrganizationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The idempotency token associated with the request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The organization ID.
     * </p>
     */
    private String organizationId;
    /**
     * <p>
     * If true, deletes the AWS Directory Service directory associated with the organization.
     * </p>
     */
    private Boolean deleteDirectory;

    /**
     * <p>
     * The idempotency token associated with the request.
     * </p>
     * 
     * @param clientToken
     *        The idempotency token associated with the request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The idempotency token associated with the request.
     * </p>
     * 
     * @return The idempotency token associated with the request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The idempotency token associated with the request.
     * </p>
     * 
     * @param clientToken
     *        The idempotency token associated with the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteOrganizationRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The organization ID.
     * </p>
     * 
     * @param organizationId
     *        The organization ID.
     */

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * <p>
     * The organization ID.
     * </p>
     * 
     * @return The organization ID.
     */

    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * <p>
     * The organization ID.
     * </p>
     * 
     * @param organizationId
     *        The organization ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteOrganizationRequest withOrganizationId(String organizationId) {
        setOrganizationId(organizationId);
        return this;
    }

    /**
     * <p>
     * If true, deletes the AWS Directory Service directory associated with the organization.
     * </p>
     * 
     * @param deleteDirectory
     *        If true, deletes the AWS Directory Service directory associated with the organization.
     */

    public void setDeleteDirectory(Boolean deleteDirectory) {
        this.deleteDirectory = deleteDirectory;
    }

    /**
     * <p>
     * If true, deletes the AWS Directory Service directory associated with the organization.
     * </p>
     * 
     * @return If true, deletes the AWS Directory Service directory associated with the organization.
     */

    public Boolean getDeleteDirectory() {
        return this.deleteDirectory;
    }

    /**
     * <p>
     * If true, deletes the AWS Directory Service directory associated with the organization.
     * </p>
     * 
     * @param deleteDirectory
     *        If true, deletes the AWS Directory Service directory associated with the organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteOrganizationRequest withDeleteDirectory(Boolean deleteDirectory) {
        setDeleteDirectory(deleteDirectory);
        return this;
    }

    /**
     * <p>
     * If true, deletes the AWS Directory Service directory associated with the organization.
     * </p>
     * 
     * @return If true, deletes the AWS Directory Service directory associated with the organization.
     */

    public Boolean isDeleteDirectory() {
        return this.deleteDirectory;
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
        if (getOrganizationId() != null)
            sb.append("OrganizationId: ").append(getOrganizationId()).append(",");
        if (getDeleteDirectory() != null)
            sb.append("DeleteDirectory: ").append(getDeleteDirectory());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteOrganizationRequest == false)
            return false;
        DeleteOrganizationRequest other = (DeleteOrganizationRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getOrganizationId() == null ^ this.getOrganizationId() == null)
            return false;
        if (other.getOrganizationId() != null && other.getOrganizationId().equals(this.getOrganizationId()) == false)
            return false;
        if (other.getDeleteDirectory() == null ^ this.getDeleteDirectory() == null)
            return false;
        if (other.getDeleteDirectory() != null && other.getDeleteDirectory().equals(this.getDeleteDirectory()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getOrganizationId() == null) ? 0 : getOrganizationId().hashCode());
        hashCode = prime * hashCode + ((getDeleteDirectory() == null) ? 0 : getDeleteDirectory().hashCode());
        return hashCode;
    }

    @Override
    public DeleteOrganizationRequest clone() {
        return (DeleteOrganizationRequest) super.clone();
    }

}
