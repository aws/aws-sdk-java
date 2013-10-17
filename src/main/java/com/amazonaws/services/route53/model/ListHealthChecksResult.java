/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * A complex type that contains the response for the request.
 * </p>
 */
public class ListHealthChecksResult implements Serializable {

    /**
     * A complex type that contains information about the health checks
     * associated with the current AWS account.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<HealthCheck> healthChecks;

    /**
     * If the request returned more than one page of results, submit another
     * request and specify the value of <code>NextMarker</code> from the last
     * response in the <code>marker</code> parameter to get the next page of
     * results.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     */
    private String marker;

    /**
     * A flag indicating whether there are more health checks to be listed.
     * If your results were truncated, you can make a follow-up request for
     * the next page of results by using the <code>Marker</code> element.
     * <p>Valid Values: <code>true</code> | <code>false</code>
     */
    private Boolean isTruncated;

    /**
     * Indicates where to continue listing health checks. If
     * <a>ListHealthChecksResponse$IsTruncated</a> is <code>true</code>, make
     * another request to <code>ListHealthChecks</code> and include the value
     * of the <code>NextMarker</code> element in the <code>Marker</code>
     * element to get the next page of results.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     */
    private String nextMarker;

    /**
     * The maximum number of health checks to be included in the response
     * body. If the number of health checks associated with this AWS account
     * exceeds <code>MaxItems</code>, the value of
     * <a>ListHealthChecksResponse$IsTruncated</a> in the response is
     * <code>true</code>. Call <code>ListHealthChecks</code> again and
     * specify the value of <a>ListHealthChecksResponse$NextMarker</a> in the
     * <a>ListHostedZonesRequest$Marker</a> element to get the next page of
     * results.
     */
    private String maxItems;

    /**
     * A complex type that contains information about the health checks
     * associated with the current AWS account.
     *
     * @return A complex type that contains information about the health checks
     *         associated with the current AWS account.
     */
    public java.util.List<HealthCheck> getHealthChecks() {
        if (healthChecks == null) {
              healthChecks = new com.amazonaws.internal.ListWithAutoConstructFlag<HealthCheck>();
              healthChecks.setAutoConstruct(true);
        }
        return healthChecks;
    }
    
    /**
     * A complex type that contains information about the health checks
     * associated with the current AWS account.
     *
     * @param healthChecks A complex type that contains information about the health checks
     *         associated with the current AWS account.
     */
    public void setHealthChecks(java.util.Collection<HealthCheck> healthChecks) {
        if (healthChecks == null) {
            this.healthChecks = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<HealthCheck> healthChecksCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<HealthCheck>(healthChecks.size());
        healthChecksCopy.addAll(healthChecks);
        this.healthChecks = healthChecksCopy;
    }
    
    /**
     * A complex type that contains information about the health checks
     * associated with the current AWS account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param healthChecks A complex type that contains information about the health checks
     *         associated with the current AWS account.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListHealthChecksResult withHealthChecks(HealthCheck... healthChecks) {
        if (getHealthChecks() == null) setHealthChecks(new java.util.ArrayList<HealthCheck>(healthChecks.length));
        for (HealthCheck value : healthChecks) {
            getHealthChecks().add(value);
        }
        return this;
    }
    
    /**
     * A complex type that contains information about the health checks
     * associated with the current AWS account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param healthChecks A complex type that contains information about the health checks
     *         associated with the current AWS account.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListHealthChecksResult withHealthChecks(java.util.Collection<HealthCheck> healthChecks) {
        if (healthChecks == null) {
            this.healthChecks = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<HealthCheck> healthChecksCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<HealthCheck>(healthChecks.size());
            healthChecksCopy.addAll(healthChecks);
            this.healthChecks = healthChecksCopy;
        }

        return this;
    }

    /**
     * If the request returned more than one page of results, submit another
     * request and specify the value of <code>NextMarker</code> from the last
     * response in the <code>marker</code> parameter to get the next page of
     * results.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @return If the request returned more than one page of results, submit another
     *         request and specify the value of <code>NextMarker</code> from the last
     *         response in the <code>marker</code> parameter to get the next page of
     *         results.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * If the request returned more than one page of results, submit another
     * request and specify the value of <code>NextMarker</code> from the last
     * response in the <code>marker</code> parameter to get the next page of
     * results.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @param marker If the request returned more than one page of results, submit another
     *         request and specify the value of <code>NextMarker</code> from the last
     *         response in the <code>marker</code> parameter to get the next page of
     *         results.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * If the request returned more than one page of results, submit another
     * request and specify the value of <code>NextMarker</code> from the last
     * response in the <code>marker</code> parameter to get the next page of
     * results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @param marker If the request returned more than one page of results, submit another
     *         request and specify the value of <code>NextMarker</code> from the last
     *         response in the <code>marker</code> parameter to get the next page of
     *         results.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListHealthChecksResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * A flag indicating whether there are more health checks to be listed.
     * If your results were truncated, you can make a follow-up request for
     * the next page of results by using the <code>Marker</code> element.
     * <p>Valid Values: <code>true</code> | <code>false</code>
     *
     * @return A flag indicating whether there are more health checks to be listed.
     *         If your results were truncated, you can make a follow-up request for
     *         the next page of results by using the <code>Marker</code> element.
     *         <p>Valid Values: <code>true</code> | <code>false</code>
     */
    public Boolean isTruncated() {
        return isTruncated;
    }
    
    /**
     * A flag indicating whether there are more health checks to be listed.
     * If your results were truncated, you can make a follow-up request for
     * the next page of results by using the <code>Marker</code> element.
     * <p>Valid Values: <code>true</code> | <code>false</code>
     *
     * @param isTruncated A flag indicating whether there are more health checks to be listed.
     *         If your results were truncated, you can make a follow-up request for
     *         the next page of results by using the <code>Marker</code> element.
     *         <p>Valid Values: <code>true</code> | <code>false</code>
     */
    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }
    
