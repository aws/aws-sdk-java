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
package com.amazonaws.services.pinpointsmsvoice.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-2018-09-05/ListConfigurationSets"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListConfigurationSetsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** A token returned from a previous call to the API that indicates the position in the list of results. */
    private String nextToken;
    /** Used to specify the number of items that should be returned in the response. */
    private String pageSize;

    /**
     * A token returned from a previous call to the API that indicates the position in the list of results.
     * 
     * @param nextToken
     *        A token returned from a previous call to the API that indicates the position in the list of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * A token returned from a previous call to the API that indicates the position in the list of results.
     * 
     * @return A token returned from a previous call to the API that indicates the position in the list of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * A token returned from a previous call to the API that indicates the position in the list of results.
     * 
     * @param nextToken
     *        A token returned from a previous call to the API that indicates the position in the list of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConfigurationSetsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * Used to specify the number of items that should be returned in the response.
     * 
     * @param pageSize
     *        Used to specify the number of items that should be returned in the response.
     */

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * Used to specify the number of items that should be returned in the response.
     * 
     * @return Used to specify the number of items that should be returned in the response.
     */

    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * Used to specify the number of items that should be returned in the response.
     * 
     * @param pageSize
     *        Used to specify the number of items that should be returned in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConfigurationSetsRequest withPageSize(String pageSize) {
        setPageSize(pageSize);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getPageSize() != null)
            sb.append("PageSize: ").append(getPageSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListConfigurationSetsRequest == false)
            return false;
        ListConfigurationSetsRequest other = (ListConfigurationSetsRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getPageSize() == null ^ this.getPageSize() == null)
            return false;
        if (other.getPageSize() != null && other.getPageSize().equals(this.getPageSize()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getPageSize() == null) ? 0 : getPageSize().hashCode());
        return hashCode;
    }

    @Override
    public ListConfigurationSetsRequest clone() {
        return (ListConfigurationSetsRequest) super.clone();
    }

}
