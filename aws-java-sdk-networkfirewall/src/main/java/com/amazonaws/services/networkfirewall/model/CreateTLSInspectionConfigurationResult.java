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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/CreateTLSInspectionConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTLSInspectionConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A token used for optimistic locking. Network Firewall returns a token to your requests that access the TLS
     * inspection configuration. The token marks the state of the TLS inspection configuration resource at the time of
     * the request.
     * </p>
     * <p>
     * To make changes to the TLS inspection configuration, you provide the token in your request. Network Firewall uses
     * the token to ensure that the TLS inspection configuration hasn't changed since you last retrieved it. If it has
     * changed, the operation fails with an <code>InvalidTokenException</code>. If this happens, retrieve the TLS
     * inspection configuration again to get a current copy of it with a current token. Reapply your changes as needed,
     * then try the operation again using the new token.
     * </p>
     */
    private String updateToken;
    /**
     * <p>
     * The high-level properties of a TLS inspection configuration. This, along with the
     * <a>TLSInspectionConfiguration</a>, define the TLS inspection configuration. You can retrieve all objects for a
     * TLS inspection configuration by calling <a>DescribeTLSInspectionConfiguration</a>.
     * </p>
     */
    private TLSInspectionConfigurationResponse tLSInspectionConfigurationResponse;

    /**
     * <p>
     * A token used for optimistic locking. Network Firewall returns a token to your requests that access the TLS
     * inspection configuration. The token marks the state of the TLS inspection configuration resource at the time of
     * the request.
     * </p>
     * <p>
     * To make changes to the TLS inspection configuration, you provide the token in your request. Network Firewall uses
     * the token to ensure that the TLS inspection configuration hasn't changed since you last retrieved it. If it has
     * changed, the operation fails with an <code>InvalidTokenException</code>. If this happens, retrieve the TLS
     * inspection configuration again to get a current copy of it with a current token. Reapply your changes as needed,
     * then try the operation again using the new token.
     * </p>
     * 
     * @param updateToken
     *        A token used for optimistic locking. Network Firewall returns a token to your requests that access the TLS
     *        inspection configuration. The token marks the state of the TLS inspection configuration resource at the
     *        time of the request. </p>
     *        <p>
     *        To make changes to the TLS inspection configuration, you provide the token in your request. Network
     *        Firewall uses the token to ensure that the TLS inspection configuration hasn't changed since you last
     *        retrieved it. If it has changed, the operation fails with an <code>InvalidTokenException</code>. If this
     *        happens, retrieve the TLS inspection configuration again to get a current copy of it with a current token.
     *        Reapply your changes as needed, then try the operation again using the new token.
     */

    public void setUpdateToken(String updateToken) {
        this.updateToken = updateToken;
    }

    /**
     * <p>
     * A token used for optimistic locking. Network Firewall returns a token to your requests that access the TLS
     * inspection configuration. The token marks the state of the TLS inspection configuration resource at the time of
     * the request.
     * </p>
     * <p>
     * To make changes to the TLS inspection configuration, you provide the token in your request. Network Firewall uses
     * the token to ensure that the TLS inspection configuration hasn't changed since you last retrieved it. If it has
     * changed, the operation fails with an <code>InvalidTokenException</code>. If this happens, retrieve the TLS
     * inspection configuration again to get a current copy of it with a current token. Reapply your changes as needed,
     * then try the operation again using the new token.
     * </p>
     * 
     * @return A token used for optimistic locking. Network Firewall returns a token to your requests that access the
     *         TLS inspection configuration. The token marks the state of the TLS inspection configuration resource at
     *         the time of the request. </p>
     *         <p>
     *         To make changes to the TLS inspection configuration, you provide the token in your request. Network
     *         Firewall uses the token to ensure that the TLS inspection configuration hasn't changed since you last
     *         retrieved it. If it has changed, the operation fails with an <code>InvalidTokenException</code>. If this
     *         happens, retrieve the TLS inspection configuration again to get a current copy of it with a current
     *         token. Reapply your changes as needed, then try the operation again using the new token.
     */

    public String getUpdateToken() {
        return this.updateToken;
    }

    /**
     * <p>
     * A token used for optimistic locking. Network Firewall returns a token to your requests that access the TLS
     * inspection configuration. The token marks the state of the TLS inspection configuration resource at the time of
     * the request.
     * </p>
     * <p>
     * To make changes to the TLS inspection configuration, you provide the token in your request. Network Firewall uses
     * the token to ensure that the TLS inspection configuration hasn't changed since you last retrieved it. If it has
     * changed, the operation fails with an <code>InvalidTokenException</code>. If this happens, retrieve the TLS
     * inspection configuration again to get a current copy of it with a current token. Reapply your changes as needed,
     * then try the operation again using the new token.
     * </p>
     * 
     * @param updateToken
     *        A token used for optimistic locking. Network Firewall returns a token to your requests that access the TLS
     *        inspection configuration. The token marks the state of the TLS inspection configuration resource at the
     *        time of the request. </p>
     *        <p>
     *        To make changes to the TLS inspection configuration, you provide the token in your request. Network
     *        Firewall uses the token to ensure that the TLS inspection configuration hasn't changed since you last
     *        retrieved it. If it has changed, the operation fails with an <code>InvalidTokenException</code>. If this
     *        happens, retrieve the TLS inspection configuration again to get a current copy of it with a current token.
     *        Reapply your changes as needed, then try the operation again using the new token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTLSInspectionConfigurationResult withUpdateToken(String updateToken) {
        setUpdateToken(updateToken);
        return this;
    }

    /**
     * <p>
     * The high-level properties of a TLS inspection configuration. This, along with the
     * <a>TLSInspectionConfiguration</a>, define the TLS inspection configuration. You can retrieve all objects for a
     * TLS inspection configuration by calling <a>DescribeTLSInspectionConfiguration</a>.
     * </p>
     * 
     * @param tLSInspectionConfigurationResponse
     *        The high-level properties of a TLS inspection configuration. This, along with the
     *        <a>TLSInspectionConfiguration</a>, define the TLS inspection configuration. You can retrieve all objects
     *        for a TLS inspection configuration by calling <a>DescribeTLSInspectionConfiguration</a>.
     */

    public void setTLSInspectionConfigurationResponse(TLSInspectionConfigurationResponse tLSInspectionConfigurationResponse) {
        this.tLSInspectionConfigurationResponse = tLSInspectionConfigurationResponse;
    }

    /**
     * <p>
     * The high-level properties of a TLS inspection configuration. This, along with the
     * <a>TLSInspectionConfiguration</a>, define the TLS inspection configuration. You can retrieve all objects for a
     * TLS inspection configuration by calling <a>DescribeTLSInspectionConfiguration</a>.
     * </p>
     * 
     * @return The high-level properties of a TLS inspection configuration. This, along with the
     *         <a>TLSInspectionConfiguration</a>, define the TLS inspection configuration. You can retrieve all objects
     *         for a TLS inspection configuration by calling <a>DescribeTLSInspectionConfiguration</a>.
     */

    public TLSInspectionConfigurationResponse getTLSInspectionConfigurationResponse() {
        return this.tLSInspectionConfigurationResponse;
    }

    /**
     * <p>
     * The high-level properties of a TLS inspection configuration. This, along with the
     * <a>TLSInspectionConfiguration</a>, define the TLS inspection configuration. You can retrieve all objects for a
     * TLS inspection configuration by calling <a>DescribeTLSInspectionConfiguration</a>.
     * </p>
     * 
     * @param tLSInspectionConfigurationResponse
     *        The high-level properties of a TLS inspection configuration. This, along with the
     *        <a>TLSInspectionConfiguration</a>, define the TLS inspection configuration. You can retrieve all objects
     *        for a TLS inspection configuration by calling <a>DescribeTLSInspectionConfiguration</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTLSInspectionConfigurationResult withTLSInspectionConfigurationResponse(TLSInspectionConfigurationResponse tLSInspectionConfigurationResponse) {
        setTLSInspectionConfigurationResponse(tLSInspectionConfigurationResponse);
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
        if (getUpdateToken() != null)
            sb.append("UpdateToken: ").append(getUpdateToken()).append(",");
        if (getTLSInspectionConfigurationResponse() != null)
            sb.append("TLSInspectionConfigurationResponse: ").append(getTLSInspectionConfigurationResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTLSInspectionConfigurationResult == false)
            return false;
        CreateTLSInspectionConfigurationResult other = (CreateTLSInspectionConfigurationResult) obj;
        if (other.getUpdateToken() == null ^ this.getUpdateToken() == null)
            return false;
        if (other.getUpdateToken() != null && other.getUpdateToken().equals(this.getUpdateToken()) == false)
            return false;
        if (other.getTLSInspectionConfigurationResponse() == null ^ this.getTLSInspectionConfigurationResponse() == null)
            return false;
        if (other.getTLSInspectionConfigurationResponse() != null
                && other.getTLSInspectionConfigurationResponse().equals(this.getTLSInspectionConfigurationResponse()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUpdateToken() == null) ? 0 : getUpdateToken().hashCode());
        hashCode = prime * hashCode + ((getTLSInspectionConfigurationResponse() == null) ? 0 : getTLSInspectionConfigurationResponse().hashCode());
        return hashCode;
    }

    @Override
    public CreateTLSInspectionConfigurationResult clone() {
        try {
            return (CreateTLSInspectionConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
