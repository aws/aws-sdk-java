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
 * Container for the parameters to the {@link com.amazonaws.services.identitymanagement.AmazonIdentityManagement#deleteSigningCertificate(DeleteSigningCertificateRequest) DeleteSigningCertificate operation}.
 * <p>
 * Deletes the specified signing certificate associated with the specified user.
 * </p>
 * <p>
 * If you do not specify a user name, IAM determines the user name implicitly based on the AWS access key ID signing the request. Because this action
 * works for access keys under the AWS account, you can use this API to manage root credentials even if the AWS account has no associated users.
 * </p>
 *
 * @see com.amazonaws.services.identitymanagement.AmazonIdentityManagement#deleteSigningCertificate(DeleteSigningCertificateRequest)
 */
public class DeleteSigningCertificateRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * Name of the user the signing certificate belongs to.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     */
    private String userName;

    /**
     * ID of the signing certificate to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>24 - 128<br/>
     * <b>Pattern: </b>[\w]*<br/>
     */
    private String certificateId;

    /**
     * Default constructor for a new DeleteSigningCertificateRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DeleteSigningCertificateRequest() {}
    
    /**
     * Constructs a new DeleteSigningCertificateRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param certificateId ID of the signing certificate to delete.
     */
    public DeleteSigningCertificateRequest(String certificateId) {
        setCertificateId(certificateId);
    }

    /**
     * Name of the user the signing certificate belongs to.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @return Name of the user the signing certificate belongs to.
     */
    public String getUserName() {
        return userName;
    }
    
    /**
     * Name of the user the signing certificate belongs to.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param userName Name of the user the signing certificate belongs to.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    /**
     * Name of the user the signing certificate belongs to.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param userName Name of the user the signing certificate belongs to.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeleteSigningCertificateRequest withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * ID of the signing certificate to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>24 - 128<br/>
     * <b>Pattern: </b>[\w]*<br/>
     *
     * @return ID of the signing certificate to delete.
     */
    public String getCertificateId() {
        return certificateId;
    }
    
    /**
     * ID of the signing certificate to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>24 - 128<br/>
     * <b>Pattern: </b>[\w]*<br/>
     *
     * @param certificateId ID of the signing certificate to delete.
     */
    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }
    
    /**
     * ID of the signing certificate to delete.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>24 - 128<br/>
     * <b>Pattern: </b>[\w]*<br/>
     *
     * @param certificateId ID of the signing certificate to delete.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeleteSigningCertificateRequest withCertificateId(String certificateId) {
        this.certificateId = certificateId;
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
        if (getUserName() != null) sb.append("UserName: " + getUserName() + ",");
        if (getCertificateId() != null) sb.append("CertificateId: " + getCertificateId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode()); 
        hashCode = prime * hashCode + ((getCertificateId() == null) ? 0 : getCertificateId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteSigningCertificateRequest == false) return false;
        DeleteSigningCertificateRequest other = (DeleteSigningCertificateRequest)obj;
        
        if (other.getUserName() == null ^ this.getUserName() == null) return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false) return false; 
        if (other.getCertificateId() == null ^ this.getCertificateId() == null) return false;
        if (other.getCertificateId() != null && other.getCertificateId().equals(this.getCertificateId()) == false) return false; 
        return true;
    }
    
}
    