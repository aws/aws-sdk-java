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
package com.amazonaws.services.budgets.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The period of time that is covered by a budget. The period has a start date and an end date. The start date must come
 * before the end date. There are no restrictions on the end date.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TimePeriod implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The start date for a budget. If you created your budget and didn't specify a start date, AWS defaults to the
     * start of your chosen time period (DAILY, MONTHLY, QUARTERLY, or ANNUALLY). For example, if you created your
     * budget on January 24, 2018, chose <code>DAILY</code>, and didn't set a start date, AWS set your start date to
     * <code>01/24/18 00:00 UTC</code>. If you chose <code>MONTHLY</code>, AWS set your start date to
     * <code>01/01/18 00:00 UTC</code>. The defaults are the same for the AWS Billing and Cost Management console and
     * the API.
     * </p>
     * <p>
     * You can change your start date with the <code>UpdateBudget</code> operation.
     * </p>
     */
    private java.util.Date start;
    /**
     * <p>
     * The end date for a budget. If you didn't specify an end date, AWS set your end date to
     * <code>06/15/87 00:00 UTC</code>. The defaults are the same for the AWS Billing and Cost Management console and
     * the API.
     * </p>
     * <p>
     * After the end date, AWS deletes the budget and all associated notifications and subscribers. You can change your
     * end date with the <code>UpdateBudget</code> operation.
     * </p>
     */
    private java.util.Date end;

    /**
     * <p>
     * The start date for a budget. If you created your budget and didn't specify a start date, AWS defaults to the
     * start of your chosen time period (DAILY, MONTHLY, QUARTERLY, or ANNUALLY). For example, if you created your
     * budget on January 24, 2018, chose <code>DAILY</code>, and didn't set a start date, AWS set your start date to
     * <code>01/24/18 00:00 UTC</code>. If you chose <code>MONTHLY</code>, AWS set your start date to
     * <code>01/01/18 00:00 UTC</code>. The defaults are the same for the AWS Billing and Cost Management console and
     * the API.
     * </p>
     * <p>
     * You can change your start date with the <code>UpdateBudget</code> operation.
     * </p>
     * 
     * @param start
     *        The start date for a budget. If you created your budget and didn't specify a start date, AWS defaults to
     *        the start of your chosen time period (DAILY, MONTHLY, QUARTERLY, or ANNUALLY). For example, if you created
     *        your budget on January 24, 2018, chose <code>DAILY</code>, and didn't set a start date, AWS set your start
     *        date to <code>01/24/18 00:00 UTC</code>. If you chose <code>MONTHLY</code>, AWS set your start date to
     *        <code>01/01/18 00:00 UTC</code>. The defaults are the same for the AWS Billing and Cost Management console
     *        and the API.</p>
     *        <p>
     *        You can change your start date with the <code>UpdateBudget</code> operation.
     */

    public void setStart(java.util.Date start) {
        this.start = start;
    }

    /**
     * <p>
     * The start date for a budget. If you created your budget and didn't specify a start date, AWS defaults to the
     * start of your chosen time period (DAILY, MONTHLY, QUARTERLY, or ANNUALLY). For example, if you created your
     * budget on January 24, 2018, chose <code>DAILY</code>, and didn't set a start date, AWS set your start date to
     * <code>01/24/18 00:00 UTC</code>. If you chose <code>MONTHLY</code>, AWS set your start date to
     * <code>01/01/18 00:00 UTC</code>. The defaults are the same for the AWS Billing and Cost Management console and
     * the API.
     * </p>
     * <p>
     * You can change your start date with the <code>UpdateBudget</code> operation.
     * </p>
     * 
     * @return The start date for a budget. If you created your budget and didn't specify a start date, AWS defaults to
     *         the start of your chosen time period (DAILY, MONTHLY, QUARTERLY, or ANNUALLY). For example, if you
     *         created your budget on January 24, 2018, chose <code>DAILY</code>, and didn't set a start date, AWS set
     *         your start date to <code>01/24/18 00:00 UTC</code>. If you chose <code>MONTHLY</code>, AWS set your start
     *         date to <code>01/01/18 00:00 UTC</code>. The defaults are the same for the AWS Billing and Cost
     *         Management console and the API.</p>
     *         <p>
     *         You can change your start date with the <code>UpdateBudget</code> operation.
     */

    public java.util.Date getStart() {
        return this.start;
    }

    /**
     * <p>
     * The start date for a budget. If you created your budget and didn't specify a start date, AWS defaults to the
     * start of your chosen time period (DAILY, MONTHLY, QUARTERLY, or ANNUALLY). For example, if you created your
     * budget on January 24, 2018, chose <code>DAILY</code>, and didn't set a start date, AWS set your start date to
     * <code>01/24/18 00:00 UTC</code>. If you chose <code>MONTHLY</code>, AWS set your start date to
     * <code>01/01/18 00:00 UTC</code>. The defaults are the same for the AWS Billing and Cost Management console and
     * the API.
     * </p>
     * <p>
     * You can change your start date with the <code>UpdateBudget</code> operation.
     * </p>
     * 
     * @param start
     *        The start date for a budget. If you created your budget and didn't specify a start date, AWS defaults to
     *        the start of your chosen time period (DAILY, MONTHLY, QUARTERLY, or ANNUALLY). For example, if you created
     *        your budget on January 24, 2018, chose <code>DAILY</code>, and didn't set a start date, AWS set your start
     *        date to <code>01/24/18 00:00 UTC</code>. If you chose <code>MONTHLY</code>, AWS set your start date to
     *        <code>01/01/18 00:00 UTC</code>. The defaults are the same for the AWS Billing and Cost Management console
     *        and the API.</p>
     *        <p>
     *        You can change your start date with the <code>UpdateBudget</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimePeriod withStart(java.util.Date start) {
        setStart(start);
        return this;
    }

    /**
     * <p>
     * The end date for a budget. If you didn't specify an end date, AWS set your end date to
     * <code>06/15/87 00:00 UTC</code>. The defaults are the same for the AWS Billing and Cost Management console and
     * the API.
     * </p>
     * <p>
     * After the end date, AWS deletes the budget and all associated notifications and subscribers. You can change your
     * end date with the <code>UpdateBudget</code> operation.
     * </p>
     * 
     * @param end
     *        The end date for a budget. If you didn't specify an end date, AWS set your end date to
     *        <code>06/15/87 00:00 UTC</code>. The defaults are the same for the AWS Billing and Cost Management console
     *        and the API.</p>
     *        <p>
     *        After the end date, AWS deletes the budget and all associated notifications and subscribers. You can
     *        change your end date with the <code>UpdateBudget</code> operation.
     */

    public void setEnd(java.util.Date end) {
        this.end = end;
    }

    /**
     * <p>
     * The end date for a budget. If you didn't specify an end date, AWS set your end date to
     * <code>06/15/87 00:00 UTC</code>. The defaults are the same for the AWS Billing and Cost Management console and
     * the API.
     * </p>
     * <p>
     * After the end date, AWS deletes the budget and all associated notifications and subscribers. You can change your
     * end date with the <code>UpdateBudget</code> operation.
     * </p>
     * 
     * @return The end date for a budget. If you didn't specify an end date, AWS set your end date to
     *         <code>06/15/87 00:00 UTC</code>. The defaults are the same for the AWS Billing and Cost Management
     *         console and the API.</p>
     *         <p>
     *         After the end date, AWS deletes the budget and all associated notifications and subscribers. You can
     *         change your end date with the <code>UpdateBudget</code> operation.
     */

    public java.util.Date getEnd() {
        return this.end;
    }

    /**
     * <p>
     * The end date for a budget. If you didn't specify an end date, AWS set your end date to
     * <code>06/15/87 00:00 UTC</code>. The defaults are the same for the AWS Billing and Cost Management console and
     * the API.
     * </p>
     * <p>
     * After the end date, AWS deletes the budget and all associated notifications and subscribers. You can change your
     * end date with the <code>UpdateBudget</code> operation.
     * </p>
     * 
     * @param end
     *        The end date for a budget. If you didn't specify an end date, AWS set your end date to
     *        <code>06/15/87 00:00 UTC</code>. The defaults are the same for the AWS Billing and Cost Management console
     *        and the API.</p>
     *        <p>
     *        After the end date, AWS deletes the budget and all associated notifications and subscribers. You can
     *        change your end date with the <code>UpdateBudget</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimePeriod withEnd(java.util.Date end) {
        setEnd(end);
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
        if (getStart() != null)
            sb.append("Start: ").append(getStart()).append(",");
        if (getEnd() != null)
            sb.append("End: ").append(getEnd());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TimePeriod == false)
            return false;
        TimePeriod other = (TimePeriod) obj;
        if (other.getStart() == null ^ this.getStart() == null)
            return false;
        if (other.getStart() != null && other.getStart().equals(this.getStart()) == false)
            return false;
        if (other.getEnd() == null ^ this.getEnd() == null)
            return false;
        if (other.getEnd() != null && other.getEnd().equals(this.getEnd()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStart() == null) ? 0 : getStart().hashCode());
        hashCode = prime * hashCode + ((getEnd() == null) ? 0 : getEnd().hashCode());
        return hashCode;
    }

    @Override
    public TimePeriod clone() {
        try {
            return (TimePeriod) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.budgets.model.transform.TimePeriodMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
