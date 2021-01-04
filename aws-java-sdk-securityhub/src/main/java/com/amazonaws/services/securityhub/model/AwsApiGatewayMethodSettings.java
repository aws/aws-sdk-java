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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines settings for a method for the stage.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsApiGatewayMethodSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsApiGatewayMethodSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether CloudWatch metrics are enabled for the method.
     * </p>
     */
    private Boolean metricsEnabled;
    /**
     * <p>
     * The logging level for this method. The logging level affects the log entries that are pushed to CloudWatch Logs.
     * </p>
     * <p>
     * If the logging level is <code>ERROR</code>, then the logs only include error-level entries.
     * </p>
     * <p>
     * If the logging level is <code>INFO</code>, then the logs include both <code>ERROR</code> events and extra
     * informational events.
     * </p>
     * <p>
     * Valid values: <code>OFF</code> | <code>ERROR</code> | <code>INFO</code>
     * </p>
     */
    private String loggingLevel;
    /**
     * <p>
     * Indicates whether data trace logging is enabled for the method. Data trace logging affects the log entries that
     * are pushed to CloudWatch Logs.
     * </p>
     */
    private Boolean dataTraceEnabled;
    /**
     * <p>
     * The throttling burst limit for the method.
     * </p>
     */
    private Integer throttlingBurstLimit;
    /**
     * <p>
     * The throttling rate limit for the method.
     * </p>
     */
    private Double throttlingRateLimit;
    /**
     * <p>
     * Indicates whether responses are cached and returned for requests. For responses to be cached, a cache cluster
     * must be enabled on the stage.
     * </p>
     */
    private Boolean cachingEnabled;
    /**
     * <p>
     * Specifies the time to live (TTL), in seconds, for cached responses. The higher the TTL, the longer the response
     * is cached.
     * </p>
     */
    private Integer cacheTtlInSeconds;
    /**
     * <p>
     * Indicates whether the cached responses are encrypted.
     * </p>
     */
    private Boolean cacheDataEncrypted;
    /**
     * <p>
     * Indicates whether authorization is required for a cache invalidation request.
     * </p>
     */
    private Boolean requireAuthorizationForCacheControl;
    /**
     * <p>
     * Indicates how to handle unauthorized requests for cache invalidation.
     * </p>
     * <p>
     * Valid values: <code>FAIL_WITH_403</code> | <code>SUCCEED_WITH_RESPONSE_HEADER</code> |
     * <code>SUCCEED_WITHOUT_RESPONSE_HEADER</code>
     * </p>
     */
    private String unauthorizedCacheControlHeaderStrategy;
    /**
     * <p>
     * The HTTP method. You can use an asterisk (*) as a wildcard to apply method settings to multiple methods.
     * </p>
     */
    private String httpMethod;
    /**
     * <p>
     * The resource path for this method. Forward slashes (/) are encoded as ~1 . The initial slash must include a
     * forward slash.
     * </p>
     * <p>
     * For example, the path value <code>/resource/subresource</code> must be encoded as
     * <code>/~1resource~1subresource</code>.
     * </p>
     * <p>
     * To specify the root path, use only a slash (/). You can use an asterisk (*) as a wildcard to apply method
     * settings to multiple methods.
     * </p>
     */
    private String resourcePath;

    /**
     * <p>
     * Indicates whether CloudWatch metrics are enabled for the method.
     * </p>
     * 
     * @param metricsEnabled
     *        Indicates whether CloudWatch metrics are enabled for the method.
     */

    public void setMetricsEnabled(Boolean metricsEnabled) {
        this.metricsEnabled = metricsEnabled;
    }

    /**
     * <p>
     * Indicates whether CloudWatch metrics are enabled for the method.
     * </p>
     * 
     * @return Indicates whether CloudWatch metrics are enabled for the method.
     */

    public Boolean getMetricsEnabled() {
        return this.metricsEnabled;
    }

    /**
     * <p>
     * Indicates whether CloudWatch metrics are enabled for the method.
     * </p>
     * 
     * @param metricsEnabled
     *        Indicates whether CloudWatch metrics are enabled for the method.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiGatewayMethodSettings withMetricsEnabled(Boolean metricsEnabled) {
        setMetricsEnabled(metricsEnabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether CloudWatch metrics are enabled for the method.
     * </p>
     * 
     * @return Indicates whether CloudWatch metrics are enabled for the method.
     */

    public Boolean isMetricsEnabled() {
        return this.metricsEnabled;
    }

    /**
     * <p>
     * The logging level for this method. The logging level affects the log entries that are pushed to CloudWatch Logs.
     * </p>
     * <p>
     * If the logging level is <code>ERROR</code>, then the logs only include error-level entries.
     * </p>
     * <p>
     * If the logging level is <code>INFO</code>, then the logs include both <code>ERROR</code> events and extra
     * informational events.
     * </p>
     * <p>
     * Valid values: <code>OFF</code> | <code>ERROR</code> | <code>INFO</code>
     * </p>
     * 
     * @param loggingLevel
     *        The logging level for this method. The logging level affects the log entries that are pushed to CloudWatch
     *        Logs.</p>
     *        <p>
     *        If the logging level is <code>ERROR</code>, then the logs only include error-level entries.
     *        </p>
     *        <p>
     *        If the logging level is <code>INFO</code>, then the logs include both <code>ERROR</code> events and extra
     *        informational events.
     *        </p>
     *        <p>
     *        Valid values: <code>OFF</code> | <code>ERROR</code> | <code>INFO</code>
     */

    public void setLoggingLevel(String loggingLevel) {
        this.loggingLevel = loggingLevel;
    }

    /**
     * <p>
     * The logging level for this method. The logging level affects the log entries that are pushed to CloudWatch Logs.
     * </p>
     * <p>
     * If the logging level is <code>ERROR</code>, then the logs only include error-level entries.
     * </p>
     * <p>
     * If the logging level is <code>INFO</code>, then the logs include both <code>ERROR</code> events and extra
     * informational events.
     * </p>
     * <p>
     * Valid values: <code>OFF</code> | <code>ERROR</code> | <code>INFO</code>
     * </p>
     * 
     * @return The logging level for this method. The logging level affects the log entries that are pushed to
     *         CloudWatch Logs.</p>
     *         <p>
     *         If the logging level is <code>ERROR</code>, then the logs only include error-level entries.
     *         </p>
     *         <p>
     *         If the logging level is <code>INFO</code>, then the logs include both <code>ERROR</code> events and extra
     *         informational events.
     *         </p>
     *         <p>
     *         Valid values: <code>OFF</code> | <code>ERROR</code> | <code>INFO</code>
     */

    public String getLoggingLevel() {
        return this.loggingLevel;
    }

    /**
     * <p>
     * The logging level for this method. The logging level affects the log entries that are pushed to CloudWatch Logs.
     * </p>
     * <p>
     * If the logging level is <code>ERROR</code>, then the logs only include error-level entries.
     * </p>
     * <p>
     * If the logging level is <code>INFO</code>, then the logs include both <code>ERROR</code> events and extra
     * informational events.
     * </p>
     * <p>
     * Valid values: <code>OFF</code> | <code>ERROR</code> | <code>INFO</code>
     * </p>
     * 
     * @param loggingLevel
     *        The logging level for this method. The logging level affects the log entries that are pushed to CloudWatch
     *        Logs.</p>
     *        <p>
     *        If the logging level is <code>ERROR</code>, then the logs only include error-level entries.
     *        </p>
     *        <p>
     *        If the logging level is <code>INFO</code>, then the logs include both <code>ERROR</code> events and extra
     *        informational events.
     *        </p>
     *        <p>
     *        Valid values: <code>OFF</code> | <code>ERROR</code> | <code>INFO</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiGatewayMethodSettings withLoggingLevel(String loggingLevel) {
        setLoggingLevel(loggingLevel);
        return this;
    }

    /**
     * <p>
     * Indicates whether data trace logging is enabled for the method. Data trace logging affects the log entries that
     * are pushed to CloudWatch Logs.
     * </p>
     * 
     * @param dataTraceEnabled
     *        Indicates whether data trace logging is enabled for the method. Data trace logging affects the log entries
     *        that are pushed to CloudWatch Logs.
     */

    public void setDataTraceEnabled(Boolean dataTraceEnabled) {
        this.dataTraceEnabled = dataTraceEnabled;
    }

    /**
     * <p>
     * Indicates whether data trace logging is enabled for the method. Data trace logging affects the log entries that
     * are pushed to CloudWatch Logs.
     * </p>
     * 
     * @return Indicates whether data trace logging is enabled for the method. Data trace logging affects the log
     *         entries that are pushed to CloudWatch Logs.
     */

    public Boolean getDataTraceEnabled() {
        return this.dataTraceEnabled;
    }

    /**
     * <p>
     * Indicates whether data trace logging is enabled for the method. Data trace logging affects the log entries that
     * are pushed to CloudWatch Logs.
     * </p>
     * 
     * @param dataTraceEnabled
     *        Indicates whether data trace logging is enabled for the method. Data trace logging affects the log entries
     *        that are pushed to CloudWatch Logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiGatewayMethodSettings withDataTraceEnabled(Boolean dataTraceEnabled) {
        setDataTraceEnabled(dataTraceEnabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether data trace logging is enabled for the method. Data trace logging affects the log entries that
     * are pushed to CloudWatch Logs.
     * </p>
     * 
     * @return Indicates whether data trace logging is enabled for the method. Data trace logging affects the log
     *         entries that are pushed to CloudWatch Logs.
     */

    public Boolean isDataTraceEnabled() {
        return this.dataTraceEnabled;
    }

    /**
     * <p>
     * The throttling burst limit for the method.
     * </p>
     * 
     * @param throttlingBurstLimit
     *        The throttling burst limit for the method.
     */

    public void setThrottlingBurstLimit(Integer throttlingBurstLimit) {
        this.throttlingBurstLimit = throttlingBurstLimit;
    }

    /**
     * <p>
     * The throttling burst limit for the method.
     * </p>
     * 
     * @return The throttling burst limit for the method.
     */

    public Integer getThrottlingBurstLimit() {
        return this.throttlingBurstLimit;
    }

    /**
     * <p>
     * The throttling burst limit for the method.
     * </p>
     * 
     * @param throttlingBurstLimit
     *        The throttling burst limit for the method.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiGatewayMethodSettings withThrottlingBurstLimit(Integer throttlingBurstLimit) {
        setThrottlingBurstLimit(throttlingBurstLimit);
        return this;
    }

    /**
     * <p>
     * The throttling rate limit for the method.
     * </p>
     * 
     * @param throttlingRateLimit
     *        The throttling rate limit for the method.
     */

    public void setThrottlingRateLimit(Double throttlingRateLimit) {
        this.throttlingRateLimit = throttlingRateLimit;
    }

    /**
     * <p>
     * The throttling rate limit for the method.
     * </p>
     * 
     * @return The throttling rate limit for the method.
     */

    public Double getThrottlingRateLimit() {
        return this.throttlingRateLimit;
    }

    /**
     * <p>
     * The throttling rate limit for the method.
     * </p>
     * 
     * @param throttlingRateLimit
     *        The throttling rate limit for the method.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiGatewayMethodSettings withThrottlingRateLimit(Double throttlingRateLimit) {
        setThrottlingRateLimit(throttlingRateLimit);
        return this;
    }

    /**
     * <p>
     * Indicates whether responses are cached and returned for requests. For responses to be cached, a cache cluster
     * must be enabled on the stage.
     * </p>
     * 
     * @param cachingEnabled
     *        Indicates whether responses are cached and returned for requests. For responses to be cached, a cache
     *        cluster must be enabled on the stage.
     */

    public void setCachingEnabled(Boolean cachingEnabled) {
        this.cachingEnabled = cachingEnabled;
    }

    /**
     * <p>
     * Indicates whether responses are cached and returned for requests. For responses to be cached, a cache cluster
     * must be enabled on the stage.
     * </p>
     * 
     * @return Indicates whether responses are cached and returned for requests. For responses to be cached, a cache
     *         cluster must be enabled on the stage.
     */

    public Boolean getCachingEnabled() {
        return this.cachingEnabled;
    }

    /**
     * <p>
     * Indicates whether responses are cached and returned for requests. For responses to be cached, a cache cluster
     * must be enabled on the stage.
     * </p>
     * 
     * @param cachingEnabled
     *        Indicates whether responses are cached and returned for requests. For responses to be cached, a cache
     *        cluster must be enabled on the stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiGatewayMethodSettings withCachingEnabled(Boolean cachingEnabled) {
        setCachingEnabled(cachingEnabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether responses are cached and returned for requests. For responses to be cached, a cache cluster
     * must be enabled on the stage.
     * </p>
     * 
     * @return Indicates whether responses are cached and returned for requests. For responses to be cached, a cache
     *         cluster must be enabled on the stage.
     */

    public Boolean isCachingEnabled() {
        return this.cachingEnabled;
    }

    /**
     * <p>
     * Specifies the time to live (TTL), in seconds, for cached responses. The higher the TTL, the longer the response
     * is cached.
     * </p>
     * 
     * @param cacheTtlInSeconds
     *        Specifies the time to live (TTL), in seconds, for cached responses. The higher the TTL, the longer the
     *        response is cached.
     */

    public void setCacheTtlInSeconds(Integer cacheTtlInSeconds) {
        this.cacheTtlInSeconds = cacheTtlInSeconds;
    }

    /**
     * <p>
     * Specifies the time to live (TTL), in seconds, for cached responses. The higher the TTL, the longer the response
     * is cached.
     * </p>
     * 
     * @return Specifies the time to live (TTL), in seconds, for cached responses. The higher the TTL, the longer the
     *         response is cached.
     */

    public Integer getCacheTtlInSeconds() {
        return this.cacheTtlInSeconds;
    }

    /**
     * <p>
     * Specifies the time to live (TTL), in seconds, for cached responses. The higher the TTL, the longer the response
     * is cached.
     * </p>
     * 
     * @param cacheTtlInSeconds
     *        Specifies the time to live (TTL), in seconds, for cached responses. The higher the TTL, the longer the
     *        response is cached.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiGatewayMethodSettings withCacheTtlInSeconds(Integer cacheTtlInSeconds) {
        setCacheTtlInSeconds(cacheTtlInSeconds);
        return this;
    }

    /**
     * <p>
     * Indicates whether the cached responses are encrypted.
     * </p>
     * 
     * @param cacheDataEncrypted
     *        Indicates whether the cached responses are encrypted.
     */

    public void setCacheDataEncrypted(Boolean cacheDataEncrypted) {
        this.cacheDataEncrypted = cacheDataEncrypted;
    }

    /**
     * <p>
     * Indicates whether the cached responses are encrypted.
     * </p>
     * 
     * @return Indicates whether the cached responses are encrypted.
     */

    public Boolean getCacheDataEncrypted() {
        return this.cacheDataEncrypted;
    }

    /**
     * <p>
     * Indicates whether the cached responses are encrypted.
     * </p>
     * 
     * @param cacheDataEncrypted
     *        Indicates whether the cached responses are encrypted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiGatewayMethodSettings withCacheDataEncrypted(Boolean cacheDataEncrypted) {
        setCacheDataEncrypted(cacheDataEncrypted);
        return this;
    }

    /**
     * <p>
     * Indicates whether the cached responses are encrypted.
     * </p>
     * 
     * @return Indicates whether the cached responses are encrypted.
     */

    public Boolean isCacheDataEncrypted() {
        return this.cacheDataEncrypted;
    }

    /**
     * <p>
     * Indicates whether authorization is required for a cache invalidation request.
     * </p>
     * 
     * @param requireAuthorizationForCacheControl
     *        Indicates whether authorization is required for a cache invalidation request.
     */

    public void setRequireAuthorizationForCacheControl(Boolean requireAuthorizationForCacheControl) {
        this.requireAuthorizationForCacheControl = requireAuthorizationForCacheControl;
    }

    /**
     * <p>
     * Indicates whether authorization is required for a cache invalidation request.
     * </p>
     * 
     * @return Indicates whether authorization is required for a cache invalidation request.
     */

    public Boolean getRequireAuthorizationForCacheControl() {
        return this.requireAuthorizationForCacheControl;
    }

    /**
     * <p>
     * Indicates whether authorization is required for a cache invalidation request.
     * </p>
     * 
     * @param requireAuthorizationForCacheControl
     *        Indicates whether authorization is required for a cache invalidation request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiGatewayMethodSettings withRequireAuthorizationForCacheControl(Boolean requireAuthorizationForCacheControl) {
        setRequireAuthorizationForCacheControl(requireAuthorizationForCacheControl);
        return this;
    }

    /**
     * <p>
     * Indicates whether authorization is required for a cache invalidation request.
     * </p>
     * 
     * @return Indicates whether authorization is required for a cache invalidation request.
     */

    public Boolean isRequireAuthorizationForCacheControl() {
        return this.requireAuthorizationForCacheControl;
    }

    /**
     * <p>
     * Indicates how to handle unauthorized requests for cache invalidation.
     * </p>
     * <p>
     * Valid values: <code>FAIL_WITH_403</code> | <code>SUCCEED_WITH_RESPONSE_HEADER</code> |
     * <code>SUCCEED_WITHOUT_RESPONSE_HEADER</code>
     * </p>
     * 
     * @param unauthorizedCacheControlHeaderStrategy
     *        Indicates how to handle unauthorized requests for cache invalidation.</p>
     *        <p>
     *        Valid values: <code>FAIL_WITH_403</code> | <code>SUCCEED_WITH_RESPONSE_HEADER</code> |
     *        <code>SUCCEED_WITHOUT_RESPONSE_HEADER</code>
     */

    public void setUnauthorizedCacheControlHeaderStrategy(String unauthorizedCacheControlHeaderStrategy) {
        this.unauthorizedCacheControlHeaderStrategy = unauthorizedCacheControlHeaderStrategy;
    }

    /**
     * <p>
     * Indicates how to handle unauthorized requests for cache invalidation.
     * </p>
     * <p>
     * Valid values: <code>FAIL_WITH_403</code> | <code>SUCCEED_WITH_RESPONSE_HEADER</code> |
     * <code>SUCCEED_WITHOUT_RESPONSE_HEADER</code>
     * </p>
     * 
     * @return Indicates how to handle unauthorized requests for cache invalidation.</p>
     *         <p>
     *         Valid values: <code>FAIL_WITH_403</code> | <code>SUCCEED_WITH_RESPONSE_HEADER</code> |
     *         <code>SUCCEED_WITHOUT_RESPONSE_HEADER</code>
     */

    public String getUnauthorizedCacheControlHeaderStrategy() {
        return this.unauthorizedCacheControlHeaderStrategy;
    }

    /**
     * <p>
     * Indicates how to handle unauthorized requests for cache invalidation.
     * </p>
     * <p>
     * Valid values: <code>FAIL_WITH_403</code> | <code>SUCCEED_WITH_RESPONSE_HEADER</code> |
     * <code>SUCCEED_WITHOUT_RESPONSE_HEADER</code>
     * </p>
     * 
     * @param unauthorizedCacheControlHeaderStrategy
     *        Indicates how to handle unauthorized requests for cache invalidation.</p>
     *        <p>
     *        Valid values: <code>FAIL_WITH_403</code> | <code>SUCCEED_WITH_RESPONSE_HEADER</code> |
     *        <code>SUCCEED_WITHOUT_RESPONSE_HEADER</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiGatewayMethodSettings withUnauthorizedCacheControlHeaderStrategy(String unauthorizedCacheControlHeaderStrategy) {
        setUnauthorizedCacheControlHeaderStrategy(unauthorizedCacheControlHeaderStrategy);
        return this;
    }

    /**
     * <p>
     * The HTTP method. You can use an asterisk (*) as a wildcard to apply method settings to multiple methods.
     * </p>
     * 
     * @param httpMethod
     *        The HTTP method. You can use an asterisk (*) as a wildcard to apply method settings to multiple methods.
     */

    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    /**
     * <p>
     * The HTTP method. You can use an asterisk (*) as a wildcard to apply method settings to multiple methods.
     * </p>
     * 
     * @return The HTTP method. You can use an asterisk (*) as a wildcard to apply method settings to multiple methods.
     */

    public String getHttpMethod() {
        return this.httpMethod;
    }

    /**
     * <p>
     * The HTTP method. You can use an asterisk (*) as a wildcard to apply method settings to multiple methods.
     * </p>
     * 
     * @param httpMethod
     *        The HTTP method. You can use an asterisk (*) as a wildcard to apply method settings to multiple methods.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiGatewayMethodSettings withHttpMethod(String httpMethod) {
        setHttpMethod(httpMethod);
        return this;
    }

    /**
     * <p>
     * The resource path for this method. Forward slashes (/) are encoded as ~1 . The initial slash must include a
     * forward slash.
     * </p>
     * <p>
     * For example, the path value <code>/resource/subresource</code> must be encoded as
     * <code>/~1resource~1subresource</code>.
     * </p>
     * <p>
     * To specify the root path, use only a slash (/). You can use an asterisk (*) as a wildcard to apply method
     * settings to multiple methods.
     * </p>
     * 
     * @param resourcePath
     *        The resource path for this method. Forward slashes (/) are encoded as ~1 . The initial slash must include
     *        a forward slash.</p>
     *        <p>
     *        For example, the path value <code>/resource/subresource</code> must be encoded as
     *        <code>/~1resource~1subresource</code>.
     *        </p>
     *        <p>
     *        To specify the root path, use only a slash (/). You can use an asterisk (*) as a wildcard to apply method
     *        settings to multiple methods.
     */

    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    /**
     * <p>
     * The resource path for this method. Forward slashes (/) are encoded as ~1 . The initial slash must include a
     * forward slash.
     * </p>
     * <p>
     * For example, the path value <code>/resource/subresource</code> must be encoded as
     * <code>/~1resource~1subresource</code>.
     * </p>
     * <p>
     * To specify the root path, use only a slash (/). You can use an asterisk (*) as a wildcard to apply method
     * settings to multiple methods.
     * </p>
     * 
     * @return The resource path for this method. Forward slashes (/) are encoded as ~1 . The initial slash must include
     *         a forward slash.</p>
     *         <p>
     *         For example, the path value <code>/resource/subresource</code> must be encoded as
     *         <code>/~1resource~1subresource</code>.
     *         </p>
     *         <p>
     *         To specify the root path, use only a slash (/). You can use an asterisk (*) as a wildcard to apply method
     *         settings to multiple methods.
     */

    public String getResourcePath() {
        return this.resourcePath;
    }

    /**
     * <p>
     * The resource path for this method. Forward slashes (/) are encoded as ~1 . The initial slash must include a
     * forward slash.
     * </p>
     * <p>
     * For example, the path value <code>/resource/subresource</code> must be encoded as
     * <code>/~1resource~1subresource</code>.
     * </p>
     * <p>
     * To specify the root path, use only a slash (/). You can use an asterisk (*) as a wildcard to apply method
     * settings to multiple methods.
     * </p>
     * 
     * @param resourcePath
     *        The resource path for this method. Forward slashes (/) are encoded as ~1 . The initial slash must include
     *        a forward slash.</p>
     *        <p>
     *        For example, the path value <code>/resource/subresource</code> must be encoded as
     *        <code>/~1resource~1subresource</code>.
     *        </p>
     *        <p>
     *        To specify the root path, use only a slash (/). You can use an asterisk (*) as a wildcard to apply method
     *        settings to multiple methods.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiGatewayMethodSettings withResourcePath(String resourcePath) {
        setResourcePath(resourcePath);
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
        if (getMetricsEnabled() != null)
            sb.append("MetricsEnabled: ").append(getMetricsEnabled()).append(",");
        if (getLoggingLevel() != null)
            sb.append("LoggingLevel: ").append(getLoggingLevel()).append(",");
        if (getDataTraceEnabled() != null)
            sb.append("DataTraceEnabled: ").append(getDataTraceEnabled()).append(",");
        if (getThrottlingBurstLimit() != null)
            sb.append("ThrottlingBurstLimit: ").append(getThrottlingBurstLimit()).append(",");
        if (getThrottlingRateLimit() != null)
            sb.append("ThrottlingRateLimit: ").append(getThrottlingRateLimit()).append(",");
        if (getCachingEnabled() != null)
            sb.append("CachingEnabled: ").append(getCachingEnabled()).append(",");
        if (getCacheTtlInSeconds() != null)
            sb.append("CacheTtlInSeconds: ").append(getCacheTtlInSeconds()).append(",");
        if (getCacheDataEncrypted() != null)
            sb.append("CacheDataEncrypted: ").append(getCacheDataEncrypted()).append(",");
        if (getRequireAuthorizationForCacheControl() != null)
            sb.append("RequireAuthorizationForCacheControl: ").append(getRequireAuthorizationForCacheControl()).append(",");
        if (getUnauthorizedCacheControlHeaderStrategy() != null)
            sb.append("UnauthorizedCacheControlHeaderStrategy: ").append(getUnauthorizedCacheControlHeaderStrategy()).append(",");
        if (getHttpMethod() != null)
            sb.append("HttpMethod: ").append(getHttpMethod()).append(",");
        if (getResourcePath() != null)
            sb.append("ResourcePath: ").append(getResourcePath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsApiGatewayMethodSettings == false)
            return false;
        AwsApiGatewayMethodSettings other = (AwsApiGatewayMethodSettings) obj;
        if (other.getMetricsEnabled() == null ^ this.getMetricsEnabled() == null)
            return false;
        if (other.getMetricsEnabled() != null && other.getMetricsEnabled().equals(this.getMetricsEnabled()) == false)
            return false;
        if (other.getLoggingLevel() == null ^ this.getLoggingLevel() == null)
            return false;
        if (other.getLoggingLevel() != null && other.getLoggingLevel().equals(this.getLoggingLevel()) == false)
            return false;
        if (other.getDataTraceEnabled() == null ^ this.getDataTraceEnabled() == null)
            return false;
        if (other.getDataTraceEnabled() != null && other.getDataTraceEnabled().equals(this.getDataTraceEnabled()) == false)
            return false;
        if (other.getThrottlingBurstLimit() == null ^ this.getThrottlingBurstLimit() == null)
            return false;
        if (other.getThrottlingBurstLimit() != null && other.getThrottlingBurstLimit().equals(this.getThrottlingBurstLimit()) == false)
            return false;
        if (other.getThrottlingRateLimit() == null ^ this.getThrottlingRateLimit() == null)
            return false;
        if (other.getThrottlingRateLimit() != null && other.getThrottlingRateLimit().equals(this.getThrottlingRateLimit()) == false)
            return false;
        if (other.getCachingEnabled() == null ^ this.getCachingEnabled() == null)
            return false;
        if (other.getCachingEnabled() != null && other.getCachingEnabled().equals(this.getCachingEnabled()) == false)
            return false;
        if (other.getCacheTtlInSeconds() == null ^ this.getCacheTtlInSeconds() == null)
            return false;
        if (other.getCacheTtlInSeconds() != null && other.getCacheTtlInSeconds().equals(this.getCacheTtlInSeconds()) == false)
            return false;
        if (other.getCacheDataEncrypted() == null ^ this.getCacheDataEncrypted() == null)
            return false;
        if (other.getCacheDataEncrypted() != null && other.getCacheDataEncrypted().equals(this.getCacheDataEncrypted()) == false)
            return false;
        if (other.getRequireAuthorizationForCacheControl() == null ^ this.getRequireAuthorizationForCacheControl() == null)
            return false;
        if (other.getRequireAuthorizationForCacheControl() != null
                && other.getRequireAuthorizationForCacheControl().equals(this.getRequireAuthorizationForCacheControl()) == false)
            return false;
        if (other.getUnauthorizedCacheControlHeaderStrategy() == null ^ this.getUnauthorizedCacheControlHeaderStrategy() == null)
            return false;
        if (other.getUnauthorizedCacheControlHeaderStrategy() != null
                && other.getUnauthorizedCacheControlHeaderStrategy().equals(this.getUnauthorizedCacheControlHeaderStrategy()) == false)
            return false;
        if (other.getHttpMethod() == null ^ this.getHttpMethod() == null)
            return false;
        if (other.getHttpMethod() != null && other.getHttpMethod().equals(this.getHttpMethod()) == false)
            return false;
        if (other.getResourcePath() == null ^ this.getResourcePath() == null)
            return false;
        if (other.getResourcePath() != null && other.getResourcePath().equals(this.getResourcePath()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetricsEnabled() == null) ? 0 : getMetricsEnabled().hashCode());
        hashCode = prime * hashCode + ((getLoggingLevel() == null) ? 0 : getLoggingLevel().hashCode());
        hashCode = prime * hashCode + ((getDataTraceEnabled() == null) ? 0 : getDataTraceEnabled().hashCode());
        hashCode = prime * hashCode + ((getThrottlingBurstLimit() == null) ? 0 : getThrottlingBurstLimit().hashCode());
        hashCode = prime * hashCode + ((getThrottlingRateLimit() == null) ? 0 : getThrottlingRateLimit().hashCode());
        hashCode = prime * hashCode + ((getCachingEnabled() == null) ? 0 : getCachingEnabled().hashCode());
        hashCode = prime * hashCode + ((getCacheTtlInSeconds() == null) ? 0 : getCacheTtlInSeconds().hashCode());
        hashCode = prime * hashCode + ((getCacheDataEncrypted() == null) ? 0 : getCacheDataEncrypted().hashCode());
        hashCode = prime * hashCode + ((getRequireAuthorizationForCacheControl() == null) ? 0 : getRequireAuthorizationForCacheControl().hashCode());
        hashCode = prime * hashCode + ((getUnauthorizedCacheControlHeaderStrategy() == null) ? 0 : getUnauthorizedCacheControlHeaderStrategy().hashCode());
        hashCode = prime * hashCode + ((getHttpMethod() == null) ? 0 : getHttpMethod().hashCode());
        hashCode = prime * hashCode + ((getResourcePath() == null) ? 0 : getResourcePath().hashCode());
        return hashCode;
    }

    @Override
    public AwsApiGatewayMethodSettings clone() {
        try {
            return (AwsApiGatewayMethodSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsApiGatewayMethodSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
