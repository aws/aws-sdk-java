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
package com.amazonaws.services.alexaforbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ListSmartHomeAppliances"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSmartHomeAppliancesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The room that the appliances are associated with.
     * </p>
     */
    private String roomArn;
    /**
     * <p>
     * The maximum number of appliances to be returned, per paginated calls.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The tokens used for pagination.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The room that the appliances are associated with.
     * </p>
     * 
     * @param roomArn
     *        The room that the appliances are associated with.
     */

    public void setRoomArn(String roomArn) {
        this.roomArn = roomArn;
    }

    /**
     * <p>
     * The room that the appliances are associated with.
     * </p>
     * 
     * @return The room that the appliances are associated with.
     */

    public String getRoomArn() {
        return this.roomArn;
    }

    /**
     * <p>
     * The room that the appliances are associated with.
     * </p>
     * 
     * @param roomArn
     *        The room that the appliances are associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSmartHomeAppliancesRequest withRoomArn(String roomArn) {
        setRoomArn(roomArn);
        return this;
    }

    /**
     * <p>
     * The maximum number of appliances to be returned, per paginated calls.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of appliances to be returned, per paginated calls.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of appliances to be returned, per paginated calls.
     * </p>
     * 
     * @return The maximum number of appliances to be returned, per paginated calls.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of appliances to be returned, per paginated calls.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of appliances to be returned, per paginated calls.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSmartHomeAppliancesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The tokens used for pagination.
     * </p>
     * 
     * @param nextToken
     *        The tokens used for pagination.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The tokens used for pagination.
     * </p>
     * 
     * @return The tokens used for pagination.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The tokens used for pagination.
     * </p>
     * 
     * @param nextToken
     *        The tokens used for pagination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSmartHomeAppliancesRequest withNextToken(String nextToken) {
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
        if (getRoomArn() != null)
            sb.append("RoomArn: ").append(getRoomArn()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof ListSmartHomeAppliancesRequest == false)
            return false;
        ListSmartHomeAppliancesRequest other = (ListSmartHomeAppliancesRequest) obj;
        if (other.getRoomArn() == null ^ this.getRoomArn() == null)
            return false;
        if (other.getRoomArn() != null && other.getRoomArn().equals(this.getRoomArn()) == false)
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

        hashCode = prime * hashCode + ((getRoomArn() == null) ? 0 : getRoomArn().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListSmartHomeAppliancesRequest clone() {
        return (ListSmartHomeAppliancesRequest) super.clone();
    }

}
