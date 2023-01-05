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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information on the Amazon ECR repository metadata associated with a finding.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/EcrRepositoryMetadata" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EcrRepositoryMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the Amazon ECR repository.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The frequency of scans.
     * </p>
     */
    private String scanFrequency;

    /**
     * <p>
     * The name of the Amazon ECR repository.
     * </p>
     * 
     * @param name
     *        The name of the Amazon ECR repository.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the Amazon ECR repository.
     * </p>
     * 
     * @return The name of the Amazon ECR repository.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the Amazon ECR repository.
     * </p>
     * 
     * @param name
     *        The name of the Amazon ECR repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcrRepositoryMetadata withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The frequency of scans.
     * </p>
     * 
     * @param scanFrequency
     *        The frequency of scans.
     * @see EcrScanFrequency
     */

    public void setScanFrequency(String scanFrequency) {
        this.scanFrequency = scanFrequency;
    }

    /**
     * <p>
     * The frequency of scans.
     * </p>
     * 
     * @return The frequency of scans.
     * @see EcrScanFrequency
     */

    public String getScanFrequency() {
        return this.scanFrequency;
    }

    /**
     * <p>
     * The frequency of scans.
     * </p>
     * 
     * @param scanFrequency
     *        The frequency of scans.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EcrScanFrequency
     */

    public EcrRepositoryMetadata withScanFrequency(String scanFrequency) {
        setScanFrequency(scanFrequency);
        return this;
    }

    /**
     * <p>
     * The frequency of scans.
     * </p>
     * 
     * @param scanFrequency
     *        The frequency of scans.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EcrScanFrequency
     */

    public EcrRepositoryMetadata withScanFrequency(EcrScanFrequency scanFrequency) {
        this.scanFrequency = scanFrequency.toString();
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
        if (getScanFrequency() != null)
            sb.append("ScanFrequency: ").append(getScanFrequency());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EcrRepositoryMetadata == false)
            return false;
        EcrRepositoryMetadata other = (EcrRepositoryMetadata) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getScanFrequency() == null ^ this.getScanFrequency() == null)
            return false;
        if (other.getScanFrequency() != null && other.getScanFrequency().equals(this.getScanFrequency()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getScanFrequency() == null) ? 0 : getScanFrequency().hashCode());
        return hashCode;
    }

    @Override
    public EcrRepositoryMetadata clone() {
        try {
            return (EcrRepositoryMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.EcrRepositoryMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
