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
 * Contains information about an instance profile.
 * </p>
 * <p>
 * This data type is used as a response element in the following operations:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateInstanceProfile</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetInstanceProfile</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListInstanceProfiles</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListInstanceProfilesForRole</a>
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/InstanceProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceProfile implements Serializable, Cloneable {

    /**
     * <p>
     * The path to the instance profile. For more information about paths, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     * <i>Using IAM</i> guide.
     * </p>
     */
    private String path;
    /**
     * <p>
     * The name identifying the instance profile.
     * </p>
     */
    private String instanceProfileName;
    /**
     * <p>
     * The stable and unique string identifying the instance profile. For more information about IDs, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     * <i>Using IAM</i> guide.
     * </p>
     */
    private String instanceProfileId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) specifying the instance profile. For more information about ARNs and how to use
     * them in policies, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM
     * Identifiers</a> in the <i>Using IAM</i> guide.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The date when the instance profile was created.
     * </p>
     */
    private java.util.Date createDate;
    /**
     * <p>
     * The role associated with the instance profile.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Role> roles;

    /**
     * <p>
     * The path to the instance profile. For more information about paths, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     * <i>Using IAM</i> guide.
     * </p>
     * 
     * @param path
     *        The path to the instance profile. For more information about paths, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *        <i>Using IAM</i> guide.
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The path to the instance profile. For more information about paths, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     * <i>Using IAM</i> guide.
     * </p>
     * 
     * @return The path to the instance profile. For more information about paths, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *         <i>Using IAM</i> guide.
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The path to the instance profile. For more information about paths, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     * <i>Using IAM</i> guide.
     * </p>
     * 
     * @param path
     *        The path to the instance profile. For more information about paths, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *        <i>Using IAM</i> guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceProfile withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * The name identifying the instance profile.
     * </p>
     * 
     * @param instanceProfileName
     *        The name identifying the instance profile.
     */

    public void setInstanceProfileName(String instanceProfileName) {
        this.instanceProfileName = instanceProfileName;
    }

    /**
     * <p>
     * The name identifying the instance profile.
     * </p>
     * 
     * @return The name identifying the instance profile.
     */

    public String getInstanceProfileName() {
        return this.instanceProfileName;
    }

    /**
     * <p>
     * The name identifying the instance profile.
     * </p>
     * 
     * @param instanceProfileName
     *        The name identifying the instance profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceProfile withInstanceProfileName(String instanceProfileName) {
        setInstanceProfileName(instanceProfileName);
        return this;
    }

    /**
     * <p>
     * The stable and unique string identifying the instance profile. For more information about IDs, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     * <i>Using IAM</i> guide.
     * </p>
     * 
     * @param instanceProfileId
     *        The stable and unique string identifying the instance profile. For more information about IDs, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *        <i>Using IAM</i> guide.
     */

    public void setInstanceProfileId(String instanceProfileId) {
        this.instanceProfileId = instanceProfileId;
    }

    /**
     * <p>
     * The stable and unique string identifying the instance profile. For more information about IDs, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     * <i>Using IAM</i> guide.
     * </p>
     * 
     * @return The stable and unique string identifying the instance profile. For more information about IDs, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *         <i>Using IAM</i> guide.
     */

    public String getInstanceProfileId() {
        return this.instanceProfileId;
    }

    /**
     * <p>
     * The stable and unique string identifying the instance profile. For more information about IDs, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     * <i>Using IAM</i> guide.
     * </p>
     * 
     * @param instanceProfileId
     *        The stable and unique string identifying the instance profile. For more information about IDs, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *        <i>Using IAM</i> guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceProfile withInstanceProfileId(String instanceProfileId) {
        setInstanceProfileId(instanceProfileId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) specifying the instance profile. For more information about ARNs and how to use
     * them in policies, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM
     * Identifiers</a> in the <i>Using IAM</i> guide.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) specifying the instance profile. For more information about ARNs and how to
     *        use them in policies, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *        <i>Using IAM</i> guide.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) specifying the instance profile. For more information about ARNs and how to use
     * them in policies, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM
     * Identifiers</a> in the <i>Using IAM</i> guide.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) specifying the instance profile. For more information about ARNs and how
     *         to use them in policies, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *         <i>Using IAM</i> guide.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) specifying the instance profile. For more information about ARNs and how to use
     * them in policies, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM
     * Identifiers</a> in the <i>Using IAM</i> guide.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) specifying the instance profile. For more information about ARNs and how to
     *        use them in policies, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *        <i>Using IAM</i> guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceProfile withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The date when the instance profile was created.
     * </p>
     * 
     * @param createDate
     *        The date when the instance profile was created.
     */

    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * <p>
     * The date when the instance profile was created.
     * </p>
     * 
     * @return The date when the instance profile was created.
     */

    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * <p>
     * The date when the instance profile was created.
     * </p>
     * 
     * @param createDate
     *        The date when the instance profile was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceProfile withCreateDate(java.util.Date createDate) {
        setCreateDate(createDate);
        return this;
    }

    /**
     * <p>
     * The role associated with the instance profile.
     * </p>
     * 
     * @return The role associated with the instance profile.
     */

    public java.util.List<Role> getRoles() {
        if (roles == null) {
            roles = new com.amazonaws.internal.SdkInternalList<Role>();
        }
        return roles;
    }

    /**
     * <p>
     * The role associated with the instance profile.
     * </p>
     * 
     * @param roles
     *        The role associated with the instance profile.
     */

    public void setRoles(java.util.Collection<Role> roles) {
        if (roles == null) {
            this.roles = null;
            return;
        }

        this.roles = new com.amazonaws.internal.SdkInternalList<Role>(roles);
    }

    /**
     * <p>
     * The role associated with the instance profile.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRoles(java.util.Collection)} or {@link #withRoles(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param roles
     *        The role associated with the instance profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceProfile withRoles(Role... roles) {
        if (this.roles == null) {
            setRoles(new com.amazonaws.internal.SdkInternalList<Role>(roles.length));
        }
        for (Role ele : roles) {
            this.roles.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The role associated with the instance profile.
     * </p>
     * 
     * @param roles
     *        The role associated with the instance profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceProfile withRoles(java.util.Collection<Role> roles) {
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
        if (getPath() != null)
            sb.append("Path: ").append(getPath()).append(",");
        if (getInstanceProfileName() != null)
            sb.append("InstanceProfileName: ").append(getInstanceProfileName()).append(",");
        if (getInstanceProfileId() != null)
            sb.append("InstanceProfileId: ").append(getInstanceProfileId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreateDate() != null)
            sb.append("CreateDate: ").append(getCreateDate()).append(",");
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

        if (obj instanceof InstanceProfile == false)
            return false;
        InstanceProfile other = (InstanceProfile) obj;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getInstanceProfileName() == null ^ this.getInstanceProfileName() == null)
            return false;
        if (other.getInstanceProfileName() != null && other.getInstanceProfileName().equals(this.getInstanceProfileName()) == false)
            return false;
        if (other.getInstanceProfileId() == null ^ this.getInstanceProfileId() == null)
            return false;
        if (other.getInstanceProfileId() != null && other.getInstanceProfileId().equals(this.getInstanceProfileId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreateDate() == null ^ this.getCreateDate() == null)
            return false;
        if (other.getCreateDate() != null && other.getCreateDate().equals(this.getCreateDate()) == false)
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

        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getInstanceProfileName() == null) ? 0 : getInstanceProfileName().hashCode());
        hashCode = prime * hashCode + ((getInstanceProfileId() == null) ? 0 : getInstanceProfileId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        hashCode = prime * hashCode + ((getRoles() == null) ? 0 : getRoles().hashCode());
        return hashCode;
    }

    @Override
    public InstanceProfile clone() {
        try {
            return (InstanceProfile) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
