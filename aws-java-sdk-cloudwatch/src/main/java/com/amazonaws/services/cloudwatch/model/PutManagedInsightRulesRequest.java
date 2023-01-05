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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/PutManagedInsightRules" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutManagedInsightRulesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of <code>ManagedRules</code> to enable.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ManagedRule> managedRules;

    /**
     * <p>
     * A list of <code>ManagedRules</code> to enable.
     * </p>
     * 
     * @return A list of <code>ManagedRules</code> to enable.
     */

    public java.util.List<ManagedRule> getManagedRules() {
        if (managedRules == null) {
            managedRules = new com.amazonaws.internal.SdkInternalList<ManagedRule>();
        }
        return managedRules;
    }

    /**
     * <p>
     * A list of <code>ManagedRules</code> to enable.
     * </p>
     * 
     * @param managedRules
     *        A list of <code>ManagedRules</code> to enable.
     */

    public void setManagedRules(java.util.Collection<ManagedRule> managedRules) {
        if (managedRules == null) {
            this.managedRules = null;
            return;
        }

        this.managedRules = new com.amazonaws.internal.SdkInternalList<ManagedRule>(managedRules);
    }

    /**
     * <p>
     * A list of <code>ManagedRules</code> to enable.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setManagedRules(java.util.Collection)} or {@link #withManagedRules(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param managedRules
     *        A list of <code>ManagedRules</code> to enable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutManagedInsightRulesRequest withManagedRules(ManagedRule... managedRules) {
        if (this.managedRules == null) {
            setManagedRules(new com.amazonaws.internal.SdkInternalList<ManagedRule>(managedRules.length));
        }
        for (ManagedRule ele : managedRules) {
            this.managedRules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>ManagedRules</code> to enable.
     * </p>
     * 
     * @param managedRules
     *        A list of <code>ManagedRules</code> to enable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutManagedInsightRulesRequest withManagedRules(java.util.Collection<ManagedRule> managedRules) {
        setManagedRules(managedRules);
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
            sb.append("ManagedRules: ").append(getManagedRules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutManagedInsightRulesRequest == false)
            return false;
        PutManagedInsightRulesRequest other = (PutManagedInsightRulesRequest) obj;
        if (other.getManagedRules() == null ^ this.getManagedRules() == null)
            return false;
        if (other.getManagedRules() != null && other.getManagedRules().equals(this.getManagedRules()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getManagedRules() == null) ? 0 : getManagedRules().hashCode());
        return hashCode;
    }

    @Override
    public PutManagedInsightRulesRequest clone() {
        return (PutManagedInsightRulesRequest) super.clone();
    }

}
