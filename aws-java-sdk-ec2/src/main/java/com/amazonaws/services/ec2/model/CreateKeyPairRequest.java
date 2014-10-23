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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.CreateKeyPairRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#createKeyPair(CreateKeyPairRequest) CreateKeyPair operation}.
 * <p>
 * Creates a 2048-bit RSA key pair with the specified name. Amazon EC2
 * stores the public key and displays the private key for you to save to
 * a file. The private key is returned as an unencrypted PEM encoded
 * PKCS#8 private key. If a key with the specified name already exists,
 * Amazon EC2 returns an error.
 * </p>
 * <p>
 * You can have up to five thousand key pairs per region.
 * </p>
 * <p>
 * The key pair returned to you is available only in the region in which
 * you create it. To create a key pair that is available in all regions,
 * use ImportKeyPair.
 * </p>
 * <p>
 * For more information about key pairs, see
 * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html"> Key Pairs </a>
 * in the <i>Amazon Elastic Compute Cloud User Guide for Linux</i> .
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#createKeyPair(CreateKeyPairRequest)
 */
public class CreateKeyPairRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<CreateKeyPairRequest> {

    /**
     * A unique name for the key pair. <p>Constraints: Up to 255 ASCII
     * characters
     */
    private String keyName;

    /**
     * Default constructor for a new CreateKeyPairRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CreateKeyPairRequest() {}
    
    /**
     * Constructs a new CreateKeyPairRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param keyName A unique name for the key pair. <p>Constraints: Up to
     * 255 ASCII characters
     */
    public CreateKeyPairRequest(String keyName) {
        setKeyName(keyName);
    }

    /**
     * A unique name for the key pair. <p>Constraints: Up to 255 ASCII
     * characters
     *
     * @return A unique name for the key pair. <p>Constraints: Up to 255 ASCII
     *         characters
     */
    public String getKeyName() {
        return keyName;
    }
    
    /**
     * A unique name for the key pair. <p>Constraints: Up to 255 ASCII
     * characters
     *
     * @param keyName A unique name for the key pair. <p>Constraints: Up to 255 ASCII
     *         characters
     */
    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }
    
    /**
     * A unique name for the key pair. <p>Constraints: Up to 255 ASCII
     * characters
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param keyName A unique name for the key pair. <p>Constraints: Up to 255 ASCII
     *         characters
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateKeyPairRequest withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<CreateKeyPairRequest> getDryRunRequest() {
        Request<CreateKeyPairRequest> request = new CreateKeyPairRequestMarshaller().marshall(this);
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
        if (getKeyName() != null) sb.append("KeyName: " + getKeyName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getKeyName() == null) ? 0 : getKeyName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateKeyPairRequest == false) return false;
        CreateKeyPairRequest other = (CreateKeyPairRequest)obj;
        
        if (other.getKeyName() == null ^ this.getKeyName() == null) return false;
        if (other.getKeyName() != null && other.getKeyName().equals(this.getKeyName()) == false) return false; 
        return true;
    }
    
}
    