/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListIntentPaths" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListIntentPathsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the bot for which you want to retrieve intent path metrics.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The date and time that marks the beginning of the range of time for which you want to see intent path metrics.
     * </p>
     */
    private java.util.Date startDateTime;
    /**
     * <p>
     * The date and time that marks the end of the range of time for which you want to see intent path metrics.
     * </p>
     */
    private java.util.Date endDateTime;
    /**
     * <p>
     * The intent path for which you want to retrieve metrics. Use a forward slash to separate intents in the path. For
     * example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * /BookCar
     * </p>
     * </li>
     * <li>
     * <p>
     * /BookCar/BookHotel
     * </p>
     * </li>
     * <li>
     * <p>
     * /BookHotel/BookCar
     * </p>
     * </li>
     * </ul>
     */
    private String intentPath;
    /**
     * <p>
     * A list of objects, each describes a condition by which you want to filter the results.
     * </p>
     */
    private java.util.List<AnalyticsPathFilter> filters;

    /**
     * <p>
     * The identifier for the bot for which you want to retrieve intent path metrics.
     * </p>
     * 
     * @param botId
     *        The identifier for the bot for which you want to retrieve intent path metrics.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The identifier for the bot for which you want to retrieve intent path metrics.
     * </p>
     * 
     * @return The identifier for the bot for which you want to retrieve intent path metrics.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The identifier for the bot for which you want to retrieve intent path metrics.
     * </p>
     * 
     * @param botId
     *        The identifier for the bot for which you want to retrieve intent path metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIntentPathsRequest withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The date and time that marks the beginning of the range of time for which you want to see intent path metrics.
     * </p>
     * 
     * @param startDateTime
     *        The date and time that marks the beginning of the range of time for which you want to see intent path
     *        metrics.
     */

    public void setStartDateTime(java.util.Date startDateTime) {
        this.startDateTime = startDateTime;
    }

    /**
     * <p>
     * The date and time that marks the beginning of the range of time for which you want to see intent path metrics.
     * </p>
     * 
     * @return The date and time that marks the beginning of the range of time for which you want to see intent path
     *         metrics.
     */

    public java.util.Date getStartDateTime() {
        return this.startDateTime;
    }

    /**
     * <p>
     * The date and time that marks the beginning of the range of time for which you want to see intent path metrics.
     * </p>
     * 
     * @param startDateTime
     *        The date and time that marks the beginning of the range of time for which you want to see intent path
     *        metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIntentPathsRequest withStartDateTime(java.util.Date startDateTime) {
        setStartDateTime(startDateTime);
        return this;
    }

    /**
     * <p>
     * The date and time that marks the end of the range of time for which you want to see intent path metrics.
     * </p>
     * 
     * @param endDateTime
     *        The date and time that marks the end of the range of time for which you want to see intent path metrics.
     */

    public void setEndDateTime(java.util.Date endDateTime) {
        this.endDateTime = endDateTime;
    }

    /**
     * <p>
     * The date and time that marks the end of the range of time for which you want to see intent path metrics.
     * </p>
     * 
     * @return The date and time that marks the end of the range of time for which you want to see intent path metrics.
     */

    public java.util.Date getEndDateTime() {
        return this.endDateTime;
    }

    /**
     * <p>
     * The date and time that marks the end of the range of time for which you want to see intent path metrics.
     * </p>
     * 
     * @param endDateTime
     *        The date and time that marks the end of the range of time for which you want to see intent path metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIntentPathsRequest withEndDateTime(java.util.Date endDateTime) {
        setEndDateTime(endDateTime);
        return this;
    }

    /**
     * <p>
     * The intent path for which you want to retrieve metrics. Use a forward slash to separate intents in the path. For
     * example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * /BookCar
     * </p>
     * </li>
     * <li>
     * <p>
     * /BookCar/BookHotel
     * </p>
     * </li>
     * <li>
     * <p>
     * /BookHotel/BookCar
     * </p>
     * </li>
     * </ul>
     * 
     * @param intentPath
     *        The intent path for which you want to retrieve metrics. Use a forward slash to separate intents in the
     *        path. For example:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        /BookCar
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        /BookCar/BookHotel
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        /BookHotel/BookCar
     *        </p>
     *        </li>
     */

    public void setIntentPath(String intentPath) {
        this.intentPath = intentPath;
    }

    /**
     * <p>
     * The intent path for which you want to retrieve metrics. Use a forward slash to separate intents in the path. For
     * example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * /BookCar
     * </p>
     * </li>
     * <li>
     * <p>
     * /BookCar/BookHotel
     * </p>
     * </li>
     * <li>
     * <p>
     * /BookHotel/BookCar
     * </p>
     * </li>
     * </ul>
     * 
     * @return The intent path for which you want to retrieve metrics. Use a forward slash to separate intents in the
     *         path. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         /BookCar
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         /BookCar/BookHotel
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         /BookHotel/BookCar
     *         </p>
     *         </li>
     */

    public String getIntentPath() {
        return this.intentPath;
    }

    /**
     * <p>
     * The intent path for which you want to retrieve metrics. Use a forward slash to separate intents in the path. For
     * example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * /BookCar
     * </p>
     * </li>
     * <li>
     * <p>
     * /BookCar/BookHotel
     * </p>
     * </li>
     * <li>
     * <p>
     * /BookHotel/BookCar
     * </p>
     * </li>
     * </ul>
     * 
     * @param intentPath
     *        The intent path for which you want to retrieve metrics. Use a forward slash to separate intents in the
     *        path. For example:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        /BookCar
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        /BookCar/BookHotel
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        /BookHotel/BookCar
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIntentPathsRequest withIntentPath(String intentPath) {
        setIntentPath(intentPath);
        return this;
    }

    /**
     * <p>
     * A list of objects, each describes a condition by which you want to filter the results.
     * </p>
     * 
     * @return A list of objects, each describes a condition by which you want to filter the results.
     */

    public java.util.List<AnalyticsPathFilter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * A list of objects, each describes a condition by which you want to filter the results.
     * </p>
     * 
     * @param filters
     *        A list of objects, each describes a condition by which you want to filter the results.
     */

    public void setFilters(java.util.Collection<AnalyticsPathFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<AnalyticsPathFilter>(filters);
    }

    /**
     * <p>
     * A list of objects, each describes a condition by which you want to filter the results.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        A list of objects, each describes a condition by which you want to filter the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIntentPathsRequest withFilters(AnalyticsPathFilter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<AnalyticsPathFilter>(filters.length));
        }
        for (AnalyticsPathFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of objects, each describes a condition by which you want to filter the results.
     * </p>
     * 
     * @param filters
     *        A list of objects, each describes a condition by which you want to filter the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIntentPathsRequest withFilters(java.util.Collection<AnalyticsPathFilter> filters) {
        setFilters(filters);
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
        if (getBotId() != null)
            sb.append("BotId: ").append(getBotId()).append(",");
        if (getStartDateTime() != null)
            sb.append("StartDateTime: ").append(getStartDateTime()).append(",");
        if (getEndDateTime() != null)
            sb.append("EndDateTime: ").append(getEndDateTime()).append(",");
        if (getIntentPath() != null)
            sb.append("IntentPath: ").append(getIntentPath()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListIntentPathsRequest == false)
            return false;
        ListIntentPathsRequest other = (ListIntentPathsRequest) obj;
        if (other.getBotId() == null ^ this.getBotId() == null)
            return false;
        if (other.getBotId() != null && other.getBotId().equals(this.getBotId()) == false)
            return false;
        if (other.getStartDateTime() == null ^ this.getStartDateTime() == null)
            return false;
        if (other.getStartDateTime() != null && other.getStartDateTime().equals(this.getStartDateTime()) == false)
            return false;
        if (other.getEndDateTime() == null ^ this.getEndDateTime() == null)
            return false;
        if (other.getEndDateTime() != null && other.getEndDateTime().equals(this.getEndDateTime()) == false)
            return false;
        if (other.getIntentPath() == null ^ this.getIntentPath() == null)
            return false;
        if (other.getIntentPath() != null && other.getIntentPath().equals(this.getIntentPath()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBotId() == null) ? 0 : getBotId().hashCode());
        hashCode = prime * hashCode + ((getStartDateTime() == null) ? 0 : getStartDateTime().hashCode());
        hashCode = prime * hashCode + ((getEndDateTime() == null) ? 0 : getEndDateTime().hashCode());
        hashCode = prime * hashCode + ((getIntentPath() == null) ? 0 : getIntentPath().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        return hashCode;
    }

    @Override
    public ListIntentPathsRequest clone() {
        return (ListIntentPathsRequest) super.clone();
    }

}
