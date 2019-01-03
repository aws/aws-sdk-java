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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Results message indicating whether a CNAME is available.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/CheckDNSAvailability"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CheckDNSAvailabilityRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The prefix used when this CNAME is reserved.
     * </p>
     */
    private String cNAMEPrefix;

    /**
     * Default constructor for CheckDNSAvailabilityRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public CheckDNSAvailabilityRequest() {
    }

    /**
     * Constructs a new CheckDNSAvailabilityRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param cNAMEPrefix
     *        The prefix used when this CNAME is reserved.
     */
    public CheckDNSAvailabilityRequest(String cNAMEPrefix) {
        setCNAMEPrefix(cNAMEPrefix);
    }

    /**
     * <p>
     * The prefix used when this CNAME is reserved.
     * </p>
     * 
     * @param cNAMEPrefix
     *        The prefix used when this CNAME is reserved.
     */

    public void setCNAMEPrefix(String cNAMEPrefix) {
        this.cNAMEPrefix = cNAMEPrefix;
    }

    /**
     * <p>
     * The prefix used when this CNAME is reserved.
     * </p>
     * 
     * @return The prefix used when this CNAME is reserved.
     */

    public String getCNAMEPrefix() {
        return this.cNAMEPrefix;
    }

    /**
     * <p>
     * The prefix used when this CNAME is reserved.
     * </p>
     * 
     * @param cNAMEPrefix
     *        The prefix used when this CNAME is reserved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CheckDNSAvailabilityRequest withCNAMEPrefix(String cNAMEPrefix) {
        setCNAMEPrefix(cNAMEPrefix);
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
        if (getCNAMEPrefix() != null)
            sb.append("CNAMEPrefix: ").append(getCNAMEPrefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CheckDNSAvailabilityRequest == false)
            return false;
        CheckDNSAvailabilityRequest other = (CheckDNSAvailabilityRequest) obj;
        if (other.getCNAMEPrefix() == null ^ this.getCNAMEPrefix() == null)
            return false;
        if (other.getCNAMEPrefix() != null && other.getCNAMEPrefix().equals(this.getCNAMEPrefix()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCNAMEPrefix() == null) ? 0 : getCNAMEPrefix().hashCode());
        return hashCode;
    }

    @Override
    public CheckDNSAvailabilityRequest clone() {
        return (CheckDNSAvailabilityRequest) super.clone();
    }

}
