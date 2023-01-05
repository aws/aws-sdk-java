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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/BatchGetAssetPropertyValue"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetAssetPropertyValueRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The list of asset property value entries for the batch get request. You can specify up to 16 entries per request.
     * </p>
     */
    private java.util.List<BatchGetAssetPropertyValueEntry> entries;
    /**
     * <p>
     * The token to be used for the next set of paginated results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of asset property value entries for the batch get request. You can specify up to 16 entries per request.
     * </p>
     * 
     * @return The list of asset property value entries for the batch get request. You can specify up to 16 entries per
     *         request.
     */

    public java.util.List<BatchGetAssetPropertyValueEntry> getEntries() {
        return entries;
    }

    /**
     * <p>
     * The list of asset property value entries for the batch get request. You can specify up to 16 entries per request.
     * </p>
     * 
     * @param entries
     *        The list of asset property value entries for the batch get request. You can specify up to 16 entries per
     *        request.
     */

    public void setEntries(java.util.Collection<BatchGetAssetPropertyValueEntry> entries) {
        if (entries == null) {
            this.entries = null;
            return;
        }

        this.entries = new java.util.ArrayList<BatchGetAssetPropertyValueEntry>(entries);
    }

    /**
     * <p>
     * The list of asset property value entries for the batch get request. You can specify up to 16 entries per request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntries(java.util.Collection)} or {@link #withEntries(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param entries
     *        The list of asset property value entries for the batch get request. You can specify up to 16 entries per
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetAssetPropertyValueRequest withEntries(BatchGetAssetPropertyValueEntry... entries) {
        if (this.entries == null) {
            setEntries(new java.util.ArrayList<BatchGetAssetPropertyValueEntry>(entries.length));
        }
        for (BatchGetAssetPropertyValueEntry ele : entries) {
            this.entries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of asset property value entries for the batch get request. You can specify up to 16 entries per request.
     * </p>
     * 
     * @param entries
     *        The list of asset property value entries for the batch get request. You can specify up to 16 entries per
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetAssetPropertyValueRequest withEntries(java.util.Collection<BatchGetAssetPropertyValueEntry> entries) {
        setEntries(entries);
        return this;
    }

    /**
     * <p>
     * The token to be used for the next set of paginated results.
     * </p>
     * 
     * @param nextToken
     *        The token to be used for the next set of paginated results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to be used for the next set of paginated results.
     * </p>
     * 
     * @return The token to be used for the next set of paginated results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to be used for the next set of paginated results.
     * </p>
     * 
     * @param nextToken
     *        The token to be used for the next set of paginated results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetAssetPropertyValueRequest withNextToken(String nextToken) {
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
        if (getEntries() != null)
            sb.append("Entries: ").append(getEntries()).append(",");
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

        if (obj instanceof BatchGetAssetPropertyValueRequest == false)
            return false;
        BatchGetAssetPropertyValueRequest other = (BatchGetAssetPropertyValueRequest) obj;
        if (other.getEntries() == null ^ this.getEntries() == null)
            return false;
        if (other.getEntries() != null && other.getEntries().equals(this.getEntries()) == false)
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

        hashCode = prime * hashCode + ((getEntries() == null) ? 0 : getEntries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetAssetPropertyValueRequest clone() {
        return (BatchGetAssetPropertyValueRequest) super.clone();
    }

}
