/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.ModifyIdentityIdFormatRequestMarshaller;

/**
 * <p>
 * Contains the parameters of ModifyIdentityIdFormat.
 * </p>
 */
public class ModifyIdentityIdFormatRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<ModifyIdentityIdFormatRequest> {

    /**
     * <p>
     * The type of resource: <code>instance</code> | <code>reservation</code> | <code>snapshot</code> |
     * <code>volume</code>
     * </p>
     */
    private String resource;
    /**
     * <p>
     * Indicates whether the resource should use longer IDs (17-character IDs)
     * </p>
     */
    private Boolean useLongIds;
    /**
     * <p>
     * The ARN of the principal, which can be an IAM user, IAM role, or the root user. Specify <code>all</code> to
     * modify the ID format for all IAM users, IAM roles, and the root user of the account.
     * </p>
     */
    private String principalArn;

    /**
     * <p>
     * The type of resource: <code>instance</code> | <code>reservation</code> | <code>snapshot</code> |
     * <code>volume</code>
     * </p>
     * 
     * @param resource
     *        The type of resource: <code>instance</code> | <code>reservation</code> | <code>snapshot</code> |
     *        <code>volume</code>
     */

    public void setResource(String resource) {
        this.resource = resource;
    }

    /**
     * <p>
     * The type of resource: <code>instance</code> | <code>reservation</code> | <code>snapshot</code> |
     * <code>volume</code>
     * </p>
     * 
     * @return The type of resource: <code>instance</code> | <code>reservation</code> | <code>snapshot</code> |
     *         <code>volume</code>
     */

    public String getResource() {
        return this.resource;
    }

    /**
     * <p>
     * The type of resource: <code>instance</code> | <code>reservation</code> | <code>snapshot</code> |
     * <code>volume</code>
     * </p>
     * 
     * @param resource
     *        The type of resource: <code>instance</code> | <code>reservation</code> | <code>snapshot</code> |
     *        <code>volume</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyIdentityIdFormatRequest withResource(String resource) {
        setResource(resource);
        return this;
    }

    /**
     * <p>
     * Indicates whether the resource should use longer IDs (17-character IDs)
     * </p>
     * 
     * @param useLongIds
     *        Indicates whether the resource should use longer IDs (17-character IDs)
     */

    public void setUseLongIds(Boolean useLongIds) {
        this.useLongIds = useLongIds;
    }

    /**
     * <p>
     * Indicates whether the resource should use longer IDs (17-character IDs)
     * </p>
     * 
     * @return Indicates whether the resource should use longer IDs (17-character IDs)
     */

    public Boolean getUseLongIds() {
        return this.useLongIds;
    }

    /**
     * <p>
     * Indicates whether the resource should use longer IDs (17-character IDs)
     * </p>
     * 
     * @param useLongIds
     *        Indicates whether the resource should use longer IDs (17-character IDs)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyIdentityIdFormatRequest withUseLongIds(Boolean useLongIds) {
        setUseLongIds(useLongIds);
        return this;
    }

    /**
     * <p>
     * Indicates whether the resource should use longer IDs (17-character IDs)
     * </p>
     * 
     * @return Indicates whether the resource should use longer IDs (17-character IDs)
     */

    public Boolean isUseLongIds() {
        return this.useLongIds;
    }

    /**
     * <p>
     * The ARN of the principal, which can be an IAM user, IAM role, or the root user. Specify <code>all</code> to
     * modify the ID format for all IAM users, IAM roles, and the root user of the account.
     * </p>
     * 
     * @param principalArn
     *        The ARN of the principal, which can be an IAM user, IAM role, or the root user. Specify <code>all</code>
     *        to modify the ID format for all IAM users, IAM roles, and the root user of the account.
     */

    public void setPrincipalArn(String principalArn) {
        this.principalArn = principalArn;
    }

    /**
     * <p>
     * The ARN of the principal, which can be an IAM user, IAM role, or the root user. Specify <code>all</code> to
     * modify the ID format for all IAM users, IAM roles, and the root user of the account.
     * </p>
     * 
     * @return The ARN of the principal, which can be an IAM user, IAM role, or the root user. Specify <code>all</code>
     *         to modify the ID format for all IAM users, IAM roles, and the root user of the account.
     */

    public String getPrincipalArn() {
        return this.principalArn;
    }

    /**
     * <p>
     * The ARN of the principal, which can be an IAM user, IAM role, or the root user. Specify <code>all</code> to
     * modify the ID format for all IAM users, IAM roles, and the root user of the account.
     * </p>
     * 
     * @param principalArn
     *        The ARN of the principal, which can be an IAM user, IAM role, or the root user. Specify <code>all</code>
     *        to modify the ID format for all IAM users, IAM roles, and the root user of the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyIdentityIdFormatRequest withPrincipalArn(String principalArn) {
        setPrincipalArn(principalArn);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ModifyIdentityIdFormatRequest> getDryRunRequest() {
        Request<ModifyIdentityIdFormatRequest> request = new ModifyIdentityIdFormatRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getResource() != null)
            sb.append("Resource: " + getResource() + ",");
        if (getUseLongIds() != null)
            sb.append("UseLongIds: " + getUseLongIds() + ",");
        if (getPrincipalArn() != null)
            sb.append("PrincipalArn: " + getPrincipalArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyIdentityIdFormatRequest == false)
            return false;
        ModifyIdentityIdFormatRequest other = (ModifyIdentityIdFormatRequest) obj;
        if (other.getResource() == null ^ this.getResource() == null)
            return false;
        if (other.getResource() != null && other.getResource().equals(this.getResource()) == false)
            return false;
        if (other.getUseLongIds() == null ^ this.getUseLongIds() == null)
            return false;
        if (other.getUseLongIds() != null && other.getUseLongIds().equals(this.getUseLongIds()) == false)
            return false;
        if (other.getPrincipalArn() == null ^ this.getPrincipalArn() == null)
            return false;
        if (other.getPrincipalArn() != null && other.getPrincipalArn().equals(this.getPrincipalArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResource() == null) ? 0 : getResource().hashCode());
        hashCode = prime * hashCode + ((getUseLongIds() == null) ? 0 : getUseLongIds().hashCode());
        hashCode = prime * hashCode + ((getPrincipalArn() == null) ? 0 : getPrincipalArn().hashCode());
        return hashCode;
    }

    @Override
    public ModifyIdentityIdFormatRequest clone() {
        return (ModifyIdentityIdFormatRequest) super.clone();
    }
}
