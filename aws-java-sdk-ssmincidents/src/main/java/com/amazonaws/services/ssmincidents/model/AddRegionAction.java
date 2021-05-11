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
package com.amazonaws.services.ssmincidents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines the Region and KMS key to add to the replication set.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/AddRegionAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddRegionAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Region name to add to the replication set.
     * </p>
     */
    private String regionName;
    /**
     * <p>
     * The KMS key ID to use to encrypt your replication set.
     * </p>
     */
    private String sseKmsKeyId;

    /**
     * <p>
     * The Region name to add to the replication set.
     * </p>
     * 
     * @param regionName
     *        The Region name to add to the replication set.
     */

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    /**
     * <p>
     * The Region name to add to the replication set.
     * </p>
     * 
     * @return The Region name to add to the replication set.
     */

    public String getRegionName() {
        return this.regionName;
    }

    /**
     * <p>
     * The Region name to add to the replication set.
     * </p>
     * 
     * @param regionName
     *        The Region name to add to the replication set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddRegionAction withRegionName(String regionName) {
        setRegionName(regionName);
        return this;
    }

    /**
     * <p>
     * The KMS key ID to use to encrypt your replication set.
     * </p>
     * 
     * @param sseKmsKeyId
     *        The KMS key ID to use to encrypt your replication set.
     */

    public void setSseKmsKeyId(String sseKmsKeyId) {
        this.sseKmsKeyId = sseKmsKeyId;
    }

    /**
     * <p>
     * The KMS key ID to use to encrypt your replication set.
     * </p>
     * 
     * @return The KMS key ID to use to encrypt your replication set.
     */

    public String getSseKmsKeyId() {
        return this.sseKmsKeyId;
    }

    /**
     * <p>
     * The KMS key ID to use to encrypt your replication set.
     * </p>
     * 
     * @param sseKmsKeyId
     *        The KMS key ID to use to encrypt your replication set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddRegionAction withSseKmsKeyId(String sseKmsKeyId) {
        setSseKmsKeyId(sseKmsKeyId);
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
        if (getRegionName() != null)
            sb.append("RegionName: ").append(getRegionName()).append(",");
        if (getSseKmsKeyId() != null)
            sb.append("SseKmsKeyId: ").append(getSseKmsKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddRegionAction == false)
            return false;
        AddRegionAction other = (AddRegionAction) obj;
        if (other.getRegionName() == null ^ this.getRegionName() == null)
            return false;
        if (other.getRegionName() != null && other.getRegionName().equals(this.getRegionName()) == false)
            return false;
        if (other.getSseKmsKeyId() == null ^ this.getSseKmsKeyId() == null)
            return false;
        if (other.getSseKmsKeyId() != null && other.getSseKmsKeyId().equals(this.getSseKmsKeyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegionName() == null) ? 0 : getRegionName().hashCode());
        hashCode = prime * hashCode + ((getSseKmsKeyId() == null) ? 0 : getSseKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public AddRegionAction clone() {
        try {
            return (AddRegionAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssmincidents.model.transform.AddRegionActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
