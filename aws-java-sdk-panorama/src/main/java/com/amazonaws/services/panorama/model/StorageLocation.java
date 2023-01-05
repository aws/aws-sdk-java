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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A storage location.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/StorageLocation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StorageLocation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The location's binary prefix.
     * </p>
     */
    private String binaryPrefixLocation;
    /**
     * <p>
     * The location's bucket.
     * </p>
     */
    private String bucket;
    /**
     * <p>
     * The location's generated prefix.
     * </p>
     */
    private String generatedPrefixLocation;
    /**
     * <p>
     * The location's manifest prefix.
     * </p>
     */
    private String manifestPrefixLocation;
    /**
     * <p>
     * The location's repo prefix.
     * </p>
     */
    private String repoPrefixLocation;

    /**
     * <p>
     * The location's binary prefix.
     * </p>
     * 
     * @param binaryPrefixLocation
     *        The location's binary prefix.
     */

    public void setBinaryPrefixLocation(String binaryPrefixLocation) {
        this.binaryPrefixLocation = binaryPrefixLocation;
    }

    /**
     * <p>
     * The location's binary prefix.
     * </p>
     * 
     * @return The location's binary prefix.
     */

    public String getBinaryPrefixLocation() {
        return this.binaryPrefixLocation;
    }

    /**
     * <p>
     * The location's binary prefix.
     * </p>
     * 
     * @param binaryPrefixLocation
     *        The location's binary prefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageLocation withBinaryPrefixLocation(String binaryPrefixLocation) {
        setBinaryPrefixLocation(binaryPrefixLocation);
        return this;
    }

    /**
     * <p>
     * The location's bucket.
     * </p>
     * 
     * @param bucket
     *        The location's bucket.
     */

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The location's bucket.
     * </p>
     * 
     * @return The location's bucket.
     */

    public String getBucket() {
        return this.bucket;
    }

    /**
     * <p>
     * The location's bucket.
     * </p>
     * 
     * @param bucket
     *        The location's bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageLocation withBucket(String bucket) {
        setBucket(bucket);
        return this;
    }

    /**
     * <p>
     * The location's generated prefix.
     * </p>
     * 
     * @param generatedPrefixLocation
     *        The location's generated prefix.
     */

    public void setGeneratedPrefixLocation(String generatedPrefixLocation) {
        this.generatedPrefixLocation = generatedPrefixLocation;
    }

    /**
     * <p>
     * The location's generated prefix.
     * </p>
     * 
     * @return The location's generated prefix.
     */

    public String getGeneratedPrefixLocation() {
        return this.generatedPrefixLocation;
    }

    /**
     * <p>
     * The location's generated prefix.
     * </p>
     * 
     * @param generatedPrefixLocation
     *        The location's generated prefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageLocation withGeneratedPrefixLocation(String generatedPrefixLocation) {
        setGeneratedPrefixLocation(generatedPrefixLocation);
        return this;
    }

    /**
     * <p>
     * The location's manifest prefix.
     * </p>
     * 
     * @param manifestPrefixLocation
     *        The location's manifest prefix.
     */

    public void setManifestPrefixLocation(String manifestPrefixLocation) {
        this.manifestPrefixLocation = manifestPrefixLocation;
    }

    /**
     * <p>
     * The location's manifest prefix.
     * </p>
     * 
     * @return The location's manifest prefix.
     */

    public String getManifestPrefixLocation() {
        return this.manifestPrefixLocation;
    }

    /**
     * <p>
     * The location's manifest prefix.
     * </p>
     * 
     * @param manifestPrefixLocation
     *        The location's manifest prefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageLocation withManifestPrefixLocation(String manifestPrefixLocation) {
        setManifestPrefixLocation(manifestPrefixLocation);
        return this;
    }

    /**
     * <p>
     * The location's repo prefix.
     * </p>
     * 
     * @param repoPrefixLocation
     *        The location's repo prefix.
     */

    public void setRepoPrefixLocation(String repoPrefixLocation) {
        this.repoPrefixLocation = repoPrefixLocation;
    }

    /**
     * <p>
     * The location's repo prefix.
     * </p>
     * 
     * @return The location's repo prefix.
     */

    public String getRepoPrefixLocation() {
        return this.repoPrefixLocation;
    }

    /**
     * <p>
     * The location's repo prefix.
     * </p>
     * 
     * @param repoPrefixLocation
     *        The location's repo prefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageLocation withRepoPrefixLocation(String repoPrefixLocation) {
        setRepoPrefixLocation(repoPrefixLocation);
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
        if (getBinaryPrefixLocation() != null)
            sb.append("BinaryPrefixLocation: ").append(getBinaryPrefixLocation()).append(",");
        if (getBucket() != null)
            sb.append("Bucket: ").append(getBucket()).append(",");
        if (getGeneratedPrefixLocation() != null)
            sb.append("GeneratedPrefixLocation: ").append(getGeneratedPrefixLocation()).append(",");
        if (getManifestPrefixLocation() != null)
            sb.append("ManifestPrefixLocation: ").append(getManifestPrefixLocation()).append(",");
        if (getRepoPrefixLocation() != null)
            sb.append("RepoPrefixLocation: ").append(getRepoPrefixLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StorageLocation == false)
            return false;
        StorageLocation other = (StorageLocation) obj;
        if (other.getBinaryPrefixLocation() == null ^ this.getBinaryPrefixLocation() == null)
            return false;
        if (other.getBinaryPrefixLocation() != null && other.getBinaryPrefixLocation().equals(this.getBinaryPrefixLocation()) == false)
            return false;
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getGeneratedPrefixLocation() == null ^ this.getGeneratedPrefixLocation() == null)
            return false;
        if (other.getGeneratedPrefixLocation() != null && other.getGeneratedPrefixLocation().equals(this.getGeneratedPrefixLocation()) == false)
            return false;
        if (other.getManifestPrefixLocation() == null ^ this.getManifestPrefixLocation() == null)
            return false;
        if (other.getManifestPrefixLocation() != null && other.getManifestPrefixLocation().equals(this.getManifestPrefixLocation()) == false)
            return false;
        if (other.getRepoPrefixLocation() == null ^ this.getRepoPrefixLocation() == null)
            return false;
        if (other.getRepoPrefixLocation() != null && other.getRepoPrefixLocation().equals(this.getRepoPrefixLocation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBinaryPrefixLocation() == null) ? 0 : getBinaryPrefixLocation().hashCode());
        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getGeneratedPrefixLocation() == null) ? 0 : getGeneratedPrefixLocation().hashCode());
        hashCode = prime * hashCode + ((getManifestPrefixLocation() == null) ? 0 : getManifestPrefixLocation().hashCode());
        hashCode = prime * hashCode + ((getRepoPrefixLocation() == null) ? 0 : getRepoPrefixLocation().hashCode());
        return hashCode;
    }

    @Override
    public StorageLocation clone() {
        try {
            return (StorageLocation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.panorama.model.transform.StorageLocationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
