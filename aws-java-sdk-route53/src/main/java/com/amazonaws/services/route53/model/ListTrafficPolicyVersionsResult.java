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
public class ListTrafficPolicyVersionsResult implements Serializable, Cloneable {

    /**
     * A list that contains one <code>TrafficPolicy</code> element for each
     * traffic policy version that is associated with the specified traffic
     * policy.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<TrafficPolicy> trafficPolicies;

    /**
     * A flag that indicates whether there are more traffic policies to be
     * listed. If the response was truncated, you can get the next group of
     * <code>maxitems</code> traffic policies by calling
     * <code>ListTrafficPolicyVersions</code> again and specifying the value
     * of the <code>NextMarker</code> element in the marker parameter.
     * <p>Valid Values: <code>true</code> | <code>false</code>
     */
    private Boolean isTruncated;

    /**
     * If <code>IsTruncated</code> is <code>true</code>, the value of
     * <code>TrafficPolicyVersionMarker</code> identifies the first traffic
     * policy in the next group of <code>MaxItems</code> traffic policies.
     * Call <code>ListTrafficPolicyVersions</code> again and specify the
     * value of <code>TrafficPolicyVersionMarker</code> in the
     * <code>TrafficPolicyVersionMarker</code> request parameter. <p>This
     * element is present only if <code>IsTruncated</code> is
     * <code>true</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4<br/>
     */
    private String trafficPolicyVersionMarker;

    /**
     * The value that you specified for the <code>maxitems</code> parameter
     * in the call to <code>ListTrafficPolicyVersions</code> that produced
     * the current response.
     */
    private String maxItems;

    /**
     * A list that contains one <code>TrafficPolicy</code> element for each
     * traffic policy version that is associated with the specified traffic
     * policy.
     *
     * @return A list that contains one <code>TrafficPolicy</code> element for each
     *         traffic policy version that is associated with the specified traffic
     *         policy.
     */
    public java.util.List<TrafficPolicy> getTrafficPolicies() {
        if (trafficPolicies == null) {
              trafficPolicies = new com.amazonaws.internal.ListWithAutoConstructFlag<TrafficPolicy>();
              trafficPolicies.setAutoConstruct(true);
        }
        return trafficPolicies;
    }
    
    /**
     * A list that contains one <code>TrafficPolicy</code> element for each
     * traffic policy version that is associated with the specified traffic
     * policy.
     *
     * @param trafficPolicies A list that contains one <code>TrafficPolicy</code> element for each
     *         traffic policy version that is associated with the specified traffic
     *         policy.
     */
    public void setTrafficPolicies(java.util.Collection<TrafficPolicy> trafficPolicies) {
        if (trafficPolicies == null) {
            this.trafficPolicies = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<TrafficPolicy> trafficPoliciesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<TrafficPolicy>(trafficPolicies.size());
        trafficPoliciesCopy.addAll(trafficPolicies);
        this.trafficPolicies = trafficPoliciesCopy;
    }
    
    /**
     * A list that contains one <code>TrafficPolicy</code> element for each
     * traffic policy version that is associated with the specified traffic
     * policy.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTrafficPolicies(java.util.Collection)} or {@link
     * #withTrafficPolicies(java.util.Collection)} if you want to override
     * the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param trafficPolicies A list that contains one <code>TrafficPolicy</code> element for each
     *         traffic policy version that is associated with the specified traffic
     *         policy.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListTrafficPolicyVersionsResult withTrafficPolicies(TrafficPolicy... trafficPolicies) {
        if (getTrafficPolicies() == null) setTrafficPolicies(new java.util.ArrayList<TrafficPolicy>(trafficPolicies.length));
        for (TrafficPolicy value : trafficPolicies) {
            getTrafficPolicies().add(value);
        }
        return this;
    }
    
    /**
     * A list that contains one <code>TrafficPolicy</code> element for each
     * traffic policy version that is associated with the specified traffic
     * policy.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param trafficPolicies A list that contains one <code>TrafficPolicy</code> element for each
     *         traffic policy version that is associated with the specified traffic
     *         policy.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListTrafficPolicyVersionsResult withTrafficPolicies(java.util.Collection<TrafficPolicy> trafficPolicies) {
        if (trafficPolicies == null) {
            this.trafficPolicies = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<TrafficPolicy> trafficPoliciesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<TrafficPolicy>(trafficPolicies.size());
            trafficPoliciesCopy.addAll(trafficPolicies);
            this.trafficPolicies = trafficPoliciesCopy;
        }

        return this;
    }

    /**
     * A flag that indicates whether there are more traffic policies to be
     * listed. If the response was truncated, you can get the next group of
     * <code>maxitems</code> traffic policies by calling
     * <code>ListTrafficPolicyVersions</code> again and specifying the value
     * of the <code>NextMarker</code> element in the marker parameter.
     * <p>Valid Values: <code>true</code> | <code>false</code>
     *
     * @return A flag that indicates whether there are more traffic policies to be
     *         listed. If the response was truncated, you can get the next group of
     *         <code>maxitems</code> traffic policies by calling
     *         <code>ListTrafficPolicyVersions</code> again and specifying the value
     *         of the <code>NextMarker</code> element in the marker parameter.
     *         <p>Valid Values: <code>true</code> | <code>false</code>
     */
    public Boolean isTruncated() {
        return isTruncated;
    }
    
    /**
     * A flag that indicates whether there are more traffic policies to be
     * listed. If the response was truncated, you can get the next group of
     * <code>maxitems</code> traffic policies by calling
     * <code>ListTrafficPolicyVersions</code> again and specifying the value
     * of the <code>NextMarker</code> element in the marker parameter.
     * <p>Valid Values: <code>true</code> | <code>false</code>
     *
     * @param isTruncated A flag that indicates whether there are more traffic policies to be
     *         listed. If the response was truncated, you can get the next group of
     *         <code>maxitems</code> traffic policies by calling
     *         <code>ListTrafficPolicyVersions</code> again and specifying the value
     *         of the <code>NextMarker</code> element in the marker parameter.
     *         <p>Valid Values: <code>true</code> | <code>false</code>
     */
    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }
    
