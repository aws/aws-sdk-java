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
package com.amazonaws.services.ecr.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The status of the replication process for an image.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/ImageReplicationStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImageReplicationStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The destination Region for the image replication.
     * </p>
     */
    private String region;
    /**
     * <p>
     * The Amazon Web Services account ID associated with the registry to which the image belongs.
     * </p>
     */
    private String registryId;
    /**
     * <p>
     * The image replication status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The failure code for a replication that has failed.
     * </p>
     */
    private String failureCode;

    /**
     * <p>
     * The destination Region for the image replication.
     * </p>
     * 
     * @param region
     *        The destination Region for the image replication.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The destination Region for the image replication.
     * </p>
     * 
     * @return The destination Region for the image replication.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The destination Region for the image replication.
     * </p>
     * 
     * @param region
     *        The destination Region for the image replication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageReplicationStatus withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services account ID associated with the registry to which the image belongs.
     * </p>
     * 
     * @param registryId
     *        The Amazon Web Services account ID associated with the registry to which the image belongs.
     */

    public void setRegistryId(String registryId) {
        this.registryId = registryId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID associated with the registry to which the image belongs.
     * </p>
     * 
     * @return The Amazon Web Services account ID associated with the registry to which the image belongs.
     */

    public String getRegistryId() {
        return this.registryId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID associated with the registry to which the image belongs.
     * </p>
     * 
     * @param registryId
     *        The Amazon Web Services account ID associated with the registry to which the image belongs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageReplicationStatus withRegistryId(String registryId) {
        setRegistryId(registryId);
        return this;
    }

    /**
     * <p>
     * The image replication status.
     * </p>
     * 
     * @param status
     *        The image replication status.
     * @see ReplicationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The image replication status.
     * </p>
     * 
     * @return The image replication status.
     * @see ReplicationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The image replication status.
     * </p>
     * 
     * @param status
     *        The image replication status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationStatus
     */

    public ImageReplicationStatus withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The image replication status.
     * </p>
     * 
     * @param status
     *        The image replication status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationStatus
     */

    public ImageReplicationStatus withStatus(ReplicationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The failure code for a replication that has failed.
     * </p>
     * 
     * @param failureCode
     *        The failure code for a replication that has failed.
     */

    public void setFailureCode(String failureCode) {
        this.failureCode = failureCode;
    }

    /**
     * <p>
     * The failure code for a replication that has failed.
     * </p>
     * 
     * @return The failure code for a replication that has failed.
     */

    public String getFailureCode() {
        return this.failureCode;
    }

    /**
     * <p>
     * The failure code for a replication that has failed.
     * </p>
     * 
     * @param failureCode
     *        The failure code for a replication that has failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageReplicationStatus withFailureCode(String failureCode) {
        setFailureCode(failureCode);
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
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getRegistryId() != null)
            sb.append("RegistryId: ").append(getRegistryId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getFailureCode() != null)
            sb.append("FailureCode: ").append(getFailureCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImageReplicationStatus == false)
            return false;
        ImageReplicationStatus other = (ImageReplicationStatus) obj;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getRegistryId() == null ^ this.getRegistryId() == null)
            return false;
        if (other.getRegistryId() != null && other.getRegistryId().equals(this.getRegistryId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getFailureCode() == null ^ this.getFailureCode() == null)
            return false;
        if (other.getFailureCode() != null && other.getFailureCode().equals(this.getFailureCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getRegistryId() == null) ? 0 : getRegistryId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getFailureCode() == null) ? 0 : getFailureCode().hashCode());
        return hashCode;
    }

    @Override
    public ImageReplicationStatus clone() {
        try {
            return (ImageReplicationStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecr.model.transform.ImageReplicationStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
