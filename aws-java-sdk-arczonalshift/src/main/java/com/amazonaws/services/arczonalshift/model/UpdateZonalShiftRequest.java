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
package com.amazonaws.services.arczonalshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/arc-zonal-shift-2022-10-30/UpdateZonalShift" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateZonalShiftRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A comment that you enter about the zonal shift. Only the latest comment is retained; no comment history is
     * maintained. A new comment overwrites any existing comment string.
     * </p>
     */
    private String comment;
    /**
     * <p>
     * The length of time that you want a zonal shift to be active, which Route 53 ARC converts to an expiry time
     * (expiration time). Zonal shifts are temporary. You can set a zonal shift to be active initially for up to three
     * days (72 hours).
     * </p>
     * <p>
     * If you want to still keep traffic away from an Availability Zone, you can update the zonal shift and set a new
     * expiration. You can also cancel a zonal shift, before it expires, for example, if you're ready to restore traffic
     * to the Availability Zone.
     * </p>
     * <p>
     * To set a length of time for a zonal shift to be active, specify a whole number, and then one of the following,
     * with no space:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>A lowercase letter m:</b> To specify that the value is in minutes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>A lowercase letter h:</b> To specify that the value is in hours.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example: <code>20h</code> means the zonal shift expires in 20 hours. <code>120m</code> means the zonal shift
     * expires in 120 minutes (2 hours).
     * </p>
     */
    private String expiresIn;
    /**
     * <p>
     * The identifier of a zonal shift.
     * </p>
     */
    private String zonalShiftId;

    /**
     * <p>
     * A comment that you enter about the zonal shift. Only the latest comment is retained; no comment history is
     * maintained. A new comment overwrites any existing comment string.
     * </p>
     * 
     * @param comment
     *        A comment that you enter about the zonal shift. Only the latest comment is retained; no comment history is
     *        maintained. A new comment overwrites any existing comment string.
     */

    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * A comment that you enter about the zonal shift. Only the latest comment is retained; no comment history is
     * maintained. A new comment overwrites any existing comment string.
     * </p>
     * 
     * @return A comment that you enter about the zonal shift. Only the latest comment is retained; no comment history
     *         is maintained. A new comment overwrites any existing comment string.
     */

    public String getComment() {
        return this.comment;
    }

    /**
     * <p>
     * A comment that you enter about the zonal shift. Only the latest comment is retained; no comment history is
     * maintained. A new comment overwrites any existing comment string.
     * </p>
     * 
     * @param comment
     *        A comment that you enter about the zonal shift. Only the latest comment is retained; no comment history is
     *        maintained. A new comment overwrites any existing comment string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateZonalShiftRequest withComment(String comment) {
        setComment(comment);
        return this;
    }

    /**
     * <p>
     * The length of time that you want a zonal shift to be active, which Route 53 ARC converts to an expiry time
     * (expiration time). Zonal shifts are temporary. You can set a zonal shift to be active initially for up to three
     * days (72 hours).
     * </p>
     * <p>
     * If you want to still keep traffic away from an Availability Zone, you can update the zonal shift and set a new
     * expiration. You can also cancel a zonal shift, before it expires, for example, if you're ready to restore traffic
     * to the Availability Zone.
     * </p>
     * <p>
     * To set a length of time for a zonal shift to be active, specify a whole number, and then one of the following,
     * with no space:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>A lowercase letter m:</b> To specify that the value is in minutes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>A lowercase letter h:</b> To specify that the value is in hours.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example: <code>20h</code> means the zonal shift expires in 20 hours. <code>120m</code> means the zonal shift
     * expires in 120 minutes (2 hours).
     * </p>
     * 
     * @param expiresIn
     *        The length of time that you want a zonal shift to be active, which Route 53 ARC converts to an expiry time
     *        (expiration time). Zonal shifts are temporary. You can set a zonal shift to be active initially for up to
     *        three days (72 hours).</p>
     *        <p>
     *        If you want to still keep traffic away from an Availability Zone, you can update the zonal shift and set a
     *        new expiration. You can also cancel a zonal shift, before it expires, for example, if you're ready to
     *        restore traffic to the Availability Zone.
     *        </p>
     *        <p>
     *        To set a length of time for a zonal shift to be active, specify a whole number, and then one of the
     *        following, with no space:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>A lowercase letter m:</b> To specify that the value is in minutes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>A lowercase letter h:</b> To specify that the value is in hours.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For example: <code>20h</code> means the zonal shift expires in 20 hours. <code>120m</code> means the zonal
     *        shift expires in 120 minutes (2 hours).
     */

    public void setExpiresIn(String expiresIn) {
        this.expiresIn = expiresIn;
    }

    /**
     * <p>
     * The length of time that you want a zonal shift to be active, which Route 53 ARC converts to an expiry time
     * (expiration time). Zonal shifts are temporary. You can set a zonal shift to be active initially for up to three
     * days (72 hours).
     * </p>
     * <p>
     * If you want to still keep traffic away from an Availability Zone, you can update the zonal shift and set a new
     * expiration. You can also cancel a zonal shift, before it expires, for example, if you're ready to restore traffic
     * to the Availability Zone.
     * </p>
     * <p>
     * To set a length of time for a zonal shift to be active, specify a whole number, and then one of the following,
     * with no space:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>A lowercase letter m:</b> To specify that the value is in minutes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>A lowercase letter h:</b> To specify that the value is in hours.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example: <code>20h</code> means the zonal shift expires in 20 hours. <code>120m</code> means the zonal shift
     * expires in 120 minutes (2 hours).
     * </p>
     * 
     * @return The length of time that you want a zonal shift to be active, which Route 53 ARC converts to an expiry
     *         time (expiration time). Zonal shifts are temporary. You can set a zonal shift to be active initially for
     *         up to three days (72 hours).</p>
     *         <p>
     *         If you want to still keep traffic away from an Availability Zone, you can update the zonal shift and set
     *         a new expiration. You can also cancel a zonal shift, before it expires, for example, if you're ready to
     *         restore traffic to the Availability Zone.
     *         </p>
     *         <p>
     *         To set a length of time for a zonal shift to be active, specify a whole number, and then one of the
     *         following, with no space:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>A lowercase letter m:</b> To specify that the value is in minutes.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>A lowercase letter h:</b> To specify that the value is in hours.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For example: <code>20h</code> means the zonal shift expires in 20 hours. <code>120m</code> means the
     *         zonal shift expires in 120 minutes (2 hours).
     */

    public String getExpiresIn() {
        return this.expiresIn;
    }

    /**
     * <p>
     * The length of time that you want a zonal shift to be active, which Route 53 ARC converts to an expiry time
     * (expiration time). Zonal shifts are temporary. You can set a zonal shift to be active initially for up to three
     * days (72 hours).
     * </p>
     * <p>
     * If you want to still keep traffic away from an Availability Zone, you can update the zonal shift and set a new
     * expiration. You can also cancel a zonal shift, before it expires, for example, if you're ready to restore traffic
     * to the Availability Zone.
     * </p>
     * <p>
     * To set a length of time for a zonal shift to be active, specify a whole number, and then one of the following,
     * with no space:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>A lowercase letter m:</b> To specify that the value is in minutes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>A lowercase letter h:</b> To specify that the value is in hours.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example: <code>20h</code> means the zonal shift expires in 20 hours. <code>120m</code> means the zonal shift
     * expires in 120 minutes (2 hours).
     * </p>
     * 
     * @param expiresIn
     *        The length of time that you want a zonal shift to be active, which Route 53 ARC converts to an expiry time
     *        (expiration time). Zonal shifts are temporary. You can set a zonal shift to be active initially for up to
     *        three days (72 hours).</p>
     *        <p>
     *        If you want to still keep traffic away from an Availability Zone, you can update the zonal shift and set a
     *        new expiration. You can also cancel a zonal shift, before it expires, for example, if you're ready to
     *        restore traffic to the Availability Zone.
     *        </p>
     *        <p>
     *        To set a length of time for a zonal shift to be active, specify a whole number, and then one of the
     *        following, with no space:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>A lowercase letter m:</b> To specify that the value is in minutes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>A lowercase letter h:</b> To specify that the value is in hours.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For example: <code>20h</code> means the zonal shift expires in 20 hours. <code>120m</code> means the zonal
     *        shift expires in 120 minutes (2 hours).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateZonalShiftRequest withExpiresIn(String expiresIn) {
        setExpiresIn(expiresIn);
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

    public UpdateZonalShiftRequest withZonalShiftId(String zonalShiftId) {
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
        if (getComment() != null)
            sb.append("Comment: ").append(getComment()).append(",");
        if (getExpiresIn() != null)
            sb.append("ExpiresIn: ").append(getExpiresIn()).append(",");
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

        if (obj instanceof UpdateZonalShiftRequest == false)
            return false;
        UpdateZonalShiftRequest other = (UpdateZonalShiftRequest) obj;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        if (other.getExpiresIn() == null ^ this.getExpiresIn() == null)
            return false;
        if (other.getExpiresIn() != null && other.getExpiresIn().equals(this.getExpiresIn()) == false)
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

        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        hashCode = prime * hashCode + ((getExpiresIn() == null) ? 0 : getExpiresIn().hashCode());
        hashCode = prime * hashCode + ((getZonalShiftId() == null) ? 0 : getZonalShiftId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateZonalShiftRequest clone() {
        return (UpdateZonalShiftRequest) super.clone();
    }

}
