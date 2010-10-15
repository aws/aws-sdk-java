/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.identitymanagement.AmazonIdentityManagement#deleteSigningCertificate(DeleteSigningCertificateRequest) DeleteSigningCertificate operation}.
 * <p>
 * Deletes the specified signing certificate associated with the
 * specified User.
 * </p>
 * <p>
 * If you do not specify a User name, IAM determines the User name
 * implicitly based on the AWS Access Key ID signing the request. Because
 * this action works for access keys under the AWS Account, you can use
 * this API to manage root credentials even if the AWS Account has no
 * associated Users.
 * </p>
 *
 * @see com.amazonaws.services.identitymanagement.AmazonIdentityManagement#deleteSigningCertificate(DeleteSigningCertificateRequest)
 */
public class DeleteSigningCertificateRequest extends AmazonWebServiceRequest {

    /**
     * Name of the User the signing certificate belongs to.
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
     * Name of the User the signing certificate belongs to.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @return Name of the User the signing certificate belongs to.
     */
    public String getUserName() {
        return userName;
    }
    
    /**
     * Name of the User the signing certificate belongs to.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param userName Name of the User the signing certificate belongs to.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    /**
     * Name of the User the signing certificate belongs to.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param userName Name of the User the signing certificate belongs to.
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
        sb.append("UserName: " + userName + ", ");
        sb.append("CertificateId: " + certificateId + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    