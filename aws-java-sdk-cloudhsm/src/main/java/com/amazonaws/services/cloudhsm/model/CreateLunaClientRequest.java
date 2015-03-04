/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudhsm.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.cloudhsm.AWSCloudHSM#createLunaClient(CreateLunaClientRequest) CreateLunaClient operation}.
 * <p>
 * Creates an HSM client.
 * </p>
 *
 * @see com.amazonaws.services.cloudhsm.AWSCloudHSM#createLunaClient(CreateLunaClientRequest)
 */
public class CreateLunaClientRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The label for the client.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]{2,64}<br/>
     */
    private String label;

    /**
     * The contents of a Base64-Encoded X.509 v3 certificate to be installed
     * on the HSMs used by this client.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>600 - 2400<br/>
     * <b>Pattern: </b>[\w :+=./\n-]*<br/>
     */
    private String certificate;

    /**
     * The label for the client.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]{2,64}<br/>
     *
     * @return The label for the client.
     */
    public String getLabel() {
        return label;
    }
    
    /**
     * The label for the client.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]{2,64}<br/>
     *
     * @param label The label for the client.
     */
    public void setLabel(String label) {
        this.label = label;
    }
    
    /**
     * The label for the client.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]{2,64}<br/>
     *
     * @param label The label for the client.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateLunaClientRequest withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * The contents of a Base64-Encoded X.509 v3 certificate to be installed
     * on the HSMs used by this client.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>600 - 2400<br/>
     * <b>Pattern: </b>[\w :+=./\n-]*<br/>
     *
     * @return The contents of a Base64-Encoded X.509 v3 certificate to be installed
     *         on the HSMs used by this client.
     */
    public String getCertificate() {
        return certificate;
    }
    
    /**
     * The contents of a Base64-Encoded X.509 v3 certificate to be installed
     * on the HSMs used by this client.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>600 - 2400<br/>
     * <b>Pattern: </b>[\w :+=./\n-]*<br/>
     *
     * @param certificate The contents of a Base64-Encoded X.509 v3 certificate to be installed
     *         on the HSMs used by this client.
     */
    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }
    
    /**
     * The contents of a Base64-Encoded X.509 v3 certificate to be installed
     * on the HSMs used by this client.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>600 - 2400<br/>
     * <b>Pattern: </b>[\w :+=./\n-]*<br/>
     *
     * @param certificate The contents of a Base64-Encoded X.509 v3 certificate to be installed
     *         on the HSMs used by this client.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateLunaClientRequest withCertificate(String certificate) {
        this.certificate = certificate;
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
        if (getLabel() != null) sb.append("Label: " + getLabel() + ",");
        if (getCertificate() != null) sb.append("Certificate: " + getCertificate() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getLabel() == null) ? 0 : getLabel().hashCode()); 
        hashCode = prime * hashCode + ((getCertificate() == null) ? 0 : getCertificate().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateLunaClientRequest == false) return false;
        CreateLunaClientRequest other = (CreateLunaClientRequest)obj;
        
        if (other.getLabel() == null ^ this.getLabel() == null) return false;
        if (other.getLabel() != null && other.getLabel().equals(this.getLabel()) == false) return false; 
        if (other.getCertificate() == null ^ this.getCertificate() == null) return false;
        if (other.getCertificate() != null && other.getCertificate().equals(this.getCertificate()) == false) return false; 
        return true;
    }
    
    @Override
    public CreateLunaClientRequest clone() {
        
            return (CreateLunaClientRequest) super.clone();
    }

}
    