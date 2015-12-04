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
package com.amazonaws.services.route53.model;

import java.io.Serializable;

/**
 * <p>
 * A complex type that contains the response information for the request.
 * </p>
 */
public class ListTrafficPoliciesResult implements Serializable, Cloneable {

    /**
     * A list that contains one <code>TrafficPolicySummary</code> element for
     * each traffic policy that was created by the current AWS account.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<TrafficPolicySummary> trafficPolicySummaries;

    /**
     * A flag that indicates whether there are more traffic policies to be
     * listed. If the response was truncated, you can get the next group of
     * <code>MaxItems</code> traffic policies by calling
     * <code>ListTrafficPolicies</code> again and specifying the value of the
     * <code>TrafficPolicyIdMarker</code> element in the
     * <code>TrafficPolicyIdMarker</code> request parameter. <p>Valid Values:
     * <code>true</code> | <code>false</code>
     */
    private Boolean isTruncated;

    /**
     * If the value of <code>IsTruncated</code> is <code>true</code>,
     * <code>TrafficPolicyIdMarker</code> is the ID of the first traffic
     * policy in the next group of <code>MaxItems</code> traffic policies.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 36<br/>
     */
    private String trafficPolicyIdMarker;

    /**
     * The value that you specified for the <code>MaxItems</code> parameter
     * in the call to <code>ListTrafficPolicies</code> that produced the
     * current response.
     */
    private String maxItems;

    /**
     * A list that contains one <code>TrafficPolicySummary</code> element for
     * each traffic policy that was created by the current AWS account.
     *
     * @return A list that contains one <code>TrafficPolicySummary</code> element for
     *         each traffic policy that was created by the current AWS account.
     */
    public java.util.List<TrafficPolicySummary> getTrafficPolicySummaries() {
        if (trafficPolicySummaries == null) {
              trafficPolicySummaries = new com.amazonaws.internal.ListWithAutoConstructFlag<TrafficPolicySummary>();
              trafficPolicySummaries.setAutoConstruct(true);
        }
        return trafficPolicySummaries;
    }
    
    /**
     * A list that contains one <code>TrafficPolicySummary</code> element for
     * each traffic policy that was created by the current AWS account.
     *
     * @param trafficPolicySummaries A list that contains one <code>TrafficPolicySummary</code> element for
     *         each traffic policy that was created by the current AWS account.
     */
    public void setTrafficPolicySummaries(java.util.Collection<TrafficPolicySummary> trafficPolicySummaries) {
        if (trafficPolicySummaries == null) {
            this.trafficPolicySummaries = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<TrafficPolicySummary> trafficPolicySummariesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<TrafficPolicySummary>(trafficPolicySummaries.size());
        trafficPolicySummariesCopy.addAll(trafficPolicySummaries);
        this.trafficPolicySummaries = trafficPolicySummariesCopy;
    }
    
    /**
     * A list that contains one <code>TrafficPolicySummary</code> element for
     * each traffic policy that was created by the current AWS account.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTrafficPolicySummaries(java.util.Collection)} or
     * {@link #withTrafficPolicySummaries(java.util.Collection)} if you want
     * to override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param trafficPolicySummaries A list that contains one <code>TrafficPolicySummary</code> element for
     *         each traffic policy that was created by the current AWS account.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListTrafficPoliciesResult withTrafficPolicySummaries(TrafficPolicySummary... trafficPolicySummaries) {
        if (getTrafficPolicySummaries() == null) setTrafficPolicySummaries(new java.util.ArrayList<TrafficPolicySummary>(trafficPolicySummaries.length));
        for (TrafficPolicySummary value : trafficPolicySummaries) {
            getTrafficPolicySummaries().add(value);
        }
        return this;
    }
    
    /**
     * A list that contains one <code>TrafficPolicySummary</code> element for
     * each traffic policy that was created by the current AWS account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param trafficPolicySummaries A list that contains one <code>TrafficPolicySummary</code> element for
     *         each traffic policy that was created by the current AWS account.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListTrafficPoliciesResult withTrafficPolicySummaries(java.util.Collection<TrafficPolicySummary> trafficPolicySummaries) {
        if (trafficPolicySummaries == null) {
            this.trafficPolicySummaries = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<TrafficPolicySummary> trafficPolicySummariesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<TrafficPolicySummary>(trafficPolicySummaries.size());
            trafficPolicySummariesCopy.addAll(trafficPolicySummaries);
            this.trafficPolicySummaries = trafficPolicySummariesCopy;
        }

        return this;
    }

    /**
     * A flag that indicates whether there are more traffic policies to be
     * listed. If the response was truncated, you can get the next group of
     * <code>MaxItems</code> traffic policies by calling
     * <code>ListTrafficPolicies</code> again and specifying the value of the
     * <code>TrafficPolicyIdMarker</code> element in the
     * <code>TrafficPolicyIdMarker</code> request parameter. <p>Valid Values:
     * <code>true</code> | <code>false</code>
     *
     * @return A flag that indicates whether there are more traffic policies to be
     *         listed. If the response was truncated, you can get the next group of
     *         <code>MaxItems</code> traffic policies by calling
     *         <code>ListTrafficPolicies</code> again and specifying the value of the
     *         <code>TrafficPolicyIdMarker</code> element in the
     *         <code>TrafficPolicyIdMarker</code> request parameter. <p>Valid Values:
     *         <code>true</code> | <code>false</code>
     */
    public Boolean isTruncated() {
        return isTruncated;
    }
    
    /**
     * A flag that indicates whether there are more traffic policies to be
     * listed. If the response was truncated, you can get the next group of
     * <code>MaxItems</code> traffic policies by calling
     * <code>ListTrafficPolicies</code> again and specifying the value of the
     * <code>TrafficPolicyIdMarker</code> element in the
     * <code>TrafficPolicyIdMarker</code> request parameter. <p>Valid Values:
     * <code>true</code> | <code>false</code>
     *
     * @param isTruncated A flag that indicates whether there are more traffic policies to be
     *         listed. If the response was truncated, you can get the next group of
     *         <code>MaxItems</code> traffic policies by calling
     *         <code>ListTrafficPolicies</code> again and specifying the value of the
     *         <code>TrafficPolicyIdMarker</code> element in the
     *         <code>TrafficPolicyIdMarker</code> request parameter. <p>Valid Values:
     *         <code>true</code> | <code>false</code>
     */
    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }
    
