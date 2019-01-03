/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudhsm.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/GetConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetConfigResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The type of credentials.
     * </p>
     */
    private String configType;
    /**
     * <p>
     * The chrystoki.conf configuration file.
     * </p>
     */
    private String configFile;
    /**
     * <p>
     * The certificate file containing the server.pem files of the HSMs.
     * </p>
     */
    private String configCred;

    /**
     * <p>
     * The type of credentials.
     * </p>
     * 
     * @param configType
     *        The type of credentials.
     */

    public void setConfigType(String configType) {
        this.configType = configType;
    }

    /**
     * <p>
     * The type of credentials.
     * </p>
     * 
     * @return The type of credentials.
     */

    public String getConfigType() {
        return this.configType;
    }

    /**
     * <p>
     * The type of credentials.
     * </p>
     * 
     * @param configType
     *        The type of credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConfigResult withConfigType(String configType) {
        setConfigType(configType);
        return this;
    }

    /**
     * <p>
     * The chrystoki.conf configuration file.
     * </p>
     * 
     * @param configFile
     *        The chrystoki.conf configuration file.
     */

    public void setConfigFile(String configFile) {
        this.configFile = configFile;
    }

    /**
     * <p>
     * The chrystoki.conf configuration file.
     * </p>
     * 
     * @return The chrystoki.conf configuration file.
     */

    public String getConfigFile() {
        return this.configFile;
    }

    /**
     * <p>
     * The chrystoki.conf configuration file.
     * </p>
     * 
     * @param configFile
     *        The chrystoki.conf configuration file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConfigResult withConfigFile(String configFile) {
        setConfigFile(configFile);
        return this;
    }

    /**
     * <p>
     * The certificate file containing the server.pem files of the HSMs.
     * </p>
     * 
     * @param configCred
     *        The certificate file containing the server.pem files of the HSMs.
     */

    public void setConfigCred(String configCred) {
        this.configCred = configCred;
    }

    /**
     * <p>
     * The certificate file containing the server.pem files of the HSMs.
     * </p>
     * 
     * @return The certificate file containing the server.pem files of the HSMs.
     */

    public String getConfigCred() {
        return this.configCred;
    }

    /**
     * <p>
     * The certificate file containing the server.pem files of the HSMs.
     * </p>
     * 
     * @param configCred
     *        The certificate file containing the server.pem files of the HSMs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConfigResult withConfigCred(String configCred) {
        setConfigCred(configCred);
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
        if (getConfigType() != null)
            sb.append("ConfigType: ").append(getConfigType()).append(",");
        if (getConfigFile() != null)
            sb.append("ConfigFile: ").append(getConfigFile()).append(",");
        if (getConfigCred() != null)
            sb.append("ConfigCred: ").append(getConfigCred());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetConfigResult == false)
            return false;
        GetConfigResult other = (GetConfigResult) obj;
        if (other.getConfigType() == null ^ this.getConfigType() == null)
            return false;
        if (other.getConfigType() != null && other.getConfigType().equals(this.getConfigType()) == false)
            return false;
        if (other.getConfigFile() == null ^ this.getConfigFile() == null)
            return false;
        if (other.getConfigFile() != null && other.getConfigFile().equals(this.getConfigFile()) == false)
            return false;
        if (other.getConfigCred() == null ^ this.getConfigCred() == null)
            return false;
        if (other.getConfigCred() != null && other.getConfigCred().equals(this.getConfigCred()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigType() == null) ? 0 : getConfigType().hashCode());
        hashCode = prime * hashCode + ((getConfigFile() == null) ? 0 : getConfigFile().hashCode());
        hashCode = prime * hashCode + ((getConfigCred() == null) ? 0 : getConfigCred().hashCode());
        return hashCode;
    }

    @Override
    public GetConfigResult clone() {
        try {
            return (GetConfigResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
