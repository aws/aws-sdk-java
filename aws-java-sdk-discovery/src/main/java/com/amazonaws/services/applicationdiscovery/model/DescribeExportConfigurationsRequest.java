/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.applicationdiscovery.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class DescribeExportConfigurationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier that you can use to query the export status.
     * </p>
     */
    private java.util.List<String> exportIds;
    /**
     * <p>
     * The maximum number of results that you want to display as a part of the query.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A token to get the next set of results. For example, if you specified 100 IDs for
     * <code>DescribeConfigurationsRequest$configurationIds</code> but set
     * <code>DescribeExportConfigurationsRequest$maxResults</code> to 10, you will get results in a set of 10. Use the
     * token in the query to get the next set of 10.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A unique identifier that you can use to query the export status.
     * </p>
     * 
     * @return A unique identifier that you can use to query the export status.
     */

    public java.util.List<String> getExportIds() {
        return exportIds;
    }

    /**
     * <p>
     * A unique identifier that you can use to query the export status.
     * </p>
     * 
     * @param exportIds
     *        A unique identifier that you can use to query the export status.
     */

    public void setExportIds(java.util.Collection<String> exportIds) {
        if (exportIds == null) {
            this.exportIds = null;
            return;
        }

        this.exportIds = new java.util.ArrayList<String>(exportIds);
    }

    /**
     * <p>
     * A unique identifier that you can use to query the export status.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExportIds(java.util.Collection)} or {@link #withExportIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param exportIds
     *        A unique identifier that you can use to query the export status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExportConfigurationsRequest withExportIds(String... exportIds) {
        if (this.exportIds == null) {
            setExportIds(new java.util.ArrayList<String>(exportIds.length));
        }
        for (String ele : exportIds) {
            this.exportIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A unique identifier that you can use to query the export status.
     * </p>
     * 
     * @param exportIds
     *        A unique identifier that you can use to query the export status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExportConfigurationsRequest withExportIds(java.util.Collection<String> exportIds) {
        setExportIds(exportIds);
        return this;
    }

    /**
     * <p>
     * The maximum number of results that you want to display as a part of the query.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results that you want to display as a part of the query.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results that you want to display as a part of the query.
     * </p>
     * 
     * @return The maximum number of results that you want to display as a part of the query.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results that you want to display as a part of the query.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results that you want to display as a part of the query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExportConfigurationsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A token to get the next set of results. For example, if you specified 100 IDs for
     * <code>DescribeConfigurationsRequest$configurationIds</code> but set
     * <code>DescribeExportConfigurationsRequest$maxResults</code> to 10, you will get results in a set of 10. Use the
     * token in the query to get the next set of 10.
     * </p>
     * 
     * @param nextToken
     *        A token to get the next set of results. For example, if you specified 100 IDs for
     *        <code>DescribeConfigurationsRequest$configurationIds</code> but set
     *        <code>DescribeExportConfigurationsRequest$maxResults</code> to 10, you will get results in a set of 10.
     *        Use the token in the query to get the next set of 10.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to get the next set of results. For example, if you specified 100 IDs for
     * <code>DescribeConfigurationsRequest$configurationIds</code> but set
     * <code>DescribeExportConfigurationsRequest$maxResults</code> to 10, you will get results in a set of 10. Use the
     * token in the query to get the next set of 10.
     * </p>
     * 
     * @return A token to get the next set of results. For example, if you specified 100 IDs for
     *         <code>DescribeConfigurationsRequest$configurationIds</code> but set
     *         <code>DescribeExportConfigurationsRequest$maxResults</code> to 10, you will get results in a set of 10.
     *         Use the token in the query to get the next set of 10.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token to get the next set of results. For example, if you specified 100 IDs for
     * <code>DescribeConfigurationsRequest$configurationIds</code> but set
     * <code>DescribeExportConfigurationsRequest$maxResults</code> to 10, you will get results in a set of 10. Use the
     * token in the query to get the next set of 10.
     * </p>
     * 
     * @param nextToken
     *        A token to get the next set of results. For example, if you specified 100 IDs for
     *        <code>DescribeConfigurationsRequest$configurationIds</code> but set
     *        <code>DescribeExportConfigurationsRequest$maxResults</code> to 10, you will get results in a set of 10.
     *        Use the token in the query to get the next set of 10.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExportConfigurationsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getExportIds() != null)
            sb.append("ExportIds: " + getExportIds() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeExportConfigurationsRequest == false)
            return false;
        DescribeExportConfigurationsRequest other = (DescribeExportConfigurationsRequest) obj;
        if (other.getExportIds() == null ^ this.getExportIds() == null)
            return false;
        if (other.getExportIds() != null && other.getExportIds().equals(this.getExportIds()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getExportIds() == null) ? 0 : getExportIds().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeExportConfigurationsRequest clone() {
        return (DescribeExportConfigurationsRequest) super.clone();
    }
}
