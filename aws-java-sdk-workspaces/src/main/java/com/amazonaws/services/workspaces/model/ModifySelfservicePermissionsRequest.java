/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/ModifySelfservicePermissions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifySelfservicePermissionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the directory.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The permissions to enable or disable self-service capabilities.
     * </p>
     */
    private SelfservicePermissions selfservicePermissions;

    /**
     * <p>
     * The identifier of the directory.
     * </p>
     * 
     * @param resourceId
     *        The identifier of the directory.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The identifier of the directory.
     * </p>
     * 
     * @return The identifier of the directory.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The identifier of the directory.
     * </p>
     * 
     * @param resourceId
     *        The identifier of the directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifySelfservicePermissionsRequest withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The permissions to enable or disable self-service capabilities.
     * </p>
     * 
     * @param selfservicePermissions
     *        The permissions to enable or disable self-service capabilities.
     */

    public void setSelfservicePermissions(SelfservicePermissions selfservicePermissions) {
        this.selfservicePermissions = selfservicePermissions;
    }

    /**
     * <p>
     * The permissions to enable or disable self-service capabilities.
     * </p>
     * 
     * @return The permissions to enable or disable self-service capabilities.
     */

    public SelfservicePermissions getSelfservicePermissions() {
        return this.selfservicePermissions;
    }

    /**
     * <p>
     * The permissions to enable or disable self-service capabilities.
     * </p>
     * 
     * @param selfservicePermissions
     *        The permissions to enable or disable self-service capabilities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifySelfservicePermissionsRequest withSelfservicePermissions(SelfservicePermissions selfservicePermissions) {
        setSelfservicePermissions(selfservicePermissions);
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
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getSelfservicePermissions() != null)
            sb.append("SelfservicePermissions: ").append(getSelfservicePermissions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifySelfservicePermissionsRequest == false)
            return false;
        ModifySelfservicePermissionsRequest other = (ModifySelfservicePermissionsRequest) obj;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getSelfservicePermissions() == null ^ this.getSelfservicePermissions() == null)
            return false;
        if (other.getSelfservicePermissions() != null && other.getSelfservicePermissions().equals(this.getSelfservicePermissions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getSelfservicePermissions() == null) ? 0 : getSelfservicePermissions().hashCode());
        return hashCode;
    }

    @Override
    public ModifySelfservicePermissionsRequest clone() {
        return (ModifySelfservicePermissionsRequest) super.clone();
    }

}
