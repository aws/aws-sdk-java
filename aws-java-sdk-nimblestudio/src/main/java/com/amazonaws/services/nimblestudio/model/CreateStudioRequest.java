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
 * A collection of studio resources.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/CreateStudio" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateStudioRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The studio encryption configuration.
     * </p>
     */
    private StudioEncryptionConfiguration studioEncryptionConfiguration;
    /**
     * <p>
     * The studio name that is used in the URL of the Nimble Studio portal when accessed by Nimble Studio users.
     * </p>
     */
    private String studioName;
    /**
     * <p>
     * A collection of labels, in the form of key:value pairs, that apply to this resource.
     * </p>
     */
    private java.util.Map<String, String> tags;
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

    public CreateStudioRequest withAdminRoleArn(String adminRoleArn) {
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

    public CreateStudioRequest withClientToken(String clientToken) {
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

    public CreateStudioRequest withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The studio encryption configuration.
     * </p>
     * 
     * @param studioEncryptionConfiguration
     *        The studio encryption configuration.
     */

    public void setStudioEncryptionConfiguration(StudioEncryptionConfiguration studioEncryptionConfiguration) {
        this.studioEncryptionConfiguration = studioEncryptionConfiguration;
    }

    /**
     * <p>
     * The studio encryption configuration.
     * </p>
     * 
     * @return The studio encryption configuration.
     */

    public StudioEncryptionConfiguration getStudioEncryptionConfiguration() {
        return this.studioEncryptionConfiguration;
    }

    /**
     * <p>
     * The studio encryption configuration.
     * </p>
     * 
     * @param studioEncryptionConfiguration
     *        The studio encryption configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStudioRequest withStudioEncryptionConfiguration(StudioEncryptionConfiguration studioEncryptionConfiguration) {
        setStudioEncryptionConfiguration(studioEncryptionConfiguration);
        return this;
    }

    /**
     * <p>
     * The studio name that is used in the URL of the Nimble Studio portal when accessed by Nimble Studio users.
     * </p>
     * 
     * @param studioName
     *        The studio name that is used in the URL of the Nimble Studio portal when accessed by Nimble Studio users.
     */

    public void setStudioName(String studioName) {
        this.studioName = studioName;
    }

    /**
     * <p>
     * The studio name that is used in the URL of the Nimble Studio portal when accessed by Nimble Studio users.
     * </p>
     * 
     * @return The studio name that is used in the URL of the Nimble Studio portal when accessed by Nimble Studio users.
     */

    public String getStudioName() {
        return this.studioName;
    }

    /**
     * <p>
     * The studio name that is used in the URL of the Nimble Studio portal when accessed by Nimble Studio users.
     * </p>
     * 
     * @param studioName
     *        The studio name that is used in the URL of the Nimble Studio portal when accessed by Nimble Studio users.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStudioRequest withStudioName(String studioName) {
        setStudioName(studioName);
        return this;
    }

    /**
     * <p>
     * A collection of labels, in the form of key:value pairs, that apply to this resource.
     * </p>
     * 
     * @return A collection of labels, in the form of key:value pairs, that apply to this resource.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A collection of labels, in the form of key:value pairs, that apply to this resource.
     * </p>
     * 
     * @param tags
     *        A collection of labels, in the form of key:value pairs, that apply to this resource.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A collection of labels, in the form of key:value pairs, that apply to this resource.
     * </p>
     * 
     * @param tags
     *        A collection of labels, in the form of key:value pairs, that apply to this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStudioRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateStudioRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateStudioRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStudioRequest clearTagsEntries() {
        this.tags = null;
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

    public CreateStudioRequest withUserRoleArn(String userRoleArn) {
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
        if (getStudioEncryptionConfiguration() != null)
            sb.append("StudioEncryptionConfiguration: ").append(getStudioEncryptionConfiguration()).append(",");
        if (getStudioName() != null)
            sb.append("StudioName: ").append(getStudioName()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
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

        if (obj instanceof CreateStudioRequest == false)
            return false;
        CreateStudioRequest other = (CreateStudioRequest) obj;
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
        if (other.getStudioEncryptionConfiguration() == null ^ this.getStudioEncryptionConfiguration() == null)
            return false;
        if (other.getStudioEncryptionConfiguration() != null
                && other.getStudioEncryptionConfiguration().equals(this.getStudioEncryptionConfiguration()) == false)
            return false;
        if (other.getStudioName() == null ^ this.getStudioName() == null)
            return false;
        if (other.getStudioName() != null && other.getStudioName().equals(this.getStudioName()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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
        hashCode = prime * hashCode + ((getStudioEncryptionConfiguration() == null) ? 0 : getStudioEncryptionConfiguration().hashCode());
        hashCode = prime * hashCode + ((getStudioName() == null) ? 0 : getStudioName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getUserRoleArn() == null) ? 0 : getUserRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateStudioRequest clone() {
        return (CreateStudioRequest) super.clone();
    }

}
