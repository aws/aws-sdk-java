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
package com.amazonaws.services.resiliencehub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A list of errors retrieving an application's resources.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ResourceErrorsDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceErrorsDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * This indicates if there are more errors not listed in the resourceErrors list.
     * </p>
     */
    private Boolean hasMoreErrors;
    /**
     * <p>
     * A list of errors retrieving an application's resources.
     * </p>
     */
    private java.util.List<ResourceError> resourceErrors;

    /**
     * <p>
     * This indicates if there are more errors not listed in the resourceErrors list.
     * </p>
     * 
     * @param hasMoreErrors
     *        This indicates if there are more errors not listed in the resourceErrors list.
     */

    public void setHasMoreErrors(Boolean hasMoreErrors) {
        this.hasMoreErrors = hasMoreErrors;
    }

    /**
     * <p>
     * This indicates if there are more errors not listed in the resourceErrors list.
     * </p>
     * 
     * @return This indicates if there are more errors not listed in the resourceErrors list.
     */

    public Boolean getHasMoreErrors() {
        return this.hasMoreErrors;
    }

    /**
     * <p>
     * This indicates if there are more errors not listed in the resourceErrors list.
     * </p>
     * 
     * @param hasMoreErrors
     *        This indicates if there are more errors not listed in the resourceErrors list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceErrorsDetails withHasMoreErrors(Boolean hasMoreErrors) {
        setHasMoreErrors(hasMoreErrors);
        return this;
    }

    /**
     * <p>
     * This indicates if there are more errors not listed in the resourceErrors list.
     * </p>
     * 
     * @return This indicates if there are more errors not listed in the resourceErrors list.
     */

    public Boolean isHasMoreErrors() {
        return this.hasMoreErrors;
    }

    /**
     * <p>
     * A list of errors retrieving an application's resources.
     * </p>
     * 
     * @return A list of errors retrieving an application's resources.
     */

    public java.util.List<ResourceError> getResourceErrors() {
        return resourceErrors;
    }

    /**
     * <p>
     * A list of errors retrieving an application's resources.
     * </p>
     * 
     * @param resourceErrors
     *        A list of errors retrieving an application's resources.
     */

    public void setResourceErrors(java.util.Collection<ResourceError> resourceErrors) {
        if (resourceErrors == null) {
            this.resourceErrors = null;
            return;
        }

        this.resourceErrors = new java.util.ArrayList<ResourceError>(resourceErrors);
    }

    /**
     * <p>
     * A list of errors retrieving an application's resources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceErrors(java.util.Collection)} or {@link #withResourceErrors(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param resourceErrors
     *        A list of errors retrieving an application's resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceErrorsDetails withResourceErrors(ResourceError... resourceErrors) {
        if (this.resourceErrors == null) {
            setResourceErrors(new java.util.ArrayList<ResourceError>(resourceErrors.length));
        }
        for (ResourceError ele : resourceErrors) {
            this.resourceErrors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of errors retrieving an application's resources.
     * </p>
     * 
     * @param resourceErrors
     *        A list of errors retrieving an application's resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceErrorsDetails withResourceErrors(java.util.Collection<ResourceError> resourceErrors) {
        setResourceErrors(resourceErrors);
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
        if (getHasMoreErrors() != null)
            sb.append("HasMoreErrors: ").append(getHasMoreErrors()).append(",");
        if (getResourceErrors() != null)
            sb.append("ResourceErrors: ").append(getResourceErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceErrorsDetails == false)
            return false;
        ResourceErrorsDetails other = (ResourceErrorsDetails) obj;
        if (other.getHasMoreErrors() == null ^ this.getHasMoreErrors() == null)
            return false;
        if (other.getHasMoreErrors() != null && other.getHasMoreErrors().equals(this.getHasMoreErrors()) == false)
            return false;
        if (other.getResourceErrors() == null ^ this.getResourceErrors() == null)
            return false;
        if (other.getResourceErrors() != null && other.getResourceErrors().equals(this.getResourceErrors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHasMoreErrors() == null) ? 0 : getHasMoreErrors().hashCode());
        hashCode = prime * hashCode + ((getResourceErrors() == null) ? 0 : getResourceErrors().hashCode());
        return hashCode;
    }

    @Override
    public ResourceErrorsDetails clone() {
        try {
            return (ResourceErrorsDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.resiliencehub.model.transform.ResourceErrorsDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
