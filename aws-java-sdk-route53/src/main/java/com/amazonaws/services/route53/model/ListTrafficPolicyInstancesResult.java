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
public class ListTrafficPolicyInstancesResult implements Serializable, Cloneable {

    /**
     * A list that contains one <code>TrafficPolicyInstance</code> element
     * for each traffic policy instance that matches the elements in the
     * request.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<TrafficPolicyInstance> trafficPolicyInstances;

    /**
     * If <code>IsTruncated</code> is <code>true</code>,
     * <code>HostedZoneIdMarker</code> is the ID of the hosted zone of the
     * first traffic policy instance in the next group of
     * <code>MaxItems</code> traffic policy instances.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     */
    private String hostedZoneIdMarker;

    /**
     * If <code>IsTruncated</code> is <code>true</code>,
     * <code>TrafficPolicyInstanceNameMarker</code> is the name of the first
     * traffic policy instance in the next group of <code>MaxItems</code>
     * traffic policy instances.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     */
    private String trafficPolicyInstanceNameMarker;

    /**
     * If <code>IsTruncated</code> is <code>true</code>,
     * <code>TrafficPolicyInstanceTypeMarker</code> is the DNS type of the
     * resource record sets that are associated with the first traffic policy
     * instance in the next group of <code>MaxItems</code> traffic policy
     * instances.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, PTR, SRV, SPF, AAAA
     */
    private String trafficPolicyInstanceTypeMarker;

    /**
     * A flag that indicates whether there are more traffic policy instances
     * to be listed. If the response was truncated, you can get the next
     * group of <code>MaxItems</code> traffic policy instances by calling
     * <code>ListTrafficPolicyInstances</code> again and specifying the
     * values of the <code>HostedZoneIdMarker</code>,
     * <code>TrafficPolicyInstanceNameMarker</code>, and
     * <code>TrafficPolicyInstanceTypeMarker</code> elements in the
     * corresponding request parameters. <p>Valid Values: <code>true</code> |
     * <code>false</code>
     */
    private Boolean isTruncated;

    /**
     * The value that you specified for the <code>MaxItems</code> parameter
     * in the call to <code>ListTrafficPolicyInstances</code> that produced
     * the current response.
     */
    private String maxItems;

    /**
     * A list that contains one <code>TrafficPolicyInstance</code> element
     * for each traffic policy instance that matches the elements in the
     * request.
     *
     * @return A list that contains one <code>TrafficPolicyInstance</code> element
     *         for each traffic policy instance that matches the elements in the
     *         request.
     */
    public java.util.List<TrafficPolicyInstance> getTrafficPolicyInstances() {
        if (trafficPolicyInstances == null) {
              trafficPolicyInstances = new com.amazonaws.internal.ListWithAutoConstructFlag<TrafficPolicyInstance>();
              trafficPolicyInstances.setAutoConstruct(true);
        }
        return trafficPolicyInstances;
    }
    
