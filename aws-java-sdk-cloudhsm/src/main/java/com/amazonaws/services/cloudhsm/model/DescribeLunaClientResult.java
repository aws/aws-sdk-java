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

/**
 * 
 */
public class DescribeLunaClientResult implements Serializable {

    /**
     * The ARN of the client.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws(-iso)?:cloudhsm:[a-zA-Z0-9\-]*:[0-9]{12}:client-[0-9a-f]{8}<br/>
     */
    private String clientArn;

    /**
     * The certificate installed on the HSMs used by this client.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>600 - 2400<br/>
     * <b>Pattern: </b>[\w :+=./\n-]*<br/>
     */
    private String certificate;

    /**
     * The certificate fingerprint.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([0-9a-fA-F][0-9a-fA-F]:){15}[0-9a-fA-F][0-9a-fA-F]<br/>
     */
    private String certificateFingerprint;

    /**
     * The date and time the client was last modified.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d*<br/>
     */
    private String lastModifiedTimestamp;

    /**
     * The label of the client.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]{1,64}<br/>
     */
    private String label;

    /**
     * The ARN of the client.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws(-iso)?:cloudhsm:[a-zA-Z0-9\-]*:[0-9]{12}:client-[0-9a-f]{8}<br/>
     *
     * @return The ARN of the client.
     */
    public String getClientArn() {
        return clientArn;
    }
    
    /**
     * The ARN of the client.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws(-iso)?:cloudhsm:[a-zA-Z0-9\-]*:[0-9]{12}:client-[0-9a-f]{8}<br/>
     *
     * @param clientArn The ARN of the client.
     */
    public void setClientArn(String clientArn) {
        this.clientArn = clientArn;
    }
    
    /**
     * The ARN of the client.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws(-iso)?:cloudhsm:[a-zA-Z0-9\-]*:[0-9]{12}:client-[0-9a-f]{8}<br/>
     *
     * @param clientArn The ARN of the client.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeLunaClientResult withClientArn(String clientArn) {
        this.clientArn = clientArn;
        return this;
    }

    /**
     * The certificate installed on the HSMs used by this client.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>600 - 2400<br/>
     * <b>Pattern: </b>[\w :+=./\n-]*<br/>
     *
     * @return The certificate installed on the HSMs used by this client.
     */
    public String getCertificate() {
        return certificate;
    }
    
    /**
     * The certificate installed on the HSMs used by this client.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>600 - 2400<br/>
     * <b>Pattern: </b>[\w :+=./\n-]*<br/>
     *
     * @param certificate The certificate installed on the HSMs used by this client.
     */
    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }
    
    /**
     * The certificate installed on the HSMs used by this client.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>600 - 2400<br/>
     * <b>Pattern: </b>[\w :+=./\n-]*<br/>
     *
     * @param certificate The certificate installed on the HSMs used by this client.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeLunaClientResult withCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }

    /**
     * The certificate fingerprint.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([0-9a-fA-F][0-9a-fA-F]:){15}[0-9a-fA-F][0-9a-fA-F]<br/>
     *
     * @return The certificate fingerprint.
     */
    public String getCertificateFingerprint() {
        return certificateFingerprint;
    }
    
    /**
     * The certificate fingerprint.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([0-9a-fA-F][0-9a-fA-F]:){15}[0-9a-fA-F][0-9a-fA-F]<br/>
     *
     * @param certificateFingerprint The certificate fingerprint.
     */
    public void setCertificateFingerprint(String certificateFingerprint) {
        this.certificateFingerprint = certificateFingerprint;
    }
    
    /**
     * The certificate fingerprint.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([0-9a-fA-F][0-9a-fA-F]:){15}[0-9a-fA-F][0-9a-fA-F]<br/>
     *
     * @param certificateFingerprint The certificate fingerprint.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeLunaClientResult withCertificateFingerprint(String certificateFingerprint) {
        this.certificateFingerprint = certificateFingerprint;
        return this;
    }

    /**
     * The date and time the client was last modified.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d*<br/>
     *
     * @return The date and time the client was last modified.
     */
    public String getLastModifiedTimestamp() {
        return lastModifiedTimestamp;
    }
    
    /**
     * The date and time the client was last modified.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d*<br/>
     *
     * @param lastModifiedTimestamp The date and time the client was last modified.
     */
    public void setLastModifiedTimestamp(String lastModifiedTimestamp) {
        this.lastModifiedTimestamp = lastModifiedTimestamp;
    }
    
    /**
     * The date and time the client was last modified.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d*<br/>
     *
     * @param lastModifiedTimestamp The date and time the client was last modified.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeLunaClientResult withLastModifiedTimestamp(String lastModifiedTimestamp) {
        this.lastModifiedTimestamp = lastModifiedTimestamp;
        return this;
    }

    /**
     * The label of the client.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]{1,64}<br/>
     *
     * @return The label of the client.
     */
    public String getLabel() {
        return label;
    }
    
    /**
     * The label of the client.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]{1,64}<br/>
     *
     * @param label The label of the client.
     */
    public void setLabel(String label) {
        this.label = label;
    }
    
    /**
     * The label of the client.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]{1,64}<br/>
     *
     * @param label The label of the client.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeLunaClientResult withLabel(String label) {
        this.label = label;
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
        if (getClientArn() != null) sb.append("ClientArn: " + getClientArn() + ",");
        if (getCertificate() != null) sb.append("Certificate: " + getCertificate() + ",");
        if (getCertificateFingerprint() != null) sb.append("CertificateFingerprint: " + getCertificateFingerprint() + ",");
        if (getLastModifiedTimestamp() != null) sb.append("LastModifiedTimestamp: " + getLastModifiedTimestamp() + ",");
        if (getLabel() != null) sb.append("Label: " + getLabel() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getClientArn() == null) ? 0 : getClientArn().hashCode()); 
        hashCode = prime * hashCode + ((getCertificate() == null) ? 0 : getCertificate().hashCode()); 
        hashCode = prime * hashCode + ((getCertificateFingerprint() == null) ? 0 : getCertificateFingerprint().hashCode()); 
        hashCode = prime * hashCode + ((getLastModifiedTimestamp() == null) ? 0 : getLastModifiedTimestamp().hashCode()); 
        hashCode = prime * hashCode + ((getLabel() == null) ? 0 : getLabel().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeLunaClientResult == false) return false;
        DescribeLunaClientResult other = (DescribeLunaClientResult)obj;
        
        if (other.getClientArn() == null ^ this.getClientArn() == null) return false;
        if (other.getClientArn() != null && other.getClientArn().equals(this.getClientArn()) == false) return false; 
        if (other.getCertificate() == null ^ this.getCertificate() == null) return false;
        if (other.getCertificate() != null && other.getCertificate().equals(this.getCertificate()) == false) return false; 
        if (other.getCertificateFingerprint() == null ^ this.getCertificateFingerprint() == null) return false;
        if (other.getCertificateFingerprint() != null && other.getCertificateFingerprint().equals(this.getCertificateFingerprint()) == false) return false; 
        if (other.getLastModifiedTimestamp() == null ^ this.getLastModifiedTimestamp() == null) return false;
        if (other.getLastModifiedTimestamp() != null && other.getLastModifiedTimestamp().equals(this.getLastModifiedTimestamp()) == false) return false; 
        if (other.getLabel() == null ^ this.getLabel() == null) return false;
        if (other.getLabel() != null && other.getLabel().equals(this.getLabel()) == false) return false; 
        return true;
    }
    
}
    