    /**
     * A flag that indicates whether there are more traffic policies to be
     * listed. If the response was truncated, you can get the next group of
     * <code>maxitems</code> traffic policies by calling
     * <code>ListTrafficPolicyVersions</code> again and specifying the value
     * of the <code>NextMarker</code> element in the marker parameter.
     * <p>Valid Values: <code>true</code> | <code>false</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param isTruncated A flag that indicates whether there are more traffic policies to be
     *         listed. If the response was truncated, you can get the next group of
     *         <code>maxitems</code> traffic policies by calling
     *         <code>ListTrafficPolicyVersions</code> again and specifying the value
     *         of the <code>NextMarker</code> element in the marker parameter.
     *         <p>Valid Values: <code>true</code> | <code>false</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListTrafficPolicyVersionsResult withIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    /**
     * A flag that indicates whether there are more traffic policies to be
     * listed. If the response was truncated, you can get the next group of
     * <code>maxitems</code> traffic policies by calling
     * <code>ListTrafficPolicyVersions</code> again and specifying the value
     * of the <code>NextMarker</code> element in the marker parameter.
     * <p>Valid Values: <code>true</code> | <code>false</code>
     *
     * @return A flag that indicates whether there are more traffic policies to be
     *         listed. If the response was truncated, you can get the next group of
     *         <code>maxitems</code> traffic policies by calling
     *         <code>ListTrafficPolicyVersions</code> again and specifying the value
     *         of the <code>NextMarker</code> element in the marker parameter.
     *         <p>Valid Values: <code>true</code> | <code>false</code>
     */
    public Boolean getIsTruncated() {
        return isTruncated;
    }

    /**
     * If <code>IsTruncated</code> is <code>true</code>, the value of
     * <code>TrafficPolicyVersionMarker</code> identifies the first traffic
     * policy in the next group of <code>MaxItems</code> traffic policies.
     * Call <code>ListTrafficPolicyVersions</code> again and specify the
     * value of <code>TrafficPolicyVersionMarker</code> in the
     * <code>TrafficPolicyVersionMarker</code> request parameter. <p>This
     * element is present only if <code>IsTruncated</code> is
     * <code>true</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4<br/>
     *
     * @return If <code>IsTruncated</code> is <code>true</code>, the value of
     *         <code>TrafficPolicyVersionMarker</code> identifies the first traffic
     *         policy in the next group of <code>MaxItems</code> traffic policies.
     *         Call <code>ListTrafficPolicyVersions</code> again and specify the
     *         value of <code>TrafficPolicyVersionMarker</code> in the
     *         <code>TrafficPolicyVersionMarker</code> request parameter. <p>This
     *         element is present only if <code>IsTruncated</code> is
     *         <code>true</code>.
     */
    public String getTrafficPolicyVersionMarker() {
        return trafficPolicyVersionMarker;
    }
    
    /**
     * If <code>IsTruncated</code> is <code>true</code>, the value of
     * <code>TrafficPolicyVersionMarker</code> identifies the first traffic
     * policy in the next group of <code>MaxItems</code> traffic policies.
     * Call <code>ListTrafficPolicyVersions</code> again and specify the
     * value of <code>TrafficPolicyVersionMarker</code> in the
     * <code>TrafficPolicyVersionMarker</code> request parameter. <p>This
     * element is present only if <code>IsTruncated</code> is
     * <code>true</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4<br/>
     *
     * @param trafficPolicyVersionMarker If <code>IsTruncated</code> is <code>true</code>, the value of
     *         <code>TrafficPolicyVersionMarker</code> identifies the first traffic
     *         policy in the next group of <code>MaxItems</code> traffic policies.
     *         Call <code>ListTrafficPolicyVersions</code> again and specify the
     *         value of <code>TrafficPolicyVersionMarker</code> in the
     *         <code>TrafficPolicyVersionMarker</code> request parameter. <p>This
     *         element is present only if <code>IsTruncated</code> is
     *         <code>true</code>.
     */
    public void setTrafficPolicyVersionMarker(String trafficPolicyVersionMarker) {
        this.trafficPolicyVersionMarker = trafficPolicyVersionMarker;
    }
    
