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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DeleteWorkspaceBundle" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteWorkspaceBundleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the bundle.
     * </p>
     */
    private String bundleId;

    /**
     * <p>
     * The identifier of the bundle.
     * </p>
     * 
     * @param bundleId
     *        The identifier of the bundle.
     */

    public void setBundleId(String bundleId) {
        this.bundleId = bundleId;
    }

    /**
     * <p>
     * The identifier of the bundle.
     * </p>
     * 
     * @return The identifier of the bundle.
     */

    public String getBundleId() {
        return this.bundleId;
    }

    /**
     * <p>
     * The identifier of the bundle.
     * </p>
     * 
     * @param bundleId
     *        The identifier of the bundle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteWorkspaceBundleRequest withBundleId(String bundleId) {
        setBundleId(bundleId);
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
        if (getBundleId() != null)
            sb.append("BundleId: ").append(getBundleId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteWorkspaceBundleRequest == false)
            return false;
        DeleteWorkspaceBundleRequest other = (DeleteWorkspaceBundleRequest) obj;
        if (other.getBundleId() == null ^ this.getBundleId() == null)
            return false;
        if (other.getBundleId() != null && other.getBundleId().equals(this.getBundleId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBundleId() == null) ? 0 : getBundleId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteWorkspaceBundleRequest clone() {
        return (DeleteWorkspaceBundleRequest) super.clone();
    }

}
