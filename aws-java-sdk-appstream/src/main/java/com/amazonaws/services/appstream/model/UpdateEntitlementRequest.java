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
package com.amazonaws.services.appstream.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/UpdateEntitlement" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateEntitlementRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the entitlement.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The name of the stack with which the entitlement is associated.
     * </p>
     */
    private String stackName;
    /**
     * <p>
     * The description of the entitlement.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Specifies whether all or only selected apps are entitled.
     * </p>
     */
    private String appVisibility;
    /**
     * <p>
     * The attributes of the entitlement.
     * </p>
     */
    private java.util.List<EntitlementAttribute> attributes;

    /**
     * <p>
     * The name of the entitlement.
     * </p>
     * 
     * @param name
     *        The name of the entitlement.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the entitlement.
     * </p>
     * 
     * @return The name of the entitlement.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the entitlement.
     * </p>
     * 
     * @param name
     *        The name of the entitlement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEntitlementRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the stack with which the entitlement is associated.
     * </p>
     * 
     * @param stackName
     *        The name of the stack with which the entitlement is associated.
     */

    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    /**
     * <p>
     * The name of the stack with which the entitlement is associated.
     * </p>
     * 
     * @return The name of the stack with which the entitlement is associated.
     */

    public String getStackName() {
        return this.stackName;
    }

    /**
     * <p>
     * The name of the stack with which the entitlement is associated.
     * </p>
     * 
     * @param stackName
     *        The name of the stack with which the entitlement is associated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEntitlementRequest withStackName(String stackName) {
        setStackName(stackName);
        return this;
    }

    /**
     * <p>
     * The description of the entitlement.
     * </p>
     * 
     * @param description
     *        The description of the entitlement.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the entitlement.
     * </p>
     * 
     * @return The description of the entitlement.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the entitlement.
     * </p>
     * 
     * @param description
     *        The description of the entitlement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEntitlementRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Specifies whether all or only selected apps are entitled.
     * </p>
     * 
     * @param appVisibility
     *        Specifies whether all or only selected apps are entitled.
     * @see AppVisibility
     */

    public void setAppVisibility(String appVisibility) {
        this.appVisibility = appVisibility;
    }

    /**
     * <p>
     * Specifies whether all or only selected apps are entitled.
     * </p>
     * 
     * @return Specifies whether all or only selected apps are entitled.
     * @see AppVisibility
     */

    public String getAppVisibility() {
        return this.appVisibility;
    }

    /**
     * <p>
     * Specifies whether all or only selected apps are entitled.
     * </p>
     * 
     * @param appVisibility
     *        Specifies whether all or only selected apps are entitled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppVisibility
     */

    public UpdateEntitlementRequest withAppVisibility(String appVisibility) {
        setAppVisibility(appVisibility);
        return this;
    }

    /**
     * <p>
     * Specifies whether all or only selected apps are entitled.
     * </p>
     * 
     * @param appVisibility
     *        Specifies whether all or only selected apps are entitled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppVisibility
     */

    public UpdateEntitlementRequest withAppVisibility(AppVisibility appVisibility) {
        this.appVisibility = appVisibility.toString();
        return this;
    }

    /**
     * <p>
     * The attributes of the entitlement.
     * </p>
     * 
     * @return The attributes of the entitlement.
     */

    public java.util.List<EntitlementAttribute> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * The attributes of the entitlement.
     * </p>
     * 
     * @param attributes
     *        The attributes of the entitlement.
     */

    public void setAttributes(java.util.Collection<EntitlementAttribute> attributes) {
        if (attributes == null) {
            this.attributes = null;
            return;
        }

        this.attributes = new java.util.ArrayList<EntitlementAttribute>(attributes);
    }

    /**
     * <p>
     * The attributes of the entitlement.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributes(java.util.Collection)} or {@link #withAttributes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param attributes
     *        The attributes of the entitlement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEntitlementRequest withAttributes(EntitlementAttribute... attributes) {
        if (this.attributes == null) {
            setAttributes(new java.util.ArrayList<EntitlementAttribute>(attributes.length));
        }
        for (EntitlementAttribute ele : attributes) {
            this.attributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The attributes of the entitlement.
     * </p>
     * 
     * @param attributes
     *        The attributes of the entitlement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEntitlementRequest withAttributes(java.util.Collection<EntitlementAttribute> attributes) {
        setAttributes(attributes);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStackName() != null)
            sb.append("StackName: ").append(getStackName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getAppVisibility() != null)
            sb.append("AppVisibility: ").append(getAppVisibility()).append(",");
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateEntitlementRequest == false)
            return false;
        UpdateEntitlementRequest other = (UpdateEntitlementRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStackName() == null ^ this.getStackName() == null)
            return false;
        if (other.getStackName() != null && other.getStackName().equals(this.getStackName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getAppVisibility() == null ^ this.getAppVisibility() == null)
            return false;
        if (other.getAppVisibility() != null && other.getAppVisibility().equals(this.getAppVisibility()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStackName() == null) ? 0 : getStackName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getAppVisibility() == null) ? 0 : getAppVisibility().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        return hashCode;
    }

    @Override
    public UpdateEntitlementRequest clone() {
        return (UpdateEntitlementRequest) super.clone();
    }

}
