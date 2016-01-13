/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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
 * A complex type that contains information about the resource record sets that
 * are returned by the request and information about the response.
 * </p>
 */
public class ListResourceRecordSetsResult implements Serializable, Cloneable {

    /**
     * <p>
     * A complex type that contains information about the resource record sets
     * that are returned by the request.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ResourceRecordSet> resourceRecordSets;
    /**
     * <p>
     * A flag that indicates whether there are more resource record sets to be
     * listed. If your results were truncated, you can make a follow-up request
     * for the next page of results by using the
     * <a>ListResourceRecordSetsResponse$NextRecordName</a> element.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     */
    private Boolean isTruncated;
    /**
     * <p>
     * If the results were truncated, the name of the next record in the list.
     * This element is present only if
     * <a>ListResourceRecordSetsResponse$IsTruncated</a> is true.
     * </p>
     */
    private String nextRecordName;
    /**
     * <p>
     * If the results were truncated, the type of the next record in the list.
     * This element is present only if
     * <a>ListResourceRecordSetsResponse$IsTruncated</a> is true.
     * </p>
     */
    private String nextRecordType;
    /**
     * <p>
     * <i>Weighted resource record sets only:</i> If results were truncated for
     * a given DNS name and type, the value of <code>SetIdentifier</code> for
     * the next resource record set that has the current DNS name and type.
     * </p>
     */
    private String nextRecordIdentifier;
    /**
     * <p>
     * The maximum number of records you requested. The maximum value of
     * <code>MaxItems</code> is 100.
     * </p>
     */
    private String maxItems;

    /**
     * <p>
     * A complex type that contains information about the resource record sets
     * that are returned by the request.
     * </p>
     * 
     * @return A complex type that contains information about the resource
     *         record sets that are returned by the request.
     */
    public java.util.List<ResourceRecordSet> getResourceRecordSets() {
        if (resourceRecordSets == null) {
            resourceRecordSets = new com.amazonaws.internal.SdkInternalList<ResourceRecordSet>();
        }
        return resourceRecordSets;
    }

    /**
     * <p>
     * A complex type that contains information about the resource record sets
     * that are returned by the request.
     * </p>
     * 
     * @param resourceRecordSets
     *        A complex type that contains information about the resource record
     *        sets that are returned by the request.
     */
    public void setResourceRecordSets(
            java.util.Collection<ResourceRecordSet> resourceRecordSets) {
        if (resourceRecordSets == null) {
            this.resourceRecordSets = null;
            return;
        }

        this.resourceRecordSets = new com.amazonaws.internal.SdkInternalList<ResourceRecordSet>(
                resourceRecordSets);
    }

