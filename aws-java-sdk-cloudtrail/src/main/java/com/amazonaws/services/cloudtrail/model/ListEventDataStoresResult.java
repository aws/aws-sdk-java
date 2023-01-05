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
package com.amazonaws.services.cloudtrail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/ListEventDataStores" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEventDataStoresResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Contains information about event data stores in the account, in the current region.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<EventDataStore> eventDataStores;
    /**
     * <p>
     * A token you can use to get the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Contains information about event data stores in the account, in the current region.
     * </p>
     * 
     * @return Contains information about event data stores in the account, in the current region.
     */

    public java.util.List<EventDataStore> getEventDataStores() {
        if (eventDataStores == null) {
            eventDataStores = new com.amazonaws.internal.SdkInternalList<EventDataStore>();
        }
        return eventDataStores;
    }

    /**
     * <p>
     * Contains information about event data stores in the account, in the current region.
     * </p>
     * 
     * @param eventDataStores
     *        Contains information about event data stores in the account, in the current region.
     */

    public void setEventDataStores(java.util.Collection<EventDataStore> eventDataStores) {
        if (eventDataStores == null) {
            this.eventDataStores = null;
            return;
        }

        this.eventDataStores = new com.amazonaws.internal.SdkInternalList<EventDataStore>(eventDataStores);
    }

    /**
     * <p>
     * Contains information about event data stores in the account, in the current region.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventDataStores(java.util.Collection)} or {@link #withEventDataStores(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param eventDataStores
     *        Contains information about event data stores in the account, in the current region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEventDataStoresResult withEventDataStores(EventDataStore... eventDataStores) {
        if (this.eventDataStores == null) {
            setEventDataStores(new com.amazonaws.internal.SdkInternalList<EventDataStore>(eventDataStores.length));
        }
        for (EventDataStore ele : eventDataStores) {
            this.eventDataStores.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains information about event data stores in the account, in the current region.
     * </p>
     * 
     * @param eventDataStores
     *        Contains information about event data stores in the account, in the current region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEventDataStoresResult withEventDataStores(java.util.Collection<EventDataStore> eventDataStores) {
        setEventDataStores(eventDataStores);
        return this;
    }

    /**
     * <p>
     * A token you can use to get the next page of results.
     * </p>
     * 
     * @param nextToken
     *        A token you can use to get the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token you can use to get the next page of results.
     * </p>
     * 
     * @return A token you can use to get the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token you can use to get the next page of results.
     * </p>
     * 
     * @param nextToken
     *        A token you can use to get the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEventDataStoresResult withNextToken(String nextToken) {
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
        if (getEventDataStores() != null)
            sb.append("EventDataStores: ").append(getEventDataStores()).append(",");
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

        if (obj instanceof ListEventDataStoresResult == false)
            return false;
        ListEventDataStoresResult other = (ListEventDataStoresResult) obj;
        if (other.getEventDataStores() == null ^ this.getEventDataStores() == null)
            return false;
        if (other.getEventDataStores() != null && other.getEventDataStores().equals(this.getEventDataStores()) == false)
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

        hashCode = prime * hashCode + ((getEventDataStores() == null) ? 0 : getEventDataStores().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListEventDataStoresResult clone() {
        try {
            return (ListEventDataStoresResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
