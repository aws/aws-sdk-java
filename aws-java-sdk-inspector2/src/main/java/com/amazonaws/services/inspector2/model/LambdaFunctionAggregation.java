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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details that define a findings aggregation based on AWS Lambda functions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/LambdaFunctionAggregation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LambdaFunctionAggregation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The AWS Lambda function names to include in the aggregation results.
     * </p>
     */
    private java.util.List<StringFilter> functionNames;
    /**
     * <p>
     * The tags to include in the aggregation results.
     * </p>
     */
    private java.util.List<MapFilter> functionTags;
    /**
     * <p>
     * The resource IDs to include in the aggregation results.
     * </p>
     */
    private java.util.List<StringFilter> resourceIds;
    /**
     * <p>
     * Returns findings aggregated by AWS Lambda function runtime environments.
     * </p>
     */
    private java.util.List<StringFilter> runtimes;
    /**
     * <p>
     * The finding severity to use for sorting the results.
     * </p>
     */
    private String sortBy;
    /**
     * <p>
     * The order to use for sorting the results.
     * </p>
     */
    private String sortOrder;

    /**
     * <p>
     * The AWS Lambda function names to include in the aggregation results.
     * </p>
     * 
     * @return The AWS Lambda function names to include in the aggregation results.
     */

    public java.util.List<StringFilter> getFunctionNames() {
        return functionNames;
    }

    /**
     * <p>
     * The AWS Lambda function names to include in the aggregation results.
     * </p>
     * 
     * @param functionNames
     *        The AWS Lambda function names to include in the aggregation results.
     */

    public void setFunctionNames(java.util.Collection<StringFilter> functionNames) {
        if (functionNames == null) {
            this.functionNames = null;
            return;
        }

        this.functionNames = new java.util.ArrayList<StringFilter>(functionNames);
    }

    /**
     * <p>
     * The AWS Lambda function names to include in the aggregation results.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFunctionNames(java.util.Collection)} or {@link #withFunctionNames(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param functionNames
     *        The AWS Lambda function names to include in the aggregation results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionAggregation withFunctionNames(StringFilter... functionNames) {
        if (this.functionNames == null) {
            setFunctionNames(new java.util.ArrayList<StringFilter>(functionNames.length));
        }
        for (StringFilter ele : functionNames) {
            this.functionNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The AWS Lambda function names to include in the aggregation results.
     * </p>
     * 
     * @param functionNames
     *        The AWS Lambda function names to include in the aggregation results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionAggregation withFunctionNames(java.util.Collection<StringFilter> functionNames) {
        setFunctionNames(functionNames);
        return this;
    }

    /**
     * <p>
     * The tags to include in the aggregation results.
     * </p>
     * 
     * @return The tags to include in the aggregation results.
     */

    public java.util.List<MapFilter> getFunctionTags() {
        return functionTags;
    }

    /**
     * <p>
     * The tags to include in the aggregation results.
     * </p>
     * 
     * @param functionTags
     *        The tags to include in the aggregation results.
     */

    public void setFunctionTags(java.util.Collection<MapFilter> functionTags) {
        if (functionTags == null) {
            this.functionTags = null;
            return;
        }

        this.functionTags = new java.util.ArrayList<MapFilter>(functionTags);
    }

    /**
     * <p>
     * The tags to include in the aggregation results.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFunctionTags(java.util.Collection)} or {@link #withFunctionTags(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param functionTags
     *        The tags to include in the aggregation results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionAggregation withFunctionTags(MapFilter... functionTags) {
        if (this.functionTags == null) {
            setFunctionTags(new java.util.ArrayList<MapFilter>(functionTags.length));
        }
        for (MapFilter ele : functionTags) {
            this.functionTags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags to include in the aggregation results.
     * </p>
     * 
     * @param functionTags
     *        The tags to include in the aggregation results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionAggregation withFunctionTags(java.util.Collection<MapFilter> functionTags) {
        setFunctionTags(functionTags);
        return this;
    }

    /**
     * <p>
     * The resource IDs to include in the aggregation results.
     * </p>
     * 
     * @return The resource IDs to include in the aggregation results.
     */

    public java.util.List<StringFilter> getResourceIds() {
        return resourceIds;
    }

    /**
     * <p>
     * The resource IDs to include in the aggregation results.
     * </p>
     * 
     * @param resourceIds
     *        The resource IDs to include in the aggregation results.
     */

    public void setResourceIds(java.util.Collection<StringFilter> resourceIds) {
        if (resourceIds == null) {
            this.resourceIds = null;
            return;
        }

        this.resourceIds = new java.util.ArrayList<StringFilter>(resourceIds);
    }

    /**
     * <p>
     * The resource IDs to include in the aggregation results.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceIds(java.util.Collection)} or {@link #withResourceIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceIds
     *        The resource IDs to include in the aggregation results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionAggregation withResourceIds(StringFilter... resourceIds) {
        if (this.resourceIds == null) {
            setResourceIds(new java.util.ArrayList<StringFilter>(resourceIds.length));
        }
        for (StringFilter ele : resourceIds) {
            this.resourceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The resource IDs to include in the aggregation results.
     * </p>
     * 
     * @param resourceIds
     *        The resource IDs to include in the aggregation results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionAggregation withResourceIds(java.util.Collection<StringFilter> resourceIds) {
        setResourceIds(resourceIds);
        return this;
    }

    /**
     * <p>
     * Returns findings aggregated by AWS Lambda function runtime environments.
     * </p>
     * 
     * @return Returns findings aggregated by AWS Lambda function runtime environments.
     */

    public java.util.List<StringFilter> getRuntimes() {
        return runtimes;
    }

    /**
     * <p>
     * Returns findings aggregated by AWS Lambda function runtime environments.
     * </p>
     * 
     * @param runtimes
     *        Returns findings aggregated by AWS Lambda function runtime environments.
     */

    public void setRuntimes(java.util.Collection<StringFilter> runtimes) {
        if (runtimes == null) {
            this.runtimes = null;
            return;
        }

        this.runtimes = new java.util.ArrayList<StringFilter>(runtimes);
    }

    /**
     * <p>
     * Returns findings aggregated by AWS Lambda function runtime environments.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRuntimes(java.util.Collection)} or {@link #withRuntimes(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param runtimes
     *        Returns findings aggregated by AWS Lambda function runtime environments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionAggregation withRuntimes(StringFilter... runtimes) {
        if (this.runtimes == null) {
            setRuntimes(new java.util.ArrayList<StringFilter>(runtimes.length));
        }
        for (StringFilter ele : runtimes) {
            this.runtimes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns findings aggregated by AWS Lambda function runtime environments.
     * </p>
     * 
     * @param runtimes
     *        Returns findings aggregated by AWS Lambda function runtime environments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionAggregation withRuntimes(java.util.Collection<StringFilter> runtimes) {
        setRuntimes(runtimes);
        return this;
    }

    /**
     * <p>
     * The finding severity to use for sorting the results.
     * </p>
     * 
     * @param sortBy
     *        The finding severity to use for sorting the results.
     * @see LambdaFunctionSortBy
     */

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * The finding severity to use for sorting the results.
     * </p>
     * 
     * @return The finding severity to use for sorting the results.
     * @see LambdaFunctionSortBy
     */

    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * <p>
     * The finding severity to use for sorting the results.
     * </p>
     * 
     * @param sortBy
     *        The finding severity to use for sorting the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LambdaFunctionSortBy
     */

    public LambdaFunctionAggregation withSortBy(String sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * The finding severity to use for sorting the results.
     * </p>
     * 
     * @param sortBy
     *        The finding severity to use for sorting the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LambdaFunctionSortBy
     */

    public LambdaFunctionAggregation withSortBy(LambdaFunctionSortBy sortBy) {
        this.sortBy = sortBy.toString();
        return this;
    }

    /**
     * <p>
     * The order to use for sorting the results.
     * </p>
     * 
     * @param sortOrder
     *        The order to use for sorting the results.
     * @see SortOrder
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * The order to use for sorting the results.
     * </p>
     * 
     * @return The order to use for sorting the results.
     * @see SortOrder
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * The order to use for sorting the results.
     * </p>
     * 
     * @param sortOrder
     *        The order to use for sorting the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public LambdaFunctionAggregation withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * The order to use for sorting the results.
     * </p>
     * 
     * @param sortOrder
     *        The order to use for sorting the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public LambdaFunctionAggregation withSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
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
        if (getFunctionNames() != null)
            sb.append("FunctionNames: ").append(getFunctionNames()).append(",");
        if (getFunctionTags() != null)
            sb.append("FunctionTags: ").append(getFunctionTags()).append(",");
        if (getResourceIds() != null)
            sb.append("ResourceIds: ").append(getResourceIds()).append(",");
        if (getRuntimes() != null)
            sb.append("Runtimes: ").append(getRuntimes()).append(",");
        if (getSortBy() != null)
            sb.append("SortBy: ").append(getSortBy()).append(",");
        if (getSortOrder() != null)
            sb.append("SortOrder: ").append(getSortOrder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LambdaFunctionAggregation == false)
            return false;
        LambdaFunctionAggregation other = (LambdaFunctionAggregation) obj;
        if (other.getFunctionNames() == null ^ this.getFunctionNames() == null)
            return false;
        if (other.getFunctionNames() != null && other.getFunctionNames().equals(this.getFunctionNames()) == false)
            return false;
        if (other.getFunctionTags() == null ^ this.getFunctionTags() == null)
            return false;
        if (other.getFunctionTags() != null && other.getFunctionTags().equals(this.getFunctionTags()) == false)
            return false;
        if (other.getResourceIds() == null ^ this.getResourceIds() == null)
            return false;
        if (other.getResourceIds() != null && other.getResourceIds().equals(this.getResourceIds()) == false)
            return false;
        if (other.getRuntimes() == null ^ this.getRuntimes() == null)
            return false;
        if (other.getRuntimes() != null && other.getRuntimes().equals(this.getRuntimes()) == false)
            return false;
        if (other.getSortBy() == null ^ this.getSortBy() == null)
            return false;
        if (other.getSortBy() != null && other.getSortBy().equals(this.getSortBy()) == false)
            return false;
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null && other.getSortOrder().equals(this.getSortOrder()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFunctionNames() == null) ? 0 : getFunctionNames().hashCode());
        hashCode = prime * hashCode + ((getFunctionTags() == null) ? 0 : getFunctionTags().hashCode());
        hashCode = prime * hashCode + ((getResourceIds() == null) ? 0 : getResourceIds().hashCode());
        hashCode = prime * hashCode + ((getRuntimes() == null) ? 0 : getRuntimes().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        return hashCode;
    }

    @Override
    public LambdaFunctionAggregation clone() {
        try {
            return (LambdaFunctionAggregation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.LambdaFunctionAggregationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
