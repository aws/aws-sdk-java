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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/DeletePackage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeletePackageRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Delete the package even if it has artifacts stored in its access point. Deletes the package's artifacts from
     * Amazon S3.
     * </p>
     */
    private Boolean forceDelete;
    /**
     * <p>
     * The package's ID.
     * </p>
     */
    private String packageId;

    /**
     * <p>
     * Delete the package even if it has artifacts stored in its access point. Deletes the package's artifacts from
     * Amazon S3.
     * </p>
     * 
     * @param forceDelete
     *        Delete the package even if it has artifacts stored in its access point. Deletes the package's artifacts
     *        from Amazon S3.
     */

    public void setForceDelete(Boolean forceDelete) {
        this.forceDelete = forceDelete;
    }

    /**
     * <p>
     * Delete the package even if it has artifacts stored in its access point. Deletes the package's artifacts from
     * Amazon S3.
     * </p>
     * 
     * @return Delete the package even if it has artifacts stored in its access point. Deletes the package's artifacts
     *         from Amazon S3.
     */

    public Boolean getForceDelete() {
        return this.forceDelete;
    }

    /**
     * <p>
     * Delete the package even if it has artifacts stored in its access point. Deletes the package's artifacts from
     * Amazon S3.
     * </p>
     * 
     * @param forceDelete
     *        Delete the package even if it has artifacts stored in its access point. Deletes the package's artifacts
     *        from Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeletePackageRequest withForceDelete(Boolean forceDelete) {
        setForceDelete(forceDelete);
        return this;
    }

    /**
     * <p>
     * Delete the package even if it has artifacts stored in its access point. Deletes the package's artifacts from
     * Amazon S3.
     * </p>
     * 
     * @return Delete the package even if it has artifacts stored in its access point. Deletes the package's artifacts
     *         from Amazon S3.
     */

    public Boolean isForceDelete() {
        return this.forceDelete;
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

    public DeletePackageRequest withPackageId(String packageId) {
        setPackageId(packageId);
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
        if (getForceDelete() != null)
            sb.append("ForceDelete: ").append(getForceDelete()).append(",");
        if (getPackageId() != null)
            sb.append("PackageId: ").append(getPackageId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeletePackageRequest == false)
            return false;
        DeletePackageRequest other = (DeletePackageRequest) obj;
        if (other.getForceDelete() == null ^ this.getForceDelete() == null)
            return false;
        if (other.getForceDelete() != null && other.getForceDelete().equals(this.getForceDelete()) == false)
            return false;
        if (other.getPackageId() == null ^ this.getPackageId() == null)
            return false;
        if (other.getPackageId() != null && other.getPackageId().equals(this.getPackageId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getForceDelete() == null) ? 0 : getForceDelete().hashCode());
        hashCode = prime * hashCode + ((getPackageId() == null) ? 0 : getPackageId().hashCode());
        return hashCode;
    }

    @Override
    public DeletePackageRequest clone() {
        return (DeletePackageRequest) super.clone();
    }

}
