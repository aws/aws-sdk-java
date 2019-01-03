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

/**
 * <p>
 * Contains the response to a successful <a>GetOpenIDConnectProvider</a> request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/GetOpenIDConnectProvider" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetOpenIDConnectProviderResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The URL that the IAM OIDC provider resource object is associated with. For more information, see
     * <a>CreateOpenIDConnectProvider</a>.
     * </p>
     */
    private String url;
    /**
     * <p>
     * A list of client IDs (also known as audiences) that are associated with the specified IAM OIDC provider resource
     * object. For more information, see <a>CreateOpenIDConnectProvider</a>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> clientIDList;
    /**
     * <p>
     * A list of certificate thumbprints that are associated with the specified IAM OIDC provider resource object. For
     * more information, see <a>CreateOpenIDConnectProvider</a>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> thumbprintList;
    /**
     * <p>
     * The date and time when the IAM OIDC provider resource object was created in the AWS account.
     * </p>
     */
    private java.util.Date createDate;

    /**
     * <p>
     * The URL that the IAM OIDC provider resource object is associated with. For more information, see
     * <a>CreateOpenIDConnectProvider</a>.
     * </p>
     * 
     * @param url
     *        The URL that the IAM OIDC provider resource object is associated with. For more information, see
     *        <a>CreateOpenIDConnectProvider</a>.
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * The URL that the IAM OIDC provider resource object is associated with. For more information, see
     * <a>CreateOpenIDConnectProvider</a>.
     * </p>
     * 
     * @return The URL that the IAM OIDC provider resource object is associated with. For more information, see
     *         <a>CreateOpenIDConnectProvider</a>.
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * <p>
     * The URL that the IAM OIDC provider resource object is associated with. For more information, see
     * <a>CreateOpenIDConnectProvider</a>.
     * </p>
     * 
     * @param url
     *        The URL that the IAM OIDC provider resource object is associated with. For more information, see
     *        <a>CreateOpenIDConnectProvider</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOpenIDConnectProviderResult withUrl(String url) {
        setUrl(url);
        return this;
    }

    /**
     * <p>
     * A list of client IDs (also known as audiences) that are associated with the specified IAM OIDC provider resource
     * object. For more information, see <a>CreateOpenIDConnectProvider</a>.
     * </p>
     * 
     * @return A list of client IDs (also known as audiences) that are associated with the specified IAM OIDC provider
     *         resource object. For more information, see <a>CreateOpenIDConnectProvider</a>.
     */

    public java.util.List<String> getClientIDList() {
        if (clientIDList == null) {
            clientIDList = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return clientIDList;
    }

    /**
     * <p>
     * A list of client IDs (also known as audiences) that are associated with the specified IAM OIDC provider resource
     * object. For more information, see <a>CreateOpenIDConnectProvider</a>.
     * </p>
     * 
     * @param clientIDList
     *        A list of client IDs (also known as audiences) that are associated with the specified IAM OIDC provider
     *        resource object. For more information, see <a>CreateOpenIDConnectProvider</a>.
     */

    public void setClientIDList(java.util.Collection<String> clientIDList) {
        if (clientIDList == null) {
            this.clientIDList = null;
            return;
        }

        this.clientIDList = new com.amazonaws.internal.SdkInternalList<String>(clientIDList);
    }

    /**
     * <p>
     * A list of client IDs (also known as audiences) that are associated with the specified IAM OIDC provider resource
     * object. For more information, see <a>CreateOpenIDConnectProvider</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setClientIDList(java.util.Collection)} or {@link #withClientIDList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param clientIDList
     *        A list of client IDs (also known as audiences) that are associated with the specified IAM OIDC provider
     *        resource object. For more information, see <a>CreateOpenIDConnectProvider</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOpenIDConnectProviderResult withClientIDList(String... clientIDList) {
        if (this.clientIDList == null) {
            setClientIDList(new com.amazonaws.internal.SdkInternalList<String>(clientIDList.length));
        }
        for (String ele : clientIDList) {
            this.clientIDList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of client IDs (also known as audiences) that are associated with the specified IAM OIDC provider resource
     * object. For more information, see <a>CreateOpenIDConnectProvider</a>.
     * </p>
     * 
     * @param clientIDList
     *        A list of client IDs (also known as audiences) that are associated with the specified IAM OIDC provider
     *        resource object. For more information, see <a>CreateOpenIDConnectProvider</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOpenIDConnectProviderResult withClientIDList(java.util.Collection<String> clientIDList) {
        setClientIDList(clientIDList);
        return this;
    }

    /**
     * <p>
     * A list of certificate thumbprints that are associated with the specified IAM OIDC provider resource object. For
     * more information, see <a>CreateOpenIDConnectProvider</a>.
     * </p>
     * 
     * @return A list of certificate thumbprints that are associated with the specified IAM OIDC provider resource
     *         object. For more information, see <a>CreateOpenIDConnectProvider</a>.
     */

    public java.util.List<String> getThumbprintList() {
        if (thumbprintList == null) {
            thumbprintList = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return thumbprintList;
    }

    /**
     * <p>
     * A list of certificate thumbprints that are associated with the specified IAM OIDC provider resource object. For
     * more information, see <a>CreateOpenIDConnectProvider</a>.
     * </p>
     * 
     * @param thumbprintList
     *        A list of certificate thumbprints that are associated with the specified IAM OIDC provider resource
     *        object. For more information, see <a>CreateOpenIDConnectProvider</a>.
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
     * A list of certificate thumbprints that are associated with the specified IAM OIDC provider resource object. For
     * more information, see <a>CreateOpenIDConnectProvider</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setThumbprintList(java.util.Collection)} or {@link #withThumbprintList(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param thumbprintList
     *        A list of certificate thumbprints that are associated with the specified IAM OIDC provider resource
     *        object. For more information, see <a>CreateOpenIDConnectProvider</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOpenIDConnectProviderResult withThumbprintList(String... thumbprintList) {
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
     * A list of certificate thumbprints that are associated with the specified IAM OIDC provider resource object. For
     * more information, see <a>CreateOpenIDConnectProvider</a>.
     * </p>
     * 
     * @param thumbprintList
     *        A list of certificate thumbprints that are associated with the specified IAM OIDC provider resource
     *        object. For more information, see <a>CreateOpenIDConnectProvider</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOpenIDConnectProviderResult withThumbprintList(java.util.Collection<String> thumbprintList) {
        setThumbprintList(thumbprintList);
        return this;
    }

    /**
     * <p>
     * The date and time when the IAM OIDC provider resource object was created in the AWS account.
     * </p>
     * 
     * @param createDate
     *        The date and time when the IAM OIDC provider resource object was created in the AWS account.
     */

    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * <p>
     * The date and time when the IAM OIDC provider resource object was created in the AWS account.
     * </p>
     * 
     * @return The date and time when the IAM OIDC provider resource object was created in the AWS account.
     */

    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * <p>
     * The date and time when the IAM OIDC provider resource object was created in the AWS account.
     * </p>
     * 
     * @param createDate
     *        The date and time when the IAM OIDC provider resource object was created in the AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOpenIDConnectProviderResult withCreateDate(java.util.Date createDate) {
        setCreateDate(createDate);
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
        if (getUrl() != null)
            sb.append("Url: ").append(getUrl()).append(",");
        if (getClientIDList() != null)
            sb.append("ClientIDList: ").append(getClientIDList()).append(",");
        if (getThumbprintList() != null)
            sb.append("ThumbprintList: ").append(getThumbprintList()).append(",");
        if (getCreateDate() != null)
            sb.append("CreateDate: ").append(getCreateDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetOpenIDConnectProviderResult == false)
            return false;
        GetOpenIDConnectProviderResult other = (GetOpenIDConnectProviderResult) obj;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        if (other.getClientIDList() == null ^ this.getClientIDList() == null)
            return false;
        if (other.getClientIDList() != null && other.getClientIDList().equals(this.getClientIDList()) == false)
            return false;
        if (other.getThumbprintList() == null ^ this.getThumbprintList() == null)
            return false;
        if (other.getThumbprintList() != null && other.getThumbprintList().equals(this.getThumbprintList()) == false)
            return false;
        if (other.getCreateDate() == null ^ this.getCreateDate() == null)
            return false;
        if (other.getCreateDate() != null && other.getCreateDate().equals(this.getCreateDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        hashCode = prime * hashCode + ((getClientIDList() == null) ? 0 : getClientIDList().hashCode());
        hashCode = prime * hashCode + ((getThumbprintList() == null) ? 0 : getThumbprintList().hashCode());
        hashCode = prime * hashCode + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        return hashCode;
    }

    @Override
    public GetOpenIDConnectProviderResult clone() {
        try {
            return (GetOpenIDConnectProviderResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
