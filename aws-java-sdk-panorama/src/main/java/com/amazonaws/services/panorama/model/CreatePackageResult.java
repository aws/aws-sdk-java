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
package com.amazonaws.services.panorama.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/CreatePackage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePackageResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The package's ARN.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The package's ID.
     * </p>
     */
    private String packageId;
    /**
     * <p>
     * The package's storage location.
     * </p>
     */
    private StorageLocation storageLocation;

    /**
     * <p>
     * The package's ARN.
     * </p>
     * 
     * @param arn
     *        The package's ARN.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The package's ARN.
     * </p>
     * 
     * @return The package's ARN.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The package's ARN.
     * </p>
     * 
     * @param arn
     *        The package's ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePackageResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The package's ID.
     * </p>
     * 
     * @param packageId
     *        The package's ID.
     */

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    /**
     * <p>
     * The package's ID.
     * </p>
     * 
     * @return The package's ID.
     */

    public String getPackageId() {
        return this.packageId;
    }

    /**
     * <p>
     * The package's ID.
     * </p>
     * 
     * @param packageId
     *        The package's ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePackageResult withPackageId(String packageId) {
        setPackageId(packageId);
        return this;
    }

    /**
     * <p>
     * The package's storage location.
     * </p>
     * 
     * @param storageLocation
     *        The package's storage location.
     */

    public void setStorageLocation(StorageLocation storageLocation) {
        this.storageLocation = storageLocation;
    }

    /**
     * <p>
     * The package's storage location.
     * </p>
     * 
     * @return The package's storage location.
     */

    public StorageLocation getStorageLocation() {
        return this.storageLocation;
    }

    /**
     * <p>
     * The package's storage location.
     * </p>
     * 
     * @param storageLocation
     *        The package's storage location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePackageResult withStorageLocation(StorageLocation storageLocation) {
        setStorageLocation(storageLocation);
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
        if (getPackageId() != null)
            sb.append("PackageId: ").append(getPackageId()).append(",");
        if (getStorageLocation() != null)
            sb.append("StorageLocation: ").append(getStorageLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePackageResult == false)
            return false;
        CreatePackageResult other = (CreatePackageResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getPackageId() == null ^ this.getPackageId() == null)
            return false;
        if (other.getPackageId() != null && other.getPackageId().equals(this.getPackageId()) == false)
            return false;
        if (other.getStorageLocation() == null ^ this.getStorageLocation() == null)
            return false;
        if (other.getStorageLocation() != null && other.getStorageLocation().equals(this.getStorageLocation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getPackageId() == null) ? 0 : getPackageId().hashCode());
        hashCode = prime * hashCode + ((getStorageLocation() == null) ? 0 : getStorageLocation().hashCode());
        return hashCode;
    }

    @Override
    public CreatePackageResult clone() {
        try {
            return (CreatePackageResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
