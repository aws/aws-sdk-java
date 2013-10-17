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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalk#checkDNSAvailability(CheckDNSAvailabilityRequest) CheckDNSAvailability operation}.
 * <p>
 * Checks if the specified CNAME is available.
 * </p>
 *
 * @see com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalk#checkDNSAvailability(CheckDNSAvailabilityRequest)
 */
public class CheckDNSAvailabilityRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The prefix used when this CNAME is reserved.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 63<br/>
     */
    private String cNAMEPrefix;

    /**
     * Default constructor for a new CheckDNSAvailabilityRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CheckDNSAvailabilityRequest() {}
    
    /**
     * Constructs a new CheckDNSAvailabilityRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param cNAMEPrefix The prefix used when this CNAME is reserved.
     */
    public CheckDNSAvailabilityRequest(String cNAMEPrefix) {
        setCNAMEPrefix(cNAMEPrefix);
    }

    /**
     * The prefix used when this CNAME is reserved.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 63<br/>
     *
     * @return The prefix used when this CNAME is reserved.
     */
    public String getCNAMEPrefix() {
        return cNAMEPrefix;
    }
    
    /**
     * The prefix used when this CNAME is reserved.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 63<br/>
     *
     * @param cNAMEPrefix The prefix used when this CNAME is reserved.
     */
    public void setCNAMEPrefix(String cNAMEPrefix) {
        this.cNAMEPrefix = cNAMEPrefix;
    }
    
    /**
     * The prefix used when this CNAME is reserved.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 63<br/>
     *
     * @param cNAMEPrefix The prefix used when this CNAME is reserved.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CheckDNSAvailabilityRequest withCNAMEPrefix(String cNAMEPrefix) {
        this.cNAMEPrefix = cNAMEPrefix;
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
        if (getCNAMEPrefix() != null) sb.append("CNAMEPrefix: " + getCNAMEPrefix() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCNAMEPrefix() == null) ? 0 : getCNAMEPrefix().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CheckDNSAvailabilityRequest == false) return false;
        CheckDNSAvailabilityRequest other = (CheckDNSAvailabilityRequest)obj;
        
        if (other.getCNAMEPrefix() == null ^ this.getCNAMEPrefix() == null) return false;
        if (other.getCNAMEPrefix() != null && other.getCNAMEPrefix().equals(this.getCNAMEPrefix()) == false) return false; 
        return true;
    }
    
}
    