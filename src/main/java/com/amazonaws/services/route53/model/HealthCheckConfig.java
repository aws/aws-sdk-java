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
     * check. For HTTP and HTTP_STR_MATCH this defaults to 80 if the port is
     * not specified. For HTTPS and HTTPS_STR_MATCH this defaults to 443 if
     * the port is not specified.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 65535<br/>
     */
    private Integer port;

    /**
     * The type of health check to be performed. Currently supported types
     * are TCP, HTTP, HTTPS, HTTP_STR_MATCH, and HTTPS_STR_MATCH.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HTTP, HTTPS, HTTP_STR_MATCH, HTTPS_STR_MATCH, TCP
     */
    private String type;

    /**
     * Path to ping on the instance to check the health. Required for HTTP,
     * HTTPS, HTTP_STR_MATCH, and HTTPS_STR_MATCH health checks, HTTP request
     * is issued to the instance on the given port and path.
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
     * A string to search for in the body of a health check response.
     * Required for HTTP_STR_MATCH and HTTPS_STR_MATCH health checks.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     */
    private String searchString;

    /**
     * The number of seconds between the time that Route 53 gets a response
     * from your endpoint and the time that it sends the next health-check
     * request. <p>Each Route 53 health checker makes requests at this
     * interval. Valid values are 10 and 30. The default value is 30.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>10 - 30<br/>
     */
    private Integer requestInterval;

    /**
     * The number of consecutive health checks that an endpoint must pass or
     * fail for Route 53 to change the current status of the endpoint from
     * unhealthy to healthy or vice versa. <p>Valid values are integers
     * between 1 and 10. For more information, see "How Amazon Route 53
     * Determines Whether an Endpoint Is Healthy" in the Amazon Route 53
     * Developer Guide.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     */
    private Integer failureThreshold;

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
     * check. For HTTP and HTTP_STR_MATCH this defaults to 80 if the port is
     * not specified. For HTTPS and HTTPS_STR_MATCH this defaults to 443 if
     * the port is not specified.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 65535<br/>
     *
     * @return Port on which connection will be opened to the instance to health
     *         check. For HTTP and HTTP_STR_MATCH this defaults to 80 if the port is
     *         not specified. For HTTPS and HTTPS_STR_MATCH this defaults to 443 if
     *         the port is not specified.
     */
    public Integer getPort() {
        return port;
    }
    
    /**
     * Port on which connection will be opened to the instance to health
     * check. For HTTP and HTTP_STR_MATCH this defaults to 80 if the port is
     * not specified. For HTTPS and HTTPS_STR_MATCH this defaults to 443 if
     * the port is not specified.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 65535<br/>
     *
     * @param port Port on which connection will be opened to the instance to health
     *         check. For HTTP and HTTP_STR_MATCH this defaults to 80 if the port is
     *         not specified. For HTTPS and HTTPS_STR_MATCH this defaults to 443 if
     *         the port is not specified.
     */
    public void setPort(Integer port) {
        this.port = port;
    }
    
    /**
     * Port on which connection will be opened to the instance to health
     * check. For HTTP and HTTP_STR_MATCH this defaults to 80 if the port is
     * not specified. For HTTPS and HTTPS_STR_MATCH this defaults to 443 if
     * the port is not specified.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 65535<br/>
     *
     * @param port Port on which connection will be opened to the instance to health
     *         check. For HTTP and HTTP_STR_MATCH this defaults to 80 if the port is
     *         not specified. For HTTPS and HTTPS_STR_MATCH this defaults to 443 if
     *         the port is not specified.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public HealthCheckConfig withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * The type of health check to be performed. Currently supported types
     * are TCP, HTTP, HTTPS, HTTP_STR_MATCH, and HTTPS_STR_MATCH.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HTTP, HTTPS, HTTP_STR_MATCH, HTTPS_STR_MATCH, TCP
     *
     * @return The type of health check to be performed. Currently supported types
     *         are TCP, HTTP, HTTPS, HTTP_STR_MATCH, and HTTPS_STR_MATCH.
     *
     * @see HealthCheckType
     */
    public String getType() {
        return type;
    }
    
    /**
     * The type of health check to be performed. Currently supported types
     * are TCP, HTTP, HTTPS, HTTP_STR_MATCH, and HTTPS_STR_MATCH.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HTTP, HTTPS, HTTP_STR_MATCH, HTTPS_STR_MATCH, TCP
     *
     * @param type The type of health check to be performed. Currently supported types
     *         are TCP, HTTP, HTTPS, HTTP_STR_MATCH, and HTTPS_STR_MATCH.
     *
     * @see HealthCheckType
     */
    public void setType(String type) {
        this.type = type;
    }
    
    /**
     * The type of health check to be performed. Currently supported types
     * are TCP, HTTP, HTTPS, HTTP_STR_MATCH, and HTTPS_STR_MATCH.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HTTP, HTTPS, HTTP_STR_MATCH, HTTPS_STR_MATCH, TCP
     *
     * @param type The type of health check to be performed. Currently supported types
     *         are TCP, HTTP, HTTPS, HTTP_STR_MATCH, and HTTPS_STR_MATCH.
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
     * The type of health check to be performed. Currently supported types
     * are TCP, HTTP, HTTPS, HTTP_STR_MATCH, and HTTPS_STR_MATCH.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HTTP, HTTPS, HTTP_STR_MATCH, HTTPS_STR_MATCH, TCP
     *
     * @param type The type of health check to be performed. Currently supported types
     *         are TCP, HTTP, HTTPS, HTTP_STR_MATCH, and HTTPS_STR_MATCH.
     *
     * @see HealthCheckType
     */
    public void setType(HealthCheckType type) {
        this.type = type.toString();
    }
    
    /**
     * The type of health check to be performed. Currently supported types
     * are TCP, HTTP, HTTPS, HTTP_STR_MATCH, and HTTPS_STR_MATCH.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HTTP, HTTPS, HTTP_STR_MATCH, HTTPS_STR_MATCH, TCP
     *
     * @param type The type of health check to be performed. Currently supported types
     *         are TCP, HTTP, HTTPS, HTTP_STR_MATCH, and HTTPS_STR_MATCH.
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
     * Path to ping on the instance to check the health. Required for HTTP,
     * HTTPS, HTTP_STR_MATCH, and HTTPS_STR_MATCH health checks, HTTP request
     * is issued to the instance on the given port and path.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @return Path to ping on the instance to check the health. Required for HTTP,
     *         HTTPS, HTTP_STR_MATCH, and HTTPS_STR_MATCH health checks, HTTP request
     *         is issued to the instance on the given port and path.
     */
    public String getResourcePath() {
        return resourcePath;
    }
    
    /**
     * Path to ping on the instance to check the health. Required for HTTP,
     * HTTPS, HTTP_STR_MATCH, and HTTPS_STR_MATCH health checks, HTTP request
     * is issued to the instance on the given port and path.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @param resourcePath Path to ping on the instance to check the health. Required for HTTP,
     *         HTTPS, HTTP_STR_MATCH, and HTTPS_STR_MATCH health checks, HTTP request
     *         is issued to the instance on the given port and path.
     */
    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }
    
    /**
     * Path to ping on the instance to check the health. Required for HTTP,
     * HTTPS, HTTP_STR_MATCH, and HTTPS_STR_MATCH health checks, HTTP request
     * is issued to the instance on the given port and path.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @param resourcePath Path to ping on the instance to check the health. Required for HTTP,
     *         HTTPS, HTTP_STR_MATCH, and HTTPS_STR_MATCH health checks, HTTP request
     *         is issued to the instance on the given port and path.
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
     * A string to search for in the body of a health check response.
     * Required for HTTP_STR_MATCH and HTTPS_STR_MATCH health checks.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @return A string to search for in the body of a health check response.
     *         Required for HTTP_STR_MATCH and HTTPS_STR_MATCH health checks.
     */
    public String getSearchString() {
        return searchString;
    }
    
    /**
     * A string to search for in the body of a health check response.
     * Required for HTTP_STR_MATCH and HTTPS_STR_MATCH health checks.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @param searchString A string to search for in the body of a health check response.
     *         Required for HTTP_STR_MATCH and HTTPS_STR_MATCH health checks.
     */
    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }
    
    /**
     * A string to search for in the body of a health check response.
     * Required for HTTP_STR_MATCH and HTTPS_STR_MATCH health checks.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @param searchString A string to search for in the body of a health check response.
     *         Required for HTTP_STR_MATCH and HTTPS_STR_MATCH health checks.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public HealthCheckConfig withSearchString(String searchString) {
        this.searchString = searchString;
        return this;
    }

    /**
     * The number of seconds between the time that Route 53 gets a response
     * from your endpoint and the time that it sends the next health-check
     * request. <p>Each Route 53 health checker makes requests at this
     * interval. Valid values are 10 and 30. The default value is 30.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>10 - 30<br/>
     *
     * @return The number of seconds between the time that Route 53 gets a response
     *         from your endpoint and the time that it sends the next health-check
     *         request. <p>Each Route 53 health checker makes requests at this
     *         interval. Valid values are 10 and 30. The default value is 30.
     */
    public Integer getRequestInterval() {
        return requestInterval;
    }
    
    /**
     * The number of seconds between the time that Route 53 gets a response
     * from your endpoint and the time that it sends the next health-check
     * request. <p>Each Route 53 health checker makes requests at this
     * interval. Valid values are 10 and 30. The default value is 30.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>10 - 30<br/>
     *
     * @param requestInterval The number of seconds between the time that Route 53 gets a response
     *         from your endpoint and the time that it sends the next health-check
     *         request. <p>Each Route 53 health checker makes requests at this
     *         interval. Valid values are 10 and 30. The default value is 30.
     */
    public void setRequestInterval(Integer requestInterval) {
        this.requestInterval = requestInterval;
    }
    
    /**
     * The number of seconds between the time that Route 53 gets a response
     * from your endpoint and the time that it sends the next health-check
     * request. <p>Each Route 53 health checker makes requests at this
     * interval. Valid values are 10 and 30. The default value is 30.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>10 - 30<br/>
     *
     * @param requestInterval The number of seconds between the time that Route 53 gets a response
     *         from your endpoint and the time that it sends the next health-check
     *         request. <p>Each Route 53 health checker makes requests at this
     *         interval. Valid values are 10 and 30. The default value is 30.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public HealthCheckConfig withRequestInterval(Integer requestInterval) {
        this.requestInterval = requestInterval;
        return this;
    }

    /**
     * The number of consecutive health checks that an endpoint must pass or
     * fail for Route 53 to change the current status of the endpoint from
     * unhealthy to healthy or vice versa. <p>Valid values are integers
     * between 1 and 10. For more information, see "How Amazon Route 53
     * Determines Whether an Endpoint Is Healthy" in the Amazon Route 53
     * Developer Guide.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     *
     * @return The number of consecutive health checks that an endpoint must pass or
     *         fail for Route 53 to change the current status of the endpoint from
     *         unhealthy to healthy or vice versa. <p>Valid values are integers
     *         between 1 and 10. For more information, see "How Amazon Route 53
     *         Determines Whether an Endpoint Is Healthy" in the Amazon Route 53
     *         Developer Guide.
     */
    public Integer getFailureThreshold() {
        return failureThreshold;
    }
    
    /**
     * The number of consecutive health checks that an endpoint must pass or
     * fail for Route 53 to change the current status of the endpoint from
     * unhealthy to healthy or vice versa. <p>Valid values are integers
     * between 1 and 10. For more information, see "How Amazon Route 53
     * Determines Whether an Endpoint Is Healthy" in the Amazon Route 53
     * Developer Guide.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     *
     * @param failureThreshold The number of consecutive health checks that an endpoint must pass or
     *         fail for Route 53 to change the current status of the endpoint from
     *         unhealthy to healthy or vice versa. <p>Valid values are integers
     *         between 1 and 10. For more information, see "How Amazon Route 53
     *         Determines Whether an Endpoint Is Healthy" in the Amazon Route 53
     *         Developer Guide.
     */
    public void setFailureThreshold(Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
    }
    
    /**
     * The number of consecutive health checks that an endpoint must pass or
     * fail for Route 53 to change the current status of the endpoint from
     * unhealthy to healthy or vice versa. <p>Valid values are integers
     * between 1 and 10. For more information, see "How Amazon Route 53
     * Determines Whether an Endpoint Is Healthy" in the Amazon Route 53
     * Developer Guide.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     *
     * @param failureThreshold The number of consecutive health checks that an endpoint must pass or
     *         fail for Route 53 to change the current status of the endpoint from
     *         unhealthy to healthy or vice versa. <p>Valid values are integers
     *         between 1 and 10. For more information, see "How Amazon Route 53
     *         Determines Whether an Endpoint Is Healthy" in the Amazon Route 53
     *         Developer Guide.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public HealthCheckConfig withFailureThreshold(Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
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
        if (getFullyQualifiedDomainName() != null) sb.append("FullyQualifiedDomainName: " + getFullyQualifiedDomainName() + ",");
        if (getSearchString() != null) sb.append("SearchString: " + getSearchString() + ",");
        if (getRequestInterval() != null) sb.append("RequestInterval: " + getRequestInterval() + ",");
        if (getFailureThreshold() != null) sb.append("FailureThreshold: " + getFailureThreshold() );
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
        hashCode = prime * hashCode + ((getSearchString() == null) ? 0 : getSearchString().hashCode()); 
        hashCode = prime * hashCode + ((getRequestInterval() == null) ? 0 : getRequestInterval().hashCode()); 
        hashCode = prime * hashCode + ((getFailureThreshold() == null) ? 0 : getFailureThreshold().hashCode()); 
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
        if (other.getSearchString() == null ^ this.getSearchString() == null) return false;
        if (other.getSearchString() != null && other.getSearchString().equals(this.getSearchString()) == false) return false; 
        if (other.getRequestInterval() == null ^ this.getRequestInterval() == null) return false;
        if (other.getRequestInterval() != null && other.getRequestInterval().equals(this.getRequestInterval()) == false) return false; 
        if (other.getFailureThreshold() == null ^ this.getFailureThreshold() == null) return false;
        if (other.getFailureThreshold() != null && other.getFailureThreshold().equals(this.getFailureThreshold()) == false) return false; 
        return true;
    }
    
}
    