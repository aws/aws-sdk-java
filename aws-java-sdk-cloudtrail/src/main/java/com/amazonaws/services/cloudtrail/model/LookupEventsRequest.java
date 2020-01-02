/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Contains a request for LookupEvents.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/LookupEvents" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LookupEventsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Contains a list of lookup attributes. Currently the list can contain only one item.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<LookupAttribute> lookupAttributes;
    /**
     * <p>
     * Specifies that only events that occur after or at the specified time are returned. If the specified start time is
     * after the specified end time, an error is returned.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * Specifies that only events that occur before or at the specified time are returned. If the specified end time is
     * before the specified start time, an error is returned.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * Specifies the event category. If you do not specify an event category, events of the category are not returned in
     * the response. For example, if you do not specify <code>insight</code> as the value of <code>EventCategory</code>,
     * no Insights events are returned.
     * </p>
     */
    private String eventCategory;
    /**
     * <p>
     * The number of events to return. Possible values are 1 through 50. The default is 50.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token to use to get the next page of results after a previous API call. This token must be passed in with the
     * same parameters that were specified in the the original call. For example, if the original call specified an
     * AttributeKey of 'Username' with a value of 'root', the call with NextToken should include those same parameters.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Contains a list of lookup attributes. Currently the list can contain only one item.
     * </p>
     * 
     * @return Contains a list of lookup attributes. Currently the list can contain only one item.
     */

    public java.util.List<LookupAttribute> getLookupAttributes() {
        if (lookupAttributes == null) {
            lookupAttributes = new com.amazonaws.internal.SdkInternalList<LookupAttribute>();
        }
        return lookupAttributes;
    }

    /**
     * <p>
     * Contains a list of lookup attributes. Currently the list can contain only one item.
     * </p>
     * 
     * @param lookupAttributes
     *        Contains a list of lookup attributes. Currently the list can contain only one item.
     */

    public void setLookupAttributes(java.util.Collection<LookupAttribute> lookupAttributes) {
        if (lookupAttributes == null) {
            this.lookupAttributes = null;
            return;
        }

        this.lookupAttributes = new com.amazonaws.internal.SdkInternalList<LookupAttribute>(lookupAttributes);
    }

    /**
     * <p>
     * Contains a list of lookup attributes. Currently the list can contain only one item.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLookupAttributes(java.util.Collection)} or {@link #withLookupAttributes(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param lookupAttributes
     *        Contains a list of lookup attributes. Currently the list can contain only one item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LookupEventsRequest withLookupAttributes(LookupAttribute... lookupAttributes) {
        if (this.lookupAttributes == null) {
            setLookupAttributes(new com.amazonaws.internal.SdkInternalList<LookupAttribute>(lookupAttributes.length));
        }
        for (LookupAttribute ele : lookupAttributes) {
            this.lookupAttributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains a list of lookup attributes. Currently the list can contain only one item.
     * </p>
     * 
     * @param lookupAttributes
     *        Contains a list of lookup attributes. Currently the list can contain only one item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LookupEventsRequest withLookupAttributes(java.util.Collection<LookupAttribute> lookupAttributes) {
        setLookupAttributes(lookupAttributes);
        return this;
    }

    /**
     * <p>
     * Specifies that only events that occur after or at the specified time are returned. If the specified start time is
     * after the specified end time, an error is returned.
     * </p>
     * 
     * @param startTime
     *        Specifies that only events that occur after or at the specified time are returned. If the specified start
     *        time is after the specified end time, an error is returned.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * Specifies that only events that occur after or at the specified time are returned. If the specified start time is
     * after the specified end time, an error is returned.
     * </p>
     * 
     * @return Specifies that only events that occur after or at the specified time are returned. If the specified start
     *         time is after the specified end time, an error is returned.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * Specifies that only events that occur after or at the specified time are returned. If the specified start time is
     * after the specified end time, an error is returned.
     * </p>
     * 
     * @param startTime
     *        Specifies that only events that occur after or at the specified time are returned. If the specified start
     *        time is after the specified end time, an error is returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LookupEventsRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * Specifies that only events that occur before or at the specified time are returned. If the specified end time is
     * before the specified start time, an error is returned.
     * </p>
     * 
     * @param endTime
     *        Specifies that only events that occur before or at the specified time are returned. If the specified end
     *        time is before the specified start time, an error is returned.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * Specifies that only events that occur before or at the specified time are returned. If the specified end time is
     * before the specified start time, an error is returned.
     * </p>
     * 
     * @return Specifies that only events that occur before or at the specified time are returned. If the specified end
     *         time is before the specified start time, an error is returned.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * Specifies that only events that occur before or at the specified time are returned. If the specified end time is
     * before the specified start time, an error is returned.
     * </p>
     * 
     * @param endTime
     *        Specifies that only events that occur before or at the specified time are returned. If the specified end
     *        time is before the specified start time, an error is returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LookupEventsRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * Specifies the event category. If you do not specify an event category, events of the category are not returned in
     * the response. For example, if you do not specify <code>insight</code> as the value of <code>EventCategory</code>,
     * no Insights events are returned.
     * </p>
     * 
     * @param eventCategory
     *        Specifies the event category. If you do not specify an event category, events of the category are not
     *        returned in the response. For example, if you do not specify <code>insight</code> as the value of
     *        <code>EventCategory</code>, no Insights events are returned.
     * @see EventCategory
     */

    public void setEventCategory(String eventCategory) {
        this.eventCategory = eventCategory;
    }

    /**
     * <p>
     * Specifies the event category. If you do not specify an event category, events of the category are not returned in
     * the response. For example, if you do not specify <code>insight</code> as the value of <code>EventCategory</code>,
     * no Insights events are returned.
     * </p>
     * 
     * @return Specifies the event category. If you do not specify an event category, events of the category are not
     *         returned in the response. For example, if you do not specify <code>insight</code> as the value of
     *         <code>EventCategory</code>, no Insights events are returned.
     * @see EventCategory
     */

    public String getEventCategory() {
        return this.eventCategory;
    }

    /**
     * <p>
     * Specifies the event category. If you do not specify an event category, events of the category are not returned in
     * the response. For example, if you do not specify <code>insight</code> as the value of <code>EventCategory</code>,
     * no Insights events are returned.
     * </p>
     * 
     * @param eventCategory
     *        Specifies the event category. If you do not specify an event category, events of the category are not
     *        returned in the response. For example, if you do not specify <code>insight</code> as the value of
     *        <code>EventCategory</code>, no Insights events are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventCategory
     */

    public LookupEventsRequest withEventCategory(String eventCategory) {
        setEventCategory(eventCategory);
        return this;
    }

    /**
     * <p>
     * Specifies the event category. If you do not specify an event category, events of the category are not returned in
     * the response. For example, if you do not specify <code>insight</code> as the value of <code>EventCategory</code>,
     * no Insights events are returned.
     * </p>
     * 
     * @param eventCategory
     *        Specifies the event category. If you do not specify an event category, events of the category are not
     *        returned in the response. For example, if you do not specify <code>insight</code> as the value of
     *        <code>EventCategory</code>, no Insights events are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventCategory
     */

    public LookupEventsRequest withEventCategory(EventCategory eventCategory) {
        this.eventCategory = eventCategory.toString();
        return this;
    }

    /**
     * <p>
     * The number of events to return. Possible values are 1 through 50. The default is 50.
     * </p>
     * 
     * @param maxResults
     *        The number of events to return. Possible values are 1 through 50. The default is 50.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The number of events to return. Possible values are 1 through 50. The default is 50.
     * </p>
     * 
     * @return The number of events to return. Possible values are 1 through 50. The default is 50.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The number of events to return. Possible values are 1 through 50. The default is 50.
     * </p>
     * 
     * @param maxResults
     *        The number of events to return. Possible values are 1 through 50. The default is 50.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LookupEventsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token to use to get the next page of results after a previous API call. This token must be passed in with the
     * same parameters that were specified in the the original call. For example, if the original call specified an
     * AttributeKey of 'Username' with a value of 'root', the call with NextToken should include those same parameters.
     * </p>
     * 
     * @param nextToken
     *        The token to use to get the next page of results after a previous API call. This token must be passed in
     *        with the same parameters that were specified in the the original call. For example, if the original call
     *        specified an AttributeKey of 'Username' with a value of 'root', the call with NextToken should include
     *        those same parameters.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to get the next page of results after a previous API call. This token must be passed in with the
     * same parameters that were specified in the the original call. For example, if the original call specified an
     * AttributeKey of 'Username' with a value of 'root', the call with NextToken should include those same parameters.
     * </p>
     * 
     * @return The token to use to get the next page of results after a previous API call. This token must be passed in
     *         with the same parameters that were specified in the the original call. For example, if the original call
     *         specified an AttributeKey of 'Username' with a value of 'root', the call with NextToken should include
     *         those same parameters.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to get the next page of results after a previous API call. This token must be passed in with the
     * same parameters that were specified in the the original call. For example, if the original call specified an
     * AttributeKey of 'Username' with a value of 'root', the call with NextToken should include those same parameters.
     * </p>
     * 
     * @param nextToken
     *        The token to use to get the next page of results after a previous API call. This token must be passed in
     *        with the same parameters that were specified in the the original call. For example, if the original call
     *        specified an AttributeKey of 'Username' with a value of 'root', the call with NextToken should include
     *        those same parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LookupEventsRequest withNextToken(String nextToken) {
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
        if (getLookupAttributes() != null)
            sb.append("LookupAttributes: ").append(getLookupAttributes()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getEventCategory() != null)
            sb.append("EventCategory: ").append(getEventCategory()).append(",");
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

        if (obj instanceof LookupEventsRequest == false)
            return false;
        LookupEventsRequest other = (LookupEventsRequest) obj;
        if (other.getLookupAttributes() == null ^ this.getLookupAttributes() == null)
            return false;
        if (other.getLookupAttributes() != null && other.getLookupAttributes().equals(this.getLookupAttributes()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getEventCategory() == null ^ this.getEventCategory() == null)
            return false;
        if (other.getEventCategory() != null && other.getEventCategory().equals(this.getEventCategory()) == false)
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

        hashCode = prime * hashCode + ((getLookupAttributes() == null) ? 0 : getLookupAttributes().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getEventCategory() == null) ? 0 : getEventCategory().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public LookupEventsRequest clone() {
        return (LookupEventsRequest) super.clone();
    }

}
