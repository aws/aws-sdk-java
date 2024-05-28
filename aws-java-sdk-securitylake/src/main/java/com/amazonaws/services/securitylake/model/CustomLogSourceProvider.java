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
package com.amazonaws.services.securitylake.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of the log provider for a third-party custom source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/CustomLogSourceProvider"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomLogSourceProvider implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The location of the partition in the Amazon S3 bucket for Security Lake.
     * </p>
     */
    private String location;
    /**
     * <p>
     * The ARN of the IAM role to be used by the entity putting logs into your custom source partition. Security Lake
     * will apply the correct access policies to this role, but you must first manually create the trust policy for this
     * role. The IAM role name must start with the text 'Security Lake'. The IAM role must trust the
     * <code>logProviderAccountId</code> to assume the role.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The location of the partition in the Amazon S3 bucket for Security Lake.
     * </p>
     * 
     * @param location
     *        The location of the partition in the Amazon S3 bucket for Security Lake.
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * The location of the partition in the Amazon S3 bucket for Security Lake.
     * </p>
     * 
     * @return The location of the partition in the Amazon S3 bucket for Security Lake.
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The location of the partition in the Amazon S3 bucket for Security Lake.
     * </p>
     * 
     * @param location
     *        The location of the partition in the Amazon S3 bucket for Security Lake.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomLogSourceProvider withLocation(String location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM role to be used by the entity putting logs into your custom source partition. Security Lake
     * will apply the correct access policies to this role, but you must first manually create the trust policy for this
     * role. The IAM role name must start with the text 'Security Lake'. The IAM role must trust the
     * <code>logProviderAccountId</code> to assume the role.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the IAM role to be used by the entity putting logs into your custom source partition. Security
     *        Lake will apply the correct access policies to this role, but you must first manually create the trust
     *        policy for this role. The IAM role name must start with the text 'Security Lake'. The IAM role must trust
     *        the <code>logProviderAccountId</code> to assume the role.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role to be used by the entity putting logs into your custom source partition. Security Lake
     * will apply the correct access policies to this role, but you must first manually create the trust policy for this
     * role. The IAM role name must start with the text 'Security Lake'. The IAM role must trust the
     * <code>logProviderAccountId</code> to assume the role.
     * </p>
     * 
     * @return The ARN of the IAM role to be used by the entity putting logs into your custom source partition. Security
     *         Lake will apply the correct access policies to this role, but you must first manually create the trust
     *         policy for this role. The IAM role name must start with the text 'Security Lake'. The IAM role must trust
     *         the <code>logProviderAccountId</code> to assume the role.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role to be used by the entity putting logs into your custom source partition. Security Lake
     * will apply the correct access policies to this role, but you must first manually create the trust policy for this
     * role. The IAM role name must start with the text 'Security Lake'. The IAM role must trust the
     * <code>logProviderAccountId</code> to assume the role.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the IAM role to be used by the entity putting logs into your custom source partition. Security
     *        Lake will apply the correct access policies to this role, but you must first manually create the trust
     *        policy for this role. The IAM role name must start with the text 'Security Lake'. The IAM role must trust
     *        the <code>logProviderAccountId</code> to assume the role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomLogSourceProvider withRoleArn(String roleArn) {
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
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
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

        if (obj instanceof CustomLogSourceProvider == false)
            return false;
        CustomLogSourceProvider other = (CustomLogSourceProvider) obj;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
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

        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public CustomLogSourceProvider clone() {
        try {
            return (CustomLogSourceProvider) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securitylake.model.transform.CustomLogSourceProviderMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
