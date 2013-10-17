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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.route53.AmazonRoute53#changeResourceRecordSets(ChangeResourceRecordSetsRequest) ChangeResourceRecordSets operation}.
 * <p>
 * Use this action to create or change your authoritative DNS information. To use this action, send a <code>POST</code> request to the
 * <code>2012-12-12/hostedzone/hosted Zone ID/rrset</code> resource. The request body must include an XML document with a
 * <code>ChangeResourceRecordSetsRequest</code> element.
 * </p>
 * <p>
 * Changes are a list of change items and are considered transactional. For more information on transactional changes, also known as change batches, see
 * <a href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/RRSchanges.html#RRSchanges_API"> Creating, Changing, and Deleting Resource Record
 * Sets Using the Route 53 API </a> in the <i>Amazon Route 53 Developer Guide</i> .
 * </p>
 * <p>
 * <b>IMPORTANT:</b>Due to the nature of transactional changes, you cannot delete the same resource record set more than once in a single change batch.
 * If you attempt to delete the same change batch more than once, Route 53 returns an InvalidChangeBatch error.
 * </p>
 * <p>
 * In response to a <code>ChangeResourceRecordSets</code> request, your DNS data is changed on all Route 53 DNS servers. Initially, the status of a
 * change is <code>PENDING</code> . This means the change has not yet propagated to all the authoritative Route 53 DNS servers. When the change is
 * propagated to all hosts, the change returns a status of <code>INSYNC</code> .
 * </p>
 * <p>
 * Note the following limitations on a <code>ChangeResourceRecordSets</code> request:
 * </p>
 * <p>
 * - A request cannot contain more than 100 Change elements.
 * </p>
 * <p>
 * - A request cannot contain more than 1000 ResourceRecord elements.
 * </p>
 * <p>
 * The sum of the number of characters (including spaces) in all <code>Value</code> elements in a request cannot exceed 32,000 characters.
 * </p>
 *
 * @see com.amazonaws.services.route53.AmazonRoute53#changeResourceRecordSets(ChangeResourceRecordSetsRequest)
 */
public class ChangeResourceRecordSetsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * <i>Alias resource record sets only:</i> The value of the hosted zone
     * ID for the AWS resource. <p>For more information, an example, and
     * several ways to get the hosted zone ID for the LoadBalancer, see <a
     * href="http://docs.amazonwebservices.com/Route53/latest/DeveloperGuide/CreatingAliasRRSets.html">Creating
     * Alias Resource Record Sets for Elastic Load Balancing</a> in the
     * <i>Amazon Route 53 Developer Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     */
    private String hostedZoneId;

    /**
     * A complex type that contains an optional comment and the
     * <code>Changes</code> element.
     */
    private ChangeBatch changeBatch;

    /**
     * Default constructor for a new ChangeResourceRecordSetsRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ChangeResourceRecordSetsRequest() {}
    
    /**
     * Constructs a new ChangeResourceRecordSetsRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param hostedZoneId <i>Alias resource record sets only:</i> The value
     * of the hosted zone ID for the AWS resource. <p>For more information,
     * an example, and several ways to get the hosted zone ID for the
     * LoadBalancer, see <a
     * href="http://docs.amazonwebservices.com/Route53/latest/DeveloperGuide/CreatingAliasRRSets.html">Creating
     * Alias Resource Record Sets for Elastic Load Balancing</a> in the
     * <i>Amazon Route 53 Developer Guide</i>.
     * @param changeBatch A complex type that contains an optional comment
     * and the <code>Changes</code> element.
     */
    public ChangeResourceRecordSetsRequest(String hostedZoneId, ChangeBatch changeBatch) {
        setHostedZoneId(hostedZoneId);
        setChangeBatch(changeBatch);
    }

    /**
     * <i>Alias resource record sets only:</i> The value of the hosted zone
     * ID for the AWS resource. <p>For more information, an example, and
     * several ways to get the hosted zone ID for the LoadBalancer, see <a
     * href="http://docs.amazonwebservices.com/Route53/latest/DeveloperGuide/CreatingAliasRRSets.html">Creating
     * Alias Resource Record Sets for Elastic Load Balancing</a> in the
     * <i>Amazon Route 53 Developer Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     *
     * @return <i>Alias resource record sets only:</i> The value of the hosted zone
     *         ID for the AWS resource. <p>For more information, an example, and
     *         several ways to get the hosted zone ID for the LoadBalancer, see <a
     *         href="http://docs.amazonwebservices.com/Route53/latest/DeveloperGuide/CreatingAliasRRSets.html">Creating
     *         Alias Resource Record Sets for Elastic Load Balancing</a> in the
     *         <i>Amazon Route 53 Developer Guide</i>.
     */
    public String getHostedZoneId() {
        return hostedZoneId;
    }
    
    /**
     * <i>Alias resource record sets only:</i> The value of the hosted zone
     * ID for the AWS resource. <p>For more information, an example, and
     * several ways to get the hosted zone ID for the LoadBalancer, see <a
     * href="http://docs.amazonwebservices.com/Route53/latest/DeveloperGuide/CreatingAliasRRSets.html">Creating
     * Alias Resource Record Sets for Elastic Load Balancing</a> in the
     * <i>Amazon Route 53 Developer Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     *
     * @param hostedZoneId <i>Alias resource record sets only:</i> The value of the hosted zone
     *         ID for the AWS resource. <p>For more information, an example, and
     *         several ways to get the hosted zone ID for the LoadBalancer, see <a
     *         href="http://docs.amazonwebservices.com/Route53/latest/DeveloperGuide/CreatingAliasRRSets.html">Creating
     *         Alias Resource Record Sets for Elastic Load Balancing</a> in the
     *         <i>Amazon Route 53 Developer Guide</i>.
     */
    public void setHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
    }
    
    /**
     * <i>Alias resource record sets only:</i> The value of the hosted zone
     * ID for the AWS resource. <p>For more information, an example, and
     * several ways to get the hosted zone ID for the LoadBalancer, see <a
     * href="http://docs.amazonwebservices.com/Route53/latest/DeveloperGuide/CreatingAliasRRSets.html">Creating
     * Alias Resource Record Sets for Elastic Load Balancing</a> in the
     * <i>Amazon Route 53 Developer Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     *
     * @param hostedZoneId <i>Alias resource record sets only:</i> The value of the hosted zone
     *         ID for the AWS resource. <p>For more information, an example, and
     *         several ways to get the hosted zone ID for the LoadBalancer, see <a
     *         href="http://docs.amazonwebservices.com/Route53/latest/DeveloperGuide/CreatingAliasRRSets.html">Creating
     *         Alias Resource Record Sets for Elastic Load Balancing</a> in the
     *         <i>Amazon Route 53 Developer Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ChangeResourceRecordSetsRequest withHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
        return this;
    }

    /**
     * A complex type that contains an optional comment and the
     * <code>Changes</code> element.
     *
     * @return A complex type that contains an optional comment and the
     *         <code>Changes</code> element.
     */
    public ChangeBatch getChangeBatch() {
        return changeBatch;
    }
    
    /**
     * A complex type that contains an optional comment and the
     * <code>Changes</code> element.
     *
     * @param changeBatch A complex type that contains an optional comment and the
     *         <code>Changes</code> element.
     */
    public void setChangeBatch(ChangeBatch changeBatch) {
        this.changeBatch = changeBatch;
    }
    
    /**
     * A complex type that contains an optional comment and the
     * <code>Changes</code> element.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param changeBatch A complex type that contains an optional comment and the
     *         <code>Changes</code> element.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ChangeResourceRecordSetsRequest withChangeBatch(ChangeBatch changeBatch) {
        this.changeBatch = changeBatch;
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
        if (getHostedZoneId() != null) sb.append("HostedZoneId: " + getHostedZoneId() + ",");
        if (getChangeBatch() != null) sb.append("ChangeBatch: " + getChangeBatch() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getHostedZoneId() == null) ? 0 : getHostedZoneId().hashCode()); 
        hashCode = prime * hashCode + ((getChangeBatch() == null) ? 0 : getChangeBatch().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ChangeResourceRecordSetsRequest == false) return false;
        ChangeResourceRecordSetsRequest other = (ChangeResourceRecordSetsRequest)obj;
        
        if (other.getHostedZoneId() == null ^ this.getHostedZoneId() == null) return false;
        if (other.getHostedZoneId() != null && other.getHostedZoneId().equals(this.getHostedZoneId()) == false) return false; 
        if (other.getChangeBatch() == null ^ this.getChangeBatch() == null) return false;
        if (other.getChangeBatch() != null && other.getChangeBatch().equals(this.getChangeBatch()) == false) return false; 
        return true;
    }
    
}
    