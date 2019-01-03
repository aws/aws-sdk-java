/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Indicates whether an AWS resource that is evaluated according to one or more AWS Config rules is compliant. A
 * resource is compliant if it complies with all of the rules that evaluate it. A resource is noncompliant if it does
 * not comply with one or more of these rules.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/ComplianceByResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComplianceByResource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of the AWS resource that was evaluated.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The ID of the AWS resource that was evaluated.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * Indicates whether the AWS resource complies with all of the AWS Config rules that evaluated it.
     * </p>
     */
    private Compliance compliance;

    /**
     * <p>
     * The type of the AWS resource that was evaluated.
     * </p>
     * 
     * @param resourceType
     *        The type of the AWS resource that was evaluated.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of the AWS resource that was evaluated.
     * </p>
     * 
     * @return The type of the AWS resource that was evaluated.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of the AWS resource that was evaluated.
     * </p>
     * 
     * @param resourceType
     *        The type of the AWS resource that was evaluated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComplianceByResource withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The ID of the AWS resource that was evaluated.
     * </p>
     * 
     * @param resourceId
     *        The ID of the AWS resource that was evaluated.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The ID of the AWS resource that was evaluated.
     * </p>
     * 
     * @return The ID of the AWS resource that was evaluated.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The ID of the AWS resource that was evaluated.
     * </p>
     * 
     * @param resourceId
     *        The ID of the AWS resource that was evaluated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComplianceByResource withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * Indicates whether the AWS resource complies with all of the AWS Config rules that evaluated it.
     * </p>
     * 
     * @param compliance
     *        Indicates whether the AWS resource complies with all of the AWS Config rules that evaluated it.
     */

    public void setCompliance(Compliance compliance) {
        this.compliance = compliance;
    }

    /**
     * <p>
     * Indicates whether the AWS resource complies with all of the AWS Config rules that evaluated it.
     * </p>
     * 
     * @return Indicates whether the AWS resource complies with all of the AWS Config rules that evaluated it.
     */

    public Compliance getCompliance() {
        return this.compliance;
    }

    /**
     * <p>
     * Indicates whether the AWS resource complies with all of the AWS Config rules that evaluated it.
     * </p>
     * 
     * @param compliance
     *        Indicates whether the AWS resource complies with all of the AWS Config rules that evaluated it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComplianceByResource withCompliance(Compliance compliance) {
        setCompliance(compliance);
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
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getCompliance() != null)
            sb.append("Compliance: ").append(getCompliance());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ComplianceByResource == false)
            return false;
        ComplianceByResource other = (ComplianceByResource) obj;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getCompliance() == null ^ this.getCompliance() == null)
            return false;
        if (other.getCompliance() != null && other.getCompliance().equals(this.getCompliance()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getCompliance() == null) ? 0 : getCompliance().hashCode());
        return hashCode;
    }

    @Override
    public ComplianceByResource clone() {
        try {
            return (ComplianceByResource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.ComplianceByResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
