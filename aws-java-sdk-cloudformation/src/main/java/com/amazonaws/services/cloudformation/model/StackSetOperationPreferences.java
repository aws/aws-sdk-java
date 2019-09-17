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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The user-specified preferences for how AWS CloudFormation performs a stack set operation.
 * </p>
 * <p>
 * For more information on maximum concurrent accounts and failure tolerance, see <a
 * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-concepts.html#stackset-ops-options"
 * >Stack set operation options</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/StackSetOperationPreferences"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StackSetOperationPreferences implements Serializable, Cloneable {

    /**
     * <p>
     * The order of the regions in where you want to perform the stack operation.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> regionOrder;
    /**
     * <p>
     * The number of accounts, per region, for which this operation can fail before AWS CloudFormation stops the
     * operation in that region. If the operation is stopped in a region, AWS CloudFormation doesn't attempt the
     * operation in any subsequent regions.
     * </p>
     * <p>
     * Conditional: You must specify either <code>FailureToleranceCount</code> or
     * <code>FailureTolerancePercentage</code> (but not both).
     * </p>
     */
    private Integer failureToleranceCount;
    /**
     * <p>
     * The percentage of accounts, per region, for which this stack operation can fail before AWS CloudFormation stops
     * the operation in that region. If the operation is stopped in a region, AWS CloudFormation doesn't attempt the
     * operation in any subsequent regions.
     * </p>
     * <p>
     * When calculating the number of accounts based on the specified percentage, AWS CloudFormation rounds <i>down</i>
     * to the next whole number.
     * </p>
     * <p>
     * Conditional: You must specify either <code>FailureToleranceCount</code> or
     * <code>FailureTolerancePercentage</code>, but not both.
     * </p>
     */
    private Integer failureTolerancePercentage;
    /**
     * <p>
     * The maximum number of accounts in which to perform this operation at one time. This is dependent on the value of
     * <code>FailureToleranceCount</code>—<code>MaxConcurrentCount</code> is at most one more than the
     * <code>FailureToleranceCount</code> .
     * </p>
     * <p>
     * Note that this setting lets you specify the <i>maximum</i> for operations. For large deployments, under certain
     * circumstances the actual number of accounts acted upon concurrently may be lower due to service throttling.
     * </p>
     * <p>
     * Conditional: You must specify either <code>MaxConcurrentCount</code> or <code>MaxConcurrentPercentage</code>, but
     * not both.
     * </p>
     */
    private Integer maxConcurrentCount;
    /**
     * <p>
     * The maximum percentage of accounts in which to perform this operation at one time.
     * </p>
     * <p>
     * When calculating the number of accounts based on the specified percentage, AWS CloudFormation rounds down to the
     * next whole number. This is true except in cases where rounding down would result is zero. In this case,
     * CloudFormation sets the number as one instead.
     * </p>
     * <p>
     * Note that this setting lets you specify the <i>maximum</i> for operations. For large deployments, under certain
     * circumstances the actual number of accounts acted upon concurrently may be lower due to service throttling.
     * </p>
     * <p>
     * Conditional: You must specify either <code>MaxConcurrentCount</code> or <code>MaxConcurrentPercentage</code>, but
     * not both.
     * </p>
     */
    private Integer maxConcurrentPercentage;

    /**
     * <p>
     * The order of the regions in where you want to perform the stack operation.
     * </p>
     * 
     * @return The order of the regions in where you want to perform the stack operation.
     */

    public java.util.List<String> getRegionOrder() {
        if (regionOrder == null) {
            regionOrder = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return regionOrder;
    }

    /**
     * <p>
     * The order of the regions in where you want to perform the stack operation.
     * </p>
     * 
     * @param regionOrder
     *        The order of the regions in where you want to perform the stack operation.
     */

    public void setRegionOrder(java.util.Collection<String> regionOrder) {
        if (regionOrder == null) {
            this.regionOrder = null;
            return;
        }

        this.regionOrder = new com.amazonaws.internal.SdkInternalList<String>(regionOrder);
    }

    /**
     * <p>
     * The order of the regions in where you want to perform the stack operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRegionOrder(java.util.Collection)} or {@link #withRegionOrder(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param regionOrder
     *        The order of the regions in where you want to perform the stack operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackSetOperationPreferences withRegionOrder(String... regionOrder) {
        if (this.regionOrder == null) {
            setRegionOrder(new com.amazonaws.internal.SdkInternalList<String>(regionOrder.length));
        }
        for (String ele : regionOrder) {
            this.regionOrder.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The order of the regions in where you want to perform the stack operation.
     * </p>
     * 
     * @param regionOrder
     *        The order of the regions in where you want to perform the stack operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackSetOperationPreferences withRegionOrder(java.util.Collection<String> regionOrder) {
        setRegionOrder(regionOrder);
        return this;
    }

    /**
     * <p>
     * The number of accounts, per region, for which this operation can fail before AWS CloudFormation stops the
     * operation in that region. If the operation is stopped in a region, AWS CloudFormation doesn't attempt the
     * operation in any subsequent regions.
     * </p>
     * <p>
     * Conditional: You must specify either <code>FailureToleranceCount</code> or
     * <code>FailureTolerancePercentage</code> (but not both).
     * </p>
     * 
     * @param failureToleranceCount
     *        The number of accounts, per region, for which this operation can fail before AWS CloudFormation stops the
     *        operation in that region. If the operation is stopped in a region, AWS CloudFormation doesn't attempt the
     *        operation in any subsequent regions.</p>
     *        <p>
     *        Conditional: You must specify either <code>FailureToleranceCount</code> or
     *        <code>FailureTolerancePercentage</code> (but not both).
     */

    public void setFailureToleranceCount(Integer failureToleranceCount) {
        this.failureToleranceCount = failureToleranceCount;
    }

    /**
     * <p>
     * The number of accounts, per region, for which this operation can fail before AWS CloudFormation stops the
     * operation in that region. If the operation is stopped in a region, AWS CloudFormation doesn't attempt the
     * operation in any subsequent regions.
     * </p>
     * <p>
     * Conditional: You must specify either <code>FailureToleranceCount</code> or
     * <code>FailureTolerancePercentage</code> (but not both).
     * </p>
     * 
     * @return The number of accounts, per region, for which this operation can fail before AWS CloudFormation stops the
     *         operation in that region. If the operation is stopped in a region, AWS CloudFormation doesn't attempt the
     *         operation in any subsequent regions.</p>
     *         <p>
     *         Conditional: You must specify either <code>FailureToleranceCount</code> or
     *         <code>FailureTolerancePercentage</code> (but not both).
     */

    public Integer getFailureToleranceCount() {
        return this.failureToleranceCount;
    }

    /**
     * <p>
     * The number of accounts, per region, for which this operation can fail before AWS CloudFormation stops the
     * operation in that region. If the operation is stopped in a region, AWS CloudFormation doesn't attempt the
     * operation in any subsequent regions.
     * </p>
     * <p>
     * Conditional: You must specify either <code>FailureToleranceCount</code> or
     * <code>FailureTolerancePercentage</code> (but not both).
     * </p>
     * 
     * @param failureToleranceCount
     *        The number of accounts, per region, for which this operation can fail before AWS CloudFormation stops the
     *        operation in that region. If the operation is stopped in a region, AWS CloudFormation doesn't attempt the
     *        operation in any subsequent regions.</p>
     *        <p>
     *        Conditional: You must specify either <code>FailureToleranceCount</code> or
     *        <code>FailureTolerancePercentage</code> (but not both).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackSetOperationPreferences withFailureToleranceCount(Integer failureToleranceCount) {
        setFailureToleranceCount(failureToleranceCount);
        return this;
    }

    /**
     * <p>
     * The percentage of accounts, per region, for which this stack operation can fail before AWS CloudFormation stops
     * the operation in that region. If the operation is stopped in a region, AWS CloudFormation doesn't attempt the
     * operation in any subsequent regions.
     * </p>
     * <p>
     * When calculating the number of accounts based on the specified percentage, AWS CloudFormation rounds <i>down</i>
     * to the next whole number.
     * </p>
     * <p>
     * Conditional: You must specify either <code>FailureToleranceCount</code> or
     * <code>FailureTolerancePercentage</code>, but not both.
     * </p>
     * 
     * @param failureTolerancePercentage
     *        The percentage of accounts, per region, for which this stack operation can fail before AWS CloudFormation
     *        stops the operation in that region. If the operation is stopped in a region, AWS CloudFormation doesn't
     *        attempt the operation in any subsequent regions.</p>
     *        <p>
     *        When calculating the number of accounts based on the specified percentage, AWS CloudFormation rounds
     *        <i>down</i> to the next whole number.
     *        </p>
     *        <p>
     *        Conditional: You must specify either <code>FailureToleranceCount</code> or
     *        <code>FailureTolerancePercentage</code>, but not both.
     */

    public void setFailureTolerancePercentage(Integer failureTolerancePercentage) {
        this.failureTolerancePercentage = failureTolerancePercentage;
    }

    /**
     * <p>
     * The percentage of accounts, per region, for which this stack operation can fail before AWS CloudFormation stops
     * the operation in that region. If the operation is stopped in a region, AWS CloudFormation doesn't attempt the
     * operation in any subsequent regions.
     * </p>
     * <p>
     * When calculating the number of accounts based on the specified percentage, AWS CloudFormation rounds <i>down</i>
     * to the next whole number.
     * </p>
     * <p>
     * Conditional: You must specify either <code>FailureToleranceCount</code> or
     * <code>FailureTolerancePercentage</code>, but not both.
     * </p>
     * 
     * @return The percentage of accounts, per region, for which this stack operation can fail before AWS CloudFormation
     *         stops the operation in that region. If the operation is stopped in a region, AWS CloudFormation doesn't
     *         attempt the operation in any subsequent regions.</p>
     *         <p>
     *         When calculating the number of accounts based on the specified percentage, AWS CloudFormation rounds
     *         <i>down</i> to the next whole number.
     *         </p>
     *         <p>
     *         Conditional: You must specify either <code>FailureToleranceCount</code> or
     *         <code>FailureTolerancePercentage</code>, but not both.
     */

    public Integer getFailureTolerancePercentage() {
        return this.failureTolerancePercentage;
    }

    /**
     * <p>
     * The percentage of accounts, per region, for which this stack operation can fail before AWS CloudFormation stops
     * the operation in that region. If the operation is stopped in a region, AWS CloudFormation doesn't attempt the
     * operation in any subsequent regions.
     * </p>
     * <p>
     * When calculating the number of accounts based on the specified percentage, AWS CloudFormation rounds <i>down</i>
     * to the next whole number.
     * </p>
     * <p>
     * Conditional: You must specify either <code>FailureToleranceCount</code> or
     * <code>FailureTolerancePercentage</code>, but not both.
     * </p>
     * 
     * @param failureTolerancePercentage
     *        The percentage of accounts, per region, for which this stack operation can fail before AWS CloudFormation
     *        stops the operation in that region. If the operation is stopped in a region, AWS CloudFormation doesn't
     *        attempt the operation in any subsequent regions.</p>
     *        <p>
     *        When calculating the number of accounts based on the specified percentage, AWS CloudFormation rounds
     *        <i>down</i> to the next whole number.
     *        </p>
     *        <p>
     *        Conditional: You must specify either <code>FailureToleranceCount</code> or
     *        <code>FailureTolerancePercentage</code>, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackSetOperationPreferences withFailureTolerancePercentage(Integer failureTolerancePercentage) {
        setFailureTolerancePercentage(failureTolerancePercentage);
        return this;
    }

    /**
     * <p>
     * The maximum number of accounts in which to perform this operation at one time. This is dependent on the value of
     * <code>FailureToleranceCount</code>—<code>MaxConcurrentCount</code> is at most one more than the
     * <code>FailureToleranceCount</code> .
     * </p>
     * <p>
     * Note that this setting lets you specify the <i>maximum</i> for operations. For large deployments, under certain
     * circumstances the actual number of accounts acted upon concurrently may be lower due to service throttling.
     * </p>
     * <p>
     * Conditional: You must specify either <code>MaxConcurrentCount</code> or <code>MaxConcurrentPercentage</code>, but
     * not both.
     * </p>
     * 
     * @param maxConcurrentCount
     *        The maximum number of accounts in which to perform this operation at one time. This is dependent on the
     *        value of <code>FailureToleranceCount</code>—<code>MaxConcurrentCount</code> is at most one more than the
     *        <code>FailureToleranceCount</code> .</p>
     *        <p>
     *        Note that this setting lets you specify the <i>maximum</i> for operations. For large deployments, under
     *        certain circumstances the actual number of accounts acted upon concurrently may be lower due to service
     *        throttling.
     *        </p>
     *        <p>
     *        Conditional: You must specify either <code>MaxConcurrentCount</code> or
     *        <code>MaxConcurrentPercentage</code>, but not both.
     */

    public void setMaxConcurrentCount(Integer maxConcurrentCount) {
        this.maxConcurrentCount = maxConcurrentCount;
    }

    /**
     * <p>
     * The maximum number of accounts in which to perform this operation at one time. This is dependent on the value of
     * <code>FailureToleranceCount</code>—<code>MaxConcurrentCount</code> is at most one more than the
     * <code>FailureToleranceCount</code> .
     * </p>
     * <p>
     * Note that this setting lets you specify the <i>maximum</i> for operations. For large deployments, under certain
     * circumstances the actual number of accounts acted upon concurrently may be lower due to service throttling.
     * </p>
     * <p>
     * Conditional: You must specify either <code>MaxConcurrentCount</code> or <code>MaxConcurrentPercentage</code>, but
     * not both.
     * </p>
     * 
     * @return The maximum number of accounts in which to perform this operation at one time. This is dependent on the
     *         value of <code>FailureToleranceCount</code>—<code>MaxConcurrentCount</code> is at most one more than the
     *         <code>FailureToleranceCount</code> .</p>
     *         <p>
     *         Note that this setting lets you specify the <i>maximum</i> for operations. For large deployments, under
     *         certain circumstances the actual number of accounts acted upon concurrently may be lower due to service
     *         throttling.
     *         </p>
     *         <p>
     *         Conditional: You must specify either <code>MaxConcurrentCount</code> or
     *         <code>MaxConcurrentPercentage</code>, but not both.
     */

    public Integer getMaxConcurrentCount() {
        return this.maxConcurrentCount;
    }

    /**
     * <p>
     * The maximum number of accounts in which to perform this operation at one time. This is dependent on the value of
     * <code>FailureToleranceCount</code>—<code>MaxConcurrentCount</code> is at most one more than the
     * <code>FailureToleranceCount</code> .
     * </p>
     * <p>
     * Note that this setting lets you specify the <i>maximum</i> for operations. For large deployments, under certain
     * circumstances the actual number of accounts acted upon concurrently may be lower due to service throttling.
     * </p>
     * <p>
     * Conditional: You must specify either <code>MaxConcurrentCount</code> or <code>MaxConcurrentPercentage</code>, but
     * not both.
     * </p>
     * 
     * @param maxConcurrentCount
     *        The maximum number of accounts in which to perform this operation at one time. This is dependent on the
     *        value of <code>FailureToleranceCount</code>—<code>MaxConcurrentCount</code> is at most one more than the
     *        <code>FailureToleranceCount</code> .</p>
     *        <p>
     *        Note that this setting lets you specify the <i>maximum</i> for operations. For large deployments, under
     *        certain circumstances the actual number of accounts acted upon concurrently may be lower due to service
     *        throttling.
     *        </p>
     *        <p>
     *        Conditional: You must specify either <code>MaxConcurrentCount</code> or
     *        <code>MaxConcurrentPercentage</code>, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackSetOperationPreferences withMaxConcurrentCount(Integer maxConcurrentCount) {
        setMaxConcurrentCount(maxConcurrentCount);
        return this;
    }

    /**
     * <p>
     * The maximum percentage of accounts in which to perform this operation at one time.
     * </p>
     * <p>
     * When calculating the number of accounts based on the specified percentage, AWS CloudFormation rounds down to the
     * next whole number. This is true except in cases where rounding down would result is zero. In this case,
     * CloudFormation sets the number as one instead.
     * </p>
     * <p>
     * Note that this setting lets you specify the <i>maximum</i> for operations. For large deployments, under certain
     * circumstances the actual number of accounts acted upon concurrently may be lower due to service throttling.
     * </p>
     * <p>
     * Conditional: You must specify either <code>MaxConcurrentCount</code> or <code>MaxConcurrentPercentage</code>, but
     * not both.
     * </p>
     * 
     * @param maxConcurrentPercentage
     *        The maximum percentage of accounts in which to perform this operation at one time.</p>
     *        <p>
     *        When calculating the number of accounts based on the specified percentage, AWS CloudFormation rounds down
     *        to the next whole number. This is true except in cases where rounding down would result is zero. In this
     *        case, CloudFormation sets the number as one instead.
     *        </p>
     *        <p>
     *        Note that this setting lets you specify the <i>maximum</i> for operations. For large deployments, under
     *        certain circumstances the actual number of accounts acted upon concurrently may be lower due to service
     *        throttling.
     *        </p>
     *        <p>
     *        Conditional: You must specify either <code>MaxConcurrentCount</code> or
     *        <code>MaxConcurrentPercentage</code>, but not both.
     */

    public void setMaxConcurrentPercentage(Integer maxConcurrentPercentage) {
        this.maxConcurrentPercentage = maxConcurrentPercentage;
    }

    /**
     * <p>
     * The maximum percentage of accounts in which to perform this operation at one time.
     * </p>
     * <p>
     * When calculating the number of accounts based on the specified percentage, AWS CloudFormation rounds down to the
     * next whole number. This is true except in cases where rounding down would result is zero. In this case,
     * CloudFormation sets the number as one instead.
     * </p>
     * <p>
     * Note that this setting lets you specify the <i>maximum</i> for operations. For large deployments, under certain
     * circumstances the actual number of accounts acted upon concurrently may be lower due to service throttling.
     * </p>
     * <p>
     * Conditional: You must specify either <code>MaxConcurrentCount</code> or <code>MaxConcurrentPercentage</code>, but
     * not both.
     * </p>
     * 
     * @return The maximum percentage of accounts in which to perform this operation at one time.</p>
     *         <p>
     *         When calculating the number of accounts based on the specified percentage, AWS CloudFormation rounds down
     *         to the next whole number. This is true except in cases where rounding down would result is zero. In this
     *         case, CloudFormation sets the number as one instead.
     *         </p>
     *         <p>
     *         Note that this setting lets you specify the <i>maximum</i> for operations. For large deployments, under
     *         certain circumstances the actual number of accounts acted upon concurrently may be lower due to service
     *         throttling.
     *         </p>
     *         <p>
     *         Conditional: You must specify either <code>MaxConcurrentCount</code> or
     *         <code>MaxConcurrentPercentage</code>, but not both.
     */

    public Integer getMaxConcurrentPercentage() {
        return this.maxConcurrentPercentage;
    }

    /**
     * <p>
     * The maximum percentage of accounts in which to perform this operation at one time.
     * </p>
     * <p>
     * When calculating the number of accounts based on the specified percentage, AWS CloudFormation rounds down to the
     * next whole number. This is true except in cases where rounding down would result is zero. In this case,
     * CloudFormation sets the number as one instead.
     * </p>
     * <p>
     * Note that this setting lets you specify the <i>maximum</i> for operations. For large deployments, under certain
     * circumstances the actual number of accounts acted upon concurrently may be lower due to service throttling.
     * </p>
     * <p>
     * Conditional: You must specify either <code>MaxConcurrentCount</code> or <code>MaxConcurrentPercentage</code>, but
     * not both.
     * </p>
     * 
     * @param maxConcurrentPercentage
     *        The maximum percentage of accounts in which to perform this operation at one time.</p>
     *        <p>
     *        When calculating the number of accounts based on the specified percentage, AWS CloudFormation rounds down
     *        to the next whole number. This is true except in cases where rounding down would result is zero. In this
     *        case, CloudFormation sets the number as one instead.
     *        </p>
     *        <p>
     *        Note that this setting lets you specify the <i>maximum</i> for operations. For large deployments, under
     *        certain circumstances the actual number of accounts acted upon concurrently may be lower due to service
     *        throttling.
     *        </p>
     *        <p>
     *        Conditional: You must specify either <code>MaxConcurrentCount</code> or
     *        <code>MaxConcurrentPercentage</code>, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackSetOperationPreferences withMaxConcurrentPercentage(Integer maxConcurrentPercentage) {
        setMaxConcurrentPercentage(maxConcurrentPercentage);
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
        if (getRegionOrder() != null)
            sb.append("RegionOrder: ").append(getRegionOrder()).append(",");
        if (getFailureToleranceCount() != null)
            sb.append("FailureToleranceCount: ").append(getFailureToleranceCount()).append(",");
        if (getFailureTolerancePercentage() != null)
            sb.append("FailureTolerancePercentage: ").append(getFailureTolerancePercentage()).append(",");
        if (getMaxConcurrentCount() != null)
            sb.append("MaxConcurrentCount: ").append(getMaxConcurrentCount()).append(",");
        if (getMaxConcurrentPercentage() != null)
            sb.append("MaxConcurrentPercentage: ").append(getMaxConcurrentPercentage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StackSetOperationPreferences == false)
            return false;
        StackSetOperationPreferences other = (StackSetOperationPreferences) obj;
        if (other.getRegionOrder() == null ^ this.getRegionOrder() == null)
            return false;
        if (other.getRegionOrder() != null && other.getRegionOrder().equals(this.getRegionOrder()) == false)
            return false;
        if (other.getFailureToleranceCount() == null ^ this.getFailureToleranceCount() == null)
            return false;
        if (other.getFailureToleranceCount() != null && other.getFailureToleranceCount().equals(this.getFailureToleranceCount()) == false)
            return false;
        if (other.getFailureTolerancePercentage() == null ^ this.getFailureTolerancePercentage() == null)
            return false;
        if (other.getFailureTolerancePercentage() != null && other.getFailureTolerancePercentage().equals(this.getFailureTolerancePercentage()) == false)
            return false;
        if (other.getMaxConcurrentCount() == null ^ this.getMaxConcurrentCount() == null)
            return false;
        if (other.getMaxConcurrentCount() != null && other.getMaxConcurrentCount().equals(this.getMaxConcurrentCount()) == false)
            return false;
        if (other.getMaxConcurrentPercentage() == null ^ this.getMaxConcurrentPercentage() == null)
            return false;
        if (other.getMaxConcurrentPercentage() != null && other.getMaxConcurrentPercentage().equals(this.getMaxConcurrentPercentage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegionOrder() == null) ? 0 : getRegionOrder().hashCode());
        hashCode = prime * hashCode + ((getFailureToleranceCount() == null) ? 0 : getFailureToleranceCount().hashCode());
        hashCode = prime * hashCode + ((getFailureTolerancePercentage() == null) ? 0 : getFailureTolerancePercentage().hashCode());
        hashCode = prime * hashCode + ((getMaxConcurrentCount() == null) ? 0 : getMaxConcurrentCount().hashCode());
        hashCode = prime * hashCode + ((getMaxConcurrentPercentage() == null) ? 0 : getMaxConcurrentPercentage().hashCode());
        return hashCode;
    }

    @Override
    public StackSetOperationPreferences clone() {
        try {
            return (StackSetOperationPreferences) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
