/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/ListIPSets" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListIPSetsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * When you request a list of objects with a <code>Limit</code> setting, if the number of objects that are still
     * available for retrieval exceeds the limit, AWS WAF returns a <code>NextMarker</code> value in the response. To
     * retrieve the next batch of objects, provide the marker from the prior call in your next request.
     * </p>
     */
    private String nextMarker;
    /**
     * <p>
     * Array of IPSets. This may not be the full list of IPSets that you have defined. See the <code>Limit</code>
     * specification for this request.
     * </p>
     */
    private java.util.List<IPSetSummary> iPSets;

    /**
     * <p>
     * When you request a list of objects with a <code>Limit</code> setting, if the number of objects that are still
     * available for retrieval exceeds the limit, AWS WAF returns a <code>NextMarker</code> value in the response. To
     * retrieve the next batch of objects, provide the marker from the prior call in your next request.
     * </p>
     * 
     * @param nextMarker
     *        When you request a list of objects with a <code>Limit</code> setting, if the number of objects that are
     *        still available for retrieval exceeds the limit, AWS WAF returns a <code>NextMarker</code> value in the
     *        response. To retrieve the next batch of objects, provide the marker from the prior call in your next
     *        request.
     */

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * When you request a list of objects with a <code>Limit</code> setting, if the number of objects that are still
     * available for retrieval exceeds the limit, AWS WAF returns a <code>NextMarker</code> value in the response. To
     * retrieve the next batch of objects, provide the marker from the prior call in your next request.
     * </p>
     * 
     * @return When you request a list of objects with a <code>Limit</code> setting, if the number of objects that are
     *         still available for retrieval exceeds the limit, AWS WAF returns a <code>NextMarker</code> value in the
     *         response. To retrieve the next batch of objects, provide the marker from the prior call in your next
     *         request.
     */

    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * <p>
     * When you request a list of objects with a <code>Limit</code> setting, if the number of objects that are still
     * available for retrieval exceeds the limit, AWS WAF returns a <code>NextMarker</code> value in the response. To
     * retrieve the next batch of objects, provide the marker from the prior call in your next request.
     * </p>
     * 
     * @param nextMarker
     *        When you request a list of objects with a <code>Limit</code> setting, if the number of objects that are
     *        still available for retrieval exceeds the limit, AWS WAF returns a <code>NextMarker</code> value in the
     *        response. To retrieve the next batch of objects, provide the marker from the prior call in your next
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIPSetsResult withNextMarker(String nextMarker) {
        setNextMarker(nextMarker);
        return this;
    }

    /**
     * <p>
     * Array of IPSets. This may not be the full list of IPSets that you have defined. See the <code>Limit</code>
     * specification for this request.
     * </p>
     * 
     * @return Array of IPSets. This may not be the full list of IPSets that you have defined. See the
     *         <code>Limit</code> specification for this request.
     */

    public java.util.List<IPSetSummary> getIPSets() {
        return iPSets;
    }

    /**
     * <p>
     * Array of IPSets. This may not be the full list of IPSets that you have defined. See the <code>Limit</code>
     * specification for this request.
     * </p>
     * 
     * @param iPSets
     *        Array of IPSets. This may not be the full list of IPSets that you have defined. See the <code>Limit</code>
     *        specification for this request.
     */

    public void setIPSets(java.util.Collection<IPSetSummary> iPSets) {
        if (iPSets == null) {
            this.iPSets = null;
            return;
        }

        this.iPSets = new java.util.ArrayList<IPSetSummary>(iPSets);
    }

    /**
     * <p>
     * Array of IPSets. This may not be the full list of IPSets that you have defined. See the <code>Limit</code>
     * specification for this request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIPSets(java.util.Collection)} or {@link #withIPSets(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param iPSets
     *        Array of IPSets. This may not be the full list of IPSets that you have defined. See the <code>Limit</code>
     *        specification for this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIPSetsResult withIPSets(IPSetSummary... iPSets) {
        if (this.iPSets == null) {
            setIPSets(new java.util.ArrayList<IPSetSummary>(iPSets.length));
        }
        for (IPSetSummary ele : iPSets) {
            this.iPSets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Array of IPSets. This may not be the full list of IPSets that you have defined. See the <code>Limit</code>
     * specification for this request.
     * </p>
     * 
     * @param iPSets
     *        Array of IPSets. This may not be the full list of IPSets that you have defined. See the <code>Limit</code>
     *        specification for this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIPSetsResult withIPSets(java.util.Collection<IPSetSummary> iPSets) {
        setIPSets(iPSets);
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
        if (getNextMarker() != null)
            sb.append("NextMarker: ").append(getNextMarker()).append(",");
        if (getIPSets() != null)
            sb.append("IPSets: ").append(getIPSets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListIPSetsResult == false)
            return false;
        ListIPSetsResult other = (ListIPSetsResult) obj;
        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        if (other.getIPSets() == null ^ this.getIPSets() == null)
            return false;
        if (other.getIPSets() != null && other.getIPSets().equals(this.getIPSets()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        hashCode = prime * hashCode + ((getIPSets() == null) ? 0 : getIPSets().hashCode());
        return hashCode;
    }

    @Override
    public ListIPSetsResult clone() {
        try {
            return (ListIPSetsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
