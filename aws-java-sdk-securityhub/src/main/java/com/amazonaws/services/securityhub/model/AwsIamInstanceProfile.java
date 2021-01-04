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
 * Information about an instance profile.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsIamInstanceProfile" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsIamInstanceProfile implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the instance profile.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * Indicates when the instance profile was created.
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
     * The identifier of the instance profile.
     * </p>
     */
    private String instanceProfileId;
    /**
     * <p>
     * The name of the instance profile.
     * </p>
     */
    private String instanceProfileName;
    /**
     * <p>
     * The path to the instance profile.
     * </p>
     */
    private String path;
    /**
     * <p>
     * The roles associated with the instance profile.
     * </p>
     */
    private java.util.List<AwsIamInstanceProfileRole> roles;

    /**
     * <p>
     * The ARN of the instance profile.
     * </p>
     * 
     * @param arn
     *        The ARN of the instance profile.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the instance profile.
     * </p>
     * 
     * @return The ARN of the instance profile.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the instance profile.
     * </p>
     * 
     * @param arn
     *        The ARN of the instance profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamInstanceProfile withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * Indicates when the instance profile was created.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param createDate
     *        Indicates when the instance profile was created.</p>
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
     * Indicates when the instance profile was created.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @return Indicates when the instance profile was created.</p>
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
     * Indicates when the instance profile was created.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param createDate
     *        Indicates when the instance profile was created.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamInstanceProfile withCreateDate(String createDate) {
        setCreateDate(createDate);
        return this;
    }

    /**
     * <p>
     * The identifier of the instance profile.
     * </p>
     * 
     * @param instanceProfileId
     *        The identifier of the instance profile.
     */

    public void setInstanceProfileId(String instanceProfileId) {
        this.instanceProfileId = instanceProfileId;
    }

    /**
     * <p>
     * The identifier of the instance profile.
     * </p>
     * 
     * @return The identifier of the instance profile.
     */

    public String getInstanceProfileId() {
        return this.instanceProfileId;
    }

    /**
     * <p>
     * The identifier of the instance profile.
     * </p>
     * 
     * @param instanceProfileId
     *        The identifier of the instance profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamInstanceProfile withInstanceProfileId(String instanceProfileId) {
        setInstanceProfileId(instanceProfileId);
        return this;
    }

    /**
     * <p>
     * The name of the instance profile.
     * </p>
     * 
     * @param instanceProfileName
     *        The name of the instance profile.
     */

    public void setInstanceProfileName(String instanceProfileName) {
        this.instanceProfileName = instanceProfileName;
    }

    /**
     * <p>
     * The name of the instance profile.
     * </p>
     * 
     * @return The name of the instance profile.
     */

    public String getInstanceProfileName() {
        return this.instanceProfileName;
    }

    /**
     * <p>
     * The name of the instance profile.
     * </p>
     * 
     * @param instanceProfileName
     *        The name of the instance profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamInstanceProfile withInstanceProfileName(String instanceProfileName) {
        setInstanceProfileName(instanceProfileName);
        return this;
    }

    /**
     * <p>
     * The path to the instance profile.
     * </p>
     * 
     * @param path
     *        The path to the instance profile.
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The path to the instance profile.
     * </p>
     * 
     * @return The path to the instance profile.
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The path to the instance profile.
     * </p>
     * 
     * @param path
     *        The path to the instance profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamInstanceProfile withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * The roles associated with the instance profile.
     * </p>
     * 
     * @return The roles associated with the instance profile.
     */

    public java.util.List<AwsIamInstanceProfileRole> getRoles() {
        return roles;
    }

    /**
     * <p>
     * The roles associated with the instance profile.
     * </p>
     * 
     * @param roles
     *        The roles associated with the instance profile.
     */

    public void setRoles(java.util.Collection<AwsIamInstanceProfileRole> roles) {
        if (roles == null) {
            this.roles = null;
            return;
        }

        this.roles = new java.util.ArrayList<AwsIamInstanceProfileRole>(roles);
    }

    /**
     * <p>
     * The roles associated with the instance profile.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRoles(java.util.Collection)} or {@link #withRoles(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param roles
     *        The roles associated with the instance profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamInstanceProfile withRoles(AwsIamInstanceProfileRole... roles) {
        if (this.roles == null) {
            setRoles(new java.util.ArrayList<AwsIamInstanceProfileRole>(roles.length));
        }
        for (AwsIamInstanceProfileRole ele : roles) {
            this.roles.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The roles associated with the instance profile.
     * </p>
     * 
     * @param roles
     *        The roles associated with the instance profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamInstanceProfile withRoles(java.util.Collection<AwsIamInstanceProfileRole> roles) {
        setRoles(roles);
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
        if (getCreateDate() != null)
            sb.append("CreateDate: ").append(getCreateDate()).append(",");
        if (getInstanceProfileId() != null)
            sb.append("InstanceProfileId: ").append(getInstanceProfileId()).append(",");
        if (getInstanceProfileName() != null)
            sb.append("InstanceProfileName: ").append(getInstanceProfileName()).append(",");
        if (getPath() != null)
            sb.append("Path: ").append(getPath()).append(",");
        if (getRoles() != null)
            sb.append("Roles: ").append(getRoles());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsIamInstanceProfile == false)
            return false;
        AwsIamInstanceProfile other = (AwsIamInstanceProfile) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreateDate() == null ^ this.getCreateDate() == null)
            return false;
        if (other.getCreateDate() != null && other.getCreateDate().equals(this.getCreateDate()) == false)
            return false;
        if (other.getInstanceProfileId() == null ^ this.getInstanceProfileId() == null)
            return false;
        if (other.getInstanceProfileId() != null && other.getInstanceProfileId().equals(this.getInstanceProfileId()) == false)
            return false;
        if (other.getInstanceProfileName() == null ^ this.getInstanceProfileName() == null)
            return false;
        if (other.getInstanceProfileName() != null && other.getInstanceProfileName().equals(this.getInstanceProfileName()) == false)
            return false;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getRoles() == null ^ this.getRoles() == null)
            return false;
        if (other.getRoles() != null && other.getRoles().equals(this.getRoles()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        hashCode = prime * hashCode + ((getInstanceProfileId() == null) ? 0 : getInstanceProfileId().hashCode());
        hashCode = prime * hashCode + ((getInstanceProfileName() == null) ? 0 : getInstanceProfileName().hashCode());
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getRoles() == null) ? 0 : getRoles().hashCode());
        return hashCode;
    }

    @Override
    public AwsIamInstanceProfile clone() {
        try {
            return (AwsIamInstanceProfile) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsIamInstanceProfileMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
