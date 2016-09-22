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
package com.amazonaws.services.sns.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Input for ListEndpointsByPlatformApplication action.
 * </p>
 */
public class ListEndpointsByPlatformApplicationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * PlatformApplicationArn for ListEndpointsByPlatformApplicationInput action.
     * </p>
     */
    private String platformApplicationArn;
    /**
     * <p>
     * NextToken string is used when calling ListEndpointsByPlatformApplication action to retrieve additional records
     * that are available after the first page results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * PlatformApplicationArn for ListEndpointsByPlatformApplicationInput action.
     * </p>
     * 
     * @param platformApplicationArn
     *        PlatformApplicationArn for ListEndpointsByPlatformApplicationInput action.
     */

    public void setPlatformApplicationArn(String platformApplicationArn) {
        this.platformApplicationArn = platformApplicationArn;
    }

    /**
     * <p>
     * PlatformApplicationArn for ListEndpointsByPlatformApplicationInput action.
     * </p>
     * 
     * @return PlatformApplicationArn for ListEndpointsByPlatformApplicationInput action.
     */

    public String getPlatformApplicationArn() {
        return this.platformApplicationArn;
    }

    /**
     * <p>
     * PlatformApplicationArn for ListEndpointsByPlatformApplicationInput action.
     * </p>
     * 
     * @param platformApplicationArn
     *        PlatformApplicationArn for ListEndpointsByPlatformApplicationInput action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEndpointsByPlatformApplicationRequest withPlatformApplicationArn(String platformApplicationArn) {
        setPlatformApplicationArn(platformApplicationArn);
        return this;
    }

    /**
     * <p>
     * NextToken string is used when calling ListEndpointsByPlatformApplication action to retrieve additional records
     * that are available after the first page results.
     * </p>
     * 
     * @param nextToken
     *        NextToken string is used when calling ListEndpointsByPlatformApplication action to retrieve additional
     *        records that are available after the first page results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * NextToken string is used when calling ListEndpointsByPlatformApplication action to retrieve additional records
     * that are available after the first page results.
     * </p>
     * 
     * @return NextToken string is used when calling ListEndpointsByPlatformApplication action to retrieve additional
     *         records that are available after the first page results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * NextToken string is used when calling ListEndpointsByPlatformApplication action to retrieve additional records
     * that are available after the first page results.
     * </p>
     * 
     * @param nextToken
     *        NextToken string is used when calling ListEndpointsByPlatformApplication action to retrieve additional
     *        records that are available after the first page results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEndpointsByPlatformApplicationRequest withNextToken(String nextToken) {
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
        if (getPlatformApplicationArn() != null)
            sb.append("PlatformApplicationArn: " + getPlatformApplicationArn() + ",");
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

        if (obj instanceof ListEndpointsByPlatformApplicationRequest == false)
            return false;
        ListEndpointsByPlatformApplicationRequest other = (ListEndpointsByPlatformApplicationRequest) obj;
        if (other.getPlatformApplicationArn() == null ^ this.getPlatformApplicationArn() == null)
            return false;
        if (other.getPlatformApplicationArn() != null && other.getPlatformApplicationArn().equals(this.getPlatformApplicationArn()) == false)
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

        hashCode = prime * hashCode + ((getPlatformApplicationArn() == null) ? 0 : getPlatformApplicationArn().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListEndpointsByPlatformApplicationRequest clone() {
        return (ListEndpointsByPlatformApplicationRequest) super.clone();
    }
}
