/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.costandusagereport.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A two element dictionary with a <code>lastDelivery</code> and <code>lastStatus</code> key whose values describe the
 * date and status of the last delivered report for a particular report definition.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cur-2017-01-06/ReportStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReportStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A timestamp that gives the date of a report delivery.
     * </p>
     */
    private String lastDelivery;
    /**
     * <p>
     * An enum that gives the status of a report delivery.
     * </p>
     */
    private String lastStatus;

    /**
     * <p>
     * A timestamp that gives the date of a report delivery.
     * </p>
     * 
     * @param lastDelivery
     *        A timestamp that gives the date of a report delivery.
     */

    public void setLastDelivery(String lastDelivery) {
        this.lastDelivery = lastDelivery;
    }

    /**
     * <p>
     * A timestamp that gives the date of a report delivery.
     * </p>
     * 
     * @return A timestamp that gives the date of a report delivery.
     */

    public String getLastDelivery() {
        return this.lastDelivery;
    }

    /**
     * <p>
     * A timestamp that gives the date of a report delivery.
     * </p>
     * 
     * @param lastDelivery
     *        A timestamp that gives the date of a report delivery.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportStatus withLastDelivery(String lastDelivery) {
        setLastDelivery(lastDelivery);
        return this;
    }

    /**
     * <p>
     * An enum that gives the status of a report delivery.
     * </p>
     * 
     * @param lastStatus
     *        An enum that gives the status of a report delivery.
     * @see LastStatus
     */

    public void setLastStatus(String lastStatus) {
        this.lastStatus = lastStatus;
    }

    /**
     * <p>
     * An enum that gives the status of a report delivery.
     * </p>
     * 
     * @return An enum that gives the status of a report delivery.
     * @see LastStatus
     */

    public String getLastStatus() {
        return this.lastStatus;
    }

    /**
     * <p>
     * An enum that gives the status of a report delivery.
     * </p>
     * 
     * @param lastStatus
     *        An enum that gives the status of a report delivery.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LastStatus
     */

    public ReportStatus withLastStatus(String lastStatus) {
        setLastStatus(lastStatus);
        return this;
    }

    /**
     * <p>
     * An enum that gives the status of a report delivery.
     * </p>
     * 
     * @param lastStatus
     *        An enum that gives the status of a report delivery.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LastStatus
     */

    public ReportStatus withLastStatus(LastStatus lastStatus) {
        this.lastStatus = lastStatus.toString();
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
        if (getLastDelivery() != null)
            sb.append("LastDelivery: ").append(getLastDelivery()).append(",");
        if (getLastStatus() != null)
            sb.append("LastStatus: ").append(getLastStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReportStatus == false)
            return false;
        ReportStatus other = (ReportStatus) obj;
        if (other.getLastDelivery() == null ^ this.getLastDelivery() == null)
            return false;
        if (other.getLastDelivery() != null && other.getLastDelivery().equals(this.getLastDelivery()) == false)
            return false;
        if (other.getLastStatus() == null ^ this.getLastStatus() == null)
            return false;
        if (other.getLastStatus() != null && other.getLastStatus().equals(this.getLastStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLastDelivery() == null) ? 0 : getLastDelivery().hashCode());
        hashCode = prime * hashCode + ((getLastStatus() == null) ? 0 : getLastStatus().hashCode());
        return hashCode;
    }

    @Override
    public ReportStatus clone() {
        try {
            return (ReportStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costandusagereport.model.transform.ReportStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