    /**
     * A flag indicating whether there are more health checks to be listed.
     * If your results were truncated, you can make a follow-up request for
     * the next page of results by using the <code>Marker</code> element.
     * <p>Valid Values: <code>true</code> | <code>false</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param isTruncated A flag indicating whether there are more health checks to be listed.
     *         If your results were truncated, you can make a follow-up request for
     *         the next page of results by using the <code>Marker</code> element.
     *         <p>Valid Values: <code>true</code> | <code>false</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListHealthChecksResult withIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    /**
     * A flag indicating whether there are more health checks to be listed.
     * If your results were truncated, you can make a follow-up request for
     * the next page of results by using the <code>Marker</code> element.
     * <p>Valid Values: <code>true</code> | <code>false</code>
     *
     * @return A flag indicating whether there are more health checks to be listed.
     *         If your results were truncated, you can make a follow-up request for
     *         the next page of results by using the <code>Marker</code> element.
     *         <p>Valid Values: <code>true</code> | <code>false</code>
     */
    public Boolean getIsTruncated() {
        return isTruncated;
    }

    /**
     * Indicates where to continue listing health checks. If
     * <a>ListHealthChecksResponse$IsTruncated</a> is <code>true</code>, make
     * another request to <code>ListHealthChecks</code> and include the value
     * of the <code>NextMarker</code> element in the <code>Marker</code>
     * element to get the next page of results.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @return Indicates where to continue listing health checks. If
     *         <a>ListHealthChecksResponse$IsTruncated</a> is <code>true</code>, make
     *         another request to <code>ListHealthChecks</code> and include the value
     *         of the <code>NextMarker</code> element in the <code>Marker</code>
     *         element to get the next page of results.
     */
    public String getNextMarker() {
        return nextMarker;
    }
    