    /**
     * A flag that indicates whether there are more traffic policies to be
     * listed. If the response was truncated, you can get the next group of
     * <code>MaxItems</code> traffic policies by calling
     * <code>ListTrafficPolicies</code> again and specifying the value of the
     * <code>TrafficPolicyIdMarker</code> element in the
     * <code>TrafficPolicyIdMarker</code> request parameter. <p>Valid Values:
     * <code>true</code> | <code>false</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param isTruncated A flag that indicates whether there are more traffic policies to be
     *         listed. If the response was truncated, you can get the next group of
     *         <code>MaxItems</code> traffic policies by calling
     *         <code>ListTrafficPolicies</code> again and specifying the value of the
     *         <code>TrafficPolicyIdMarker</code> element in the
     *         <code>TrafficPolicyIdMarker</code> request parameter. <p>Valid Values:
     *         <code>true</code> | <code>false</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListTrafficPoliciesResult withIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    /**
     * A flag that indicates whether there are more traffic policies to be
     * listed. If the response was truncated, you can get the next group of
     * <code>MaxItems</code> traffic policies by calling
     * <code>ListTrafficPolicies</code> again and specifying the value of the
     * <code>TrafficPolicyIdMarker</code> element in the
     * <code>TrafficPolicyIdMarker</code> request parameter. <p>Valid Values:
     * <code>true</code> | <code>false</code>
     *
     * @return A flag that indicates whether there are more traffic policies to be
     *         listed. If the response was truncated, you can get the next group of
     *         <code>MaxItems</code> traffic policies by calling
     *         <code>ListTrafficPolicies</code> again and specifying the value of the
     *         <code>TrafficPolicyIdMarker</code> element in the
     *         <code>TrafficPolicyIdMarker</code> request parameter. <p>Valid Values:
     *         <code>true</code> | <code>false</code>
     */
    public Boolean getIsTruncated() {
        return isTruncated;
    }

    /**
     * If the value of <code>IsTruncated</code> is <code>true</code>,
     * <code>TrafficPolicyIdMarker</code> is the ID of the first traffic
     * policy in the next group of <code>MaxItems</code> traffic policies.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 36<br/>
     *
     * @return If the value of <code>IsTruncated</code> is <code>true</code>,
     *         <code>TrafficPolicyIdMarker</code> is the ID of the first traffic
     *         policy in the next group of <code>MaxItems</code> traffic policies.
     */
    public String getTrafficPolicyIdMarker() {
        return trafficPolicyIdMarker;
    }
    