    /**
     * A list that contains one <code>TrafficPolicyInstance</code> element
     * for each traffic policy instance that matches the elements in the
     * request.
     *
     * @param trafficPolicyInstances A list that contains one <code>TrafficPolicyInstance</code> element
     *         for each traffic policy instance that matches the elements in the
     *         request.
     */
    public void setTrafficPolicyInstances(java.util.Collection<TrafficPolicyInstance> trafficPolicyInstances) {
        if (trafficPolicyInstances == null) {
            this.trafficPolicyInstances = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<TrafficPolicyInstance> trafficPolicyInstancesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<TrafficPolicyInstance>(trafficPolicyInstances.size());
        trafficPolicyInstancesCopy.addAll(trafficPolicyInstances);
        this.trafficPolicyInstances = trafficPolicyInstancesCopy;
    }
    
    /**
     * A list that contains one <code>TrafficPolicyInstance</code> element
     * for each traffic policy instance that matches the elements in the
     * request.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTrafficPolicyInstances(java.util.Collection)} or
     * {@link #withTrafficPolicyInstances(java.util.Collection)} if you want
     * to override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param trafficPolicyInstances A list that contains one <code>TrafficPolicyInstance</code> element
     *         for each traffic policy instance that matches the elements in the
     *         request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListTrafficPolicyInstancesResult withTrafficPolicyInstances(TrafficPolicyInstance... trafficPolicyInstances) {
        if (getTrafficPolicyInstances() == null) setTrafficPolicyInstances(new java.util.ArrayList<TrafficPolicyInstance>(trafficPolicyInstances.length));
        for (TrafficPolicyInstance value : trafficPolicyInstances) {
            getTrafficPolicyInstances().add(value);
        }
        return this;
    }
    
    /**
     * A list that contains one <code>TrafficPolicyInstance</code> element
     * for each traffic policy instance that matches the elements in the
     * request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param trafficPolicyInstances A list that contains one <code>TrafficPolicyInstance</code> element
     *         for each traffic policy instance that matches the elements in the
     *         request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListTrafficPolicyInstancesResult withTrafficPolicyInstances(java.util.Collection<TrafficPolicyInstance> trafficPolicyInstances) {
        if (trafficPolicyInstances == null) {
            this.trafficPolicyInstances = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<TrafficPolicyInstance> trafficPolicyInstancesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<TrafficPolicyInstance>(trafficPolicyInstances.size());
            trafficPolicyInstancesCopy.addAll(trafficPolicyInstances);
            this.trafficPolicyInstances = trafficPolicyInstancesCopy;
        }

        return this;
    }

    /**
     * If <code>IsTruncated</code> is <code>true</code>,
     * <code>HostedZoneIdMarker</code> is the ID of the hosted zone of the
     * first traffic policy instance in the next group of
     * <code>MaxItems</code> traffic policy instances.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     *
     * @return If <code>IsTruncated</code> is <code>true</code>,
     *         <code>HostedZoneIdMarker</code> is the ID of the hosted zone of the
     *         first traffic policy instance in the next group of
     *         <code>MaxItems</code> traffic policy instances.
     */
    public String getHostedZoneIdMarker() {
        return hostedZoneIdMarker;
    }
    
    /**
     * If <code>IsTruncated</code> is <code>true</code>,
     * <code>HostedZoneIdMarker</code> is the ID of the hosted zone of the
     * first traffic policy instance in the next group of
     * <code>MaxItems</code> traffic policy instances.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     *
     * @param hostedZoneIdMarker If <code>IsTruncated</code> is <code>true</code>,
     *         <code>HostedZoneIdMarker</code> is the ID of the hosted zone of the
     *         first traffic policy instance in the next group of
     *         <code>MaxItems</code> traffic policy instances.
     */
    public void setHostedZoneIdMarker(String hostedZoneIdMarker) {
        this.hostedZoneIdMarker = hostedZoneIdMarker;
    }
    
    /**
     * If <code>IsTruncated</code> is <code>true</code>,
     * <code>HostedZoneIdMarker</code> is the ID of the hosted zone of the
     * first traffic policy instance in the next group of
     * <code>MaxItems</code> traffic policy instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     *
     * @param hostedZoneIdMarker If <code>IsTruncated</code> is <code>true</code>,
     *         <code>HostedZoneIdMarker</code> is the ID of the hosted zone of the
     *         first traffic policy instance in the next group of
     *         <code>MaxItems</code> traffic policy instances.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListTrafficPolicyInstancesResult withHostedZoneIdMarker(String hostedZoneIdMarker) {
        this.hostedZoneIdMarker = hostedZoneIdMarker;
        return this;
    }

    /**
     * If <code>IsTruncated</code> is <code>true</code>,
     * <code>TrafficPolicyInstanceNameMarker</code> is the name of the first
     * traffic policy instance in the next group of <code>MaxItems</code>
     * traffic policy instances.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @return If <code>IsTruncated</code> is <code>true</code>,
     *         <code>TrafficPolicyInstanceNameMarker</code> is the name of the first
     *         traffic policy instance in the next group of <code>MaxItems</code>
     *         traffic policy instances.
     */
    public String getTrafficPolicyInstanceNameMarker() {
        return trafficPolicyInstanceNameMarker;
    }
    
    /**
     * If <code>IsTruncated</code> is <code>true</code>,
     * <code>TrafficPolicyInstanceNameMarker</code> is the name of the first
     * traffic policy instance in the next group of <code>MaxItems</code>
     * traffic policy instances.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param trafficPolicyInstanceNameMarker If <code>IsTruncated</code> is <code>true</code>,
     *         <code>TrafficPolicyInstanceNameMarker</code> is the name of the first
     *         traffic policy instance in the next group of <code>MaxItems</code>
     *         traffic policy instances.
     */
    public void setTrafficPolicyInstanceNameMarker(String trafficPolicyInstanceNameMarker) {
        this.trafficPolicyInstanceNameMarker = trafficPolicyInstanceNameMarker;
    }
    
    /**
     * If <code>IsTruncated</code> is <code>true</code>,
     * <code>TrafficPolicyInstanceNameMarker</code> is the name of the first
     * traffic policy instance in the next group of <code>MaxItems</code>
     * traffic policy instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param trafficPolicyInstanceNameMarker If <code>IsTruncated</code> is <code>true</code>,
     *         <code>TrafficPolicyInstanceNameMarker</code> is the name of the first
     *         traffic policy instance in the next group of <code>MaxItems</code>
     *         traffic policy instances.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListTrafficPolicyInstancesResult withTrafficPolicyInstanceNameMarker(String trafficPolicyInstanceNameMarker) {
        this.trafficPolicyInstanceNameMarker = trafficPolicyInstanceNameMarker;
        return this;
    }

    /**
     * If <code>IsTruncated</code> is <code>true</code>,
     * <code>TrafficPolicyInstanceTypeMarker</code> is the DNS type of the
     * resource record sets that are associated with the first traffic policy
     * instance in the next group of <code>MaxItems</code> traffic policy
     * instances.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, PTR, SRV, SPF, AAAA
     *
     * @return If <code>IsTruncated</code> is <code>true</code>,
     *         <code>TrafficPolicyInstanceTypeMarker</code> is the DNS type of the
     *         resource record sets that are associated with the first traffic policy
     *         instance in the next group of <code>MaxItems</code> traffic policy
     *         instances.
     *
     * @see RRType
     */
    public String getTrafficPolicyInstanceTypeMarker() {
        return trafficPolicyInstanceTypeMarker;
    }
    
    /**
     * If <code>IsTruncated</code> is <code>true</code>,
     * <code>TrafficPolicyInstanceTypeMarker</code> is the DNS type of the
     * resource record sets that are associated with the first traffic policy
     * instance in the next group of <code>MaxItems</code> traffic policy
     * instances.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, PTR, SRV, SPF, AAAA
     *
     * @param trafficPolicyInstanceTypeMarker If <code>IsTruncated</code> is <code>true</code>,
     *         <code>TrafficPolicyInstanceTypeMarker</code> is the DNS type of the
     *         resource record sets that are associated with the first traffic policy
     *         instance in the next group of <code>MaxItems</code> traffic policy
     *         instances.
     *
     * @see RRType
     */
    public void setTrafficPolicyInstanceTypeMarker(String trafficPolicyInstanceTypeMarker) {
        this.trafficPolicyInstanceTypeMarker = trafficPolicyInstanceTypeMarker;
    }
    
    /**
     * If <code>IsTruncated</code> is <code>true</code>,
     * <code>TrafficPolicyInstanceTypeMarker</code> is the DNS type of the
     * resource record sets that are associated with the first traffic policy
     * instance in the next group of <code>MaxItems</code> traffic policy
     * instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, PTR, SRV, SPF, AAAA
     *
     * @param trafficPolicyInstanceTypeMarker If <code>IsTruncated</code> is <code>true</code>,
     *         <code>TrafficPolicyInstanceTypeMarker</code> is the DNS type of the
     *         resource record sets that are associated with the first traffic policy
     *         instance in the next group of <code>MaxItems</code> traffic policy
     *         instances.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see RRType
     */
    public ListTrafficPolicyInstancesResult withTrafficPolicyInstanceTypeMarker(String trafficPolicyInstanceTypeMarker) {
        this.trafficPolicyInstanceTypeMarker = trafficPolicyInstanceTypeMarker;
        return this;
    }

    /**
     * If <code>IsTruncated</code> is <code>true</code>,
     * <code>TrafficPolicyInstanceTypeMarker</code> is the DNS type of the
     * resource record sets that are associated with the first traffic policy
     * instance in the next group of <code>MaxItems</code> traffic policy
     * instances.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, PTR, SRV, SPF, AAAA
     *
     * @param trafficPolicyInstanceTypeMarker If <code>IsTruncated</code> is <code>true</code>,
     *         <code>TrafficPolicyInstanceTypeMarker</code> is the DNS type of the
     *         resource record sets that are associated with the first traffic policy
     *         instance in the next group of <code>MaxItems</code> traffic policy
     *         instances.
     *
     * @see RRType
     */
    public void setTrafficPolicyInstanceTypeMarker(RRType trafficPolicyInstanceTypeMarker) {
        this.trafficPolicyInstanceTypeMarker = trafficPolicyInstanceTypeMarker.toString();
    }
    
    /**
     * If <code>IsTruncated</code> is <code>true</code>,
     * <code>TrafficPolicyInstanceTypeMarker</code> is the DNS type of the
     * resource record sets that are associated with the first traffic policy
     * instance in the next group of <code>MaxItems</code> traffic policy
     * instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, PTR, SRV, SPF, AAAA
     *
     * @param trafficPolicyInstanceTypeMarker If <code>IsTruncated</code> is <code>true</code>,
     *         <code>TrafficPolicyInstanceTypeMarker</code> is the DNS type of the
     *         resource record sets that are associated with the first traffic policy
     *         instance in the next group of <code>MaxItems</code> traffic policy
     *         instances.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see RRType
     */
    public ListTrafficPolicyInstancesResult withTrafficPolicyInstanceTypeMarker(RRType trafficPolicyInstanceTypeMarker) {
        this.trafficPolicyInstanceTypeMarker = trafficPolicyInstanceTypeMarker.toString();
        return this;
    }

    /**
     * A flag that indicates whether there are more traffic policy instances
     * to be listed. If the response was truncated, you can get the next
     * group of <code>MaxItems</code> traffic policy instances by calling
     * <code>ListTrafficPolicyInstances</code> again and specifying the
     * values of the <code>HostedZoneIdMarker</code>,
     * <code>TrafficPolicyInstanceNameMarker</code>, and
     * <code>TrafficPolicyInstanceTypeMarker</code> elements in the
     * corresponding request parameters. <p>Valid Values: <code>true</code> |
     * <code>false</code>
     *
     * @return A flag that indicates whether there are more traffic policy instances
     *         to be listed. If the response was truncated, you can get the next
     *         group of <code>MaxItems</code> traffic policy instances by calling
     *         <code>ListTrafficPolicyInstances</code> again and specifying the
     *         values of the <code>HostedZoneIdMarker</code>,
     *         <code>TrafficPolicyInstanceNameMarker</code>, and
     *         <code>TrafficPolicyInstanceTypeMarker</code> elements in the
     *         corresponding request parameters. <p>Valid Values: <code>true</code> |
     *         <code>false</code>
     */
    public Boolean isTruncated() {
        return isTruncated;
    }
    
    /**
     * A flag that indicates whether there are more traffic policy instances
     * to be listed. If the response was truncated, you can get the next
     * group of <code>MaxItems</code> traffic policy instances by calling
     * <code>ListTrafficPolicyInstances</code> again and specifying the
     * values of the <code>HostedZoneIdMarker</code>,
     * <code>TrafficPolicyInstanceNameMarker</code>, and
     * <code>TrafficPolicyInstanceTypeMarker</code> elements in the
     * corresponding request parameters. <p>Valid Values: <code>true</code> |
     * <code>false</code>
     *
     * @param isTruncated A flag that indicates whether there are more traffic policy instances
     *         to be listed. If the response was truncated, you can get the next
     *         group of <code>MaxItems</code> traffic policy instances by calling
     *         <code>ListTrafficPolicyInstances</code> again and specifying the
     *         values of the <code>HostedZoneIdMarker</code>,
     *         <code>TrafficPolicyInstanceNameMarker</code>, and
     *         <code>TrafficPolicyInstanceTypeMarker</code> elements in the
     *         corresponding request parameters. <p>Valid Values: <code>true</code> |
     *         <code>false</code>
     */
    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }
    
