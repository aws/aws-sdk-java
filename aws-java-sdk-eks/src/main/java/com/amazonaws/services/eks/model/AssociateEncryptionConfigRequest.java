/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/AssociateEncryptionConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateEncryptionConfigRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the cluster that you are associating with encryption configuration.
     * </p>
     */
    private String clusterName;
    /**
     * <p>
     * The configuration you are using for encryption.
     * </p>
     */
    private java.util.List<EncryptionConfig> encryptionConfig;
    /**
     * <p>
     * The client request token you are using with the encryption configuration.
     * </p>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The name of the cluster that you are associating with encryption configuration.
     * </p>
     * 
     * @param clusterName
     *        The name of the cluster that you are associating with encryption configuration.
     */

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * <p>
     * The name of the cluster that you are associating with encryption configuration.
     * </p>
     * 
     * @return The name of the cluster that you are associating with encryption configuration.
     */

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * <p>
     * The name of the cluster that you are associating with encryption configuration.
     * </p>
     * 
     * @param clusterName
     *        The name of the cluster that you are associating with encryption configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateEncryptionConfigRequest withClusterName(String clusterName) {
        setClusterName(clusterName);
        return this;
    }

    /**
     * <p>
     * The configuration you are using for encryption.
     * </p>
     * 
     * @return The configuration you are using for encryption.
     */

    public java.util.List<EncryptionConfig> getEncryptionConfig() {
        return encryptionConfig;
    }

    /**
     * <p>
     * The configuration you are using for encryption.
     * </p>
     * 
     * @param encryptionConfig
     *        The configuration you are using for encryption.
     */

    public void setEncryptionConfig(java.util.Collection<EncryptionConfig> encryptionConfig) {
        if (encryptionConfig == null) {
            this.encryptionConfig = null;
            return;
        }

        this.encryptionConfig = new java.util.ArrayList<EncryptionConfig>(encryptionConfig);
    }

    /**
     * <p>
     * The configuration you are using for encryption.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEncryptionConfig(java.util.Collection)} or {@link #withEncryptionConfig(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param encryptionConfig
     *        The configuration you are using for encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateEncryptionConfigRequest withEncryptionConfig(EncryptionConfig... encryptionConfig) {
        if (this.encryptionConfig == null) {
            setEncryptionConfig(new java.util.ArrayList<EncryptionConfig>(encryptionConfig.length));
        }
        for (EncryptionConfig ele : encryptionConfig) {
            this.encryptionConfig.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The configuration you are using for encryption.
     * </p>
     * 
     * @param encryptionConfig
     *        The configuration you are using for encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateEncryptionConfigRequest withEncryptionConfig(java.util.Collection<EncryptionConfig> encryptionConfig) {
        setEncryptionConfig(encryptionConfig);
        return this;
    }

    /**
     * <p>
     * The client request token you are using with the encryption configuration.
     * </p>
     * 
     * @param clientRequestToken
     *        The client request token you are using with the encryption configuration.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * The client request token you are using with the encryption configuration.
     * </p>
     * 
     * @return The client request token you are using with the encryption configuration.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * The client request token you are using with the encryption configuration.
     * </p>
     * 
     * @param clientRequestToken
     *        The client request token you are using with the encryption configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateEncryptionConfigRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getClusterName() != null)
            sb.append("ClusterName: ").append(getClusterName()).append(",");
        if (getEncryptionConfig() != null)
            sb.append("EncryptionConfig: ").append(getEncryptionConfig()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateEncryptionConfigRequest == false)
            return false;
        AssociateEncryptionConfigRequest other = (AssociateEncryptionConfigRequest) obj;
        if (other.getClusterName() == null ^ this.getClusterName() == null)
            return false;
        if (other.getClusterName() != null && other.getClusterName().equals(this.getClusterName()) == false)
            return false;
        if (other.getEncryptionConfig() == null ^ this.getEncryptionConfig() == null)
            return false;
        if (other.getEncryptionConfig() != null && other.getEncryptionConfig().equals(this.getEncryptionConfig()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterName() == null) ? 0 : getClusterName().hashCode());
        hashCode = prime * hashCode + ((getEncryptionConfig() == null) ? 0 : getEncryptionConfig().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public AssociateEncryptionConfigRequest clone() {
        return (AssociateEncryptionConfigRequest) super.clone();
    }

}
