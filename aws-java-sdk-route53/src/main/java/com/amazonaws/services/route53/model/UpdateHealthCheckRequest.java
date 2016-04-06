/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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
 * <p>>
 * A complex type that contains information about the request to update a health
 * check.
 * </p>
 */
public class UpdateHealthCheckRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * The ID of the health check to update.
     * </p>
     */
    private String healthCheckId;
    /**
     * <p>
     * Optional. When you specify a health check version, Amazon Route 53
     * compares this value with the current value in the health check, which
     * prevents you from updating the health check when the versions don't
     * match. Using <code>HealthCheckVersion</code> lets you prevent overwriting
     * another change to the health check.
     * </p>
     */
    private Long healthCheckVersion;
    /**
     * <p>
     * The IP address of the resource that you want to check.
     * </p>
     * <p>
     * Specify this value only if you want to change it.
     * </p>
     */
    private String iPAddress;
    /**
     * <p>
     * The port on which you want Amazon Route 53 to open a connection to
     * perform health checks.
     * </p>
     * <p>
     * Specify this value only if you want to change it.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * The path that you want Amazon Route 53 to request when performing health
     * checks. The path can be any value for which your endpoint will return an
     * HTTP status code of 2xx or 3xx when the endpoint is healthy, for example
     * the file /docs/route53-health-check.html.
     * </p>
     * <p>
     * Specify this value only if you want to change it.
     * </p>
     */
    private String resourcePath;
    /**
     * <p>
     * Fully qualified domain name of the instance to be health checked.
     * </p>
     * <p>
     * Specify this value only if you want to change it.
     * </p>
     */
    private String fullyQualifiedDomainName;
    /**
     * <p>
     * If the value of <code>Type</code> is <code>HTTP_STR_MATCH</code> or
     * <code>HTTP_STR_MATCH</code>, the string that you want Amazon Route 53 to
     * search for in the response body from the specified resource. If the
     * string appears in the response body, Amazon Route 53 considers the
     * resource healthy. Amazon Route 53 considers case when searching for
     * <code>SearchString</code> in the response body.
     * </p>
     * <p>
     * Specify this value only if you want to change it.
     * </p>
     */
    private String searchString;
    /**
     * <p>
     * The number of consecutive health checks that an endpoint must pass or
     * fail for Amazon Route 53 to change the current status of the endpoint
     * from unhealthy to healthy or vice versa.
     * </p>
     * <p>
     * Valid values are integers between 1 and 10. For more information, see
     * "How Amazon Route 53 Determines Whether an Endpoint Is Healthy" in the
     * Amazon Route 53 Developer Guide.
     * </p>
     * <p>
     * Specify this value only if you want to change it.
     * </p>
     */
    private Integer failureThreshold;
    /**
     * <p>
     * A boolean value that indicates whether the status of health check should
     * be inverted. For example, if a health check is healthy but
     * <code>Inverted</code> is <code>True</code>, then Amazon Route 53
     * considers the health check to be unhealthy.
     * </p>
     * <p>
     * Specify this value only if you want to change it.
     * </p>
     */
    private Boolean inverted;
    /**
     * <p>
     * The minimum number of child health checks that must be healthy for Amazon
     * Route 53 to consider the parent health check to be healthy. Valid values
     * are integers between 0 and 256, inclusive.
     * </p>
     * <p>
     * Specify this value only if you want to change it.
     * </p>
     */
    private Integer healthThreshold;
    /**
     * <p>
     * For a specified parent health check, a list of <code>HealthCheckId</code>
     * values for the associated child health checks.
     * </p>
     * <p>
     * Specify this value only if you want to change it.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> childHealthChecks;
    /**
     * <p>
     * Specify whether you want Amazon Route 53 to send the value of
     * <code>FullyQualifiedDomainName</code> to the endpoint in the
     * <code>client_hello</code> message during TLS negotiation. If you don't
     * specify a value for <code>EnableSNI</code>, Amazon Route 53 defaults to
     * <code>true</code> when <code>Type</code> is <code>HTTPS</code> or
     * <code>HTTPS_STR_MATCH</code> and defaults to <code>false</code> when
     * <code>Type</code> is any other value.
     * </p>
     * <p>
     * Specify this value only if you want to change it.
     * </p>
     */
    private Boolean enableSNI;
    /**
     * <p>
     * A list of <code>HealthCheckRegion</code> values that specify the Amazon
     * EC2 regions that you want Amazon Route 53 to use to perform health
     * checks. You must specify at least three regions.
     * </p>
     * <note>When you remove a region from the list, Amazon Route 53 will
     * briefly continue to check your endpoint from that region.</note>
     * <p>
     * Specify this value only if you want to change it.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> regions;

    private AlarmIdentifier alarmIdentifier;

    private String insufficientDataHealthStatus;

    /**
     * <p>
     * The ID of the health check to update.
     * </p>
     * 
     * @param healthCheckId
     *        The ID of the health check to update.
     */

    public void setHealthCheckId(String healthCheckId) {
        this.healthCheckId = healthCheckId;
    }

    /**
     * <p>
     * The ID of the health check to update.
     * </p>
     * 
     * @return The ID of the health check to update.
     */

    public String getHealthCheckId() {
        return this.healthCheckId;
    }

    /**
     * <p>
     * The ID of the health check to update.
     * </p>
     * 
     * @param healthCheckId
     *        The ID of the health check to update.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateHealthCheckRequest withHealthCheckId(String healthCheckId) {
        setHealthCheckId(healthCheckId);
        return this;
    }

    /**
     * <p>
     * Optional. When you specify a health check version, Amazon Route 53
     * compares this value with the current value in the health check, which
     * prevents you from updating the health check when the versions don't
     * match. Using <code>HealthCheckVersion</code> lets you prevent overwriting
     * another change to the health check.
     * </p>
     * 
     * @param healthCheckVersion
     *        Optional. When you specify a health check version, Amazon Route 53
     *        compares this value with the current value in the health check,
     *        which prevents you from updating the health check when the
     *        versions don't match. Using <code>HealthCheckVersion</code> lets
     *        you prevent overwriting another change to the health check.
     */

    public void setHealthCheckVersion(Long healthCheckVersion) {
        this.healthCheckVersion = healthCheckVersion;
    }

    /**
     * <p>
     * Optional. When you specify a health check version, Amazon Route 53
     * compares this value with the current value in the health check, which
     * prevents you from updating the health check when the versions don't
     * match. Using <code>HealthCheckVersion</code> lets you prevent overwriting
     * another change to the health check.
     * </p>
     * 
     * @return Optional. When you specify a health check version, Amazon Route
     *         53 compares this value with the current value in the health
     *         check, which prevents you from updating the health check when the
     *         versions don't match. Using <code>HealthCheckVersion</code> lets
     *         you prevent overwriting another change to the health check.
     */

    public Long getHealthCheckVersion() {
        return this.healthCheckVersion;
    }

    /**
     * <p>
     * Optional. When you specify a health check version, Amazon Route 53
     * compares this value with the current value in the health check, which
     * prevents you from updating the health check when the versions don't
     * match. Using <code>HealthCheckVersion</code> lets you prevent overwriting
     * another change to the health check.
     * </p>
     * 
     * @param healthCheckVersion
     *        Optional. When you specify a health check version, Amazon Route 53
     *        compares this value with the current value in the health check,
     *        which prevents you from updating the health check when the
     *        versions don't match. Using <code>HealthCheckVersion</code> lets
     *        you prevent overwriting another change to the health check.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateHealthCheckRequest withHealthCheckVersion(
            Long healthCheckVersion) {
        setHealthCheckVersion(healthCheckVersion);
        return this;
    }

    /**
     * <p>
     * The IP address of the resource that you want to check.
     * </p>
     * <p>
     * Specify this value only if you want to change it.
     * </p>
     * 
     * @param iPAddress
     *        The IP address of the resource that you want to check.</p>
     *        <p>
     *        Specify this value only if you want to change it.
     */

    public void setIPAddress(String iPAddress) {
        this.iPAddress = iPAddress;
    }

    /**
     * <p>
     * The IP address of the resource that you want to check.
     * </p>
     * <p>
     * Specify this value only if you want to change it.
     * </p>
     * 
     * @return The IP address of the resource that you want to check.</p>
     *         <p>
     *         Specify this value only if you want to change it.
     */

    public String getIPAddress() {
        return this.iPAddress;
    }

    /**
     * <p>
     * The IP address of the resource that you want to check.
     * </p>
     * <p>
     * Specify this value only if you want to change it.
     * </p>
     * 
     * @param iPAddress
     *        The IP address of the resource that you want to check.</p>
     *        <p>
     *        Specify this value only if you want to change it.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateHealthCheckRequest withIPAddress(String iPAddress) {
        setIPAddress(iPAddress);
        return this;
    }

    /**
     * <p>
     * The port on which you want Amazon Route 53 to open a connection to
     * perform health checks.
     * </p>
     * <p>
     * Specify this value only if you want to change it.
     * </p>
     * 
     * @param port
     *        The port on which you want Amazon Route 53 to open a connection to
     *        perform health checks.</p>
     *        <p>
     *        Specify this value only if you want to change it.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port on which you want Amazon Route 53 to open a connection to
     * perform health checks.
     * </p>
     * <p>
     * Specify this value only if you want to change it.
     * </p>
     * 
     * @return The port on which you want Amazon Route 53 to open a connection
     *         to perform health checks.</p>
     *         <p>
     *         Specify this value only if you want to change it.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port on which you want Amazon Route 53 to open a connection to
     * perform health checks.
     * </p>
     * <p>
     * Specify this value only if you want to change it.
     * </p>
     * 
     * @param port
     *        The port on which you want Amazon Route 53 to open a connection to
     *        perform health checks.</p>
     *        <p>
     *        Specify this value only if you want to change it.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateHealthCheckRequest withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * The path that you want Amazon Route 53 to request when performing health
     * checks. The path can be any value for which your endpoint will return an
     * HTTP status code of 2xx or 3xx when the endpoint is healthy, for example
     * the file /docs/route53-health-check.html.
     * </p>
     * <p>
     * Specify this value only if you want to change it.
     * </p>
     * 
     * @param resourcePath
     *        The path that you want Amazon Route 53 to request when performing
     *        health checks. The path can be any value for which your endpoint
     *        will return an HTTP status code of 2xx or 3xx when the endpoint is
     *        healthy, for example the file /docs/route53-health-check.html.
     *        </p>
     *        <p>
     *        Specify this value only if you want to change it.
     */

    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    /**
     * <p>
     * The path that you want Amazon Route 53 to request when performing health
     * checks. The path can be any value for which your endpoint will return an
     * HTTP status code of 2xx or 3xx when the endpoint is healthy, for example
     * the file /docs/route53-health-check.html.
     * </p>
     * <p>
     * Specify this value only if you want to change it.
     * </p>
     * 
     * @return The path that you want Amazon Route 53 to request when performing
     *         health checks. The path can be any value for which your endpoint
     *         will return an HTTP status code of 2xx or 3xx when the endpoint
     *         is healthy, for example the file /docs/route53-health-check.html.
     *         </p>
     *         <p>
     *         Specify this value only if you want to change it.
     */

    public String getResourcePath() {
        return this.resourcePath;
    }

    /**
     * <p>
     * The path that you want Amazon Route 53 to request when performing health
     * checks. The path can be any value for which your endpoint will return an
     * HTTP status code of 2xx or 3xx when the endpoint is healthy, for example
     * the file /docs/route53-health-check.html.
     * </p>
     * <p>
     * Specify this value only if you want to change it.
     * </p>
     * 
     * @param resourcePath
     *        The path that you want Amazon Route 53 to request when performing
     *        health checks. The path can be any value for which your endpoint
     *        will return an HTTP status code of 2xx or 3xx when the endpoint is
     *        healthy, for example the file /docs/route53-health-check.html.
     *        </p>
     *        <p>
     *        Specify this value only if you want to change it.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateHealthCheckRequest withResourcePath(String resourcePath) {
        setResourcePath(resourcePath);
        return this;
    }

    /**
     * <p>
     * Fully qualified domain name of the instance to be health checked.
     * </p>
     * <p>
     * Specify this value only if you want to change it.
     * </p>
     * 
     * @param fullyQualifiedDomainName
     *        Fully qualified domain name of the instance to be health
     *        checked.</p>
     *        <p>
     *        Specify this value only if you want to change it.
     */

    public void setFullyQualifiedDomainName(String fullyQualifiedDomainName) {
        this.fullyQualifiedDomainName = fullyQualifiedDomainName;
    }

    /**
     * <p>
     * Fully qualified domain name of the instance to be health checked.
     * </p>
     * <p>
     * Specify this value only if you want to change it.
     * </p>
     * 
     * @return Fully qualified domain name of the instance to be health
     *         checked.</p>
     *         <p>
     *         Specify this value only if you want to change it.
     */

    public String getFullyQualifiedDomainName() {
        return this.fullyQualifiedDomainName;
    }

    /**
     * <p>
     * Fully qualified domain name of the instance to be health checked.
     * </p>
     * <p>
     * Specify this value only if you want to change it.
     * </p>
     * 
     * @param fullyQualifiedDomainName
     *        Fully qualified domain name of the instance to be health
     *        checked.</p>
     *        <p>
     *        Specify this value only if you want to change it.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateHealthCheckRequest withFullyQualifiedDomainName(
            String fullyQualifiedDomainName) {
        setFullyQualifiedDomainName(fullyQualifiedDomainName);
        return this;
    }

    /**
     * <p>
     * If the value of <code>Type</code> is <code>HTTP_STR_MATCH</code> or
     * <code>HTTP_STR_MATCH</code>, the string that you want Amazon Route 53 to
     * search for in the response body from the specified resource. If the
     * string appears in the response body, Amazon Route 53 considers the
     * resource healthy. Amazon Route 53 considers case when searching for
     * <code>SearchString</code> in the response body.
     * </p>
     * <p>
     * Specify this value only if you want to change it.
     * </p>
     * 
     * @param searchString
     *        If the value of <code>Type</code> is <code>HTTP_STR_MATCH</code>
     *        or <code>HTTP_STR_MATCH</code>, the string that you want Amazon
     *        Route 53 to search for in the response body from the specified
     *        resource. If the string appears in the response body, Amazon Route
     *        53 considers the resource healthy. Amazon Route 53 considers case
     *        when searching for <code>SearchString</code> in the response
     *        body.</p>
     *        <p>
     *        Specify this value only if you want to change it.
     */

    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }

    /**
     * <p>
     * If the value of <code>Type</code> is <code>HTTP_STR_MATCH</code> or
     * <code>HTTP_STR_MATCH</code>, the string that you want Amazon Route 53 to
     * search for in the response body from the specified resource. If the
     * string appears in the response body, Amazon Route 53 considers the
     * resource healthy. Amazon Route 53 considers case when searching for
     * <code>SearchString</code> in the response body.
     * </p>
     * <p>
     * Specify this value only if you want to change it.
     * </p>
     * 
     * @return If the value of <code>Type</code> is <code>HTTP_STR_MATCH</code>
     *         or <code>HTTP_STR_MATCH</code>, the string that you want Amazon
     *         Route 53 to search for in the response body from the specified
     *         resource. If the string appears in the response body, Amazon
     *         Route 53 considers the resource healthy. Amazon Route 53
     *         considers case when searching for <code>SearchString</code> in
     *         the response body.</p>
     *         <p>
     *         Specify this value only if you want to change it.
     */

    public String getSearchString() {
        return this.searchString;
    }

    /**
     * <p>
     * If the value of <code>Type</code> is <code>HTTP_STR_MATCH</code> or
     * <code>HTTP_STR_MATCH</code>, the string that you want Amazon Route 53 to
     * search for in the response body from the specified resource. If the
     * string appears in the response body, Amazon Route 53 considers the
     * resource healthy. Amazon Route 53 considers case when searching for
     * <code>SearchString</code> in the response body.
     * </p>
     * <p>
     * Specify this value only if you want to change it.
     * </p>
     * 
     * @param searchString
     *        If the value of <code>Type</code> is <code>HTTP_STR_MATCH</code>
     *        or <code>HTTP_STR_MATCH</code>, the string that you want Amazon
     *        Route 53 to search for in the response body from the specified
     *        resource. If the string appears in the response body, Amazon Route
     *        53 considers the resource healthy. Amazon Route 53 considers case
     *        when searching for <code>SearchString</code> in the response
     *        body.</p>
     *        <p>
     *        Specify this value only if you want to change it.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateHealthCheckRequest withSearchString(String searchString) {
        setSearchString(searchString);
        return this;
    }

    /**
     * <p>
     * The number of consecutive health checks that an endpoint must pass or
     * fail for Amazon Route 53 to change the current status of the endpoint
     * from unhealthy to healthy or vice versa.
     * </p>
     * <p>
     * Valid values are integers between 1 and 10. For more information, see
     * "How Amazon Route 53 Determines Whether an Endpoint Is Healthy" in the
     * Amazon Route 53 Developer Guide.
     * </p>
     * <p>
     * Specify this value only if you want to change it.
     * </p>
     * 
     * @param failureThreshold
     *        The number of consecutive health checks that an endpoint must pass
     *        or fail for Amazon Route 53 to change the current status of the
     *        endpoint from unhealthy to healthy or vice versa.</p>
     *        <p>
     *        Valid values are integers between 1 and 10. For more information,
     *        see
     *        "How Amazon Route 53 Determines Whether an Endpoint Is Healthy" in
     *        the Amazon Route 53 Developer Guide.
     *        </p>
     *        <p>
     *        Specify this value only if you want to change it.
     */

    public void setFailureThreshold(Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
    }

    /**
     * <p>
     * The number of consecutive health checks that an endpoint must pass or
     * fail for Amazon Route 53 to change the current status of the endpoint
     * from unhealthy to healthy or vice versa.
     * </p>
     * <p>
     * Valid values are integers between 1 and 10. For more information, see
     * "How Amazon Route 53 Determines Whether an Endpoint Is Healthy" in the
     * Amazon Route 53 Developer Guide.
     * </p>
     * <p>
     * Specify this value only if you want to change it.
     * </p>
     * 
     * @return The number of consecutive health checks that an endpoint must
     *         pass or fail for Amazon Route 53 to change the current status of
     *         the endpoint from unhealthy to healthy or vice versa.</p>
     *         <p>
     *         Valid values are integers between 1 and 10. For more information,
     *         see
     *         "How Amazon Route 53 Determines Whether an Endpoint Is Healthy"
     *         in the Amazon Route 53 Developer Guide.
     *         </p>
     *         <p>
     *         Specify this value only if you want to change it.
     */

    public Integer getFailureThreshold() {
        return this.failureThreshold;
    }

    /**
     * <p>
     * The number of consecutive health checks that an endpoint must pass or
     * fail for Amazon Route 53 to change the current status of the endpoint
     * from unhealthy to healthy or vice versa.
     * </p>
     * <p>
     * Valid values are integers between 1 and 10. For more information, see
     * "How Amazon Route 53 Determines Whether an Endpoint Is Healthy" in the
     * Amazon Route 53 Developer Guide.
     * </p>
     * <p>
     * Specify this value only if you want to change it.
     * </p>
     * 
     * @param failureThreshold
     *        The number of consecutive health checks that an endpoint must pass
     *        or fail for Amazon Route 53 to change the current status of the
     *        endpoint from unhealthy to healthy or vice versa.</p>
     *        <p>
     *        Valid values are integers between 1 and 10. For more information,
     *        see
     *        "How Amazon Route 53 Determines Whether an Endpoint Is Healthy" in
     *        the Amazon Route 53 Developer Guide.
     *        </p>
     *        <p>
     *        Specify this value only if you want to change it.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateHealthCheckRequest withFailureThreshold(
            Integer failureThreshold) {
        setFailureThreshold(failureThreshold);
        return this;
    }

    /**
     * <p>
     * A boolean value that indicates whether the status of health check should
     * be inverted. For example, if a health check is healthy but
     * <code>Inverted</code> is <code>True</code>, then Amazon Route 53
     * considers the health check to be unhealthy.
     * </p>
     * <p>
     * Specify this value only if you want to change it.
     * </p>
     * 
     * @param inverted
     *        A boolean value that indicates whether the status of health check
     *        should be inverted. For example, if a health check is healthy but
     *        <code>Inverted</code> is <code>True</code>, then Amazon Route 53
     *        considers the health check to be unhealthy.</p>
     *        <p>
     *        Specify this value only if you want to change it.
     */

    public void setInverted(Boolean inverted) {
        this.inverted = inverted;
    }

    /**
     * <p>
     * A boolean value that indicates whether the status of health check should
     * be inverted. For example, if a health check is healthy but
     * <code>Inverted</code> is <code>True</code>, then Amazon Route 53
     * considers the health check to be unhealthy.
     * </p>
     * <p>
     * Specify this value only if you want to change it.
     * </p>
     * 
     * @return A boolean value that indicates whether the status of health check
     *         should be inverted. For example, if a health check is healthy but
     *         <code>Inverted</code> is <code>True</code>, then Amazon Route 53
     *         considers the health check to be unhealthy.</p>
     *         <p>
     *         Specify this value only if you want to change it.
     */

    public Boolean getInverted() {
        return this.inverted;
    }

    /**
     * <p>
     * A boolean value that indicates whether the status of health check should
     * be inverted. For example, if a health check is healthy but
     * <code>Inverted</code> is <code>True</code>, then Amazon Route 53
     * considers the health check to be unhealthy.
     * </p>
     * <p>
     * Specify this value only if you want to change it.
     * </p>
     * 
     * @param inverted
     *        A boolean value that indicates whether the status of health check
     *        should be inverted. For example, if a health check is healthy but
     *        <code>Inverted</code> is <code>True</code>, then Amazon Route 53
     *        considers the health check to be unhealthy.</p>
     *        <p>
     *        Specify this value only if you want to change it.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateHealthCheckRequest withInverted(Boolean inverted) {
        setInverted(inverted);
        return this;
    }

    /**
     * <p>
     * A boolean value that indicates whether the status of health check should
     * be inverted. For example, if a health check is healthy but
     * <code>Inverted</code> is <code>True</code>, then Amazon Route 53
     * considers the health check to be unhealthy.
     * </p>
     * <p>
     * Specify this value only if you want to change it.
     * </p>
     * 
     * @return A boolean value that indicates whether the status of health check
     *         should be inverted. For example, if a health check is healthy but
     *         <code>Inverted</code> is <code>True</code>, then Amazon Route 53
     *         considers the health check to be unhealthy.</p>
     *         <p>
     *         Specify this value only if you want to change it.
     */

    public Boolean isInverted() {
        return this.inverted;
    }

    /**
     * <p>
     * The minimum number of child health checks that must be healthy for Amazon
     * Route 53 to consider the parent health check to be healthy. Valid values
     * are integers between 0 and 256, inclusive.
     * </p>
     * <p>
     * Specify this value only if you want to change it.
     * </p>
     * 
     * @param healthThreshold
     *        The minimum number of child health checks that must be healthy for
     *        Amazon Route 53 to consider the parent health check to be healthy.
     *        Valid values are integers between 0 and 256, inclusive.</p>
     *        <p>
     *        Specify this value only if you want to change it.
     */

    public void setHealthThreshold(Integer healthThreshold) {
        this.healthThreshold = healthThreshold;
    }

    /**
     * <p>
     * The minimum number of child health checks that must be healthy for Amazon
     * Route 53 to consider the parent health check to be healthy. Valid values
     * are integers between 0 and 256, inclusive.
     * </p>
     * <p>
     * Specify this value only if you want to change it.
     * </p>
     * 
     * @return The minimum number of child health checks that must be healthy
     *         for Amazon Route 53 to consider the parent health check to be
     *         healthy. Valid values are integers between 0 and 256,
     *         inclusive.</p>
     *         <p>
     *         Specify this value only if you want to change it.
     */

    public Integer getHealthThreshold() {
        return this.healthThreshold;
    }

    /**
     * <p>
     * The minimum number of child health checks that must be healthy for Amazon
     * Route 53 to consider the parent health check to be healthy. Valid values
     * are integers between 0 and 256, inclusive.
     * </p>
     * <p>
     * Specify this value only if you want to change it.
     * </p>
     * 
     * @param healthThreshold
     *        The minimum number of child health checks that must be healthy for
     *        Amazon Route 53 to consider the parent health check to be healthy.
     *        Valid values are integers between 0 and 256, inclusive.</p>
     *        <p>
     *        Specify this value only if you want to change it.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateHealthCheckRequest withHealthThreshold(Integer healthThreshold) {
        setHealthThreshold(healthThreshold);
        return this;
    }

    /**
     * <p>
     * For a specified parent health check, a list of <code>HealthCheckId</code>
     * values for the associated child health checks.
     * </p>
     * <p>
     * Specify this value only if you want to change it.
     * </p>
     * 
     * @return For a specified parent health check, a list of
     *         <code>HealthCheckId</code> values for the associated child health
     *         checks.</p>
     *         <p>
     *         Specify this value only if you want to change it.
     */

    public java.util.List<String> getChildHealthChecks() {
        if (childHealthChecks == null) {
            childHealthChecks = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return childHealthChecks;
    }

    /**
     * <p>
     * For a specified parent health check, a list of <code>HealthCheckId</code>
     * values for the associated child health checks.
     * </p>
     * <p>
     * Specify this value only if you want to change it.
     * </p>
     * 
     * @param childHealthChecks
     *        For a specified parent health check, a list of
     *        <code>HealthCheckId</code> values for the associated child health
     *        checks.</p>
     *        <p>
     *        Specify this value only if you want to change it.
     */

    public void setChildHealthChecks(
            java.util.Collection<String> childHealthChecks) {
        if (childHealthChecks == null) {
            this.childHealthChecks = null;
            return;
        }

        this.childHealthChecks = new com.amazonaws.internal.SdkInternalList<String>(
                childHealthChecks);
    }

    /**
     * <p>
     * For a specified parent health check, a list of <code>HealthCheckId</code>
     * values for the associated child health checks.
     * </p>
     * <p>
     * Specify this value only if you want to change it.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setChildHealthChecks(java.util.Collection)} or
     * {@link #withChildHealthChecks(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param childHealthChecks
     *        For a specified parent health check, a list of
     *        <code>HealthCheckId</code> values for the associated child health
     *        checks.</p>
     *        <p>
     *        Specify this value only if you want to change it.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateHealthCheckRequest withChildHealthChecks(
            String... childHealthChecks) {
        if (this.childHealthChecks == null) {
            setChildHealthChecks(new com.amazonaws.internal.SdkInternalList<String>(
                    childHealthChecks.length));
        }
        for (String ele : childHealthChecks) {
            this.childHealthChecks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * For a specified parent health check, a list of <code>HealthCheckId</code>
     * values for the associated child health checks.
     * </p>
     * <p>
     * Specify this value only if you want to change it.
     * </p>
     * 
     * @param childHealthChecks
     *        For a specified parent health check, a list of
     *        <code>HealthCheckId</code> values for the associated child health
     *        checks.</p>
     *        <p>
     *        Specify this value only if you want to change it.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateHealthCheckRequest withChildHealthChecks(
            java.util.Collection<String> childHealthChecks) {
        setChildHealthChecks(childHealthChecks);
        return this;
    }

    /**
     * <p>
     * Specify whether you want Amazon Route 53 to send the value of
     * <code>FullyQualifiedDomainName</code> to the endpoint in the
     * <code>client_hello</code> message during TLS negotiation. If you don't
     * specify a value for <code>EnableSNI</code>, Amazon Route 53 defaults to
     * <code>true</code> when <code>Type</code> is <code>HTTPS</code> or
     * <code>HTTPS_STR_MATCH</code> and defaults to <code>false</code> when
     * <code>Type</code> is any other value.
     * </p>
     * <p>
     * Specify this value only if you want to change it.
     * </p>
     * 
     * @param enableSNI
     *        Specify whether you want Amazon Route 53 to send the value of
     *        <code>FullyQualifiedDomainName</code> to the endpoint in the
     *        <code>client_hello</code> message during TLS negotiation. If you
     *        don't specify a value for <code>EnableSNI</code>, Amazon Route 53
     *        defaults to <code>true</code> when <code>Type</code> is
     *        <code>HTTPS</code> or <code>HTTPS_STR_MATCH</code> and defaults to
     *        <code>false</code> when <code>Type</code> is any other value.</p>
     *        <p>
     *        Specify this value only if you want to change it.
     */

    public void setEnableSNI(Boolean enableSNI) {
        this.enableSNI = enableSNI;
    }

    /**
     * <p>
     * Specify whether you want Amazon Route 53 to send the value of
     * <code>FullyQualifiedDomainName</code> to the endpoint in the
     * <code>client_hello</code> message during TLS negotiation. If you don't
     * specify a value for <code>EnableSNI</code>, Amazon Route 53 defaults to
     * <code>true</code> when <code>Type</code> is <code>HTTPS</code> or
     * <code>HTTPS_STR_MATCH</code> and defaults to <code>false</code> when
     * <code>Type</code> is any other value.
     * </p>
     * <p>
     * Specify this value only if you want to change it.
     * </p>
     * 
     * @return Specify whether you want Amazon Route 53 to send the value of
     *         <code>FullyQualifiedDomainName</code> to the endpoint in the
     *         <code>client_hello</code> message during TLS negotiation. If you
     *         don't specify a value for <code>EnableSNI</code>, Amazon Route 53
     *         defaults to <code>true</code> when <code>Type</code> is
     *         <code>HTTPS</code> or <code>HTTPS_STR_MATCH</code> and defaults
     *         to <code>false</code> when <code>Type</code> is any other
     *         value.</p>
     *         <p>
     *         Specify this value only if you want to change it.
     */

    public Boolean getEnableSNI() {
        return this.enableSNI;
    }

    /**
     * <p>
     * Specify whether you want Amazon Route 53 to send the value of
     * <code>FullyQualifiedDomainName</code> to the endpoint in the
     * <code>client_hello</code> message during TLS negotiation. If you don't
     * specify a value for <code>EnableSNI</code>, Amazon Route 53 defaults to
     * <code>true</code> when <code>Type</code> is <code>HTTPS</code> or
     * <code>HTTPS_STR_MATCH</code> and defaults to <code>false</code> when
     * <code>Type</code> is any other value.
     * </p>
     * <p>
     * Specify this value only if you want to change it.
     * </p>
     * 
     * @param enableSNI
     *        Specify whether you want Amazon Route 53 to send the value of
     *        <code>FullyQualifiedDomainName</code> to the endpoint in the
     *        <code>client_hello</code> message during TLS negotiation. If you
     *        don't specify a value for <code>EnableSNI</code>, Amazon Route 53
     *        defaults to <code>true</code> when <code>Type</code> is
     *        <code>HTTPS</code> or <code>HTTPS_STR_MATCH</code> and defaults to
     *        <code>false</code> when <code>Type</code> is any other value.</p>
     *        <p>
     *        Specify this value only if you want to change it.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateHealthCheckRequest withEnableSNI(Boolean enableSNI) {
        setEnableSNI(enableSNI);
        return this;
    }

    /**
     * <p>
     * Specify whether you want Amazon Route 53 to send the value of
     * <code>FullyQualifiedDomainName</code> to the endpoint in the
     * <code>client_hello</code> message during TLS negotiation. If you don't
     * specify a value for <code>EnableSNI</code>, Amazon Route 53 defaults to
     * <code>true</code> when <code>Type</code> is <code>HTTPS</code> or
     * <code>HTTPS_STR_MATCH</code> and defaults to <code>false</code> when
     * <code>Type</code> is any other value.
     * </p>
     * <p>
     * Specify this value only if you want to change it.
     * </p>
     * 
     * @return Specify whether you want Amazon Route 53 to send the value of
     *         <code>FullyQualifiedDomainName</code> to the endpoint in the
     *         <code>client_hello</code> message during TLS negotiation. If you
     *         don't specify a value for <code>EnableSNI</code>, Amazon Route 53
     *         defaults to <code>true</code> when <code>Type</code> is
     *         <code>HTTPS</code> or <code>HTTPS_STR_MATCH</code> and defaults
     *         to <code>false</code> when <code>Type</code> is any other
     *         value.</p>
     *         <p>
     *         Specify this value only if you want to change it.
     */

    public Boolean isEnableSNI() {
        return this.enableSNI;
    }

    /**
     * <p>
     * A list of <code>HealthCheckRegion</code> values that specify the Amazon
     * EC2 regions that you want Amazon Route 53 to use to perform health
     * checks. You must specify at least three regions.
     * </p>
     * <note>When you remove a region from the list, Amazon Route 53 will
     * briefly continue to check your endpoint from that region.</note>
     * <p>
     * Specify this value only if you want to change it.
     * </p>
     * 
     * @return A list of <code>HealthCheckRegion</code> values that specify the
     *         Amazon EC2 regions that you want Amazon Route 53 to use to
     *         perform health checks. You must specify at least three
     *         regions.</p> <note>When you remove a region from the list, Amazon
     *         Route 53 will briefly continue to check your endpoint from that
     *         region.</note>
     *         <p>
     *         Specify this value only if you want to change it.
     * @see HealthCheckRegion
     */

    public java.util.List<String> getRegions() {
        if (regions == null) {
            regions = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return regions;
    }

    /**
     * <p>
     * A list of <code>HealthCheckRegion</code> values that specify the Amazon
     * EC2 regions that you want Amazon Route 53 to use to perform health
     * checks. You must specify at least three regions.
     * </p>
     * <note>When you remove a region from the list, Amazon Route 53 will
     * briefly continue to check your endpoint from that region.</note>
     * <p>
     * Specify this value only if you want to change it.
     * </p>
     * 
     * @param regions
     *        A list of <code>HealthCheckRegion</code> values that specify the
     *        Amazon EC2 regions that you want Amazon Route 53 to use to perform
     *        health checks. You must specify at least three regions.</p>
     *        <note>When you remove a region from the list, Amazon Route 53 will
     *        briefly continue to check your endpoint from that region.</note>
     *        <p>
     *        Specify this value only if you want to change it.
     * @see HealthCheckRegion
     */

    public void setRegions(java.util.Collection<String> regions) {
        if (regions == null) {
            this.regions = null;
            return;
        }

        this.regions = new com.amazonaws.internal.SdkInternalList<String>(
                regions);
    }

    /**
     * <p>
     * A list of <code>HealthCheckRegion</code> values that specify the Amazon
     * EC2 regions that you want Amazon Route 53 to use to perform health
     * checks. You must specify at least three regions.
     * </p>
     * <note>When you remove a region from the list, Amazon Route 53 will
     * briefly continue to check your endpoint from that region.</note>
     * <p>
     * Specify this value only if you want to change it.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setRegions(java.util.Collection)} or
     * {@link #withRegions(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param regions
     *        A list of <code>HealthCheckRegion</code> values that specify the
     *        Amazon EC2 regions that you want Amazon Route 53 to use to perform
     *        health checks. You must specify at least three regions.</p>
     *        <note>When you remove a region from the list, Amazon Route 53 will
     *        briefly continue to check your endpoint from that region.</note>
     *        <p>
     *        Specify this value only if you want to change it.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see HealthCheckRegion
     */

    public UpdateHealthCheckRequest withRegions(String... regions) {
        if (this.regions == null) {
            setRegions(new com.amazonaws.internal.SdkInternalList<String>(
                    regions.length));
        }
        for (String ele : regions) {
            this.regions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>HealthCheckRegion</code> values that specify the Amazon
     * EC2 regions that you want Amazon Route 53 to use to perform health
     * checks. You must specify at least three regions.
     * </p>
     * <note>When you remove a region from the list, Amazon Route 53 will
     * briefly continue to check your endpoint from that region.</note>
     * <p>
     * Specify this value only if you want to change it.
     * </p>
     * 
     * @param regions
     *        A list of <code>HealthCheckRegion</code> values that specify the
     *        Amazon EC2 regions that you want Amazon Route 53 to use to perform
     *        health checks. You must specify at least three regions.</p>
     *        <note>When you remove a region from the list, Amazon Route 53 will
     *        briefly continue to check your endpoint from that region.</note>
     *        <p>
     *        Specify this value only if you want to change it.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see HealthCheckRegion
     */

    public UpdateHealthCheckRequest withRegions(
            java.util.Collection<String> regions) {
        setRegions(regions);
        return this;
    }

    /**
     * <p>
     * A list of <code>HealthCheckRegion</code> values that specify the Amazon
     * EC2 regions that you want Amazon Route 53 to use to perform health
     * checks. You must specify at least three regions.
     * </p>
     * <note>When you remove a region from the list, Amazon Route 53 will
     * briefly continue to check your endpoint from that region.</note>
     * <p>
     * Specify this value only if you want to change it.
     * </p>
     * 
     * @param regions
     *        A list of <code>HealthCheckRegion</code> values that specify the
     *        Amazon EC2 regions that you want Amazon Route 53 to use to perform
     *        health checks. You must specify at least three regions.</p>
     *        <note>When you remove a region from the list, Amazon Route 53 will
     *        briefly continue to check your endpoint from that region.</note>
     *        <p>
     *        Specify this value only if you want to change it.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see HealthCheckRegion
     */

    public UpdateHealthCheckRequest withRegions(HealthCheckRegion... regions) {
        com.amazonaws.internal.SdkInternalList<String> regionsCopy = new com.amazonaws.internal.SdkInternalList<String>(
                regions.length);
        for (HealthCheckRegion value : regions) {
            regionsCopy.add(value.toString());
        }
        if (getRegions() == null) {
            setRegions(regionsCopy);
        } else {
            getRegions().addAll(regionsCopy);
        }
        return this;
    }

    /**
     * @param alarmIdentifier
     */

    public void setAlarmIdentifier(AlarmIdentifier alarmIdentifier) {
        this.alarmIdentifier = alarmIdentifier;
    }

    /**
     * @return
     */

    public AlarmIdentifier getAlarmIdentifier() {
        return this.alarmIdentifier;
    }

    /**
     * @param alarmIdentifier
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateHealthCheckRequest withAlarmIdentifier(
            AlarmIdentifier alarmIdentifier) {
        setAlarmIdentifier(alarmIdentifier);
        return this;
    }

    /**
     * @param insufficientDataHealthStatus
     * @see InsufficientDataHealthStatus
     */

    public void setInsufficientDataHealthStatus(
            String insufficientDataHealthStatus) {
        this.insufficientDataHealthStatus = insufficientDataHealthStatus;
    }

    /**
     * @return
     * @see InsufficientDataHealthStatus
     */

    public String getInsufficientDataHealthStatus() {
        return this.insufficientDataHealthStatus;
    }

    /**
     * @param insufficientDataHealthStatus
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see InsufficientDataHealthStatus
     */

    public UpdateHealthCheckRequest withInsufficientDataHealthStatus(
            String insufficientDataHealthStatus) {
        setInsufficientDataHealthStatus(insufficientDataHealthStatus);
        return this;
    }

    /**
     * @param insufficientDataHealthStatus
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see InsufficientDataHealthStatus
     */

    public void setInsufficientDataHealthStatus(
            InsufficientDataHealthStatus insufficientDataHealthStatus) {
        this.insufficientDataHealthStatus = insufficientDataHealthStatus
                .toString();
    }

    /**
     * @param insufficientDataHealthStatus
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see InsufficientDataHealthStatus
     */

    public UpdateHealthCheckRequest withInsufficientDataHealthStatus(
            InsufficientDataHealthStatus insufficientDataHealthStatus) {
        setInsufficientDataHealthStatus(insufficientDataHealthStatus);
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
        if (getHealthCheckId() != null)
            sb.append("HealthCheckId: " + getHealthCheckId() + ",");
        if (getHealthCheckVersion() != null)
            sb.append("HealthCheckVersion: " + getHealthCheckVersion() + ",");
        if (getIPAddress() != null)
            sb.append("IPAddress: " + getIPAddress() + ",");
        if (getPort() != null)
            sb.append("Port: " + getPort() + ",");
        if (getResourcePath() != null)
            sb.append("ResourcePath: " + getResourcePath() + ",");
        if (getFullyQualifiedDomainName() != null)
            sb.append("FullyQualifiedDomainName: "
                    + getFullyQualifiedDomainName() + ",");
        if (getSearchString() != null)
            sb.append("SearchString: " + getSearchString() + ",");
        if (getFailureThreshold() != null)
            sb.append("FailureThreshold: " + getFailureThreshold() + ",");
        if (getInverted() != null)
            sb.append("Inverted: " + getInverted() + ",");
        if (getHealthThreshold() != null)
            sb.append("HealthThreshold: " + getHealthThreshold() + ",");
        if (getChildHealthChecks() != null)
            sb.append("ChildHealthChecks: " + getChildHealthChecks() + ",");
        if (getEnableSNI() != null)
            sb.append("EnableSNI: " + getEnableSNI() + ",");
        if (getRegions() != null)
            sb.append("Regions: " + getRegions() + ",");
        if (getAlarmIdentifier() != null)
            sb.append("AlarmIdentifier: " + getAlarmIdentifier() + ",");
        if (getInsufficientDataHealthStatus() != null)
            sb.append("InsufficientDataHealthStatus: "
                    + getInsufficientDataHealthStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateHealthCheckRequest == false)
            return false;
        UpdateHealthCheckRequest other = (UpdateHealthCheckRequest) obj;
        if (other.getHealthCheckId() == null ^ this.getHealthCheckId() == null)
            return false;
        if (other.getHealthCheckId() != null
                && other.getHealthCheckId().equals(this.getHealthCheckId()) == false)
            return false;
        if (other.getHealthCheckVersion() == null
                ^ this.getHealthCheckVersion() == null)
            return false;
        if (other.getHealthCheckVersion() != null
                && other.getHealthCheckVersion().equals(
                        this.getHealthCheckVersion()) == false)
            return false;
        if (other.getIPAddress() == null ^ this.getIPAddress() == null)
            return false;
        if (other.getIPAddress() != null
                && other.getIPAddress().equals(this.getIPAddress()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null
                && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getResourcePath() == null ^ this.getResourcePath() == null)
            return false;
        if (other.getResourcePath() != null
                && other.getResourcePath().equals(this.getResourcePath()) == false)
            return false;
        if (other.getFullyQualifiedDomainName() == null
                ^ this.getFullyQualifiedDomainName() == null)
            return false;
        if (other.getFullyQualifiedDomainName() != null
                && other.getFullyQualifiedDomainName().equals(
                        this.getFullyQualifiedDomainName()) == false)
            return false;
        if (other.getSearchString() == null ^ this.getSearchString() == null)
            return false;
        if (other.getSearchString() != null
                && other.getSearchString().equals(this.getSearchString()) == false)
            return false;
        if (other.getFailureThreshold() == null
                ^ this.getFailureThreshold() == null)
            return false;
        if (other.getFailureThreshold() != null
                && other.getFailureThreshold().equals(
                        this.getFailureThreshold()) == false)
            return false;
        if (other.getInverted() == null ^ this.getInverted() == null)
            return false;
        if (other.getInverted() != null
                && other.getInverted().equals(this.getInverted()) == false)
            return false;
        if (other.getHealthThreshold() == null
                ^ this.getHealthThreshold() == null)
            return false;
        if (other.getHealthThreshold() != null
                && other.getHealthThreshold().equals(this.getHealthThreshold()) == false)
            return false;
        if (other.getChildHealthChecks() == null
                ^ this.getChildHealthChecks() == null)
            return false;
        if (other.getChildHealthChecks() != null
                && other.getChildHealthChecks().equals(
                        this.getChildHealthChecks()) == false)
            return false;
        if (other.getEnableSNI() == null ^ this.getEnableSNI() == null)
            return false;
        if (other.getEnableSNI() != null
                && other.getEnableSNI().equals(this.getEnableSNI()) == false)
            return false;
        if (other.getRegions() == null ^ this.getRegions() == null)
            return false;
        if (other.getRegions() != null
                && other.getRegions().equals(this.getRegions()) == false)
            return false;
        if (other.getAlarmIdentifier() == null
                ^ this.getAlarmIdentifier() == null)
            return false;
        if (other.getAlarmIdentifier() != null
                && other.getAlarmIdentifier().equals(this.getAlarmIdentifier()) == false)
            return false;
        if (other.getInsufficientDataHealthStatus() == null
                ^ this.getInsufficientDataHealthStatus() == null)
            return false;
        if (other.getInsufficientDataHealthStatus() != null
                && other.getInsufficientDataHealthStatus().equals(
                        this.getInsufficientDataHealthStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getHealthCheckId() == null) ? 0 : getHealthCheckId()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getHealthCheckVersion() == null) ? 0
                        : getHealthCheckVersion().hashCode());
        hashCode = prime * hashCode
                + ((getIPAddress() == null) ? 0 : getIPAddress().hashCode());
        hashCode = prime * hashCode
                + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime
                * hashCode
                + ((getResourcePath() == null) ? 0 : getResourcePath()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getFullyQualifiedDomainName() == null) ? 0
                        : getFullyQualifiedDomainName().hashCode());
        hashCode = prime
                * hashCode
                + ((getSearchString() == null) ? 0 : getSearchString()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getFailureThreshold() == null) ? 0 : getFailureThreshold()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getInverted() == null) ? 0 : getInverted().hashCode());
        hashCode = prime
                * hashCode
                + ((getHealthThreshold() == null) ? 0 : getHealthThreshold()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getChildHealthChecks() == null) ? 0
                        : getChildHealthChecks().hashCode());
        hashCode = prime * hashCode
                + ((getEnableSNI() == null) ? 0 : getEnableSNI().hashCode());
        hashCode = prime * hashCode
                + ((getRegions() == null) ? 0 : getRegions().hashCode());
        hashCode = prime
                * hashCode
                + ((getAlarmIdentifier() == null) ? 0 : getAlarmIdentifier()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getInsufficientDataHealthStatus() == null) ? 0
                        : getInsufficientDataHealthStatus().hashCode());
        return hashCode;
    }

    @Override
    public UpdateHealthCheckRequest clone() {
        return (UpdateHealthCheckRequest) super.clone();
    }
}