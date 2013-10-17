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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.ImportKeyPairRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#importKeyPair(ImportKeyPairRequest) ImportKeyPair operation}.
 * <p>
 * Imports the public key from an RSA key pair created with a third-party tool. This operation differs from CreateKeyPair as the private key is never
 * transferred between the caller and AWS servers.
 * </p>
 * <p>
 * RSA key pairs are easily created on Microsoft Windows and Linux OS systems using the <code>ssh-keygen</code> command line tool provided with the
 * standard OpenSSH installation. Standard library support for RSA key pair creation is also available for Java, Ruby, Python, and many other
 * programming languages.
 * </p>
 * <p>
 * The following formats are supported:
 * </p>
 * 
 * <ul>
 * <li> OpenSSH public key format, </li>
 * <li> Base64 encoded DER format. </li>
 * <li> SSH public key file format as specified in <a href="http://tools.ietf.org/html/rfc4716"> RFC4716 </a> . </li>
 * 
 * </ul>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#importKeyPair(ImportKeyPairRequest)
 */
public class ImportKeyPairRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<ImportKeyPairRequest> {

    /**
     * The unique name for the key pair.
     */
    private String keyName;

    /**
     * The public key portion of the key pair being imported.
     */
    private String publicKeyMaterial;

    /**
     * Default constructor for a new ImportKeyPairRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ImportKeyPairRequest() {}
    
    /**
     * Constructs a new ImportKeyPairRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param keyName The unique name for the key pair.
     * @param publicKeyMaterial The public key portion of the key pair being
     * imported.
     */
    public ImportKeyPairRequest(String keyName, String publicKeyMaterial) {
        setKeyName(keyName);
        setPublicKeyMaterial(publicKeyMaterial);
    }

    /**
     * The unique name for the key pair.
     *
     * @return The unique name for the key pair.
     */
    public String getKeyName() {
        return keyName;
    }
    
    /**
     * The unique name for the key pair.
     *
     * @param keyName The unique name for the key pair.
     */
    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }
    
    /**
     * The unique name for the key pair.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param keyName The unique name for the key pair.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ImportKeyPairRequest withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * The public key portion of the key pair being imported.
     *
     * @return The public key portion of the key pair being imported.
     */
    public String getPublicKeyMaterial() {
        return publicKeyMaterial;
    }
    
    /**
     * The public key portion of the key pair being imported.
     *
     * @param publicKeyMaterial The public key portion of the key pair being imported.
     */
    public void setPublicKeyMaterial(String publicKeyMaterial) {
        this.publicKeyMaterial = publicKeyMaterial;
    }
    
    /**
     * The public key portion of the key pair being imported.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param publicKeyMaterial The public key portion of the key pair being imported.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ImportKeyPairRequest withPublicKeyMaterial(String publicKeyMaterial) {
        this.publicKeyMaterial = publicKeyMaterial;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<ImportKeyPairRequest> getDryRunRequest() {
        Request<ImportKeyPairRequest> request = new ImportKeyPairRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getKeyName() != null) sb.append("KeyName: " + getKeyName() + ",");
        if (getPublicKeyMaterial() != null) sb.append("PublicKeyMaterial: " + getPublicKeyMaterial() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getKeyName() == null) ? 0 : getKeyName().hashCode()); 
        hashCode = prime * hashCode + ((getPublicKeyMaterial() == null) ? 0 : getPublicKeyMaterial().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ImportKeyPairRequest == false) return false;
        ImportKeyPairRequest other = (ImportKeyPairRequest)obj;
        
        if (other.getKeyName() == null ^ this.getKeyName() == null) return false;
        if (other.getKeyName() != null && other.getKeyName().equals(this.getKeyName()) == false) return false; 
        if (other.getPublicKeyMaterial() == null ^ this.getPublicKeyMaterial() == null) return false;
        if (other.getPublicKeyMaterial() != null && other.getPublicKeyMaterial().equals(this.getPublicKeyMaterial()) == false) return false; 
        return true;
    }
    
}
    