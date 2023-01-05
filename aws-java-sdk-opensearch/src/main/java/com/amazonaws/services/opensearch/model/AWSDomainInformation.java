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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about an Amazon OpenSearch Service domain.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSDomainInformation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Web Services account ID of the domain owner.
     * </p>
     */
    private String ownerId;
    /**
     * <p>
     * Name of the domain.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The Amazon Web Services Region in which the domain is located.
     * </p>
     */
    private String region;

    /**
     * <p>
     * The Amazon Web Services account ID of the domain owner.
     * </p>
     * 
     * @param ownerId
     *        The Amazon Web Services account ID of the domain owner.
     */

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the domain owner.
     * </p>
     * 
     * @return The Amazon Web Services account ID of the domain owner.
     */

    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the domain owner.
     * </p>
     * 
     * @param ownerId
     *        The Amazon Web Services account ID of the domain owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AWSDomainInformation withOwnerId(String ownerId) {
        setOwnerId(ownerId);
        return this;
    }

    /**
     * <p>
     * Name of the domain.
     * </p>
     * 
     * @param domainName
     *        Name of the domain.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * Name of the domain.
     * </p>
     * 
     * @return Name of the domain.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * Name of the domain.
     * </p>
     * 
     * @param domainName
     *        Name of the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AWSDomainInformation withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Region in which the domain is located.
     * </p>
     * 
     * @param region
     *        The Amazon Web Services Region in which the domain is located.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The Amazon Web Services Region in which the domain is located.
     * </p>
     * 
     * @return The Amazon Web Services Region in which the domain is located.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The Amazon Web Services Region in which the domain is located.
     * </p>
     * 
     * @param region
     *        The Amazon Web Services Region in which the domain is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AWSDomainInformation withRegion(String region) {
        setRegion(region);
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
        if (getOwnerId() != null)
            sb.append("OwnerId: ").append(getOwnerId()).append(",");
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AWSDomainInformation == false)
            return false;
        AWSDomainInformation other = (AWSDomainInformation) obj;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        return hashCode;
    }

    @Override
    public AWSDomainInformation clone() {
        try {
            return (AWSDomainInformation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opensearch.model.transform.AWSDomainInformationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
