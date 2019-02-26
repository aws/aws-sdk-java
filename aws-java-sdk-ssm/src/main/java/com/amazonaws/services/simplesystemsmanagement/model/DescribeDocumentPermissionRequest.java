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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeDocumentPermission" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDocumentPermissionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the document for which you are the owner.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The permission type for the document. The permission type can be <i>Share</i>.
     * </p>
     */
    private String permissionType;

    /**
     * <p>
     * The name of the document for which you are the owner.
     * </p>
     * 
     * @param name
     *        The name of the document for which you are the owner.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the document for which you are the owner.
     * </p>
     * 
     * @return The name of the document for which you are the owner.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the document for which you are the owner.
     * </p>
     * 
     * @param name
     *        The name of the document for which you are the owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDocumentPermissionRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The permission type for the document. The permission type can be <i>Share</i>.
     * </p>
     * 
     * @param permissionType
     *        The permission type for the document. The permission type can be <i>Share</i>.
     * @see DocumentPermissionType
     */

    public void setPermissionType(String permissionType) {
        this.permissionType = permissionType;
    }

    /**
     * <p>
     * The permission type for the document. The permission type can be <i>Share</i>.
     * </p>
     * 
     * @return The permission type for the document. The permission type can be <i>Share</i>.
     * @see DocumentPermissionType
     */

    public String getPermissionType() {
        return this.permissionType;
    }

    /**
     * <p>
     * The permission type for the document. The permission type can be <i>Share</i>.
     * </p>
     * 
     * @param permissionType
     *        The permission type for the document. The permission type can be <i>Share</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentPermissionType
     */

    public DescribeDocumentPermissionRequest withPermissionType(String permissionType) {
        setPermissionType(permissionType);
        return this;
    }

    /**
     * <p>
     * The permission type for the document. The permission type can be <i>Share</i>.
     * </p>
     * 
     * @param permissionType
     *        The permission type for the document. The permission type can be <i>Share</i>.
     * @see DocumentPermissionType
     */

    public void setPermissionType(DocumentPermissionType permissionType) {
        withPermissionType(permissionType);
    }

    /**
     * <p>
     * The permission type for the document. The permission type can be <i>Share</i>.
     * </p>
     * 
     * @param permissionType
     *        The permission type for the document. The permission type can be <i>Share</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentPermissionType
     */

    public DescribeDocumentPermissionRequest withPermissionType(DocumentPermissionType permissionType) {
        this.permissionType = permissionType.toString();
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
        if (getPermissionType() != null)
            sb.append("PermissionType: ").append(getPermissionType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDocumentPermissionRequest == false)
            return false;
        DescribeDocumentPermissionRequest other = (DescribeDocumentPermissionRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPermissionType() == null ^ this.getPermissionType() == null)
            return false;
        if (other.getPermissionType() != null && other.getPermissionType().equals(this.getPermissionType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPermissionType() == null) ? 0 : getPermissionType().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDocumentPermissionRequest clone() {
        return (DescribeDocumentPermissionRequest) super.clone();
    }

}
