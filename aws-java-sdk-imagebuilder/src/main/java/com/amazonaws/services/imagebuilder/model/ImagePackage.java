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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a package installed on an Image Builder image.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ImagePackage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImagePackage implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the package as reported to the operating system package manager.
     * </p>
     */
    private String packageName;
    /**
     * <p>
     * The version of the package as reported to the operating system package manager.
     * </p>
     */
    private String packageVersion;

    /**
     * <p>
     * The name of the package as reported to the operating system package manager.
     * </p>
     * 
     * @param packageName
     *        The name of the package as reported to the operating system package manager.
     */

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    /**
     * <p>
     * The name of the package as reported to the operating system package manager.
     * </p>
     * 
     * @return The name of the package as reported to the operating system package manager.
     */

    public String getPackageName() {
        return this.packageName;
    }

    /**
     * <p>
     * The name of the package as reported to the operating system package manager.
     * </p>
     * 
     * @param packageName
     *        The name of the package as reported to the operating system package manager.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImagePackage withPackageName(String packageName) {
        setPackageName(packageName);
        return this;
    }

    /**
     * <p>
     * The version of the package as reported to the operating system package manager.
     * </p>
     * 
     * @param packageVersion
     *        The version of the package as reported to the operating system package manager.
     */

    public void setPackageVersion(String packageVersion) {
        this.packageVersion = packageVersion;
    }

    /**
     * <p>
     * The version of the package as reported to the operating system package manager.
     * </p>
     * 
     * @return The version of the package as reported to the operating system package manager.
     */

    public String getPackageVersion() {
        return this.packageVersion;
    }

    /**
     * <p>
     * The version of the package as reported to the operating system package manager.
     * </p>
     * 
     * @param packageVersion
     *        The version of the package as reported to the operating system package manager.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImagePackage withPackageVersion(String packageVersion) {
        setPackageVersion(packageVersion);
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
        if (getPackageName() != null)
            sb.append("PackageName: ").append(getPackageName()).append(",");
        if (getPackageVersion() != null)
            sb.append("PackageVersion: ").append(getPackageVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImagePackage == false)
            return false;
        ImagePackage other = (ImagePackage) obj;
        if (other.getPackageName() == null ^ this.getPackageName() == null)
            return false;
        if (other.getPackageName() != null && other.getPackageName().equals(this.getPackageName()) == false)
            return false;
        if (other.getPackageVersion() == null ^ this.getPackageVersion() == null)
            return false;
        if (other.getPackageVersion() != null && other.getPackageVersion().equals(this.getPackageVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPackageName() == null) ? 0 : getPackageName().hashCode());
        hashCode = prime * hashCode + ((getPackageVersion() == null) ? 0 : getPackageVersion().hashCode());
        return hashCode;
    }

    @Override
    public ImagePackage clone() {
        try {
            return (ImagePackage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.imagebuilder.model.transform.ImagePackageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
