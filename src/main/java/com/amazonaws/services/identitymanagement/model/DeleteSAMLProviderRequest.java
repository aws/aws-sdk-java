/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container for the parameters to the {@link com.amazonaws.services.identitymanagement.AmazonIdentityManagement#deleteSAMLProvider(DeleteSAMLProviderRequest) DeleteSAMLProvider operation}.
 * <p>
 * Deletes a SAML provider.
 * </p>
 * <p>
 * Deleting the provider does not update any roles that reference the SAML provider as a principal in their trust policies. Any attempt to assume a role
 * that references a SAML provider that has been deleted will fail.
 * </p>
 * <p>
 * <b>NOTE:</b>This operation requires Signature Version 4.
 * </p>
 *
 * @see com.amazonaws.services.identitymanagement.AmazonIdentityManagement#deleteSAMLProvider(DeleteSAMLProviderRequest)
 */
public class DeleteSAMLProviderRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The Amazon Resource Name (ARN) of the SAML provider to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String sAMLProviderArn;

    /**
     * The Amazon Resource Name (ARN) of the SAML provider to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return The Amazon Resource Name (ARN) of the SAML provider to delete.
     */
    public String getSAMLProviderArn() {
        return sAMLProviderArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the SAML provider to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param sAMLProviderArn The Amazon Resource Name (ARN) of the SAML provider to delete.
     */
    public void setSAMLProviderArn(String sAMLProviderArn) {
        this.sAMLProviderArn = sAMLProviderArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the SAML provider to delete.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param sAMLProviderArn The Amazon Resource Name (ARN) of the SAML provider to delete.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeleteSAMLProviderRequest withSAMLProviderArn(String sAMLProviderArn) {
        this.sAMLProviderArn = sAMLProviderArn;
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
        if (getSAMLProviderArn() != null) sb.append("SAMLProviderArn: " + getSAMLProviderArn() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSAMLProviderArn() == null) ? 0 : getSAMLProviderArn().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteSAMLProviderRequest == false) return false;
        DeleteSAMLProviderRequest other = (DeleteSAMLProviderRequest)obj;
        
        if (other.getSAMLProviderArn() == null ^ this.getSAMLProviderArn() == null) return false;
        if (other.getSAMLProviderArn() != null && other.getSAMLProviderArn().equals(this.getSAMLProviderArn()) == false) return false; 
        return true;
    }
    
}
    