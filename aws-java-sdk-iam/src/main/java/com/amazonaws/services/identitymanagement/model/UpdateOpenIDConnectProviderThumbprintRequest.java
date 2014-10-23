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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.identitymanagement.AmazonIdentityManagement#updateOpenIDConnectProviderThumbprint(UpdateOpenIDConnectProviderThumbprintRequest) UpdateOpenIDConnectProviderThumbprint operation}.
 * <p>
 * Replaces the existing list of server certificate thumbprints with a
 * new list.
 * </p>
 * <p>
 * The list that you pass with this action completely replaces the
 * existing list of thumbprints. (The lists are not merged.)
 * </p>
 * <p>
 * Typically, you need to update a thumbprint only when the identity
 * provider's certificate changes, which occurs rarely. However, if the
 * provider's certificate <i>does</i> change, any attempt to assume an
 * IAM role that specifies the IAM provider as a principal will fail
 * until the certificate thumbprint is updated.
 * </p>
 * <p>
 * <b>NOTE:</b>Because trust for the OpenID Connect provider is
 * ultimately derived from the provider's certificate and is validated by
 * the thumbprint, it is a best practice to limit access to the
 * UpdateOpenIDConnectProviderThumbprint action to highly-privileged
 * users.
 * </p>
 *
 * @see com.amazonaws.services.identitymanagement.AmazonIdentityManagement#updateOpenIDConnectProviderThumbprint(UpdateOpenIDConnectProviderThumbprintRequest)
 */
public class UpdateOpenIDConnectProviderThumbprintRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The Amazon Resource Name (ARN) of the IAM OpenID Connect (OIDC)
     * provider to update the thumbprint for. You can get a list of OIDC
     * provider ARNs by using the <a>ListOpenIDConnectProviders</a> action.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String openIDConnectProviderArn;

    /**
     * A list of certificate thumbprints that are associated with the
     * specified IAM OpenID Connect provider. For more information, see
     * <a>CreateOpenIDConnectProvider</a>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> thumbprintList;

    /**
     * The Amazon Resource Name (ARN) of the IAM OpenID Connect (OIDC)
     * provider to update the thumbprint for. You can get a list of OIDC
     * provider ARNs by using the <a>ListOpenIDConnectProviders</a> action.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return The Amazon Resource Name (ARN) of the IAM OpenID Connect (OIDC)
     *         provider to update the thumbprint for. You can get a list of OIDC
     *         provider ARNs by using the <a>ListOpenIDConnectProviders</a> action.
     */
    public String getOpenIDConnectProviderArn() {
        return openIDConnectProviderArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the IAM OpenID Connect (OIDC)
     * provider to update the thumbprint for. You can get a list of OIDC
     * provider ARNs by using the <a>ListOpenIDConnectProviders</a> action.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param openIDConnectProviderArn The Amazon Resource Name (ARN) of the IAM OpenID Connect (OIDC)
     *         provider to update the thumbprint for. You can get a list of OIDC
     *         provider ARNs by using the <a>ListOpenIDConnectProviders</a> action.
     */
    public void setOpenIDConnectProviderArn(String openIDConnectProviderArn) {
        this.openIDConnectProviderArn = openIDConnectProviderArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the IAM OpenID Connect (OIDC)
     * provider to update the thumbprint for. You can get a list of OIDC
     * provider ARNs by using the <a>ListOpenIDConnectProviders</a> action.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param openIDConnectProviderArn The Amazon Resource Name (ARN) of the IAM OpenID Connect (OIDC)
     *         provider to update the thumbprint for. You can get a list of OIDC
     *         provider ARNs by using the <a>ListOpenIDConnectProviders</a> action.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateOpenIDConnectProviderThumbprintRequest withOpenIDConnectProviderArn(String openIDConnectProviderArn) {
        this.openIDConnectProviderArn = openIDConnectProviderArn;
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
    public UpdateOpenIDConnectProviderThumbprintRequest withThumbprintList(String... thumbprintList) {
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
    public UpdateOpenIDConnectProviderThumbprintRequest withThumbprintList(java.util.Collection<String> thumbprintList) {
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
        if (getOpenIDConnectProviderArn() != null) sb.append("OpenIDConnectProviderArn: " + getOpenIDConnectProviderArn() + ",");
        if (getThumbprintList() != null) sb.append("ThumbprintList: " + getThumbprintList() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateOpenIDConnectProviderThumbprintRequest == false) return false;
        UpdateOpenIDConnectProviderThumbprintRequest other = (UpdateOpenIDConnectProviderThumbprintRequest)obj;
        
        if (other.getOpenIDConnectProviderArn() == null ^ this.getOpenIDConnectProviderArn() == null) return false;
        if (other.getOpenIDConnectProviderArn() != null && other.getOpenIDConnectProviderArn().equals(this.getOpenIDConnectProviderArn()) == false) return false; 
        if (other.getThumbprintList() == null ^ this.getThumbprintList() == null) return false;
        if (other.getThumbprintList() != null && other.getThumbprintList().equals(this.getThumbprintList()) == false) return false; 
        return true;
    }
    
}
    