/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/CreateResourceDefinitionVersion"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateResourceDefinitionVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The client token used to request idempotent operations. */
    private String amznClientToken;
    /** Resource definition Id. */
    private String resourceDefinitionId;
    /** List of resources. */
    private java.util.List<Resource> resources;

    /**
     * The client token used to request idempotent operations.
     * 
     * @param amznClientToken
     *        The client token used to request idempotent operations.
     */

    public void setAmznClientToken(String amznClientToken) {
        this.amznClientToken = amznClientToken;
    }

    /**
     * The client token used to request idempotent operations.
     * 
     * @return The client token used to request idempotent operations.
     */

    public String getAmznClientToken() {
        return this.amznClientToken;
    }

    /**
     * The client token used to request idempotent operations.
     * 
     * @param amznClientToken
     *        The client token used to request idempotent operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResourceDefinitionVersionRequest withAmznClientToken(String amznClientToken) {
        setAmznClientToken(amznClientToken);
        return this;
    }

    /**
     * Resource definition Id.
     * 
     * @param resourceDefinitionId
     *        Resource definition Id.
     */

    public void setResourceDefinitionId(String resourceDefinitionId) {
        this.resourceDefinitionId = resourceDefinitionId;
    }

    /**
     * Resource definition Id.
     * 
     * @return Resource definition Id.
     */

    public String getResourceDefinitionId() {
        return this.resourceDefinitionId;
    }

    /**
     * Resource definition Id.
     * 
     * @param resourceDefinitionId
     *        Resource definition Id.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResourceDefinitionVersionRequest withResourceDefinitionId(String resourceDefinitionId) {
        setResourceDefinitionId(resourceDefinitionId);
        return this;
    }

    /**
     * List of resources.
     * 
     * @return List of resources.
     */

    public java.util.List<Resource> getResources() {
        return resources;
    }

    /**
     * List of resources.
     * 
     * @param resources
     *        List of resources.
     */

    public void setResources(java.util.Collection<Resource> resources) {
        if (resources == null) {
            this.resources = null;
            return;
        }

        this.resources = new java.util.ArrayList<Resource>(resources);
    }

    /**
     * List of resources.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResources(java.util.Collection)} or {@link #withResources(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resources
     *        List of resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResourceDefinitionVersionRequest withResources(Resource... resources) {
        if (this.resources == null) {
            setResources(new java.util.ArrayList<Resource>(resources.length));
        }
        for (Resource ele : resources) {
            this.resources.add(ele);
        }
        return this;
    }

    /**
     * List of resources.
     * 
     * @param resources
     *        List of resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResourceDefinitionVersionRequest withResources(java.util.Collection<Resource> resources) {
        setResources(resources);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAmznClientToken() != null)
            sb.append("AmznClientToken: ").append(getAmznClientToken()).append(",");
        if (getResourceDefinitionId() != null)
            sb.append("ResourceDefinitionId: ").append(getResourceDefinitionId()).append(",");
        if (getResources() != null)
            sb.append("Resources: ").append(getResources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateResourceDefinitionVersionRequest == false)
            return false;
        CreateResourceDefinitionVersionRequest other = (CreateResourceDefinitionVersionRequest) obj;
        if (other.getAmznClientToken() == null ^ this.getAmznClientToken() == null)
            return false;
        if (other.getAmznClientToken() != null && other.getAmznClientToken().equals(this.getAmznClientToken()) == false)
            return false;
        if (other.getResourceDefinitionId() == null ^ this.getResourceDefinitionId() == null)
            return false;
        if (other.getResourceDefinitionId() != null && other.getResourceDefinitionId().equals(this.getResourceDefinitionId()) == false)
            return false;
        if (other.getResources() == null ^ this.getResources() == null)
            return false;
        if (other.getResources() != null && other.getResources().equals(this.getResources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAmznClientToken() == null) ? 0 : getAmznClientToken().hashCode());
        hashCode = prime * hashCode + ((getResourceDefinitionId() == null) ? 0 : getResourceDefinitionId().hashCode());
        hashCode = prime * hashCode + ((getResources() == null) ? 0 : getResources().hashCode());
        return hashCode;
    }

    @Override
    public CreateResourceDefinitionVersionRequest clone() {
        return (CreateResourceDefinitionVersionRequest) super.clone();
    }

}
