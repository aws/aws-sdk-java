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
package com.amazonaws.services.route53.model;

import java.io.Serializable;

/**
 * <p>
 * A complex type that contains the health check configuration.
 * </p>
 */
public class HealthCheckConfig implements Serializable, Cloneable {

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
     * <b>Allowed Values: </b>HTTP, HTTPS, HTTP_STR_MATCH, HTTPS_STR_MATCH, TCP, CALCULATED
     */
    private String type;

    /**
     * Path to ping on the instance to check the health. Required for HTTP,
     * HTTPS, HTTP_STR_MATCH, and HTTPS_STR_MATCH health checks. The HTTP
     * request is issued to the instance on the given port and path.
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
     * The number of seconds between the time that Amazon Route 53 gets a
     * response from your endpoint and the time that it sends the next
     * health-check request. <p>Each Amazon Route 53 health checker makes
     * requests at this interval. Valid values are 10 and 30. The default
     * value is 30.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>10 - 30<br/>
     */
    private Integer requestInterval;

    /**
     * The number of consecutive health checks that an endpoint must pass or
     * fail for Amazon Route 53 to change the current status of the endpoint
     * from unhealthy to healthy or vice versa. <p>Valid values are integers
     * between 1 and 10. For more information, see "How Amazon Route 53
     * Determines Whether an Endpoint Is Healthy" in the Amazon Route 53
     * Developer Guide.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     */
    private Integer failureThreshold;

    /**
     * A Boolean value that indicates whether you want Amazon Route 53 to
     * measure the latency between health checkers in multiple AWS regions
     * and your endpoint and to display CloudWatch latency graphs in the
     * Amazon Route 53 console.
     */
    private Boolean measureLatency;

    /**
     * A boolean value that indicates whether the status of health check
     * should be inverted. For example, if a health check is healthy but
     * <code>Inverted</code> is <code>True</code>, then Amazon Route 53
     * considers the health check to be unhealthy.
     */
    private Boolean inverted;

    /**
     * The minimum number of child health checks that must be healthy for
     * Amazon Route 53 to consider the parent health check to be healthy.
     * Valid values are integers between 0 and 256, inclusive.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 256<br/>
     */
    private Integer healthThreshold;

    /**
     * For a specified parent health check, a list of
     * <code>HealthCheckId</code> values for the associated child health
     * checks.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> childHealthChecks;

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
     * <b>Allowed Values: </b>HTTP, HTTPS, HTTP_STR_MATCH, HTTPS_STR_MATCH, TCP, CALCULATED
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
     * <b>Allowed Values: </b>HTTP, HTTPS, HTTP_STR_MATCH, HTTPS_STR_MATCH, TCP, CALCULATED
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
     * <b>Allowed Values: </b>HTTP, HTTPS, HTTP_STR_MATCH, HTTPS_STR_MATCH, TCP, CALCULATED
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
     * <b>Allowed Values: </b>HTTP, HTTPS, HTTP_STR_MATCH, HTTPS_STR_MATCH, TCP, CALCULATED
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
     * <b>Allowed Values: </b>HTTP, HTTPS, HTTP_STR_MATCH, HTTPS_STR_MATCH, TCP, CALCULATED
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
     * HTTPS, HTTP_STR_MATCH, and HTTPS_STR_MATCH health checks. The HTTP
     * request is issued to the instance on the given port and path.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @return Path to ping on the instance to check the health. Required for HTTP,
     *         HTTPS, HTTP_STR_MATCH, and HTTPS_STR_MATCH health checks. The HTTP
     *         request is issued to the instance on the given port and path.
     */
    public String getResourcePath() {
        return resourcePath;
    }
    
