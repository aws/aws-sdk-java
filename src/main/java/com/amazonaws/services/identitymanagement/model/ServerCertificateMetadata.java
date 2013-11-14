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


/**
 * <p>
 * ServerCertificateMetadata contains information about a server certificate without its certificate body, certificate chain, and private key.
 * </p>
 * <p>
 * This data type is used as a response element in the action UploadServerCertificate and ListServerCertificates.
 * </p>
 */
public class ServerCertificateMetadata implements Serializable {

    /**
     * Path to the server certificate. For more information about paths, see
     * <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     * target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     * Identity and Access Management</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     */
    private String path;

    /**
     * The name that identifies the server certificate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     */
    private String serverCertificateName;

    /**
     * The stable and unique string identifying the server certificate. For
     * more information about IDs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     * target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     * Identity and Access Management</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 32<br/>
     * <b>Pattern: </b>[\w]*<br/>
     */
    private String serverCertificateId;

    /**
     * The Amazon Resource Name (ARN) specifying the server certificate. For
     * more information about ARNs and how to use them in policies, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     * target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     * Identity and Access Management</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String arn;

    /**
     * The date when the server certificate was uploaded.
     */
    private java.util.Date uploadDate;

    /**
     * Default constructor for a new ServerCertificateMetadata object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ServerCertificateMetadata() {}
    
    /**
     * Constructs a new ServerCertificateMetadata object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param path Path to the server certificate. For more information about
     * paths, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     * target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     * Identity and Access Management</i>.
     * @param serverCertificateName The name that identifies the server
     * certificate.
     * @param serverCertificateId The stable and unique string identifying
     * the server certificate. For more information about IDs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     * target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     * Identity and Access Management</i>.
     * @param arn The Amazon Resource Name (ARN) specifying the server
     * certificate. For more information about ARNs and how to use them in
     * policies, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     * target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     * Identity and Access Management</i>.
     */
    public ServerCertificateMetadata(String path, String serverCertificateName, String serverCertificateId, String arn) {
        setPath(path);
        setServerCertificateName(serverCertificateName);
        setServerCertificateId(serverCertificateId);
        setArn(arn);
    }

    /**
     * Path to the server certificate. For more information about paths, see
     * <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     * target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     * Identity and Access Management</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     *
     * @return Path to the server certificate. For more information about paths, see
     *         <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     *         target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     *         Identity and Access Management</i>.
     */
    public String getPath() {
        return path;
    }
    
    /**
     * Path to the server certificate. For more information about paths, see
     * <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     * target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     * Identity and Access Management</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     *
     * @param path Path to the server certificate. For more information about paths, see
     *         <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     *         target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     *         Identity and Access Management</i>.
     */
    public void setPath(String path) {
        this.path = path;
    }
    
    /**
     * Path to the server certificate. For more information about paths, see
     * <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     * target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     * Identity and Access Management</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     *
     * @param path Path to the server certificate. For more information about paths, see
     *         <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     *         target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     *         Identity and Access Management</i>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ServerCertificateMetadata withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * The name that identifies the server certificate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @return The name that identifies the server certificate.
     */
    public String getServerCertificateName() {
        return serverCertificateName;
    }
    
    /**
     * The name that identifies the server certificate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param serverCertificateName The name that identifies the server certificate.
     */
    public void setServerCertificateName(String serverCertificateName) {
        this.serverCertificateName = serverCertificateName;
    }
    
    /**
     * The name that identifies the server certificate.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param serverCertificateName The name that identifies the server certificate.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ServerCertificateMetadata withServerCertificateName(String serverCertificateName) {
        this.serverCertificateName = serverCertificateName;
        return this;
    }

    /**
     * The stable and unique string identifying the server certificate. For
     * more information about IDs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     * target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     * Identity and Access Management</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 32<br/>
     * <b>Pattern: </b>[\w]*<br/>
     *
     * @return The stable and unique string identifying the server certificate. For
     *         more information about IDs, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     *         target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     *         Identity and Access Management</i>.
     */
    public String getServerCertificateId() {
        return serverCertificateId;
    }
    
    /**
     * The stable and unique string identifying the server certificate. For
     * more information about IDs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     * target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     * Identity and Access Management</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 32<br/>
     * <b>Pattern: </b>[\w]*<br/>
     *
     * @param serverCertificateId The stable and unique string identifying the server certificate. For
     *         more information about IDs, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     *         target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     *         Identity and Access Management</i>.
     */
    public void setServerCertificateId(String serverCertificateId) {
        this.serverCertificateId = serverCertificateId;
    }
    
