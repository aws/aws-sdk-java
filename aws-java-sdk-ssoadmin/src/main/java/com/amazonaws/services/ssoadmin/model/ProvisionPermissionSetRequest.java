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
package com.amazonaws.services.ssoadmin.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ProvisionPermissionSet" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProvisionPermissionSetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the SSO instance under which the operation will be executed. For more information about ARNs, see <a
     * href="/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and AWS Service
     * Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     */
    private String instanceArn;
    /**
     * <p>
     * The ARN of the permission set.
     * </p>
     */
    private String permissionSetArn;
    /**
     * <p>
     * TargetID is an AWS account identifier, typically a 10-12 digit string (For example, 123456789012).
     * </p>
     */
    private String targetId;
    /**
     * <p>
     * The entity type for which the assignment will be created.
     * </p>
     */
    private String targetType;

    /**
     * <p>
     * The ARN of the SSO instance under which the operation will be executed. For more information about ARNs, see <a
     * href="/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and AWS Service
     * Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param instanceArn
     *        The ARN of the SSO instance under which the operation will be executed. For more information about ARNs,
     *        see <a href="/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and AWS Service
     *        Namespaces</a> in the <i>AWS General Reference</i>.
     */

    public void setInstanceArn(String instanceArn) {
        this.instanceArn = instanceArn;
    }

    /**
     * <p>
     * The ARN of the SSO instance under which the operation will be executed. For more information about ARNs, see <a
     * href="/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and AWS Service
     * Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @return The ARN of the SSO instance under which the operation will be executed. For more information about ARNs,
     *         see <a href="/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and AWS
     *         Service Namespaces</a> in the <i>AWS General Reference</i>.
     */

    public String getInstanceArn() {
        return this.instanceArn;
    }

    /**
     * <p>
     * The ARN of the SSO instance under which the operation will be executed. For more information about ARNs, see <a
     * href="/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and AWS Service
     * Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param instanceArn
     *        The ARN of the SSO instance under which the operation will be executed. For more information about ARNs,
     *        see <a href="/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and AWS Service
     *        Namespaces</a> in the <i>AWS General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionPermissionSetRequest withInstanceArn(String instanceArn) {
        setInstanceArn(instanceArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the permission set.
     * </p>
     * 
     * @param permissionSetArn
     *        The ARN of the permission set.
     */

    public void setPermissionSetArn(String permissionSetArn) {
        this.permissionSetArn = permissionSetArn;
    }

    /**
     * <p>
     * The ARN of the permission set.
     * </p>
     * 
     * @return The ARN of the permission set.
     */

    public String getPermissionSetArn() {
        return this.permissionSetArn;
    }

    /**
     * <p>
     * The ARN of the permission set.
     * </p>
     * 
     * @param permissionSetArn
     *        The ARN of the permission set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionPermissionSetRequest withPermissionSetArn(String permissionSetArn) {
        setPermissionSetArn(permissionSetArn);
        return this;
    }

    /**
     * <p>
     * TargetID is an AWS account identifier, typically a 10-12 digit string (For example, 123456789012).
     * </p>
     * 
     * @param targetId
     *        TargetID is an AWS account identifier, typically a 10-12 digit string (For example, 123456789012).
     */

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    /**
     * <p>
     * TargetID is an AWS account identifier, typically a 10-12 digit string (For example, 123456789012).
     * </p>
     * 
     * @return TargetID is an AWS account identifier, typically a 10-12 digit string (For example, 123456789012).
     */

    public String getTargetId() {
        return this.targetId;
    }

    /**
     * <p>
     * TargetID is an AWS account identifier, typically a 10-12 digit string (For example, 123456789012).
     * </p>
     * 
     * @param targetId
     *        TargetID is an AWS account identifier, typically a 10-12 digit string (For example, 123456789012).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionPermissionSetRequest withTargetId(String targetId) {
        setTargetId(targetId);
        return this;
    }

    /**
     * <p>
     * The entity type for which the assignment will be created.
     * </p>
     * 
     * @param targetType
     *        The entity type for which the assignment will be created.
     * @see ProvisionTargetType
     */

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    /**
     * <p>
     * The entity type for which the assignment will be created.
     * </p>
     * 
     * @return The entity type for which the assignment will be created.
     * @see ProvisionTargetType
     */

    public String getTargetType() {
        return this.targetType;
    }

    /**
     * <p>
     * The entity type for which the assignment will be created.
     * </p>
     * 
     * @param targetType
     *        The entity type for which the assignment will be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProvisionTargetType
     */

    public ProvisionPermissionSetRequest withTargetType(String targetType) {
        setTargetType(targetType);
        return this;
    }

    /**
     * <p>
     * The entity type for which the assignment will be created.
     * </p>
     * 
     * @param targetType
     *        The entity type for which the assignment will be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProvisionTargetType
     */

    public ProvisionPermissionSetRequest withTargetType(ProvisionTargetType targetType) {
        this.targetType = targetType.toString();
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
        if (getInstanceArn() != null)
            sb.append("InstanceArn: ").append(getInstanceArn()).append(",");
        if (getPermissionSetArn() != null)
            sb.append("PermissionSetArn: ").append(getPermissionSetArn()).append(",");
        if (getTargetId() != null)
            sb.append("TargetId: ").append(getTargetId()).append(",");
        if (getTargetType() != null)
            sb.append("TargetType: ").append(getTargetType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProvisionPermissionSetRequest == false)
            return false;
        ProvisionPermissionSetRequest other = (ProvisionPermissionSetRequest) obj;
        if (other.getInstanceArn() == null ^ this.getInstanceArn() == null)
            return false;
        if (other.getInstanceArn() != null && other.getInstanceArn().equals(this.getInstanceArn()) == false)
            return false;
        if (other.getPermissionSetArn() == null ^ this.getPermissionSetArn() == null)
            return false;
        if (other.getPermissionSetArn() != null && other.getPermissionSetArn().equals(this.getPermissionSetArn()) == false)
            return false;
        if (other.getTargetId() == null ^ this.getTargetId() == null)
            return false;
        if (other.getTargetId() != null && other.getTargetId().equals(this.getTargetId()) == false)
            return false;
        if (other.getTargetType() == null ^ this.getTargetType() == null)
            return false;
        if (other.getTargetType() != null && other.getTargetType().equals(this.getTargetType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceArn() == null) ? 0 : getInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getPermissionSetArn() == null) ? 0 : getPermissionSetArn().hashCode());
        hashCode = prime * hashCode + ((getTargetId() == null) ? 0 : getTargetId().hashCode());
        hashCode = prime * hashCode + ((getTargetType() == null) ? 0 : getTargetType().hashCode());
        return hashCode;
    }

    @Override
    public ProvisionPermissionSetRequest clone() {
        return (ProvisionPermissionSetRequest) super.clone();
    }

}
