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
package com.amazonaws.services.route53.model;

import java.io.Serializable;


/**
 * <p>
 * A complex type that contains the health check configuration.
 * </p>
 */
public class HealthCheckConfig implements Serializable {

    /**
     * IP Address of the instance being checked.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 15<br/>
     * <b>Pattern: </b>^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$<br/>
     */
    private String iPAddress;

    /**
     * Port on which connection will be opened to the instance to health
     * check. For HTTP this defaults to 80 if the port is not specified.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 65535<br/>
     */
    private Integer port;

    /**
     * The type of health check to be performed. Currently supported
     * protocols are TCP and HTTP.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HTTP, TCP
     */
    private String type;

    /**
     * Path to ping on the instance to check the health. Required only for
     * HTTP health checks, HTTP request is issued to the instance on the
     * given port and path.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     */
    private String resourcePath;

    /**
     * Fully qualified domain name of the instance to be health checked.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     */
    private String fullyQualifiedDomainName;

    /**
     * IP Address of the instance being checked.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 15<br/>
     * <b>Pattern: </b>^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$<br/>
     *
     * @return IP Address of the instance being checked.
     */
    public String getIPAddress() {
        return iPAddress;
    }
    
    /**
     * IP Address of the instance being checked.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 15<br/>
     * <b>Pattern: </b>^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$<br/>
     *
     * @param iPAddress IP Address of the instance being checked.
     */
    public void setIPAddress(String iPAddress) {
        this.iPAddress = iPAddress;
    }
    
    /**
     * IP Address of the instance being checked.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 15<br/>
     * <b>Pattern: </b>^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$<br/>
     *
     * @param iPAddress IP Address of the instance being checked.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HealthCheckConfig withIPAddress(String iPAddress) {
        this.iPAddress = iPAddress;
        return this;
    }

    /**
     * Port on which connection will be opened to the instance to health
     * check. For HTTP this defaults to 80 if the port is not specified.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 65535<br/>
     *
     * @return Port on which connection will be opened to the instance to health
     *         check. For HTTP this defaults to 80 if the port is not specified.
     */
    public Integer getPort() {
        return port;
    }
    
    /**
     * Port on which connection will be opened to the instance to health
     * check. For HTTP this defaults to 80 if the port is not specified.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 65535<br/>
     *
     * @param port Port on which connection will be opened to the instance to health
     *         check. For HTTP this defaults to 80 if the port is not specified.
     */
    public void setPort(Integer port) {
        this.port = port;
    }
    
    /**
     * Port on which connection will be opened to the instance to health
     * check. For HTTP this defaults to 80 if the port is not specified.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 65535<br/>
     *
     * @param port Port on which connection will be opened to the instance to health
     *         check. For HTTP this defaults to 80 if the port is not specified.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HealthCheckConfig withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * The type of health check to be performed. Currently supported
     * protocols are TCP and HTTP.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HTTP, TCP
     *
     * @return The type of health check to be performed. Currently supported
     *         protocols are TCP and HTTP.
     *
     * @see HealthCheckType
     */
    public String getType() {
        return type;
    }
    
    /**
     * The type of health check to be performed. Currently supported
     * protocols are TCP and HTTP.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HTTP, TCP
     *
     * @param type The type of health check to be performed. Currently supported
     *         protocols are TCP and HTTP.
     *
     * @see HealthCheckType
     */
    public void setType(String type) {
        this.type = type;
    }
    
    /**
     * The type of health check to be performed. Currently supported
     * protocols are TCP and HTTP.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HTTP, TCP
     *
     * @param type The type of health check to be performed. Currently supported
     *         protocols are TCP and HTTP.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see HealthCheckType
     */
    public HealthCheckConfig withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * The type of health check to be performed. Currently supported
     * protocols are TCP and HTTP.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HTTP, TCP
     *
     * @param type The type of health check to be performed. Currently supported
     *         protocols are TCP and HTTP.
     *
     * @see HealthCheckType
     */
    public void setType(HealthCheckType type) {
        this.type = type.toString();
    }
    
