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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/ResetEncryptionKey" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResetEncryptionKeyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The resource type the key encrypts.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The scan type the key encrypts.
     * </p>
     */
    private String scanType;

    /**
     * <p>
     * The resource type the key encrypts.
     * </p>
     * 
     * @param resourceType
     *        The resource type the key encrypts.
     * @see ResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The resource type the key encrypts.
     * </p>
     * 
     * @return The resource type the key encrypts.
     * @see ResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The resource type the key encrypts.
     * </p>
     * 
     * @param resourceType
     *        The resource type the key encrypts.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public ResetEncryptionKeyRequest withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The resource type the key encrypts.
     * </p>
     * 
     * @param resourceType
     *        The resource type the key encrypts.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public ResetEncryptionKeyRequest withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The scan type the key encrypts.
     * </p>
     * 
     * @param scanType
     *        The scan type the key encrypts.
     * @see ScanType
     */

    public void setScanType(String scanType) {
        this.scanType = scanType;
    }

    /**
     * <p>
     * The scan type the key encrypts.
     * </p>
     * 
     * @return The scan type the key encrypts.
     * @see ScanType
     */

    public String getScanType() {
        return this.scanType;
    }

    /**
     * <p>
     * The scan type the key encrypts.
     * </p>
     * 
     * @param scanType
     *        The scan type the key encrypts.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScanType
     */

    public ResetEncryptionKeyRequest withScanType(String scanType) {
        setScanType(scanType);
        return this;
    }

    /**
     * <p>
     * The scan type the key encrypts.
     * </p>
     * 
     * @param scanType
     *        The scan type the key encrypts.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScanType
     */

    public ResetEncryptionKeyRequest withScanType(ScanType scanType) {
        this.scanType = scanType.toString();
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
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getScanType() != null)
            sb.append("ScanType: ").append(getScanType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResetEncryptionKeyRequest == false)
            return false;
        ResetEncryptionKeyRequest other = (ResetEncryptionKeyRequest) obj;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getScanType() == null ^ this.getScanType() == null)
            return false;
        if (other.getScanType() != null && other.getScanType().equals(this.getScanType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getScanType() == null) ? 0 : getScanType().hashCode());
        return hashCode;
    }

    @Override
    public ResetEncryptionKeyRequest clone() {
        return (ResetEncryptionKeyRequest) super.clone();
    }

}