    /**
     * <p>
     * A complex type that contains information about the resource record sets
     * that are returned by the request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setResourceRecordSets(java.util.Collection)} or
     * {@link #withResourceRecordSets(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceRecordSets
     *        A complex type that contains information about the resource record
     *        sets that are returned by the request.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ListResourceRecordSetsResult withResourceRecordSets(
            ResourceRecordSet... resourceRecordSets) {
        if (this.resourceRecordSets == null) {
            setResourceRecordSets(new com.amazonaws.internal.SdkInternalList<ResourceRecordSet>(
                    resourceRecordSets.length));
        }
        for (ResourceRecordSet ele : resourceRecordSets) {
            this.resourceRecordSets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A complex type that contains information about the resource record sets
     * that are returned by the request.
     * </p>
     * 
     * @param resourceRecordSets
     *        A complex type that contains information about the resource record
     *        sets that are returned by the request.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ListResourceRecordSetsResult withResourceRecordSets(
            java.util.Collection<ResourceRecordSet> resourceRecordSets) {
        setResourceRecordSets(resourceRecordSets);
        return this;
    }

    /**
     * <p>
     * A flag that indicates whether there are more resource record sets to be
     * listed. If your results were truncated, you can make a follow-up request
     * for the next page of results by using the
     * <a>ListResourceRecordSetsResponse$NextRecordName</a> element.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @param isTruncated
     *        A flag that indicates whether there are more resource record sets
     *        to be listed. If your results were truncated, you can make a
     *        follow-up request for the next page of results by using the
     *        <a>ListResourceRecordSetsResponse$NextRecordName</a> element.</p>
     *        <p>
     *        Valid Values: <code>true</code> | <code>false</code>
     */
    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }

    /**
     * <p>
     * A flag that indicates whether there are more resource record sets to be
     * listed. If your results were truncated, you can make a follow-up request
     * for the next page of results by using the
     * <a>ListResourceRecordSetsResponse$NextRecordName</a> element.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @return A flag that indicates whether there are more resource record sets
     *         to be listed. If your results were truncated, you can make a
     *         follow-up request for the next page of results by using the
     *         <a>ListResourceRecordSetsResponse$NextRecordName</a> element.</p>
     *         <p>
     *         Valid Values: <code>true</code> | <code>false</code>
     */
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    /**
     * <p>
     * A flag that indicates whether there are more resource record sets to be
     * listed. If your results were truncated, you can make a follow-up request
     * for the next page of results by using the
     * <a>ListResourceRecordSetsResponse$NextRecordName</a> element.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @param isTruncated
     *        A flag that indicates whether there are more resource record sets
     *        to be listed. If your results were truncated, you can make a
     *        follow-up request for the next page of results by using the
     *        <a>ListResourceRecordSetsResponse$NextRecordName</a> element.</p>
     *        <p>
     *        Valid Values: <code>true</code> | <code>false</code>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ListResourceRecordSetsResult withIsTruncated(Boolean isTruncated) {
        setIsTruncated(isTruncated);
        return this;
    }

    /**
     * <p>
     * A flag that indicates whether there are more resource record sets to be
     * listed. If your results were truncated, you can make a follow-up request
     * for the next page of results by using the
     * <a>ListResourceRecordSetsResponse$NextRecordName</a> element.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @return A flag that indicates whether there are more resource record sets
     *         to be listed. If your results were truncated, you can make a
     *         follow-up request for the next page of results by using the
     *         <a>ListResourceRecordSetsResponse$NextRecordName</a> element.</p>
     *         <p>
     *         Valid Values: <code>true</code> | <code>false</code>
     */
    public Boolean isTruncated() {
        return this.isTruncated;
    }

    /**
     * <p>
     * If the results were truncated, the name of the next record in the list.
     * This element is present only if
     * <a>ListResourceRecordSetsResponse$IsTruncated</a> is true.
     * </p>
     * 
     * @param nextRecordName
     *        If the results were truncated, the name of the next record in the
     *        list. This element is present only if
     *        <a>ListResourceRecordSetsResponse$IsTruncated</a> is true.
     */
    public void setNextRecordName(String nextRecordName) {
        this.nextRecordName = nextRecordName;
    }

    /**
     * <p>
     * If the results were truncated, the name of the next record in the list.
     * This element is present only if
     * <a>ListResourceRecordSetsResponse$IsTruncated</a> is true.
     * </p>
     * 
     * @return If the results were truncated, the name of the next record in the
     *         list. This element is present only if
     *         <a>ListResourceRecordSetsResponse$IsTruncated</a> is true.
     */
    public String getNextRecordName() {
        return this.nextRecordName;
    }

    /**
     * <p>
     * If the results were truncated, the name of the next record in the list.
     * This element is present only if
     * <a>ListResourceRecordSetsResponse$IsTruncated</a> is true.
     * </p>
     * 
     * @param nextRecordName
     *        If the results were truncated, the name of the next record in the
     *        list. This element is present only if
     *        <a>ListResourceRecordSetsResponse$IsTruncated</a> is true.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ListResourceRecordSetsResult withNextRecordName(String nextRecordName) {
        setNextRecordName(nextRecordName);
        return this;
    }

    /**
     * <p>
     * If the results were truncated, the type of the next record in the list.
     * This element is present only if
     * <a>ListResourceRecordSetsResponse$IsTruncated</a> is true.
     * </p>
     * 
     * @param nextRecordType
     *        If the results were truncated, the type of the next record in the
     *        list. This element is present only if
     *        <a>ListResourceRecordSetsResponse$IsTruncated</a> is true.
     * @see RRType
     */
    public void setNextRecordType(String nextRecordType) {
        this.nextRecordType = nextRecordType;
    }

    /**
     * <p>
     * If the results were truncated, the type of the next record in the list.
     * This element is present only if
     * <a>ListResourceRecordSetsResponse$IsTruncated</a> is true.
     * </p>
     * 
     * @return If the results were truncated, the type of the next record in the
     *         list. This element is present only if
     *         <a>ListResourceRecordSetsResponse$IsTruncated</a> is true.
     * @see RRType
     */
    public String getNextRecordType() {
        return this.nextRecordType;
    }

    /**
     * <p>
     * If the results were truncated, the type of the next record in the list.
     * This element is present only if
     * <a>ListResourceRecordSetsResponse$IsTruncated</a> is true.
     * </p>
     * 
     * @param nextRecordType
     *        If the results were truncated, the type of the next record in the
     *        list. This element is present only if
     *        <a>ListResourceRecordSetsResponse$IsTruncated</a> is true.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see RRType
     */
    public ListResourceRecordSetsResult withNextRecordType(String nextRecordType) {
        setNextRecordType(nextRecordType);
        return this;
    }

    /**
     * <p>
     * If the results were truncated, the type of the next record in the list.
     * This element is present only if
     * <a>ListResourceRecordSetsResponse$IsTruncated</a> is true.
     * </p>
     * 
     * @param nextRecordType
     *        If the results were truncated, the type of the next record in the
     *        list. This element is present only if
     *        <a>ListResourceRecordSetsResponse$IsTruncated</a> is true.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see RRType
     */
    public void setNextRecordType(RRType nextRecordType) {
        this.nextRecordType = nextRecordType.toString();
    }

    /**
     * <p>
     * If the results were truncated, the type of the next record in the list.
     * This element is present only if
     * <a>ListResourceRecordSetsResponse$IsTruncated</a> is true.
     * </p>
     * 
     * @param nextRecordType
     *        If the results were truncated, the type of the next record in the
     *        list. This element is present only if
     *        <a>ListResourceRecordSetsResponse$IsTruncated</a> is true.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see RRType
     */
    public ListResourceRecordSetsResult withNextRecordType(RRType nextRecordType) {
        setNextRecordType(nextRecordType);
        return this;
    }

    /**
     * <p>
     * <i>Weighted resource record sets only:</i> If results were truncated for
     * a given DNS name and type, the value of <code>SetIdentifier</code> for
     * the next resource record set that has the current DNS name and type.
     * </p>
     * 
     * @param nextRecordIdentifier
     *        Weighted resource record sets only:</i> If results were truncated
     *        for a given DNS name and type, the value of <code>SetIdentifier
     */
    public void setNextRecordIdentifier(String nextRecordIdentifier) {
        this.nextRecordIdentifier = nextRecordIdentifier;
    }

    /**
     * <p>
     * <i>Weighted resource record sets only:</i> If results were truncated for
     * a given DNS name and type, the value of <code>SetIdentifier</code> for
     * the next resource record set that has the current DNS name and type.
     * </p>
     * 
     * @return Weighted resource record sets only:</i> If results were truncated
     *         for a given DNS name and type, the value of <code>SetIdentifier
     */
    public String getNextRecordIdentifier() {
        return this.nextRecordIdentifier;
    }

    /**
     * <p>
     * <i>Weighted resource record sets only:</i> If results were truncated for
     * a given DNS name and type, the value of <code>SetIdentifier</code> for
     * the next resource record set that has the current DNS name and type.
     * </p>
     * 
     * @param nextRecordIdentifier
     *        Weighted resource record sets only:</i> If results were truncated
     *        for a given DNS name and type, the value of <code>SetIdentifier
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ListResourceRecordSetsResult withNextRecordIdentifier(
            String nextRecordIdentifier) {
        setNextRecordIdentifier(nextRecordIdentifier);
        return this;
    }

    /**
     * <p>
     * The maximum number of records you requested. The maximum value of
     * <code>MaxItems</code> is 100.
     * </p>
     * 
     * @param maxItems
     *        The maximum number of records you requested. The maximum value of
     *        <code>MaxItems</code> is 100.
     */
    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * The maximum number of records you requested. The maximum value of
     * <code>MaxItems</code> is 100.
     * </p>
     * 
     * @return The maximum number of records you requested. The maximum value of
     *         <code>MaxItems</code> is 100.
     */
    public String getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * The maximum number of records you requested. The maximum value of
     * <code>MaxItems</code> is 100.
     * </p>
     * 
     * @param maxItems
     *        The maximum number of records you requested. The maximum value of
     *        <code>MaxItems</code> is 100.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ListResourceRecordSetsResult withMaxItems(String maxItems) {
        setMaxItems(maxItems);
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
        if (getResourceRecordSets() != null)
            sb.append("ResourceRecordSets: " + getResourceRecordSets() + ",");
        if (getIsTruncated() != null)
            sb.append("IsTruncated: " + getIsTruncated() + ",");
        if (getNextRecordName() != null)
            sb.append("NextRecordName: " + getNextRecordName() + ",");
        if (getNextRecordType() != null)
            sb.append("NextRecordType: " + getNextRecordType() + ",");
        if (getNextRecordIdentifier() != null)
            sb.append("NextRecordIdentifier: " + getNextRecordIdentifier()
                    + ",");
        if (getMaxItems() != null)
            sb.append("MaxItems: " + getMaxItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListResourceRecordSetsResult == false)
            return false;
        ListResourceRecordSetsResult other = (ListResourceRecordSetsResult) obj;
        if (other.getResourceRecordSets() == null
                ^ this.getResourceRecordSets() == null)
            return false;
        if (other.getResourceRecordSets() != null
                && other.getResourceRecordSets().equals(
                        this.getResourceRecordSets()) == false)
            return false;
        if (other.getIsTruncated() == null ^ this.getIsTruncated() == null)
            return false;
        if (other.getIsTruncated() != null
                && other.getIsTruncated().equals(this.getIsTruncated()) == false)
            return false;
        if (other.getNextRecordName() == null
                ^ this.getNextRecordName() == null)
            return false;
        if (other.getNextRecordName() != null
                && other.getNextRecordName().equals(this.getNextRecordName()) == false)
            return false;
        if (other.getNextRecordType() == null
                ^ this.getNextRecordType() == null)
            return false;
        if (other.getNextRecordType() != null
                && other.getNextRecordType().equals(this.getNextRecordType()) == false)
            return false;
        if (other.getNextRecordIdentifier() == null
                ^ this.getNextRecordIdentifier() == null)
            return false;
        if (other.getNextRecordIdentifier() != null
                && other.getNextRecordIdentifier().equals(
                        this.getNextRecordIdentifier()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null
                && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getResourceRecordSets() == null) ? 0
                        : getResourceRecordSets().hashCode());
        hashCode = prime
                * hashCode
                + ((getIsTruncated() == null) ? 0 : getIsTruncated().hashCode());
        hashCode = prime
                * hashCode
                + ((getNextRecordName() == null) ? 0 : getNextRecordName()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getNextRecordType() == null) ? 0 : getNextRecordType()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getNextRecordIdentifier() == null) ? 0
                        : getNextRecordIdentifier().hashCode());
        hashCode = prime * hashCode
                + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        return hashCode;
    }

    @Override
    public ListResourceRecordSetsResult clone() {
        try {
            return (ListResourceRecordSetsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}