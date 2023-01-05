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
 * Describes the configuration of scanning EBS volumes as a data source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/EbsVolumesResult" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EbsVolumesResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Describes whether scanning EBS volumes is enabled as a data source.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Specifies the reason why scanning EBS volumes (Malware Protection) was not enabled as a data source.
     * </p>
     */
    private String reason;

    /**
     * <p>
     * Describes whether scanning EBS volumes is enabled as a data source.
     * </p>
     * 
     * @param status
     *        Describes whether scanning EBS volumes is enabled as a data source.
     * @see DataSourceStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Describes whether scanning EBS volumes is enabled as a data source.
     * </p>
     * 
     * @return Describes whether scanning EBS volumes is enabled as a data source.
     * @see DataSourceStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Describes whether scanning EBS volumes is enabled as a data source.
     * </p>
     * 
     * @param status
     *        Describes whether scanning EBS volumes is enabled as a data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceStatus
     */

    public EbsVolumesResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Describes whether scanning EBS volumes is enabled as a data source.
     * </p>
     * 
     * @param status
     *        Describes whether scanning EBS volumes is enabled as a data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceStatus
     */

    public EbsVolumesResult withStatus(DataSourceStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the reason why scanning EBS volumes (Malware Protection) was not enabled as a data source.
     * </p>
     * 
     * @param reason
     *        Specifies the reason why scanning EBS volumes (Malware Protection) was not enabled as a data source.
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * Specifies the reason why scanning EBS volumes (Malware Protection) was not enabled as a data source.
     * </p>
     * 
     * @return Specifies the reason why scanning EBS volumes (Malware Protection) was not enabled as a data source.
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * Specifies the reason why scanning EBS volumes (Malware Protection) was not enabled as a data source.
     * </p>
     * 
     * @param reason
     *        Specifies the reason why scanning EBS volumes (Malware Protection) was not enabled as a data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EbsVolumesResult withReason(String reason) {
        setReason(reason);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getReason() != null)
            sb.append("Reason: ").append(getReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EbsVolumesResult == false)
            return false;
        EbsVolumesResult other = (EbsVolumesResult) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        return hashCode;
    }

    @Override
    public EbsVolumesResult clone() {
        try {
            return (EbsVolumesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.EbsVolumesResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
