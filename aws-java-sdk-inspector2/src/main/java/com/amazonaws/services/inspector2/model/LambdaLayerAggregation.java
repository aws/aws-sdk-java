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
 * The details that define a findings aggregation based on an AWS Lambda function's layers.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/LambdaLayerAggregation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LambdaLayerAggregation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The names of the AWS Lambda functions associated with the layers.
     * </p>
     */
    private java.util.List<StringFilter> functionNames;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Lambda function layer.
     * </p>
     */
    private java.util.List<StringFilter> layerArns;
    /**
     * <p>
     * The resource IDs for the AWS Lambda function layers.
     * </p>
     */
    private java.util.List<StringFilter> resourceIds;
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
     * The names of the AWS Lambda functions associated with the layers.
     * </p>
     * 
     * @return The names of the AWS Lambda functions associated with the layers.
     */

    public java.util.List<StringFilter> getFunctionNames() {
        return functionNames;
    }

    /**
     * <p>
     * The names of the AWS Lambda functions associated with the layers.
     * </p>
     * 
     * @param functionNames
     *        The names of the AWS Lambda functions associated with the layers.
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
     * The names of the AWS Lambda functions associated with the layers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFunctionNames(java.util.Collection)} or {@link #withFunctionNames(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param functionNames
     *        The names of the AWS Lambda functions associated with the layers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaLayerAggregation withFunctionNames(StringFilter... functionNames) {
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
     * The names of the AWS Lambda functions associated with the layers.
     * </p>
     * 
     * @param functionNames
     *        The names of the AWS Lambda functions associated with the layers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaLayerAggregation withFunctionNames(java.util.Collection<StringFilter> functionNames) {
        setFunctionNames(functionNames);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Lambda function layer.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the AWS Lambda function layer.
     */

    public java.util.List<StringFilter> getLayerArns() {
        return layerArns;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Lambda function layer.
     * </p>
     * 
     * @param layerArns
     *        The Amazon Resource Name (ARN) of the AWS Lambda function layer.
     */

    public void setLayerArns(java.util.Collection<StringFilter> layerArns) {
        if (layerArns == null) {
            this.layerArns = null;
            return;
        }

        this.layerArns = new java.util.ArrayList<StringFilter>(layerArns);
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Lambda function layer.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLayerArns(java.util.Collection)} or {@link #withLayerArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param layerArns
     *        The Amazon Resource Name (ARN) of the AWS Lambda function layer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaLayerAggregation withLayerArns(StringFilter... layerArns) {
        if (this.layerArns == null) {
            setLayerArns(new java.util.ArrayList<StringFilter>(layerArns.length));
        }
        for (StringFilter ele : layerArns) {
            this.layerArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Lambda function layer.
     * </p>
     * 
     * @param layerArns
     *        The Amazon Resource Name (ARN) of the AWS Lambda function layer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaLayerAggregation withLayerArns(java.util.Collection<StringFilter> layerArns) {
        setLayerArns(layerArns);
        return this;
    }

    /**
     * <p>
     * The resource IDs for the AWS Lambda function layers.
     * </p>
     * 
     * @return The resource IDs for the AWS Lambda function layers.
     */

    public java.util.List<StringFilter> getResourceIds() {
        return resourceIds;
    }

    /**
     * <p>
     * The resource IDs for the AWS Lambda function layers.
     * </p>
     * 
     * @param resourceIds
     *        The resource IDs for the AWS Lambda function layers.
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
     * The resource IDs for the AWS Lambda function layers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceIds(java.util.Collection)} or {@link #withResourceIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceIds
     *        The resource IDs for the AWS Lambda function layers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaLayerAggregation withResourceIds(StringFilter... resourceIds) {
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
     * The resource IDs for the AWS Lambda function layers.
     * </p>
     * 
     * @param resourceIds
     *        The resource IDs for the AWS Lambda function layers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaLayerAggregation withResourceIds(java.util.Collection<StringFilter> resourceIds) {
        setResourceIds(resourceIds);
        return this;
    }

    /**
     * <p>
     * The finding severity to use for sorting the results.
     * </p>
     * 
     * @param sortBy
     *        The finding severity to use for sorting the results.
     * @see LambdaLayerSortBy
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
     * @see LambdaLayerSortBy
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
     * @see LambdaLayerSortBy
     */

    public LambdaLayerAggregation withSortBy(String sortBy) {
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
     * @see LambdaLayerSortBy
     */

    public LambdaLayerAggregation withSortBy(LambdaLayerSortBy sortBy) {
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

    public LambdaLayerAggregation withSortOrder(String sortOrder) {
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

    public LambdaLayerAggregation withSortOrder(SortOrder sortOrder) {
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
        if (getLayerArns() != null)
            sb.append("LayerArns: ").append(getLayerArns()).append(",");
        if (getResourceIds() != null)
            sb.append("ResourceIds: ").append(getResourceIds()).append(",");
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

        if (obj instanceof LambdaLayerAggregation == false)
            return false;
        LambdaLayerAggregation other = (LambdaLayerAggregation) obj;
        if (other.getFunctionNames() == null ^ this.getFunctionNames() == null)
            return false;
        if (other.getFunctionNames() != null && other.getFunctionNames().equals(this.getFunctionNames()) == false)
            return false;
        if (other.getLayerArns() == null ^ this.getLayerArns() == null)
            return false;
        if (other.getLayerArns() != null && other.getLayerArns().equals(this.getLayerArns()) == false)
            return false;
        if (other.getResourceIds() == null ^ this.getResourceIds() == null)
            return false;
        if (other.getResourceIds() != null && other.getResourceIds().equals(this.getResourceIds()) == false)
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
        hashCode = prime * hashCode + ((getLayerArns() == null) ? 0 : getLayerArns().hashCode());
        hashCode = prime * hashCode + ((getResourceIds() == null) ? 0 : getResourceIds().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        return hashCode;
    }

    @Override
    public LambdaLayerAggregation clone() {
        try {
            return (LambdaLayerAggregation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.LambdaLayerAggregationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
