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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Returns the status result for a device offering.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetOfferingStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetOfferingStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * When specified, gets the offering status for the current period.
     * </p>
     */
    private java.util.Map<String, OfferingStatus> current;
    /**
     * <p>
     * When specified, gets the offering status for the next period.
     * </p>
     */
    private java.util.Map<String, OfferingStatus> nextPeriod;
    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which can be used to return the next
     * set of items in the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * When specified, gets the offering status for the current period.
     * </p>
     * 
     * @return When specified, gets the offering status for the current period.
     */

    public java.util.Map<String, OfferingStatus> getCurrent() {
        return current;
    }

    /**
     * <p>
     * When specified, gets the offering status for the current period.
     * </p>
     * 
     * @param current
     *        When specified, gets the offering status for the current period.
     */

    public void setCurrent(java.util.Map<String, OfferingStatus> current) {
        this.current = current;
    }

    /**
     * <p>
     * When specified, gets the offering status for the current period.
     * </p>
     * 
     * @param current
     *        When specified, gets the offering status for the current period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOfferingStatusResult withCurrent(java.util.Map<String, OfferingStatus> current) {
        setCurrent(current);
        return this;
    }

    public GetOfferingStatusResult addCurrentEntry(String key, OfferingStatus value) {
        if (null == this.current) {
            this.current = new java.util.HashMap<String, OfferingStatus>();
        }
        if (this.current.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.current.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Current.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOfferingStatusResult clearCurrentEntries() {
        this.current = null;
        return this;
    }

    /**
     * <p>
     * When specified, gets the offering status for the next period.
     * </p>
     * 
     * @return When specified, gets the offering status for the next period.
     */

    public java.util.Map<String, OfferingStatus> getNextPeriod() {
        return nextPeriod;
    }

    /**
     * <p>
     * When specified, gets the offering status for the next period.
     * </p>
     * 
     * @param nextPeriod
     *        When specified, gets the offering status for the next period.
     */

    public void setNextPeriod(java.util.Map<String, OfferingStatus> nextPeriod) {
        this.nextPeriod = nextPeriod;
    }

    /**
     * <p>
     * When specified, gets the offering status for the next period.
     * </p>
     * 
     * @param nextPeriod
     *        When specified, gets the offering status for the next period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOfferingStatusResult withNextPeriod(java.util.Map<String, OfferingStatus> nextPeriod) {
        setNextPeriod(nextPeriod);
        return this;
    }

    public GetOfferingStatusResult addNextPeriodEntry(String key, OfferingStatus value) {
        if (null == this.nextPeriod) {
            this.nextPeriod = new java.util.HashMap<String, OfferingStatus>();
        }
        if (this.nextPeriod.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.nextPeriod.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into NextPeriod.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOfferingStatusResult clearNextPeriodEntries() {
        this.nextPeriod = null;
        return this;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which can be used to return the next
     * set of items in the list.
     * </p>
     * 
     * @param nextToken
     *        An identifier that was returned from the previous call to this operation, which can be used to return the
     *        next set of items in the list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which can be used to return the next
     * set of items in the list.
     * </p>
     * 
     * @return An identifier that was returned from the previous call to this operation, which can be used to return the
     *         next set of items in the list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which can be used to return the next
     * set of items in the list.
     * </p>
     * 
     * @param nextToken
     *        An identifier that was returned from the previous call to this operation, which can be used to return the
     *        next set of items in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOfferingStatusResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getCurrent() != null)
            sb.append("Current: ").append(getCurrent()).append(",");
        if (getNextPeriod() != null)
            sb.append("NextPeriod: ").append(getNextPeriod()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetOfferingStatusResult == false)
            return false;
        GetOfferingStatusResult other = (GetOfferingStatusResult) obj;
        if (other.getCurrent() == null ^ this.getCurrent() == null)
            return false;
        if (other.getCurrent() != null && other.getCurrent().equals(this.getCurrent()) == false)
            return false;
        if (other.getNextPeriod() == null ^ this.getNextPeriod() == null)
            return false;
        if (other.getNextPeriod() != null && other.getNextPeriod().equals(this.getNextPeriod()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCurrent() == null) ? 0 : getCurrent().hashCode());
        hashCode = prime * hashCode + ((getNextPeriod() == null) ? 0 : getNextPeriod().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetOfferingStatusResult clone() {
        try {
            return (GetOfferingStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
