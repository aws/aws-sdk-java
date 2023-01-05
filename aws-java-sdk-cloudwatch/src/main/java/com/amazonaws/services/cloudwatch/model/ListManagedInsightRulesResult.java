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
package com.amazonaws.services.cloudwatch.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/ListManagedInsightRules" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListManagedInsightRulesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The managed rules that are available for the specified Amazon Web Services resource.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ManagedRuleDescription> managedRules;
    /**
     * <p>
     * Include this value to get the next set of rules if the value was returned by the previous operation.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The managed rules that are available for the specified Amazon Web Services resource.
     * </p>
     * 
     * @return The managed rules that are available for the specified Amazon Web Services resource.
     */

    public java.util.List<ManagedRuleDescription> getManagedRules() {
        if (managedRules == null) {
            managedRules = new com.amazonaws.internal.SdkInternalList<ManagedRuleDescription>();
        }
        return managedRules;
    }

    /**
     * <p>
     * The managed rules that are available for the specified Amazon Web Services resource.
     * </p>
     * 
     * @param managedRules
     *        The managed rules that are available for the specified Amazon Web Services resource.
     */

    public void setManagedRules(java.util.Collection<ManagedRuleDescription> managedRules) {
        if (managedRules == null) {
            this.managedRules = null;
            return;
        }

        this.managedRules = new com.amazonaws.internal.SdkInternalList<ManagedRuleDescription>(managedRules);
    }

    /**
     * <p>
     * The managed rules that are available for the specified Amazon Web Services resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setManagedRules(java.util.Collection)} or {@link #withManagedRules(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param managedRules
     *        The managed rules that are available for the specified Amazon Web Services resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListManagedInsightRulesResult withManagedRules(ManagedRuleDescription... managedRules) {
        if (this.managedRules == null) {
            setManagedRules(new com.amazonaws.internal.SdkInternalList<ManagedRuleDescription>(managedRules.length));
        }
        for (ManagedRuleDescription ele : managedRules) {
            this.managedRules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The managed rules that are available for the specified Amazon Web Services resource.
     * </p>
     * 
     * @param managedRules
     *        The managed rules that are available for the specified Amazon Web Services resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListManagedInsightRulesResult withManagedRules(java.util.Collection<ManagedRuleDescription> managedRules) {
        setManagedRules(managedRules);
        return this;
    }

    /**
     * <p>
     * Include this value to get the next set of rules if the value was returned by the previous operation.
     * </p>
     * 
     * @param nextToken
     *        Include this value to get the next set of rules if the value was returned by the previous operation.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Include this value to get the next set of rules if the value was returned by the previous operation.
     * </p>
     * 
     * @return Include this value to get the next set of rules if the value was returned by the previous operation.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Include this value to get the next set of rules if the value was returned by the previous operation.
     * </p>
     * 
     * @param nextToken
     *        Include this value to get the next set of rules if the value was returned by the previous operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListManagedInsightRulesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getManagedRules() != null)
            sb.append("ManagedRules: ").append(getManagedRules()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListManagedInsightRulesResult == false)
            return false;
        ListManagedInsightRulesResult other = (ListManagedInsightRulesResult) obj;
        if (other.getManagedRules() == null ^ this.getManagedRules() == null)
            return false;
        if (other.getManagedRules() != null && other.getManagedRules().equals(this.getManagedRules()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getManagedRules() == null) ? 0 : getManagedRules().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListManagedInsightRulesResult clone() {
        try {
            return (ListManagedInsightRulesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
