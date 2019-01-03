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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Activities for campaign.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/ActivitiesResponse" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActivitiesResponse implements Serializable, Cloneable, StructuredPojo {

    /** List of campaign activities */
    private java.util.List<ActivityResponse> item;
    /** The string that you use in a subsequent request to get the next page of results in a paginated response. */
    private String nextToken;

    /**
     * List of campaign activities
     * 
     * @return List of campaign activities
     */

    public java.util.List<ActivityResponse> getItem() {
        return item;
    }

    /**
     * List of campaign activities
     * 
     * @param item
     *        List of campaign activities
     */

    public void setItem(java.util.Collection<ActivityResponse> item) {
        if (item == null) {
            this.item = null;
            return;
        }

        this.item = new java.util.ArrayList<ActivityResponse>(item);
    }

    /**
     * List of campaign activities
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItem(java.util.Collection)} or {@link #withItem(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param item
     *        List of campaign activities
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivitiesResponse withItem(ActivityResponse... item) {
        if (this.item == null) {
            setItem(new java.util.ArrayList<ActivityResponse>(item.length));
        }
        for (ActivityResponse ele : item) {
            this.item.add(ele);
        }
        return this;
    }

    /**
     * List of campaign activities
     * 
     * @param item
     *        List of campaign activities
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivitiesResponse withItem(java.util.Collection<ActivityResponse> item) {
        setItem(item);
        return this;
    }

    /**
     * The string that you use in a subsequent request to get the next page of results in a paginated response.
     * 
     * @param nextToken
     *        The string that you use in a subsequent request to get the next page of results in a paginated response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * The string that you use in a subsequent request to get the next page of results in a paginated response.
     * 
     * @return The string that you use in a subsequent request to get the next page of results in a paginated response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * The string that you use in a subsequent request to get the next page of results in a paginated response.
     * 
     * @param nextToken
     *        The string that you use in a subsequent request to get the next page of results in a paginated response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivitiesResponse withNextToken(String nextToken) {
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
        if (getItem() != null)
            sb.append("Item: ").append(getItem()).append(",");
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

        if (obj instanceof ActivitiesResponse == false)
            return false;
        ActivitiesResponse other = (ActivitiesResponse) obj;
        if (other.getItem() == null ^ this.getItem() == null)
            return false;
        if (other.getItem() != null && other.getItem().equals(this.getItem()) == false)
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

        hashCode = prime * hashCode + ((getItem() == null) ? 0 : getItem().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ActivitiesResponse clone() {
        try {
            return (ActivitiesResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.ActivitiesResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