    /**
     * If <code>IsTruncated</code> is <code>true</code>, the value of
     * <code>TrafficPolicyVersionMarker</code> identifies the first traffic
     * policy in the next group of <code>MaxItems</code> traffic policies.
     * Call <code>ListTrafficPolicyVersions</code> again and specify the
     * value of <code>TrafficPolicyVersionMarker</code> in the
     * <code>TrafficPolicyVersionMarker</code> request parameter. <p>This
     * element is present only if <code>IsTruncated</code> is
     * <code>true</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4<br/>
     *
     * @param trafficPolicyVersionMarker If <code>IsTruncated</code> is <code>true</code>, the value of
     *         <code>TrafficPolicyVersionMarker</code> identifies the first traffic
     *         policy in the next group of <code>MaxItems</code> traffic policies.
     *         Call <code>ListTrafficPolicyVersions</code> again and specify the
     *         value of <code>TrafficPolicyVersionMarker</code> in the
     *         <code>TrafficPolicyVersionMarker</code> request parameter. <p>This
     *         element is present only if <code>IsTruncated</code> is
     *         <code>true</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListTrafficPolicyVersionsResult withTrafficPolicyVersionMarker(String trafficPolicyVersionMarker) {
        this.trafficPolicyVersionMarker = trafficPolicyVersionMarker;
        return this;
    }

    /**
     * The value that you specified for the <code>maxitems</code> parameter
     * in the call to <code>ListTrafficPolicyVersions</code> that produced
     * the current response.
     *
     * @return The value that you specified for the <code>maxitems</code> parameter
     *         in the call to <code>ListTrafficPolicyVersions</code> that produced
     *         the current response.
     */
    public String getMaxItems() {
        return maxItems;
    }
    
    /**
     * The value that you specified for the <code>maxitems</code> parameter
     * in the call to <code>ListTrafficPolicyVersions</code> that produced
     * the current response.
     *
     * @param maxItems The value that you specified for the <code>maxitems</code> parameter
     *         in the call to <code>ListTrafficPolicyVersions</code> that produced
     *         the current response.
     */
    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }
    
    /**
     * The value that you specified for the <code>maxitems</code> parameter
     * in the call to <code>ListTrafficPolicyVersions</code> that produced
     * the current response.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxItems The value that you specified for the <code>maxitems</code> parameter
     *         in the call to <code>ListTrafficPolicyVersions</code> that produced
     *         the current response.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListTrafficPolicyVersionsResult withMaxItems(String maxItems) {
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
        if (getTrafficPolicies() != null) sb.append("TrafficPolicies: " + getTrafficPolicies() + ",");
        if (isTruncated() != null) sb.append("IsTruncated: " + isTruncated() + ",");
        if (getTrafficPolicyVersionMarker() != null) sb.append("TrafficPolicyVersionMarker: " + getTrafficPolicyVersionMarker() + ",");
        if (getMaxItems() != null) sb.append("MaxItems: " + getMaxItems() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTrafficPolicies() == null) ? 0 : getTrafficPolicies().hashCode()); 
        hashCode = prime * hashCode + ((isTruncated() == null) ? 0 : isTruncated().hashCode()); 
        hashCode = prime * hashCode + ((getTrafficPolicyVersionMarker() == null) ? 0 : getTrafficPolicyVersionMarker().hashCode()); 
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListTrafficPolicyVersionsResult == false) return false;
        ListTrafficPolicyVersionsResult other = (ListTrafficPolicyVersionsResult)obj;
        
        if (other.getTrafficPolicies() == null ^ this.getTrafficPolicies() == null) return false;
        if (other.getTrafficPolicies() != null && other.getTrafficPolicies().equals(this.getTrafficPolicies()) == false) return false; 
        if (other.isTruncated() == null ^ this.isTruncated() == null) return false;
        if (other.isTruncated() != null && other.isTruncated().equals(this.isTruncated()) == false) return false; 
        if (other.getTrafficPolicyVersionMarker() == null ^ this.getTrafficPolicyVersionMarker() == null) return false;
        if (other.getTrafficPolicyVersionMarker() != null && other.getTrafficPolicyVersionMarker().equals(this.getTrafficPolicyVersionMarker()) == false) return false; 
        if (other.getMaxItems() == null ^ this.getMaxItems() == null) return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false) return false; 
        return true;
    }
    
    @Override
    public ListTrafficPolicyVersionsResult clone() {
        try {
            return (ListTrafficPolicyVersionsResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    