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
package com.amazonaws.services.arczonalshift.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about an autoshift. Amazon Web Services starts an autoshift to temporarily move traffic for a resource
 * away from an Availability Zone in an Amazon Web Services Region when Amazon Web Services determines that there's an
 * issue in the Availability Zone that could potentially affect customers. You can configure zonal autoshift in Route 53
 * ARC for managed resources in your Amazon Web Services account in a Region. Supported Amazon Web Services resources
 * are automatically registered with Route 53 ARC.
 * </p>
 * <p>
 * Autoshifts are temporary. When the Availability Zone recovers, Amazon Web Services ends the autoshift, and traffic
 * for the resource is no longer directed to the other Availability Zones in the Region.
 * </p>
 * <p>
 * You can stop an autoshift for a resource by disabling zonal autoshift.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/arc-zonal-shift-2022-10-30/AutoshiftSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoshiftSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Availability Zone that traffic is shifted away from for a resource when Amazon Web Services starts an
     * autoshift. Until the autoshift ends, traffic for the resource is instead directed to other Availability Zones in
     * the Amazon Web Services Region. An autoshift can end for a resource, for example, when Amazon Web Services ends
     * the autoshift for the Availability Zone or when you disable zonal autoshift for the resource.
     * </p>
     */
    private String awayFrom;
    /**
     * <p>
     * The time (in UTC) when the autoshift ended.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The time (in UTC) when the autoshift started.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The status for an autoshift.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The Availability Zone that traffic is shifted away from for a resource when Amazon Web Services starts an
     * autoshift. Until the autoshift ends, traffic for the resource is instead directed to other Availability Zones in
     * the Amazon Web Services Region. An autoshift can end for a resource, for example, when Amazon Web Services ends
     * the autoshift for the Availability Zone or when you disable zonal autoshift for the resource.
     * </p>
     * 
     * @param awayFrom
     *        The Availability Zone that traffic is shifted away from for a resource when Amazon Web Services starts an
     *        autoshift. Until the autoshift ends, traffic for the resource is instead directed to other Availability
     *        Zones in the Amazon Web Services Region. An autoshift can end for a resource, for example, when Amazon Web
     *        Services ends the autoshift for the Availability Zone or when you disable zonal autoshift for the
     *        resource.
     */

    public void setAwayFrom(String awayFrom) {
        this.awayFrom = awayFrom;
    }

    /**
     * <p>
     * The Availability Zone that traffic is shifted away from for a resource when Amazon Web Services starts an
     * autoshift. Until the autoshift ends, traffic for the resource is instead directed to other Availability Zones in
     * the Amazon Web Services Region. An autoshift can end for a resource, for example, when Amazon Web Services ends
     * the autoshift for the Availability Zone or when you disable zonal autoshift for the resource.
     * </p>
     * 
     * @return The Availability Zone that traffic is shifted away from for a resource when Amazon Web Services starts an
     *         autoshift. Until the autoshift ends, traffic for the resource is instead directed to other Availability
     *         Zones in the Amazon Web Services Region. An autoshift can end for a resource, for example, when Amazon
     *         Web Services ends the autoshift for the Availability Zone or when you disable zonal autoshift for the
     *         resource.
     */

    public String getAwayFrom() {
        return this.awayFrom;
    }

    /**
     * <p>
     * The Availability Zone that traffic is shifted away from for a resource when Amazon Web Services starts an
     * autoshift. Until the autoshift ends, traffic for the resource is instead directed to other Availability Zones in
     * the Amazon Web Services Region. An autoshift can end for a resource, for example, when Amazon Web Services ends
     * the autoshift for the Availability Zone or when you disable zonal autoshift for the resource.
     * </p>
     * 
     * @param awayFrom
     *        The Availability Zone that traffic is shifted away from for a resource when Amazon Web Services starts an
     *        autoshift. Until the autoshift ends, traffic for the resource is instead directed to other Availability
     *        Zones in the Amazon Web Services Region. An autoshift can end for a resource, for example, when Amazon Web
     *        Services ends the autoshift for the Availability Zone or when you disable zonal autoshift for the
     *        resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoshiftSummary withAwayFrom(String awayFrom) {
        setAwayFrom(awayFrom);
        return this;
    }

    /**
     * <p>
     * The time (in UTC) when the autoshift ended.
     * </p>
     * 
     * @param endTime
     *        The time (in UTC) when the autoshift ended.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The time (in UTC) when the autoshift ended.
     * </p>
     * 
     * @return The time (in UTC) when the autoshift ended.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The time (in UTC) when the autoshift ended.
     * </p>
     * 
     * @param endTime
     *        The time (in UTC) when the autoshift ended.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoshiftSummary withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The time (in UTC) when the autoshift started.
     * </p>
     * 
     * @param startTime
     *        The time (in UTC) when the autoshift started.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time (in UTC) when the autoshift started.
     * </p>
     * 
     * @return The time (in UTC) when the autoshift started.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The time (in UTC) when the autoshift started.
     * </p>
     * 
     * @param startTime
     *        The time (in UTC) when the autoshift started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoshiftSummary withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The status for an autoshift.
     * </p>
     * 
     * @param status
     *        The status for an autoshift.
     * @see AutoshiftExecutionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status for an autoshift.
     * </p>
     * 
     * @return The status for an autoshift.
     * @see AutoshiftExecutionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status for an autoshift.
     * </p>
     * 
     * @param status
     *        The status for an autoshift.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoshiftExecutionStatus
     */

    public AutoshiftSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status for an autoshift.
     * </p>
     * 
     * @param status
     *        The status for an autoshift.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoshiftExecutionStatus
     */

    public AutoshiftSummary withStatus(AutoshiftExecutionStatus status) {
        this.status = status.toString();
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
        if (getAwayFrom() != null)
            sb.append("AwayFrom: ").append(getAwayFrom()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoshiftSummary == false)
            return false;
        AutoshiftSummary other = (AutoshiftSummary) obj;
        if (other.getAwayFrom() == null ^ this.getAwayFrom() == null)
            return false;
        if (other.getAwayFrom() != null && other.getAwayFrom().equals(this.getAwayFrom()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwayFrom() == null) ? 0 : getAwayFrom().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public AutoshiftSummary clone() {
        try {
            return (AutoshiftSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.arczonalshift.model.transform.AutoshiftSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
