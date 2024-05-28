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
package com.amazonaws.services.private5g.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Determines the duration and renewal status of the commitment period for a radio unit.
 * </p>
 * <p>
 * For pricing, see <a href="http://aws.amazon.com/private5g/pricing">Amazon Web Services Private 5G Pricing</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/CommitmentConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CommitmentConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Determines whether the commitment period for a radio unit is set to automatically renew for an additional 1 year
     * after your current commitment period expires.
     * </p>
     * <p>
     * Set to <code>True</code>, if you want your commitment period to automatically renew. Set to <code>False</code> if
     * you do not want your commitment to automatically renew.
     * </p>
     * <p>
     * You can do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Set a 1-year commitment to automatically renew for an additional 1 year. The hourly rate for the additional year
     * will continue to be the same as your existing 1-year rate.
     * </p>
     * </li>
     * <li>
     * <p>
     * Set a 3-year commitment to automatically renew for an additional 1 year. The hourly rate for the additional year
     * will continue to be the same as your existing 3-year rate.
     * </p>
     * </li>
     * <li>
     * <p>
     * Turn off a previously-enabled automatic renewal on a 1-year or 3-year commitment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You cannot use the automatic-renewal option for a 60-day commitment.
     * </p>
     */
    private Boolean automaticRenewal;
    /**
     * <p>
     * The duration of the commitment period for the radio unit. You can choose a 60-day, 1-year, or 3-year period.
     * </p>
     */
    private String commitmentLength;

    /**
     * <p>
     * Determines whether the commitment period for a radio unit is set to automatically renew for an additional 1 year
     * after your current commitment period expires.
     * </p>
     * <p>
     * Set to <code>True</code>, if you want your commitment period to automatically renew. Set to <code>False</code> if
     * you do not want your commitment to automatically renew.
     * </p>
     * <p>
     * You can do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Set a 1-year commitment to automatically renew for an additional 1 year. The hourly rate for the additional year
     * will continue to be the same as your existing 1-year rate.
     * </p>
     * </li>
     * <li>
     * <p>
     * Set a 3-year commitment to automatically renew for an additional 1 year. The hourly rate for the additional year
     * will continue to be the same as your existing 3-year rate.
     * </p>
     * </li>
     * <li>
     * <p>
     * Turn off a previously-enabled automatic renewal on a 1-year or 3-year commitment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You cannot use the automatic-renewal option for a 60-day commitment.
     * </p>
     * 
     * @param automaticRenewal
     *        Determines whether the commitment period for a radio unit is set to automatically renew for an additional
     *        1 year after your current commitment period expires.</p>
     *        <p>
     *        Set to <code>True</code>, if you want your commitment period to automatically renew. Set to
     *        <code>False</code> if you do not want your commitment to automatically renew.
     *        </p>
     *        <p>
     *        You can do the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Set a 1-year commitment to automatically renew for an additional 1 year. The hourly rate for the
     *        additional year will continue to be the same as your existing 1-year rate.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Set a 3-year commitment to automatically renew for an additional 1 year. The hourly rate for the
     *        additional year will continue to be the same as your existing 3-year rate.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Turn off a previously-enabled automatic renewal on a 1-year or 3-year commitment.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You cannot use the automatic-renewal option for a 60-day commitment.
     */

    public void setAutomaticRenewal(Boolean automaticRenewal) {
        this.automaticRenewal = automaticRenewal;
    }

    /**
     * <p>
     * Determines whether the commitment period for a radio unit is set to automatically renew for an additional 1 year
     * after your current commitment period expires.
     * </p>
     * <p>
     * Set to <code>True</code>, if you want your commitment period to automatically renew. Set to <code>False</code> if
     * you do not want your commitment to automatically renew.
     * </p>
     * <p>
     * You can do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Set a 1-year commitment to automatically renew for an additional 1 year. The hourly rate for the additional year
     * will continue to be the same as your existing 1-year rate.
     * </p>
     * </li>
     * <li>
     * <p>
     * Set a 3-year commitment to automatically renew for an additional 1 year. The hourly rate for the additional year
     * will continue to be the same as your existing 3-year rate.
     * </p>
     * </li>
     * <li>
     * <p>
     * Turn off a previously-enabled automatic renewal on a 1-year or 3-year commitment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You cannot use the automatic-renewal option for a 60-day commitment.
     * </p>
     * 
     * @return Determines whether the commitment period for a radio unit is set to automatically renew for an additional
     *         1 year after your current commitment period expires.</p>
     *         <p>
     *         Set to <code>True</code>, if you want your commitment period to automatically renew. Set to
     *         <code>False</code> if you do not want your commitment to automatically renew.
     *         </p>
     *         <p>
     *         You can do the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Set a 1-year commitment to automatically renew for an additional 1 year. The hourly rate for the
     *         additional year will continue to be the same as your existing 1-year rate.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Set a 3-year commitment to automatically renew for an additional 1 year. The hourly rate for the
     *         additional year will continue to be the same as your existing 3-year rate.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Turn off a previously-enabled automatic renewal on a 1-year or 3-year commitment.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         You cannot use the automatic-renewal option for a 60-day commitment.
     */

    public Boolean getAutomaticRenewal() {
        return this.automaticRenewal;
    }

    /**
     * <p>
     * Determines whether the commitment period for a radio unit is set to automatically renew for an additional 1 year
     * after your current commitment period expires.
     * </p>
     * <p>
     * Set to <code>True</code>, if you want your commitment period to automatically renew. Set to <code>False</code> if
     * you do not want your commitment to automatically renew.
     * </p>
     * <p>
     * You can do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Set a 1-year commitment to automatically renew for an additional 1 year. The hourly rate for the additional year
     * will continue to be the same as your existing 1-year rate.
     * </p>
     * </li>
     * <li>
     * <p>
     * Set a 3-year commitment to automatically renew for an additional 1 year. The hourly rate for the additional year
     * will continue to be the same as your existing 3-year rate.
     * </p>
     * </li>
     * <li>
     * <p>
     * Turn off a previously-enabled automatic renewal on a 1-year or 3-year commitment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You cannot use the automatic-renewal option for a 60-day commitment.
     * </p>
     * 
     * @param automaticRenewal
     *        Determines whether the commitment period for a radio unit is set to automatically renew for an additional
     *        1 year after your current commitment period expires.</p>
     *        <p>
     *        Set to <code>True</code>, if you want your commitment period to automatically renew. Set to
     *        <code>False</code> if you do not want your commitment to automatically renew.
     *        </p>
     *        <p>
     *        You can do the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Set a 1-year commitment to automatically renew for an additional 1 year. The hourly rate for the
     *        additional year will continue to be the same as your existing 1-year rate.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Set a 3-year commitment to automatically renew for an additional 1 year. The hourly rate for the
     *        additional year will continue to be the same as your existing 3-year rate.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Turn off a previously-enabled automatic renewal on a 1-year or 3-year commitment.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You cannot use the automatic-renewal option for a 60-day commitment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CommitmentConfiguration withAutomaticRenewal(Boolean automaticRenewal) {
        setAutomaticRenewal(automaticRenewal);
        return this;
    }

    /**
     * <p>
     * Determines whether the commitment period for a radio unit is set to automatically renew for an additional 1 year
     * after your current commitment period expires.
     * </p>
     * <p>
     * Set to <code>True</code>, if you want your commitment period to automatically renew. Set to <code>False</code> if
     * you do not want your commitment to automatically renew.
     * </p>
     * <p>
     * You can do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Set a 1-year commitment to automatically renew for an additional 1 year. The hourly rate for the additional year
     * will continue to be the same as your existing 1-year rate.
     * </p>
     * </li>
     * <li>
     * <p>
     * Set a 3-year commitment to automatically renew for an additional 1 year. The hourly rate for the additional year
     * will continue to be the same as your existing 3-year rate.
     * </p>
     * </li>
     * <li>
     * <p>
     * Turn off a previously-enabled automatic renewal on a 1-year or 3-year commitment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You cannot use the automatic-renewal option for a 60-day commitment.
     * </p>
     * 
     * @return Determines whether the commitment period for a radio unit is set to automatically renew for an additional
     *         1 year after your current commitment period expires.</p>
     *         <p>
     *         Set to <code>True</code>, if you want your commitment period to automatically renew. Set to
     *         <code>False</code> if you do not want your commitment to automatically renew.
     *         </p>
     *         <p>
     *         You can do the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Set a 1-year commitment to automatically renew for an additional 1 year. The hourly rate for the
     *         additional year will continue to be the same as your existing 1-year rate.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Set a 3-year commitment to automatically renew for an additional 1 year. The hourly rate for the
     *         additional year will continue to be the same as your existing 3-year rate.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Turn off a previously-enabled automatic renewal on a 1-year or 3-year commitment.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         You cannot use the automatic-renewal option for a 60-day commitment.
     */

    public Boolean isAutomaticRenewal() {
        return this.automaticRenewal;
    }

    /**
     * <p>
     * The duration of the commitment period for the radio unit. You can choose a 60-day, 1-year, or 3-year period.
     * </p>
     * 
     * @param commitmentLength
     *        The duration of the commitment period for the radio unit. You can choose a 60-day, 1-year, or 3-year
     *        period.
     * @see CommitmentLength
     */

    public void setCommitmentLength(String commitmentLength) {
        this.commitmentLength = commitmentLength;
    }

    /**
     * <p>
     * The duration of the commitment period for the radio unit. You can choose a 60-day, 1-year, or 3-year period.
     * </p>
     * 
     * @return The duration of the commitment period for the radio unit. You can choose a 60-day, 1-year, or 3-year
     *         period.
     * @see CommitmentLength
     */

    public String getCommitmentLength() {
        return this.commitmentLength;
    }

    /**
     * <p>
     * The duration of the commitment period for the radio unit. You can choose a 60-day, 1-year, or 3-year period.
     * </p>
     * 
     * @param commitmentLength
     *        The duration of the commitment period for the radio unit. You can choose a 60-day, 1-year, or 3-year
     *        period.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CommitmentLength
     */

    public CommitmentConfiguration withCommitmentLength(String commitmentLength) {
        setCommitmentLength(commitmentLength);
        return this;
    }

    /**
     * <p>
     * The duration of the commitment period for the radio unit. You can choose a 60-day, 1-year, or 3-year period.
     * </p>
     * 
     * @param commitmentLength
     *        The duration of the commitment period for the radio unit. You can choose a 60-day, 1-year, or 3-year
     *        period.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CommitmentLength
     */

    public CommitmentConfiguration withCommitmentLength(CommitmentLength commitmentLength) {
        this.commitmentLength = commitmentLength.toString();
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
        if (getAutomaticRenewal() != null)
            sb.append("AutomaticRenewal: ").append(getAutomaticRenewal()).append(",");
        if (getCommitmentLength() != null)
            sb.append("CommitmentLength: ").append(getCommitmentLength());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CommitmentConfiguration == false)
            return false;
        CommitmentConfiguration other = (CommitmentConfiguration) obj;
        if (other.getAutomaticRenewal() == null ^ this.getAutomaticRenewal() == null)
            return false;
        if (other.getAutomaticRenewal() != null && other.getAutomaticRenewal().equals(this.getAutomaticRenewal()) == false)
            return false;
        if (other.getCommitmentLength() == null ^ this.getCommitmentLength() == null)
            return false;
        if (other.getCommitmentLength() != null && other.getCommitmentLength().equals(this.getCommitmentLength()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutomaticRenewal() == null) ? 0 : getAutomaticRenewal().hashCode());
        hashCode = prime * hashCode + ((getCommitmentLength() == null) ? 0 : getCommitmentLength().hashCode());
        return hashCode;
    }

    @Override
    public CommitmentConfiguration clone() {
        try {
            return (CommitmentConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.private5g.model.transform.CommitmentConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
