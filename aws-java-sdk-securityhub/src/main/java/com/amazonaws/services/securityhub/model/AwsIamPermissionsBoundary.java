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
 * Information about the policy used to set the permissions boundary for an IAM principal.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsIamPermissionsBoundary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsIamPermissionsBoundary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the policy used to set the permissions boundary.
     * </p>
     */
    private String permissionsBoundaryArn;
    /**
     * <p>
     * The usage type for the permissions boundary.
     * </p>
     */
    private String permissionsBoundaryType;

    /**
     * <p>
     * The ARN of the policy used to set the permissions boundary.
     * </p>
     * 
     * @param permissionsBoundaryArn
     *        The ARN of the policy used to set the permissions boundary.
     */

    public void setPermissionsBoundaryArn(String permissionsBoundaryArn) {
        this.permissionsBoundaryArn = permissionsBoundaryArn;
    }

    /**
     * <p>
     * The ARN of the policy used to set the permissions boundary.
     * </p>
     * 
     * @return The ARN of the policy used to set the permissions boundary.
     */

    public String getPermissionsBoundaryArn() {
        return this.permissionsBoundaryArn;
    }

    /**
     * <p>
     * The ARN of the policy used to set the permissions boundary.
     * </p>
     * 
     * @param permissionsBoundaryArn
     *        The ARN of the policy used to set the permissions boundary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamPermissionsBoundary withPermissionsBoundaryArn(String permissionsBoundaryArn) {
        setPermissionsBoundaryArn(permissionsBoundaryArn);
        return this;
    }

    /**
     * <p>
     * The usage type for the permissions boundary.
     * </p>
     * 
     * @param permissionsBoundaryType
     *        The usage type for the permissions boundary.
     */

    public void setPermissionsBoundaryType(String permissionsBoundaryType) {
        this.permissionsBoundaryType = permissionsBoundaryType;
    }

    /**
     * <p>
     * The usage type for the permissions boundary.
     * </p>
     * 
     * @return The usage type for the permissions boundary.
     */

    public String getPermissionsBoundaryType() {
        return this.permissionsBoundaryType;
    }

    /**
     * <p>
     * The usage type for the permissions boundary.
     * </p>
     * 
     * @param permissionsBoundaryType
     *        The usage type for the permissions boundary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamPermissionsBoundary withPermissionsBoundaryType(String permissionsBoundaryType) {
        setPermissionsBoundaryType(permissionsBoundaryType);
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
        if (getPermissionsBoundaryArn() != null)
            sb.append("PermissionsBoundaryArn: ").append(getPermissionsBoundaryArn()).append(",");
        if (getPermissionsBoundaryType() != null)
            sb.append("PermissionsBoundaryType: ").append(getPermissionsBoundaryType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsIamPermissionsBoundary == false)
            return false;
        AwsIamPermissionsBoundary other = (AwsIamPermissionsBoundary) obj;
        if (other.getPermissionsBoundaryArn() == null ^ this.getPermissionsBoundaryArn() == null)
            return false;
        if (other.getPermissionsBoundaryArn() != null && other.getPermissionsBoundaryArn().equals(this.getPermissionsBoundaryArn()) == false)
            return false;
        if (other.getPermissionsBoundaryType() == null ^ this.getPermissionsBoundaryType() == null)
            return false;
        if (other.getPermissionsBoundaryType() != null && other.getPermissionsBoundaryType().equals(this.getPermissionsBoundaryType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPermissionsBoundaryArn() == null) ? 0 : getPermissionsBoundaryArn().hashCode());
        hashCode = prime * hashCode + ((getPermissionsBoundaryType() == null) ? 0 : getPermissionsBoundaryType().hashCode());
        return hashCode;
    }

    @Override
    public AwsIamPermissionsBoundary clone() {
        try {
            return (AwsIamPermissionsBoundary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsIamPermissionsBoundaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
