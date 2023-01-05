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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The usage limit object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/UsageLimit" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UsageLimit implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The limit amount. If time-based, this amount is in RPUs consumed per hour. If data-based, this amount is in
     * terabytes (TB). The value must be a positive number.
     * </p>
     */
    private Long amount;
    /**
     * <p>
     * The action that Amazon Redshift Serverless takes when the limit is reached.
     * </p>
     */
    private String breachAction;
    /**
     * <p>
     * The time period that the amount applies to. A weekly period begins on Sunday. The default is monthly.
     * </p>
     */
    private String period;
    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the Amazon Redshift Serverless resource.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource associated with the usage limit.
     * </p>
     */
    private String usageLimitArn;
    /**
     * <p>
     * The identifier of the usage limit.
     * </p>
     */
    private String usageLimitId;
    /**
     * <p>
     * The Amazon Redshift Serverless feature to limit.
     * </p>
     */
    private String usageType;

    /**
     * <p>
     * The limit amount. If time-based, this amount is in RPUs consumed per hour. If data-based, this amount is in
     * terabytes (TB). The value must be a positive number.
     * </p>
     * 
     * @param amount
     *        The limit amount. If time-based, this amount is in RPUs consumed per hour. If data-based, this amount is
     *        in terabytes (TB). The value must be a positive number.
     */

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    /**
     * <p>
     * The limit amount. If time-based, this amount is in RPUs consumed per hour. If data-based, this amount is in
     * terabytes (TB). The value must be a positive number.
     * </p>
     * 
     * @return The limit amount. If time-based, this amount is in RPUs consumed per hour. If data-based, this amount is
     *         in terabytes (TB). The value must be a positive number.
     */

    public Long getAmount() {
        return this.amount;
    }

    /**
     * <p>
     * The limit amount. If time-based, this amount is in RPUs consumed per hour. If data-based, this amount is in
     * terabytes (TB). The value must be a positive number.
     * </p>
     * 
     * @param amount
     *        The limit amount. If time-based, this amount is in RPUs consumed per hour. If data-based, this amount is
     *        in terabytes (TB). The value must be a positive number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UsageLimit withAmount(Long amount) {
        setAmount(amount);
        return this;
    }

    /**
     * <p>
     * The action that Amazon Redshift Serverless takes when the limit is reached.
     * </p>
     * 
     * @param breachAction
     *        The action that Amazon Redshift Serverless takes when the limit is reached.
     * @see UsageLimitBreachAction
     */

    public void setBreachAction(String breachAction) {
        this.breachAction = breachAction;
    }

    /**
     * <p>
     * The action that Amazon Redshift Serverless takes when the limit is reached.
     * </p>
     * 
     * @return The action that Amazon Redshift Serverless takes when the limit is reached.
     * @see UsageLimitBreachAction
     */

    public String getBreachAction() {
        return this.breachAction;
    }

    /**
     * <p>
     * The action that Amazon Redshift Serverless takes when the limit is reached.
     * </p>
     * 
     * @param breachAction
     *        The action that Amazon Redshift Serverless takes when the limit is reached.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UsageLimitBreachAction
     */

    public UsageLimit withBreachAction(String breachAction) {
        setBreachAction(breachAction);
        return this;
    }

    /**
     * <p>
     * The action that Amazon Redshift Serverless takes when the limit is reached.
     * </p>
     * 
     * @param breachAction
     *        The action that Amazon Redshift Serverless takes when the limit is reached.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UsageLimitBreachAction
     */

    public UsageLimit withBreachAction(UsageLimitBreachAction breachAction) {
        this.breachAction = breachAction.toString();
        return this;
    }

    /**
     * <p>
     * The time period that the amount applies to. A weekly period begins on Sunday. The default is monthly.
     * </p>
     * 
     * @param period
     *        The time period that the amount applies to. A weekly period begins on Sunday. The default is monthly.
     * @see UsageLimitPeriod
     */

    public void setPeriod(String period) {
        this.period = period;
    }

    /**
     * <p>
     * The time period that the amount applies to. A weekly period begins on Sunday. The default is monthly.
     * </p>
     * 
     * @return The time period that the amount applies to. A weekly period begins on Sunday. The default is monthly.
     * @see UsageLimitPeriod
     */

    public String getPeriod() {
        return this.period;
    }

    /**
     * <p>
     * The time period that the amount applies to. A weekly period begins on Sunday. The default is monthly.
     * </p>
     * 
     * @param period
     *        The time period that the amount applies to. A weekly period begins on Sunday. The default is monthly.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UsageLimitPeriod
     */

    public UsageLimit withPeriod(String period) {
        setPeriod(period);
        return this;
    }

    /**
     * <p>
     * The time period that the amount applies to. A weekly period begins on Sunday. The default is monthly.
     * </p>
     * 
     * @param period
     *        The time period that the amount applies to. A weekly period begins on Sunday. The default is monthly.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UsageLimitPeriod
     */

    public UsageLimit withPeriod(UsageLimitPeriod period) {
        this.period = period.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the Amazon Redshift Serverless resource.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) that identifies the Amazon Redshift Serverless resource.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the Amazon Redshift Serverless resource.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that identifies the Amazon Redshift Serverless resource.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the Amazon Redshift Serverless resource.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) that identifies the Amazon Redshift Serverless resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UsageLimit withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource associated with the usage limit.
     * </p>
     * 
     * @param usageLimitArn
     *        The Amazon Resource Name (ARN) of the resource associated with the usage limit.
     */

    public void setUsageLimitArn(String usageLimitArn) {
        this.usageLimitArn = usageLimitArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource associated with the usage limit.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the resource associated with the usage limit.
     */

    public String getUsageLimitArn() {
        return this.usageLimitArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource associated with the usage limit.
     * </p>
     * 
     * @param usageLimitArn
     *        The Amazon Resource Name (ARN) of the resource associated with the usage limit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UsageLimit withUsageLimitArn(String usageLimitArn) {
        setUsageLimitArn(usageLimitArn);
        return this;
    }

    /**
     * <p>
     * The identifier of the usage limit.
     * </p>
     * 
     * @param usageLimitId
     *        The identifier of the usage limit.
     */

    public void setUsageLimitId(String usageLimitId) {
        this.usageLimitId = usageLimitId;
    }

    /**
     * <p>
     * The identifier of the usage limit.
     * </p>
     * 
     * @return The identifier of the usage limit.
     */

    public String getUsageLimitId() {
        return this.usageLimitId;
    }

    /**
     * <p>
     * The identifier of the usage limit.
     * </p>
     * 
     * @param usageLimitId
     *        The identifier of the usage limit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UsageLimit withUsageLimitId(String usageLimitId) {
        setUsageLimitId(usageLimitId);
        return this;
    }

    /**
     * <p>
     * The Amazon Redshift Serverless feature to limit.
     * </p>
     * 
     * @param usageType
     *        The Amazon Redshift Serverless feature to limit.
     * @see UsageLimitUsageType
     */

    public void setUsageType(String usageType) {
        this.usageType = usageType;
    }

    /**
     * <p>
     * The Amazon Redshift Serverless feature to limit.
     * </p>
     * 
     * @return The Amazon Redshift Serverless feature to limit.
     * @see UsageLimitUsageType
     */

    public String getUsageType() {
        return this.usageType;
    }

    /**
     * <p>
     * The Amazon Redshift Serverless feature to limit.
     * </p>
     * 
     * @param usageType
     *        The Amazon Redshift Serverless feature to limit.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UsageLimitUsageType
     */

    public UsageLimit withUsageType(String usageType) {
        setUsageType(usageType);
        return this;
    }

    /**
     * <p>
     * The Amazon Redshift Serverless feature to limit.
     * </p>
     * 
     * @param usageType
     *        The Amazon Redshift Serverless feature to limit.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UsageLimitUsageType
     */

    public UsageLimit withUsageType(UsageLimitUsageType usageType) {
        this.usageType = usageType.toString();
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
        if (getPeriod() != null)
            sb.append("Period: ").append(getPeriod()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getUsageLimitArn() != null)
            sb.append("UsageLimitArn: ").append(getUsageLimitArn()).append(",");
        if (getUsageLimitId() != null)
            sb.append("UsageLimitId: ").append(getUsageLimitId()).append(",");
        if (getUsageType() != null)
            sb.append("UsageType: ").append(getUsageType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UsageLimit == false)
            return false;
        UsageLimit other = (UsageLimit) obj;
        if (other.getAmount() == null ^ this.getAmount() == null)
            return false;
        if (other.getAmount() != null && other.getAmount().equals(this.getAmount()) == false)
            return false;
        if (other.getBreachAction() == null ^ this.getBreachAction() == null)
            return false;
        if (other.getBreachAction() != null && other.getBreachAction().equals(this.getBreachAction()) == false)
            return false;
        if (other.getPeriod() == null ^ this.getPeriod() == null)
            return false;
        if (other.getPeriod() != null && other.getPeriod().equals(this.getPeriod()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getUsageLimitArn() == null ^ this.getUsageLimitArn() == null)
            return false;
        if (other.getUsageLimitArn() != null && other.getUsageLimitArn().equals(this.getUsageLimitArn()) == false)
            return false;
        if (other.getUsageLimitId() == null ^ this.getUsageLimitId() == null)
            return false;
        if (other.getUsageLimitId() != null && other.getUsageLimitId().equals(this.getUsageLimitId()) == false)
            return false;
        if (other.getUsageType() == null ^ this.getUsageType() == null)
            return false;
        if (other.getUsageType() != null && other.getUsageType().equals(this.getUsageType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAmount() == null) ? 0 : getAmount().hashCode());
        hashCode = prime * hashCode + ((getBreachAction() == null) ? 0 : getBreachAction().hashCode());
        hashCode = prime * hashCode + ((getPeriod() == null) ? 0 : getPeriod().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getUsageLimitArn() == null) ? 0 : getUsageLimitArn().hashCode());
        hashCode = prime * hashCode + ((getUsageLimitId() == null) ? 0 : getUsageLimitId().hashCode());
        hashCode = prime * hashCode + ((getUsageType() == null) ? 0 : getUsageType().hashCode());
        return hashCode;
    }

    @Override
    public UsageLimit clone() {
        try {
            return (UsageLimit) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.redshiftserverless.model.transform.UsageLimitMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
