/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * Designates an Identity and Access Management (IAM) service-linked role by registering this role with the Data
     * Catalog. A service-linked role is a unique type of IAM role that is linked directly to Lake Formation.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/lake-formation/latest/dg/service-linked-roles.html">Using Service-Linked Roles
     * for Lake Formation</a>.
     * </p>
     */
    private Boolean useServiceLinkedRole;
    /**
     * <p>
     * The identifier for the role that registers the resource.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * Whether or not the resource is a federated resource.
     * </p>
     */
    private Boolean withFederation;
    /**
     * <p>
     * Specifies whether the data access of tables pointing to the location can be managed by both Lake Formation
     * permissions as well as Amazon S3 bucket policies.
     * </p>
     */
    private Boolean hybridAccessEnabled;

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
     * Designates an Identity and Access Management (IAM) service-linked role by registering this role with the Data
     * Catalog. A service-linked role is a unique type of IAM role that is linked directly to Lake Formation.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/lake-formation/latest/dg/service-linked-roles.html">Using Service-Linked Roles
     * for Lake Formation</a>.
     * </p>
     * 
     * @param useServiceLinkedRole
     *        Designates an Identity and Access Management (IAM) service-linked role by registering this role with the
     *        Data Catalog. A service-linked role is a unique type of IAM role that is linked directly to Lake
     *        Formation.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/lake-formation/latest/dg/service-linked-roles.html">Using Service-Linked
     *        Roles for Lake Formation</a>.
     */

    public void setUseServiceLinkedRole(Boolean useServiceLinkedRole) {
        this.useServiceLinkedRole = useServiceLinkedRole;
    }

    /**
     * <p>
     * Designates an Identity and Access Management (IAM) service-linked role by registering this role with the Data
     * Catalog. A service-linked role is a unique type of IAM role that is linked directly to Lake Formation.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/lake-formation/latest/dg/service-linked-roles.html">Using Service-Linked Roles
     * for Lake Formation</a>.
     * </p>
     * 
     * @return Designates an Identity and Access Management (IAM) service-linked role by registering this role with the
     *         Data Catalog. A service-linked role is a unique type of IAM role that is linked directly to Lake
     *         Formation.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/lake-formation/latest/dg/service-linked-roles.html">Using
     *         Service-Linked Roles for Lake Formation</a>.
     */

    public Boolean getUseServiceLinkedRole() {
        return this.useServiceLinkedRole;
    }

    /**
     * <p>
     * Designates an Identity and Access Management (IAM) service-linked role by registering this role with the Data
     * Catalog. A service-linked role is a unique type of IAM role that is linked directly to Lake Formation.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/lake-formation/latest/dg/service-linked-roles.html">Using Service-Linked Roles
     * for Lake Formation</a>.
     * </p>
     * 
     * @param useServiceLinkedRole
     *        Designates an Identity and Access Management (IAM) service-linked role by registering this role with the
     *        Data Catalog. A service-linked role is a unique type of IAM role that is linked directly to Lake
     *        Formation.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/lake-formation/latest/dg/service-linked-roles.html">Using Service-Linked
     *        Roles for Lake Formation</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterResourceRequest withUseServiceLinkedRole(Boolean useServiceLinkedRole) {
        setUseServiceLinkedRole(useServiceLinkedRole);
        return this;
    }

    /**
     * <p>
     * Designates an Identity and Access Management (IAM) service-linked role by registering this role with the Data
     * Catalog. A service-linked role is a unique type of IAM role that is linked directly to Lake Formation.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/lake-formation/latest/dg/service-linked-roles.html">Using Service-Linked Roles
     * for Lake Formation</a>.
     * </p>
     * 
     * @return Designates an Identity and Access Management (IAM) service-linked role by registering this role with the
     *         Data Catalog. A service-linked role is a unique type of IAM role that is linked directly to Lake
     *         Formation.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/lake-formation/latest/dg/service-linked-roles.html">Using
     *         Service-Linked Roles for Lake Formation</a>.
     */

    public Boolean isUseServiceLinkedRole() {
        return this.useServiceLinkedRole;
    }

    /**
     * <p>
     * The identifier for the role that registers the resource.
     * </p>
     * 
     * @param roleArn
     *        The identifier for the role that registers the resource.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The identifier for the role that registers the resource.
     * </p>
     * 
     * @return The identifier for the role that registers the resource.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The identifier for the role that registers the resource.
     * </p>
     * 
     * @param roleArn
     *        The identifier for the role that registers the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterResourceRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * Whether or not the resource is a federated resource.
     * </p>
     * 
     * @param withFederation
     *        Whether or not the resource is a federated resource.
     */

    public void setWithFederation(Boolean withFederation) {
        this.withFederation = withFederation;
    }

    /**
     * <p>
     * Whether or not the resource is a federated resource.
     * </p>
     * 
     * @return Whether or not the resource is a federated resource.
     */

    public Boolean getWithFederation() {
        return this.withFederation;
    }

    /**
     * <p>
     * Whether or not the resource is a federated resource.
     * </p>
     * 
     * @param withFederation
     *        Whether or not the resource is a federated resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterResourceRequest withWithFederation(Boolean withFederation) {
        setWithFederation(withFederation);
        return this;
    }

    /**
     * <p>
     * Whether or not the resource is a federated resource.
     * </p>
     * 
     * @return Whether or not the resource is a federated resource.
     */

    public Boolean isWithFederation() {
        return this.withFederation;
    }

    /**
     * <p>
     * Specifies whether the data access of tables pointing to the location can be managed by both Lake Formation
     * permissions as well as Amazon S3 bucket policies.
     * </p>
     * 
     * @param hybridAccessEnabled
     *        Specifies whether the data access of tables pointing to the location can be managed by both Lake Formation
     *        permissions as well as Amazon S3 bucket policies.
     */

    public void setHybridAccessEnabled(Boolean hybridAccessEnabled) {
        this.hybridAccessEnabled = hybridAccessEnabled;
    }

    /**
     * <p>
     * Specifies whether the data access of tables pointing to the location can be managed by both Lake Formation
     * permissions as well as Amazon S3 bucket policies.
     * </p>
     * 
     * @return Specifies whether the data access of tables pointing to the location can be managed by both Lake
     *         Formation permissions as well as Amazon S3 bucket policies.
     */

    public Boolean getHybridAccessEnabled() {
        return this.hybridAccessEnabled;
    }

    /**
     * <p>
     * Specifies whether the data access of tables pointing to the location can be managed by both Lake Formation
     * permissions as well as Amazon S3 bucket policies.
     * </p>
     * 
     * @param hybridAccessEnabled
     *        Specifies whether the data access of tables pointing to the location can be managed by both Lake Formation
     *        permissions as well as Amazon S3 bucket policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterResourceRequest withHybridAccessEnabled(Boolean hybridAccessEnabled) {
        setHybridAccessEnabled(hybridAccessEnabled);
        return this;
    }

    /**
     * <p>
     * Specifies whether the data access of tables pointing to the location can be managed by both Lake Formation
     * permissions as well as Amazon S3 bucket policies.
     * </p>
     * 
     * @return Specifies whether the data access of tables pointing to the location can be managed by both Lake
     *         Formation permissions as well as Amazon S3 bucket policies.
     */

    public Boolean isHybridAccessEnabled() {
        return this.hybridAccessEnabled;
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
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getWithFederation() != null)
            sb.append("WithFederation: ").append(getWithFederation()).append(",");
        if (getHybridAccessEnabled() != null)
            sb.append("HybridAccessEnabled: ").append(getHybridAccessEnabled());
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
        if (other.getWithFederation() == null ^ this.getWithFederation() == null)
            return false;
        if (other.getWithFederation() != null && other.getWithFederation().equals(this.getWithFederation()) == false)
            return false;
        if (other.getHybridAccessEnabled() == null ^ this.getHybridAccessEnabled() == null)
            return false;
        if (other.getHybridAccessEnabled() != null && other.getHybridAccessEnabled().equals(this.getHybridAccessEnabled()) == false)
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
        hashCode = prime * hashCode + ((getWithFederation() == null) ? 0 : getWithFederation().hashCode());
        hashCode = prime * hashCode + ((getHybridAccessEnabled() == null) ? 0 : getHybridAccessEnabled().hashCode());
        return hashCode;
    }

    @Override
    public RegisterResourceRequest clone() {
        return (RegisterResourceRequest) super.clone();
    }

}