    /**
     * A flag that indicates whether there are more traffic policy instances
     * to be listed. If the response was truncated, you can get the next
     * group of <code>MaxItems</code> traffic policy instances by calling
     * <code>ListTrafficPolicyInstances</code> again and specifying the
     * values of the <code>HostedZoneIdMarker</code>,
     * <code>TrafficPolicyInstanceNameMarker</code>, and
     * <code>TrafficPolicyInstanceTypeMarker</code> elements in the
     * corresponding request parameters. <p>Valid Values: <code>true</code> |
     * <code>false</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param isTruncated A flag that indicates whether there are more traffic policy instances
     *         to be listed. If the response was truncated, you can get the next
     *         group of <code>MaxItems</code> traffic policy instances by calling
     *         <code>ListTrafficPolicyInstances</code> again and specifying the
     *         values of the <code>HostedZoneIdMarker</code>,
     *         <code>TrafficPolicyInstanceNameMarker</code>, and
     *         <code>TrafficPolicyInstanceTypeMarker</code> elements in the
     *         corresponding request parameters. <p>Valid Values: <code>true</code> |
     *         <code>false</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListTrafficPolicyInstancesResult withIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    /**
     * A flag that indicates whether there are more traffic policy instances
     * to be listed. If the response was truncated, you can get the next
     * group of <code>MaxItems</code> traffic policy instances by calling
     * <code>ListTrafficPolicyInstances</code> again and specifying the
     * values of the <code>HostedZoneIdMarker</code>,
     * <code>TrafficPolicyInstanceNameMarker</code>, and
     * <code>TrafficPolicyInstanceTypeMarker</code> elements in the
     * corresponding request parameters. <p>Valid Values: <code>true</code> |
     * <code>false</code>
     *
     * @return A flag that indicates whether there are more traffic policy instances
     *         to be listed. If the response was truncated, you can get the next
     *         group of <code>MaxItems</code> traffic policy instances by calling
     *         <code>ListTrafficPolicyInstances</code> again and specifying the
     *         values of the <code>HostedZoneIdMarker</code>,
     *         <code>TrafficPolicyInstanceNameMarker</code>, and
     *         <code>TrafficPolicyInstanceTypeMarker</code> elements in the
     *         corresponding request parameters. <p>Valid Values: <code>true</code> |
     *         <code>false</code>
     */
    public Boolean getIsTruncated() {
        return isTruncated;
    }

