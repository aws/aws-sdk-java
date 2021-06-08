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
package com.amazonaws.services.iotdata.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListNamedShadowsForThingRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the thing.
     * </p>
     */
    private String thingName;
    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The result page size.
     * </p>
     */
    private Integer pageSize;

    /**
     * <p>
     * The name of the thing.
     * </p>
     * 
     * @param thingName
     *        The name of the thing.
     */

    public void setThingName(String thingName) {
        this.thingName = thingName;
    }

    /**
     * <p>
     * The name of the thing.
     * </p>
     * 
     * @return The name of the thing.
     */

    public String getThingName() {
        return this.thingName;
    }

    /**
     * <p>
     * The name of the thing.
     * </p>
     * 
     * @param thingName
     *        The name of the thing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNamedShadowsForThingRequest withThingName(String thingName) {
        setThingName(thingName);
        return this;
    }

    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     * 
     * @return The token to retrieve the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNamedShadowsForThingRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The result page size.
     * </p>
     * 
     * @param pageSize
     *        The result page size.
     */

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * <p>
     * The result page size.
     * </p>
     * 
     * @return The result page size.
     */

    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * <p>
     * The result page size.
     * </p>
     * 
     * @param pageSize
     *        The result page size.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNamedShadowsForThingRequest withPageSize(Integer pageSize) {
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
        if (getThingName() != null)
            sb.append("ThingName: ").append(getThingName()).append(",");
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

        if (obj instanceof ListNamedShadowsForThingRequest == false)
            return false;
        ListNamedShadowsForThingRequest other = (ListNamedShadowsForThingRequest) obj;
        if (other.getThingName() == null ^ this.getThingName() == null)
            return false;
        if (other.getThingName() != null && other.getThingName().equals(this.getThingName()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getThingName() == null) ? 0 : getThingName().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getPageSize() == null) ? 0 : getPageSize().hashCode());
        return hashCode;
    }

    @Override
    public ListNamedShadowsForThingRequest clone() {
        return (ListNamedShadowsForThingRequest) super.clone();
    }

}
