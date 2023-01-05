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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/CreateUsageLimit"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateUsageLimitRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The limit amount. If time-based, this amount is in Redshift Processing Units (RPU) consumed per hour. If
     * data-based, this amount is in terabytes (TB) of data transferred between Regions in cross-account sharing. The
     * value must be a positive number.
     * </p>
     */
    private Long amount;
    /**
     * <p>
     * The action that Amazon Redshift Serverless takes when the limit is reached. The default is log.
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
     * The Amazon Resource Name (ARN) of the Amazon Redshift Serverless resource to create the usage limit for.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * The type of Amazon Redshift Serverless usage to create a usage limit for.
     * </p>
     */
    private String usageType;

    /**
     * <p>
     * The limit amount. If time-based, this amount is in Redshift Processing Units (RPU) consumed per hour. If
     * data-based, this amount is in terabytes (TB) of data transferred between Regions in cross-account sharing. The
     * value must be a positive number.
     * </p>
     * 
     * @param amount
     *        The limit amount. If time-based, this amount is in Redshift Processing Units (RPU) consumed per hour. If
     *        data-based, this amount is in terabytes (TB) of data transferred between Regions in cross-account sharing.
     *        The value must be a positive number.
     */

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    /**
     * <p>
     * The limit amount. If time-based, this amount is in Redshift Processing Units (RPU) consumed per hour. If
     * data-based, this amount is in terabytes (TB) of data transferred between Regions in cross-account sharing. The
     * value must be a positive number.
     * </p>
     * 
     * @return The limit amount. If time-based, this amount is in Redshift Processing Units (RPU) consumed per hour. If
     *         data-based, this amount is in terabytes (TB) of data transferred between Regions in cross-account
     *         sharing. The value must be a positive number.
     */

    public Long getAmount() {
        return this.amount;
    }

    /**
     * <p>
     * The limit amount. If time-based, this amount is in Redshift Processing Units (RPU) consumed per hour. If
     * data-based, this amount is in terabytes (TB) of data transferred between Regions in cross-account sharing. The
     * value must be a positive number.
     * </p>
     * 
     * @param amount
     *        The limit amount. If time-based, this amount is in Redshift Processing Units (RPU) consumed per hour. If
     *        data-based, this amount is in terabytes (TB) of data transferred between Regions in cross-account sharing.
     *        The value must be a positive number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUsageLimitRequest withAmount(Long amount) {
        setAmount(amount);
        return this;
    }

    /**
     * <p>
     * The action that Amazon Redshift Serverless takes when the limit is reached. The default is log.
     * </p>
     * 
     * @param breachAction
     *        The action that Amazon Redshift Serverless takes when the limit is reached. The default is log.
     * @see UsageLimitBreachAction
     */

    public void setBreachAction(String breachAction) {
        this.breachAction = breachAction;
    }

    /**
     * <p>
     * The action that Amazon Redshift Serverless takes when the limit is reached. The default is log.
     * </p>
     * 
     * @return The action that Amazon Redshift Serverless takes when the limit is reached. The default is log.
     * @see UsageLimitBreachAction
     */

    public String getBreachAction() {
        return this.breachAction;
    }

    /**
     * <p>
     * The action that Amazon Redshift Serverless takes when the limit is reached. The default is log.
     * </p>
     * 
     * @param breachAction
     *        The action that Amazon Redshift Serverless takes when the limit is reached. The default is log.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UsageLimitBreachAction
     */

    public CreateUsageLimitRequest withBreachAction(String breachAction) {
        setBreachAction(breachAction);
        return this;
    }

    /**
     * <p>
     * The action that Amazon Redshift Serverless takes when the limit is reached. The default is log.
     * </p>
     * 
     * @param breachAction
     *        The action that Amazon Redshift Serverless takes when the limit is reached. The default is log.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UsageLimitBreachAction
     */

    public CreateUsageLimitRequest withBreachAction(UsageLimitBreachAction breachAction) {
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

    public CreateUsageLimitRequest withPeriod(String period) {
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

    public CreateUsageLimitRequest withPeriod(UsageLimitPeriod period) {
        this.period = period.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Redshift Serverless resource to create the usage limit for.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the Amazon Redshift Serverless resource to create the usage limit for.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Redshift Serverless resource to create the usage limit for.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Amazon Redshift Serverless resource to create the usage limit for.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Redshift Serverless resource to create the usage limit for.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the Amazon Redshift Serverless resource to create the usage limit for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUsageLimitRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * The type of Amazon Redshift Serverless usage to create a usage limit for.
     * </p>
     * 
     * @param usageType
     *        The type of Amazon Redshift Serverless usage to create a usage limit for.
     * @see UsageLimitUsageType
     */

    public void setUsageType(String usageType) {
        this.usageType = usageType;
    }

    /**
     * <p>
     * The type of Amazon Redshift Serverless usage to create a usage limit for.
     * </p>
     * 
     * @return The type of Amazon Redshift Serverless usage to create a usage limit for.
     * @see UsageLimitUsageType
     */

    public String getUsageType() {
        return this.usageType;
    }

    /**
     * <p>
     * The type of Amazon Redshift Serverless usage to create a usage limit for.
     * </p>
     * 
     * @param usageType
     *        The type of Amazon Redshift Serverless usage to create a usage limit for.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UsageLimitUsageType
     */

    public CreateUsageLimitRequest withUsageType(String usageType) {
        setUsageType(usageType);
        return this;
    }

    /**
     * <p>
     * The type of Amazon Redshift Serverless usage to create a usage limit for.
     * </p>
     * 
     * @param usageType
     *        The type of Amazon Redshift Serverless usage to create a usage limit for.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UsageLimitUsageType
     */

    public CreateUsageLimitRequest withUsageType(UsageLimitUsageType usageType) {
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

        if (obj instanceof CreateUsageLimitRequest == false)
            return false;
        CreateUsageLimitRequest other = (CreateUsageLimitRequest) obj;
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
        hashCode = prime * hashCode + ((getUsageType() == null) ? 0 : getUsageType().hashCode());
        return hashCode;
    }

    @Override
    public CreateUsageLimitRequest clone() {
        return (CreateUsageLimitRequest) super.clone();
    }

}
