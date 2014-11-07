/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container for the parameters to the {@link com.amazonaws.services.route53.AmazonRoute53#createReusableDelegationSet(CreateReusableDelegationSetRequest) CreateReusableDelegationSet operation}.
 * <p>
 * This action creates a reusable delegationSet.
 * </p>
 * <p>
 * To create a new reusable delegationSet, send a <code>POST</code>
 * request to the <code>2013-04-01/delegationset</code> resource. The
 * request body must include an XML document with a
 * <code>CreateReusableDelegationSetRequest</code> element. The response
 * returns the <code>CreateReusableDelegationSetResponse</code> element
 * that contains metadata about the delegationSet.
 * </p>
 * <p>
 * If the optional parameter HostedZoneId is specified, it marks the
 * delegationSet associated with that particular hosted zone as reusable.
 * </p>
 *
 * @see com.amazonaws.services.route53.AmazonRoute53#createReusableDelegationSet(CreateReusableDelegationSetRequest)
 */
public class CreateReusableDelegationSetRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * A unique string that identifies the request and that allows failed
     * <code>CreateReusableDelegationSet</code> requests to be retried
     * without the risk of executing the operation twice. You must use a
     * unique <code>CallerReference</code> string every time you create a
     * reusable delegation set. <code>CallerReference</code> can be any
     * unique string; you might choose to use a string that identifies your
     * project, such as <code>DNSMigration_01</code>. <p>Valid characters are
     * any Unicode code points that are legal in an XML 1.0 document. The
     * UTF-8 encoding of the value must be less than 128 bytes.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String callerReference;

    /**
     * The ID of the hosted zone whose delegation set you want to mark as
     * reusable. It is an optional parameter.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     */
    private String hostedZoneId;

    /**
     * A unique string that identifies the request and that allows failed
     * <code>CreateReusableDelegationSet</code> requests to be retried
     * without the risk of executing the operation twice. You must use a
     * unique <code>CallerReference</code> string every time you create a
     * reusable delegation set. <code>CallerReference</code> can be any
     * unique string; you might choose to use a string that identifies your
     * project, such as <code>DNSMigration_01</code>. <p>Valid characters are
     * any Unicode code points that are legal in an XML 1.0 document. The
     * UTF-8 encoding of the value must be less than 128 bytes.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return A unique string that identifies the request and that allows failed
     *         <code>CreateReusableDelegationSet</code> requests to be retried
     *         without the risk of executing the operation twice. You must use a
     *         unique <code>CallerReference</code> string every time you create a
     *         reusable delegation set. <code>CallerReference</code> can be any
     *         unique string; you might choose to use a string that identifies your
     *         project, such as <code>DNSMigration_01</code>. <p>Valid characters are
     *         any Unicode code points that are legal in an XML 1.0 document. The
     *         UTF-8 encoding of the value must be less than 128 bytes.
     */
    public String getCallerReference() {
        return callerReference;
    }
    
    /**
     * A unique string that identifies the request and that allows failed
     * <code>CreateReusableDelegationSet</code> requests to be retried
     * without the risk of executing the operation twice. You must use a
     * unique <code>CallerReference</code> string every time you create a
     * reusable delegation set. <code>CallerReference</code> can be any
     * unique string; you might choose to use a string that identifies your
     * project, such as <code>DNSMigration_01</code>. <p>Valid characters are
     * any Unicode code points that are legal in an XML 1.0 document. The
     * UTF-8 encoding of the value must be less than 128 bytes.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param callerReference A unique string that identifies the request and that allows failed
     *         <code>CreateReusableDelegationSet</code> requests to be retried
     *         without the risk of executing the operation twice. You must use a
     *         unique <code>CallerReference</code> string every time you create a
     *         reusable delegation set. <code>CallerReference</code> can be any
     *         unique string; you might choose to use a string that identifies your
     *         project, such as <code>DNSMigration_01</code>. <p>Valid characters are
     *         any Unicode code points that are legal in an XML 1.0 document. The
     *         UTF-8 encoding of the value must be less than 128 bytes.
     */
    public void setCallerReference(String callerReference) {
        this.callerReference = callerReference;
    }
    
    /**
     * A unique string that identifies the request and that allows failed
     * <code>CreateReusableDelegationSet</code> requests to be retried
     * without the risk of executing the operation twice. You must use a
     * unique <code>CallerReference</code> string every time you create a
     * reusable delegation set. <code>CallerReference</code> can be any
     * unique string; you might choose to use a string that identifies your
     * project, such as <code>DNSMigration_01</code>. <p>Valid characters are
     * any Unicode code points that are legal in an XML 1.0 document. The
     * UTF-8 encoding of the value must be less than 128 bytes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param callerReference A unique string that identifies the request and that allows failed
     *         <code>CreateReusableDelegationSet</code> requests to be retried
     *         without the risk of executing the operation twice. You must use a
     *         unique <code>CallerReference</code> string every time you create a
     *         reusable delegation set. <code>CallerReference</code> can be any
     *         unique string; you might choose to use a string that identifies your
     *         project, such as <code>DNSMigration_01</code>. <p>Valid characters are
     *         any Unicode code points that are legal in an XML 1.0 document. The
     *         UTF-8 encoding of the value must be less than 128 bytes.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateReusableDelegationSetRequest withCallerReference(String callerReference) {
        this.callerReference = callerReference;
        return this;
    }

    /**
     * The ID of the hosted zone whose delegation set you want to mark as
     * reusable. It is an optional parameter.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     *
     * @return The ID of the hosted zone whose delegation set you want to mark as
     *         reusable. It is an optional parameter.
     */
    public String getHostedZoneId() {
        return hostedZoneId;
    }
    
    /**
     * The ID of the hosted zone whose delegation set you want to mark as
     * reusable. It is an optional parameter.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     *
     * @param hostedZoneId The ID of the hosted zone whose delegation set you want to mark as
     *         reusable. It is an optional parameter.
     */
    public void setHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
    }
    
    /**
     * The ID of the hosted zone whose delegation set you want to mark as
     * reusable. It is an optional parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     *
     * @param hostedZoneId The ID of the hosted zone whose delegation set you want to mark as
     *         reusable. It is an optional parameter.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateReusableDelegationSetRequest withHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
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
        if (getCallerReference() != null) sb.append("CallerReference: " + getCallerReference() + ",");
        if (getHostedZoneId() != null) sb.append("HostedZoneId: " + getHostedZoneId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCallerReference() == null) ? 0 : getCallerReference().hashCode()); 
        hashCode = prime * hashCode + ((getHostedZoneId() == null) ? 0 : getHostedZoneId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateReusableDelegationSetRequest == false) return false;
        CreateReusableDelegationSetRequest other = (CreateReusableDelegationSetRequest)obj;
        
        if (other.getCallerReference() == null ^ this.getCallerReference() == null) return false;
        if (other.getCallerReference() != null && other.getCallerReference().equals(this.getCallerReference()) == false) return false; 
        if (other.getHostedZoneId() == null ^ this.getHostedZoneId() == null) return false;
        if (other.getHostedZoneId() != null && other.getHostedZoneId().equals(this.getHostedZoneId()) == false) return false; 
        return true;
    }
    
}
    