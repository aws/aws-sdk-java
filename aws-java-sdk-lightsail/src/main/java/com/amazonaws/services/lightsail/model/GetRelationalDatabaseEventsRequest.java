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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabaseEvents"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRelationalDatabaseEventsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the database from which to get events.
     * </p>
     */
    private String relationalDatabaseName;
    /**
     * <p>
     * The number of minutes in the past from which to retrieve events. For example, to get all events from the past 2
     * hours, enter 120.
     * </p>
     * <p>
     * Default: <code>60</code>
     * </p>
     * <p>
     * The minimum is 1 and the maximum is 14 days (20160 minutes).
     * </p>
     */
    private Integer durationInMinutes;
    /**
     * <p>
     * A token used for advancing to a specific page of results from for get relational database events request.
     * </p>
     */
    private String pageToken;

    /**
     * <p>
     * The name of the database from which to get events.
     * </p>
     * 
     * @param relationalDatabaseName
     *        The name of the database from which to get events.
     */

    public void setRelationalDatabaseName(String relationalDatabaseName) {
        this.relationalDatabaseName = relationalDatabaseName;
    }

    /**
     * <p>
     * The name of the database from which to get events.
     * </p>
     * 
     * @return The name of the database from which to get events.
     */

    public String getRelationalDatabaseName() {
        return this.relationalDatabaseName;
    }

    /**
     * <p>
     * The name of the database from which to get events.
     * </p>
     * 
     * @param relationalDatabaseName
     *        The name of the database from which to get events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRelationalDatabaseEventsRequest withRelationalDatabaseName(String relationalDatabaseName) {
        setRelationalDatabaseName(relationalDatabaseName);
        return this;
    }

    /**
     * <p>
     * The number of minutes in the past from which to retrieve events. For example, to get all events from the past 2
     * hours, enter 120.
     * </p>
     * <p>
     * Default: <code>60</code>
     * </p>
     * <p>
     * The minimum is 1 and the maximum is 14 days (20160 minutes).
     * </p>
     * 
     * @param durationInMinutes
     *        The number of minutes in the past from which to retrieve events. For example, to get all events from the
     *        past 2 hours, enter 120.</p>
     *        <p>
     *        Default: <code>60</code>
     *        </p>
     *        <p>
     *        The minimum is 1 and the maximum is 14 days (20160 minutes).
     */

    public void setDurationInMinutes(Integer durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    /**
     * <p>
     * The number of minutes in the past from which to retrieve events. For example, to get all events from the past 2
     * hours, enter 120.
     * </p>
     * <p>
     * Default: <code>60</code>
     * </p>
     * <p>
     * The minimum is 1 and the maximum is 14 days (20160 minutes).
     * </p>
     * 
     * @return The number of minutes in the past from which to retrieve events. For example, to get all events from the
     *         past 2 hours, enter 120.</p>
     *         <p>
     *         Default: <code>60</code>
     *         </p>
     *         <p>
     *         The minimum is 1 and the maximum is 14 days (20160 minutes).
     */

    public Integer getDurationInMinutes() {
        return this.durationInMinutes;
    }

    /**
     * <p>
     * The number of minutes in the past from which to retrieve events. For example, to get all events from the past 2
     * hours, enter 120.
     * </p>
     * <p>
     * Default: <code>60</code>
     * </p>
     * <p>
     * The minimum is 1 and the maximum is 14 days (20160 minutes).
     * </p>
     * 
     * @param durationInMinutes
     *        The number of minutes in the past from which to retrieve events. For example, to get all events from the
     *        past 2 hours, enter 120.</p>
     *        <p>
     *        Default: <code>60</code>
     *        </p>
     *        <p>
     *        The minimum is 1 and the maximum is 14 days (20160 minutes).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRelationalDatabaseEventsRequest withDurationInMinutes(Integer durationInMinutes) {
        setDurationInMinutes(durationInMinutes);
        return this;
    }

    /**
     * <p>
     * A token used for advancing to a specific page of results from for get relational database events request.
     * </p>
     * 
     * @param pageToken
     *        A token used for advancing to a specific page of results from for get relational database events request.
     */

    public void setPageToken(String pageToken) {
        this.pageToken = pageToken;
    }

    /**
     * <p>
     * A token used for advancing to a specific page of results from for get relational database events request.
     * </p>
     * 
     * @return A token used for advancing to a specific page of results from for get relational database events request.
     */

    public String getPageToken() {
        return this.pageToken;
    }

    /**
     * <p>
     * A token used for advancing to a specific page of results from for get relational database events request.
     * </p>
     * 
     * @param pageToken
     *        A token used for advancing to a specific page of results from for get relational database events request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRelationalDatabaseEventsRequest withPageToken(String pageToken) {
        setPageToken(pageToken);
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
        if (getRelationalDatabaseName() != null)
            sb.append("RelationalDatabaseName: ").append(getRelationalDatabaseName()).append(",");
        if (getDurationInMinutes() != null)
            sb.append("DurationInMinutes: ").append(getDurationInMinutes()).append(",");
        if (getPageToken() != null)
            sb.append("PageToken: ").append(getPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRelationalDatabaseEventsRequest == false)
            return false;
        GetRelationalDatabaseEventsRequest other = (GetRelationalDatabaseEventsRequest) obj;
        if (other.getRelationalDatabaseName() == null ^ this.getRelationalDatabaseName() == null)
            return false;
        if (other.getRelationalDatabaseName() != null && other.getRelationalDatabaseName().equals(this.getRelationalDatabaseName()) == false)
            return false;
        if (other.getDurationInMinutes() == null ^ this.getDurationInMinutes() == null)
            return false;
        if (other.getDurationInMinutes() != null && other.getDurationInMinutes().equals(this.getDurationInMinutes()) == false)
            return false;
        if (other.getPageToken() == null ^ this.getPageToken() == null)
            return false;
        if (other.getPageToken() != null && other.getPageToken().equals(this.getPageToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRelationalDatabaseName() == null) ? 0 : getRelationalDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getDurationInMinutes() == null) ? 0 : getDurationInMinutes().hashCode());
        hashCode = prime * hashCode + ((getPageToken() == null) ? 0 : getPageToken().hashCode());
        return hashCode;
    }

    @Override
    public GetRelationalDatabaseEventsRequest clone() {
        return (GetRelationalDatabaseEventsRequest) super.clone();
    }

}
