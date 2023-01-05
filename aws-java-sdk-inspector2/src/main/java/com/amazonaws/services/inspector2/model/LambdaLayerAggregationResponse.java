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
 * A response that contains the results of an AWS Lambda function layer finding aggregation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/LambdaLayerAggregationResponse"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LambdaLayerAggregationResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The account ID of the AWS Lambda function layer.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The names of the AWS Lambda functions associated with the layers.
     * </p>
     */
    private String functionName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Lambda function layer.
     * </p>
     */
    private String layerArn;
    /**
     * <p>
     * The Resource ID of the AWS Lambda function layer.
     * </p>
     */
    private String resourceId;

    private SeverityCounts severityCounts;

    /**
     * <p>
     * The account ID of the AWS Lambda function layer.
     * </p>
     * 
     * @param accountId
     *        The account ID of the AWS Lambda function layer.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The account ID of the AWS Lambda function layer.
     * </p>
     * 
     * @return The account ID of the AWS Lambda function layer.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The account ID of the AWS Lambda function layer.
     * </p>
     * 
     * @param accountId
     *        The account ID of the AWS Lambda function layer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaLayerAggregationResponse withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The names of the AWS Lambda functions associated with the layers.
     * </p>
     * 
     * @param functionName
     *        The names of the AWS Lambda functions associated with the layers.
     */

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    /**
     * <p>
     * The names of the AWS Lambda functions associated with the layers.
     * </p>
     * 
     * @return The names of the AWS Lambda functions associated with the layers.
     */

    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * <p>
     * The names of the AWS Lambda functions associated with the layers.
     * </p>
     * 
     * @param functionName
     *        The names of the AWS Lambda functions associated with the layers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaLayerAggregationResponse withFunctionName(String functionName) {
        setFunctionName(functionName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Lambda function layer.
     * </p>
     * 
     * @param layerArn
     *        The Amazon Resource Name (ARN) of the AWS Lambda function layer.
     */

    public void setLayerArn(String layerArn) {
        this.layerArn = layerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Lambda function layer.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the AWS Lambda function layer.
     */

    public String getLayerArn() {
        return this.layerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Lambda function layer.
     * </p>
     * 
     * @param layerArn
     *        The Amazon Resource Name (ARN) of the AWS Lambda function layer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaLayerAggregationResponse withLayerArn(String layerArn) {
        setLayerArn(layerArn);
        return this;
    }

    /**
     * <p>
     * The Resource ID of the AWS Lambda function layer.
     * </p>
     * 
     * @param resourceId
     *        The Resource ID of the AWS Lambda function layer.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The Resource ID of the AWS Lambda function layer.
     * </p>
     * 
     * @return The Resource ID of the AWS Lambda function layer.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The Resource ID of the AWS Lambda function layer.
     * </p>
     * 
     * @param resourceId
     *        The Resource ID of the AWS Lambda function layer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaLayerAggregationResponse withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * @param severityCounts
     */

    public void setSeverityCounts(SeverityCounts severityCounts) {
        this.severityCounts = severityCounts;
    }

    /**
     * @return
     */

    public SeverityCounts getSeverityCounts() {
        return this.severityCounts;
    }

    /**
     * @param severityCounts
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaLayerAggregationResponse withSeverityCounts(SeverityCounts severityCounts) {
        setSeverityCounts(severityCounts);
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getFunctionName() != null)
            sb.append("FunctionName: ").append(getFunctionName()).append(",");
        if (getLayerArn() != null)
            sb.append("LayerArn: ").append(getLayerArn()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getSeverityCounts() != null)
            sb.append("SeverityCounts: ").append(getSeverityCounts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LambdaLayerAggregationResponse == false)
            return false;
        LambdaLayerAggregationResponse other = (LambdaLayerAggregationResponse) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getFunctionName() == null ^ this.getFunctionName() == null)
            return false;
        if (other.getFunctionName() != null && other.getFunctionName().equals(this.getFunctionName()) == false)
            return false;
        if (other.getLayerArn() == null ^ this.getLayerArn() == null)
            return false;
        if (other.getLayerArn() != null && other.getLayerArn().equals(this.getLayerArn()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getSeverityCounts() == null ^ this.getSeverityCounts() == null)
            return false;
        if (other.getSeverityCounts() != null && other.getSeverityCounts().equals(this.getSeverityCounts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getFunctionName() == null) ? 0 : getFunctionName().hashCode());
        hashCode = prime * hashCode + ((getLayerArn() == null) ? 0 : getLayerArn().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getSeverityCounts() == null) ? 0 : getSeverityCounts().hashCode());
        return hashCode;
    }

    @Override
    public LambdaLayerAggregationResponse clone() {
        try {
            return (LambdaLayerAggregationResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.LambdaLayerAggregationResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
