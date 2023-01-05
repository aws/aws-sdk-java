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
package com.amazonaws.services.drs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Properties of the cloud environment where this Source Server originated from.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/SourceCloudProperties" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SourceCloudProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * AWS Account ID for an EC2-originated Source Server.
     * </p>
     */
    private String originAccountID;
    /**
     * <p>
     * AWS Availability Zone for an EC2-originated Source Server.
     * </p>
     */
    private String originAvailabilityZone;
    /**
     * <p>
     * AWS Region for an EC2-originated Source Server.
     * </p>
     */
    private String originRegion;

    /**
     * <p>
     * AWS Account ID for an EC2-originated Source Server.
     * </p>
     * 
     * @param originAccountID
     *        AWS Account ID for an EC2-originated Source Server.
     */

    public void setOriginAccountID(String originAccountID) {
        this.originAccountID = originAccountID;
    }

    /**
     * <p>
     * AWS Account ID for an EC2-originated Source Server.
     * </p>
     * 
     * @return AWS Account ID for an EC2-originated Source Server.
     */

    public String getOriginAccountID() {
        return this.originAccountID;
    }

    /**
     * <p>
     * AWS Account ID for an EC2-originated Source Server.
     * </p>
     * 
     * @param originAccountID
     *        AWS Account ID for an EC2-originated Source Server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceCloudProperties withOriginAccountID(String originAccountID) {
        setOriginAccountID(originAccountID);
        return this;
    }

    /**
     * <p>
     * AWS Availability Zone for an EC2-originated Source Server.
     * </p>
     * 
     * @param originAvailabilityZone
     *        AWS Availability Zone for an EC2-originated Source Server.
     */

    public void setOriginAvailabilityZone(String originAvailabilityZone) {
        this.originAvailabilityZone = originAvailabilityZone;
    }

    /**
     * <p>
     * AWS Availability Zone for an EC2-originated Source Server.
     * </p>
     * 
     * @return AWS Availability Zone for an EC2-originated Source Server.
     */

    public String getOriginAvailabilityZone() {
        return this.originAvailabilityZone;
    }

    /**
     * <p>
     * AWS Availability Zone for an EC2-originated Source Server.
     * </p>
     * 
     * @param originAvailabilityZone
     *        AWS Availability Zone for an EC2-originated Source Server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceCloudProperties withOriginAvailabilityZone(String originAvailabilityZone) {
        setOriginAvailabilityZone(originAvailabilityZone);
        return this;
    }

    /**
     * <p>
     * AWS Region for an EC2-originated Source Server.
     * </p>
     * 
     * @param originRegion
     *        AWS Region for an EC2-originated Source Server.
     */

    public void setOriginRegion(String originRegion) {
        this.originRegion = originRegion;
    }

    /**
     * <p>
     * AWS Region for an EC2-originated Source Server.
     * </p>
     * 
     * @return AWS Region for an EC2-originated Source Server.
     */

    public String getOriginRegion() {
        return this.originRegion;
    }

    /**
     * <p>
     * AWS Region for an EC2-originated Source Server.
     * </p>
     * 
     * @param originRegion
     *        AWS Region for an EC2-originated Source Server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceCloudProperties withOriginRegion(String originRegion) {
        setOriginRegion(originRegion);
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
        if (getOriginAccountID() != null)
            sb.append("OriginAccountID: ").append(getOriginAccountID()).append(",");
        if (getOriginAvailabilityZone() != null)
            sb.append("OriginAvailabilityZone: ").append(getOriginAvailabilityZone()).append(",");
        if (getOriginRegion() != null)
            sb.append("OriginRegion: ").append(getOriginRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SourceCloudProperties == false)
            return false;
        SourceCloudProperties other = (SourceCloudProperties) obj;
        if (other.getOriginAccountID() == null ^ this.getOriginAccountID() == null)
            return false;
        if (other.getOriginAccountID() != null && other.getOriginAccountID().equals(this.getOriginAccountID()) == false)
            return false;
        if (other.getOriginAvailabilityZone() == null ^ this.getOriginAvailabilityZone() == null)
            return false;
        if (other.getOriginAvailabilityZone() != null && other.getOriginAvailabilityZone().equals(this.getOriginAvailabilityZone()) == false)
            return false;
        if (other.getOriginRegion() == null ^ this.getOriginRegion() == null)
            return false;
        if (other.getOriginRegion() != null && other.getOriginRegion().equals(this.getOriginRegion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOriginAccountID() == null) ? 0 : getOriginAccountID().hashCode());
        hashCode = prime * hashCode + ((getOriginAvailabilityZone() == null) ? 0 : getOriginAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getOriginRegion() == null) ? 0 : getOriginRegion().hashCode());
        return hashCode;
    }

    @Override
    public SourceCloudProperties clone() {
        try {
            return (SourceCloudProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.drs.model.transform.SourceCloudPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