    /**
     * Indicates where to continue listing health checks. If
     * <a>ListHealthChecksResponse$IsTruncated</a> is <code>true</code>, make
     * another request to <code>ListHealthChecks</code> and include the value
     * of the <code>NextMarker</code> element in the <code>Marker</code>
     * element to get the next page of results.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @param nextMarker Indicates where to continue listing health checks. If
     *         <a>ListHealthChecksResponse$IsTruncated</a> is <code>true</code>, make
     *         another request to <code>ListHealthChecks</code> and include the value
     *         of the <code>NextMarker</code> element in the <code>Marker</code>
     *         element to get the next page of results.
     */
    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }
    
    /**
     * Indicates where to continue listing health checks. If
     * <a>ListHealthChecksResponse$IsTruncated</a> is <code>true</code>, make
     * another request to <code>ListHealthChecks</code> and include the value
     * of the <code>NextMarker</code> element in the <code>Marker</code>
     * element to get the next page of results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @param nextMarker Indicates where to continue listing health checks. If
     *         <a>ListHealthChecksResponse$IsTruncated</a> is <code>true</code>, make
     *         another request to <code>ListHealthChecks</code> and include the value
     *         of the <code>NextMarker</code> element in the <code>Marker</code>
     *         element to get the next page of results.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListHealthChecksResult withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    /**
     * The maximum number of health checks to be included in the response
     * body. If the number of health checks associated with this AWS account
     * exceeds <code>MaxItems</code>, the value of
     * <a>ListHealthChecksResponse$IsTruncated</a> in the response is
     * <code>true</code>. Call <code>ListHealthChecks</code> again and
     * specify the value of <a>ListHealthChecksResponse$NextMarker</a> in the
     * <a>ListHostedZonesRequest$Marker</a> element to get the next page of
     * results.
     *
     * @return The maximum number of health checks to be included in the response
     *         body. If the number of health checks associated with this AWS account
     *         exceeds <code>MaxItems</code>, the value of
     *         <a>ListHealthChecksResponse$IsTruncated</a> in the response is
     *         <code>true</code>. Call <code>ListHealthChecks</code> again and
     *         specify the value of <a>ListHealthChecksResponse$NextMarker</a> in the
     *         <a>ListHostedZonesRequest$Marker</a> element to get the next page of
     *         results.
     */
    public String getMaxItems() {
        return maxItems;
    }
    
    /**
     * The maximum number of health checks to be included in the response
     * body. If the number of health checks associated with this AWS account
     * exceeds <code>MaxItems</code>, the value of
     * <a>ListHealthChecksResponse$IsTruncated</a> in the response is
     * <code>true</code>. Call <code>ListHealthChecks</code> again and
     * specify the value of <a>ListHealthChecksResponse$NextMarker</a> in the
     * <a>ListHostedZonesRequest$Marker</a> element to get the next page of
     * results.
     *
     * @param maxItems The maximum number of health checks to be included in the response
     *         body. If the number of health checks associated with this AWS account
     *         exceeds <code>MaxItems</code>, the value of
     *         <a>ListHealthChecksResponse$IsTruncated</a> in the response is
     *         <code>true</code>. Call <code>ListHealthChecks</code> again and
     *         specify the value of <a>ListHealthChecksResponse$NextMarker</a> in the
     *         <a>ListHostedZonesRequest$Marker</a> element to get the next page of
     *         results.
     */
    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }
    
    /**
     * The maximum number of health checks to be included in the response
     * body. If the number of health checks associated with this AWS account
     * exceeds <code>MaxItems</code>, the value of
     * <a>ListHealthChecksResponse$IsTruncated</a> in the response is
     * <code>true</code>. Call <code>ListHealthChecks</code> again and
     * specify the value of <a>ListHealthChecksResponse$NextMarker</a> in the
     * <a>ListHostedZonesRequest$Marker</a> element to get the next page of
     * results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxItems The maximum number of health checks to be included in the response
     *         body. If the number of health checks associated with this AWS account
     *         exceeds <code>MaxItems</code>, the value of
     *         <a>ListHealthChecksResponse$IsTruncated</a> in the response is
     *         <code>true</code>. Call <code>ListHealthChecks</code> again and
     *         specify the value of <a>ListHealthChecksResponse$NextMarker</a> in the
     *         <a>ListHostedZonesRequest$Marker</a> element to get the next page of
     *         results.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListHealthChecksResult withMaxItems(String maxItems) {
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
        if (getHealthChecks() != null) sb.append("HealthChecks: " + getHealthChecks() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() + ",");
        if (isTruncated() != null) sb.append("IsTruncated: " + isTruncated() + ",");
        if (getNextMarker() != null) sb.append("NextMarker: " + getNextMarker() + ",");
        if (getMaxItems() != null) sb.append("MaxItems: " + getMaxItems() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getHealthChecks() == null) ? 0 : getHealthChecks().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        hashCode = prime * hashCode + ((isTruncated() == null) ? 0 : isTruncated().hashCode()); 
        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode()); 
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListHealthChecksResult == false) return false;
        ListHealthChecksResult other = (ListHealthChecksResult)obj;
        
        if (other.getHealthChecks() == null ^ this.getHealthChecks() == null) return false;
        if (other.getHealthChecks() != null && other.getHealthChecks().equals(this.getHealthChecks()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.isTruncated() == null ^ this.isTruncated() == null) return false;
        if (other.isTruncated() != null && other.isTruncated().equals(this.isTruncated()) == false) return false; 
        if (other.getNextMarker() == null ^ this.getNextMarker() == null) return false;
        if (other.getNextMarker() != null && other.getNextMarker().equals(this.getNextMarker()) == false) return false; 
        if (other.getMaxItems() == null ^ this.getMaxItems() == null) return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false) return false; 
        return true;
    }
    
}
    