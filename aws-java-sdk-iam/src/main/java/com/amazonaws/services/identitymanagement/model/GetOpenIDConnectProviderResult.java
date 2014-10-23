/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the result of a successful invocation of the
 * GetOpenIDConnectProvider action.
 * </p>
 */
public class GetOpenIDConnectProviderResult implements Serializable {

    /**
     * The URL that the IAM OpenID Connect provider is associated with. For
     * more information, see <a>CreateOpenIDConnectProvider</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String url;

    /**
     * A list of client IDs (also known as audiences) that are associated
     * with the specified IAM OpenID Connect provider. For more information,
     * see <a>CreateOpenIDConnectProvider</a>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> clientIDList;

    /**
     * A list of certificate thumbprints that are associated with the
     * specified IAM OpenID Connect provider. For more information, see
     * <a>CreateOpenIDConnectProvider</a>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> thumbprintList;

    /**
     * The date and time when the IAM OpenID Connect provider entity was
     * created in the AWS account.
     */
    private java.util.Date createDate;

    /**
     * The URL that the IAM OpenID Connect provider is associated with. For
     * more information, see <a>CreateOpenIDConnectProvider</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return The URL that the IAM OpenID Connect provider is associated with. For
     *         more information, see <a>CreateOpenIDConnectProvider</a>.
     */
    public String getUrl() {
        return url;
    }
    
    /**
     * The URL that the IAM OpenID Connect provider is associated with. For
     * more information, see <a>CreateOpenIDConnectProvider</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param url The URL that the IAM OpenID Connect provider is associated with. For
     *         more information, see <a>CreateOpenIDConnectProvider</a>.
     */
    public void setUrl(String url) {
        this.url = url;
    }
    
    /**
     * The URL that the IAM OpenID Connect provider is associated with. For
     * more information, see <a>CreateOpenIDConnectProvider</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param url The URL that the IAM OpenID Connect provider is associated with. For
     *         more information, see <a>CreateOpenIDConnectProvider</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetOpenIDConnectProviderResult withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * A list of client IDs (also known as audiences) that are associated
     * with the specified IAM OpenID Connect provider. For more information,
     * see <a>CreateOpenIDConnectProvider</a>.
     *
     * @return A list of client IDs (also known as audiences) that are associated
     *         with the specified IAM OpenID Connect provider. For more information,
     *         see <a>CreateOpenIDConnectProvider</a>.
     */
    public java.util.List<String> getClientIDList() {
        if (clientIDList == null) {
              clientIDList = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              clientIDList.setAutoConstruct(true);
        }
        return clientIDList;
    }
    
