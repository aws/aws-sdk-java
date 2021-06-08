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
package com.amazonaws.services.route53resolver.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A complex type that contains information about a configuration for DNSSEC validation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ResolverDnssecConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResolverDnssecConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID for a configuration for DNSSEC validation.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The owner account ID of the virtual private cloud (VPC) for a configuration for DNSSEC validation.
     * </p>
     */
    private String ownerId;
    /**
     * <p>
     * The ID of the virtual private cloud (VPC) that you're configuring the DNSSEC validation status for.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The validation status for a DNSSEC configuration. The status can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ENABLING:</b> DNSSEC validation is being enabled but is not complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ENABLED:</b> DNSSEC validation is enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DISABLING:</b> DNSSEC validation is being disabled but is not complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DISABLED</b> DNSSEC validation is disabled.
     * </p>
     * </li>
     * </ul>
     */
    private String validationStatus;

    /**
     * <p>
     * The ID for a configuration for DNSSEC validation.
     * </p>
     * 
     * @param id
     *        The ID for a configuration for DNSSEC validation.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID for a configuration for DNSSEC validation.
     * </p>
     * 
     * @return The ID for a configuration for DNSSEC validation.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID for a configuration for DNSSEC validation.
     * </p>
     * 
     * @param id
     *        The ID for a configuration for DNSSEC validation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolverDnssecConfig withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The owner account ID of the virtual private cloud (VPC) for a configuration for DNSSEC validation.
     * </p>
     * 
     * @param ownerId
     *        The owner account ID of the virtual private cloud (VPC) for a configuration for DNSSEC validation.
     */

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The owner account ID of the virtual private cloud (VPC) for a configuration for DNSSEC validation.
     * </p>
     * 
     * @return The owner account ID of the virtual private cloud (VPC) for a configuration for DNSSEC validation.
     */

    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * <p>
     * The owner account ID of the virtual private cloud (VPC) for a configuration for DNSSEC validation.
     * </p>
     * 
     * @param ownerId
     *        The owner account ID of the virtual private cloud (VPC) for a configuration for DNSSEC validation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolverDnssecConfig withOwnerId(String ownerId) {
        setOwnerId(ownerId);
        return this;
    }

    /**
     * <p>
     * The ID of the virtual private cloud (VPC) that you're configuring the DNSSEC validation status for.
     * </p>
     * 
     * @param resourceId
     *        The ID of the virtual private cloud (VPC) that you're configuring the DNSSEC validation status for.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The ID of the virtual private cloud (VPC) that you're configuring the DNSSEC validation status for.
     * </p>
     * 
     * @return The ID of the virtual private cloud (VPC) that you're configuring the DNSSEC validation status for.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The ID of the virtual private cloud (VPC) that you're configuring the DNSSEC validation status for.
     * </p>
     * 
     * @param resourceId
     *        The ID of the virtual private cloud (VPC) that you're configuring the DNSSEC validation status for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolverDnssecConfig withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The validation status for a DNSSEC configuration. The status can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ENABLING:</b> DNSSEC validation is being enabled but is not complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ENABLED:</b> DNSSEC validation is enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DISABLING:</b> DNSSEC validation is being disabled but is not complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DISABLED</b> DNSSEC validation is disabled.
     * </p>
     * </li>
     * </ul>
     * 
     * @param validationStatus
     *        The validation status for a DNSSEC configuration. The status can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>ENABLING:</b> DNSSEC validation is being enabled but is not complete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ENABLED:</b> DNSSEC validation is enabled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DISABLING:</b> DNSSEC validation is being disabled but is not complete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DISABLED</b> DNSSEC validation is disabled.
     *        </p>
     *        </li>
     * @see ResolverDNSSECValidationStatus
     */

    public void setValidationStatus(String validationStatus) {
        this.validationStatus = validationStatus;
    }

    /**
     * <p>
     * The validation status for a DNSSEC configuration. The status can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ENABLING:</b> DNSSEC validation is being enabled but is not complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ENABLED:</b> DNSSEC validation is enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DISABLING:</b> DNSSEC validation is being disabled but is not complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DISABLED</b> DNSSEC validation is disabled.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The validation status for a DNSSEC configuration. The status can be one of the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>ENABLING:</b> DNSSEC validation is being enabled but is not complete.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>ENABLED:</b> DNSSEC validation is enabled.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>DISABLING:</b> DNSSEC validation is being disabled but is not complete.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>DISABLED</b> DNSSEC validation is disabled.
     *         </p>
     *         </li>
     * @see ResolverDNSSECValidationStatus
     */

    public String getValidationStatus() {
        return this.validationStatus;
    }

    /**
     * <p>
     * The validation status for a DNSSEC configuration. The status can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ENABLING:</b> DNSSEC validation is being enabled but is not complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ENABLED:</b> DNSSEC validation is enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DISABLING:</b> DNSSEC validation is being disabled but is not complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DISABLED</b> DNSSEC validation is disabled.
     * </p>
     * </li>
     * </ul>
     * 
     * @param validationStatus
     *        The validation status for a DNSSEC configuration. The status can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>ENABLING:</b> DNSSEC validation is being enabled but is not complete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ENABLED:</b> DNSSEC validation is enabled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DISABLING:</b> DNSSEC validation is being disabled but is not complete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DISABLED</b> DNSSEC validation is disabled.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResolverDNSSECValidationStatus
     */

    public ResolverDnssecConfig withValidationStatus(String validationStatus) {
        setValidationStatus(validationStatus);
        return this;
    }

    /**
     * <p>
     * The validation status for a DNSSEC configuration. The status can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ENABLING:</b> DNSSEC validation is being enabled but is not complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ENABLED:</b> DNSSEC validation is enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DISABLING:</b> DNSSEC validation is being disabled but is not complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DISABLED</b> DNSSEC validation is disabled.
     * </p>
     * </li>
     * </ul>
     * 
     * @param validationStatus
     *        The validation status for a DNSSEC configuration. The status can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>ENABLING:</b> DNSSEC validation is being enabled but is not complete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ENABLED:</b> DNSSEC validation is enabled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DISABLING:</b> DNSSEC validation is being disabled but is not complete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DISABLED</b> DNSSEC validation is disabled.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResolverDNSSECValidationStatus
     */

    public ResolverDnssecConfig withValidationStatus(ResolverDNSSECValidationStatus validationStatus) {
        this.validationStatus = validationStatus.toString();
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
        if (getOwnerId() != null)
            sb.append("OwnerId: ").append(getOwnerId()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getValidationStatus() != null)
            sb.append("ValidationStatus: ").append(getValidationStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResolverDnssecConfig == false)
            return false;
        ResolverDnssecConfig other = (ResolverDnssecConfig) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getValidationStatus() == null ^ this.getValidationStatus() == null)
            return false;
        if (other.getValidationStatus() != null && other.getValidationStatus().equals(this.getValidationStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getValidationStatus() == null) ? 0 : getValidationStatus().hashCode());
        return hashCode;
    }

    @Override
    public ResolverDnssecConfig clone() {
        try {
            return (ResolverDnssecConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.route53resolver.model.transform.ResolverDnssecConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
