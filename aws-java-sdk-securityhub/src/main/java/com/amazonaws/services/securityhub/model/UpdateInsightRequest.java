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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UpdateInsight" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateInsightRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the insight that you want to update.
     * </p>
     */
    private String insightArn;
    /**
     * <p>
     * The updated name for the insight.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The updated filters that define this insight.
     * </p>
     */
    private AwsSecurityFindingFilters filters;
    /**
     * <p>
     * The updated GroupBy attribute that defines this insight.
     * </p>
     */
    private String groupByAttribute;

    /**
     * <p>
     * The ARN of the insight that you want to update.
     * </p>
     * 
     * @param insightArn
     *        The ARN of the insight that you want to update.
     */

    public void setInsightArn(String insightArn) {
        this.insightArn = insightArn;
    }

    /**
     * <p>
     * The ARN of the insight that you want to update.
     * </p>
     * 
     * @return The ARN of the insight that you want to update.
     */

    public String getInsightArn() {
        return this.insightArn;
    }

    /**
     * <p>
     * The ARN of the insight that you want to update.
     * </p>
     * 
     * @param insightArn
     *        The ARN of the insight that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateInsightRequest withInsightArn(String insightArn) {
        setInsightArn(insightArn);
        return this;
    }

    /**
     * <p>
     * The updated name for the insight.
     * </p>
     * 
     * @param name
     *        The updated name for the insight.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The updated name for the insight.
     * </p>
     * 
     * @return The updated name for the insight.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The updated name for the insight.
     * </p>
     * 
     * @param name
     *        The updated name for the insight.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateInsightRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The updated filters that define this insight.
     * </p>
     * 
     * @param filters
     *        The updated filters that define this insight.
     */

    public void setFilters(AwsSecurityFindingFilters filters) {
        this.filters = filters;
    }

    /**
     * <p>
     * The updated filters that define this insight.
     * </p>
     * 
     * @return The updated filters that define this insight.
     */

    public AwsSecurityFindingFilters getFilters() {
        return this.filters;
    }

    /**
     * <p>
     * The updated filters that define this insight.
     * </p>
     * 
     * @param filters
     *        The updated filters that define this insight.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateInsightRequest withFilters(AwsSecurityFindingFilters filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The updated GroupBy attribute that defines this insight.
     * </p>
     * 
     * @param groupByAttribute
     *        The updated GroupBy attribute that defines this insight.
     */

    public void setGroupByAttribute(String groupByAttribute) {
        this.groupByAttribute = groupByAttribute;
    }

    /**
     * <p>
     * The updated GroupBy attribute that defines this insight.
     * </p>
     * 
     * @return The updated GroupBy attribute that defines this insight.
     */

    public String getGroupByAttribute() {
        return this.groupByAttribute;
    }

    /**
     * <p>
     * The updated GroupBy attribute that defines this insight.
     * </p>
     * 
     * @param groupByAttribute
     *        The updated GroupBy attribute that defines this insight.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateInsightRequest withGroupByAttribute(String groupByAttribute) {
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
        if (getInsightArn() != null)
            sb.append("InsightArn: ").append(getInsightArn()).append(",");
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

        if (obj instanceof UpdateInsightRequest == false)
            return false;
        UpdateInsightRequest other = (UpdateInsightRequest) obj;
        if (other.getInsightArn() == null ^ this.getInsightArn() == null)
            return false;
        if (other.getInsightArn() != null && other.getInsightArn().equals(this.getInsightArn()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getInsightArn() == null) ? 0 : getInsightArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getGroupByAttribute() == null) ? 0 : getGroupByAttribute().hashCode());
        return hashCode;
    }

    @Override
    public UpdateInsightRequest clone() {
        return (UpdateInsightRequest) super.clone();
    }

}
