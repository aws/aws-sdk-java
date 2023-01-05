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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/GetPermissionsBoundaryForPermissionSet"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPermissionsBoundaryForPermissionSetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the IAM Identity Center instance under which the operation will be executed.
     * </p>
     */
    private String instanceArn;
    /**
     * <p>
     * The ARN of the <code>PermissionSet</code>.
     * </p>
     */
    private String permissionSetArn;

    /**
     * <p>
     * The ARN of the IAM Identity Center instance under which the operation will be executed.
     * </p>
     * 
     * @param instanceArn
     *        The ARN of the IAM Identity Center instance under which the operation will be executed.
     */

    public void setInstanceArn(String instanceArn) {
        this.instanceArn = instanceArn;
    }

    /**
     * <p>
     * The ARN of the IAM Identity Center instance under which the operation will be executed.
     * </p>
     * 
     * @return The ARN of the IAM Identity Center instance under which the operation will be executed.
     */

    public String getInstanceArn() {
        return this.instanceArn;
    }

    /**
     * <p>
     * The ARN of the IAM Identity Center instance under which the operation will be executed.
     * </p>
     * 
     * @param instanceArn
     *        The ARN of the IAM Identity Center instance under which the operation will be executed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPermissionsBoundaryForPermissionSetRequest withInstanceArn(String instanceArn) {
        setInstanceArn(instanceArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the <code>PermissionSet</code>.
     * </p>
     * 
     * @param permissionSetArn
     *        The ARN of the <code>PermissionSet</code>.
     */

    public void setPermissionSetArn(String permissionSetArn) {
        this.permissionSetArn = permissionSetArn;
    }

    /**
     * <p>
     * The ARN of the <code>PermissionSet</code>.
     * </p>
     * 
     * @return The ARN of the <code>PermissionSet</code>.
     */

    public String getPermissionSetArn() {
        return this.permissionSetArn;
    }

    /**
     * <p>
     * The ARN of the <code>PermissionSet</code>.
     * </p>
     * 
     * @param permissionSetArn
     *        The ARN of the <code>PermissionSet</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPermissionsBoundaryForPermissionSetRequest withPermissionSetArn(String permissionSetArn) {
        setPermissionSetArn(permissionSetArn);
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
            sb.append("PermissionSetArn: ").append(getPermissionSetArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPermissionsBoundaryForPermissionSetRequest == false)
            return false;
        GetPermissionsBoundaryForPermissionSetRequest other = (GetPermissionsBoundaryForPermissionSetRequest) obj;
        if (other.getInstanceArn() == null ^ this.getInstanceArn() == null)
            return false;
        if (other.getInstanceArn() != null && other.getInstanceArn().equals(this.getInstanceArn()) == false)
            return false;
        if (other.getPermissionSetArn() == null ^ this.getPermissionSetArn() == null)
            return false;
        if (other.getPermissionSetArn() != null && other.getPermissionSetArn().equals(this.getPermissionSetArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceArn() == null) ? 0 : getInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getPermissionSetArn() == null) ? 0 : getPermissionSetArn().hashCode());
        return hashCode;
    }

    @Override
    public GetPermissionsBoundaryForPermissionSetRequest clone() {
        return (GetPermissionsBoundaryForPermissionSetRequest) super.clone();
    }

}