    /**
     * The value that you specified for the <code>MaxItems</code> parameter
     * in the call to <code>ListTrafficPolicyInstances</code> that produced
     * the current response.
     *
     * @return The value that you specified for the <code>MaxItems</code> parameter
     *         in the call to <code>ListTrafficPolicyInstances</code> that produced
     *         the current response.
     */
    public String getMaxItems() {
        return maxItems;
    }
    
    /**
     * The value that you specified for the <code>MaxItems</code> parameter
     * in the call to <code>ListTrafficPolicyInstances</code> that produced
     * the current response.
     *
     * @param maxItems The value that you specified for the <code>MaxItems</code> parameter
     *         in the call to <code>ListTrafficPolicyInstances</code> that produced
     *         the current response.
     */
    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }
    
    /**
     * The value that you specified for the <code>MaxItems</code> parameter
     * in the call to <code>ListTrafficPolicyInstances</code> that produced
     * the current response.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxItems The value that you specified for the <code>MaxItems</code> parameter
     *         in the call to <code>ListTrafficPolicyInstances</code> that produced
     *         the current response.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListTrafficPolicyInstancesResult withMaxItems(String maxItems) {
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
        if (getTrafficPolicyInstances() != null) sb.append("TrafficPolicyInstances: " + getTrafficPolicyInstances() + ",");
        if (getHostedZoneIdMarker() != null) sb.append("HostedZoneIdMarker: " + getHostedZoneIdMarker() + ",");
        if (getTrafficPolicyInstanceNameMarker() != null) sb.append("TrafficPolicyInstanceNameMarker: " + getTrafficPolicyInstanceNameMarker() + ",");
        if (getTrafficPolicyInstanceTypeMarker() != null) sb.append("TrafficPolicyInstanceTypeMarker: " + getTrafficPolicyInstanceTypeMarker() + ",");
        if (isTruncated() != null) sb.append("IsTruncated: " + isTruncated() + ",");
        if (getMaxItems() != null) sb.append("MaxItems: " + getMaxItems() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTrafficPolicyInstances() == null) ? 0 : getTrafficPolicyInstances().hashCode()); 
        hashCode = prime * hashCode + ((getHostedZoneIdMarker() == null) ? 0 : getHostedZoneIdMarker().hashCode()); 
        hashCode = prime * hashCode + ((getTrafficPolicyInstanceNameMarker() == null) ? 0 : getTrafficPolicyInstanceNameMarker().hashCode()); 
        hashCode = prime * hashCode + ((getTrafficPolicyInstanceTypeMarker() == null) ? 0 : getTrafficPolicyInstanceTypeMarker().hashCode()); 
        hashCode = prime * hashCode + ((isTruncated() == null) ? 0 : isTruncated().hashCode()); 
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListTrafficPolicyInstancesResult == false) return false;
        ListTrafficPolicyInstancesResult other = (ListTrafficPolicyInstancesResult)obj;
        
        if (other.getTrafficPolicyInstances() == null ^ this.getTrafficPolicyInstances() == null) return false;
        if (other.getTrafficPolicyInstances() != null && other.getTrafficPolicyInstances().equals(this.getTrafficPolicyInstances()) == false) return false; 
        if (other.getHostedZoneIdMarker() == null ^ this.getHostedZoneIdMarker() == null) return false;
        if (other.getHostedZoneIdMarker() != null && other.getHostedZoneIdMarker().equals(this.getHostedZoneIdMarker()) == false) return false; 
        if (other.getTrafficPolicyInstanceNameMarker() == null ^ this.getTrafficPolicyInstanceNameMarker() == null) return false;
        if (other.getTrafficPolicyInstanceNameMarker() != null && other.getTrafficPolicyInstanceNameMarker().equals(this.getTrafficPolicyInstanceNameMarker()) == false) return false; 
        if (other.getTrafficPolicyInstanceTypeMarker() == null ^ this.getTrafficPolicyInstanceTypeMarker() == null) return false;
        if (other.getTrafficPolicyInstanceTypeMarker() != null && other.getTrafficPolicyInstanceTypeMarker().equals(this.getTrafficPolicyInstanceTypeMarker()) == false) return false; 
        if (other.isTruncated() == null ^ this.isTruncated() == null) return false;
        if (other.isTruncated() != null && other.isTruncated().equals(this.isTruncated()) == false) return false; 
        if (other.getMaxItems() == null ^ this.getMaxItems() == null) return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false) return false; 
        return true;
    }
    
    @Override
    public ListTrafficPolicyInstancesResult clone() {
        try {
            return (ListTrafficPolicyInstancesResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    