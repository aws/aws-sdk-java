/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/ListAPIKeys" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAPIKeysResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

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
     * The array of key summaries. If you specified a <code>Limit</code> in your request, this might not be the full
     * list.
     * </p>
     */
    private java.util.List<APIKeySummary> aPIKeySummaries;
    /**
     * <p>
     * The CAPTCHA application integration URL, for use in your JavaScript implementation.
     * </p>
     */
    private String applicationIntegrationURL;

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

    public ListAPIKeysResult withNextMarker(String nextMarker) {
        setNextMarker(nextMarker);
        return this;
    }

    /**
     * <p>
     * The array of key summaries. If you specified a <code>Limit</code> in your request, this might not be the full
     * list.
     * </p>
     * 
     * @return The array of key summaries. If you specified a <code>Limit</code> in your request, this might not be the
     *         full list.
     */

    public java.util.List<APIKeySummary> getAPIKeySummaries() {
        return aPIKeySummaries;
    }

    /**
     * <p>
     * The array of key summaries. If you specified a <code>Limit</code> in your request, this might not be the full
     * list.
     * </p>
     * 
     * @param aPIKeySummaries
     *        The array of key summaries. If you specified a <code>Limit</code> in your request, this might not be the
     *        full list.
     */

    public void setAPIKeySummaries(java.util.Collection<APIKeySummary> aPIKeySummaries) {
        if (aPIKeySummaries == null) {
            this.aPIKeySummaries = null;
            return;
        }

        this.aPIKeySummaries = new java.util.ArrayList<APIKeySummary>(aPIKeySummaries);
    }

    /**
     * <p>
     * The array of key summaries. If you specified a <code>Limit</code> in your request, this might not be the full
     * list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAPIKeySummaries(java.util.Collection)} or {@link #withAPIKeySummaries(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param aPIKeySummaries
     *        The array of key summaries. If you specified a <code>Limit</code> in your request, this might not be the
     *        full list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAPIKeysResult withAPIKeySummaries(APIKeySummary... aPIKeySummaries) {
        if (this.aPIKeySummaries == null) {
            setAPIKeySummaries(new java.util.ArrayList<APIKeySummary>(aPIKeySummaries.length));
        }
        for (APIKeySummary ele : aPIKeySummaries) {
            this.aPIKeySummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The array of key summaries. If you specified a <code>Limit</code> in your request, this might not be the full
     * list.
     * </p>
     * 
     * @param aPIKeySummaries
     *        The array of key summaries. If you specified a <code>Limit</code> in your request, this might not be the
     *        full list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAPIKeysResult withAPIKeySummaries(java.util.Collection<APIKeySummary> aPIKeySummaries) {
        setAPIKeySummaries(aPIKeySummaries);
        return this;
    }

    /**
     * <p>
     * The CAPTCHA application integration URL, for use in your JavaScript implementation.
     * </p>
     * 
     * @param applicationIntegrationURL
     *        The CAPTCHA application integration URL, for use in your JavaScript implementation.
     */

    public void setApplicationIntegrationURL(String applicationIntegrationURL) {
        this.applicationIntegrationURL = applicationIntegrationURL;
    }

    /**
     * <p>
     * The CAPTCHA application integration URL, for use in your JavaScript implementation.
     * </p>
     * 
     * @return The CAPTCHA application integration URL, for use in your JavaScript implementation.
     */

    public String getApplicationIntegrationURL() {
        return this.applicationIntegrationURL;
    }

    /**
     * <p>
     * The CAPTCHA application integration URL, for use in your JavaScript implementation.
     * </p>
     * 
     * @param applicationIntegrationURL
     *        The CAPTCHA application integration URL, for use in your JavaScript implementation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAPIKeysResult withApplicationIntegrationURL(String applicationIntegrationURL) {
        setApplicationIntegrationURL(applicationIntegrationURL);
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
        if (getAPIKeySummaries() != null)
            sb.append("APIKeySummaries: ").append(getAPIKeySummaries()).append(",");
        if (getApplicationIntegrationURL() != null)
            sb.append("ApplicationIntegrationURL: ").append(getApplicationIntegrationURL());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAPIKeysResult == false)
            return false;
        ListAPIKeysResult other = (ListAPIKeysResult) obj;
        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        if (other.getAPIKeySummaries() == null ^ this.getAPIKeySummaries() == null)
            return false;
        if (other.getAPIKeySummaries() != null && other.getAPIKeySummaries().equals(this.getAPIKeySummaries()) == false)
            return false;
        if (other.getApplicationIntegrationURL() == null ^ this.getApplicationIntegrationURL() == null)
            return false;
        if (other.getApplicationIntegrationURL() != null && other.getApplicationIntegrationURL().equals(this.getApplicationIntegrationURL()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        hashCode = prime * hashCode + ((getAPIKeySummaries() == null) ? 0 : getAPIKeySummaries().hashCode());
        hashCode = prime * hashCode + ((getApplicationIntegrationURL() == null) ? 0 : getApplicationIntegrationURL().hashCode());
        return hashCode;
    }

    @Override
    public ListAPIKeysResult clone() {
        try {
            return (ListAPIKeysResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
