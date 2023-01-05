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
package com.amazonaws.services.redshiftserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/UpdateUsageLimit"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateUsageLimitRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The new limit amount. If time-based, this amount is in Redshift Processing Units (RPU) consumed per hour. If
     * data-based, this amount is in terabytes (TB) of data transferred between Regions in cross-account sharing. The
     * value must be a positive number.
     * </p>
     */
    private Long amount;
    /**
     * <p>
     * The new action that Amazon Redshift Serverless takes when the limit is reached.
     * </p>
     */
    private String breachAction;
    /**
     * <p>
     * The identifier of the usage limit to update.
     * </p>
     */
    private String usageLimitId;

    /**
     * <p>
     * The new limit amount. If time-based, this amount is in Redshift Processing Units (RPU) consumed per hour. If
     * data-based, this amount is in terabytes (TB) of data transferred between Regions in cross-account sharing. The
     * value must be a positive number.
     * </p>
     * 
     * @param amount
     *        The new limit amount. If time-based, this amount is in Redshift Processing Units (RPU) consumed per hour.
     *        If data-based, this amount is in terabytes (TB) of data transferred between Regions in cross-account
     *        sharing. The value must be a positive number.
     */

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    /**
     * <p>
     * The new limit amount. If time-based, this amount is in Redshift Processing Units (RPU) consumed per hour. If
     * data-based, this amount is in terabytes (TB) of data transferred between Regions in cross-account sharing. The
     * value must be a positive number.
     * </p>
     * 
     * @return The new limit amount. If time-based, this amount is in Redshift Processing Units (RPU) consumed per hour.
     *         If data-based, this amount is in terabytes (TB) of data transferred between Regions in cross-account
     *         sharing. The value must be a positive number.
     */

    public Long getAmount() {
        return this.amount;
    }

    /**
     * <p>
     * The new limit amount. If time-based, this amount is in Redshift Processing Units (RPU) consumed per hour. If
     * data-based, this amount is in terabytes (TB) of data transferred between Regions in cross-account sharing. The
     * value must be a positive number.
     * </p>
     * 
     * @param amount
     *        The new limit amount. If time-based, this amount is in Redshift Processing Units (RPU) consumed per hour.
     *        If data-based, this amount is in terabytes (TB) of data transferred between Regions in cross-account
     *        sharing. The value must be a positive number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUsageLimitRequest withAmount(Long amount) {
        setAmount(amount);
        return this;
    }

    /**
     * <p>
     * The new action that Amazon Redshift Serverless takes when the limit is reached.
     * </p>
     * 
     * @param breachAction
     *        The new action that Amazon Redshift Serverless takes when the limit is reached.
     * @see UsageLimitBreachAction
     */

    public void setBreachAction(String breachAction) {
        this.breachAction = breachAction;
    }

    /**
     * <p>
     * The new action that Amazon Redshift Serverless takes when the limit is reached.
     * </p>
     * 
     * @return The new action that Amazon Redshift Serverless takes when the limit is reached.
     * @see UsageLimitBreachAction
     */

    public String getBreachAction() {
        return this.breachAction;
    }

    /**
     * <p>
     * The new action that Amazon Redshift Serverless takes when the limit is reached.
     * </p>
     * 
     * @param breachAction
     *        The new action that Amazon Redshift Serverless takes when the limit is reached.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UsageLimitBreachAction
     */

    public UpdateUsageLimitRequest withBreachAction(String breachAction) {
        setBreachAction(breachAction);
        return this;
    }

    /**
     * <p>
     * The new action that Amazon Redshift Serverless takes when the limit is reached.
     * </p>
     * 
     * @param breachAction
     *        The new action that Amazon Redshift Serverless takes when the limit is reached.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UsageLimitBreachAction
     */

    public UpdateUsageLimitRequest withBreachAction(UsageLimitBreachAction breachAction) {
        this.breachAction = breachAction.toString();
        return this;
    }

    /**
     * <p>
     * The identifier of the usage limit to update.
     * </p>
     * 
     * @param usageLimitId
     *        The identifier of the usage limit to update.
     */

    public void setUsageLimitId(String usageLimitId) {
        this.usageLimitId = usageLimitId;
    }

    /**
     * <p>
     * The identifier of the usage limit to update.
     * </p>
     * 
     * @return The identifier of the usage limit to update.
     */

    public String getUsageLimitId() {
        return this.usageLimitId;
    }

    /**
     * <p>
     * The identifier of the usage limit to update.
     * </p>
     * 
     * @param usageLimitId
     *        The identifier of the usage limit to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUsageLimitRequest withUsageLimitId(String usageLimitId) {
        setUsageLimitId(usageLimitId);
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
        if (getAmount() != null)
            sb.append("Amount: ").append(getAmount()).append(",");
        if (getBreachAction() != null)
            sb.append("BreachAction: ").append(getBreachAction()).append(",");
        if (getUsageLimitId() != null)
            sb.append("UsageLimitId: ").append(getUsageLimitId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateUsageLimitRequest == false)
            return false;
        UpdateUsageLimitRequest other = (UpdateUsageLimitRequest) obj;
        if (other.getAmount() == null ^ this.getAmount() == null)
            return false;
        if (other.getAmount() != null && other.getAmount().equals(this.getAmount()) == false)
            return false;
        if (other.getBreachAction() == null ^ this.getBreachAction() == null)
            return false;
        if (other.getBreachAction() != null && other.getBreachAction().equals(this.getBreachAction()) == false)
            return false;
        if (other.getUsageLimitId() == null ^ this.getUsageLimitId() == null)
            return false;
        if (other.getUsageLimitId() != null && other.getUsageLimitId().equals(this.getUsageLimitId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAmount() == null) ? 0 : getAmount().hashCode());
        hashCode = prime * hashCode + ((getBreachAction() == null) ? 0 : getBreachAction().hashCode());
        hashCode = prime * hashCode + ((getUsageLimitId() == null) ? 0 : getUsageLimitId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateUsageLimitRequest clone() {
        return (UpdateUsageLimitRequest) super.clone();
    }

}