    /**
     * The type of health check to be performed. Currently supported
     * protocols are TCP and HTTP.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HTTP, TCP
     *
     * @param type The type of health check to be performed. Currently supported
     *         protocols are TCP and HTTP.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see HealthCheckType
     */
    public HealthCheckConfig withType(HealthCheckType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * Path to ping on the instance to check the health. Required only for
     * HTTP health checks, HTTP request is issued to the instance on the
     * given port and path.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @return Path to ping on the instance to check the health. Required only for
     *         HTTP health checks, HTTP request is issued to the instance on the
     *         given port and path.
     */
    public String getResourcePath() {
        return resourcePath;
    }
    
    /**
     * Path to ping on the instance to check the health. Required only for
     * HTTP health checks, HTTP request is issued to the instance on the
     * given port and path.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @param resourcePath Path to ping on the instance to check the health. Required only for
     *         HTTP health checks, HTTP request is issued to the instance on the
     *         given port and path.
     */
    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }
    
    /**
     * Path to ping on the instance to check the health. Required only for
     * HTTP health checks, HTTP request is issued to the instance on the
     * given port and path.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @param resourcePath Path to ping on the instance to check the health. Required only for
     *         HTTP health checks, HTTP request is issued to the instance on the
     *         given port and path.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HealthCheckConfig withResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
        return this;
    }

    /**
     * Fully qualified domain name of the instance to be health checked.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @return Fully qualified domain name of the instance to be health checked.
     */
    public String getFullyQualifiedDomainName() {
        return fullyQualifiedDomainName;
    }
    
    /**
     * Fully qualified domain name of the instance to be health checked.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @param fullyQualifiedDomainName Fully qualified domain name of the instance to be health checked.
     */
    public void setFullyQualifiedDomainName(String fullyQualifiedDomainName) {
        this.fullyQualifiedDomainName = fullyQualifiedDomainName;
    }
    
    /**
     * Fully qualified domain name of the instance to be health checked.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @param fullyQualifiedDomainName Fully qualified domain name of the instance to be health checked.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HealthCheckConfig withFullyQualifiedDomainName(String fullyQualifiedDomainName) {
        this.fullyQualifiedDomainName = fullyQualifiedDomainName;
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
        if (getIPAddress() != null) sb.append("IPAddress: " + getIPAddress() + ",");
        if (getPort() != null) sb.append("Port: " + getPort() + ",");
        if (getType() != null) sb.append("Type: " + getType() + ",");
        if (getResourcePath() != null) sb.append("ResourcePath: " + getResourcePath() + ",");
        if (getFullyQualifiedDomainName() != null) sb.append("FullyQualifiedDomainName: " + getFullyQualifiedDomainName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getIPAddress() == null) ? 0 : getIPAddress().hashCode()); 
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode()); 
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode()); 
        hashCode = prime * hashCode + ((getResourcePath() == null) ? 0 : getResourcePath().hashCode()); 
        hashCode = prime * hashCode + ((getFullyQualifiedDomainName() == null) ? 0 : getFullyQualifiedDomainName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof HealthCheckConfig == false) return false;
        HealthCheckConfig other = (HealthCheckConfig)obj;
        
        if (other.getIPAddress() == null ^ this.getIPAddress() == null) return false;
        if (other.getIPAddress() != null && other.getIPAddress().equals(this.getIPAddress()) == false) return false; 
        if (other.getPort() == null ^ this.getPort() == null) return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false) return false; 
        if (other.getType() == null ^ this.getType() == null) return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false) return false; 
        if (other.getResourcePath() == null ^ this.getResourcePath() == null) return false;
        if (other.getResourcePath() != null && other.getResourcePath().equals(this.getResourcePath()) == false) return false; 
        if (other.getFullyQualifiedDomainName() == null ^ this.getFullyQualifiedDomainName() == null) return false;
        if (other.getFullyQualifiedDomainName() != null && other.getFullyQualifiedDomainName().equals(this.getFullyQualifiedDomainName()) == false) return false; 
        return true;
    }
    
}
    