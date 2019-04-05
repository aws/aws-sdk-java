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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/UpdateOpenIDConnectProviderThumbprint"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateOpenIDConnectProviderThumbprintRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM OIDC provider resource object for which you want to update the
     * thumbprint. You can get a list of OIDC provider ARNs by using the <a>ListOpenIDConnectProviders</a> operation.
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
     * A list of certificate thumbprints that are associated with the specified IAM OpenID Connect provider. For more
     * information, see <a>CreateOpenIDConnectProvider</a>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> thumbprintList;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM OIDC provider resource object for which you want to update the
     * thumbprint. You can get a list of OIDC provider ARNs by using the <a>ListOpenIDConnectProviders</a> operation.
     * </p>
     * <p>
     * For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param openIDConnectProviderArn
     *        The Amazon Resource Name (ARN) of the IAM OIDC provider resource object for which you want to update the
     *        thumbprint. You can get a list of OIDC provider ARNs by using the <a>ListOpenIDConnectProviders</a>
     *        operation.</p>
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
     * The Amazon Resource Name (ARN) of the IAM OIDC provider resource object for which you want to update the
     * thumbprint. You can get a list of OIDC provider ARNs by using the <a>ListOpenIDConnectProviders</a> operation.
     * </p>
     * <p>
     * For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM OIDC provider resource object for which you want to update the
     *         thumbprint. You can get a list of OIDC provider ARNs by using the <a>ListOpenIDConnectProviders</a>
     *         operation.</p>
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
     * The Amazon Resource Name (ARN) of the IAM OIDC provider resource object for which you want to update the
     * thumbprint. You can get a list of OIDC provider ARNs by using the <a>ListOpenIDConnectProviders</a> operation.
     * </p>
     * <p>
     * For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param openIDConnectProviderArn
     *        The Amazon Resource Name (ARN) of the IAM OIDC provider resource object for which you want to update the
     *        thumbprint. You can get a list of OIDC provider ARNs by using the <a>ListOpenIDConnectProviders</a>
     *        operation.</p>
     *        <p>
     *        For more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs) and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateOpenIDConnectProviderThumbprintRequest withOpenIDConnectProviderArn(String openIDConnectProviderArn) {
        setOpenIDConnectProviderArn(openIDConnectProviderArn);
        return this;
    }

    /**
     * <p>
     * A list of certificate thumbprints that are associated with the specified IAM OpenID Connect provider. For more
     * information, see <a>CreateOpenIDConnectProvider</a>.
     * </p>
     * 
     * @return A list of certificate thumbprints that are associated with the specified IAM OpenID Connect provider. For
     *         more information, see <a>CreateOpenIDConnectProvider</a>.
     */

    public java.util.List<String> getThumbprintList() {
        if (thumbprintList == null) {
            thumbprintList = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return thumbprintList;
    }

    /**
     * <p>
     * A list of certificate thumbprints that are associated with the specified IAM OpenID Connect provider. For more
     * information, see <a>CreateOpenIDConnectProvider</a>.
     * </p>
     * 
     * @param thumbprintList
     *        A list of certificate thumbprints that are associated with the specified IAM OpenID Connect provider. For
     *        more information, see <a>CreateOpenIDConnectProvider</a>.
     */

    public void setThumbprintList(java.util.Collection<String> thumbprintList) {
        if (thumbprintList == null) {
            this.thumbprintList = null;
            return;
        }

        this.thumbprintList = new com.amazonaws.internal.SdkInternalList<String>(thumbprintList);
    }

    /**
     * <p>
     * A list of certificate thumbprints that are associated with the specified IAM OpenID Connect provider. For more
     * information, see <a>CreateOpenIDConnectProvider</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setThumbprintList(java.util.Collection)} or {@link #withThumbprintList(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param thumbprintList
     *        A list of certificate thumbprints that are associated with the specified IAM OpenID Connect provider. For
     *        more information, see <a>CreateOpenIDConnectProvider</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateOpenIDConnectProviderThumbprintRequest withThumbprintList(String... thumbprintList) {
        if (this.thumbprintList == null) {
            setThumbprintList(new com.amazonaws.internal.SdkInternalList<String>(thumbprintList.length));
        }
        for (String ele : thumbprintList) {
            this.thumbprintList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of certificate thumbprints that are associated with the specified IAM OpenID Connect provider. For more
     * information, see <a>CreateOpenIDConnectProvider</a>.
     * </p>
     * 
     * @param thumbprintList
     *        A list of certificate thumbprints that are associated with the specified IAM OpenID Connect provider. For
     *        more information, see <a>CreateOpenIDConnectProvider</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateOpenIDConnectProviderThumbprintRequest withThumbprintList(java.util.Collection<String> thumbprintList) {
        setThumbprintList(thumbprintList);
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
        if (getThumbprintList() != null)
            sb.append("ThumbprintList: ").append(getThumbprintList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateOpenIDConnectProviderThumbprintRequest == false)
            return false;
        UpdateOpenIDConnectProviderThumbprintRequest other = (UpdateOpenIDConnectProviderThumbprintRequest) obj;
        if (other.getOpenIDConnectProviderArn() == null ^ this.getOpenIDConnectProviderArn() == null)
            return false;
        if (other.getOpenIDConnectProviderArn() != null && other.getOpenIDConnectProviderArn().equals(this.getOpenIDConnectProviderArn()) == false)
            return false;
        if (other.getThumbprintList() == null ^ this.getThumbprintList() == null)
            return false;
        if (other.getThumbprintList() != null && other.getThumbprintList().equals(this.getThumbprintList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOpenIDConnectProviderArn() == null) ? 0 : getOpenIDConnectProviderArn().hashCode());
        hashCode = prime * hashCode + ((getThumbprintList() == null) ? 0 : getThumbprintList().hashCode());
        return hashCode;
    }

    @Override
    public UpdateOpenIDConnectProviderThumbprintRequest clone() {
        return (UpdateOpenIDConnectProviderThumbprintRequest) super.clone();
    }

}
