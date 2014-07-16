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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.route53.AmazonRoute53#updateHealthCheck(UpdateHealthCheckRequest) UpdateHealthCheck operation}.
 * <p>
 * This action updates an existing health check.
 * </p>
 * <p>
 * To update a health check, send a <code>POST</code> request to the
 * <code>2013-05-27/healthcheck/health check ID </code> resource. The
 * request body must include an XML document with an
 * <code>UpdateHealthCheckRequest</code> element. The response returns an
 * <code>UpdateHealthCheckResponse</code> element, which contains
 * metadata about the health check.
 * </p>
 *
 * @see com.amazonaws.services.route53.AmazonRoute53#updateHealthCheck(UpdateHealthCheckRequest)
 */
public class UpdateHealthCheckRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The ID of the health check to update.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     */
    private String healthCheckId;

    /**
     * Optional. When you specify a health check version, Route 53 compares
     * this value with the current value in the health check, which prevents
     * you from updating the health check when the versions don't match.
     * Using <code>HealthCheckVersion</code> lets you prevent overwriting
     * another change to the health check.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Long healthCheckVersion;

    /**
     * The IP address of the resource that you want to check. <p>Specify this
     * value only if you want to change it.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 15<br/>
     * <b>Pattern: </b>^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$<br/>
     */
    private String iPAddress;

    /**
     * The port on which you want Route 53 to open a connection to perform
     * health checks. <p>Specify this value only if you want to change it.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 65535<br/>
     */
    private Integer port;

    /**
     * The path that you want Amazon Route 53 to request when performing
     * health checks. The path can be any value for which your endpoint will
     * return an HTTP status code of 2xx or 3xx when the endpoint is healthy,
     * for example the file /docs/route53-health-check.html. <p>Specify this
     * value only if you want to change it.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     */
    private String resourcePath;

    /**
     * Fully qualified domain name of the instance to be health checked.
     * <p>Specify this value only if you want to change it.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     */
    private String fullyQualifiedDomainName;

    /**
     * If the value of <code>Type</code> is <code>HTTP_STR_MATCH</code> or
     * <code>HTTP_STR_MATCH</code>, the string that you want Route 53 to
     * search for in the response body from the specified resource. If the
     * string appears in the response body, Route 53 considers the resource
     * healthy. <p>Specify this value only if you want to change it.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     */
    private String searchString;

    /**
     * The number of consecutive health checks that an endpoint must pass or
     * fail for Route 53 to change the current status of the endpoint from
     * unhealthy to healthy or vice versa. <p>Valid values are integers
     * between 1 and 10. For more information, see "How Amazon Route 53
     * Determines Whether an Endpoint Is Healthy" in the Amazon Route 53
     * Developer Guide. <p>Specify this value only if you want to change it.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     */
    private Integer failureThreshold;

    /**
     * The ID of the health check to update.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @return The ID of the health check to update.
     */
    public String getHealthCheckId() {
        return healthCheckId;
    }
    
    /**
     * The ID of the health check to update.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @param healthCheckId The ID of the health check to update.
     */
    public void setHealthCheckId(String healthCheckId) {
        this.healthCheckId = healthCheckId;
    }
    
    /**
     * The ID of the health check to update.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @param healthCheckId The ID of the health check to update.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateHealthCheckRequest withHealthCheckId(String healthCheckId) {
        this.healthCheckId = healthCheckId;
        return this;
    }

    /**
     * Optional. When you specify a health check version, Route 53 compares
     * this value with the current value in the health check, which prevents
     * you from updating the health check when the versions don't match.
     * Using <code>HealthCheckVersion</code> lets you prevent overwriting
     * another change to the health check.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return Optional. When you specify a health check version, Route 53 compares
     *         this value with the current value in the health check, which prevents
     *         you from updating the health check when the versions don't match.
     *         Using <code>HealthCheckVersion</code> lets you prevent overwriting
     *         another change to the health check.
     */
    public Long getHealthCheckVersion() {
        return healthCheckVersion;
    }
    
    /**
     * Optional. When you specify a health check version, Route 53 compares
     * this value with the current value in the health check, which prevents
     * you from updating the health check when the versions don't match.
     * Using <code>HealthCheckVersion</code> lets you prevent overwriting
     * another change to the health check.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param healthCheckVersion Optional. When you specify a health check version, Route 53 compares
     *         this value with the current value in the health check, which prevents
     *         you from updating the health check when the versions don't match.
     *         Using <code>HealthCheckVersion</code> lets you prevent overwriting
     *         another change to the health check.
     */
    public void setHealthCheckVersion(Long healthCheckVersion) {
        this.healthCheckVersion = healthCheckVersion;
    }
    
    /**
     * Optional. When you specify a health check version, Route 53 compares
     * this value with the current value in the health check, which prevents
     * you from updating the health check when the versions don't match.
     * Using <code>HealthCheckVersion</code> lets you prevent overwriting
     * another change to the health check.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param healthCheckVersion Optional. When you specify a health check version, Route 53 compares
     *         this value with the current value in the health check, which prevents
     *         you from updating the health check when the versions don't match.
     *         Using <code>HealthCheckVersion</code> lets you prevent overwriting
     *         another change to the health check.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateHealthCheckRequest withHealthCheckVersion(Long healthCheckVersion) {
        this.healthCheckVersion = healthCheckVersion;
        return this;
    }

    /**
     * The IP address of the resource that you want to check. <p>Specify this
     * value only if you want to change it.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 15<br/>
     * <b>Pattern: </b>^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$<br/>
     *
     * @return The IP address of the resource that you want to check. <p>Specify this
     *         value only if you want to change it.
     */
    public String getIPAddress() {
        return iPAddress;
    }
    
    /**
     * The IP address of the resource that you want to check. <p>Specify this
     * value only if you want to change it.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 15<br/>
     * <b>Pattern: </b>^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$<br/>
     *
     * @param iPAddress The IP address of the resource that you want to check. <p>Specify this
     *         value only if you want to change it.
     */
    public void setIPAddress(String iPAddress) {
        this.iPAddress = iPAddress;
    }
    
    /**
     * The IP address of the resource that you want to check. <p>Specify this
     * value only if you want to change it.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 15<br/>
     * <b>Pattern: </b>^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$<br/>
     *
     * @param iPAddress The IP address of the resource that you want to check. <p>Specify this
     *         value only if you want to change it.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateHealthCheckRequest withIPAddress(String iPAddress) {
        this.iPAddress = iPAddress;
        return this;
    }

    /**
     * The port on which you want Route 53 to open a connection to perform
     * health checks. <p>Specify this value only if you want to change it.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 65535<br/>
     *
     * @return The port on which you want Route 53 to open a connection to perform
     *         health checks. <p>Specify this value only if you want to change it.
     */
    public Integer getPort() {
        return port;
    }
    
    /**
     * The port on which you want Route 53 to open a connection to perform
     * health checks. <p>Specify this value only if you want to change it.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 65535<br/>
     *
     * @param port The port on which you want Route 53 to open a connection to perform
     *         health checks. <p>Specify this value only if you want to change it.
     */
    public void setPort(Integer port) {
        this.port = port;
    }
    
    /**
     * The port on which you want Route 53 to open a connection to perform
     * health checks. <p>Specify this value only if you want to change it.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 65535<br/>
     *
     * @param port The port on which you want Route 53 to open a connection to perform
     *         health checks. <p>Specify this value only if you want to change it.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateHealthCheckRequest withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * The path that you want Amazon Route 53 to request when performing
     * health checks. The path can be any value for which your endpoint will
     * return an HTTP status code of 2xx or 3xx when the endpoint is healthy,
     * for example the file /docs/route53-health-check.html. <p>Specify this
     * value only if you want to change it.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @return The path that you want Amazon Route 53 to request when performing
     *         health checks. The path can be any value for which your endpoint will
     *         return an HTTP status code of 2xx or 3xx when the endpoint is healthy,
     *         for example the file /docs/route53-health-check.html. <p>Specify this
     *         value only if you want to change it.
     */
    public String getResourcePath() {
        return resourcePath;
    }
    
    /**
     * The path that you want Amazon Route 53 to request when performing
     * health checks. The path can be any value for which your endpoint will
     * return an HTTP status code of 2xx or 3xx when the endpoint is healthy,
     * for example the file /docs/route53-health-check.html. <p>Specify this
     * value only if you want to change it.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @param resourcePath The path that you want Amazon Route 53 to request when performing
     *         health checks. The path can be any value for which your endpoint will
     *         return an HTTP status code of 2xx or 3xx when the endpoint is healthy,
     *         for example the file /docs/route53-health-check.html. <p>Specify this
     *         value only if you want to change it.
     */
    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }
    
    /**
     * The path that you want Amazon Route 53 to request when performing
     * health checks. The path can be any value for which your endpoint will
     * return an HTTP status code of 2xx or 3xx when the endpoint is healthy,
     * for example the file /docs/route53-health-check.html. <p>Specify this
     * value only if you want to change it.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @param resourcePath The path that you want Amazon Route 53 to request when performing
     *         health checks. The path can be any value for which your endpoint will
     *         return an HTTP status code of 2xx or 3xx when the endpoint is healthy,
     *         for example the file /docs/route53-health-check.html. <p>Specify this
     *         value only if you want to change it.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateHealthCheckRequest withResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
        return this;
    }

    /**
     * Fully qualified domain name of the instance to be health checked.
     * <p>Specify this value only if you want to change it.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @return Fully qualified domain name of the instance to be health checked.
     *         <p>Specify this value only if you want to change it.
     */
    public String getFullyQualifiedDomainName() {
        return fullyQualifiedDomainName;
    }
    
    /**
     * Fully qualified domain name of the instance to be health checked.
     * <p>Specify this value only if you want to change it.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @param fullyQualifiedDomainName Fully qualified domain name of the instance to be health checked.
     *         <p>Specify this value only if you want to change it.
     */
    public void setFullyQualifiedDomainName(String fullyQualifiedDomainName) {
        this.fullyQualifiedDomainName = fullyQualifiedDomainName;
    }
    
    /**
     * Fully qualified domain name of the instance to be health checked.
     * <p>Specify this value only if you want to change it.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @param fullyQualifiedDomainName Fully qualified domain name of the instance to be health checked.
     *         <p>Specify this value only if you want to change it.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateHealthCheckRequest withFullyQualifiedDomainName(String fullyQualifiedDomainName) {
        this.fullyQualifiedDomainName = fullyQualifiedDomainName;
        return this;
    }

    /**
     * If the value of <code>Type</code> is <code>HTTP_STR_MATCH</code> or
     * <code>HTTP_STR_MATCH</code>, the string that you want Route 53 to
     * search for in the response body from the specified resource. If the
     * string appears in the response body, Route 53 considers the resource
     * healthy. <p>Specify this value only if you want to change it.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @return If the value of <code>Type</code> is <code>HTTP_STR_MATCH</code> or
     *         <code>HTTP_STR_MATCH</code>, the string that you want Route 53 to
     *         search for in the response body from the specified resource. If the
     *         string appears in the response body, Route 53 considers the resource
     *         healthy. <p>Specify this value only if you want to change it.
     */
    public String getSearchString() {
        return searchString;
    }
    
    /**
     * If the value of <code>Type</code> is <code>HTTP_STR_MATCH</code> or
     * <code>HTTP_STR_MATCH</code>, the string that you want Route 53 to
     * search for in the response body from the specified resource. If the
     * string appears in the response body, Route 53 considers the resource
     * healthy. <p>Specify this value only if you want to change it.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @param searchString If the value of <code>Type</code> is <code>HTTP_STR_MATCH</code> or
     *         <code>HTTP_STR_MATCH</code>, the string that you want Route 53 to
     *         search for in the response body from the specified resource. If the
     *         string appears in the response body, Route 53 considers the resource
     *         healthy. <p>Specify this value only if you want to change it.
     */
    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }
    
    /**
     * If the value of <code>Type</code> is <code>HTTP_STR_MATCH</code> or
     * <code>HTTP_STR_MATCH</code>, the string that you want Route 53 to
     * search for in the response body from the specified resource. If the
     * string appears in the response body, Route 53 considers the resource
     * healthy. <p>Specify this value only if you want to change it.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @param searchString If the value of <code>Type</code> is <code>HTTP_STR_MATCH</code> or
     *         <code>HTTP_STR_MATCH</code>, the string that you want Route 53 to
     *         search for in the response body from the specified resource. If the
     *         string appears in the response body, Route 53 considers the resource
     *         healthy. <p>Specify this value only if you want to change it.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateHealthCheckRequest withSearchString(String searchString) {
        this.searchString = searchString;
        return this;
    }

    /**
     * The number of consecutive health checks that an endpoint must pass or
     * fail for Route 53 to change the current status of the endpoint from
     * unhealthy to healthy or vice versa. <p>Valid values are integers
     * between 1 and 10. For more information, see "How Amazon Route 53
     * Determines Whether an Endpoint Is Healthy" in the Amazon Route 53
     * Developer Guide. <p>Specify this value only if you want to change it.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     *
     * @return The number of consecutive health checks that an endpoint must pass or
     *         fail for Route 53 to change the current status of the endpoint from
     *         unhealthy to healthy or vice versa. <p>Valid values are integers
     *         between 1 and 10. For more information, see "How Amazon Route 53
     *         Determines Whether an Endpoint Is Healthy" in the Amazon Route 53
     *         Developer Guide. <p>Specify this value only if you want to change it.
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
     * Developer Guide. <p>Specify this value only if you want to change it.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     *
     * @param failureThreshold The number of consecutive health checks that an endpoint must pass or
     *         fail for Route 53 to change the current status of the endpoint from
     *         unhealthy to healthy or vice versa. <p>Valid values are integers
     *         between 1 and 10. For more information, see "How Amazon Route 53
     *         Determines Whether an Endpoint Is Healthy" in the Amazon Route 53
     *         Developer Guide. <p>Specify this value only if you want to change it.
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
     * Developer Guide. <p>Specify this value only if you want to change it.
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
     *         Developer Guide. <p>Specify this value only if you want to change it.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateHealthCheckRequest withFailureThreshold(Integer failureThreshold) {
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
        if (getHealthCheckId() != null) sb.append("HealthCheckId: " + getHealthCheckId() + ",");
        if (getHealthCheckVersion() != null) sb.append("HealthCheckVersion: " + getHealthCheckVersion() + ",");
        if (getIPAddress() != null) sb.append("IPAddress: " + getIPAddress() + ",");
        if (getPort() != null) sb.append("Port: " + getPort() + ",");
        if (getResourcePath() != null) sb.append("ResourcePath: " + getResourcePath() + ",");
        if (getFullyQualifiedDomainName() != null) sb.append("FullyQualifiedDomainName: " + getFullyQualifiedDomainName() + ",");
        if (getSearchString() != null) sb.append("SearchString: " + getSearchString() + ",");
        if (getFailureThreshold() != null) sb.append("FailureThreshold: " + getFailureThreshold() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getHealthCheckId() == null) ? 0 : getHealthCheckId().hashCode()); 
        hashCode = prime * hashCode + ((getHealthCheckVersion() == null) ? 0 : getHealthCheckVersion().hashCode()); 
        hashCode = prime * hashCode + ((getIPAddress() == null) ? 0 : getIPAddress().hashCode()); 
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode()); 
        hashCode = prime * hashCode + ((getResourcePath() == null) ? 0 : getResourcePath().hashCode()); 
        hashCode = prime * hashCode + ((getFullyQualifiedDomainName() == null) ? 0 : getFullyQualifiedDomainName().hashCode()); 
        hashCode = prime * hashCode + ((getSearchString() == null) ? 0 : getSearchString().hashCode()); 
        hashCode = prime * hashCode + ((getFailureThreshold() == null) ? 0 : getFailureThreshold().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateHealthCheckRequest == false) return false;
        UpdateHealthCheckRequest other = (UpdateHealthCheckRequest)obj;
        
        if (other.getHealthCheckId() == null ^ this.getHealthCheckId() == null) return false;
        if (other.getHealthCheckId() != null && other.getHealthCheckId().equals(this.getHealthCheckId()) == false) return false; 
        if (other.getHealthCheckVersion() == null ^ this.getHealthCheckVersion() == null) return false;
        if (other.getHealthCheckVersion() != null && other.getHealthCheckVersion().equals(this.getHealthCheckVersion()) == false) return false; 
        if (other.getIPAddress() == null ^ this.getIPAddress() == null) return false;
        if (other.getIPAddress() != null && other.getIPAddress().equals(this.getIPAddress()) == false) return false; 
        if (other.getPort() == null ^ this.getPort() == null) return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false) return false; 
        if (other.getResourcePath() == null ^ this.getResourcePath() == null) return false;
        if (other.getResourcePath() != null && other.getResourcePath().equals(this.getResourcePath()) == false) return false; 
        if (other.getFullyQualifiedDomainName() == null ^ this.getFullyQualifiedDomainName() == null) return false;
        if (other.getFullyQualifiedDomainName() != null && other.getFullyQualifiedDomainName().equals(this.getFullyQualifiedDomainName()) == false) return false; 
        if (other.getSearchString() == null ^ this.getSearchString() == null) return false;
        if (other.getSearchString() != null && other.getSearchString().equals(this.getSearchString()) == false) return false; 
        if (other.getFailureThreshold() == null ^ this.getFailureThreshold() == null) return false;
        if (other.getFailureThreshold() != null && other.getFailureThreshold().equals(this.getFailureThreshold()) == false) return false; 
        return true;
    }
    
}
    