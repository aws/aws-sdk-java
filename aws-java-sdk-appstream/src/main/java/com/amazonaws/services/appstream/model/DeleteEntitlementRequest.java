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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DeleteEntitlement" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteEntitlementRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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

    public DeleteEntitlementRequest withName(String name) {
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

    public DeleteEntitlementRequest withStackName(String stackName) {
        setStackName(stackName);
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
            sb.append("StackName: ").append(getStackName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteEntitlementRequest == false)
            return false;
        DeleteEntitlementRequest other = (DeleteEntitlementRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStackName() == null ^ this.getStackName() == null)
            return false;
        if (other.getStackName() != null && other.getStackName().equals(this.getStackName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStackName() == null) ? 0 : getStackName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteEntitlementRequest clone() {
        return (DeleteEntitlementRequest) super.clone();
    }

}
