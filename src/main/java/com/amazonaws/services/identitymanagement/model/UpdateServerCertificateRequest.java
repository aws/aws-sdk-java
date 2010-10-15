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
 * Container for the parameters to the {@link com.amazonaws.services.identitymanagement.AmazonIdentityManagement#updateServerCertificate(UpdateServerCertificateRequest) UpdateServerCertificate operation}.
 * <p>
 * Updates the name and/or the path of the specified server certificate.
 * </p>
 * <p>
 * <b>IMPORTANT:</b> You should understand the implications of changing a
 * server certificate's path or name. For more information, see Managing
 * Server Certificates in Using AWS Identity and Access Management.
 * </p>
 * <p>
 * <b>NOTE:</b>To change a server certificate name the requester must
 * have appropriate permissions on both the source object and the target
 * object. For example, to change the name from ProductionCert to
 * ProdCert, the entity making the request must have permission on
 * ProductionCert and ProdCert, or must have permission on all (*). For
 * more information about permissions, see Permissions and Policies.
 * </p>
 *
 * @see com.amazonaws.services.identitymanagement.AmazonIdentityManagement#updateServerCertificate(UpdateServerCertificateRequest)
 */
public class UpdateServerCertificateRequest extends AmazonWebServiceRequest {

    /**
     * The name of the server certificate that you want to update.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     */
    private String serverCertificateName;

    /**
     * The new path for the server certificate. Include this only if you are
     * updating the server certificate's path.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     */
    private String newPath;

    /**
     * The new name for the server certificate. Include this only if you are
     * updating the server certificate's name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     */
    private String newServerCertificateName;

    /**
     * The name of the server certificate that you want to update.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @return The name of the server certificate that you want to update.
     */
    public String getServerCertificateName() {
        return serverCertificateName;
    }
    
    /**
     * The name of the server certificate that you want to update.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param serverCertificateName The name of the server certificate that you want to update.
     */
    public void setServerCertificateName(String serverCertificateName) {
        this.serverCertificateName = serverCertificateName;
    }
    
    /**
     * The name of the server certificate that you want to update.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param serverCertificateName The name of the server certificate that you want to update.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateServerCertificateRequest withServerCertificateName(String serverCertificateName) {
        this.serverCertificateName = serverCertificateName;
        return this;
    }
    
    
    /**
     * The new path for the server certificate. Include this only if you are
     * updating the server certificate's path.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     *
     * @return The new path for the server certificate. Include this only if you are
     *         updating the server certificate's path.
     */
    public String getNewPath() {
        return newPath;
    }
    
    /**
     * The new path for the server certificate. Include this only if you are
     * updating the server certificate's path.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     *
     * @param newPath The new path for the server certificate. Include this only if you are
     *         updating the server certificate's path.
     */
    public void setNewPath(String newPath) {
        this.newPath = newPath;
    }
    
    /**
     * The new path for the server certificate. Include this only if you are
     * updating the server certificate's path.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     *
     * @param newPath The new path for the server certificate. Include this only if you are
     *         updating the server certificate's path.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateServerCertificateRequest withNewPath(String newPath) {
        this.newPath = newPath;
        return this;
    }
    
    
    /**
     * The new name for the server certificate. Include this only if you are
     * updating the server certificate's name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @return The new name for the server certificate. Include this only if you are
     *         updating the server certificate's name.
     */
    public String getNewServerCertificateName() {
        return newServerCertificateName;
    }
    
    /**
     * The new name for the server certificate. Include this only if you are
     * updating the server certificate's name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param newServerCertificateName The new name for the server certificate. Include this only if you are
     *         updating the server certificate's name.
     */
    public void setNewServerCertificateName(String newServerCertificateName) {
        this.newServerCertificateName = newServerCertificateName;
    }
    
    /**
     * The new name for the server certificate. Include this only if you are
     * updating the server certificate's name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param newServerCertificateName The new name for the server certificate. Include this only if you are
     *         updating the server certificate's name.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateServerCertificateRequest withNewServerCertificateName(String newServerCertificateName) {
        this.newServerCertificateName = newServerCertificateName;
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
        sb.append("ServerCertificateName: " + serverCertificateName + ", ");
        sb.append("NewPath: " + newPath + ", ");
        sb.append("NewServerCertificateName: " + newServerCertificateName + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    