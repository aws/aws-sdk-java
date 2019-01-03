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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/CreateInsight" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateInsightRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The user-defined name that identifies the insight that you want to create.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A collection of attributes that are applied to all active Security Hub-aggregated findings and that result in a
     * subset of findings that are included in this insight.
     * </p>
     */
    private AwsSecurityFindingFilters filters;
    /**
     * <p>
     * The attribute by which the insight's findings are grouped. This attribute is used as a findings aggregator for
     * the purposes of viewing and managing multiple related findings under a single operand.
     * </p>
     */
    private String groupByAttribute;

    /**
     * <p>
     * The user-defined name that identifies the insight that you want to create.
     * </p>
     * 
     * @param name
     *        The user-defined name that identifies the insight that you want to create.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The user-defined name that identifies the insight that you want to create.
     * </p>
     * 
     * @return The user-defined name that identifies the insight that you want to create.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The user-defined name that identifies the insight that you want to create.
     * </p>
     * 
     * @param name
     *        The user-defined name that identifies the insight that you want to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInsightRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A collection of attributes that are applied to all active Security Hub-aggregated findings and that result in a
     * subset of findings that are included in this insight.
     * </p>
     * 
     * @param filters
     *        A collection of attributes that are applied to all active Security Hub-aggregated findings and that result
     *        in a subset of findings that are included in this insight.
     */

    public void setFilters(AwsSecurityFindingFilters filters) {
        this.filters = filters;
    }

    /**
     * <p>
     * A collection of attributes that are applied to all active Security Hub-aggregated findings and that result in a
     * subset of findings that are included in this insight.
     * </p>
     * 
     * @return A collection of attributes that are applied to all active Security Hub-aggregated findings and that
     *         result in a subset of findings that are included in this insight.
     */

    public AwsSecurityFindingFilters getFilters() {
        return this.filters;
    }

    /**
     * <p>
     * A collection of attributes that are applied to all active Security Hub-aggregated findings and that result in a
     * subset of findings that are included in this insight.
     * </p>
     * 
     * @param filters
     *        A collection of attributes that are applied to all active Security Hub-aggregated findings and that result
     *        in a subset of findings that are included in this insight.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInsightRequest withFilters(AwsSecurityFindingFilters filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The attribute by which the insight's findings are grouped. This attribute is used as a findings aggregator for
     * the purposes of viewing and managing multiple related findings under a single operand.
     * </p>
     * 
     * @param groupByAttribute
     *        The attribute by which the insight's findings are grouped. This attribute is used as a findings aggregator
     *        for the purposes of viewing and managing multiple related findings under a single operand.
     */

    public void setGroupByAttribute(String groupByAttribute) {
        this.groupByAttribute = groupByAttribute;
    }

    /**
     * <p>
     * The attribute by which the insight's findings are grouped. This attribute is used as a findings aggregator for
     * the purposes of viewing and managing multiple related findings under a single operand.
     * </p>
     * 
     * @return The attribute by which the insight's findings are grouped. This attribute is used as a findings
     *         aggregator for the purposes of viewing and managing multiple related findings under a single operand.
     */

    public String getGroupByAttribute() {
        return this.groupByAttribute;
    }

    /**
     * <p>
     * The attribute by which the insight's findings are grouped. This attribute is used as a findings aggregator for
     * the purposes of viewing and managing multiple related findings under a single operand.
     * </p>
     * 
     * @param groupByAttribute
     *        The attribute by which the insight's findings are grouped. This attribute is used as a findings aggregator
     *        for the purposes of viewing and managing multiple related findings under a single operand.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInsightRequest withGroupByAttribute(String groupByAttribute) {
        setGroupByAttribute(groupByAttribute);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getGroupByAttribute() != null)
            sb.append("GroupByAttribute: ").append(getGroupByAttribute());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateInsightRequest == false)
            return false;
        CreateInsightRequest other = (CreateInsightRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getGroupByAttribute() == null ^ this.getGroupByAttribute() == null)
            return false;
        if (other.getGroupByAttribute() != null && other.getGroupByAttribute().equals(this.getGroupByAttribute()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getGroupByAttribute() == null) ? 0 : getGroupByAttribute().hashCode());
        return hashCode;
    }

    @Override
    public CreateInsightRequest clone() {
        return (CreateInsightRequest) super.clone();
    }

}
