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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A time windows during which maintenance was deferred for an Amazon Redshift cluster.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsRedshiftClusterDeferredMaintenanceWindow"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsRedshiftClusterDeferredMaintenanceWindow implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The end of the time window for which maintenance was deferred.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     */
    private String deferMaintenanceEndTime;
    /**
     * <p>
     * The identifier of the maintenance window.
     * </p>
     */
    private String deferMaintenanceIdentifier;
    /**
     * <p>
     * The start of the time window for which maintenance was deferred.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     */
    private String deferMaintenanceStartTime;

    /**
     * <p>
     * The end of the time window for which maintenance was deferred.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param deferMaintenanceEndTime
     *        The end of the time window for which maintenance was deferred.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public void setDeferMaintenanceEndTime(String deferMaintenanceEndTime) {
        this.deferMaintenanceEndTime = deferMaintenanceEndTime;
    }

    /**
     * <p>
     * The end of the time window for which maintenance was deferred.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @return The end of the time window for which maintenance was deferred.</p>
     *         <p>
     *         Uses the <code>date-time</code> format specified in <a
     *         href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *         Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public String getDeferMaintenanceEndTime() {
        return this.deferMaintenanceEndTime;
    }

    /**
     * <p>
     * The end of the time window for which maintenance was deferred.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param deferMaintenanceEndTime
     *        The end of the time window for which maintenance was deferred.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterDeferredMaintenanceWindow withDeferMaintenanceEndTime(String deferMaintenanceEndTime) {
        setDeferMaintenanceEndTime(deferMaintenanceEndTime);
        return this;
    }

    /**
     * <p>
     * The identifier of the maintenance window.
     * </p>
     * 
     * @param deferMaintenanceIdentifier
     *        The identifier of the maintenance window.
     */

    public void setDeferMaintenanceIdentifier(String deferMaintenanceIdentifier) {
        this.deferMaintenanceIdentifier = deferMaintenanceIdentifier;
    }

    /**
     * <p>
     * The identifier of the maintenance window.
     * </p>
     * 
     * @return The identifier of the maintenance window.
     */

    public String getDeferMaintenanceIdentifier() {
        return this.deferMaintenanceIdentifier;
    }

    /**
     * <p>
     * The identifier of the maintenance window.
     * </p>
     * 
     * @param deferMaintenanceIdentifier
     *        The identifier of the maintenance window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterDeferredMaintenanceWindow withDeferMaintenanceIdentifier(String deferMaintenanceIdentifier) {
        setDeferMaintenanceIdentifier(deferMaintenanceIdentifier);
        return this;
    }

    /**
     * <p>
     * The start of the time window for which maintenance was deferred.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param deferMaintenanceStartTime
     *        The start of the time window for which maintenance was deferred.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public void setDeferMaintenanceStartTime(String deferMaintenanceStartTime) {
        this.deferMaintenanceStartTime = deferMaintenanceStartTime;
    }

    /**
     * <p>
     * The start of the time window for which maintenance was deferred.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @return The start of the time window for which maintenance was deferred.</p>
     *         <p>
     *         Uses the <code>date-time</code> format specified in <a
     *         href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *         Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public String getDeferMaintenanceStartTime() {
        return this.deferMaintenanceStartTime;
    }

    /**
     * <p>
     * The start of the time window for which maintenance was deferred.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param deferMaintenanceStartTime
     *        The start of the time window for which maintenance was deferred.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterDeferredMaintenanceWindow withDeferMaintenanceStartTime(String deferMaintenanceStartTime) {
        setDeferMaintenanceStartTime(deferMaintenanceStartTime);
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
        if (getDeferMaintenanceEndTime() != null)
            sb.append("DeferMaintenanceEndTime: ").append(getDeferMaintenanceEndTime()).append(",");
        if (getDeferMaintenanceIdentifier() != null)
            sb.append("DeferMaintenanceIdentifier: ").append(getDeferMaintenanceIdentifier()).append(",");
        if (getDeferMaintenanceStartTime() != null)
            sb.append("DeferMaintenanceStartTime: ").append(getDeferMaintenanceStartTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsRedshiftClusterDeferredMaintenanceWindow == false)
            return false;
        AwsRedshiftClusterDeferredMaintenanceWindow other = (AwsRedshiftClusterDeferredMaintenanceWindow) obj;
        if (other.getDeferMaintenanceEndTime() == null ^ this.getDeferMaintenanceEndTime() == null)
            return false;
        if (other.getDeferMaintenanceEndTime() != null && other.getDeferMaintenanceEndTime().equals(this.getDeferMaintenanceEndTime()) == false)
            return false;
        if (other.getDeferMaintenanceIdentifier() == null ^ this.getDeferMaintenanceIdentifier() == null)
            return false;
        if (other.getDeferMaintenanceIdentifier() != null && other.getDeferMaintenanceIdentifier().equals(this.getDeferMaintenanceIdentifier()) == false)
            return false;
        if (other.getDeferMaintenanceStartTime() == null ^ this.getDeferMaintenanceStartTime() == null)
            return false;
        if (other.getDeferMaintenanceStartTime() != null && other.getDeferMaintenanceStartTime().equals(this.getDeferMaintenanceStartTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeferMaintenanceEndTime() == null) ? 0 : getDeferMaintenanceEndTime().hashCode());
        hashCode = prime * hashCode + ((getDeferMaintenanceIdentifier() == null) ? 0 : getDeferMaintenanceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDeferMaintenanceStartTime() == null) ? 0 : getDeferMaintenanceStartTime().hashCode());
        return hashCode;
    }

    @Override
    public AwsRedshiftClusterDeferredMaintenanceWindow clone() {
        try {
            return (AwsRedshiftClusterDeferredMaintenanceWindow) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsRedshiftClusterDeferredMaintenanceWindowMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
