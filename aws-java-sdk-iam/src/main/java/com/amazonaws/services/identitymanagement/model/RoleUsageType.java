/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * An object that contains details about how a service-linked role is used, if that information is returned by the
 * service.
 * </p>
 * <p>
 * This data type is used as a response element in the <a>GetServiceLinkedRoleDeletionStatus</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/RoleUsageType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RoleUsageType implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the region where the service-linked role is being used.
     * </p>
     */
    private String region;
    /**
     * <p>
     * The name of the resource that is using the service-linked role.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> resources;

    /**
     * <p>
     * The name of the region where the service-linked role is being used.
     * </p>
     * 
     * @param region
     *        The name of the region where the service-linked role is being used.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The name of the region where the service-linked role is being used.
     * </p>
     * 
     * @return The name of the region where the service-linked role is being used.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The name of the region where the service-linked role is being used.
     * </p>
     * 
     * @param region
     *        The name of the region where the service-linked role is being used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RoleUsageType withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * The name of the resource that is using the service-linked role.
     * </p>
     * 
     * @return The name of the resource that is using the service-linked role.
     */

    public java.util.List<String> getResources() {
        if (resources == null) {
            resources = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return resources;
    }

    /**
     * <p>
     * The name of the resource that is using the service-linked role.
     * </p>
     * 
     * @param resources
     *        The name of the resource that is using the service-linked role.
     */

    public void setResources(java.util.Collection<String> resources) {
        if (resources == null) {
            this.resources = null;
            return;
        }

        this.resources = new com.amazonaws.internal.SdkInternalList<String>(resources);
    }

    /**
     * <p>
     * The name of the resource that is using the service-linked role.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResources(java.util.Collection)} or {@link #withResources(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resources
     *        The name of the resource that is using the service-linked role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RoleUsageType withResources(String... resources) {
        if (this.resources == null) {
            setResources(new com.amazonaws.internal.SdkInternalList<String>(resources.length));
        }
        for (String ele : resources) {
            this.resources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The name of the resource that is using the service-linked role.
     * </p>
     * 
     * @param resources
     *        The name of the resource that is using the service-linked role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RoleUsageType withResources(java.util.Collection<String> resources) {
        setResources(resources);
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
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
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

        if (obj instanceof RoleUsageType == false)
            return false;
        RoleUsageType other = (RoleUsageType) obj;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
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

        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getResources() == null) ? 0 : getResources().hashCode());
        return hashCode;
    }

    @Override
    public RoleUsageType clone() {
        try {
            return (RoleUsageType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
