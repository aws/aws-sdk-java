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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetCostAndUsage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCostAndUsageResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The token for the next set of retrievable results. AWS provides the token when the response from a previous call
     * has more results than the maximum page size.
     * </p>
     */
    private String nextPageToken;
    /**
     * <p>
     * The groups that are specified by the <code>Filter</code> or <code>GroupBy</code> parameters in the request.
     * </p>
     */
    private java.util.List<GroupDefinition> groupDefinitions;
    /**
     * <p>
     * The time period that is covered by the results in the response.
     * </p>
     */
    private java.util.List<ResultByTime> resultsByTime;

    /**
     * <p>
     * The token for the next set of retrievable results. AWS provides the token when the response from a previous call
     * has more results than the maximum page size.
     * </p>
     * 
     * @param nextPageToken
     *        The token for the next set of retrievable results. AWS provides the token when the response from a
     *        previous call has more results than the maximum page size.
     */

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * The token for the next set of retrievable results. AWS provides the token when the response from a previous call
     * has more results than the maximum page size.
     * </p>
     * 
     * @return The token for the next set of retrievable results. AWS provides the token when the response from a
     *         previous call has more results than the maximum page size.
     */

    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * <p>
     * The token for the next set of retrievable results. AWS provides the token when the response from a previous call
     * has more results than the maximum page size.
     * </p>
     * 
     * @param nextPageToken
     *        The token for the next set of retrievable results. AWS provides the token when the response from a
     *        previous call has more results than the maximum page size.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCostAndUsageResult withNextPageToken(String nextPageToken) {
        setNextPageToken(nextPageToken);
        return this;
    }

    /**
     * <p>
     * The groups that are specified by the <code>Filter</code> or <code>GroupBy</code> parameters in the request.
     * </p>
     * 
     * @return The groups that are specified by the <code>Filter</code> or <code>GroupBy</code> parameters in the
     *         request.
     */

    public java.util.List<GroupDefinition> getGroupDefinitions() {
        return groupDefinitions;
    }

    /**
     * <p>
     * The groups that are specified by the <code>Filter</code> or <code>GroupBy</code> parameters in the request.
     * </p>
     * 
     * @param groupDefinitions
     *        The groups that are specified by the <code>Filter</code> or <code>GroupBy</code> parameters in the
     *        request.
     */

    public void setGroupDefinitions(java.util.Collection<GroupDefinition> groupDefinitions) {
        if (groupDefinitions == null) {
            this.groupDefinitions = null;
            return;
        }

        this.groupDefinitions = new java.util.ArrayList<GroupDefinition>(groupDefinitions);
    }

    /**
     * <p>
     * The groups that are specified by the <code>Filter</code> or <code>GroupBy</code> parameters in the request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroupDefinitions(java.util.Collection)} or {@link #withGroupDefinitions(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param groupDefinitions
     *        The groups that are specified by the <code>Filter</code> or <code>GroupBy</code> parameters in the
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCostAndUsageResult withGroupDefinitions(GroupDefinition... groupDefinitions) {
        if (this.groupDefinitions == null) {
            setGroupDefinitions(new java.util.ArrayList<GroupDefinition>(groupDefinitions.length));
        }
        for (GroupDefinition ele : groupDefinitions) {
            this.groupDefinitions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The groups that are specified by the <code>Filter</code> or <code>GroupBy</code> parameters in the request.
     * </p>
     * 
     * @param groupDefinitions
     *        The groups that are specified by the <code>Filter</code> or <code>GroupBy</code> parameters in the
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCostAndUsageResult withGroupDefinitions(java.util.Collection<GroupDefinition> groupDefinitions) {
        setGroupDefinitions(groupDefinitions);
        return this;
    }

    /**
     * <p>
     * The time period that is covered by the results in the response.
     * </p>
     * 
     * @return The time period that is covered by the results in the response.
     */

    public java.util.List<ResultByTime> getResultsByTime() {
        return resultsByTime;
    }

    /**
     * <p>
     * The time period that is covered by the results in the response.
     * </p>
     * 
     * @param resultsByTime
     *        The time period that is covered by the results in the response.
     */

    public void setResultsByTime(java.util.Collection<ResultByTime> resultsByTime) {
        if (resultsByTime == null) {
            this.resultsByTime = null;
            return;
        }

        this.resultsByTime = new java.util.ArrayList<ResultByTime>(resultsByTime);
    }

    /**
     * <p>
     * The time period that is covered by the results in the response.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResultsByTime(java.util.Collection)} or {@link #withResultsByTime(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param resultsByTime
     *        The time period that is covered by the results in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCostAndUsageResult withResultsByTime(ResultByTime... resultsByTime) {
        if (this.resultsByTime == null) {
            setResultsByTime(new java.util.ArrayList<ResultByTime>(resultsByTime.length));
        }
        for (ResultByTime ele : resultsByTime) {
            this.resultsByTime.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The time period that is covered by the results in the response.
     * </p>
     * 
     * @param resultsByTime
     *        The time period that is covered by the results in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCostAndUsageResult withResultsByTime(java.util.Collection<ResultByTime> resultsByTime) {
        setResultsByTime(resultsByTime);
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
        if (getNextPageToken() != null)
            sb.append("NextPageToken: ").append(getNextPageToken()).append(",");
        if (getGroupDefinitions() != null)
            sb.append("GroupDefinitions: ").append(getGroupDefinitions()).append(",");
        if (getResultsByTime() != null)
            sb.append("ResultsByTime: ").append(getResultsByTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCostAndUsageResult == false)
            return false;
        GetCostAndUsageResult other = (GetCostAndUsageResult) obj;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        if (other.getGroupDefinitions() == null ^ this.getGroupDefinitions() == null)
            return false;
        if (other.getGroupDefinitions() != null && other.getGroupDefinitions().equals(this.getGroupDefinitions()) == false)
            return false;
        if (other.getResultsByTime() == null ^ this.getResultsByTime() == null)
            return false;
        if (other.getResultsByTime() != null && other.getResultsByTime().equals(this.getResultsByTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        hashCode = prime * hashCode + ((getGroupDefinitions() == null) ? 0 : getGroupDefinitions().hashCode());
        hashCode = prime * hashCode + ((getResultsByTime() == null) ? 0 : getResultsByTime().hashCode());
        return hashCode;
    }

    @Override
    public GetCostAndUsageResult clone() {
        try {
            return (GetCostAndUsageResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
