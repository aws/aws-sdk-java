/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.route53.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The input for a GetHostedZone request.
 * </p>
 */
public class GetHostedZoneRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the hosted zone for which you want to get a list of the name servers in the delegation set.
     * </p>
     */
    private String id;

    /**
     * Default constructor for GetHostedZoneRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public GetHostedZoneRequest() {
    }

    /**
     * Constructs a new GetHostedZoneRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param id
     *        The ID of the hosted zone for which you want to get a list of the name servers in the delegation set.
     */
    public GetHostedZoneRequest(String id) {
        setId(id);
    }

    /**
     * <p>
     * The ID of the hosted zone for which you want to get a list of the name servers in the delegation set.
     * </p>
     * 
     * @param id
     *        The ID of the hosted zone for which you want to get a list of the name servers in the delegation set.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the hosted zone for which you want to get a list of the name servers in the delegation set.
     * </p>
     * 
     * @return The ID of the hosted zone for which you want to get a list of the name servers in the delegation set.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the hosted zone for which you want to get a list of the name servers in the delegation set.
     * </p>
     * 
     * @param id
     *        The ID of the hosted zone for which you want to get a list of the name servers in the delegation set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetHostedZoneRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getId() != null)
            sb.append("Id: " + getId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetHostedZoneRequest == false)
            return false;
        GetHostedZoneRequest other = (GetHostedZoneRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        return hashCode;
    }

    @Override
    public GetHostedZoneRequest clone() {
        return (GetHostedZoneRequest) super.clone();
    }
}
