/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lakeformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/RegisterResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisterResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource that you want to register.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * Designates a trusted caller, an IAM principal, by registering this caller with the Data Catalog.
     * </p>
     */
    private Boolean useServiceLinkedRole;
    /**
     * <p>
     * The identifier for the role.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource that you want to register.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the resource that you want to register.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource that you want to register.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the resource that you want to register.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource that you want to register.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the resource that you want to register.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterResourceRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * Designates a trusted caller, an IAM principal, by registering this caller with the Data Catalog.
     * </p>
     * 
     * @param useServiceLinkedRole
     *        Designates a trusted caller, an IAM principal, by registering this caller with the Data Catalog.
     */

    public void setUseServiceLinkedRole(Boolean useServiceLinkedRole) {
        this.useServiceLinkedRole = useServiceLinkedRole;
    }

    /**
     * <p>
     * Designates a trusted caller, an IAM principal, by registering this caller with the Data Catalog.
     * </p>
     * 
     * @return Designates a trusted caller, an IAM principal, by registering this caller with the Data Catalog.
     */

    public Boolean getUseServiceLinkedRole() {
        return this.useServiceLinkedRole;
    }

    /**
     * <p>
     * Designates a trusted caller, an IAM principal, by registering this caller with the Data Catalog.
     * </p>
     * 
     * @param useServiceLinkedRole
     *        Designates a trusted caller, an IAM principal, by registering this caller with the Data Catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterResourceRequest withUseServiceLinkedRole(Boolean useServiceLinkedRole) {
        setUseServiceLinkedRole(useServiceLinkedRole);
        return this;
    }

    /**
     * <p>
     * Designates a trusted caller, an IAM principal, by registering this caller with the Data Catalog.
     * </p>
     * 
     * @return Designates a trusted caller, an IAM principal, by registering this caller with the Data Catalog.
     */

    public Boolean isUseServiceLinkedRole() {
        return this.useServiceLinkedRole;
    }

    /**
     * <p>
     * The identifier for the role.
     * </p>
     * 
     * @param roleArn
     *        The identifier for the role.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The identifier for the role.
     * </p>
     * 
     * @return The identifier for the role.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The identifier for the role.
     * </p>
     * 
     * @param roleArn
     *        The identifier for the role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterResourceRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getUseServiceLinkedRole() != null)
            sb.append("UseServiceLinkedRole: ").append(getUseServiceLinkedRole()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterResourceRequest == false)
            return false;
        RegisterResourceRequest other = (RegisterResourceRequest) obj;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getUseServiceLinkedRole() == null ^ this.getUseServiceLinkedRole() == null)
            return false;
        if (other.getUseServiceLinkedRole() != null && other.getUseServiceLinkedRole().equals(this.getUseServiceLinkedRole()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getUseServiceLinkedRole() == null) ? 0 : getUseServiceLinkedRole().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public RegisterResourceRequest clone() {
        return (RegisterResourceRequest) super.clone();
    }

}
