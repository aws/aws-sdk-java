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
package com.amazonaws.services.drs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/DeleteLaunchAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteLaunchActionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String actionId;

    private String resourceId;

    /**
     * @param actionId
     */

    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

    /**
     * @return
     */

    public String getActionId() {
        return this.actionId;
    }

    /**
     * @param actionId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteLaunchActionRequest withActionId(String actionId) {
        setActionId(actionId);
        return this;
    }

    /**
     * @param resourceId
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * @return
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @param resourceId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteLaunchActionRequest withResourceId(String resourceId) {
        setResourceId(resourceId);
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
        if (getActionId() != null)
            sb.append("ActionId: ").append(getActionId()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteLaunchActionRequest == false)
            return false;
        DeleteLaunchActionRequest other = (DeleteLaunchActionRequest) obj;
        if (other.getActionId() == null ^ this.getActionId() == null)
            return false;
        if (other.getActionId() != null && other.getActionId().equals(this.getActionId()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionId() == null) ? 0 : getActionId().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteLaunchActionRequest clone() {
        return (DeleteLaunchActionRequest) super.clone();
    }

}
