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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * The AWS resource associated with the activity that prompted GuardDuty to generate a finding.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/Resource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Resource implements Serializable, Cloneable, StructuredPojo {

    private AccessKeyDetails accessKeyDetails;

    private InstanceDetails instanceDetails;
    /** The type of the AWS resource. */
    private String resourceType;

    /**
     * @param accessKeyDetails
     */

    public void setAccessKeyDetails(AccessKeyDetails accessKeyDetails) {
        this.accessKeyDetails = accessKeyDetails;
    }

    /**
     * @return
     */

    public AccessKeyDetails getAccessKeyDetails() {
        return this.accessKeyDetails;
    }

    /**
     * @param accessKeyDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resource withAccessKeyDetails(AccessKeyDetails accessKeyDetails) {
        setAccessKeyDetails(accessKeyDetails);
        return this;
    }

    /**
     * @param instanceDetails
     */

    public void setInstanceDetails(InstanceDetails instanceDetails) {
        this.instanceDetails = instanceDetails;
    }

    /**
     * @return
     */

    public InstanceDetails getInstanceDetails() {
        return this.instanceDetails;
    }

    /**
     * @param instanceDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resource withInstanceDetails(InstanceDetails instanceDetails) {
        setInstanceDetails(instanceDetails);
        return this;
    }

    /**
     * The type of the AWS resource.
     * 
     * @param resourceType
     *        The type of the AWS resource.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * The type of the AWS resource.
     * 
     * @return The type of the AWS resource.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * The type of the AWS resource.
     * 
     * @param resourceType
     *        The type of the AWS resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resource withResourceType(String resourceType) {
        setResourceType(resourceType);
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
        if (getAccessKeyDetails() != null)
            sb.append("AccessKeyDetails: ").append(getAccessKeyDetails()).append(",");
        if (getInstanceDetails() != null)
            sb.append("InstanceDetails: ").append(getInstanceDetails()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Resource == false)
            return false;
        Resource other = (Resource) obj;
        if (other.getAccessKeyDetails() == null ^ this.getAccessKeyDetails() == null)
            return false;
        if (other.getAccessKeyDetails() != null && other.getAccessKeyDetails().equals(this.getAccessKeyDetails()) == false)
            return false;
        if (other.getInstanceDetails() == null ^ this.getInstanceDetails() == null)
            return false;
        if (other.getInstanceDetails() != null && other.getInstanceDetails().equals(this.getInstanceDetails()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessKeyDetails() == null) ? 0 : getAccessKeyDetails().hashCode());
        hashCode = prime * hashCode + ((getInstanceDetails() == null) ? 0 : getInstanceDetails().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        return hashCode;
    }

    @Override
    public Resource clone() {
        try {
            return (Resource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.ResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
