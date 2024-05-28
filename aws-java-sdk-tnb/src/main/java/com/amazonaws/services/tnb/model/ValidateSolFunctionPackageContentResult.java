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
package com.amazonaws.services.tnb.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/ValidateSolFunctionPackageContent"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValidateSolFunctionPackageContentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Function package ID.
     * </p>
     */
    private String id;
    /**
     * <p>
     * Function package metadata.
     * </p>
     */
    private ValidateSolFunctionPackageContentMetadata metadata;
    /**
     * <p>
     * Network function product name.
     * </p>
     */
    private String vnfProductName;
    /**
     * <p>
     * Network function provider.
     * </p>
     */
    private String vnfProvider;
    /**
     * <p>
     * Function package descriptor ID.
     * </p>
     */
    private String vnfdId;
    /**
     * <p>
     * Function package descriptor version.
     * </p>
     */
    private String vnfdVersion;

    /**
     * <p>
     * Function package ID.
     * </p>
     * 
     * @param id
     *        Function package ID.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * Function package ID.
     * </p>
     * 
     * @return Function package ID.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * Function package ID.
     * </p>
     * 
     * @param id
     *        Function package ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidateSolFunctionPackageContentResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * Function package metadata.
     * </p>
     * 
     * @param metadata
     *        Function package metadata.
     */

    public void setMetadata(ValidateSolFunctionPackageContentMetadata metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * Function package metadata.
     * </p>
     * 
     * @return Function package metadata.
     */

    public ValidateSolFunctionPackageContentMetadata getMetadata() {
        return this.metadata;
    }

    /**
     * <p>
     * Function package metadata.
     * </p>
     * 
     * @param metadata
     *        Function package metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidateSolFunctionPackageContentResult withMetadata(ValidateSolFunctionPackageContentMetadata metadata) {
        setMetadata(metadata);
        return this;
    }

    /**
     * <p>
     * Network function product name.
     * </p>
     * 
     * @param vnfProductName
     *        Network function product name.
     */

    public void setVnfProductName(String vnfProductName) {
        this.vnfProductName = vnfProductName;
    }

    /**
     * <p>
     * Network function product name.
     * </p>
     * 
     * @return Network function product name.
     */

    public String getVnfProductName() {
        return this.vnfProductName;
    }

    /**
     * <p>
     * Network function product name.
     * </p>
     * 
     * @param vnfProductName
     *        Network function product name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidateSolFunctionPackageContentResult withVnfProductName(String vnfProductName) {
        setVnfProductName(vnfProductName);
        return this;
    }

    /**
     * <p>
     * Network function provider.
     * </p>
     * 
     * @param vnfProvider
     *        Network function provider.
     */

    public void setVnfProvider(String vnfProvider) {
        this.vnfProvider = vnfProvider;
    }

    /**
     * <p>
     * Network function provider.
     * </p>
     * 
     * @return Network function provider.
     */

    public String getVnfProvider() {
        return this.vnfProvider;
    }

    /**
     * <p>
     * Network function provider.
     * </p>
     * 
     * @param vnfProvider
     *        Network function provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidateSolFunctionPackageContentResult withVnfProvider(String vnfProvider) {
        setVnfProvider(vnfProvider);
        return this;
    }

    /**
     * <p>
     * Function package descriptor ID.
     * </p>
     * 
     * @param vnfdId
     *        Function package descriptor ID.
     */

    public void setVnfdId(String vnfdId) {
        this.vnfdId = vnfdId;
    }

    /**
     * <p>
     * Function package descriptor ID.
     * </p>
     * 
     * @return Function package descriptor ID.
     */

    public String getVnfdId() {
        return this.vnfdId;
    }

    /**
     * <p>
     * Function package descriptor ID.
     * </p>
     * 
     * @param vnfdId
     *        Function package descriptor ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidateSolFunctionPackageContentResult withVnfdId(String vnfdId) {
        setVnfdId(vnfdId);
        return this;
    }

    /**
     * <p>
     * Function package descriptor version.
     * </p>
     * 
     * @param vnfdVersion
     *        Function package descriptor version.
     */

    public void setVnfdVersion(String vnfdVersion) {
        this.vnfdVersion = vnfdVersion;
    }

    /**
     * <p>
     * Function package descriptor version.
     * </p>
     * 
     * @return Function package descriptor version.
     */

    public String getVnfdVersion() {
        return this.vnfdVersion;
    }

    /**
     * <p>
     * Function package descriptor version.
     * </p>
     * 
     * @param vnfdVersion
     *        Function package descriptor version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidateSolFunctionPackageContentResult withVnfdVersion(String vnfdVersion) {
        setVnfdVersion(vnfdVersion);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getMetadata() != null)
            sb.append("Metadata: ").append(getMetadata()).append(",");
        if (getVnfProductName() != null)
            sb.append("VnfProductName: ").append(getVnfProductName()).append(",");
        if (getVnfProvider() != null)
            sb.append("VnfProvider: ").append(getVnfProvider()).append(",");
        if (getVnfdId() != null)
            sb.append("VnfdId: ").append(getVnfdId()).append(",");
        if (getVnfdVersion() != null)
            sb.append("VnfdVersion: ").append(getVnfdVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ValidateSolFunctionPackageContentResult == false)
            return false;
        ValidateSolFunctionPackageContentResult other = (ValidateSolFunctionPackageContentResult) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        if (other.getVnfProductName() == null ^ this.getVnfProductName() == null)
            return false;
        if (other.getVnfProductName() != null && other.getVnfProductName().equals(this.getVnfProductName()) == false)
            return false;
        if (other.getVnfProvider() == null ^ this.getVnfProvider() == null)
            return false;
        if (other.getVnfProvider() != null && other.getVnfProvider().equals(this.getVnfProvider()) == false)
            return false;
        if (other.getVnfdId() == null ^ this.getVnfdId() == null)
            return false;
        if (other.getVnfdId() != null && other.getVnfdId().equals(this.getVnfdId()) == false)
            return false;
        if (other.getVnfdVersion() == null ^ this.getVnfdVersion() == null)
            return false;
        if (other.getVnfdVersion() != null && other.getVnfdVersion().equals(this.getVnfdVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        hashCode = prime * hashCode + ((getVnfProductName() == null) ? 0 : getVnfProductName().hashCode());
        hashCode = prime * hashCode + ((getVnfProvider() == null) ? 0 : getVnfProvider().hashCode());
        hashCode = prime * hashCode + ((getVnfdId() == null) ? 0 : getVnfdId().hashCode());
        hashCode = prime * hashCode + ((getVnfdVersion() == null) ? 0 : getVnfdVersion().hashCode());
        return hashCode;
    }

    @Override
    public ValidateSolFunctionPackageContentResult clone() {
        try {
            return (ValidateSolFunctionPackageContentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