    /**
     * Path to ping on the instance to check the health. Required for HTTP,
     * HTTPS, HTTP_STR_MATCH, and HTTPS_STR_MATCH health checks. The HTTP
     * request is issued to the instance on the given port and path.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @param resourcePath Path to ping on the instance to check the health. Required for HTTP,
     *         HTTPS, HTTP_STR_MATCH, and HTTPS_STR_MATCH health checks. The HTTP
     *         request is issued to the instance on the given port and path.
     */
    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }
    
    /**
     * Path to ping on the instance to check the health. Required for HTTP,
     * HTTPS, HTTP_STR_MATCH, and HTTPS_STR_MATCH health checks. The HTTP
     * request is issued to the instance on the given port and path.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @param resourcePath Path to ping on the instance to check the health. Required for HTTP,
     *         HTTPS, HTTP_STR_MATCH, and HTTPS_STR_MATCH health checks. The HTTP
     *         request is issued to the instance on the given port and path.
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
     * The number of seconds between the time that Amazon Route 53 gets a
     * response from your endpoint and the time that it sends the next
     * health-check request. <p>Each Amazon Route 53 health checker makes
     * requests at this interval. Valid values are 10 and 30. The default
     * value is 30.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>10 - 30<br/>
     *
     * @return The number of seconds between the time that Amazon Route 53 gets a
     *         response from your endpoint and the time that it sends the next
     *         health-check request. <p>Each Amazon Route 53 health checker makes
     *         requests at this interval. Valid values are 10 and 30. The default
     *         value is 30.
     */
    public Integer getRequestInterval() {
        return requestInterval;
    }
    
    /**
     * The number of seconds between the time that Amazon Route 53 gets a
     * response from your endpoint and the time that it sends the next
     * health-check request. <p>Each Amazon Route 53 health checker makes
     * requests at this interval. Valid values are 10 and 30. The default
     * value is 30.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>10 - 30<br/>
     *
     * @param requestInterval The number of seconds between the time that Amazon Route 53 gets a
     *         response from your endpoint and the time that it sends the next
     *         health-check request. <p>Each Amazon Route 53 health checker makes
     *         requests at this interval. Valid values are 10 and 30. The default
     *         value is 30.
     */
    public void setRequestInterval(Integer requestInterval) {
        this.requestInterval = requestInterval;
    }
    
    /**
     * The number of seconds between the time that Amazon Route 53 gets a
     * response from your endpoint and the time that it sends the next
     * health-check request. <p>Each Amazon Route 53 health checker makes
     * requests at this interval. Valid values are 10 and 30. The default
     * value is 30.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>10 - 30<br/>
     *
     * @param requestInterval The number of seconds between the time that Amazon Route 53 gets a
     *         response from your endpoint and the time that it sends the next
     *         health-check request. <p>Each Amazon Route 53 health checker makes
     *         requests at this interval. Valid values are 10 and 30. The default
     *         value is 30.
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
     * fail for Amazon Route 53 to change the current status of the endpoint
     * from unhealthy to healthy or vice versa. <p>Valid values are integers
     * between 1 and 10. For more information, see "How Amazon Route 53
     * Determines Whether an Endpoint Is Healthy" in the Amazon Route 53
     * Developer Guide.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     *
     * @return The number of consecutive health checks that an endpoint must pass or
     *         fail for Amazon Route 53 to change the current status of the endpoint
     *         from unhealthy to healthy or vice versa. <p>Valid values are integers
     *         between 1 and 10. For more information, see "How Amazon Route 53
     *         Determines Whether an Endpoint Is Healthy" in the Amazon Route 53
     *         Developer Guide.
     */
    public Integer getFailureThreshold() {
        return failureThreshold;
    }
    
    /**
     * The number of consecutive health checks that an endpoint must pass or
     * fail for Amazon Route 53 to change the current status of the endpoint
     * from unhealthy to healthy or vice versa. <p>Valid values are integers
     * between 1 and 10. For more information, see "How Amazon Route 53
     * Determines Whether an Endpoint Is Healthy" in the Amazon Route 53
     * Developer Guide.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     *
     * @param failureThreshold The number of consecutive health checks that an endpoint must pass or
     *         fail for Amazon Route 53 to change the current status of the endpoint
     *         from unhealthy to healthy or vice versa. <p>Valid values are integers
     *         between 1 and 10. For more information, see "How Amazon Route 53
     *         Determines Whether an Endpoint Is Healthy" in the Amazon Route 53
     *         Developer Guide.
     */
    public void setFailureThreshold(Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
    }
    
    /**
     * The number of consecutive health checks that an endpoint must pass or
     * fail for Amazon Route 53 to change the current status of the endpoint
     * from unhealthy to healthy or vice versa. <p>Valid values are integers
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
     *         fail for Amazon Route 53 to change the current status of the endpoint
     *         from unhealthy to healthy or vice versa. <p>Valid values are integers
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
     * A Boolean value that indicates whether you want Amazon Route 53 to
     * measure the latency between health checkers in multiple AWS regions
     * and your endpoint and to display CloudWatch latency graphs in the
     * Amazon Route 53 console.
     *
     * @return A Boolean value that indicates whether you want Amazon Route 53 to
     *         measure the latency between health checkers in multiple AWS regions
     *         and your endpoint and to display CloudWatch latency graphs in the
     *         Amazon Route 53 console.
     */
    public Boolean isMeasureLatency() {
        return measureLatency;
    }
    
    /**
     * A Boolean value that indicates whether you want Amazon Route 53 to
     * measure the latency between health checkers in multiple AWS regions
     * and your endpoint and to display CloudWatch latency graphs in the
     * Amazon Route 53 console.
     *
     * @param measureLatency A Boolean value that indicates whether you want Amazon Route 53 to
     *         measure the latency between health checkers in multiple AWS regions
     *         and your endpoint and to display CloudWatch latency graphs in the
     *         Amazon Route 53 console.
     */
    public void setMeasureLatency(Boolean measureLatency) {
        this.measureLatency = measureLatency;
    }
    
    /**
     * A Boolean value that indicates whether you want Amazon Route 53 to
     * measure the latency between health checkers in multiple AWS regions
     * and your endpoint and to display CloudWatch latency graphs in the
     * Amazon Route 53 console.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param measureLatency A Boolean value that indicates whether you want Amazon Route 53 to
     *         measure the latency between health checkers in multiple AWS regions
     *         and your endpoint and to display CloudWatch latency graphs in the
     *         Amazon Route 53 console.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public HealthCheckConfig withMeasureLatency(Boolean measureLatency) {
        this.measureLatency = measureLatency;
        return this;
    }

    /**
     * A Boolean value that indicates whether you want Amazon Route 53 to
     * measure the latency between health checkers in multiple AWS regions
     * and your endpoint and to display CloudWatch latency graphs in the
     * Amazon Route 53 console.
     *
     * @return A Boolean value that indicates whether you want Amazon Route 53 to
     *         measure the latency between health checkers in multiple AWS regions
     *         and your endpoint and to display CloudWatch latency graphs in the
     *         Amazon Route 53 console.
     */
    public Boolean getMeasureLatency() {
        return measureLatency;
    }

    /**
     * A boolean value that indicates whether the status of health check
     * should be inverted. For example, if a health check is healthy but
     * <code>Inverted</code> is <code>True</code>, then Amazon Route 53
     * considers the health check to be unhealthy.
     *
     * @return A boolean value that indicates whether the status of health check
     *         should be inverted. For example, if a health check is healthy but
     *         <code>Inverted</code> is <code>True</code>, then Amazon Route 53
     *         considers the health check to be unhealthy.
     */
    public Boolean isInverted() {
        return inverted;
    }
    
    /**
     * A boolean value that indicates whether the status of health check
     * should be inverted. For example, if a health check is healthy but
     * <code>Inverted</code> is <code>True</code>, then Amazon Route 53
     * considers the health check to be unhealthy.
     *
     * @param inverted A boolean value that indicates whether the status of health check
     *         should be inverted. For example, if a health check is healthy but
     *         <code>Inverted</code> is <code>True</code>, then Amazon Route 53
     *         considers the health check to be unhealthy.
     */
    public void setInverted(Boolean inverted) {
        this.inverted = inverted;
    }
    
    /**
     * A boolean value that indicates whether the status of health check
     * should be inverted. For example, if a health check is healthy but
     * <code>Inverted</code> is <code>True</code>, then Amazon Route 53
     * considers the health check to be unhealthy.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param inverted A boolean value that indicates whether the status of health check
     *         should be inverted. For example, if a health check is healthy but
     *         <code>Inverted</code> is <code>True</code>, then Amazon Route 53
     *         considers the health check to be unhealthy.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public HealthCheckConfig withInverted(Boolean inverted) {
        this.inverted = inverted;
        return this;
    }

    /**
     * A boolean value that indicates whether the status of health check
     * should be inverted. For example, if a health check is healthy but
     * <code>Inverted</code> is <code>True</code>, then Amazon Route 53
     * considers the health check to be unhealthy.
     *
     * @return A boolean value that indicates whether the status of health check
     *         should be inverted. For example, if a health check is healthy but
     *         <code>Inverted</code> is <code>True</code>, then Amazon Route 53
     *         considers the health check to be unhealthy.
     */
    public Boolean getInverted() {
        return inverted;
    }

    /**
     * The minimum number of child health checks that must be healthy for
     * Amazon Route 53 to consider the parent health check to be healthy.
     * Valid values are integers between 0 and 256, inclusive.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 256<br/>
     *
     * @return The minimum number of child health checks that must be healthy for
     *         Amazon Route 53 to consider the parent health check to be healthy.
     *         Valid values are integers between 0 and 256, inclusive.
     */
    public Integer getHealthThreshold() {
        return healthThreshold;
    }
    
    /**
     * The minimum number of child health checks that must be healthy for
     * Amazon Route 53 to consider the parent health check to be healthy.
     * Valid values are integers between 0 and 256, inclusive.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 256<br/>
     *
     * @param healthThreshold The minimum number of child health checks that must be healthy for
     *         Amazon Route 53 to consider the parent health check to be healthy.
     *         Valid values are integers between 0 and 256, inclusive.
     */
    public void setHealthThreshold(Integer healthThreshold) {
        this.healthThreshold = healthThreshold;
    }
    
    /**
     * The minimum number of child health checks that must be healthy for
     * Amazon Route 53 to consider the parent health check to be healthy.
     * Valid values are integers between 0 and 256, inclusive.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 256<br/>
     *
     * @param healthThreshold The minimum number of child health checks that must be healthy for
     *         Amazon Route 53 to consider the parent health check to be healthy.
     *         Valid values are integers between 0 and 256, inclusive.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public HealthCheckConfig withHealthThreshold(Integer healthThreshold) {
        this.healthThreshold = healthThreshold;
        return this;
    }

    /**
     * For a specified parent health check, a list of
     * <code>HealthCheckId</code> values for the associated child health
     * checks.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @return For a specified parent health check, a list of
     *         <code>HealthCheckId</code> values for the associated child health
     *         checks.
     */
    public java.util.List<String> getChildHealthChecks() {
        if (childHealthChecks == null) {
              childHealthChecks = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              childHealthChecks.setAutoConstruct(true);
        }
        return childHealthChecks;
    }
    
    /**
     * For a specified parent health check, a list of
     * <code>HealthCheckId</code> values for the associated child health
     * checks.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param childHealthChecks For a specified parent health check, a list of
     *         <code>HealthCheckId</code> values for the associated child health
     *         checks.
     */
    public void setChildHealthChecks(java.util.Collection<String> childHealthChecks) {
        if (childHealthChecks == null) {
            this.childHealthChecks = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> childHealthChecksCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(childHealthChecks.size());
        childHealthChecksCopy.addAll(childHealthChecks);
        this.childHealthChecks = childHealthChecksCopy;
    }
    
    /**
     * For a specified parent health check, a list of
     * <code>HealthCheckId</code> values for the associated child health
     * checks.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setChildHealthChecks(java.util.Collection)} or
     * {@link #withChildHealthChecks(java.util.Collection)} if you want to
     * override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param childHealthChecks For a specified parent health check, a list of
     *         <code>HealthCheckId</code> values for the associated child health
     *         checks.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public HealthCheckConfig withChildHealthChecks(String... childHealthChecks) {
        if (getChildHealthChecks() == null) setChildHealthChecks(new java.util.ArrayList<String>(childHealthChecks.length));
        for (String value : childHealthChecks) {
            getChildHealthChecks().add(value);
        }
        return this;
    }
    
    /**
     * For a specified parent health check, a list of
     * <code>HealthCheckId</code> values for the associated child health
     * checks.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param childHealthChecks For a specified parent health check, a list of
     *         <code>HealthCheckId</code> values for the associated child health
     *         checks.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public HealthCheckConfig withChildHealthChecks(java.util.Collection<String> childHealthChecks) {
        if (childHealthChecks == null) {
            this.childHealthChecks = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> childHealthChecksCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(childHealthChecks.size());
            childHealthChecksCopy.addAll(childHealthChecks);
            this.childHealthChecks = childHealthChecksCopy;
        }

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
        if (getFailureThreshold() != null) sb.append("FailureThreshold: " + getFailureThreshold() + ",");
        if (isMeasureLatency() != null) sb.append("MeasureLatency: " + isMeasureLatency() + ",");
        if (isInverted() != null) sb.append("Inverted: " + isInverted() + ",");
        if (getHealthThreshold() != null) sb.append("HealthThreshold: " + getHealthThreshold() + ",");
        if (getChildHealthChecks() != null) sb.append("ChildHealthChecks: " + getChildHealthChecks() );
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
        hashCode = prime * hashCode + ((isMeasureLatency() == null) ? 0 : isMeasureLatency().hashCode()); 
        hashCode = prime * hashCode + ((isInverted() == null) ? 0 : isInverted().hashCode()); 
        hashCode = prime * hashCode + ((getHealthThreshold() == null) ? 0 : getHealthThreshold().hashCode()); 
        hashCode = prime * hashCode + ((getChildHealthChecks() == null) ? 0 : getChildHealthChecks().hashCode()); 
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
        if (other.isMeasureLatency() == null ^ this.isMeasureLatency() == null) return false;
        if (other.isMeasureLatency() != null && other.isMeasureLatency().equals(this.isMeasureLatency()) == false) return false; 
        if (other.isInverted() == null ^ this.isInverted() == null) return false;
        if (other.isInverted() != null && other.isInverted().equals(this.isInverted()) == false) return false; 
        if (other.getHealthThreshold() == null ^ this.getHealthThreshold() == null) return false;
        if (other.getHealthThreshold() != null && other.getHealthThreshold().equals(this.getHealthThreshold()) == false) return false; 
        if (other.getChildHealthChecks() == null ^ this.getChildHealthChecks() == null) return false;
        if (other.getChildHealthChecks() != null && other.getChildHealthChecks().equals(this.getChildHealthChecks()) == false) return false; 
        return true;
    }
    
    @Override
    public HealthCheckConfig clone() {
        try {
            return (HealthCheckConfig) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    