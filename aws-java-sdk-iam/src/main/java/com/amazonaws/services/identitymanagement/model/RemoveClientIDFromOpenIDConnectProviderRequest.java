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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/RemoveClientIDFromOpenIDConnectProvider"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RemoveClientIDFromOpenIDConnectProviderRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM OIDC provider resource to remove the client ID from. You can get a list
     * of OIDC provider ARNs by using the <a>ListOpenIDConnectProviders</a> operation.
     * </p>
     * <p>
     * For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     */
    private String openIDConnectProviderArn;
    /**
     * <p>
     * The client ID (also known as audience) to remove from the IAM OIDC provider resource. For more information about
     * client IDs, see <a>CreateOpenIDConnectProvider</a>.
     * </p>
     */
    private String clientID;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM OIDC provider resource to remove the client ID from. You can get a list
     * of OIDC provider ARNs by using the <a>ListOpenIDConnectProviders</a> operation.
     * </p>
     * <p>
     * For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param openIDConnectProviderArn
     *        The Amazon Resource Name (ARN) of the IAM OIDC provider resource to remove the client ID from. You can get
     *        a list of OIDC provider ARNs by using the <a>ListOpenIDConnectProviders</a> operation.</p>
     *        <p>
     *        For more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs) and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     */

    public void setOpenIDConnectProviderArn(String openIDConnectProviderArn) {
        this.openIDConnectProviderArn = openIDConnectProviderArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM OIDC provider resource to remove the client ID from. You can get a list
     * of OIDC provider ARNs by using the <a>ListOpenIDConnectProviders</a> operation.
     * </p>
     * <p>
     * For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM OIDC provider resource to remove the client ID from. You can
     *         get a list of OIDC provider ARNs by using the <a>ListOpenIDConnectProviders</a> operation.</p>
     *         <p>
     *         For more information about ARNs, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *         (ARNs) and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     */

    public String getOpenIDConnectProviderArn() {
        return this.openIDConnectProviderArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM OIDC provider resource to remove the client ID from. You can get a list
     * of OIDC provider ARNs by using the <a>ListOpenIDConnectProviders</a> operation.
     * </p>
     * <p>
     * For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param openIDConnectProviderArn
     *        The Amazon Resource Name (ARN) of the IAM OIDC provider resource to remove the client ID from. You can get
     *        a list of OIDC provider ARNs by using the <a>ListOpenIDConnectProviders</a> operation.</p>
     *        <p>
     *        For more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs) and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveClientIDFromOpenIDConnectProviderRequest withOpenIDConnectProviderArn(String openIDConnectProviderArn) {
        setOpenIDConnectProviderArn(openIDConnectProviderArn);
        return this;
    }

    /**
     * <p>
     * The client ID (also known as audience) to remove from the IAM OIDC provider resource. For more information about
     * client IDs, see <a>CreateOpenIDConnectProvider</a>.
     * </p>
     * 
     * @param clientID
     *        The client ID (also known as audience) to remove from the IAM OIDC provider resource. For more information
     *        about client IDs, see <a>CreateOpenIDConnectProvider</a>.
     */

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    /**
     * <p>
     * The client ID (also known as audience) to remove from the IAM OIDC provider resource. For more information about
     * client IDs, see <a>CreateOpenIDConnectProvider</a>.
     * </p>
     * 
     * @return The client ID (also known as audience) to remove from the IAM OIDC provider resource. For more
     *         information about client IDs, see <a>CreateOpenIDConnectProvider</a>.
     */

    public String getClientID() {
        return this.clientID;
    }

    /**
     * <p>
     * The client ID (also known as audience) to remove from the IAM OIDC provider resource. For more information about
     * client IDs, see <a>CreateOpenIDConnectProvider</a>.
     * </p>
     * 
     * @param clientID
     *        The client ID (also known as audience) to remove from the IAM OIDC provider resource. For more information
     *        about client IDs, see <a>CreateOpenIDConnectProvider</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveClientIDFromOpenIDConnectProviderRequest withClientID(String clientID) {
        setClientID(clientID);
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
        if (getOpenIDConnectProviderArn() != null)
            sb.append("OpenIDConnectProviderArn: ").append(getOpenIDConnectProviderArn()).append(",");
        if (getClientID() != null)
            sb.append("ClientID: ").append(getClientID());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RemoveClientIDFromOpenIDConnectProviderRequest == false)
            return false;
        RemoveClientIDFromOpenIDConnectProviderRequest other = (RemoveClientIDFromOpenIDConnectProviderRequest) obj;
        if (other.getOpenIDConnectProviderArn() == null ^ this.getOpenIDConnectProviderArn() == null)
            return false;
        if (other.getOpenIDConnectProviderArn() != null && other.getOpenIDConnectProviderArn().equals(this.getOpenIDConnectProviderArn()) == false)
            return false;
        if (other.getClientID() == null ^ this.getClientID() == null)
            return false;
        if (other.getClientID() != null && other.getClientID().equals(this.getClientID()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOpenIDConnectProviderArn() == null) ? 0 : getOpenIDConnectProviderArn().hashCode());
        hashCode = prime * hashCode + ((getClientID() == null) ? 0 : getClientID().hashCode());
        return hashCode;
    }

    @Override
    public RemoveClientIDFromOpenIDConnectProviderRequest clone() {
        return (RemoveClientIDFromOpenIDConnectProviderRequest) super.clone();
    }

}
