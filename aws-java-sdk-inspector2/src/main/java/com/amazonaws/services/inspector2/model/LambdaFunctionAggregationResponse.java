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
 * A response that contains the results of an AWS Lambda function finding aggregation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/LambdaFunctionAggregationResponse"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LambdaFunctionAggregationResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the AWS account that owns the AWS Lambda function.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The AWS Lambda function names included in the aggregation results.
     * </p>
     */
    private String functionName;
    /**
     * <p>
     * The tags included in the aggregation results.
     * </p>
     */
    private java.util.Map<String, String> lambdaTags;
    /**
     * <p>
     * The date that the AWS Lambda function included in the aggregation results was last changed.
     * </p>
     */
    private java.util.Date lastModifiedAt;
    /**
     * <p>
     * The resource IDs included in the aggregation results.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The runtimes included in the aggregation results.
     * </p>
     */
    private String runtime;

    private SeverityCounts severityCounts;

    /**
     * <p>
     * The ID of the AWS account that owns the AWS Lambda function.
     * </p>
     * 
     * @param accountId
     *        The ID of the AWS account that owns the AWS Lambda function.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the AWS Lambda function.
     * </p>
     * 
     * @return The ID of the AWS account that owns the AWS Lambda function.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the AWS Lambda function.
     * </p>
     * 
     * @param accountId
     *        The ID of the AWS account that owns the AWS Lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionAggregationResponse withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The AWS Lambda function names included in the aggregation results.
     * </p>
     * 
     * @param functionName
     *        The AWS Lambda function names included in the aggregation results.
     */

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    /**
     * <p>
     * The AWS Lambda function names included in the aggregation results.
     * </p>
     * 
     * @return The AWS Lambda function names included in the aggregation results.
     */

    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * <p>
     * The AWS Lambda function names included in the aggregation results.
     * </p>
     * 
     * @param functionName
     *        The AWS Lambda function names included in the aggregation results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionAggregationResponse withFunctionName(String functionName) {
        setFunctionName(functionName);
        return this;
    }

    /**
     * <p>
     * The tags included in the aggregation results.
     * </p>
     * 
     * @return The tags included in the aggregation results.
     */

    public java.util.Map<String, String> getLambdaTags() {
        return lambdaTags;
    }

    /**
     * <p>
     * The tags included in the aggregation results.
     * </p>
     * 
     * @param lambdaTags
     *        The tags included in the aggregation results.
     */

    public void setLambdaTags(java.util.Map<String, String> lambdaTags) {
        this.lambdaTags = lambdaTags;
    }

    /**
     * <p>
     * The tags included in the aggregation results.
     * </p>
     * 
     * @param lambdaTags
     *        The tags included in the aggregation results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionAggregationResponse withLambdaTags(java.util.Map<String, String> lambdaTags) {
        setLambdaTags(lambdaTags);
        return this;
    }

    /**
     * Add a single LambdaTags entry
     *
     * @see LambdaFunctionAggregationResponse#withLambdaTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionAggregationResponse addLambdaTagsEntry(String key, String value) {
        if (null == this.lambdaTags) {
            this.lambdaTags = new java.util.HashMap<String, String>();
        }
        if (this.lambdaTags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.lambdaTags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into LambdaTags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionAggregationResponse clearLambdaTagsEntries() {
        this.lambdaTags = null;
        return this;
    }

    /**
     * <p>
     * The date that the AWS Lambda function included in the aggregation results was last changed.
     * </p>
     * 
     * @param lastModifiedAt
     *        The date that the AWS Lambda function included in the aggregation results was last changed.
     */

    public void setLastModifiedAt(java.util.Date lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    /**
     * <p>
     * The date that the AWS Lambda function included in the aggregation results was last changed.
     * </p>
     * 
     * @return The date that the AWS Lambda function included in the aggregation results was last changed.
     */

    public java.util.Date getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     * <p>
     * The date that the AWS Lambda function included in the aggregation results was last changed.
     * </p>
     * 
     * @param lastModifiedAt
     *        The date that the AWS Lambda function included in the aggregation results was last changed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionAggregationResponse withLastModifiedAt(java.util.Date lastModifiedAt) {
        setLastModifiedAt(lastModifiedAt);
        return this;
    }

    /**
     * <p>
     * The resource IDs included in the aggregation results.
     * </p>
     * 
     * @param resourceId
     *        The resource IDs included in the aggregation results.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The resource IDs included in the aggregation results.
     * </p>
     * 
     * @return The resource IDs included in the aggregation results.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The resource IDs included in the aggregation results.
     * </p>
     * 
     * @param resourceId
     *        The resource IDs included in the aggregation results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionAggregationResponse withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The runtimes included in the aggregation results.
     * </p>
     * 
     * @param runtime
     *        The runtimes included in the aggregation results.
     */

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    /**
     * <p>
     * The runtimes included in the aggregation results.
     * </p>
     * 
     * @return The runtimes included in the aggregation results.
     */

    public String getRuntime() {
        return this.runtime;
    }

    /**
     * <p>
     * The runtimes included in the aggregation results.
     * </p>
     * 
     * @param runtime
     *        The runtimes included in the aggregation results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionAggregationResponse withRuntime(String runtime) {
        setRuntime(runtime);
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

    public LambdaFunctionAggregationResponse withSeverityCounts(SeverityCounts severityCounts) {
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
        if (getLambdaTags() != null)
            sb.append("LambdaTags: ").append(getLambdaTags()).append(",");
        if (getLastModifiedAt() != null)
            sb.append("LastModifiedAt: ").append(getLastModifiedAt()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getRuntime() != null)
            sb.append("Runtime: ").append(getRuntime()).append(",");
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

        if (obj instanceof LambdaFunctionAggregationResponse == false)
            return false;
        LambdaFunctionAggregationResponse other = (LambdaFunctionAggregationResponse) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getFunctionName() == null ^ this.getFunctionName() == null)
            return false;
        if (other.getFunctionName() != null && other.getFunctionName().equals(this.getFunctionName()) == false)
            return false;
        if (other.getLambdaTags() == null ^ this.getLambdaTags() == null)
            return false;
        if (other.getLambdaTags() != null && other.getLambdaTags().equals(this.getLambdaTags()) == false)
            return false;
        if (other.getLastModifiedAt() == null ^ this.getLastModifiedAt() == null)
            return false;
        if (other.getLastModifiedAt() != null && other.getLastModifiedAt().equals(this.getLastModifiedAt()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getRuntime() == null ^ this.getRuntime() == null)
            return false;
        if (other.getRuntime() != null && other.getRuntime().equals(this.getRuntime()) == false)
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
        hashCode = prime * hashCode + ((getLambdaTags() == null) ? 0 : getLambdaTags().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedAt() == null) ? 0 : getLastModifiedAt().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getRuntime() == null) ? 0 : getRuntime().hashCode());
        hashCode = prime * hashCode + ((getSeverityCounts() == null) ? 0 : getSeverityCounts().hashCode());
        return hashCode;
    }

    @Override
    public LambdaFunctionAggregationResponse clone() {
        try {
            return (LambdaFunctionAggregationResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.LambdaFunctionAggregationResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