    /**
     * The stable and unique string identifying the server certificate. For
     * more information about IDs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     * target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     * Identity and Access Management</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 32<br/>
     * <b>Pattern: </b>[\w]*<br/>
     *
     * @param serverCertificateId The stable and unique string identifying the server certificate. For
     *         more information about IDs, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     *         target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     *         Identity and Access Management</i>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ServerCertificateMetadata withServerCertificateId(String serverCertificateId) {
        this.serverCertificateId = serverCertificateId;
        return this;
    }

    /**
     * The Amazon Resource Name (ARN) specifying the server certificate. For
     * more information about ARNs and how to use them in policies, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     * target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     * Identity and Access Management</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return The Amazon Resource Name (ARN) specifying the server certificate. For
     *         more information about ARNs and how to use them in policies, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     *         target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     *         Identity and Access Management</i>.
     */
    public String getArn() {
        return arn;
    }
    
    /**
     * The Amazon Resource Name (ARN) specifying the server certificate. For
     * more information about ARNs and how to use them in policies, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     * target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     * Identity and Access Management</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param arn The Amazon Resource Name (ARN) specifying the server certificate. For
     *         more information about ARNs and how to use them in policies, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     *         target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     *         Identity and Access Management</i>.
     */
    public void setArn(String arn) {
        this.arn = arn;
    }
    
    /**
     * The Amazon Resource Name (ARN) specifying the server certificate. For
     * more information about ARNs and how to use them in policies, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     * target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     * Identity and Access Management</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param arn The Amazon Resource Name (ARN) specifying the server certificate. For
     *         more information about ARNs and how to use them in policies, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     *         target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     *         Identity and Access Management</i>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ServerCertificateMetadata withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * The date when the server certificate was uploaded.
     *
     * @return The date when the server certificate was uploaded.
     */
    public java.util.Date getUploadDate() {
        return uploadDate;
    }
    
    /**
     * The date when the server certificate was uploaded.
     *
     * @param uploadDate The date when the server certificate was uploaded.
     */
    public void setUploadDate(java.util.Date uploadDate) {
        this.uploadDate = uploadDate;
    }
    
    /**
     * The date when the server certificate was uploaded.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param uploadDate The date when the server certificate was uploaded.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ServerCertificateMetadata withUploadDate(java.util.Date uploadDate) {
        this.uploadDate = uploadDate;
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
        if (getPath() != null) sb.append("Path: " + getPath() + ",");
        if (getServerCertificateName() != null) sb.append("ServerCertificateName: " + getServerCertificateName() + ",");
        if (getServerCertificateId() != null) sb.append("ServerCertificateId: " + getServerCertificateId() + ",");
        if (getArn() != null) sb.append("Arn: " + getArn() + ",");
        if (getUploadDate() != null) sb.append("UploadDate: " + getUploadDate() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode()); 
        hashCode = prime * hashCode + ((getServerCertificateName() == null) ? 0 : getServerCertificateName().hashCode()); 
        hashCode = prime * hashCode + ((getServerCertificateId() == null) ? 0 : getServerCertificateId().hashCode()); 
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode()); 
        hashCode = prime * hashCode + ((getUploadDate() == null) ? 0 : getUploadDate().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ServerCertificateMetadata == false) return false;
        ServerCertificateMetadata other = (ServerCertificateMetadata)obj;
        
        if (other.getPath() == null ^ this.getPath() == null) return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false) return false; 
        if (other.getServerCertificateName() == null ^ this.getServerCertificateName() == null) return false;
        if (other.getServerCertificateName() != null && other.getServerCertificateName().equals(this.getServerCertificateName()) == false) return false; 
        if (other.getServerCertificateId() == null ^ this.getServerCertificateId() == null) return false;
        if (other.getServerCertificateId() != null && other.getServerCertificateId().equals(this.getServerCertificateId()) == false) return false; 
        if (other.getArn() == null ^ this.getArn() == null) return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false) return false; 
        if (other.getUploadDate() == null ^ this.getUploadDate() == null) return false;
        if (other.getUploadDate() != null && other.getUploadDate().equals(this.getUploadDate()) == false) return false; 
        return true;
    }
    
}
    