/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalk#checkDNSAvailability(CheckDNSAvailabilityRequest) CheckDNSAvailability operation}.
 * <p>
 * Checks if the specified CNAME is available.
 * </p>
 *
 * @see com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalk#checkDNSAvailability(CheckDNSAvailabilityRequest)
 */
public class CheckDNSAvailabilityRequest extends AmazonWebServiceRequest {

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
        this.cNAMEPrefix = cNAMEPrefix;
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
        sb.append("CNAMEPrefix: " + cNAMEPrefix + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    