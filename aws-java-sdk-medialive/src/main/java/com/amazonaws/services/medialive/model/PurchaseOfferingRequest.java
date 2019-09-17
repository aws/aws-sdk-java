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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Placeholder documentation for PurchaseOfferingRequest
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/PurchaseOffering" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PurchaseOfferingRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** Number of resources */
    private Integer count;
    /** Name for the new reservation */
    private String name;
    /** Offering to purchase, e.g. '87654321' */
    private String offeringId;
    /** Unique request ID to be specified. This is needed to prevent retries from creating multiple resources. */
    private String requestId;
    /**
     * Requested reservation start time (UTC) in ISO-8601 format. The specified time must be between the first day of
     * the current month and one year from now. If no value is given, the default is now.
     */
    private String start;
    /** A collection of key-value pairs */
    private java.util.Map<String, String> tags;

    /**
     * Number of resources
     * 
     * @param count
     *        Number of resources
     */

    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * Number of resources
     * 
     * @return Number of resources
     */

    public Integer getCount() {
        return this.count;
    }

    /**
     * Number of resources
     * 
     * @param count
     *        Number of resources
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PurchaseOfferingRequest withCount(Integer count) {
        setCount(count);
        return this;
    }

    /**
     * Name for the new reservation
     * 
     * @param name
     *        Name for the new reservation
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Name for the new reservation
     * 
     * @return Name for the new reservation
     */

    public String getName() {
        return this.name;
    }

    /**
     * Name for the new reservation
     * 
     * @param name
     *        Name for the new reservation
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PurchaseOfferingRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * Offering to purchase, e.g. '87654321'
     * 
     * @param offeringId
     *        Offering to purchase, e.g. '87654321'
     */

    public void setOfferingId(String offeringId) {
        this.offeringId = offeringId;
    }

    /**
     * Offering to purchase, e.g. '87654321'
     * 
     * @return Offering to purchase, e.g. '87654321'
     */

    public String getOfferingId() {
        return this.offeringId;
    }

    /**
     * Offering to purchase, e.g. '87654321'
     * 
     * @param offeringId
     *        Offering to purchase, e.g. '87654321'
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PurchaseOfferingRequest withOfferingId(String offeringId) {
        setOfferingId(offeringId);
        return this;
    }

    /**
     * Unique request ID to be specified. This is needed to prevent retries from creating multiple resources.
     * 
     * @param requestId
     *        Unique request ID to be specified. This is needed to prevent retries from creating multiple resources.
     */

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * Unique request ID to be specified. This is needed to prevent retries from creating multiple resources.
     * 
     * @return Unique request ID to be specified. This is needed to prevent retries from creating multiple resources.
     */

    public String getRequestId() {
        return this.requestId;
    }

    /**
     * Unique request ID to be specified. This is needed to prevent retries from creating multiple resources.
     * 
     * @param requestId
     *        Unique request ID to be specified. This is needed to prevent retries from creating multiple resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PurchaseOfferingRequest withRequestId(String requestId) {
        setRequestId(requestId);
        return this;
    }

    /**
     * Requested reservation start time (UTC) in ISO-8601 format. The specified time must be between the first day of
     * the current month and one year from now. If no value is given, the default is now.
     * 
     * @param start
     *        Requested reservation start time (UTC) in ISO-8601 format. The specified time must be between the first
     *        day of the current month and one year from now. If no value is given, the default is now.
     */

    public void setStart(String start) {
        this.start = start;
    }

    /**
     * Requested reservation start time (UTC) in ISO-8601 format. The specified time must be between the first day of
     * the current month and one year from now. If no value is given, the default is now.
     * 
     * @return Requested reservation start time (UTC) in ISO-8601 format. The specified time must be between the first
     *         day of the current month and one year from now. If no value is given, the default is now.
     */

    public String getStart() {
        return this.start;
    }

    /**
     * Requested reservation start time (UTC) in ISO-8601 format. The specified time must be between the first day of
     * the current month and one year from now. If no value is given, the default is now.
     * 
     * @param start
     *        Requested reservation start time (UTC) in ISO-8601 format. The specified time must be between the first
     *        day of the current month and one year from now. If no value is given, the default is now.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PurchaseOfferingRequest withStart(String start) {
        setStart(start);
        return this;
    }

    /**
     * A collection of key-value pairs
     * 
     * @return A collection of key-value pairs
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * A collection of key-value pairs
     * 
     * @param tags
     *        A collection of key-value pairs
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * A collection of key-value pairs
     * 
     * @param tags
     *        A collection of key-value pairs
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PurchaseOfferingRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    public PurchaseOfferingRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PurchaseOfferingRequest clearTagsEntries() {
        this.tags = null;
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
        if (getCount() != null)
            sb.append("Count: ").append(getCount()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getOfferingId() != null)
            sb.append("OfferingId: ").append(getOfferingId()).append(",");
        if (getRequestId() != null)
            sb.append("RequestId: ").append(getRequestId()).append(",");
        if (getStart() != null)
            sb.append("Start: ").append(getStart()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PurchaseOfferingRequest == false)
            return false;
        PurchaseOfferingRequest other = (PurchaseOfferingRequest) obj;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOfferingId() == null ^ this.getOfferingId() == null)
            return false;
        if (other.getOfferingId() != null && other.getOfferingId().equals(this.getOfferingId()) == false)
            return false;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        if (other.getStart() == null ^ this.getStart() == null)
            return false;
        if (other.getStart() != null && other.getStart().equals(this.getStart()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOfferingId() == null) ? 0 : getOfferingId().hashCode());
        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        hashCode = prime * hashCode + ((getStart() == null) ? 0 : getStart().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public PurchaseOfferingRequest clone() {
        return (PurchaseOfferingRequest) super.clone();
    }

}
