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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes whether Malware Protection for EC2 instances with findings will be enabled as a data source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ScanEc2InstanceWithFindings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScanEc2InstanceWithFindings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Describes the configuration for scanning EBS volumes as data source.
     * </p>
     */
    private Boolean ebsVolumes;

    /**
     * <p>
     * Describes the configuration for scanning EBS volumes as data source.
     * </p>
     * 
     * @param ebsVolumes
     *        Describes the configuration for scanning EBS volumes as data source.
     */

    public void setEbsVolumes(Boolean ebsVolumes) {
        this.ebsVolumes = ebsVolumes;
    }

    /**
     * <p>
     * Describes the configuration for scanning EBS volumes as data source.
     * </p>
     * 
     * @return Describes the configuration for scanning EBS volumes as data source.
     */

    public Boolean getEbsVolumes() {
        return this.ebsVolumes;
    }

    /**
     * <p>
     * Describes the configuration for scanning EBS volumes as data source.
     * </p>
     * 
     * @param ebsVolumes
     *        Describes the configuration for scanning EBS volumes as data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScanEc2InstanceWithFindings withEbsVolumes(Boolean ebsVolumes) {
        setEbsVolumes(ebsVolumes);
        return this;
    }

    /**
     * <p>
     * Describes the configuration for scanning EBS volumes as data source.
     * </p>
     * 
     * @return Describes the configuration for scanning EBS volumes as data source.
     */

    public Boolean isEbsVolumes() {
        return this.ebsVolumes;
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
        if (getEbsVolumes() != null)
            sb.append("EbsVolumes: ").append(getEbsVolumes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScanEc2InstanceWithFindings == false)
            return false;
        ScanEc2InstanceWithFindings other = (ScanEc2InstanceWithFindings) obj;
        if (other.getEbsVolumes() == null ^ this.getEbsVolumes() == null)
            return false;
        if (other.getEbsVolumes() != null && other.getEbsVolumes().equals(this.getEbsVolumes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEbsVolumes() == null) ? 0 : getEbsVolumes().hashCode());
        return hashCode;
    }

    @Override
    public ScanEc2InstanceWithFindings clone() {
        try {
            return (ScanEc2InstanceWithFindings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.ScanEc2InstanceWithFindingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
