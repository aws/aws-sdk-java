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
package com.amazonaws.services.pinpointsmsvoicev2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeOptOutLists"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeOptOutListsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The OptOutLists to show the details of. This is an array of strings that can be either the OptOutListName or
     * OptOutListArn.
     * </p>
     */
    private java.util.List<String> optOutListNames;
    /**
     * <p>
     * The token to be used for the next set of paginated results. You don't need to supply a value for this field in
     * the initial request.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return per each request.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The OptOutLists to show the details of. This is an array of strings that can be either the OptOutListName or
     * OptOutListArn.
     * </p>
     * 
     * @return The OptOutLists to show the details of. This is an array of strings that can be either the OptOutListName
     *         or OptOutListArn.
     */

    public java.util.List<String> getOptOutListNames() {
        return optOutListNames;
    }

    /**
     * <p>
     * The OptOutLists to show the details of. This is an array of strings that can be either the OptOutListName or
     * OptOutListArn.
     * </p>
     * 
     * @param optOutListNames
     *        The OptOutLists to show the details of. This is an array of strings that can be either the OptOutListName
     *        or OptOutListArn.
     */

    public void setOptOutListNames(java.util.Collection<String> optOutListNames) {
        if (optOutListNames == null) {
            this.optOutListNames = null;
            return;
        }

        this.optOutListNames = new java.util.ArrayList<String>(optOutListNames);
    }

    /**
     * <p>
     * The OptOutLists to show the details of. This is an array of strings that can be either the OptOutListName or
     * OptOutListArn.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOptOutListNames(java.util.Collection)} or {@link #withOptOutListNames(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param optOutListNames
     *        The OptOutLists to show the details of. This is an array of strings that can be either the OptOutListName
     *        or OptOutListArn.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOptOutListsRequest withOptOutListNames(String... optOutListNames) {
        if (this.optOutListNames == null) {
            setOptOutListNames(new java.util.ArrayList<String>(optOutListNames.length));
        }
        for (String ele : optOutListNames) {
            this.optOutListNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The OptOutLists to show the details of. This is an array of strings that can be either the OptOutListName or
     * OptOutListArn.
     * </p>
     * 
     * @param optOutListNames
     *        The OptOutLists to show the details of. This is an array of strings that can be either the OptOutListName
     *        or OptOutListArn.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOptOutListsRequest withOptOutListNames(java.util.Collection<String> optOutListNames) {
        setOptOutListNames(optOutListNames);
        return this;
    }

    /**
     * <p>
     * The token to be used for the next set of paginated results. You don't need to supply a value for this field in
     * the initial request.
     * </p>
     * 
     * @param nextToken
     *        The token to be used for the next set of paginated results. You don't need to supply a value for this
     *        field in the initial request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to be used for the next set of paginated results. You don't need to supply a value for this field in
     * the initial request.
     * </p>
     * 
     * @return The token to be used for the next set of paginated results. You don't need to supply a value for this
     *         field in the initial request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to be used for the next set of paginated results. You don't need to supply a value for this field in
     * the initial request.
     * </p>
     * 
     * @param nextToken
     *        The token to be used for the next set of paginated results. You don't need to supply a value for this
     *        field in the initial request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOptOutListsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return per each request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return per each request.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per each request.
     * </p>
     * 
     * @return The maximum number of results to return per each request.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per each request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return per each request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOptOutListsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getOptOutListNames() != null)
            sb.append("OptOutListNames: ").append(getOptOutListNames()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeOptOutListsRequest == false)
            return false;
        DescribeOptOutListsRequest other = (DescribeOptOutListsRequest) obj;
        if (other.getOptOutListNames() == null ^ this.getOptOutListNames() == null)
            return false;
        if (other.getOptOutListNames() != null && other.getOptOutListNames().equals(this.getOptOutListNames()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOptOutListNames() == null) ? 0 : getOptOutListNames().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public DescribeOptOutListsRequest clone() {
        return (DescribeOptOutListsRequest) super.clone();
    }

}
