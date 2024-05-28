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
package com.amazonaws.services.mailmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/DeleteAddonInstance" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteAddonInstanceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Add On instance ID to delete.
     * </p>
     */
    private String addonInstanceId;

    /**
     * <p>
     * The Add On instance ID to delete.
     * </p>
     * 
     * @param addonInstanceId
     *        The Add On instance ID to delete.
     */

    public void setAddonInstanceId(String addonInstanceId) {
        this.addonInstanceId = addonInstanceId;
    }

    /**
     * <p>
     * The Add On instance ID to delete.
     * </p>
     * 
     * @return The Add On instance ID to delete.
     */

    public String getAddonInstanceId() {
        return this.addonInstanceId;
    }

    /**
     * <p>
     * The Add On instance ID to delete.
     * </p>
     * 
     * @param addonInstanceId
     *        The Add On instance ID to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAddonInstanceRequest withAddonInstanceId(String addonInstanceId) {
        setAddonInstanceId(addonInstanceId);
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
        if (getAddonInstanceId() != null)
            sb.append("AddonInstanceId: ").append(getAddonInstanceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteAddonInstanceRequest == false)
            return false;
        DeleteAddonInstanceRequest other = (DeleteAddonInstanceRequest) obj;
        if (other.getAddonInstanceId() == null ^ this.getAddonInstanceId() == null)
            return false;
        if (other.getAddonInstanceId() != null && other.getAddonInstanceId().equals(this.getAddonInstanceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAddonInstanceId() == null) ? 0 : getAddonInstanceId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteAddonInstanceRequest clone() {
        return (DeleteAddonInstanceRequest) super.clone();
    }

}