    /**
     * If the value of <code>IsTruncated</code> is <code>true</code>,
     * <code>TrafficPolicyIdMarker</code> is the ID of the first traffic
     * policy in the next group of <code>MaxItems</code> traffic policies.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 36<br/>
     *
     * @param trafficPolicyIdMarker If the value of <code>IsTruncated</code> is <code>true</code>,
     *         <code>TrafficPolicyIdMarker</code> is the ID of the first traffic
     *         policy in the next group of <code>MaxItems</code> traffic policies.
     */
    public void setTrafficPolicyIdMarker(String trafficPolicyIdMarker) {
        this.trafficPolicyIdMarker = trafficPolicyIdMarker;
    }
    
    /**
     * If the value of <code>IsTruncated</code> is <code>true</code>,
     * <code>TrafficPolicyIdMarker</code> is the ID of the first traffic
     * policy in the next group of <code>MaxItems</code> traffic policies.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 36<br/>
     *
     * @param trafficPolicyIdMarker If the value of <code>IsTruncated</code> is <code>true</code>,
     *         <code>TrafficPolicyIdMarker</code> is the ID of the first traffic
     *         policy in the next group of <code>MaxItems</code> traffic policies.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListTrafficPoliciesResult withTrafficPolicyIdMarker(String trafficPolicyIdMarker) {
        this.trafficPolicyIdMarker = trafficPolicyIdMarker;
        return this;
    }

    /**
     * The value that you specified for the <code>MaxItems</code> parameter
     * in the call to <code>ListTrafficPolicies</code> that produced the
     * current response.
     *
     * @return The value that you specified for the <code>MaxItems</code> parameter
     *         in the call to <code>ListTrafficPolicies</code> that produced the
     *         current response.
     */
    public String getMaxItems() {
        return maxItems;
    }
    
    /**
     * The value that you specified for the <code>MaxItems</code> parameter
     * in the call to <code>ListTrafficPolicies</code> that produced the
     * current response.
     *
     * @param maxItems The value that you specified for the <code>MaxItems</code> parameter
     *         in the call to <code>ListTrafficPolicies</code> that produced the
     *         current response.
     */
    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }
    
    /**
     * The value that you specified for the <code>MaxItems</code> parameter
     * in the call to <code>ListTrafficPolicies</code> that produced the
     * current response.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxItems The value that you specified for the <code>MaxItems</code> parameter
     *         in the call to <code>ListTrafficPolicies</code> that produced the
     *         current response.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListTrafficPoliciesResult withMaxItems(String maxItems) {
        this.maxItems = maxItems;
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
        if (getTrafficPolicySummaries() != null) sb.append("TrafficPolicySummaries: " + getTrafficPolicySummaries() + ",");
        if (isTruncated() != null) sb.append("IsTruncated: " + isTruncated() + ",");
        if (getTrafficPolicyIdMarker() != null) sb.append("TrafficPolicyIdMarker: " + getTrafficPolicyIdMarker() + ",");
        if (getMaxItems() != null) sb.append("MaxItems: " + getMaxItems() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTrafficPolicySummaries() == null) ? 0 : getTrafficPolicySummaries().hashCode()); 
        hashCode = prime * hashCode + ((isTruncated() == null) ? 0 : isTruncated().hashCode()); 
        hashCode = prime * hashCode + ((getTrafficPolicyIdMarker() == null) ? 0 : getTrafficPolicyIdMarker().hashCode()); 
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListTrafficPoliciesResult == false) return false;
        ListTrafficPoliciesResult other = (ListTrafficPoliciesResult)obj;
        
        if (other.getTrafficPolicySummaries() == null ^ this.getTrafficPolicySummaries() == null) return false;
        if (other.getTrafficPolicySummaries() != null && other.getTrafficPolicySummaries().equals(this.getTrafficPolicySummaries()) == false) return false; 
        if (other.isTruncated() == null ^ this.isTruncated() == null) return false;
        if (other.isTruncated() != null && other.isTruncated().equals(this.isTruncated()) == false) return false; 
        if (other.getTrafficPolicyIdMarker() == null ^ this.getTrafficPolicyIdMarker() == null) return false;
        if (other.getTrafficPolicyIdMarker() != null && other.getTrafficPolicyIdMarker().equals(this.getTrafficPolicyIdMarker()) == false) return false; 
        if (other.getMaxItems() == null ^ this.getMaxItems() == null) return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false) return false; 
        return true;
    }
    
    @Override
    public ListTrafficPoliciesResult clone() {
        try {
            return (ListTrafficPoliciesResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    