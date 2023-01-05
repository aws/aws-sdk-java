/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.wafv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/ListMobileSdkReleases" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMobileSdkReleasesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * High level information for the available SDK releases.
     * </p>
     */
    private java.util.List<ReleaseSummary> releaseSummaries;
    /**
     * <p>
     * When you request a list of objects with a <code>Limit</code> setting, if the number of objects that are still
     * available for retrieval exceeds the limit, WAF returns a <code>NextMarker</code> value in the response. To
     * retrieve the next batch of objects, provide the marker from the prior call in your next request.
     * </p>
     */
    private String nextMarker;

    /**
     * <p>
     * High level information for the available SDK releases.
     * </p>
     * 
     * @return High level information for the available SDK releases.
     */

    public java.util.List<ReleaseSummary> getReleaseSummaries() {
        return releaseSummaries;
    }

    /**
     * <p>
     * High level information for the available SDK releases.
     * </p>
     * 
     * @param releaseSummaries
     *        High level information for the available SDK releases.
     */

    public void setReleaseSummaries(java.util.Collection<ReleaseSummary> releaseSummaries) {
        if (releaseSummaries == null) {
            this.releaseSummaries = null;
            return;
        }

        this.releaseSummaries = new java.util.ArrayList<ReleaseSummary>(releaseSummaries);
    }

    /**
     * <p>
     * High level information for the available SDK releases.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReleaseSummaries(java.util.Collection)} or {@link #withReleaseSummaries(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param releaseSummaries
     *        High level information for the available SDK releases.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMobileSdkReleasesResult withReleaseSummaries(ReleaseSummary... releaseSummaries) {
        if (this.releaseSummaries == null) {
            setReleaseSummaries(new java.util.ArrayList<ReleaseSummary>(releaseSummaries.length));
        }
        for (ReleaseSummary ele : releaseSummaries) {
            this.releaseSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * High level information for the available SDK releases.
     * </p>
     * 
     * @param releaseSummaries
     *        High level information for the available SDK releases.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMobileSdkReleasesResult withReleaseSummaries(java.util.Collection<ReleaseSummary> releaseSummaries) {
        setReleaseSummaries(releaseSummaries);
        return this;
    }

    /**
     * <p>
     * When you request a list of objects with a <code>Limit</code> setting, if the number of objects that are still
     * available for retrieval exceeds the limit, WAF returns a <code>NextMarker</code> value in the response. To
     * retrieve the next batch of objects, provide the marker from the prior call in your next request.
     * </p>
     * 
     * @param nextMarker
     *        When you request a list of objects with a <code>Limit</code> setting, if the number of objects that are
     *        still available for retrieval exceeds the limit, WAF returns a <code>NextMarker</code> value in the
     *        response. To retrieve the next batch of objects, provide the marker from the prior call in your next
     *        request.
     */

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * When you request a list of objects with a <code>Limit</code> setting, if the number of objects that are still
     * available for retrieval exceeds the limit, WAF returns a <code>NextMarker</code> value in the response. To
     * retrieve the next batch of objects, provide the marker from the prior call in your next request.
     * </p>
     * 
     * @return When you request a list of objects with a <code>Limit</code> setting, if the number of objects that are
     *         still available for retrieval exceeds the limit, WAF returns a <code>NextMarker</code> value in the
     *         response. To retrieve the next batch of objects, provide the marker from the prior call in your next
     *         request.
     */

    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * <p>
     * When you request a list of objects with a <code>Limit</code> setting, if the number of objects that are still
     * available for retrieval exceeds the limit, WAF returns a <code>NextMarker</code> value in the response. To
     * retrieve the next batch of objects, provide the marker from the prior call in your next request.
     * </p>
     * 
     * @param nextMarker
     *        When you request a list of objects with a <code>Limit</code> setting, if the number of objects that are
     *        still available for retrieval exceeds the limit, WAF returns a <code>NextMarker</code> value in the
     *        response. To retrieve the next batch of objects, provide the marker from the prior call in your next
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMobileSdkReleasesResult withNextMarker(String nextMarker) {
        setNextMarker(nextMarker);
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
        if (getReleaseSummaries() != null)
            sb.append("ReleaseSummaries: ").append(getReleaseSummaries()).append(",");
        if (getNextMarker() != null)
            sb.append("NextMarker: ").append(getNextMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListMobileSdkReleasesResult == false)
            return false;
        ListMobileSdkReleasesResult other = (ListMobileSdkReleasesResult) obj;
        if (other.getReleaseSummaries() == null ^ this.getReleaseSummaries() == null)
            return false;
        if (other.getReleaseSummaries() != null && other.getReleaseSummaries().equals(this.getReleaseSummaries()) == false)
            return false;
        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReleaseSummaries() == null) ? 0 : getReleaseSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        return hashCode;
    }

    @Override
    public ListMobileSdkReleasesResult clone() {
        try {
            return (ListMobileSdkReleasesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
