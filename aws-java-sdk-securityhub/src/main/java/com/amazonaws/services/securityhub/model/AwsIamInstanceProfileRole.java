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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a role associated with an instance profile.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsIamInstanceProfileRole"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsIamInstanceProfileRole implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the role.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The policy that grants an entity permission to assume the role.
     * </p>
     */
    private String assumeRolePolicyDocument;
    /**
     * <p>
     * Indicates when the role was created.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     */
    private String createDate;
    /**
     * <p>
     * The path to the role.
     * </p>
     */
    private String path;
    /**
     * <p>
     * The identifier of the role.
     * </p>
     */
    private String roleId;
    /**
     * <p>
     * The name of the role.
     * </p>
     */
    private String roleName;

    /**
     * <p>
     * The ARN of the role.
     * </p>
     * 
     * @param arn
     *        The ARN of the role.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the role.
     * </p>
     * 
     * @return The ARN of the role.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the role.
     * </p>
     * 
     * @param arn
     *        The ARN of the role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamInstanceProfileRole withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The policy that grants an entity permission to assume the role.
     * </p>
     * 
     * @param assumeRolePolicyDocument
     *        The policy that grants an entity permission to assume the role.
     */

    public void setAssumeRolePolicyDocument(String assumeRolePolicyDocument) {
        this.assumeRolePolicyDocument = assumeRolePolicyDocument;
    }

    /**
     * <p>
     * The policy that grants an entity permission to assume the role.
     * </p>
     * 
     * @return The policy that grants an entity permission to assume the role.
     */

    public String getAssumeRolePolicyDocument() {
        return this.assumeRolePolicyDocument;
    }

    /**
     * <p>
     * The policy that grants an entity permission to assume the role.
     * </p>
     * 
     * @param assumeRolePolicyDocument
     *        The policy that grants an entity permission to assume the role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamInstanceProfileRole withAssumeRolePolicyDocument(String assumeRolePolicyDocument) {
        setAssumeRolePolicyDocument(assumeRolePolicyDocument);
        return this;
    }

    /**
     * <p>
     * Indicates when the role was created.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param createDate
     *        Indicates when the role was created.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    /**
     * <p>
     * Indicates when the role was created.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @return Indicates when the role was created.</p>
     *         <p>
     *         Uses the <code>date-time</code> format specified in <a
     *         href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *         Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public String getCreateDate() {
        return this.createDate;
    }

    /**
     * <p>
     * Indicates when the role was created.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param createDate
     *        Indicates when the role was created.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamInstanceProfileRole withCreateDate(String createDate) {
        setCreateDate(createDate);
        return this;
    }

    /**
     * <p>
     * The path to the role.
     * </p>
     * 
     * @param path
     *        The path to the role.
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The path to the role.
     * </p>
     * 
     * @return The path to the role.
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The path to the role.
     * </p>
     * 
     * @param path
     *        The path to the role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamInstanceProfileRole withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * The identifier of the role.
     * </p>
     * 
     * @param roleId
     *        The identifier of the role.
     */

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    /**
     * <p>
     * The identifier of the role.
     * </p>
     * 
     * @return The identifier of the role.
     */

    public String getRoleId() {
        return this.roleId;
    }

    /**
     * <p>
     * The identifier of the role.
     * </p>
     * 
     * @param roleId
     *        The identifier of the role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamInstanceProfileRole withRoleId(String roleId) {
        setRoleId(roleId);
        return this;
    }

    /**
     * <p>
     * The name of the role.
     * </p>
     * 
     * @param roleName
     *        The name of the role.
     */

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * <p>
     * The name of the role.
     * </p>
     * 
     * @return The name of the role.
     */

    public String getRoleName() {
        return this.roleName;
    }

    /**
     * <p>
     * The name of the role.
     * </p>
     * 
     * @param roleName
     *        The name of the role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamInstanceProfileRole withRoleName(String roleName) {
        setRoleName(roleName);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getAssumeRolePolicyDocument() != null)
            sb.append("AssumeRolePolicyDocument: ").append(getAssumeRolePolicyDocument()).append(",");
        if (getCreateDate() != null)
            sb.append("CreateDate: ").append(getCreateDate()).append(",");
        if (getPath() != null)
            sb.append("Path: ").append(getPath()).append(",");
        if (getRoleId() != null)
            sb.append("RoleId: ").append(getRoleId()).append(",");
        if (getRoleName() != null)
            sb.append("RoleName: ").append(getRoleName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsIamInstanceProfileRole == false)
            return false;
        AwsIamInstanceProfileRole other = (AwsIamInstanceProfileRole) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getAssumeRolePolicyDocument() == null ^ this.getAssumeRolePolicyDocument() == null)
            return false;
        if (other.getAssumeRolePolicyDocument() != null && other.getAssumeRolePolicyDocument().equals(this.getAssumeRolePolicyDocument()) == false)
            return false;
        if (other.getCreateDate() == null ^ this.getCreateDate() == null)
            return false;
        if (other.getCreateDate() != null && other.getCreateDate().equals(this.getCreateDate()) == false)
            return false;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getRoleId() == null ^ this.getRoleId() == null)
            return false;
        if (other.getRoleId() != null && other.getRoleId().equals(this.getRoleId()) == false)
            return false;
        if (other.getRoleName() == null ^ this.getRoleName() == null)
            return false;
        if (other.getRoleName() != null && other.getRoleName().equals(this.getRoleName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getAssumeRolePolicyDocument() == null) ? 0 : getAssumeRolePolicyDocument().hashCode());
        hashCode = prime * hashCode + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        hashCode = prime * hashCode + ((getRoleName() == null) ? 0 : getRoleName().hashCode());
        return hashCode;
    }

    @Override
    public AwsIamInstanceProfileRole clone() {
        try {
            return (AwsIamInstanceProfileRole) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsIamInstanceProfileRoleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
