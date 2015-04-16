/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cloudtrail.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.cloudtrail.AWSCloudTrail#lookupEvents(LookupEventsRequest) LookupEvents operation}.
 * <p>
 * Looks up API activity events captured by CloudTrail that create,
 * update, or delete resources in your account. Events for a region can
 * be looked up for the times in which you had CloudTrail turned on in
 * that region during the last seven days. Lookup supports five different
 * attributes: time range (defined by a start time and end time), user
 * name, event name, resource type, and resource name. All attributes are
 * optional. The maximum number of attributes that can be specified in
 * any one lookup request are time range and one other attribute. The
 * default number of results returned is 10, with a maximum of 50
 * possible. The response includes a token that you can use to get the
 * next page of results.
 * </p>
 * <p>
 * <b>IMPORTANT:</b>The rate of lookup requests is limited to one per
 * second per account. If this limit is exceeded, a throttling error
 * occurs.
 * </p>
 * <p>
 * <b>IMPORTANT:</b>Events that occurred during the selected time range
 * will not be available for lookup if CloudTrail logging was not enabled
 * when the events occurred.
 * </p>
 *
 * @see com.amazonaws.services.cloudtrail.AWSCloudTrail#lookupEvents(LookupEventsRequest)
 */
public class LookupEventsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * Contains a list of lookup attributes. Currently the list can contain
     * only one item.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<LookupAttribute> lookupAttributes;

    /**
     * Specifies that only events that occur after or at the specified time
     * are returned. If the specified start time is after the specified end
     * time, an error is returned.
     */
    private java.util.Date startTime;

    /**
     * Specifies that only events that occur before or at the specified time
     * are returned. If the specified end time is before the specified start
     * time, an error is returned.
     */
    private java.util.Date endTime;

    /**
     * The number of events to return. Possible values are 1 through 50. The
     * default is 10.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     */
    private Integer maxResults;

    /**
     * The token to use to get the next page of results after a previous API
     * call. This token must be passed in with the same parameters that were
     * specified in the the original call. For example, if the original call
     * specified an AttributeKey of 'Username' with a value of 'root', the
     * call with NextToken should include those same parameters.
     */
    private String nextToken;

    /**
     * Contains a list of lookup attributes. Currently the list can contain
     * only one item.
     *
     * @return Contains a list of lookup attributes. Currently the list can contain
     *         only one item.
     */
    public java.util.List<LookupAttribute> getLookupAttributes() {
        if (lookupAttributes == null) {
              lookupAttributes = new com.amazonaws.internal.ListWithAutoConstructFlag<LookupAttribute>();
              lookupAttributes.setAutoConstruct(true);
        }
        return lookupAttributes;
    }
    
    /**
     * Contains a list of lookup attributes. Currently the list can contain
     * only one item.
     *
     * @param lookupAttributes Contains a list of lookup attributes. Currently the list can contain
     *         only one item.
     */
    public void setLookupAttributes(java.util.Collection<LookupAttribute> lookupAttributes) {
        if (lookupAttributes == null) {
            this.lookupAttributes = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<LookupAttribute> lookupAttributesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<LookupAttribute>(lookupAttributes.size());
        lookupAttributesCopy.addAll(lookupAttributes);
        this.lookupAttributes = lookupAttributesCopy;
    }
    
    /**
     * Contains a list of lookup attributes. Currently the list can contain
     * only one item.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setLookupAttributes(java.util.Collection)} or {@link
     * #withLookupAttributes(java.util.Collection)} if you want to override
     * the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lookupAttributes Contains a list of lookup attributes. Currently the list can contain
     *         only one item.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LookupEventsRequest withLookupAttributes(LookupAttribute... lookupAttributes) {
        if (getLookupAttributes() == null) setLookupAttributes(new java.util.ArrayList<LookupAttribute>(lookupAttributes.length));
        for (LookupAttribute value : lookupAttributes) {
            getLookupAttributes().add(value);
        }
        return this;
    }
    
    /**
     * Contains a list of lookup attributes. Currently the list can contain
     * only one item.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lookupAttributes Contains a list of lookup attributes. Currently the list can contain
     *         only one item.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LookupEventsRequest withLookupAttributes(java.util.Collection<LookupAttribute> lookupAttributes) {
        if (lookupAttributes == null) {
            this.lookupAttributes = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<LookupAttribute> lookupAttributesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<LookupAttribute>(lookupAttributes.size());
            lookupAttributesCopy.addAll(lookupAttributes);
            this.lookupAttributes = lookupAttributesCopy;
        }

        return this;
    }

    /**
     * Specifies that only events that occur after or at the specified time
     * are returned. If the specified start time is after the specified end
     * time, an error is returned.
     *
     * @return Specifies that only events that occur after or at the specified time
     *         are returned. If the specified start time is after the specified end
     *         time, an error is returned.
     */
    public java.util.Date getStartTime() {
        return startTime;
    }
    
    /**
     * Specifies that only events that occur after or at the specified time
     * are returned. If the specified start time is after the specified end
     * time, an error is returned.
     *
     * @param startTime Specifies that only events that occur after or at the specified time
     *         are returned. If the specified start time is after the specified end
     *         time, an error is returned.
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }
    
    /**
     * Specifies that only events that occur after or at the specified time
     * are returned. If the specified start time is after the specified end
     * time, an error is returned.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startTime Specifies that only events that occur after or at the specified time
     *         are returned. If the specified start time is after the specified end
     *         time, an error is returned.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LookupEventsRequest withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Specifies that only events that occur before or at the specified time
     * are returned. If the specified end time is before the specified start
     * time, an error is returned.
     *
     * @return Specifies that only events that occur before or at the specified time
     *         are returned. If the specified end time is before the specified start
     *         time, an error is returned.
     */
    public java.util.Date getEndTime() {
        return endTime;
    }
    
    /**
     * Specifies that only events that occur before or at the specified time
     * are returned. If the specified end time is before the specified start
     * time, an error is returned.
     *
     * @param endTime Specifies that only events that occur before or at the specified time
     *         are returned. If the specified end time is before the specified start
     *         time, an error is returned.
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }
    
    /**
     * Specifies that only events that occur before or at the specified time
     * are returned. If the specified end time is before the specified start
     * time, an error is returned.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param endTime Specifies that only events that occur before or at the specified time
     *         are returned. If the specified end time is before the specified start
     *         time, an error is returned.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LookupEventsRequest withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * The number of events to return. Possible values are 1 through 50. The
     * default is 10.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @return The number of events to return. Possible values are 1 through 50. The
     *         default is 10.
     */
    public Integer getMaxResults() {
        return maxResults;
    }
    
    /**
     * The number of events to return. Possible values are 1 through 50. The
     * default is 10.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param maxResults The number of events to return. Possible values are 1 through 50. The
     *         default is 10.
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }
    
    /**
     * The number of events to return. Possible values are 1 through 50. The
     * default is 10.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param maxResults The number of events to return. Possible values are 1 through 50. The
     *         default is 10.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LookupEventsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * The token to use to get the next page of results after a previous API
     * call. This token must be passed in with the same parameters that were
     * specified in the the original call. For example, if the original call
     * specified an AttributeKey of 'Username' with a value of 'root', the
     * call with NextToken should include those same parameters.
     *
     * @return The token to use to get the next page of results after a previous API
     *         call. This token must be passed in with the same parameters that were
     *         specified in the the original call. For example, if the original call
     *         specified an AttributeKey of 'Username' with a value of 'root', the
     *         call with NextToken should include those same parameters.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * The token to use to get the next page of results after a previous API
     * call. This token must be passed in with the same parameters that were
     * specified in the the original call. For example, if the original call
     * specified an AttributeKey of 'Username' with a value of 'root', the
     * call with NextToken should include those same parameters.
     *
     * @param nextToken The token to use to get the next page of results after a previous API
     *         call. This token must be passed in with the same parameters that were
     *         specified in the the original call. For example, if the original call
     *         specified an AttributeKey of 'Username' with a value of 'root', the
     *         call with NextToken should include those same parameters.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * The token to use to get the next page of results after a previous API
     * call. This token must be passed in with the same parameters that were
     * specified in the the original call. For example, if the original call
     * specified an AttributeKey of 'Username' with a value of 'root', the
     * call with NextToken should include those same parameters.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken The token to use to get the next page of results after a previous API
     *         call. This token must be passed in with the same parameters that were
     *         specified in the the original call. For example, if the original call
     *         specified an AttributeKey of 'Username' with a value of 'root', the
     *         call with NextToken should include those same parameters.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LookupEventsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getLookupAttributes() != null) sb.append("LookupAttributes: " + getLookupAttributes() + ",");
        if (getStartTime() != null) sb.append("StartTime: " + getStartTime() + ",");
        if (getEndTime() != null) sb.append("EndTime: " + getEndTime() + ",");
        if (getMaxResults() != null) sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getLookupAttributes() == null) ? 0 : getLookupAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode()); 
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode()); 
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof LookupEventsRequest == false) return false;
        LookupEventsRequest other = (LookupEventsRequest)obj;
        
        if (other.getLookupAttributes() == null ^ this.getLookupAttributes() == null) return false;
        if (other.getLookupAttributes() != null && other.getLookupAttributes().equals(this.getLookupAttributes()) == false) return false; 
        if (other.getStartTime() == null ^ this.getStartTime() == null) return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false) return false; 
        if (other.getEndTime() == null ^ this.getEndTime() == null) return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false) return false; 
        if (other.getMaxResults() == null ^ this.getMaxResults() == null) return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
    @Override
    public LookupEventsRequest clone() {
        
            return (LookupEventsRequest) super.clone();
    }

}
    