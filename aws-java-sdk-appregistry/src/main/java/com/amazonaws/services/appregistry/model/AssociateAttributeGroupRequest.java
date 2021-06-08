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
package com.amazonaws.services.appregistry.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry-2020-06-24/AssociateAttributeGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateAttributeGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name or ID of the application.
     * </p>
     */
    private String application;
    /**
     * <p>
     * The name or ID of the attribute group that holds the attributes to describe the application.
     * </p>
     */
    private String attributeGroup;

    /**
     * <p>
     * The name or ID of the application.
     * </p>
     * 
     * @param application
     *        The name or ID of the application.
     */

    public void setApplication(String application) {
        this.application = application;
    }

    /**
     * <p>
     * The name or ID of the application.
     * </p>
     * 
     * @return The name or ID of the application.
     */

    public String getApplication() {
        return this.application;
    }

    /**
     * <p>
     * The name or ID of the application.
     * </p>
     * 
     * @param application
     *        The name or ID of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateAttributeGroupRequest withApplication(String application) {
        setApplication(application);
        return this;
    }

    /**
     * <p>
     * The name or ID of the attribute group that holds the attributes to describe the application.
     * </p>
     * 
     * @param attributeGroup
     *        The name or ID of the attribute group that holds the attributes to describe the application.
     */

    public void setAttributeGroup(String attributeGroup) {
        this.attributeGroup = attributeGroup;
    }

    /**
     * <p>
     * The name or ID of the attribute group that holds the attributes to describe the application.
     * </p>
     * 
     * @return The name or ID of the attribute group that holds the attributes to describe the application.
     */

    public String getAttributeGroup() {
        return this.attributeGroup;
    }

    /**
     * <p>
     * The name or ID of the attribute group that holds the attributes to describe the application.
     * </p>
     * 
     * @param attributeGroup
     *        The name or ID of the attribute group that holds the attributes to describe the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateAttributeGroupRequest withAttributeGroup(String attributeGroup) {
        setAttributeGroup(attributeGroup);
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
        if (getApplication() != null)
            sb.append("Application: ").append(getApplication()).append(",");
        if (getAttributeGroup() != null)
            sb.append("AttributeGroup: ").append(getAttributeGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateAttributeGroupRequest == false)
            return false;
        AssociateAttributeGroupRequest other = (AssociateAttributeGroupRequest) obj;
        if (other.getApplication() == null ^ this.getApplication() == null)
            return false;
        if (other.getApplication() != null && other.getApplication().equals(this.getApplication()) == false)
            return false;
        if (other.getAttributeGroup() == null ^ this.getAttributeGroup() == null)
            return false;
        if (other.getAttributeGroup() != null && other.getAttributeGroup().equals(this.getAttributeGroup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplication() == null) ? 0 : getApplication().hashCode());
        hashCode = prime * hashCode + ((getAttributeGroup() == null) ? 0 : getAttributeGroup().hashCode());
        return hashCode;
    }

    @Override
    public AssociateAttributeGroupRequest clone() {
        return (AssociateAttributeGroupRequest) super.clone();
    }

}
