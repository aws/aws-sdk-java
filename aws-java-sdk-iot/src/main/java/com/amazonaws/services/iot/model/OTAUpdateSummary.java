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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An OTA update summary.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OTAUpdateSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The OTA update ID.
     * </p>
     */
    private String otaUpdateId;
    /**
     * <p>
     * The OTA update ARN.
     * </p>
     */
    private String otaUpdateArn;
    /**
     * <p>
     * The date when the OTA update was created.
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * The OTA update ID.
     * </p>
     * 
     * @param otaUpdateId
     *        The OTA update ID.
     */

    public void setOtaUpdateId(String otaUpdateId) {
        this.otaUpdateId = otaUpdateId;
    }

    /**
     * <p>
     * The OTA update ID.
     * </p>
     * 
     * @return The OTA update ID.
     */

    public String getOtaUpdateId() {
        return this.otaUpdateId;
    }

    /**
     * <p>
     * The OTA update ID.
     * </p>
     * 
     * @param otaUpdateId
     *        The OTA update ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OTAUpdateSummary withOtaUpdateId(String otaUpdateId) {
        setOtaUpdateId(otaUpdateId);
        return this;
    }

    /**
     * <p>
     * The OTA update ARN.
     * </p>
     * 
     * @param otaUpdateArn
     *        The OTA update ARN.
     */

    public void setOtaUpdateArn(String otaUpdateArn) {
        this.otaUpdateArn = otaUpdateArn;
    }

    /**
     * <p>
     * The OTA update ARN.
     * </p>
     * 
     * @return The OTA update ARN.
     */

    public String getOtaUpdateArn() {
        return this.otaUpdateArn;
    }

    /**
     * <p>
     * The OTA update ARN.
     * </p>
     * 
     * @param otaUpdateArn
     *        The OTA update ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OTAUpdateSummary withOtaUpdateArn(String otaUpdateArn) {
        setOtaUpdateArn(otaUpdateArn);
        return this;
    }

    /**
     * <p>
     * The date when the OTA update was created.
     * </p>
     * 
     * @param creationDate
     *        The date when the OTA update was created.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date when the OTA update was created.
     * </p>
     * 
     * @return The date when the OTA update was created.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date when the OTA update was created.
     * </p>
     * 
     * @param creationDate
     *        The date when the OTA update was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OTAUpdateSummary withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
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
        if (getOtaUpdateId() != null)
            sb.append("OtaUpdateId: ").append(getOtaUpdateId()).append(",");
        if (getOtaUpdateArn() != null)
            sb.append("OtaUpdateArn: ").append(getOtaUpdateArn()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OTAUpdateSummary == false)
            return false;
        OTAUpdateSummary other = (OTAUpdateSummary) obj;
        if (other.getOtaUpdateId() == null ^ this.getOtaUpdateId() == null)
            return false;
        if (other.getOtaUpdateId() != null && other.getOtaUpdateId().equals(this.getOtaUpdateId()) == false)
            return false;
        if (other.getOtaUpdateArn() == null ^ this.getOtaUpdateArn() == null)
            return false;
        if (other.getOtaUpdateArn() != null && other.getOtaUpdateArn().equals(this.getOtaUpdateArn()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOtaUpdateId() == null) ? 0 : getOtaUpdateId().hashCode());
        hashCode = prime * hashCode + ((getOtaUpdateArn() == null) ? 0 : getOtaUpdateArn().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        return hashCode;
    }

    @Override
    public OTAUpdateSummary clone() {
        try {
            return (OTAUpdateSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.OTAUpdateSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
