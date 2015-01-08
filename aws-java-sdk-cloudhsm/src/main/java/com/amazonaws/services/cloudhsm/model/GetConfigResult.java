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
public class GetConfigResult implements Serializable {

    /**
     * The type of credentials.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\w :+=./\\-]*<br/>
     */
    private String configType;

    /**
     * The chrystoki.conf configuration file.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\w :+=./\\-]*<br/>
     */
    private String configFile;

    /**
     * The certificate file containing the server.pem files of the HSMs.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\w :+=./\\-]*<br/>
     */
    private String configCred;

    /**
     * The type of credentials.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\w :+=./\\-]*<br/>
     *
     * @return The type of credentials.
     */
    public String getConfigType() {
        return configType;
    }
    
    /**
     * The type of credentials.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\w :+=./\\-]*<br/>
     *
     * @param configType The type of credentials.
     */
    public void setConfigType(String configType) {
        this.configType = configType;
    }
    
    /**
     * The type of credentials.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\w :+=./\\-]*<br/>
     *
     * @param configType The type of credentials.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetConfigResult withConfigType(String configType) {
        this.configType = configType;
        return this;
    }

    /**
     * The chrystoki.conf configuration file.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\w :+=./\\-]*<br/>
     *
     * @return The chrystoki.conf configuration file.
     */
    public String getConfigFile() {
        return configFile;
    }
    
    /**
     * The chrystoki.conf configuration file.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\w :+=./\\-]*<br/>
     *
     * @param configFile The chrystoki.conf configuration file.
     */
    public void setConfigFile(String configFile) {
        this.configFile = configFile;
    }
    
    /**
     * The chrystoki.conf configuration file.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\w :+=./\\-]*<br/>
     *
     * @param configFile The chrystoki.conf configuration file.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetConfigResult withConfigFile(String configFile) {
        this.configFile = configFile;
        return this;
    }

    /**
     * The certificate file containing the server.pem files of the HSMs.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\w :+=./\\-]*<br/>
     *
     * @return The certificate file containing the server.pem files of the HSMs.
     */
    public String getConfigCred() {
        return configCred;
    }
    
    /**
     * The certificate file containing the server.pem files of the HSMs.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\w :+=./\\-]*<br/>
     *
     * @param configCred The certificate file containing the server.pem files of the HSMs.
     */
    public void setConfigCred(String configCred) {
        this.configCred = configCred;
    }
    
    /**
     * The certificate file containing the server.pem files of the HSMs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\w :+=./\\-]*<br/>
     *
     * @param configCred The certificate file containing the server.pem files of the HSMs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetConfigResult withConfigCred(String configCred) {
        this.configCred = configCred;
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
        if (getConfigType() != null) sb.append("ConfigType: " + getConfigType() + ",");
        if (getConfigFile() != null) sb.append("ConfigFile: " + getConfigFile() + ",");
        if (getConfigCred() != null) sb.append("ConfigCred: " + getConfigCred() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetConfigResult == false) return false;
        GetConfigResult other = (GetConfigResult)obj;
        
        if (other.getConfigType() == null ^ this.getConfigType() == null) return false;
        if (other.getConfigType() != null && other.getConfigType().equals(this.getConfigType()) == false) return false; 
        if (other.getConfigFile() == null ^ this.getConfigFile() == null) return false;
        if (other.getConfigFile() != null && other.getConfigFile().equals(this.getConfigFile()) == false) return false; 
        if (other.getConfigCred() == null ^ this.getConfigCred() == null) return false;
        if (other.getConfigCred() != null && other.getConfigCred().equals(this.getConfigCred()) == false) return false; 
        return true;
    }
    
}
    