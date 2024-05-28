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
package com.amazonaws.services.cleanrooms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Controls on the query specifications that can be run on configured table.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/AnalysisRulePolicyV1" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnalysisRulePolicyV1 implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Analysis rule type that enables only list queries on a configured table.
     * </p>
     */
    private AnalysisRuleList list;
    /**
     * <p>
     * Analysis rule type that enables only aggregation queries on a configured table.
     * </p>
     */
    private AnalysisRuleAggregation aggregation;
    /**
     * <p>
     * Analysis rule type that enables custom SQL queries on a configured table.
     * </p>
     */
    private AnalysisRuleCustom custom;

    /**
     * <p>
     * Analysis rule type that enables only list queries on a configured table.
     * </p>
     * 
     * @param list
     *        Analysis rule type that enables only list queries on a configured table.
     */

    public void setList(AnalysisRuleList list) {
        this.list = list;
    }

    /**
     * <p>
     * Analysis rule type that enables only list queries on a configured table.
     * </p>
     * 
     * @return Analysis rule type that enables only list queries on a configured table.
     */

    public AnalysisRuleList getList() {
        return this.list;
    }

    /**
     * <p>
     * Analysis rule type that enables only list queries on a configured table.
     * </p>
     * 
     * @param list
     *        Analysis rule type that enables only list queries on a configured table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisRulePolicyV1 withList(AnalysisRuleList list) {
        setList(list);
        return this;
    }

    /**
     * <p>
     * Analysis rule type that enables only aggregation queries on a configured table.
     * </p>
     * 
     * @param aggregation
     *        Analysis rule type that enables only aggregation queries on a configured table.
     */

    public void setAggregation(AnalysisRuleAggregation aggregation) {
        this.aggregation = aggregation;
    }

    /**
     * <p>
     * Analysis rule type that enables only aggregation queries on a configured table.
     * </p>
     * 
     * @return Analysis rule type that enables only aggregation queries on a configured table.
     */

    public AnalysisRuleAggregation getAggregation() {
        return this.aggregation;
    }

    /**
     * <p>
     * Analysis rule type that enables only aggregation queries on a configured table.
     * </p>
     * 
     * @param aggregation
     *        Analysis rule type that enables only aggregation queries on a configured table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisRulePolicyV1 withAggregation(AnalysisRuleAggregation aggregation) {
        setAggregation(aggregation);
        return this;
    }

    /**
     * <p>
     * Analysis rule type that enables custom SQL queries on a configured table.
     * </p>
     * 
     * @param custom
     *        Analysis rule type that enables custom SQL queries on a configured table.
     */

    public void setCustom(AnalysisRuleCustom custom) {
        this.custom = custom;
    }

    /**
     * <p>
     * Analysis rule type that enables custom SQL queries on a configured table.
     * </p>
     * 
     * @return Analysis rule type that enables custom SQL queries on a configured table.
     */

    public AnalysisRuleCustom getCustom() {
        return this.custom;
    }

    /**
     * <p>
     * Analysis rule type that enables custom SQL queries on a configured table.
     * </p>
     * 
     * @param custom
     *        Analysis rule type that enables custom SQL queries on a configured table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisRulePolicyV1 withCustom(AnalysisRuleCustom custom) {
        setCustom(custom);
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
        if (getList() != null)
            sb.append("List: ").append(getList()).append(",");
        if (getAggregation() != null)
            sb.append("Aggregation: ").append(getAggregation()).append(",");
        if (getCustom() != null)
            sb.append("Custom: ").append(getCustom());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnalysisRulePolicyV1 == false)
            return false;
        AnalysisRulePolicyV1 other = (AnalysisRulePolicyV1) obj;
        if (other.getList() == null ^ this.getList() == null)
            return false;
        if (other.getList() != null && other.getList().equals(this.getList()) == false)
            return false;
        if (other.getAggregation() == null ^ this.getAggregation() == null)
            return false;
        if (other.getAggregation() != null && other.getAggregation().equals(this.getAggregation()) == false)
            return false;
        if (other.getCustom() == null ^ this.getCustom() == null)
            return false;
        if (other.getCustom() != null && other.getCustom().equals(this.getCustom()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getList() == null) ? 0 : getList().hashCode());
        hashCode = prime * hashCode + ((getAggregation() == null) ? 0 : getAggregation().hashCode());
        hashCode = prime * hashCode + ((getCustom() == null) ? 0 : getCustom().hashCode());
        return hashCode;
    }

    @Override
    public AnalysisRulePolicyV1 clone() {
        try {
            return (AnalysisRulePolicyV1) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanrooms.model.transform.AnalysisRulePolicyV1Marshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
