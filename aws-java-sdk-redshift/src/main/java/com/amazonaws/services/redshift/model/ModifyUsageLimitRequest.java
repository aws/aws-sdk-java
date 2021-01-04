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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ModifyUsageLimit" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyUsageLimitRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the usage limit to modify.
     * </p>
     */
    private String usageLimitId;
    /**
     * <p>
     * The new limit amount. For more information about this parameter, see <a>UsageLimit</a>.
     * </p>
     */
    private Long amount;
    /**
     * <p>
     * The new action that Amazon Redshift takes when the limit is reached. For more information about this parameter,
     * see <a>UsageLimit</a>.
     * </p>
     */
    private String breachAction;

    /**
     * <p>
     * The identifier of the usage limit to modify.
     * </p>
     * 
     * @param usageLimitId
     *        The identifier of the usage limit to modify.
     */

    public void setUsageLimitId(String usageLimitId) {
        this.usageLimitId = usageLimitId;
    }

    /**
     * <p>
     * The identifier of the usage limit to modify.
     * </p>
     * 
     * @return The identifier of the usage limit to modify.
     */

    public String getUsageLimitId() {
        return this.usageLimitId;
    }

    /**
     * <p>
     * The identifier of the usage limit to modify.
     * </p>
     * 
     * @param usageLimitId
     *        The identifier of the usage limit to modify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyUsageLimitRequest withUsageLimitId(String usageLimitId) {
        setUsageLimitId(usageLimitId);
        return this;
    }

    /**
     * <p>
     * The new limit amount. For more information about this parameter, see <a>UsageLimit</a>.
     * </p>
     * 
     * @param amount
     *        The new limit amount. For more information about this parameter, see <a>UsageLimit</a>.
     */

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    /**
     * <p>
     * The new limit amount. For more information about this parameter, see <a>UsageLimit</a>.
     * </p>
     * 
     * @return The new limit amount. For more information about this parameter, see <a>UsageLimit</a>.
     */

    public Long getAmount() {
        return this.amount;
    }

    /**
     * <p>
     * The new limit amount. For more information about this parameter, see <a>UsageLimit</a>.
     * </p>
     * 
     * @param amount
     *        The new limit amount. For more information about this parameter, see <a>UsageLimit</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyUsageLimitRequest withAmount(Long amount) {
        setAmount(amount);
        return this;
    }

    /**
     * <p>
     * The new action that Amazon Redshift takes when the limit is reached. For more information about this parameter,
     * see <a>UsageLimit</a>.
     * </p>
     * 
     * @param breachAction
     *        The new action that Amazon Redshift takes when the limit is reached. For more information about this
     *        parameter, see <a>UsageLimit</a>.
     * @see UsageLimitBreachAction
     */

    public void setBreachAction(String breachAction) {
        this.breachAction = breachAction;
    }

    /**
     * <p>
     * The new action that Amazon Redshift takes when the limit is reached. For more information about this parameter,
     * see <a>UsageLimit</a>.
     * </p>
     * 
     * @return The new action that Amazon Redshift takes when the limit is reached. For more information about this
     *         parameter, see <a>UsageLimit</a>.
     * @see UsageLimitBreachAction
     */

    public String getBreachAction() {
        return this.breachAction;
    }

    /**
     * <p>
     * The new action that Amazon Redshift takes when the limit is reached. For more information about this parameter,
     * see <a>UsageLimit</a>.
     * </p>
     * 
     * @param breachAction
     *        The new action that Amazon Redshift takes when the limit is reached. For more information about this
     *        parameter, see <a>UsageLimit</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UsageLimitBreachAction
     */

    public ModifyUsageLimitRequest withBreachAction(String breachAction) {
        setBreachAction(breachAction);
        return this;
    }

    /**
     * <p>
     * The new action that Amazon Redshift takes when the limit is reached. For more information about this parameter,
     * see <a>UsageLimit</a>.
     * </p>
     * 
     * @param breachAction
     *        The new action that Amazon Redshift takes when the limit is reached. For more information about this
     *        parameter, see <a>UsageLimit</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UsageLimitBreachAction
     */

    public ModifyUsageLimitRequest withBreachAction(UsageLimitBreachAction breachAction) {
        this.breachAction = breachAction.toString();
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
        if (getUsageLimitId() != null)
            sb.append("UsageLimitId: ").append(getUsageLimitId()).append(",");
        if (getAmount() != null)
            sb.append("Amount: ").append(getAmount()).append(",");
        if (getBreachAction() != null)
            sb.append("BreachAction: ").append(getBreachAction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyUsageLimitRequest == false)
            return false;
        ModifyUsageLimitRequest other = (ModifyUsageLimitRequest) obj;
        if (other.getUsageLimitId() == null ^ this.getUsageLimitId() == null)
            return false;
        if (other.getUsageLimitId() != null && other.getUsageLimitId().equals(this.getUsageLimitId()) == false)
            return false;
        if (other.getAmount() == null ^ this.getAmount() == null)
            return false;
        if (other.getAmount() != null && other.getAmount().equals(this.getAmount()) == false)
            return false;
        if (other.getBreachAction() == null ^ this.getBreachAction() == null)
            return false;
        if (other.getBreachAction() != null && other.getBreachAction().equals(this.getBreachAction()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUsageLimitId() == null) ? 0 : getUsageLimitId().hashCode());
        hashCode = prime * hashCode + ((getAmount() == null) ? 0 : getAmount().hashCode());
        hashCode = prime * hashCode + ((getBreachAction() == null) ? 0 : getBreachAction().hashCode());
        return hashCode;
    }

    @Override
    public ModifyUsageLimitRequest clone() {
        return (ModifyUsageLimitRequest) super.clone();
    }

}
