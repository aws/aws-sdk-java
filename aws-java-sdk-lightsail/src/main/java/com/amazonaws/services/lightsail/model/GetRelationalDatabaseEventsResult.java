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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabaseEvents"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRelationalDatabaseEventsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An object describing the result of your get relational database events request.
     * </p>
     */
    private java.util.List<RelationalDatabaseEvent> relationalDatabaseEvents;
    /**
     * <p>
     * A token used for advancing to the next page of results from your get relational database events request.
     * </p>
     */
    private String nextPageToken;

    /**
     * <p>
     * An object describing the result of your get relational database events request.
     * </p>
     * 
     * @return An object describing the result of your get relational database events request.
     */

    public java.util.List<RelationalDatabaseEvent> getRelationalDatabaseEvents() {
        return relationalDatabaseEvents;
    }

    /**
     * <p>
     * An object describing the result of your get relational database events request.
     * </p>
     * 
     * @param relationalDatabaseEvents
     *        An object describing the result of your get relational database events request.
     */

    public void setRelationalDatabaseEvents(java.util.Collection<RelationalDatabaseEvent> relationalDatabaseEvents) {
        if (relationalDatabaseEvents == null) {
            this.relationalDatabaseEvents = null;
            return;
        }

        this.relationalDatabaseEvents = new java.util.ArrayList<RelationalDatabaseEvent>(relationalDatabaseEvents);
    }

    /**
     * <p>
     * An object describing the result of your get relational database events request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRelationalDatabaseEvents(java.util.Collection)} or
     * {@link #withRelationalDatabaseEvents(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param relationalDatabaseEvents
     *        An object describing the result of your get relational database events request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRelationalDatabaseEventsResult withRelationalDatabaseEvents(RelationalDatabaseEvent... relationalDatabaseEvents) {
        if (this.relationalDatabaseEvents == null) {
            setRelationalDatabaseEvents(new java.util.ArrayList<RelationalDatabaseEvent>(relationalDatabaseEvents.length));
        }
        for (RelationalDatabaseEvent ele : relationalDatabaseEvents) {
            this.relationalDatabaseEvents.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An object describing the result of your get relational database events request.
     * </p>
     * 
     * @param relationalDatabaseEvents
     *        An object describing the result of your get relational database events request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRelationalDatabaseEventsResult withRelationalDatabaseEvents(java.util.Collection<RelationalDatabaseEvent> relationalDatabaseEvents) {
        setRelationalDatabaseEvents(relationalDatabaseEvents);
        return this;
    }

    /**
     * <p>
     * A token used for advancing to the next page of results from your get relational database events request.
     * </p>
     * 
     * @param nextPageToken
     *        A token used for advancing to the next page of results from your get relational database events request.
     */

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * A token used for advancing to the next page of results from your get relational database events request.
     * </p>
     * 
     * @return A token used for advancing to the next page of results from your get relational database events request.
     */

    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * <p>
     * A token used for advancing to the next page of results from your get relational database events request.
     * </p>
     * 
     * @param nextPageToken
     *        A token used for advancing to the next page of results from your get relational database events request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRelationalDatabaseEventsResult withNextPageToken(String nextPageToken) {
        setNextPageToken(nextPageToken);
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
        if (getRelationalDatabaseEvents() != null)
            sb.append("RelationalDatabaseEvents: ").append(getRelationalDatabaseEvents()).append(",");
        if (getNextPageToken() != null)
            sb.append("NextPageToken: ").append(getNextPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRelationalDatabaseEventsResult == false)
            return false;
        GetRelationalDatabaseEventsResult other = (GetRelationalDatabaseEventsResult) obj;
        if (other.getRelationalDatabaseEvents() == null ^ this.getRelationalDatabaseEvents() == null)
            return false;
        if (other.getRelationalDatabaseEvents() != null && other.getRelationalDatabaseEvents().equals(this.getRelationalDatabaseEvents()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRelationalDatabaseEvents() == null) ? 0 : getRelationalDatabaseEvents().hashCode());
        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        return hashCode;
    }

    @Override
    public GetRelationalDatabaseEventsResult clone() {
        try {
            return (GetRelationalDatabaseEventsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
