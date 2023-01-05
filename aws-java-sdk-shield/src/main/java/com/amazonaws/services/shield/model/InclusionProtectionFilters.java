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
package com.amazonaws.services.shield.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Narrows the set of protections that the call retrieves. You can retrieve a single protection by providing its name or
 * the ARN (Amazon Resource Name) of its protected resource. You can also retrieve all protections for a specific
 * resource type. You can provide up to one criteria per filter type. Shield Advanced returns protections that exactly
 * match all of the filter criteria that you provide.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/InclusionProtectionFilters" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InclusionProtectionFilters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the resource whose protection you want to retrieve.
     * </p>
     */
    private java.util.List<String> resourceArns;
    /**
     * <p>
     * The name of the protection that you want to retrieve.
     * </p>
     */
    private java.util.List<String> protectionNames;
    /**
     * <p>
     * The type of protected resource whose protections you want to retrieve.
     * </p>
     */
    private java.util.List<String> resourceTypes;

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the resource whose protection you want to retrieve.
     * </p>
     * 
     * @return The ARN (Amazon Resource Name) of the resource whose protection you want to retrieve.
     */

    public java.util.List<String> getResourceArns() {
        return resourceArns;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the resource whose protection you want to retrieve.
     * </p>
     * 
     * @param resourceArns
     *        The ARN (Amazon Resource Name) of the resource whose protection you want to retrieve.
     */

    public void setResourceArns(java.util.Collection<String> resourceArns) {
        if (resourceArns == null) {
            this.resourceArns = null;
            return;
        }

        this.resourceArns = new java.util.ArrayList<String>(resourceArns);
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the resource whose protection you want to retrieve.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceArns(java.util.Collection)} or {@link #withResourceArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceArns
     *        The ARN (Amazon Resource Name) of the resource whose protection you want to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InclusionProtectionFilters withResourceArns(String... resourceArns) {
        if (this.resourceArns == null) {
            setResourceArns(new java.util.ArrayList<String>(resourceArns.length));
        }
        for (String ele : resourceArns) {
            this.resourceArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the resource whose protection you want to retrieve.
     * </p>
     * 
     * @param resourceArns
     *        The ARN (Amazon Resource Name) of the resource whose protection you want to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InclusionProtectionFilters withResourceArns(java.util.Collection<String> resourceArns) {
        setResourceArns(resourceArns);
        return this;
    }

    /**
     * <p>
     * The name of the protection that you want to retrieve.
     * </p>
     * 
     * @return The name of the protection that you want to retrieve.
     */

    public java.util.List<String> getProtectionNames() {
        return protectionNames;
    }

    /**
     * <p>
     * The name of the protection that you want to retrieve.
     * </p>
     * 
     * @param protectionNames
     *        The name of the protection that you want to retrieve.
     */

    public void setProtectionNames(java.util.Collection<String> protectionNames) {
        if (protectionNames == null) {
            this.protectionNames = null;
            return;
        }

        this.protectionNames = new java.util.ArrayList<String>(protectionNames);
    }

    /**
     * <p>
     * The name of the protection that you want to retrieve.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProtectionNames(java.util.Collection)} or {@link #withProtectionNames(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param protectionNames
     *        The name of the protection that you want to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InclusionProtectionFilters withProtectionNames(String... protectionNames) {
        if (this.protectionNames == null) {
            setProtectionNames(new java.util.ArrayList<String>(protectionNames.length));
        }
        for (String ele : protectionNames) {
            this.protectionNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The name of the protection that you want to retrieve.
     * </p>
     * 
     * @param protectionNames
     *        The name of the protection that you want to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InclusionProtectionFilters withProtectionNames(java.util.Collection<String> protectionNames) {
        setProtectionNames(protectionNames);
        return this;
    }

    /**
     * <p>
     * The type of protected resource whose protections you want to retrieve.
     * </p>
     * 
     * @return The type of protected resource whose protections you want to retrieve.
     * @see ProtectedResourceType
     */

    public java.util.List<String> getResourceTypes() {
        return resourceTypes;
    }

    /**
     * <p>
     * The type of protected resource whose protections you want to retrieve.
     * </p>
     * 
     * @param resourceTypes
     *        The type of protected resource whose protections you want to retrieve.
     * @see ProtectedResourceType
     */

    public void setResourceTypes(java.util.Collection<String> resourceTypes) {
        if (resourceTypes == null) {
            this.resourceTypes = null;
            return;
        }

        this.resourceTypes = new java.util.ArrayList<String>(resourceTypes);
    }

    /**
     * <p>
     * The type of protected resource whose protections you want to retrieve.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceTypes(java.util.Collection)} or {@link #withResourceTypes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param resourceTypes
     *        The type of protected resource whose protections you want to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtectedResourceType
     */

    public InclusionProtectionFilters withResourceTypes(String... resourceTypes) {
        if (this.resourceTypes == null) {
            setResourceTypes(new java.util.ArrayList<String>(resourceTypes.length));
        }
        for (String ele : resourceTypes) {
            this.resourceTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The type of protected resource whose protections you want to retrieve.
     * </p>
     * 
     * @param resourceTypes
     *        The type of protected resource whose protections you want to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtectedResourceType
     */

    public InclusionProtectionFilters withResourceTypes(java.util.Collection<String> resourceTypes) {
        setResourceTypes(resourceTypes);
        return this;
    }

    /**
     * <p>
     * The type of protected resource whose protections you want to retrieve.
     * </p>
     * 
     * @param resourceTypes
     *        The type of protected resource whose protections you want to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtectedResourceType
     */

    public InclusionProtectionFilters withResourceTypes(ProtectedResourceType... resourceTypes) {
        java.util.ArrayList<String> resourceTypesCopy = new java.util.ArrayList<String>(resourceTypes.length);
        for (ProtectedResourceType value : resourceTypes) {
            resourceTypesCopy.add(value.toString());
        }
        if (getResourceTypes() == null) {
            setResourceTypes(resourceTypesCopy);
        } else {
            getResourceTypes().addAll(resourceTypesCopy);
        }
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
        if (getResourceArns() != null)
            sb.append("ResourceArns: ").append(getResourceArns()).append(",");
        if (getProtectionNames() != null)
            sb.append("ProtectionNames: ").append(getProtectionNames()).append(",");
        if (getResourceTypes() != null)
            sb.append("ResourceTypes: ").append(getResourceTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InclusionProtectionFilters == false)
            return false;
        InclusionProtectionFilters other = (InclusionProtectionFilters) obj;
        if (other.getResourceArns() == null ^ this.getResourceArns() == null)
            return false;
        if (other.getResourceArns() != null && other.getResourceArns().equals(this.getResourceArns()) == false)
            return false;
        if (other.getProtectionNames() == null ^ this.getProtectionNames() == null)
            return false;
        if (other.getProtectionNames() != null && other.getProtectionNames().equals(this.getProtectionNames()) == false)
            return false;
        if (other.getResourceTypes() == null ^ this.getResourceTypes() == null)
            return false;
        if (other.getResourceTypes() != null && other.getResourceTypes().equals(this.getResourceTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceArns() == null) ? 0 : getResourceArns().hashCode());
        hashCode = prime * hashCode + ((getProtectionNames() == null) ? 0 : getProtectionNames().hashCode());
        hashCode = prime * hashCode + ((getResourceTypes() == null) ? 0 : getResourceTypes().hashCode());
        return hashCode;
    }

    @Override
    public InclusionProtectionFilters clone() {
        try {
            return (InclusionProtectionFilters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.shield.model.transform.InclusionProtectionFiltersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
