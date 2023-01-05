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
package com.amazonaws.services.ram.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/GetPermission" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPermissionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure
     * Name (ARN)</a> of the permission whose contents you want to retrieve. To find the ARN for a permission, use
     * either the <a>ListPermissions</a> operation or go to the <a
     * href="https://console.aws.amazon.com/ram/home#Permissions:">Permissions library</a> page in the RAM console and
     * then choose the name of the permission. The ARN is displayed on the detail page.
     * </p>
     */
    private String permissionArn;
    /**
     * <p>
     * Specifies identifier for the version of the RAM permission to retrieve. If you don't specify this parameter, the
     * operation retrieves the default version.
     * </p>
     */
    private Integer permissionVersion;

    /**
     * <p>
     * Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure
     * Name (ARN)</a> of the permission whose contents you want to retrieve. To find the ARN for a permission, use
     * either the <a>ListPermissions</a> operation or go to the <a
     * href="https://console.aws.amazon.com/ram/home#Permissions:">Permissions library</a> page in the RAM console and
     * then choose the name of the permission. The ARN is displayed on the detail page.
     * </p>
     * 
     * @param permissionArn
     *        Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *        Resoure Name (ARN)</a> of the permission whose contents you want to retrieve. To find the ARN for a
     *        permission, use either the <a>ListPermissions</a> operation or go to the <a
     *        href="https://console.aws.amazon.com/ram/home#Permissions:">Permissions library</a> page in the RAM
     *        console and then choose the name of the permission. The ARN is displayed on the detail page.
     */

    public void setPermissionArn(String permissionArn) {
        this.permissionArn = permissionArn;
    }

    /**
     * <p>
     * Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure
     * Name (ARN)</a> of the permission whose contents you want to retrieve. To find the ARN for a permission, use
     * either the <a>ListPermissions</a> operation or go to the <a
     * href="https://console.aws.amazon.com/ram/home#Permissions:">Permissions library</a> page in the RAM console and
     * then choose the name of the permission. The ARN is displayed on the detail page.
     * </p>
     * 
     * @return Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *         Resoure Name (ARN)</a> of the permission whose contents you want to retrieve. To find the ARN for a
     *         permission, use either the <a>ListPermissions</a> operation or go to the <a
     *         href="https://console.aws.amazon.com/ram/home#Permissions:">Permissions library</a> page in the RAM
     *         console and then choose the name of the permission. The ARN is displayed on the detail page.
     */

    public String getPermissionArn() {
        return this.permissionArn;
    }

    /**
     * <p>
     * Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure
     * Name (ARN)</a> of the permission whose contents you want to retrieve. To find the ARN for a permission, use
     * either the <a>ListPermissions</a> operation or go to the <a
     * href="https://console.aws.amazon.com/ram/home#Permissions:">Permissions library</a> page in the RAM console and
     * then choose the name of the permission. The ARN is displayed on the detail page.
     * </p>
     * 
     * @param permissionArn
     *        Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *        Resoure Name (ARN)</a> of the permission whose contents you want to retrieve. To find the ARN for a
     *        permission, use either the <a>ListPermissions</a> operation or go to the <a
     *        href="https://console.aws.amazon.com/ram/home#Permissions:">Permissions library</a> page in the RAM
     *        console and then choose the name of the permission. The ARN is displayed on the detail page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPermissionRequest withPermissionArn(String permissionArn) {
        setPermissionArn(permissionArn);
        return this;
    }

    /**
     * <p>
     * Specifies identifier for the version of the RAM permission to retrieve. If you don't specify this parameter, the
     * operation retrieves the default version.
     * </p>
     * 
     * @param permissionVersion
     *        Specifies identifier for the version of the RAM permission to retrieve. If you don't specify this
     *        parameter, the operation retrieves the default version.
     */

    public void setPermissionVersion(Integer permissionVersion) {
        this.permissionVersion = permissionVersion;
    }

    /**
     * <p>
     * Specifies identifier for the version of the RAM permission to retrieve. If you don't specify this parameter, the
     * operation retrieves the default version.
     * </p>
     * 
     * @return Specifies identifier for the version of the RAM permission to retrieve. If you don't specify this
     *         parameter, the operation retrieves the default version.
     */

    public Integer getPermissionVersion() {
        return this.permissionVersion;
    }

    /**
     * <p>
     * Specifies identifier for the version of the RAM permission to retrieve. If you don't specify this parameter, the
     * operation retrieves the default version.
     * </p>
     * 
     * @param permissionVersion
     *        Specifies identifier for the version of the RAM permission to retrieve. If you don't specify this
     *        parameter, the operation retrieves the default version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPermissionRequest withPermissionVersion(Integer permissionVersion) {
        setPermissionVersion(permissionVersion);
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
        if (getPermissionArn() != null)
            sb.append("PermissionArn: ").append(getPermissionArn()).append(",");
        if (getPermissionVersion() != null)
            sb.append("PermissionVersion: ").append(getPermissionVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPermissionRequest == false)
            return false;
        GetPermissionRequest other = (GetPermissionRequest) obj;
        if (other.getPermissionArn() == null ^ this.getPermissionArn() == null)
            return false;
        if (other.getPermissionArn() != null && other.getPermissionArn().equals(this.getPermissionArn()) == false)
            return false;
        if (other.getPermissionVersion() == null ^ this.getPermissionVersion() == null)
            return false;
        if (other.getPermissionVersion() != null && other.getPermissionVersion().equals(this.getPermissionVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPermissionArn() == null) ? 0 : getPermissionArn().hashCode());
        hashCode = prime * hashCode + ((getPermissionVersion() == null) ? 0 : getPermissionVersion().hashCode());
        return hashCode;
    }

    @Override
    public GetPermissionRequest clone() {
        return (GetPermissionRequest) super.clone();
    }

}
