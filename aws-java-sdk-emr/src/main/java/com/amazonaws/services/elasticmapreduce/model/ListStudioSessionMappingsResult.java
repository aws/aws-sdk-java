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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/ListStudioSessionMappings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListStudioSessionMappingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of session mapping summary objects. Each object includes session mapping details such as creation time,
     * identity type (user or group), and Amazon EMR Studio ID.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<SessionMappingSummary> sessionMappings;
    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * A list of session mapping summary objects. Each object includes session mapping details such as creation time,
     * identity type (user or group), and Amazon EMR Studio ID.
     * </p>
     * 
     * @return A list of session mapping summary objects. Each object includes session mapping details such as creation
     *         time, identity type (user or group), and Amazon EMR Studio ID.
     */

    public java.util.List<SessionMappingSummary> getSessionMappings() {
        if (sessionMappings == null) {
            sessionMappings = new com.amazonaws.internal.SdkInternalList<SessionMappingSummary>();
        }
        return sessionMappings;
    }

    /**
     * <p>
     * A list of session mapping summary objects. Each object includes session mapping details such as creation time,
     * identity type (user or group), and Amazon EMR Studio ID.
     * </p>
     * 
     * @param sessionMappings
     *        A list of session mapping summary objects. Each object includes session mapping details such as creation
     *        time, identity type (user or group), and Amazon EMR Studio ID.
     */

    public void setSessionMappings(java.util.Collection<SessionMappingSummary> sessionMappings) {
        if (sessionMappings == null) {
            this.sessionMappings = null;
            return;
        }

        this.sessionMappings = new com.amazonaws.internal.SdkInternalList<SessionMappingSummary>(sessionMappings);
    }

    /**
     * <p>
     * A list of session mapping summary objects. Each object includes session mapping details such as creation time,
     * identity type (user or group), and Amazon EMR Studio ID.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSessionMappings(java.util.Collection)} or {@link #withSessionMappings(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param sessionMappings
     *        A list of session mapping summary objects. Each object includes session mapping details such as creation
     *        time, identity type (user or group), and Amazon EMR Studio ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStudioSessionMappingsResult withSessionMappings(SessionMappingSummary... sessionMappings) {
        if (this.sessionMappings == null) {
            setSessionMappings(new com.amazonaws.internal.SdkInternalList<SessionMappingSummary>(sessionMappings.length));
        }
        for (SessionMappingSummary ele : sessionMappings) {
            this.sessionMappings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of session mapping summary objects. Each object includes session mapping details such as creation time,
     * identity type (user or group), and Amazon EMR Studio ID.
     * </p>
     * 
     * @param sessionMappings
     *        A list of session mapping summary objects. Each object includes session mapping details such as creation
     *        time, identity type (user or group), and Amazon EMR Studio ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStudioSessionMappingsResult withSessionMappings(java.util.Collection<SessionMappingSummary> sessionMappings) {
        setSessionMappings(sessionMappings);
        return this;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     * 
     * @param marker
     *        The pagination token that indicates the next set of results to retrieve.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     * 
     * @return The pagination token that indicates the next set of results to retrieve.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     * 
     * @param marker
     *        The pagination token that indicates the next set of results to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStudioSessionMappingsResult withMarker(String marker) {
        setMarker(marker);
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
        if (getSessionMappings() != null)
            sb.append("SessionMappings: ").append(getSessionMappings()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListStudioSessionMappingsResult == false)
            return false;
        ListStudioSessionMappingsResult other = (ListStudioSessionMappingsResult) obj;
        if (other.getSessionMappings() == null ^ this.getSessionMappings() == null)
            return false;
        if (other.getSessionMappings() != null && other.getSessionMappings().equals(this.getSessionMappings()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSessionMappings() == null) ? 0 : getSessionMappings().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public ListStudioSessionMappingsResult clone() {
        try {
            return (ListStudioSessionMappingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
