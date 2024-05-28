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
 * A complex structure that lists the zonal shifts for a managed resource and their statuses for the resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/arc-zonal-shift-2022-10-30/ZonalShiftInResource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ZonalShiftInResource implements Serializable, Cloneable, StructuredPojo {

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
     * The Availability Zone that traffic is moved away from for a resource when you start a zonal shift. Until the
     * zonal shift expires or you cancel it, traffic for the resource is instead moved to other Availability Zones in
     * the Amazon Web Services Region.
     * </p>
     */
    private String awayFrom;
    /**
     * <p>
     * A comment that you enter about the zonal shift. Only the latest comment is retained; no comment history is
     * maintained. That is, a new comment overwrites any existing comment string.
     * </p>
     */
    private String comment;
    /**
     * <p>
     * The expiry time (expiration time) for a customer-started zonal shift. A zonal shift is temporary and must be set
     * to expire when you start the zonal shift. You can initially set a zonal shift to expire in a maximum of three
     * days (72 hours). However, you can update a zonal shift to set a new expiration at any time.
     * </p>
     * <p>
     * When you start a zonal shift, you specify how long you want it to be active, which Route 53 ARC converts to an
     * expiry time (expiration time). You can cancel a zonal shift when you're ready to restore traffic to the
     * Availability Zone, or just wait for it to expire. Or you can update the zonal shift to specify another length of
     * time to expire in.
     * </p>
     */
    private java.util.Date expiryTime;
    /**
     * <p>
     * The outcome, or end state, returned for a practice run. The following values can be returned:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>PENDING:</b> Outcome value when a practice run is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SUCCEEDED:</b> Outcome value when the outcome alarm specified for the practice run configuration does not go
     * into an <code>ALARM</code> state during the practice run, and the practice run was not interrupted before it
     * completed the expected 30 minute zonal shift.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>INTERRUPTED:</b> Outcome value when the practice run was stopped before the expected 30 minute zonal shift
     * duration, or there was another problem with the practice run that created an inconclusive outcome.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FAILED:</b> Outcome value when the outcome alarm specified for the practice run configuration goes into an
     * <code>ALARM</code> state during the practice run, and the practice run was not interrupted before it completed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about practice run outcomes, see <a
     * href="https://docs.aws.amazon.com/r53recovery/latest/dg/arc-zonal-autoshift.configure.html"> Considerations when
     * you configure zonal autoshift</a> in the Amazon Route 53 Application Recovery Controller Developer Guide.
     * </p>
     */
    private String practiceRunOutcome;
    /**
     * <p>
     * The identifier for the resource to include in a zonal shift. The identifier is the Amazon Resource Name (ARN) for
     * the resource.
     * </p>
     * <p>
     * At this time, you can only start a zonal shift for Network Load Balancers and Application Load Balancers with
     * cross-zone load balancing turned off.
     * </p>
     */
    private String resourceIdentifier;
    /**
     * <p>
     * The time (UTC) when the zonal shift starts.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The identifier of a zonal shift.
     * </p>
     */
    private String zonalShiftId;

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
     * @see AppliedStatus
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
     * @see AppliedStatus
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
     * @see AppliedStatus
     */

    public ZonalShiftInResource withAppliedStatus(String appliedStatus) {
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
     * @see AppliedStatus
     */

    public ZonalShiftInResource withAppliedStatus(AppliedStatus appliedStatus) {
        this.appliedStatus = appliedStatus.toString();
        return this;
    }

    /**
     * <p>
     * The Availability Zone that traffic is moved away from for a resource when you start a zonal shift. Until the
     * zonal shift expires or you cancel it, traffic for the resource is instead moved to other Availability Zones in
     * the Amazon Web Services Region.
     * </p>
     * 
     * @param awayFrom
     *        The Availability Zone that traffic is moved away from for a resource when you start a zonal shift. Until
     *        the zonal shift expires or you cancel it, traffic for the resource is instead moved to other Availability
     *        Zones in the Amazon Web Services Region.
     */

    public void setAwayFrom(String awayFrom) {
        this.awayFrom = awayFrom;
    }

    /**
     * <p>
     * The Availability Zone that traffic is moved away from for a resource when you start a zonal shift. Until the
     * zonal shift expires or you cancel it, traffic for the resource is instead moved to other Availability Zones in
     * the Amazon Web Services Region.
     * </p>
     * 
     * @return The Availability Zone that traffic is moved away from for a resource when you start a zonal shift. Until
     *         the zonal shift expires or you cancel it, traffic for the resource is instead moved to other Availability
     *         Zones in the Amazon Web Services Region.
     */

    public String getAwayFrom() {
        return this.awayFrom;
    }

    /**
     * <p>
     * The Availability Zone that traffic is moved away from for a resource when you start a zonal shift. Until the
     * zonal shift expires or you cancel it, traffic for the resource is instead moved to other Availability Zones in
     * the Amazon Web Services Region.
     * </p>
     * 
     * @param awayFrom
     *        The Availability Zone that traffic is moved away from for a resource when you start a zonal shift. Until
     *        the zonal shift expires or you cancel it, traffic for the resource is instead moved to other Availability
     *        Zones in the Amazon Web Services Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ZonalShiftInResource withAwayFrom(String awayFrom) {
        setAwayFrom(awayFrom);
        return this;
    }

    /**
     * <p>
     * A comment that you enter about the zonal shift. Only the latest comment is retained; no comment history is
     * maintained. That is, a new comment overwrites any existing comment string.
     * </p>
     * 
     * @param comment
     *        A comment that you enter about the zonal shift. Only the latest comment is retained; no comment history is
     *        maintained. That is, a new comment overwrites any existing comment string.
     */

    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * A comment that you enter about the zonal shift. Only the latest comment is retained; no comment history is
     * maintained. That is, a new comment overwrites any existing comment string.
     * </p>
     * 
     * @return A comment that you enter about the zonal shift. Only the latest comment is retained; no comment history
     *         is maintained. That is, a new comment overwrites any existing comment string.
     */

    public String getComment() {
        return this.comment;
    }

    /**
     * <p>
     * A comment that you enter about the zonal shift. Only the latest comment is retained; no comment history is
     * maintained. That is, a new comment overwrites any existing comment string.
     * </p>
     * 
     * @param comment
     *        A comment that you enter about the zonal shift. Only the latest comment is retained; no comment history is
     *        maintained. That is, a new comment overwrites any existing comment string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ZonalShiftInResource withComment(String comment) {
        setComment(comment);
        return this;
    }

    /**
     * <p>
     * The expiry time (expiration time) for a customer-started zonal shift. A zonal shift is temporary and must be set
     * to expire when you start the zonal shift. You can initially set a zonal shift to expire in a maximum of three
     * days (72 hours). However, you can update a zonal shift to set a new expiration at any time.
     * </p>
     * <p>
     * When you start a zonal shift, you specify how long you want it to be active, which Route 53 ARC converts to an
     * expiry time (expiration time). You can cancel a zonal shift when you're ready to restore traffic to the
     * Availability Zone, or just wait for it to expire. Or you can update the zonal shift to specify another length of
     * time to expire in.
     * </p>
     * 
     * @param expiryTime
     *        The expiry time (expiration time) for a customer-started zonal shift. A zonal shift is temporary and must
     *        be set to expire when you start the zonal shift. You can initially set a zonal shift to expire in a
     *        maximum of three days (72 hours). However, you can update a zonal shift to set a new expiration at any
     *        time. </p>
     *        <p>
     *        When you start a zonal shift, you specify how long you want it to be active, which Route 53 ARC converts
     *        to an expiry time (expiration time). You can cancel a zonal shift when you're ready to restore traffic to
     *        the Availability Zone, or just wait for it to expire. Or you can update the zonal shift to specify another
     *        length of time to expire in.
     */

    public void setExpiryTime(java.util.Date expiryTime) {
        this.expiryTime = expiryTime;
    }

    /**
     * <p>
     * The expiry time (expiration time) for a customer-started zonal shift. A zonal shift is temporary and must be set
     * to expire when you start the zonal shift. You can initially set a zonal shift to expire in a maximum of three
     * days (72 hours). However, you can update a zonal shift to set a new expiration at any time.
     * </p>
     * <p>
     * When you start a zonal shift, you specify how long you want it to be active, which Route 53 ARC converts to an
     * expiry time (expiration time). You can cancel a zonal shift when you're ready to restore traffic to the
     * Availability Zone, or just wait for it to expire. Or you can update the zonal shift to specify another length of
     * time to expire in.
     * </p>
     * 
     * @return The expiry time (expiration time) for a customer-started zonal shift. A zonal shift is temporary and must
     *         be set to expire when you start the zonal shift. You can initially set a zonal shift to expire in a
     *         maximum of three days (72 hours). However, you can update a zonal shift to set a new expiration at any
     *         time. </p>
     *         <p>
     *         When you start a zonal shift, you specify how long you want it to be active, which Route 53 ARC converts
     *         to an expiry time (expiration time). You can cancel a zonal shift when you're ready to restore traffic to
     *         the Availability Zone, or just wait for it to expire. Or you can update the zonal shift to specify
     *         another length of time to expire in.
     */

    public java.util.Date getExpiryTime() {
        return this.expiryTime;
    }

    /**
     * <p>
     * The expiry time (expiration time) for a customer-started zonal shift. A zonal shift is temporary and must be set
     * to expire when you start the zonal shift. You can initially set a zonal shift to expire in a maximum of three
     * days (72 hours). However, you can update a zonal shift to set a new expiration at any time.
     * </p>
     * <p>
     * When you start a zonal shift, you specify how long you want it to be active, which Route 53 ARC converts to an
     * expiry time (expiration time). You can cancel a zonal shift when you're ready to restore traffic to the
     * Availability Zone, or just wait for it to expire. Or you can update the zonal shift to specify another length of
     * time to expire in.
     * </p>
     * 
     * @param expiryTime
     *        The expiry time (expiration time) for a customer-started zonal shift. A zonal shift is temporary and must
     *        be set to expire when you start the zonal shift. You can initially set a zonal shift to expire in a
     *        maximum of three days (72 hours). However, you can update a zonal shift to set a new expiration at any
     *        time. </p>
     *        <p>
     *        When you start a zonal shift, you specify how long you want it to be active, which Route 53 ARC converts
     *        to an expiry time (expiration time). You can cancel a zonal shift when you're ready to restore traffic to
     *        the Availability Zone, or just wait for it to expire. Or you can update the zonal shift to specify another
     *        length of time to expire in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ZonalShiftInResource withExpiryTime(java.util.Date expiryTime) {
        setExpiryTime(expiryTime);
        return this;
    }

    /**
     * <p>
     * The outcome, or end state, returned for a practice run. The following values can be returned:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>PENDING:</b> Outcome value when a practice run is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SUCCEEDED:</b> Outcome value when the outcome alarm specified for the practice run configuration does not go
     * into an <code>ALARM</code> state during the practice run, and the practice run was not interrupted before it
     * completed the expected 30 minute zonal shift.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>INTERRUPTED:</b> Outcome value when the practice run was stopped before the expected 30 minute zonal shift
     * duration, or there was another problem with the practice run that created an inconclusive outcome.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FAILED:</b> Outcome value when the outcome alarm specified for the practice run configuration goes into an
     * <code>ALARM</code> state during the practice run, and the practice run was not interrupted before it completed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about practice run outcomes, see <a
     * href="https://docs.aws.amazon.com/r53recovery/latest/dg/arc-zonal-autoshift.configure.html"> Considerations when
     * you configure zonal autoshift</a> in the Amazon Route 53 Application Recovery Controller Developer Guide.
     * </p>
     * 
     * @param practiceRunOutcome
     *        The outcome, or end state, returned for a practice run. The following values can be returned:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>PENDING:</b> Outcome value when a practice run is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>SUCCEEDED:</b> Outcome value when the outcome alarm specified for the practice run configuration does
     *        not go into an <code>ALARM</code> state during the practice run, and the practice run was not interrupted
     *        before it completed the expected 30 minute zonal shift.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>INTERRUPTED:</b> Outcome value when the practice run was stopped before the expected 30 minute zonal
     *        shift duration, or there was another problem with the practice run that created an inconclusive outcome.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>FAILED:</b> Outcome value when the outcome alarm specified for the practice run configuration goes into
     *        an <code>ALARM</code> state during the practice run, and the practice run was not interrupted before it
     *        completed.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about practice run outcomes, see <a
     *        href="https://docs.aws.amazon.com/r53recovery/latest/dg/arc-zonal-autoshift.configure.html">
     *        Considerations when you configure zonal autoshift</a> in the Amazon Route 53 Application Recovery
     *        Controller Developer Guide.
     * @see PracticeRunOutcome
     */

    public void setPracticeRunOutcome(String practiceRunOutcome) {
        this.practiceRunOutcome = practiceRunOutcome;
    }

    /**
     * <p>
     * The outcome, or end state, returned for a practice run. The following values can be returned:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>PENDING:</b> Outcome value when a practice run is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SUCCEEDED:</b> Outcome value when the outcome alarm specified for the practice run configuration does not go
     * into an <code>ALARM</code> state during the practice run, and the practice run was not interrupted before it
     * completed the expected 30 minute zonal shift.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>INTERRUPTED:</b> Outcome value when the practice run was stopped before the expected 30 minute zonal shift
     * duration, or there was another problem with the practice run that created an inconclusive outcome.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FAILED:</b> Outcome value when the outcome alarm specified for the practice run configuration goes into an
     * <code>ALARM</code> state during the practice run, and the practice run was not interrupted before it completed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about practice run outcomes, see <a
     * href="https://docs.aws.amazon.com/r53recovery/latest/dg/arc-zonal-autoshift.configure.html"> Considerations when
     * you configure zonal autoshift</a> in the Amazon Route 53 Application Recovery Controller Developer Guide.
     * </p>
     * 
     * @return The outcome, or end state, returned for a practice run. The following values can be returned:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>PENDING:</b> Outcome value when a practice run is in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>SUCCEEDED:</b> Outcome value when the outcome alarm specified for the practice run configuration does
     *         not go into an <code>ALARM</code> state during the practice run, and the practice run was not interrupted
     *         before it completed the expected 30 minute zonal shift.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>INTERRUPTED:</b> Outcome value when the practice run was stopped before the expected 30 minute zonal
     *         shift duration, or there was another problem with the practice run that created an inconclusive outcome.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>FAILED:</b> Outcome value when the outcome alarm specified for the practice run configuration goes
     *         into an <code>ALARM</code> state during the practice run, and the practice run was not interrupted before
     *         it completed.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information about practice run outcomes, see <a
     *         href="https://docs.aws.amazon.com/r53recovery/latest/dg/arc-zonal-autoshift.configure.html">
     *         Considerations when you configure zonal autoshift</a> in the Amazon Route 53 Application Recovery
     *         Controller Developer Guide.
     * @see PracticeRunOutcome
     */

    public String getPracticeRunOutcome() {
        return this.practiceRunOutcome;
    }

    /**
     * <p>
     * The outcome, or end state, returned for a practice run. The following values can be returned:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>PENDING:</b> Outcome value when a practice run is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SUCCEEDED:</b> Outcome value when the outcome alarm specified for the practice run configuration does not go
     * into an <code>ALARM</code> state during the practice run, and the practice run was not interrupted before it
     * completed the expected 30 minute zonal shift.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>INTERRUPTED:</b> Outcome value when the practice run was stopped before the expected 30 minute zonal shift
     * duration, or there was another problem with the practice run that created an inconclusive outcome.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FAILED:</b> Outcome value when the outcome alarm specified for the practice run configuration goes into an
     * <code>ALARM</code> state during the practice run, and the practice run was not interrupted before it completed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about practice run outcomes, see <a
     * href="https://docs.aws.amazon.com/r53recovery/latest/dg/arc-zonal-autoshift.configure.html"> Considerations when
     * you configure zonal autoshift</a> in the Amazon Route 53 Application Recovery Controller Developer Guide.
     * </p>
     * 
     * @param practiceRunOutcome
     *        The outcome, or end state, returned for a practice run. The following values can be returned:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>PENDING:</b> Outcome value when a practice run is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>SUCCEEDED:</b> Outcome value when the outcome alarm specified for the practice run configuration does
     *        not go into an <code>ALARM</code> state during the practice run, and the practice run was not interrupted
     *        before it completed the expected 30 minute zonal shift.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>INTERRUPTED:</b> Outcome value when the practice run was stopped before the expected 30 minute zonal
     *        shift duration, or there was another problem with the practice run that created an inconclusive outcome.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>FAILED:</b> Outcome value when the outcome alarm specified for the practice run configuration goes into
     *        an <code>ALARM</code> state during the practice run, and the practice run was not interrupted before it
     *        completed.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about practice run outcomes, see <a
     *        href="https://docs.aws.amazon.com/r53recovery/latest/dg/arc-zonal-autoshift.configure.html">
     *        Considerations when you configure zonal autoshift</a> in the Amazon Route 53 Application Recovery
     *        Controller Developer Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PracticeRunOutcome
     */

    public ZonalShiftInResource withPracticeRunOutcome(String practiceRunOutcome) {
        setPracticeRunOutcome(practiceRunOutcome);
        return this;
    }

    /**
     * <p>
     * The outcome, or end state, returned for a practice run. The following values can be returned:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>PENDING:</b> Outcome value when a practice run is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SUCCEEDED:</b> Outcome value when the outcome alarm specified for the practice run configuration does not go
     * into an <code>ALARM</code> state during the practice run, and the practice run was not interrupted before it
     * completed the expected 30 minute zonal shift.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>INTERRUPTED:</b> Outcome value when the practice run was stopped before the expected 30 minute zonal shift
     * duration, or there was another problem with the practice run that created an inconclusive outcome.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FAILED:</b> Outcome value when the outcome alarm specified for the practice run configuration goes into an
     * <code>ALARM</code> state during the practice run, and the practice run was not interrupted before it completed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about practice run outcomes, see <a
     * href="https://docs.aws.amazon.com/r53recovery/latest/dg/arc-zonal-autoshift.configure.html"> Considerations when
     * you configure zonal autoshift</a> in the Amazon Route 53 Application Recovery Controller Developer Guide.
     * </p>
     * 
     * @param practiceRunOutcome
     *        The outcome, or end state, returned for a practice run. The following values can be returned:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>PENDING:</b> Outcome value when a practice run is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>SUCCEEDED:</b> Outcome value when the outcome alarm specified for the practice run configuration does
     *        not go into an <code>ALARM</code> state during the practice run, and the practice run was not interrupted
     *        before it completed the expected 30 minute zonal shift.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>INTERRUPTED:</b> Outcome value when the practice run was stopped before the expected 30 minute zonal
     *        shift duration, or there was another problem with the practice run that created an inconclusive outcome.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>FAILED:</b> Outcome value when the outcome alarm specified for the practice run configuration goes into
     *        an <code>ALARM</code> state during the practice run, and the practice run was not interrupted before it
     *        completed.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about practice run outcomes, see <a
     *        href="https://docs.aws.amazon.com/r53recovery/latest/dg/arc-zonal-autoshift.configure.html">
     *        Considerations when you configure zonal autoshift</a> in the Amazon Route 53 Application Recovery
     *        Controller Developer Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PracticeRunOutcome
     */

    public ZonalShiftInResource withPracticeRunOutcome(PracticeRunOutcome practiceRunOutcome) {
        this.practiceRunOutcome = practiceRunOutcome.toString();
        return this;
    }

    /**
     * <p>
     * The identifier for the resource to include in a zonal shift. The identifier is the Amazon Resource Name (ARN) for
     * the resource.
     * </p>
     * <p>
     * At this time, you can only start a zonal shift for Network Load Balancers and Application Load Balancers with
     * cross-zone load balancing turned off.
     * </p>
     * 
     * @param resourceIdentifier
     *        The identifier for the resource to include in a zonal shift. The identifier is the Amazon Resource Name
     *        (ARN) for the resource.</p>
     *        <p>
     *        At this time, you can only start a zonal shift for Network Load Balancers and Application Load Balancers
     *        with cross-zone load balancing turned off.
     */

    public void setResourceIdentifier(String resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
    }

    /**
     * <p>
     * The identifier for the resource to include in a zonal shift. The identifier is the Amazon Resource Name (ARN) for
     * the resource.
     * </p>
     * <p>
     * At this time, you can only start a zonal shift for Network Load Balancers and Application Load Balancers with
     * cross-zone load balancing turned off.
     * </p>
     * 
     * @return The identifier for the resource to include in a zonal shift. The identifier is the Amazon Resource Name
     *         (ARN) for the resource.</p>
     *         <p>
     *         At this time, you can only start a zonal shift for Network Load Balancers and Application Load Balancers
     *         with cross-zone load balancing turned off.
     */

    public String getResourceIdentifier() {
        return this.resourceIdentifier;
    }

    /**
     * <p>
     * The identifier for the resource to include in a zonal shift. The identifier is the Amazon Resource Name (ARN) for
     * the resource.
     * </p>
     * <p>
     * At this time, you can only start a zonal shift for Network Load Balancers and Application Load Balancers with
     * cross-zone load balancing turned off.
     * </p>
     * 
     * @param resourceIdentifier
     *        The identifier for the resource to include in a zonal shift. The identifier is the Amazon Resource Name
     *        (ARN) for the resource.</p>
     *        <p>
     *        At this time, you can only start a zonal shift for Network Load Balancers and Application Load Balancers
     *        with cross-zone load balancing turned off.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ZonalShiftInResource withResourceIdentifier(String resourceIdentifier) {
        setResourceIdentifier(resourceIdentifier);
        return this;
    }

    /**
     * <p>
     * The time (UTC) when the zonal shift starts.
     * </p>
     * 
     * @param startTime
     *        The time (UTC) when the zonal shift starts.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time (UTC) when the zonal shift starts.
     * </p>
     * 
     * @return The time (UTC) when the zonal shift starts.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The time (UTC) when the zonal shift starts.
     * </p>
     * 
     * @param startTime
     *        The time (UTC) when the zonal shift starts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ZonalShiftInResource withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The identifier of a zonal shift.
     * </p>
     * 
     * @param zonalShiftId
     *        The identifier of a zonal shift.
     */

    public void setZonalShiftId(String zonalShiftId) {
        this.zonalShiftId = zonalShiftId;
    }

    /**
     * <p>
     * The identifier of a zonal shift.
     * </p>
     * 
     * @return The identifier of a zonal shift.
     */

    public String getZonalShiftId() {
        return this.zonalShiftId;
    }

    /**
     * <p>
     * The identifier of a zonal shift.
     * </p>
     * 
     * @param zonalShiftId
     *        The identifier of a zonal shift.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ZonalShiftInResource withZonalShiftId(String zonalShiftId) {
        setZonalShiftId(zonalShiftId);
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
        if (getComment() != null)
            sb.append("Comment: ").append(getComment()).append(",");
        if (getExpiryTime() != null)
            sb.append("ExpiryTime: ").append(getExpiryTime()).append(",");
        if (getPracticeRunOutcome() != null)
            sb.append("PracticeRunOutcome: ").append(getPracticeRunOutcome()).append(",");
        if (getResourceIdentifier() != null)
            sb.append("ResourceIdentifier: ").append(getResourceIdentifier()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getZonalShiftId() != null)
            sb.append("ZonalShiftId: ").append(getZonalShiftId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ZonalShiftInResource == false)
            return false;
        ZonalShiftInResource other = (ZonalShiftInResource) obj;
        if (other.getAppliedStatus() == null ^ this.getAppliedStatus() == null)
            return false;
        if (other.getAppliedStatus() != null && other.getAppliedStatus().equals(this.getAppliedStatus()) == false)
            return false;
        if (other.getAwayFrom() == null ^ this.getAwayFrom() == null)
            return false;
        if (other.getAwayFrom() != null && other.getAwayFrom().equals(this.getAwayFrom()) == false)
            return false;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        if (other.getExpiryTime() == null ^ this.getExpiryTime() == null)
            return false;
        if (other.getExpiryTime() != null && other.getExpiryTime().equals(this.getExpiryTime()) == false)
            return false;
        if (other.getPracticeRunOutcome() == null ^ this.getPracticeRunOutcome() == null)
            return false;
        if (other.getPracticeRunOutcome() != null && other.getPracticeRunOutcome().equals(this.getPracticeRunOutcome()) == false)
            return false;
        if (other.getResourceIdentifier() == null ^ this.getResourceIdentifier() == null)
            return false;
        if (other.getResourceIdentifier() != null && other.getResourceIdentifier().equals(this.getResourceIdentifier()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getZonalShiftId() == null ^ this.getZonalShiftId() == null)
            return false;
        if (other.getZonalShiftId() != null && other.getZonalShiftId().equals(this.getZonalShiftId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppliedStatus() == null) ? 0 : getAppliedStatus().hashCode());
        hashCode = prime * hashCode + ((getAwayFrom() == null) ? 0 : getAwayFrom().hashCode());
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        hashCode = prime * hashCode + ((getExpiryTime() == null) ? 0 : getExpiryTime().hashCode());
        hashCode = prime * hashCode + ((getPracticeRunOutcome() == null) ? 0 : getPracticeRunOutcome().hashCode());
        hashCode = prime * hashCode + ((getResourceIdentifier() == null) ? 0 : getResourceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getZonalShiftId() == null) ? 0 : getZonalShiftId().hashCode());
        return hashCode;
    }

    @Override
    public ZonalShiftInResource clone() {
        try {
            return (ZonalShiftInResource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.arczonalshift.model.transform.ZonalShiftInResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
