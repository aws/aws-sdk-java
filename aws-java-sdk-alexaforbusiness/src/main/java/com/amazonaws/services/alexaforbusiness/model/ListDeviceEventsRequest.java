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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ListDeviceEvents" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDeviceEventsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of a device.
     * </p>
     */
    private String deviceArn;
    /**
     * <p>
     * The event type to filter device events. If EventType isn't specified, this returns a list of all device events in
     * reverse chronological order. If EventType is specified, this returns a list of device events for that EventType
     * in reverse chronological order.
     * </p>
     */
    private String eventType;
    /**
     * <p>
     * An optional token returned from a prior request. Use this token for pagination of results from this action. If
     * this parameter is specified, the response only includes results beyond the token, up to the value specified by
     * MaxResults. When the end of results is reached, the response has a value of null.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to include in the response. The default value is 50. If more results exist than the
     * specified MaxResults value, a token is included in the response so that the remaining results can be retrieved.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The ARN of a device.
     * </p>
     * 
     * @param deviceArn
     *        The ARN of a device.
     */

    public void setDeviceArn(String deviceArn) {
        this.deviceArn = deviceArn;
    }

    /**
     * <p>
     * The ARN of a device.
     * </p>
     * 
     * @return The ARN of a device.
     */

    public String getDeviceArn() {
        return this.deviceArn;
    }

    /**
     * <p>
     * The ARN of a device.
     * </p>
     * 
     * @param deviceArn
     *        The ARN of a device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeviceEventsRequest withDeviceArn(String deviceArn) {
        setDeviceArn(deviceArn);
        return this;
    }

    /**
     * <p>
     * The event type to filter device events. If EventType isn't specified, this returns a list of all device events in
     * reverse chronological order. If EventType is specified, this returns a list of device events for that EventType
     * in reverse chronological order.
     * </p>
     * 
     * @param eventType
     *        The event type to filter device events. If EventType isn't specified, this returns a list of all device
     *        events in reverse chronological order. If EventType is specified, this returns a list of device events for
     *        that EventType in reverse chronological order.
     * @see DeviceEventType
     */

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * <p>
     * The event type to filter device events. If EventType isn't specified, this returns a list of all device events in
     * reverse chronological order. If EventType is specified, this returns a list of device events for that EventType
     * in reverse chronological order.
     * </p>
     * 
     * @return The event type to filter device events. If EventType isn't specified, this returns a list of all device
     *         events in reverse chronological order. If EventType is specified, this returns a list of device events
     *         for that EventType in reverse chronological order.
     * @see DeviceEventType
     */

    public String getEventType() {
        return this.eventType;
    }

    /**
     * <p>
     * The event type to filter device events. If EventType isn't specified, this returns a list of all device events in
     * reverse chronological order. If EventType is specified, this returns a list of device events for that EventType
     * in reverse chronological order.
     * </p>
     * 
     * @param eventType
     *        The event type to filter device events. If EventType isn't specified, this returns a list of all device
     *        events in reverse chronological order. If EventType is specified, this returns a list of device events for
     *        that EventType in reverse chronological order.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceEventType
     */

    public ListDeviceEventsRequest withEventType(String eventType) {
        setEventType(eventType);
        return this;
    }

    /**
     * <p>
     * The event type to filter device events. If EventType isn't specified, this returns a list of all device events in
     * reverse chronological order. If EventType is specified, this returns a list of device events for that EventType
     * in reverse chronological order.
     * </p>
     * 
     * @param eventType
     *        The event type to filter device events. If EventType isn't specified, this returns a list of all device
     *        events in reverse chronological order. If EventType is specified, this returns a list of device events for
     *        that EventType in reverse chronological order.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceEventType
     */

    public ListDeviceEventsRequest withEventType(DeviceEventType eventType) {
        this.eventType = eventType.toString();
        return this;
    }

    /**
     * <p>
     * An optional token returned from a prior request. Use this token for pagination of results from this action. If
     * this parameter is specified, the response only includes results beyond the token, up to the value specified by
     * MaxResults. When the end of results is reached, the response has a value of null.
     * </p>
     * 
     * @param nextToken
     *        An optional token returned from a prior request. Use this token for pagination of results from this
     *        action. If this parameter is specified, the response only includes results beyond the token, up to the
     *        value specified by MaxResults. When the end of results is reached, the response has a value of null.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An optional token returned from a prior request. Use this token for pagination of results from this action. If
     * this parameter is specified, the response only includes results beyond the token, up to the value specified by
     * MaxResults. When the end of results is reached, the response has a value of null.
     * </p>
     * 
     * @return An optional token returned from a prior request. Use this token for pagination of results from this
     *         action. If this parameter is specified, the response only includes results beyond the token, up to the
     *         value specified by MaxResults. When the end of results is reached, the response has a value of null.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An optional token returned from a prior request. Use this token for pagination of results from this action. If
     * this parameter is specified, the response only includes results beyond the token, up to the value specified by
     * MaxResults. When the end of results is reached, the response has a value of null.
     * </p>
     * 
     * @param nextToken
     *        An optional token returned from a prior request. Use this token for pagination of results from this
     *        action. If this parameter is specified, the response only includes results beyond the token, up to the
     *        value specified by MaxResults. When the end of results is reached, the response has a value of null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeviceEventsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to include in the response. The default value is 50. If more results exist than the
     * specified MaxResults value, a token is included in the response so that the remaining results can be retrieved.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to include in the response. The default value is 50. If more results exist
     *        than the specified MaxResults value, a token is included in the response so that the remaining results can
     *        be retrieved.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to include in the response. The default value is 50. If more results exist than the
     * specified MaxResults value, a token is included in the response so that the remaining results can be retrieved.
     * </p>
     * 
     * @return The maximum number of results to include in the response. The default value is 50. If more results exist
     *         than the specified MaxResults value, a token is included in the response so that the remaining results
     *         can be retrieved.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to include in the response. The default value is 50. If more results exist than the
     * specified MaxResults value, a token is included in the response so that the remaining results can be retrieved.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to include in the response. The default value is 50. If more results exist
     *        than the specified MaxResults value, a token is included in the response so that the remaining results can
     *        be retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeviceEventsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getDeviceArn() != null)
            sb.append("DeviceArn: ").append(getDeviceArn()).append(",");
        if (getEventType() != null)
            sb.append("EventType: ").append(getEventType()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDeviceEventsRequest == false)
            return false;
        ListDeviceEventsRequest other = (ListDeviceEventsRequest) obj;
        if (other.getDeviceArn() == null ^ this.getDeviceArn() == null)
            return false;
        if (other.getDeviceArn() != null && other.getDeviceArn().equals(this.getDeviceArn()) == false)
            return false;
        if (other.getEventType() == null ^ this.getEventType() == null)
            return false;
        if (other.getEventType() != null && other.getEventType().equals(this.getEventType()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceArn() == null) ? 0 : getDeviceArn().hashCode());
        hashCode = prime * hashCode + ((getEventType() == null) ? 0 : getEventType().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListDeviceEventsRequest clone() {
        return (ListDeviceEventsRequest) super.clone();
    }

}
