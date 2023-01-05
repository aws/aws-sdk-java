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
package com.amazonaws.services.ssoadmin.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the name and path of a customer managed policy. You must have an IAM policy that matches the name and path
 * in each AWS account where you want to deploy your permission set.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/CustomerManagedPolicyReference"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomerManagedPolicyReference implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the IAM policy that you have configured in each account where you want to deploy your permission set.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The path to the IAM policy that you have configured in each account where you want to deploy your permission set.
     * The default is <code>/</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-friendly-names"
     * >Friendly names and paths</a> in the <i>IAM User Guide</i>.
     * </p>
     */
    private String path;

    /**
     * <p>
     * The name of the IAM policy that you have configured in each account where you want to deploy your permission set.
     * </p>
     * 
     * @param name
     *        The name of the IAM policy that you have configured in each account where you want to deploy your
     *        permission set.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the IAM policy that you have configured in each account where you want to deploy your permission set.
     * </p>
     * 
     * @return The name of the IAM policy that you have configured in each account where you want to deploy your
     *         permission set.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the IAM policy that you have configured in each account where you want to deploy your permission set.
     * </p>
     * 
     * @param name
     *        The name of the IAM policy that you have configured in each account where you want to deploy your
     *        permission set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomerManagedPolicyReference withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The path to the IAM policy that you have configured in each account where you want to deploy your permission set.
     * The default is <code>/</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-friendly-names"
     * >Friendly names and paths</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param path
     *        The path to the IAM policy that you have configured in each account where you want to deploy your
     *        permission set. The default is <code>/</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-friendly-names"
     *        >Friendly names and paths</a> in the <i>IAM User Guide</i>.
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The path to the IAM policy that you have configured in each account where you want to deploy your permission set.
     * The default is <code>/</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-friendly-names"
     * >Friendly names and paths</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @return The path to the IAM policy that you have configured in each account where you want to deploy your
     *         permission set. The default is <code>/</code>. For more information, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-friendly-names"
     *         >Friendly names and paths</a> in the <i>IAM User Guide</i>.
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The path to the IAM policy that you have configured in each account where you want to deploy your permission set.
     * The default is <code>/</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-friendly-names"
     * >Friendly names and paths</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param path
     *        The path to the IAM policy that you have configured in each account where you want to deploy your
     *        permission set. The default is <code>/</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-friendly-names"
     *        >Friendly names and paths</a> in the <i>IAM User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomerManagedPolicyReference withPath(String path) {
        setPath(path);
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
        if (getPath() != null)
            sb.append("Path: ").append(getPath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomerManagedPolicyReference == false)
            return false;
        CustomerManagedPolicyReference other = (CustomerManagedPolicyReference) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        return hashCode;
    }

    @Override
    public CustomerManagedPolicyReference clone() {
        try {
            return (CustomerManagedPolicyReference) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssoadmin.model.transform.CustomerManagedPolicyReferenceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
