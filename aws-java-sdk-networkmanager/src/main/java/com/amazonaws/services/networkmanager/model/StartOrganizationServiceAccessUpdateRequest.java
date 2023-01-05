/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.networkmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/StartOrganizationServiceAccessUpdate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartOrganizationServiceAccessUpdateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The action to take for the update request. This can be either <code>ENABLE</code> or <code>DISABLE</code>.
     * </p>
     */
    private String action;

    /**
     * <p>
     * The action to take for the update request. This can be either <code>ENABLE</code> or <code>DISABLE</code>.
     * </p>
     * 
     * @param action
     *        The action to take for the update request. This can be either <code>ENABLE</code> or <code>DISABLE</code>.
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The action to take for the update request. This can be either <code>ENABLE</code> or <code>DISABLE</code>.
     * </p>
     * 
     * @return The action to take for the update request. This can be either <code>ENABLE</code> or <code>DISABLE</code>
     *         .
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * The action to take for the update request. This can be either <code>ENABLE</code> or <code>DISABLE</code>.
     * </p>
     * 
     * @param action
     *        The action to take for the update request. This can be either <code>ENABLE</code> or <code>DISABLE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartOrganizationServiceAccessUpdateRequest withAction(String action) {
        setAction(action);
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
        if (getAction() != null)
            sb.append("Action: ").append(getAction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartOrganizationServiceAccessUpdateRequest == false)
            return false;
        StartOrganizationServiceAccessUpdateRequest other = (StartOrganizationServiceAccessUpdateRequest) obj;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        return hashCode;
    }

    @Override
    public StartOrganizationServiceAccessUpdateRequest clone() {
        return (StartOrganizationServiceAccessUpdateRequest) super.clone();
    }

}
