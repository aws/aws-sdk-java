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
package com.amazonaws.services.networkfirewall.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/ListTLSInspectionConfigurations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTLSInspectionConfigurationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * When you request a list of objects with a <code>MaxResults</code> setting, if the number of objects that are
     * still available for retrieval exceeds the maximum you requested, Network Firewall returns a
     * <code>NextToken</code> value in the response. To retrieve the next batch of objects, use the token returned from
     * the prior request in your next request.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The TLS inspection configuration metadata objects that you've defined. Depending on your setting for max results
     * and the number of TLS inspection configurations, this might not be the full list.
     * </p>
     */
    private java.util.List<TLSInspectionConfigurationMetadata> tLSInspectionConfigurations;

    /**
     * <p>
     * When you request a list of objects with a <code>MaxResults</code> setting, if the number of objects that are
     * still available for retrieval exceeds the maximum you requested, Network Firewall returns a
     * <code>NextToken</code> value in the response. To retrieve the next batch of objects, use the token returned from
     * the prior request in your next request.
     * </p>
     * 
     * @param nextToken
     *        When you request a list of objects with a <code>MaxResults</code> setting, if the number of objects that
     *        are still available for retrieval exceeds the maximum you requested, Network Firewall returns a
     *        <code>NextToken</code> value in the response. To retrieve the next batch of objects, use the token
     *        returned from the prior request in your next request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When you request a list of objects with a <code>MaxResults</code> setting, if the number of objects that are
     * still available for retrieval exceeds the maximum you requested, Network Firewall returns a
     * <code>NextToken</code> value in the response. To retrieve the next batch of objects, use the token returned from
     * the prior request in your next request.
     * </p>
     * 
     * @return When you request a list of objects with a <code>MaxResults</code> setting, if the number of objects that
     *         are still available for retrieval exceeds the maximum you requested, Network Firewall returns a
     *         <code>NextToken</code> value in the response. To retrieve the next batch of objects, use the token
     *         returned from the prior request in your next request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * When you request a list of objects with a <code>MaxResults</code> setting, if the number of objects that are
     * still available for retrieval exceeds the maximum you requested, Network Firewall returns a
     * <code>NextToken</code> value in the response. To retrieve the next batch of objects, use the token returned from
     * the prior request in your next request.
     * </p>
     * 
     * @param nextToken
     *        When you request a list of objects with a <code>MaxResults</code> setting, if the number of objects that
     *        are still available for retrieval exceeds the maximum you requested, Network Firewall returns a
     *        <code>NextToken</code> value in the response. To retrieve the next batch of objects, use the token
     *        returned from the prior request in your next request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTLSInspectionConfigurationsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The TLS inspection configuration metadata objects that you've defined. Depending on your setting for max results
     * and the number of TLS inspection configurations, this might not be the full list.
     * </p>
     * 
     * @return The TLS inspection configuration metadata objects that you've defined. Depending on your setting for max
     *         results and the number of TLS inspection configurations, this might not be the full list.
     */

    public java.util.List<TLSInspectionConfigurationMetadata> getTLSInspectionConfigurations() {
        return tLSInspectionConfigurations;
    }

    /**
     * <p>
     * The TLS inspection configuration metadata objects that you've defined. Depending on your setting for max results
     * and the number of TLS inspection configurations, this might not be the full list.
     * </p>
     * 
     * @param tLSInspectionConfigurations
     *        The TLS inspection configuration metadata objects that you've defined. Depending on your setting for max
     *        results and the number of TLS inspection configurations, this might not be the full list.
     */

    public void setTLSInspectionConfigurations(java.util.Collection<TLSInspectionConfigurationMetadata> tLSInspectionConfigurations) {
        if (tLSInspectionConfigurations == null) {
            this.tLSInspectionConfigurations = null;
            return;
        }

        this.tLSInspectionConfigurations = new java.util.ArrayList<TLSInspectionConfigurationMetadata>(tLSInspectionConfigurations);
    }

    /**
     * <p>
     * The TLS inspection configuration metadata objects that you've defined. Depending on your setting for max results
     * and the number of TLS inspection configurations, this might not be the full list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTLSInspectionConfigurations(java.util.Collection)} or
     * {@link #withTLSInspectionConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param tLSInspectionConfigurations
     *        The TLS inspection configuration metadata objects that you've defined. Depending on your setting for max
     *        results and the number of TLS inspection configurations, this might not be the full list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTLSInspectionConfigurationsResult withTLSInspectionConfigurations(TLSInspectionConfigurationMetadata... tLSInspectionConfigurations) {
        if (this.tLSInspectionConfigurations == null) {
            setTLSInspectionConfigurations(new java.util.ArrayList<TLSInspectionConfigurationMetadata>(tLSInspectionConfigurations.length));
        }
        for (TLSInspectionConfigurationMetadata ele : tLSInspectionConfigurations) {
            this.tLSInspectionConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The TLS inspection configuration metadata objects that you've defined. Depending on your setting for max results
     * and the number of TLS inspection configurations, this might not be the full list.
     * </p>
     * 
     * @param tLSInspectionConfigurations
     *        The TLS inspection configuration metadata objects that you've defined. Depending on your setting for max
     *        results and the number of TLS inspection configurations, this might not be the full list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTLSInspectionConfigurationsResult withTLSInspectionConfigurations(
            java.util.Collection<TLSInspectionConfigurationMetadata> tLSInspectionConfigurations) {
        setTLSInspectionConfigurations(tLSInspectionConfigurations);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getTLSInspectionConfigurations() != null)
            sb.append("TLSInspectionConfigurations: ").append(getTLSInspectionConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTLSInspectionConfigurationsResult == false)
            return false;
        ListTLSInspectionConfigurationsResult other = (ListTLSInspectionConfigurationsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getTLSInspectionConfigurations() == null ^ this.getTLSInspectionConfigurations() == null)
            return false;
        if (other.getTLSInspectionConfigurations() != null && other.getTLSInspectionConfigurations().equals(this.getTLSInspectionConfigurations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getTLSInspectionConfigurations() == null) ? 0 : getTLSInspectionConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public ListTLSInspectionConfigurationsResult clone() {
        try {
            return (ListTLSInspectionConfigurationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
