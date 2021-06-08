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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/ListExports" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListExportsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of <code>ExportSummary</code> objects.
     * </p>
     */
    private java.util.List<ExportSummary> exportSummaries;
    /**
     * <p>
     * If this value is returned, there are additional results to be displayed. To retrieve them, call
     * <code>ListExports</code> again, with <code>NextToken</code> set to this value.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of <code>ExportSummary</code> objects.
     * </p>
     * 
     * @return A list of <code>ExportSummary</code> objects.
     */

    public java.util.List<ExportSummary> getExportSummaries() {
        return exportSummaries;
    }

    /**
     * <p>
     * A list of <code>ExportSummary</code> objects.
     * </p>
     * 
     * @param exportSummaries
     *        A list of <code>ExportSummary</code> objects.
     */

    public void setExportSummaries(java.util.Collection<ExportSummary> exportSummaries) {
        if (exportSummaries == null) {
            this.exportSummaries = null;
            return;
        }

        this.exportSummaries = new java.util.ArrayList<ExportSummary>(exportSummaries);
    }

    /**
     * <p>
     * A list of <code>ExportSummary</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExportSummaries(java.util.Collection)} or {@link #withExportSummaries(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param exportSummaries
     *        A list of <code>ExportSummary</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExportsResult withExportSummaries(ExportSummary... exportSummaries) {
        if (this.exportSummaries == null) {
            setExportSummaries(new java.util.ArrayList<ExportSummary>(exportSummaries.length));
        }
        for (ExportSummary ele : exportSummaries) {
            this.exportSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>ExportSummary</code> objects.
     * </p>
     * 
     * @param exportSummaries
     *        A list of <code>ExportSummary</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExportsResult withExportSummaries(java.util.Collection<ExportSummary> exportSummaries) {
        setExportSummaries(exportSummaries);
        return this;
    }

    /**
     * <p>
     * If this value is returned, there are additional results to be displayed. To retrieve them, call
     * <code>ListExports</code> again, with <code>NextToken</code> set to this value.
     * </p>
     * 
     * @param nextToken
     *        If this value is returned, there are additional results to be displayed. To retrieve them, call
     *        <code>ListExports</code> again, with <code>NextToken</code> set to this value.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If this value is returned, there are additional results to be displayed. To retrieve them, call
     * <code>ListExports</code> again, with <code>NextToken</code> set to this value.
     * </p>
     * 
     * @return If this value is returned, there are additional results to be displayed. To retrieve them, call
     *         <code>ListExports</code> again, with <code>NextToken</code> set to this value.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If this value is returned, there are additional results to be displayed. To retrieve them, call
     * <code>ListExports</code> again, with <code>NextToken</code> set to this value.
     * </p>
     * 
     * @param nextToken
     *        If this value is returned, there are additional results to be displayed. To retrieve them, call
     *        <code>ListExports</code> again, with <code>NextToken</code> set to this value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExportsResult withNextToken(String nextToken) {
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
        if (getExportSummaries() != null)
            sb.append("ExportSummaries: ").append(getExportSummaries()).append(",");
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

        if (obj instanceof ListExportsResult == false)
            return false;
        ListExportsResult other = (ListExportsResult) obj;
        if (other.getExportSummaries() == null ^ this.getExportSummaries() == null)
            return false;
        if (other.getExportSummaries() != null && other.getExportSummaries().equals(this.getExportSummaries()) == false)
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

        hashCode = prime * hashCode + ((getExportSummaries() == null) ? 0 : getExportSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListExportsResult clone() {
        try {
            return (ListExportsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
