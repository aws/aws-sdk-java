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
 * A complex structure that lists an autoshift that is currently active for a managed resource and information about the
 * autoshift.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/r53recovery/latest/dg/arc-zonal-autoshift.how-it-works.html">How zonal autoshift
 * and practice runs work</a> in the Amazon Route 53 Application Recovery Controller Developer Guide.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/arc-zonal-shift-2022-10-30/AutoshiftInResource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoshiftInResource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The <code>appliedStatus</code> field specifies which application traffic shift is in effect for a resource when
     * there is more than one traffic shift active. There can be more than one application traffic shift in progress at
     * the same time - that is, practice run zonal shifts, customer-started zonal shifts, or an autoshift. The
     * <code>appliedStatus</code> field for an autoshift for a resource can have one of two values: <code>APPLIED</code>
     * or <code>NOT_APPLIED</code>. The zonal shift or autoshift that is currently in effect for the resource has an
     * applied status set to <code>APPLIED</code>.
     * </p>
     * <p>
     * The overall principle for precedence is that zonal shifts that you start as a customer take precedence
     * autoshifts, which take precedence over practice runs. That is, customer-started zonal shifts &gt; autoshifts &gt;
     * practice run zonal shifts.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/r53recovery/latest/dg/arc-zonal-autoshift.how-it-works.html">How zonal
     * autoshift and practice runs work</a> in the Amazon Route 53 Application Recovery Controller Developer Guide.
     * </p>
     */
    private String appliedStatus;
    /**
     * <p>
     * The Availability Zone that traffic is shifted away from for a resource, when Amazon Web Services starts an
     * autoshift. Until the autoshift ends, traffic for the resource is instead directed to other Availability Zones in
     * the Amazon Web Services Region. An autoshift can end for a resource, for example, when Amazon Web Services ends
     * the autoshift for the Availability Zone or when you disable zonal autoshift for the resource.
     * </p>
     */
    private String awayFrom;
    /**
     * <p>
     * The time (UTC) when the autoshift started.
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * The <code>appliedStatus</code> field specifies which application traffic shift is in effect for a resource when
     * there is more than one traffic shift active. There can be more than one application traffic shift in progress at
     * the same time - that is, practice run zonal shifts, customer-started zonal shifts, or an autoshift. The
     * <code>appliedStatus</code> field for an autoshift for a resource can have one of two values: <code>APPLIED</code>
     * or <code>NOT_APPLIED</code>. The zonal shift or autoshift that is currently in effect for the resource has an
     * applied status set to <code>APPLIED</code>.
     * </p>
     * <p>
     * The overall principle for precedence is that zonal shifts that you start as a customer take precedence
     * autoshifts, which take precedence over practice runs. That is, customer-started zonal shifts &gt; autoshifts &gt;
     * practice run zonal shifts.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/r53recovery/latest/dg/arc-zonal-autoshift.how-it-works.html">How zonal
     * autoshift and practice runs work</a> in the Amazon Route 53 Application Recovery Controller Developer Guide.
     * </p>
     * 
     * @param appliedStatus
     *        The <code>appliedStatus</code> field specifies which application traffic shift is in effect for a resource
     *        when there is more than one traffic shift active. There can be more than one application traffic shift in
     *        progress at the same time - that is, practice run zonal shifts, customer-started zonal shifts, or an
     *        autoshift. The <code>appliedStatus</code> field for an autoshift for a resource can have one of two
     *        values: <code>APPLIED</code> or <code>NOT_APPLIED</code>. The zonal shift or autoshift that is currently
     *        in effect for the resource has an applied status set to <code>APPLIED</code>.</p>
     *        <p>
     *        The overall principle for precedence is that zonal shifts that you start as a customer take precedence
     *        autoshifts, which take precedence over practice runs. That is, customer-started zonal shifts &gt;
     *        autoshifts &gt; practice run zonal shifts.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/r53recovery/latest/dg/arc-zonal-autoshift.how-it-works.html">How zonal
     *        autoshift and practice runs work</a> in the Amazon Route 53 Application Recovery Controller Developer
     *        Guide.
     * @see AutoshiftAppliedStatus
     */

    public void setAppliedStatus(String appliedStatus) {
        this.appliedStatus = appliedStatus;
    }

    /**
     * <p>
     * The <code>appliedStatus</code> field specifies which application traffic shift is in effect for a resource when
     * there is more than one traffic shift active. There can be more than one application traffic shift in progress at
     * the same time - that is, practice run zonal shifts, customer-started zonal shifts, or an autoshift. The
     * <code>appliedStatus</code> field for an autoshift for a resource can have one of two values: <code>APPLIED</code>
     * or <code>NOT_APPLIED</code>. The zonal shift or autoshift that is currently in effect for the resource has an
     * applied status set to <code>APPLIED</code>.
     * </p>
     * <p>
     * The overall principle for precedence is that zonal shifts that you start as a customer take precedence
     * autoshifts, which take precedence over practice runs. That is, customer-started zonal shifts &gt; autoshifts &gt;
     * practice run zonal shifts.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/r53recovery/latest/dg/arc-zonal-autoshift.how-it-works.html">How zonal
     * autoshift and practice runs work</a> in the Amazon Route 53 Application Recovery Controller Developer Guide.
     * </p>
     * 
     * @return The <code>appliedStatus</code> field specifies which application traffic shift is in effect for a
     *         resource when there is more than one traffic shift active. There can be more than one application traffic
     *         shift in progress at the same time - that is, practice run zonal shifts, customer-started zonal shifts,
     *         or an autoshift. The <code>appliedStatus</code> field for an autoshift for a resource can have one of two
     *         values: <code>APPLIED</code> or <code>NOT_APPLIED</code>. The zonal shift or autoshift that is currently
     *         in effect for the resource has an applied status set to <code>APPLIED</code>.</p>
     *         <p>
     *         The overall principle for precedence is that zonal shifts that you start as a customer take precedence
     *         autoshifts, which take precedence over practice runs. That is, customer-started zonal shifts &gt;
     *         autoshifts &gt; practice run zonal shifts.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/r53recovery/latest/dg/arc-zonal-autoshift.how-it-works.html">How zonal
     *         autoshift and practice runs work</a> in the Amazon Route 53 Application Recovery Controller Developer
     *         Guide.
     * @see AutoshiftAppliedStatus
     */

    public String getAppliedStatus() {
        return this.appliedStatus;
    }

    /**
     * <p>
     * The <code>appliedStatus</code> field specifies which application traffic shift is in effect for a resource when
     * there is more than one traffic shift active. There can be more than one application traffic shift in progress at
     * the same time - that is, practice run zonal shifts, customer-started zonal shifts, or an autoshift. The
     * <code>appliedStatus</code> field for an autoshift for a resource can have one of two values: <code>APPLIED</code>
     * or <code>NOT_APPLIED</code>. The zonal shift or autoshift that is currently in effect for the resource has an
     * applied status set to <code>APPLIED</code>.
     * </p>
     * <p>
     * The overall principle for precedence is that zonal shifts that you start as a customer take precedence
     * autoshifts, which take precedence over practice runs. That is, customer-started zonal shifts &gt; autoshifts &gt;
     * practice run zonal shifts.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/r53recovery/latest/dg/arc-zonal-autoshift.how-it-works.html">How zonal
     * autoshift and practice runs work</a> in the Amazon Route 53 Application Recovery Controller Developer Guide.
     * </p>
     * 
     * @param appliedStatus
     *        The <code>appliedStatus</code> field specifies which application traffic shift is in effect for a resource
     *        when there is more than one traffic shift active. There can be more than one application traffic shift in
     *        progress at the same time - that is, practice run zonal shifts, customer-started zonal shifts, or an
     *        autoshift. The <code>appliedStatus</code> field for an autoshift for a resource can have one of two
     *        values: <code>APPLIED</code> or <code>NOT_APPLIED</code>. The zonal shift or autoshift that is currently
     *        in effect for the resource has an applied status set to <code>APPLIED</code>.</p>
     *        <p>
     *        The overall principle for precedence is that zonal shifts that you start as a customer take precedence
     *        autoshifts, which take precedence over practice runs. That is, customer-started zonal shifts &gt;
     *        autoshifts &gt; practice run zonal shifts.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/r53recovery/latest/dg/arc-zonal-autoshift.how-it-works.html">How zonal
     *        autoshift and practice runs work</a> in the Amazon Route 53 Application Recovery Controller Developer
     *        Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoshiftAppliedStatus
     */

    public AutoshiftInResource withAppliedStatus(String appliedStatus) {
        setAppliedStatus(appliedStatus);
        return this;
    }

    /**
     * <p>
     * The <code>appliedStatus</code> field specifies which application traffic shift is in effect for a resource when
     * there is more than one traffic shift active. There can be more than one application traffic shift in progress at
     * the same time - that is, practice run zonal shifts, customer-started zonal shifts, or an autoshift. The
     * <code>appliedStatus</code> field for an autoshift for a resource can have one of two values: <code>APPLIED</code>
     * or <code>NOT_APPLIED</code>. The zonal shift or autoshift that is currently in effect for the resource has an
     * applied status set to <code>APPLIED</code>.
     * </p>
     * <p>
     * The overall principle for precedence is that zonal shifts that you start as a customer take precedence
     * autoshifts, which take precedence over practice runs. That is, customer-started zonal shifts &gt; autoshifts &gt;
     * practice run zonal shifts.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/r53recovery/latest/dg/arc-zonal-autoshift.how-it-works.html">How zonal
     * autoshift and practice runs work</a> in the Amazon Route 53 Application Recovery Controller Developer Guide.
     * </p>
     * 
     * @param appliedStatus
     *        The <code>appliedStatus</code> field specifies which application traffic shift is in effect for a resource
     *        when there is more than one traffic shift active. There can be more than one application traffic shift in
     *        progress at the same time - that is, practice run zonal shifts, customer-started zonal shifts, or an
     *        autoshift. The <code>appliedStatus</code> field for an autoshift for a resource can have one of two
     *        values: <code>APPLIED</code> or <code>NOT_APPLIED</code>. The zonal shift or autoshift that is currently
     *        in effect for the resource has an applied status set to <code>APPLIED</code>.</p>
     *        <p>
     *        The overall principle for precedence is that zonal shifts that you start as a customer take precedence
     *        autoshifts, which take precedence over practice runs. That is, customer-started zonal shifts &gt;
     *        autoshifts &gt; practice run zonal shifts.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/r53recovery/latest/dg/arc-zonal-autoshift.how-it-works.html">How zonal
     *        autoshift and practice runs work</a> in the Amazon Route 53 Application Recovery Controller Developer
     *        Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoshiftAppliedStatus
     */

    public AutoshiftInResource withAppliedStatus(AutoshiftAppliedStatus appliedStatus) {
        this.appliedStatus = appliedStatus.toString();
        return this;
    }

    /**
     * <p>
     * The Availability Zone that traffic is shifted away from for a resource, when Amazon Web Services starts an
     * autoshift. Until the autoshift ends, traffic for the resource is instead directed to other Availability Zones in
     * the Amazon Web Services Region. An autoshift can end for a resource, for example, when Amazon Web Services ends
     * the autoshift for the Availability Zone or when you disable zonal autoshift for the resource.
     * </p>
     * 
     * @param awayFrom
     *        The Availability Zone that traffic is shifted away from for a resource, when Amazon Web Services starts an
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
     * The Availability Zone that traffic is shifted away from for a resource, when Amazon Web Services starts an
     * autoshift. Until the autoshift ends, traffic for the resource is instead directed to other Availability Zones in
     * the Amazon Web Services Region. An autoshift can end for a resource, for example, when Amazon Web Services ends
     * the autoshift for the Availability Zone or when you disable zonal autoshift for the resource.
     * </p>
     * 
     * @return The Availability Zone that traffic is shifted away from for a resource, when Amazon Web Services starts
     *         an autoshift. Until the autoshift ends, traffic for the resource is instead directed to other
     *         Availability Zones in the Amazon Web Services Region. An autoshift can end for a resource, for example,
     *         when Amazon Web Services ends the autoshift for the Availability Zone or when you disable zonal autoshift
     *         for the resource.
     */

    public String getAwayFrom() {
        return this.awayFrom;
    }

    /**
     * <p>
     * The Availability Zone that traffic is shifted away from for a resource, when Amazon Web Services starts an
     * autoshift. Until the autoshift ends, traffic for the resource is instead directed to other Availability Zones in
     * the Amazon Web Services Region. An autoshift can end for a resource, for example, when Amazon Web Services ends
     * the autoshift for the Availability Zone or when you disable zonal autoshift for the resource.
     * </p>
     * 
     * @param awayFrom
     *        The Availability Zone that traffic is shifted away from for a resource, when Amazon Web Services starts an
     *        autoshift. Until the autoshift ends, traffic for the resource is instead directed to other Availability
     *        Zones in the Amazon Web Services Region. An autoshift can end for a resource, for example, when Amazon Web
     *        Services ends the autoshift for the Availability Zone or when you disable zonal autoshift for the
     *        resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoshiftInResource withAwayFrom(String awayFrom) {
        setAwayFrom(awayFrom);
        return this;
    }

    /**
     * <p>
     * The time (UTC) when the autoshift started.
     * </p>
     * 
     * @param startTime
     *        The time (UTC) when the autoshift started.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time (UTC) when the autoshift started.
     * </p>
     * 
     * @return The time (UTC) when the autoshift started.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The time (UTC) when the autoshift started.
     * </p>
     * 
     * @param startTime
     *        The time (UTC) when the autoshift started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoshiftInResource withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
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
        if (getAppliedStatus() != null)
            sb.append("AppliedStatus: ").append(getAppliedStatus()).append(",");
        if (getAwayFrom() != null)
            sb.append("AwayFrom: ").append(getAwayFrom()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoshiftInResource == false)
            return false;
        AutoshiftInResource other = (AutoshiftInResource) obj;
        if (other.getAppliedStatus() == null ^ this.getAppliedStatus() == null)
            return false;
        if (other.getAppliedStatus() != null && other.getAppliedStatus().equals(this.getAppliedStatus()) == false)
            return false;
        if (other.getAwayFrom() == null ^ this.getAwayFrom() == null)
            return false;
        if (other.getAwayFrom() != null && other.getAwayFrom().equals(this.getAwayFrom()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppliedStatus() == null) ? 0 : getAppliedStatus().hashCode());
        hashCode = prime * hashCode + ((getAwayFrom() == null) ? 0 : getAwayFrom().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        return hashCode;
    }

    @Override
    public AutoshiftInResource clone() {
        try {
            return (AutoshiftInResource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.arczonalshift.model.transform.AutoshiftInResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
