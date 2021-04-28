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
package com.amazonaws.services.nimblestudio.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The studio ID.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/UpdateStudio" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateStudioRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The IAM role that Studio Admins will assume when logging in to the Nimble Studio portal.
     * </p>
     */
    private String adminRoleArn;
    /**
     * <p>
     * To make an idempotent API request using one of these actions, specify a client token in the request. You should
     * not reuse the same client token for other API requests. If you retry a request that completed successfully using
     * the same client token and the same parameters, the retry succeeds without performing any further actions. If you
     * retry a successful request using the same client token, but one or more of the parameters are different, the
     * retry fails with a ValidationException error.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * A friendly name for the studio.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The studio ID.
     * </p>
     */
    private String studioId;
    /**
     * <p>
     * The IAM role that Studio Users will assume when logging in to the Nimble Studio portal.
     * </p>
     */
    private String userRoleArn;

    /**
     * <p>
     * The IAM role that Studio Admins will assume when logging in to the Nimble Studio portal.
     * </p>
     * 
     * @param adminRoleArn
     *        The IAM role that Studio Admins will assume when logging in to the Nimble Studio portal.
     */

    public void setAdminRoleArn(String adminRoleArn) {
        this.adminRoleArn = adminRoleArn;
    }

    /**
     * <p>
     * The IAM role that Studio Admins will assume when logging in to the Nimble Studio portal.
     * </p>
     * 
     * @return The IAM role that Studio Admins will assume when logging in to the Nimble Studio portal.
     */

    public String getAdminRoleArn() {
        return this.adminRoleArn;
    }

    /**
     * <p>
     * The IAM role that Studio Admins will assume when logging in to the Nimble Studio portal.
     * </p>
     * 
     * @param adminRoleArn
     *        The IAM role that Studio Admins will assume when logging in to the Nimble Studio portal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStudioRequest withAdminRoleArn(String adminRoleArn) {
        setAdminRoleArn(adminRoleArn);
        return this;
    }

    /**
     * <p>
     * To make an idempotent API request using one of these actions, specify a client token in the request. You should
     * not reuse the same client token for other API requests. If you retry a request that completed successfully using
     * the same client token and the same parameters, the retry succeeds without performing any further actions. If you
     * retry a successful request using the same client token, but one or more of the parameters are different, the
     * retry fails with a ValidationException error.
     * </p>
     * 
     * @param clientToken
     *        To make an idempotent API request using one of these actions, specify a client token in the request. You
     *        should not reuse the same client token for other API requests. If you retry a request that completed
     *        successfully using the same client token and the same parameters, the retry succeeds without performing
     *        any further actions. If you retry a successful request using the same client token, but one or more of the
     *        parameters are different, the retry fails with a ValidationException error.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * To make an idempotent API request using one of these actions, specify a client token in the request. You should
     * not reuse the same client token for other API requests. If you retry a request that completed successfully using
     * the same client token and the same parameters, the retry succeeds without performing any further actions. If you
     * retry a successful request using the same client token, but one or more of the parameters are different, the
     * retry fails with a ValidationException error.
     * </p>
     * 
     * @return To make an idempotent API request using one of these actions, specify a client token in the request. You
     *         should not reuse the same client token for other API requests. If you retry a request that completed
     *         successfully using the same client token and the same parameters, the retry succeeds without performing
     *         any further actions. If you retry a successful request using the same client token, but one or more of
     *         the parameters are different, the retry fails with a ValidationException error.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * To make an idempotent API request using one of these actions, specify a client token in the request. You should
     * not reuse the same client token for other API requests. If you retry a request that completed successfully using
     * the same client token and the same parameters, the retry succeeds without performing any further actions. If you
     * retry a successful request using the same client token, but one or more of the parameters are different, the
     * retry fails with a ValidationException error.
     * </p>
     * 
     * @param clientToken
     *        To make an idempotent API request using one of these actions, specify a client token in the request. You
     *        should not reuse the same client token for other API requests. If you retry a request that completed
     *        successfully using the same client token and the same parameters, the retry succeeds without performing
     *        any further actions. If you retry a successful request using the same client token, but one or more of the
     *        parameters are different, the retry fails with a ValidationException error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStudioRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * A friendly name for the studio.
     * </p>
     * 
     * @param displayName
     *        A friendly name for the studio.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * A friendly name for the studio.
     * </p>
     * 
     * @return A friendly name for the studio.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * A friendly name for the studio.
     * </p>
     * 
     * @param displayName
     *        A friendly name for the studio.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStudioRequest withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The studio ID.
     * </p>
     * 
     * @param studioId
     *        The studio ID.
     */

    public void setStudioId(String studioId) {
        this.studioId = studioId;
    }

    /**
     * <p>
     * The studio ID.
     * </p>
     * 
     * @return The studio ID.
     */

    public String getStudioId() {
        return this.studioId;
    }

    /**
     * <p>
     * The studio ID.
     * </p>
     * 
     * @param studioId
     *        The studio ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStudioRequest withStudioId(String studioId) {
        setStudioId(studioId);
        return this;
    }

    /**
     * <p>
     * The IAM role that Studio Users will assume when logging in to the Nimble Studio portal.
     * </p>
     * 
     * @param userRoleArn
     *        The IAM role that Studio Users will assume when logging in to the Nimble Studio portal.
     */

    public void setUserRoleArn(String userRoleArn) {
        this.userRoleArn = userRoleArn;
    }

    /**
     * <p>
     * The IAM role that Studio Users will assume when logging in to the Nimble Studio portal.
     * </p>
     * 
     * @return The IAM role that Studio Users will assume when logging in to the Nimble Studio portal.
     */

    public String getUserRoleArn() {
        return this.userRoleArn;
    }

    /**
     * <p>
     * The IAM role that Studio Users will assume when logging in to the Nimble Studio portal.
     * </p>
     * 
     * @param userRoleArn
     *        The IAM role that Studio Users will assume when logging in to the Nimble Studio portal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStudioRequest withUserRoleArn(String userRoleArn) {
        setUserRoleArn(userRoleArn);
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
        if (getAdminRoleArn() != null)
            sb.append("AdminRoleArn: ").append(getAdminRoleArn()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getStudioId() != null)
            sb.append("StudioId: ").append(getStudioId()).append(",");
        if (getUserRoleArn() != null)
            sb.append("UserRoleArn: ").append(getUserRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateStudioRequest == false)
            return false;
        UpdateStudioRequest other = (UpdateStudioRequest) obj;
        if (other.getAdminRoleArn() == null ^ this.getAdminRoleArn() == null)
            return false;
        if (other.getAdminRoleArn() != null && other.getAdminRoleArn().equals(this.getAdminRoleArn()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getStudioId() == null ^ this.getStudioId() == null)
            return false;
        if (other.getStudioId() != null && other.getStudioId().equals(this.getStudioId()) == false)
            return false;
        if (other.getUserRoleArn() == null ^ this.getUserRoleArn() == null)
            return false;
        if (other.getUserRoleArn() != null && other.getUserRoleArn().equals(this.getUserRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdminRoleArn() == null) ? 0 : getAdminRoleArn().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getStudioId() == null) ? 0 : getStudioId().hashCode());
        hashCode = prime * hashCode + ((getUserRoleArn() == null) ? 0 : getUserRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public UpdateStudioRequest clone() {
        return (UpdateStudioRequest) super.clone();
    }

}
