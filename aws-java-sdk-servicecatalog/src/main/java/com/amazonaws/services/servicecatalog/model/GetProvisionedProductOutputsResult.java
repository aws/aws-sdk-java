/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/GetProvisionedProductOutputs"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetProvisionedProductOutputsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the product created as the result of a request. For example, the output for a
     * CloudFormation-backed product that creates an S3 bucket would include the S3 bucket URL.
     * </p>
     */
    private java.util.List<RecordOutput> outputs;
    /**
     * <p>
     * The page token to use to retrieve the next set of results. If there are no additional results, this value is
     * null.
     * </p>
     */
    private String nextPageToken;

    /**
     * <p>
     * Information about the product created as the result of a request. For example, the output for a
     * CloudFormation-backed product that creates an S3 bucket would include the S3 bucket URL.
     * </p>
     * 
     * @return Information about the product created as the result of a request. For example, the output for a
     *         CloudFormation-backed product that creates an S3 bucket would include the S3 bucket URL.
     */

    public java.util.List<RecordOutput> getOutputs() {
        return outputs;
    }

    /**
     * <p>
     * Information about the product created as the result of a request. For example, the output for a
     * CloudFormation-backed product that creates an S3 bucket would include the S3 bucket URL.
     * </p>
     * 
     * @param outputs
     *        Information about the product created as the result of a request. For example, the output for a
     *        CloudFormation-backed product that creates an S3 bucket would include the S3 bucket URL.
     */

    public void setOutputs(java.util.Collection<RecordOutput> outputs) {
        if (outputs == null) {
            this.outputs = null;
            return;
        }

        this.outputs = new java.util.ArrayList<RecordOutput>(outputs);
    }

    /**
     * <p>
     * Information about the product created as the result of a request. For example, the output for a
     * CloudFormation-backed product that creates an S3 bucket would include the S3 bucket URL.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutputs(java.util.Collection)} or {@link #withOutputs(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param outputs
     *        Information about the product created as the result of a request. For example, the output for a
     *        CloudFormation-backed product that creates an S3 bucket would include the S3 bucket URL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProvisionedProductOutputsResult withOutputs(RecordOutput... outputs) {
        if (this.outputs == null) {
            setOutputs(new java.util.ArrayList<RecordOutput>(outputs.length));
        }
        for (RecordOutput ele : outputs) {
            this.outputs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the product created as the result of a request. For example, the output for a
     * CloudFormation-backed product that creates an S3 bucket would include the S3 bucket URL.
     * </p>
     * 
     * @param outputs
     *        Information about the product created as the result of a request. For example, the output for a
     *        CloudFormation-backed product that creates an S3 bucket would include the S3 bucket URL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProvisionedProductOutputsResult withOutputs(java.util.Collection<RecordOutput> outputs) {
        setOutputs(outputs);
        return this;
    }

    /**
     * <p>
     * The page token to use to retrieve the next set of results. If there are no additional results, this value is
     * null.
     * </p>
     * 
     * @param nextPageToken
     *        The page token to use to retrieve the next set of results. If there are no additional results, this value
     *        is null.
     */

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * The page token to use to retrieve the next set of results. If there are no additional results, this value is
     * null.
     * </p>
     * 
     * @return The page token to use to retrieve the next set of results. If there are no additional results, this value
     *         is null.
     */

    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * <p>
     * The page token to use to retrieve the next set of results. If there are no additional results, this value is
     * null.
     * </p>
     * 
     * @param nextPageToken
     *        The page token to use to retrieve the next set of results. If there are no additional results, this value
     *        is null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProvisionedProductOutputsResult withNextPageToken(String nextPageToken) {
        setNextPageToken(nextPageToken);
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
        if (getOutputs() != null)
            sb.append("Outputs: ").append(getOutputs()).append(",");
        if (getNextPageToken() != null)
            sb.append("NextPageToken: ").append(getNextPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetProvisionedProductOutputsResult == false)
            return false;
        GetProvisionedProductOutputsResult other = (GetProvisionedProductOutputsResult) obj;
        if (other.getOutputs() == null ^ this.getOutputs() == null)
            return false;
        if (other.getOutputs() != null && other.getOutputs().equals(this.getOutputs()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOutputs() == null) ? 0 : getOutputs().hashCode());
        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        return hashCode;
    }

    @Override
    public GetProvisionedProductOutputsResult clone() {
        try {
            return (GetProvisionedProductOutputsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
