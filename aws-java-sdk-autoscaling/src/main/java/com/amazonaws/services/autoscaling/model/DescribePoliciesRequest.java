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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribePolicies" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePoliciesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     */
    private String autoScalingGroupName;
    /**
     * <p>
     * The names of one or more policies. If you omit this parameter, all policies are described. If a group name is
     * provided, the results are limited to that group. This list is limited to 50 items. If you specify an unknown
     * policy name, it is ignored with no error.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> policyNames;
    /**
     * <p>
     * One or more policy types. The valid values are <code>SimpleScaling</code>, <code>StepScaling</code>, and
     * <code>TargetTrackingScaling</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> policyTypes;
    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of items to be returned with each call. The default value is <code>50</code> and the maximum
     * value is <code>100</code>.
     * </p>
     */
    private Integer maxRecords;

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * 
     * @param autoScalingGroupName
     *        The name of the Auto Scaling group.
     */

    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * 
     * @return The name of the Auto Scaling group.
     */

    public String getAutoScalingGroupName() {
        return this.autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * 
     * @param autoScalingGroupName
     *        The name of the Auto Scaling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePoliciesRequest withAutoScalingGroupName(String autoScalingGroupName) {
        setAutoScalingGroupName(autoScalingGroupName);
        return this;
    }

    /**
     * <p>
     * The names of one or more policies. If you omit this parameter, all policies are described. If a group name is
     * provided, the results are limited to that group. This list is limited to 50 items. If you specify an unknown
     * policy name, it is ignored with no error.
     * </p>
     * 
     * @return The names of one or more policies. If you omit this parameter, all policies are described. If a group
     *         name is provided, the results are limited to that group. This list is limited to 50 items. If you specify
     *         an unknown policy name, it is ignored with no error.
     */

    public java.util.List<String> getPolicyNames() {
        if (policyNames == null) {
            policyNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return policyNames;
    }

    /**
     * <p>
     * The names of one or more policies. If you omit this parameter, all policies are described. If a group name is
     * provided, the results are limited to that group. This list is limited to 50 items. If you specify an unknown
     * policy name, it is ignored with no error.
     * </p>
     * 
     * @param policyNames
     *        The names of one or more policies. If you omit this parameter, all policies are described. If a group name
     *        is provided, the results are limited to that group. This list is limited to 50 items. If you specify an
     *        unknown policy name, it is ignored with no error.
     */

    public void setPolicyNames(java.util.Collection<String> policyNames) {
        if (policyNames == null) {
            this.policyNames = null;
            return;
        }

        this.policyNames = new com.amazonaws.internal.SdkInternalList<String>(policyNames);
    }

    /**
     * <p>
     * The names of one or more policies. If you omit this parameter, all policies are described. If a group name is
     * provided, the results are limited to that group. This list is limited to 50 items. If you specify an unknown
     * policy name, it is ignored with no error.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPolicyNames(java.util.Collection)} or {@link #withPolicyNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param policyNames
     *        The names of one or more policies. If you omit this parameter, all policies are described. If a group name
     *        is provided, the results are limited to that group. This list is limited to 50 items. If you specify an
     *        unknown policy name, it is ignored with no error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePoliciesRequest withPolicyNames(String... policyNames) {
        if (this.policyNames == null) {
            setPolicyNames(new com.amazonaws.internal.SdkInternalList<String>(policyNames.length));
        }
        for (String ele : policyNames) {
            this.policyNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of one or more policies. If you omit this parameter, all policies are described. If a group name is
     * provided, the results are limited to that group. This list is limited to 50 items. If you specify an unknown
     * policy name, it is ignored with no error.
     * </p>
     * 
     * @param policyNames
     *        The names of one or more policies. If you omit this parameter, all policies are described. If a group name
     *        is provided, the results are limited to that group. This list is limited to 50 items. If you specify an
     *        unknown policy name, it is ignored with no error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePoliciesRequest withPolicyNames(java.util.Collection<String> policyNames) {
        setPolicyNames(policyNames);
        return this;
    }

    /**
     * <p>
     * One or more policy types. The valid values are <code>SimpleScaling</code>, <code>StepScaling</code>, and
     * <code>TargetTrackingScaling</code>.
     * </p>
     * 
     * @return One or more policy types. The valid values are <code>SimpleScaling</code>, <code>StepScaling</code>, and
     *         <code>TargetTrackingScaling</code>.
     */

    public java.util.List<String> getPolicyTypes() {
        if (policyTypes == null) {
            policyTypes = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return policyTypes;
    }

    /**
     * <p>
     * One or more policy types. The valid values are <code>SimpleScaling</code>, <code>StepScaling</code>, and
     * <code>TargetTrackingScaling</code>.
     * </p>
     * 
     * @param policyTypes
     *        One or more policy types. The valid values are <code>SimpleScaling</code>, <code>StepScaling</code>, and
     *        <code>TargetTrackingScaling</code>.
     */

    public void setPolicyTypes(java.util.Collection<String> policyTypes) {
        if (policyTypes == null) {
            this.policyTypes = null;
            return;
        }

        this.policyTypes = new com.amazonaws.internal.SdkInternalList<String>(policyTypes);
    }

    /**
     * <p>
     * One or more policy types. The valid values are <code>SimpleScaling</code>, <code>StepScaling</code>, and
     * <code>TargetTrackingScaling</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPolicyTypes(java.util.Collection)} or {@link #withPolicyTypes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param policyTypes
     *        One or more policy types. The valid values are <code>SimpleScaling</code>, <code>StepScaling</code>, and
     *        <code>TargetTrackingScaling</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePoliciesRequest withPolicyTypes(String... policyTypes) {
        if (this.policyTypes == null) {
            setPolicyTypes(new com.amazonaws.internal.SdkInternalList<String>(policyTypes.length));
        }
        for (String ele : policyTypes) {
            this.policyTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more policy types. The valid values are <code>SimpleScaling</code>, <code>StepScaling</code>, and
     * <code>TargetTrackingScaling</code>.
     * </p>
     * 
     * @param policyTypes
     *        One or more policy types. The valid values are <code>SimpleScaling</code>, <code>StepScaling</code>, and
     *        <code>TargetTrackingScaling</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePoliciesRequest withPolicyTypes(java.util.Collection<String> policyTypes) {
        setPolicyTypes(policyTypes);
        return this;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. (You received this token from a previous call.)
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     * 
     * @return The token for the next set of items to return. (You received this token from a previous call.)
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. (You received this token from a previous call.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePoliciesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to be returned with each call. The default value is <code>50</code> and the maximum
     * value is <code>100</code>.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of items to be returned with each call. The default value is <code>50</code> and the
     *        maximum value is <code>100</code>.
     */

    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number of items to be returned with each call. The default value is <code>50</code> and the maximum
     * value is <code>100</code>.
     * </p>
     * 
     * @return The maximum number of items to be returned with each call. The default value is <code>50</code> and the
     *         maximum value is <code>100</code>.
     */

    public Integer getMaxRecords() {
        return this.maxRecords;
    }

    /**
     * <p>
     * The maximum number of items to be returned with each call. The default value is <code>50</code> and the maximum
     * value is <code>100</code>.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of items to be returned with each call. The default value is <code>50</code> and the
     *        maximum value is <code>100</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePoliciesRequest withMaxRecords(Integer maxRecords) {
        setMaxRecords(maxRecords);
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
        if (getAutoScalingGroupName() != null)
            sb.append("AutoScalingGroupName: ").append(getAutoScalingGroupName()).append(",");
        if (getPolicyNames() != null)
            sb.append("PolicyNames: ").append(getPolicyNames()).append(",");
        if (getPolicyTypes() != null)
            sb.append("PolicyTypes: ").append(getPolicyTypes()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: ").append(getMaxRecords());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribePoliciesRequest == false)
            return false;
        DescribePoliciesRequest other = (DescribePoliciesRequest) obj;
        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null)
            return false;
        if (other.getAutoScalingGroupName() != null && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false)
            return false;
        if (other.getPolicyNames() == null ^ this.getPolicyNames() == null)
            return false;
        if (other.getPolicyNames() != null && other.getPolicyNames().equals(this.getPolicyNames()) == false)
            return false;
        if (other.getPolicyTypes() == null ^ this.getPolicyTypes() == null)
            return false;
        if (other.getPolicyTypes() != null && other.getPolicyTypes().equals(this.getPolicyTypes()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null)
            return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoScalingGroupName() == null) ? 0 : getAutoScalingGroupName().hashCode());
        hashCode = prime * hashCode + ((getPolicyNames() == null) ? 0 : getPolicyNames().hashCode());
        hashCode = prime * hashCode + ((getPolicyTypes() == null) ? 0 : getPolicyTypes().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        return hashCode;
    }

    @Override
    public DescribePoliciesRequest clone() {
        return (DescribePoliciesRequest) super.clone();
    }

}
