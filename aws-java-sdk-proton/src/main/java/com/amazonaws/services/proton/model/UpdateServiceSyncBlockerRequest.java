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
package com.amazonaws.services.proton.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/UpdateServiceSyncBlocker" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateServiceSyncBlockerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the service sync blocker.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The reason the service sync blocker was resolved.
     * </p>
     */
    private String resolvedReason;

    /**
     * <p>
     * The ID of the service sync blocker.
     * </p>
     * 
     * @param id
     *        The ID of the service sync blocker.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the service sync blocker.
     * </p>
     * 
     * @return The ID of the service sync blocker.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the service sync blocker.
     * </p>
     * 
     * @param id
     *        The ID of the service sync blocker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceSyncBlockerRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The reason the service sync blocker was resolved.
     * </p>
     * 
     * @param resolvedReason
     *        The reason the service sync blocker was resolved.
     */

    public void setResolvedReason(String resolvedReason) {
        this.resolvedReason = resolvedReason;
    }

    /**
     * <p>
     * The reason the service sync blocker was resolved.
     * </p>
     * 
     * @return The reason the service sync blocker was resolved.
     */

    public String getResolvedReason() {
        return this.resolvedReason;
    }

    /**
     * <p>
     * The reason the service sync blocker was resolved.
     * </p>
     * 
     * @param resolvedReason
     *        The reason the service sync blocker was resolved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceSyncBlockerRequest withResolvedReason(String resolvedReason) {
        setResolvedReason(resolvedReason);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getResolvedReason() != null)
            sb.append("ResolvedReason: ").append(getResolvedReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateServiceSyncBlockerRequest == false)
            return false;
        UpdateServiceSyncBlockerRequest other = (UpdateServiceSyncBlockerRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getResolvedReason() == null ^ this.getResolvedReason() == null)
            return false;
        if (other.getResolvedReason() != null && other.getResolvedReason().equals(this.getResolvedReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getResolvedReason() == null) ? 0 : getResolvedReason().hashCode());
        return hashCode;
    }

    @Override
    public UpdateServiceSyncBlockerRequest clone() {
        return (UpdateServiceSyncBlockerRequest) super.clone();
    }

}
