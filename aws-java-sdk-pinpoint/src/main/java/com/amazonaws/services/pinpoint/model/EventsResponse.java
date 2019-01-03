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
 * Custom messages associated with events.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/EventsResponse" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EventsResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * A map that contains a multipart response for each endpoint. Each item in this object uses the endpoint ID as the
     * key, and the item response as the value.
     * 
     * If no item response exists, the value can also be one of the following: 202 (if the request was processed
     * successfully) or 400 (if the payload was invalid, or required fields were missing).
     */
    private java.util.Map<String, ItemResponse> results;

    /**
     * A map that contains a multipart response for each endpoint. Each item in this object uses the endpoint ID as the
     * key, and the item response as the value.
     * 
     * If no item response exists, the value can also be one of the following: 202 (if the request was processed
     * successfully) or 400 (if the payload was invalid, or required fields were missing).
     * 
     * @return A map that contains a multipart response for each endpoint. Each item in this object uses the endpoint ID
     *         as the key, and the item response as the value.
     * 
     *         If no item response exists, the value can also be one of the following: 202 (if the request was processed
     *         successfully) or 400 (if the payload was invalid, or required fields were missing).
     */

    public java.util.Map<String, ItemResponse> getResults() {
        return results;
    }

    /**
     * A map that contains a multipart response for each endpoint. Each item in this object uses the endpoint ID as the
     * key, and the item response as the value.
     * 
     * If no item response exists, the value can also be one of the following: 202 (if the request was processed
     * successfully) or 400 (if the payload was invalid, or required fields were missing).
     * 
     * @param results
     *        A map that contains a multipart response for each endpoint. Each item in this object uses the endpoint ID
     *        as the key, and the item response as the value.
     * 
     *        If no item response exists, the value can also be one of the following: 202 (if the request was processed
     *        successfully) or 400 (if the payload was invalid, or required fields were missing).
     */

    public void setResults(java.util.Map<String, ItemResponse> results) {
        this.results = results;
    }

    /**
     * A map that contains a multipart response for each endpoint. Each item in this object uses the endpoint ID as the
     * key, and the item response as the value.
     * 
     * If no item response exists, the value can also be one of the following: 202 (if the request was processed
     * successfully) or 400 (if the payload was invalid, or required fields were missing).
     * 
     * @param results
     *        A map that contains a multipart response for each endpoint. Each item in this object uses the endpoint ID
     *        as the key, and the item response as the value.
     * 
     *        If no item response exists, the value can also be one of the following: 202 (if the request was processed
     *        successfully) or 400 (if the payload was invalid, or required fields were missing).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventsResponse withResults(java.util.Map<String, ItemResponse> results) {
        setResults(results);
        return this;
    }

    public EventsResponse addResultsEntry(String key, ItemResponse value) {
        if (null == this.results) {
            this.results = new java.util.HashMap<String, ItemResponse>();
        }
        if (this.results.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.results.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Results.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventsResponse clearResultsEntries() {
        this.results = null;
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
        if (getResults() != null)
            sb.append("Results: ").append(getResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EventsResponse == false)
            return false;
        EventsResponse other = (EventsResponse) obj;
        if (other.getResults() == null ^ this.getResults() == null)
            return false;
        if (other.getResults() != null && other.getResults().equals(this.getResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResults() == null) ? 0 : getResults().hashCode());
        return hashCode;
    }

    @Override
    public EventsResponse clone() {
        try {
            return (EventsResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.EventsResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
