/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.managedgrafana.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/CreateWorkspaceServiceAccountToken"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateWorkspaceServiceAccountTokenRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A name for the token to create.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Sets how long the token will be valid, in seconds. You can set the time up to 30 days in the future.
     * </p>
     */
    private Integer secondsToLive;
    /**
     * <p>
     * The ID of the service account for which to create a token.
     * </p>
     */
    private String serviceAccountId;
    /**
     * <p>
     * The ID of the workspace the service account resides within.
     * </p>
     */
    private String workspaceId;

    /**
     * <p>
     * A name for the token to create.
     * </p>
     * 
     * @param name
     *        A name for the token to create.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name for the token to create.
     * </p>
     * 
     * @return A name for the token to create.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A name for the token to create.
     * </p>
     * 
     * @param name
     *        A name for the token to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspaceServiceAccountTokenRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Sets how long the token will be valid, in seconds. You can set the time up to 30 days in the future.
     * </p>
     * 
     * @param secondsToLive
     *        Sets how long the token will be valid, in seconds. You can set the time up to 30 days in the future.
     */

    public void setSecondsToLive(Integer secondsToLive) {
        this.secondsToLive = secondsToLive;
    }

    /**
     * <p>
     * Sets how long the token will be valid, in seconds. You can set the time up to 30 days in the future.
     * </p>
     * 
     * @return Sets how long the token will be valid, in seconds. You can set the time up to 30 days in the future.
     */

    public Integer getSecondsToLive() {
        return this.secondsToLive;
    }

    /**
     * <p>
     * Sets how long the token will be valid, in seconds. You can set the time up to 30 days in the future.
     * </p>
     * 
     * @param secondsToLive
     *        Sets how long the token will be valid, in seconds. You can set the time up to 30 days in the future.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspaceServiceAccountTokenRequest withSecondsToLive(Integer secondsToLive) {
        setSecondsToLive(secondsToLive);
        return this;
    }

    /**
     * <p>
     * The ID of the service account for which to create a token.
     * </p>
     * 
     * @param serviceAccountId
     *        The ID of the service account for which to create a token.
     */

    public void setServiceAccountId(String serviceAccountId) {
        this.serviceAccountId = serviceAccountId;
    }

    /**
     * <p>
     * The ID of the service account for which to create a token.
     * </p>
     * 
     * @return The ID of the service account for which to create a token.
     */

    public String getServiceAccountId() {
        return this.serviceAccountId;
    }

    /**
     * <p>
     * The ID of the service account for which to create a token.
     * </p>
     * 
     * @param serviceAccountId
     *        The ID of the service account for which to create a token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspaceServiceAccountTokenRequest withServiceAccountId(String serviceAccountId) {
        setServiceAccountId(serviceAccountId);
        return this;
    }

    /**
     * <p>
     * The ID of the workspace the service account resides within.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the workspace the service account resides within.
     */

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    /**
     * <p>
     * The ID of the workspace the service account resides within.
     * </p>
     * 
     * @return The ID of the workspace the service account resides within.
     */

    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * <p>
     * The ID of the workspace the service account resides within.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the workspace the service account resides within.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspaceServiceAccountTokenRequest withWorkspaceId(String workspaceId) {
        setWorkspaceId(workspaceId);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSecondsToLive() != null)
            sb.append("SecondsToLive: ").append(getSecondsToLive()).append(",");
        if (getServiceAccountId() != null)
            sb.append("ServiceAccountId: ").append(getServiceAccountId()).append(",");
        if (getWorkspaceId() != null)
            sb.append("WorkspaceId: ").append(getWorkspaceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateWorkspaceServiceAccountTokenRequest == false)
            return false;
        CreateWorkspaceServiceAccountTokenRequest other = (CreateWorkspaceServiceAccountTokenRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSecondsToLive() == null ^ this.getSecondsToLive() == null)
            return false;
        if (other.getSecondsToLive() != null && other.getSecondsToLive().equals(this.getSecondsToLive()) == false)
            return false;
        if (other.getServiceAccountId() == null ^ this.getServiceAccountId() == null)
            return false;
        if (other.getServiceAccountId() != null && other.getServiceAccountId().equals(this.getServiceAccountId()) == false)
            return false;
        if (other.getWorkspaceId() == null ^ this.getWorkspaceId() == null)
            return false;
        if (other.getWorkspaceId() != null && other.getWorkspaceId().equals(this.getWorkspaceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSecondsToLive() == null) ? 0 : getSecondsToLive().hashCode());
        hashCode = prime * hashCode + ((getServiceAccountId() == null) ? 0 : getServiceAccountId().hashCode());
        hashCode = prime * hashCode + ((getWorkspaceId() == null) ? 0 : getWorkspaceId().hashCode());
        return hashCode;
    }

    @Override
    public CreateWorkspaceServiceAccountTokenRequest clone() {
        return (CreateWorkspaceServiceAccountTokenRequest) super.clone();
    }

}
