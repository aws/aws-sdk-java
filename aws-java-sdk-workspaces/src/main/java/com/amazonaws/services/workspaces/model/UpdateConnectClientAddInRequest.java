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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/UpdateConnectClientAddIn"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateConnectClientAddInRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the client add-in to update.
     * </p>
     */
    private String addInId;
    /**
     * <p>
     * The directory identifier for which the client add-in is configured.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The name of the client add-in.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The endpoint URL of the Amazon Connect client add-in.
     * </p>
     */
    private String uRL;

    /**
     * <p>
     * The identifier of the client add-in to update.
     * </p>
     * 
     * @param addInId
     *        The identifier of the client add-in to update.
     */

    public void setAddInId(String addInId) {
        this.addInId = addInId;
    }

    /**
     * <p>
     * The identifier of the client add-in to update.
     * </p>
     * 
     * @return The identifier of the client add-in to update.
     */

    public String getAddInId() {
        return this.addInId;
    }

    /**
     * <p>
     * The identifier of the client add-in to update.
     * </p>
     * 
     * @param addInId
     *        The identifier of the client add-in to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConnectClientAddInRequest withAddInId(String addInId) {
        setAddInId(addInId);
        return this;
    }

    /**
     * <p>
     * The directory identifier for which the client add-in is configured.
     * </p>
     * 
     * @param resourceId
     *        The directory identifier for which the client add-in is configured.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The directory identifier for which the client add-in is configured.
     * </p>
     * 
     * @return The directory identifier for which the client add-in is configured.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The directory identifier for which the client add-in is configured.
     * </p>
     * 
     * @param resourceId
     *        The directory identifier for which the client add-in is configured.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConnectClientAddInRequest withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The name of the client add-in.
     * </p>
     * 
     * @param name
     *        The name of the client add-in.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the client add-in.
     * </p>
     * 
     * @return The name of the client add-in.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the client add-in.
     * </p>
     * 
     * @param name
     *        The name of the client add-in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConnectClientAddInRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The endpoint URL of the Amazon Connect client add-in.
     * </p>
     * 
     * @param uRL
     *        The endpoint URL of the Amazon Connect client add-in.
     */

    public void setURL(String uRL) {
        this.uRL = uRL;
    }

    /**
     * <p>
     * The endpoint URL of the Amazon Connect client add-in.
     * </p>
     * 
     * @return The endpoint URL of the Amazon Connect client add-in.
     */

    public String getURL() {
        return this.uRL;
    }

    /**
     * <p>
     * The endpoint URL of the Amazon Connect client add-in.
     * </p>
     * 
     * @param uRL
     *        The endpoint URL of the Amazon Connect client add-in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConnectClientAddInRequest withURL(String uRL) {
        setURL(uRL);
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
        if (getAddInId() != null)
            sb.append("AddInId: ").append(getAddInId()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getURL() != null)
            sb.append("URL: ").append(getURL());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateConnectClientAddInRequest == false)
            return false;
        UpdateConnectClientAddInRequest other = (UpdateConnectClientAddInRequest) obj;
        if (other.getAddInId() == null ^ this.getAddInId() == null)
            return false;
        if (other.getAddInId() != null && other.getAddInId().equals(this.getAddInId()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getURL() == null ^ this.getURL() == null)
            return false;
        if (other.getURL() != null && other.getURL().equals(this.getURL()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAddInId() == null) ? 0 : getAddInId().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getURL() == null) ? 0 : getURL().hashCode());
        return hashCode;
    }

    @Override
    public UpdateConnectClientAddInRequest clone() {
        return (UpdateConnectClientAddInRequest) super.clone();
    }

}
