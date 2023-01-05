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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/BatchGetAssetPropertyValue"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetAssetPropertyValueResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of the errors (if any) associated with the batch request. Each error entry contains the
     * <code>entryId</code> of the entry that failed.
     * </p>
     */
    private java.util.List<BatchGetAssetPropertyValueErrorEntry> errorEntries;
    /**
     * <p>
     * A list of entries that were processed successfully by this batch request. Each success entry contains the
     * <code>entryId</code> of the entry that succeeded and the latest query result.
     * </p>
     */
    private java.util.List<BatchGetAssetPropertyValueSuccessEntry> successEntries;
    /**
     * <p>
     * A list of entries that were not processed by this batch request. because these entries had been completely
     * processed by previous paginated requests. Each skipped entry contains the <code>entryId</code> of the entry that
     * skipped.
     * </p>
     */
    private java.util.List<BatchGetAssetPropertyValueSkippedEntry> skippedEntries;
    /**
     * <p>
     * The token for the next set of results, or null if there are no additional results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of the errors (if any) associated with the batch request. Each error entry contains the
     * <code>entryId</code> of the entry that failed.
     * </p>
     * 
     * @return A list of the errors (if any) associated with the batch request. Each error entry contains the
     *         <code>entryId</code> of the entry that failed.
     */

    public java.util.List<BatchGetAssetPropertyValueErrorEntry> getErrorEntries() {
        return errorEntries;
    }

    /**
     * <p>
     * A list of the errors (if any) associated with the batch request. Each error entry contains the
     * <code>entryId</code> of the entry that failed.
     * </p>
     * 
     * @param errorEntries
     *        A list of the errors (if any) associated with the batch request. Each error entry contains the
     *        <code>entryId</code> of the entry that failed.
     */

    public void setErrorEntries(java.util.Collection<BatchGetAssetPropertyValueErrorEntry> errorEntries) {
        if (errorEntries == null) {
            this.errorEntries = null;
            return;
        }

        this.errorEntries = new java.util.ArrayList<BatchGetAssetPropertyValueErrorEntry>(errorEntries);
    }

    /**
     * <p>
     * A list of the errors (if any) associated with the batch request. Each error entry contains the
     * <code>entryId</code> of the entry that failed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrorEntries(java.util.Collection)} or {@link #withErrorEntries(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param errorEntries
     *        A list of the errors (if any) associated with the batch request. Each error entry contains the
     *        <code>entryId</code> of the entry that failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetAssetPropertyValueResult withErrorEntries(BatchGetAssetPropertyValueErrorEntry... errorEntries) {
        if (this.errorEntries == null) {
            setErrorEntries(new java.util.ArrayList<BatchGetAssetPropertyValueErrorEntry>(errorEntries.length));
        }
        for (BatchGetAssetPropertyValueErrorEntry ele : errorEntries) {
            this.errorEntries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the errors (if any) associated with the batch request. Each error entry contains the
     * <code>entryId</code> of the entry that failed.
     * </p>
     * 
     * @param errorEntries
     *        A list of the errors (if any) associated with the batch request. Each error entry contains the
     *        <code>entryId</code> of the entry that failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetAssetPropertyValueResult withErrorEntries(java.util.Collection<BatchGetAssetPropertyValueErrorEntry> errorEntries) {
        setErrorEntries(errorEntries);
        return this;
    }

    /**
     * <p>
     * A list of entries that were processed successfully by this batch request. Each success entry contains the
     * <code>entryId</code> of the entry that succeeded and the latest query result.
     * </p>
     * 
     * @return A list of entries that were processed successfully by this batch request. Each success entry contains the
     *         <code>entryId</code> of the entry that succeeded and the latest query result.
     */

    public java.util.List<BatchGetAssetPropertyValueSuccessEntry> getSuccessEntries() {
        return successEntries;
    }

    /**
     * <p>
     * A list of entries that were processed successfully by this batch request. Each success entry contains the
     * <code>entryId</code> of the entry that succeeded and the latest query result.
     * </p>
     * 
     * @param successEntries
     *        A list of entries that were processed successfully by this batch request. Each success entry contains the
     *        <code>entryId</code> of the entry that succeeded and the latest query result.
     */

    public void setSuccessEntries(java.util.Collection<BatchGetAssetPropertyValueSuccessEntry> successEntries) {
        if (successEntries == null) {
            this.successEntries = null;
            return;
        }

        this.successEntries = new java.util.ArrayList<BatchGetAssetPropertyValueSuccessEntry>(successEntries);
    }

    /**
     * <p>
     * A list of entries that were processed successfully by this batch request. Each success entry contains the
     * <code>entryId</code> of the entry that succeeded and the latest query result.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSuccessEntries(java.util.Collection)} or {@link #withSuccessEntries(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param successEntries
     *        A list of entries that were processed successfully by this batch request. Each success entry contains the
     *        <code>entryId</code> of the entry that succeeded and the latest query result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetAssetPropertyValueResult withSuccessEntries(BatchGetAssetPropertyValueSuccessEntry... successEntries) {
        if (this.successEntries == null) {
            setSuccessEntries(new java.util.ArrayList<BatchGetAssetPropertyValueSuccessEntry>(successEntries.length));
        }
        for (BatchGetAssetPropertyValueSuccessEntry ele : successEntries) {
            this.successEntries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of entries that were processed successfully by this batch request. Each success entry contains the
     * <code>entryId</code> of the entry that succeeded and the latest query result.
     * </p>
     * 
     * @param successEntries
     *        A list of entries that were processed successfully by this batch request. Each success entry contains the
     *        <code>entryId</code> of the entry that succeeded and the latest query result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetAssetPropertyValueResult withSuccessEntries(java.util.Collection<BatchGetAssetPropertyValueSuccessEntry> successEntries) {
        setSuccessEntries(successEntries);
        return this;
    }

    /**
     * <p>
     * A list of entries that were not processed by this batch request. because these entries had been completely
     * processed by previous paginated requests. Each skipped entry contains the <code>entryId</code> of the entry that
     * skipped.
     * </p>
     * 
     * @return A list of entries that were not processed by this batch request. because these entries had been
     *         completely processed by previous paginated requests. Each skipped entry contains the <code>entryId</code>
     *         of the entry that skipped.
     */

    public java.util.List<BatchGetAssetPropertyValueSkippedEntry> getSkippedEntries() {
        return skippedEntries;
    }

    /**
     * <p>
     * A list of entries that were not processed by this batch request. because these entries had been completely
     * processed by previous paginated requests. Each skipped entry contains the <code>entryId</code> of the entry that
     * skipped.
     * </p>
     * 
     * @param skippedEntries
     *        A list of entries that were not processed by this batch request. because these entries had been completely
     *        processed by previous paginated requests. Each skipped entry contains the <code>entryId</code> of the
     *        entry that skipped.
     */

    public void setSkippedEntries(java.util.Collection<BatchGetAssetPropertyValueSkippedEntry> skippedEntries) {
        if (skippedEntries == null) {
            this.skippedEntries = null;
            return;
        }

        this.skippedEntries = new java.util.ArrayList<BatchGetAssetPropertyValueSkippedEntry>(skippedEntries);
    }

    /**
     * <p>
     * A list of entries that were not processed by this batch request. because these entries had been completely
     * processed by previous paginated requests. Each skipped entry contains the <code>entryId</code> of the entry that
     * skipped.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSkippedEntries(java.util.Collection)} or {@link #withSkippedEntries(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param skippedEntries
     *        A list of entries that were not processed by this batch request. because these entries had been completely
     *        processed by previous paginated requests. Each skipped entry contains the <code>entryId</code> of the
     *        entry that skipped.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetAssetPropertyValueResult withSkippedEntries(BatchGetAssetPropertyValueSkippedEntry... skippedEntries) {
        if (this.skippedEntries == null) {
            setSkippedEntries(new java.util.ArrayList<BatchGetAssetPropertyValueSkippedEntry>(skippedEntries.length));
        }
        for (BatchGetAssetPropertyValueSkippedEntry ele : skippedEntries) {
            this.skippedEntries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of entries that were not processed by this batch request. because these entries had been completely
     * processed by previous paginated requests. Each skipped entry contains the <code>entryId</code> of the entry that
     * skipped.
     * </p>
     * 
     * @param skippedEntries
     *        A list of entries that were not processed by this batch request. because these entries had been completely
     *        processed by previous paginated requests. Each skipped entry contains the <code>entryId</code> of the
     *        entry that skipped.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetAssetPropertyValueResult withSkippedEntries(java.util.Collection<BatchGetAssetPropertyValueSkippedEntry> skippedEntries) {
        setSkippedEntries(skippedEntries);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no additional results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or null if there are no additional results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no additional results.
     * </p>
     * 
     * @return The token for the next set of results, or null if there are no additional results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no additional results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or null if there are no additional results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetAssetPropertyValueResult withNextToken(String nextToken) {
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
        if (getErrorEntries() != null)
            sb.append("ErrorEntries: ").append(getErrorEntries()).append(",");
        if (getSuccessEntries() != null)
            sb.append("SuccessEntries: ").append(getSuccessEntries()).append(",");
        if (getSkippedEntries() != null)
            sb.append("SkippedEntries: ").append(getSkippedEntries()).append(",");
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

        if (obj instanceof BatchGetAssetPropertyValueResult == false)
            return false;
        BatchGetAssetPropertyValueResult other = (BatchGetAssetPropertyValueResult) obj;
        if (other.getErrorEntries() == null ^ this.getErrorEntries() == null)
            return false;
        if (other.getErrorEntries() != null && other.getErrorEntries().equals(this.getErrorEntries()) == false)
            return false;
        if (other.getSuccessEntries() == null ^ this.getSuccessEntries() == null)
            return false;
        if (other.getSuccessEntries() != null && other.getSuccessEntries().equals(this.getSuccessEntries()) == false)
            return false;
        if (other.getSkippedEntries() == null ^ this.getSkippedEntries() == null)
            return false;
        if (other.getSkippedEntries() != null && other.getSkippedEntries().equals(this.getSkippedEntries()) == false)
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

        hashCode = prime * hashCode + ((getErrorEntries() == null) ? 0 : getErrorEntries().hashCode());
        hashCode = prime * hashCode + ((getSuccessEntries() == null) ? 0 : getSuccessEntries().hashCode());
        hashCode = prime * hashCode + ((getSkippedEntries() == null) ? 0 : getSkippedEntries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetAssetPropertyValueResult clone() {
        try {
            return (BatchGetAssetPropertyValueResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