    /**
     * A list of client IDs (also known as audiences) that are associated
     * with the specified IAM OpenID Connect provider. For more information,
     * see <a>CreateOpenIDConnectProvider</a>.
     *
     * @param clientIDList A list of client IDs (also known as audiences) that are associated
     *         with the specified IAM OpenID Connect provider. For more information,
     *         see <a>CreateOpenIDConnectProvider</a>.
     */
    public void setClientIDList(java.util.Collection<String> clientIDList) {
        if (clientIDList == null) {
            this.clientIDList = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> clientIDListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(clientIDList.size());
        clientIDListCopy.addAll(clientIDList);
        this.clientIDList = clientIDListCopy;
    }
    
    /**
     * A list of client IDs (also known as audiences) that are associated
     * with the specified IAM OpenID Connect provider. For more information,
     * see <a>CreateOpenIDConnectProvider</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clientIDList A list of client IDs (also known as audiences) that are associated
     *         with the specified IAM OpenID Connect provider. For more information,
     *         see <a>CreateOpenIDConnectProvider</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetOpenIDConnectProviderResult withClientIDList(String... clientIDList) {
        if (getClientIDList() == null) setClientIDList(new java.util.ArrayList<String>(clientIDList.length));
        for (String value : clientIDList) {
            getClientIDList().add(value);
        }
        return this;
    }
    
    /**
     * A list of client IDs (also known as audiences) that are associated
     * with the specified IAM OpenID Connect provider. For more information,
     * see <a>CreateOpenIDConnectProvider</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clientIDList A list of client IDs (also known as audiences) that are associated
     *         with the specified IAM OpenID Connect provider. For more information,
     *         see <a>CreateOpenIDConnectProvider</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetOpenIDConnectProviderResult withClientIDList(java.util.Collection<String> clientIDList) {
        if (clientIDList == null) {
            this.clientIDList = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> clientIDListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(clientIDList.size());
            clientIDListCopy.addAll(clientIDList);
            this.clientIDList = clientIDListCopy;
        }

        return this;
    }

    /**
     * A list of certificate thumbprints that are associated with the
     * specified IAM OpenID Connect provider. For more information, see
     * <a>CreateOpenIDConnectProvider</a>.
     *
     * @return A list of certificate thumbprints that are associated with the
     *         specified IAM OpenID Connect provider. For more information, see
     *         <a>CreateOpenIDConnectProvider</a>.
     */
    public java.util.List<String> getThumbprintList() {
        if (thumbprintList == null) {
              thumbprintList = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              thumbprintList.setAutoConstruct(true);
        }
        return thumbprintList;
    }
    
    /**
     * A list of certificate thumbprints that are associated with the
     * specified IAM OpenID Connect provider. For more information, see
     * <a>CreateOpenIDConnectProvider</a>.
     *
     * @param thumbprintList A list of certificate thumbprints that are associated with the
     *         specified IAM OpenID Connect provider. For more information, see
     *         <a>CreateOpenIDConnectProvider</a>.
     */
    public void setThumbprintList(java.util.Collection<String> thumbprintList) {
        if (thumbprintList == null) {
            this.thumbprintList = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> thumbprintListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(thumbprintList.size());
        thumbprintListCopy.addAll(thumbprintList);
        this.thumbprintList = thumbprintListCopy;
    }
    
    /**
     * A list of certificate thumbprints that are associated with the
     * specified IAM OpenID Connect provider. For more information, see
     * <a>CreateOpenIDConnectProvider</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param thumbprintList A list of certificate thumbprints that are associated with the
     *         specified IAM OpenID Connect provider. For more information, see
     *         <a>CreateOpenIDConnectProvider</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetOpenIDConnectProviderResult withThumbprintList(String... thumbprintList) {
        if (getThumbprintList() == null) setThumbprintList(new java.util.ArrayList<String>(thumbprintList.length));
        for (String value : thumbprintList) {
            getThumbprintList().add(value);
        }
        return this;
    }
    
    /**
     * A list of certificate thumbprints that are associated with the
     * specified IAM OpenID Connect provider. For more information, see
     * <a>CreateOpenIDConnectProvider</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param thumbprintList A list of certificate thumbprints that are associated with the
     *         specified IAM OpenID Connect provider. For more information, see
     *         <a>CreateOpenIDConnectProvider</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetOpenIDConnectProviderResult withThumbprintList(java.util.Collection<String> thumbprintList) {
        if (thumbprintList == null) {
            this.thumbprintList = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> thumbprintListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(thumbprintList.size());
            thumbprintListCopy.addAll(thumbprintList);
            this.thumbprintList = thumbprintListCopy;
        }

        return this;
    }

    /**
     * The date and time when the IAM OpenID Connect provider entity was
     * created in the AWS account.
     *
     * @return The date and time when the IAM OpenID Connect provider entity was
     *         created in the AWS account.
     */
    public java.util.Date getCreateDate() {
        return createDate;
    }
    
    /**
     * The date and time when the IAM OpenID Connect provider entity was
     * created in the AWS account.
     *
     * @param createDate The date and time when the IAM OpenID Connect provider entity was
     *         created in the AWS account.
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }
    
    /**
     * The date and time when the IAM OpenID Connect provider entity was
     * created in the AWS account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createDate The date and time when the IAM OpenID Connect provider entity was
     *         created in the AWS account.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetOpenIDConnectProviderResult withCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
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
        if (getUrl() != null) sb.append("Url: " + getUrl() + ",");
        if (getClientIDList() != null) sb.append("ClientIDList: " + getClientIDList() + ",");
        if (getThumbprintList() != null) sb.append("ThumbprintList: " + getThumbprintList() + ",");
        if (getCreateDate() != null) sb.append("CreateDate: " + getCreateDate() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetOpenIDConnectProviderResult == false) return false;
        GetOpenIDConnectProviderResult other = (GetOpenIDConnectProviderResult)obj;
        
        if (other.getUrl() == null ^ this.getUrl() == null) return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false) return false; 
        if (other.getClientIDList() == null ^ this.getClientIDList() == null) return false;
        if (other.getClientIDList() != null && other.getClientIDList().equals(this.getClientIDList()) == false) return false; 
        if (other.getThumbprintList() == null ^ this.getThumbprintList() == null) return false;
        if (other.getThumbprintList() != null && other.getThumbprintList().equals(this.getThumbprintList()) == false) return false; 
        if (other.getCreateDate() == null ^ this.getCreateDate() == null) return false;
        if (other.getCreateDate() != null && other.getCreateDate().equals(this.getCreateDate()) == false) return false; 
        return true;
    }
    
}
    