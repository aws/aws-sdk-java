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
package com.amazonaws.services.apigateway.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the method setting properties.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MethodSetting implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies whether Amazon CloudWatch metrics are enabled for this method. The PATCH path for this setting is
     * <code>/{method_setting_key}/metrics/enabled</code>, and the value is a Boolean.
     * </p>
     */
    private Boolean metricsEnabled;
    /**
     * <p>
     * Specifies the logging level for this method, which affects the log entries pushed to Amazon CloudWatch Logs. The
     * PATCH path for this setting is <code>/{method_setting_key}/logging/loglevel</code>, and the available levels are
     * <code>OFF</code>, <code>ERROR</code>, and <code>INFO</code>.
     * </p>
     */
    private String loggingLevel;
    /**
     * <p>
     * Specifies whether data trace logging is enabled for this method, which affects the log entries pushed to Amazon
     * CloudWatch Logs. The PATCH path for this setting is <code>/{method_setting_key}/logging/dataTrace</code>, and the
     * value is a Boolean.
     * </p>
     */
    private Boolean dataTraceEnabled;
    /**
     * <p>
     * Specifies the throttling burst limit. The PATCH path for this setting is
     * <code>/{method_setting_key}/throttling/burstLimit</code>, and the value is an integer.
     * </p>
     */
    private Integer throttlingBurstLimit;
    /**
     * <p>
     * Specifies the throttling rate limit. The PATCH path for this setting is
     * <code>/{method_setting_key}/throttling/rateLimit</code>, and the value is a double.
     * </p>
     */
    private Double throttlingRateLimit;
    /**
     * <p>
     * Specifies whether responses should be cached and returned for requests. A cache cluster must be enabled on the
     * stage for responses to be cached. The PATCH path for this setting is
     * <code>/{method_setting_key}/caching/enabled</code>, and the value is a Boolean.
     * </p>
     */
    private Boolean cachingEnabled;
    /**
     * <p>
     * Specifies the time to live (TTL), in seconds, for cached responses. The higher the TTL, the longer the response
     * will be cached. The PATCH path for this setting is <code>/{method_setting_key}/caching/ttlInSeconds</code>, and
     * the value is an integer.
     * </p>
     */
    private Integer cacheTtlInSeconds;
    /**
     * <p>
     * Specifies whether the cached responses are encrypted. The PATCH path for this setting is
     * <code>/{method_setting_key}/caching/dataEncrypted</code>, and the value is a Boolean.
     * </p>
     */
    private Boolean cacheDataEncrypted;
    /**
     * <p>
     * Specifies whether authorization is required for a cache invalidation request. The PATCH path for this setting is
     * <code>/{method_setting_key}/caching/requireAuthorizationForCacheControl</code>, and the value is a Boolean.
     * </p>
     */
    private Boolean requireAuthorizationForCacheControl;
    /**
     * <p>
     * Specifies how to handle unauthorized requests for cache invalidation. The PATCH path for this setting is
     * <code>/{method_setting_key}/caching/unauthorizedCacheControlHeaderStrategy</code>, and the available values are
     * <code>FAIL_WITH_403</code>, <code>SUCCEED_WITH_RESPONSE_HEADER</code>,
     * <code>SUCCEED_WITHOUT_RESPONSE_HEADER</code>.
     * </p>
     */
    private String unauthorizedCacheControlHeaderStrategy;

    /**
     * <p>
     * Specifies whether Amazon CloudWatch metrics are enabled for this method. The PATCH path for this setting is
     * <code>/{method_setting_key}/metrics/enabled</code>, and the value is a Boolean.
     * </p>
     * 
     * @param metricsEnabled
     *        Specifies whether Amazon CloudWatch metrics are enabled for this method. The PATCH path for this setting
     *        is <code>/{method_setting_key}/metrics/enabled</code>, and the value is a Boolean.
     */

    public void setMetricsEnabled(Boolean metricsEnabled) {
        this.metricsEnabled = metricsEnabled;
    }

    /**
     * <p>
     * Specifies whether Amazon CloudWatch metrics are enabled for this method. The PATCH path for this setting is
     * <code>/{method_setting_key}/metrics/enabled</code>, and the value is a Boolean.
     * </p>
     * 
     * @return Specifies whether Amazon CloudWatch metrics are enabled for this method. The PATCH path for this setting
     *         is <code>/{method_setting_key}/metrics/enabled</code>, and the value is a Boolean.
     */

    public Boolean getMetricsEnabled() {
        return this.metricsEnabled;
    }

    /**
     * <p>
     * Specifies whether Amazon CloudWatch metrics are enabled for this method. The PATCH path for this setting is
     * <code>/{method_setting_key}/metrics/enabled</code>, and the value is a Boolean.
     * </p>
     * 
     * @param metricsEnabled
     *        Specifies whether Amazon CloudWatch metrics are enabled for this method. The PATCH path for this setting
     *        is <code>/{method_setting_key}/metrics/enabled</code>, and the value is a Boolean.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MethodSetting withMetricsEnabled(Boolean metricsEnabled) {
        setMetricsEnabled(metricsEnabled);
        return this;
    }

    /**
     * <p>
     * Specifies whether Amazon CloudWatch metrics are enabled for this method. The PATCH path for this setting is
     * <code>/{method_setting_key}/metrics/enabled</code>, and the value is a Boolean.
     * </p>
     * 
     * @return Specifies whether Amazon CloudWatch metrics are enabled for this method. The PATCH path for this setting
     *         is <code>/{method_setting_key}/metrics/enabled</code>, and the value is a Boolean.
     */

    public Boolean isMetricsEnabled() {
        return this.metricsEnabled;
    }

    /**
     * <p>
     * Specifies the logging level for this method, which affects the log entries pushed to Amazon CloudWatch Logs. The
     * PATCH path for this setting is <code>/{method_setting_key}/logging/loglevel</code>, and the available levels are
     * <code>OFF</code>, <code>ERROR</code>, and <code>INFO</code>.
     * </p>
     * 
     * @param loggingLevel
     *        Specifies the logging level for this method, which affects the log entries pushed to Amazon CloudWatch
     *        Logs. The PATCH path for this setting is <code>/{method_setting_key}/logging/loglevel</code>, and the
     *        available levels are <code>OFF</code>, <code>ERROR</code>, and <code>INFO</code>.
     */

    public void setLoggingLevel(String loggingLevel) {
        this.loggingLevel = loggingLevel;
    }

    /**
     * <p>
     * Specifies the logging level for this method, which affects the log entries pushed to Amazon CloudWatch Logs. The
     * PATCH path for this setting is <code>/{method_setting_key}/logging/loglevel</code>, and the available levels are
     * <code>OFF</code>, <code>ERROR</code>, and <code>INFO</code>.
     * </p>
     * 
     * @return Specifies the logging level for this method, which affects the log entries pushed to Amazon CloudWatch
     *         Logs. The PATCH path for this setting is <code>/{method_setting_key}/logging/loglevel</code>, and the
     *         available levels are <code>OFF</code>, <code>ERROR</code>, and <code>INFO</code>.
     */

    public String getLoggingLevel() {
        return this.loggingLevel;
    }

    /**
     * <p>
     * Specifies the logging level for this method, which affects the log entries pushed to Amazon CloudWatch Logs. The
     * PATCH path for this setting is <code>/{method_setting_key}/logging/loglevel</code>, and the available levels are
     * <code>OFF</code>, <code>ERROR</code>, and <code>INFO</code>.
     * </p>
     * 
     * @param loggingLevel
     *        Specifies the logging level for this method, which affects the log entries pushed to Amazon CloudWatch
     *        Logs. The PATCH path for this setting is <code>/{method_setting_key}/logging/loglevel</code>, and the
     *        available levels are <code>OFF</code>, <code>ERROR</code>, and <code>INFO</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MethodSetting withLoggingLevel(String loggingLevel) {
        setLoggingLevel(loggingLevel);
        return this;
    }

    /**
     * <p>
     * Specifies whether data trace logging is enabled for this method, which affects the log entries pushed to Amazon
     * CloudWatch Logs. The PATCH path for this setting is <code>/{method_setting_key}/logging/dataTrace</code>, and the
     * value is a Boolean.
     * </p>
     * 
     * @param dataTraceEnabled
     *        Specifies whether data trace logging is enabled for this method, which affects the log entries pushed to
     *        Amazon CloudWatch Logs. The PATCH path for this setting is
     *        <code>/{method_setting_key}/logging/dataTrace</code>, and the value is a Boolean.
     */

    public void setDataTraceEnabled(Boolean dataTraceEnabled) {
        this.dataTraceEnabled = dataTraceEnabled;
    }

    /**
     * <p>
     * Specifies whether data trace logging is enabled for this method, which affects the log entries pushed to Amazon
     * CloudWatch Logs. The PATCH path for this setting is <code>/{method_setting_key}/logging/dataTrace</code>, and the
     * value is a Boolean.
     * </p>
     * 
     * @return Specifies whether data trace logging is enabled for this method, which affects the log entries pushed to
     *         Amazon CloudWatch Logs. The PATCH path for this setting is
     *         <code>/{method_setting_key}/logging/dataTrace</code>, and the value is a Boolean.
     */

    public Boolean getDataTraceEnabled() {
        return this.dataTraceEnabled;
    }

    /**
     * <p>
     * Specifies whether data trace logging is enabled for this method, which affects the log entries pushed to Amazon
     * CloudWatch Logs. The PATCH path for this setting is <code>/{method_setting_key}/logging/dataTrace</code>, and the
     * value is a Boolean.
     * </p>
     * 
     * @param dataTraceEnabled
     *        Specifies whether data trace logging is enabled for this method, which affects the log entries pushed to
     *        Amazon CloudWatch Logs. The PATCH path for this setting is
     *        <code>/{method_setting_key}/logging/dataTrace</code>, and the value is a Boolean.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MethodSetting withDataTraceEnabled(Boolean dataTraceEnabled) {
        setDataTraceEnabled(dataTraceEnabled);
        return this;
    }

    /**
     * <p>
     * Specifies whether data trace logging is enabled for this method, which affects the log entries pushed to Amazon
     * CloudWatch Logs. The PATCH path for this setting is <code>/{method_setting_key}/logging/dataTrace</code>, and the
     * value is a Boolean.
     * </p>
     * 
     * @return Specifies whether data trace logging is enabled for this method, which affects the log entries pushed to
     *         Amazon CloudWatch Logs. The PATCH path for this setting is
     *         <code>/{method_setting_key}/logging/dataTrace</code>, and the value is a Boolean.
     */

    public Boolean isDataTraceEnabled() {
        return this.dataTraceEnabled;
    }

    /**
     * <p>
     * Specifies the throttling burst limit. The PATCH path for this setting is
     * <code>/{method_setting_key}/throttling/burstLimit</code>, and the value is an integer.
     * </p>
     * 
     * @param throttlingBurstLimit
     *        Specifies the throttling burst limit. The PATCH path for this setting is
     *        <code>/{method_setting_key}/throttling/burstLimit</code>, and the value is an integer.
     */

    public void setThrottlingBurstLimit(Integer throttlingBurstLimit) {
        this.throttlingBurstLimit = throttlingBurstLimit;
    }

    /**
     * <p>
     * Specifies the throttling burst limit. The PATCH path for this setting is
     * <code>/{method_setting_key}/throttling/burstLimit</code>, and the value is an integer.
     * </p>
     * 
     * @return Specifies the throttling burst limit. The PATCH path for this setting is
     *         <code>/{method_setting_key}/throttling/burstLimit</code>, and the value is an integer.
     */

    public Integer getThrottlingBurstLimit() {
        return this.throttlingBurstLimit;
    }

    /**
     * <p>
     * Specifies the throttling burst limit. The PATCH path for this setting is
     * <code>/{method_setting_key}/throttling/burstLimit</code>, and the value is an integer.
     * </p>
     * 
     * @param throttlingBurstLimit
     *        Specifies the throttling burst limit. The PATCH path for this setting is
     *        <code>/{method_setting_key}/throttling/burstLimit</code>, and the value is an integer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MethodSetting withThrottlingBurstLimit(Integer throttlingBurstLimit) {
        setThrottlingBurstLimit(throttlingBurstLimit);
        return this;
    }

    /**
     * <p>
     * Specifies the throttling rate limit. The PATCH path for this setting is
     * <code>/{method_setting_key}/throttling/rateLimit</code>, and the value is a double.
     * </p>
     * 
     * @param throttlingRateLimit
     *        Specifies the throttling rate limit. The PATCH path for this setting is
     *        <code>/{method_setting_key}/throttling/rateLimit</code>, and the value is a double.
     */

    public void setThrottlingRateLimit(Double throttlingRateLimit) {
        this.throttlingRateLimit = throttlingRateLimit;
    }

    /**
     * <p>
     * Specifies the throttling rate limit. The PATCH path for this setting is
     * <code>/{method_setting_key}/throttling/rateLimit</code>, and the value is a double.
     * </p>
     * 
     * @return Specifies the throttling rate limit. The PATCH path for this setting is
     *         <code>/{method_setting_key}/throttling/rateLimit</code>, and the value is a double.
     */

    public Double getThrottlingRateLimit() {
        return this.throttlingRateLimit;
    }

    /**
     * <p>
     * Specifies the throttling rate limit. The PATCH path for this setting is
     * <code>/{method_setting_key}/throttling/rateLimit</code>, and the value is a double.
     * </p>
     * 
     * @param throttlingRateLimit
     *        Specifies the throttling rate limit. The PATCH path for this setting is
     *        <code>/{method_setting_key}/throttling/rateLimit</code>, and the value is a double.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MethodSetting withThrottlingRateLimit(Double throttlingRateLimit) {
        setThrottlingRateLimit(throttlingRateLimit);
        return this;
    }

    /**
     * <p>
     * Specifies whether responses should be cached and returned for requests. A cache cluster must be enabled on the
     * stage for responses to be cached. The PATCH path for this setting is
     * <code>/{method_setting_key}/caching/enabled</code>, and the value is a Boolean.
     * </p>
     * 
     * @param cachingEnabled
     *        Specifies whether responses should be cached and returned for requests. A cache cluster must be enabled on
     *        the stage for responses to be cached. The PATCH path for this setting is
     *        <code>/{method_setting_key}/caching/enabled</code>, and the value is a Boolean.
     */

    public void setCachingEnabled(Boolean cachingEnabled) {
        this.cachingEnabled = cachingEnabled;
    }

    /**
     * <p>
     * Specifies whether responses should be cached and returned for requests. A cache cluster must be enabled on the
     * stage for responses to be cached. The PATCH path for this setting is
     * <code>/{method_setting_key}/caching/enabled</code>, and the value is a Boolean.
     * </p>
     * 
     * @return Specifies whether responses should be cached and returned for requests. A cache cluster must be enabled
     *         on the stage for responses to be cached. The PATCH path for this setting is
     *         <code>/{method_setting_key}/caching/enabled</code>, and the value is a Boolean.
     */

    public Boolean getCachingEnabled() {
        return this.cachingEnabled;
    }

    /**
     * <p>
     * Specifies whether responses should be cached and returned for requests. A cache cluster must be enabled on the
     * stage for responses to be cached. The PATCH path for this setting is
     * <code>/{method_setting_key}/caching/enabled</code>, and the value is a Boolean.
     * </p>
     * 
     * @param cachingEnabled
     *        Specifies whether responses should be cached and returned for requests. A cache cluster must be enabled on
     *        the stage for responses to be cached. The PATCH path for this setting is
     *        <code>/{method_setting_key}/caching/enabled</code>, and the value is a Boolean.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MethodSetting withCachingEnabled(Boolean cachingEnabled) {
        setCachingEnabled(cachingEnabled);
        return this;
    }

    /**
     * <p>
     * Specifies whether responses should be cached and returned for requests. A cache cluster must be enabled on the
     * stage for responses to be cached. The PATCH path for this setting is
     * <code>/{method_setting_key}/caching/enabled</code>, and the value is a Boolean.
     * </p>
     * 
     * @return Specifies whether responses should be cached and returned for requests. A cache cluster must be enabled
     *         on the stage for responses to be cached. The PATCH path for this setting is
     *         <code>/{method_setting_key}/caching/enabled</code>, and the value is a Boolean.
     */

    public Boolean isCachingEnabled() {
        return this.cachingEnabled;
    }

    /**
     * <p>
     * Specifies the time to live (TTL), in seconds, for cached responses. The higher the TTL, the longer the response
     * will be cached. The PATCH path for this setting is <code>/{method_setting_key}/caching/ttlInSeconds</code>, and
     * the value is an integer.
     * </p>
     * 
     * @param cacheTtlInSeconds
     *        Specifies the time to live (TTL), in seconds, for cached responses. The higher the TTL, the longer the
     *        response will be cached. The PATCH path for this setting is
     *        <code>/{method_setting_key}/caching/ttlInSeconds</code>, and the value is an integer.
     */

    public void setCacheTtlInSeconds(Integer cacheTtlInSeconds) {
        this.cacheTtlInSeconds = cacheTtlInSeconds;
    }

    /**
     * <p>
     * Specifies the time to live (TTL), in seconds, for cached responses. The higher the TTL, the longer the response
     * will be cached. The PATCH path for this setting is <code>/{method_setting_key}/caching/ttlInSeconds</code>, and
     * the value is an integer.
     * </p>
     * 
     * @return Specifies the time to live (TTL), in seconds, for cached responses. The higher the TTL, the longer the
     *         response will be cached. The PATCH path for this setting is
     *         <code>/{method_setting_key}/caching/ttlInSeconds</code>, and the value is an integer.
     */

    public Integer getCacheTtlInSeconds() {
        return this.cacheTtlInSeconds;
    }

    /**
     * <p>
     * Specifies the time to live (TTL), in seconds, for cached responses. The higher the TTL, the longer the response
     * will be cached. The PATCH path for this setting is <code>/{method_setting_key}/caching/ttlInSeconds</code>, and
     * the value is an integer.
     * </p>
     * 
     * @param cacheTtlInSeconds
     *        Specifies the time to live (TTL), in seconds, for cached responses. The higher the TTL, the longer the
     *        response will be cached. The PATCH path for this setting is
     *        <code>/{method_setting_key}/caching/ttlInSeconds</code>, and the value is an integer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MethodSetting withCacheTtlInSeconds(Integer cacheTtlInSeconds) {
        setCacheTtlInSeconds(cacheTtlInSeconds);
        return this;
    }

    /**
     * <p>
     * Specifies whether the cached responses are encrypted. The PATCH path for this setting is
     * <code>/{method_setting_key}/caching/dataEncrypted</code>, and the value is a Boolean.
     * </p>
     * 
     * @param cacheDataEncrypted
     *        Specifies whether the cached responses are encrypted. The PATCH path for this setting is
     *        <code>/{method_setting_key}/caching/dataEncrypted</code>, and the value is a Boolean.
     */

    public void setCacheDataEncrypted(Boolean cacheDataEncrypted) {
        this.cacheDataEncrypted = cacheDataEncrypted;
    }

    /**
     * <p>
     * Specifies whether the cached responses are encrypted. The PATCH path for this setting is
     * <code>/{method_setting_key}/caching/dataEncrypted</code>, and the value is a Boolean.
     * </p>
     * 
     * @return Specifies whether the cached responses are encrypted. The PATCH path for this setting is
     *         <code>/{method_setting_key}/caching/dataEncrypted</code>, and the value is a Boolean.
     */

    public Boolean getCacheDataEncrypted() {
        return this.cacheDataEncrypted;
    }

    /**
     * <p>
     * Specifies whether the cached responses are encrypted. The PATCH path for this setting is
     * <code>/{method_setting_key}/caching/dataEncrypted</code>, and the value is a Boolean.
     * </p>
     * 
     * @param cacheDataEncrypted
     *        Specifies whether the cached responses are encrypted. The PATCH path for this setting is
     *        <code>/{method_setting_key}/caching/dataEncrypted</code>, and the value is a Boolean.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MethodSetting withCacheDataEncrypted(Boolean cacheDataEncrypted) {
        setCacheDataEncrypted(cacheDataEncrypted);
        return this;
    }

    /**
     * <p>
     * Specifies whether the cached responses are encrypted. The PATCH path for this setting is
     * <code>/{method_setting_key}/caching/dataEncrypted</code>, and the value is a Boolean.
     * </p>
     * 
     * @return Specifies whether the cached responses are encrypted. The PATCH path for this setting is
     *         <code>/{method_setting_key}/caching/dataEncrypted</code>, and the value is a Boolean.
     */

    public Boolean isCacheDataEncrypted() {
        return this.cacheDataEncrypted;
    }

    /**
     * <p>
     * Specifies whether authorization is required for a cache invalidation request. The PATCH path for this setting is
     * <code>/{method_setting_key}/caching/requireAuthorizationForCacheControl</code>, and the value is a Boolean.
     * </p>
     * 
     * @param requireAuthorizationForCacheControl
     *        Specifies whether authorization is required for a cache invalidation request. The PATCH path for this
     *        setting is <code>/{method_setting_key}/caching/requireAuthorizationForCacheControl</code>, and the value
     *        is a Boolean.
     */

    public void setRequireAuthorizationForCacheControl(Boolean requireAuthorizationForCacheControl) {
        this.requireAuthorizationForCacheControl = requireAuthorizationForCacheControl;
    }

    /**
     * <p>
     * Specifies whether authorization is required for a cache invalidation request. The PATCH path for this setting is
     * <code>/{method_setting_key}/caching/requireAuthorizationForCacheControl</code>, and the value is a Boolean.
     * </p>
     * 
     * @return Specifies whether authorization is required for a cache invalidation request. The PATCH path for this
     *         setting is <code>/{method_setting_key}/caching/requireAuthorizationForCacheControl</code>, and the value
     *         is a Boolean.
     */

    public Boolean getRequireAuthorizationForCacheControl() {
        return this.requireAuthorizationForCacheControl;
    }

    /**
     * <p>
     * Specifies whether authorization is required for a cache invalidation request. The PATCH path for this setting is
     * <code>/{method_setting_key}/caching/requireAuthorizationForCacheControl</code>, and the value is a Boolean.
     * </p>
     * 
     * @param requireAuthorizationForCacheControl
     *        Specifies whether authorization is required for a cache invalidation request. The PATCH path for this
     *        setting is <code>/{method_setting_key}/caching/requireAuthorizationForCacheControl</code>, and the value
     *        is a Boolean.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MethodSetting withRequireAuthorizationForCacheControl(Boolean requireAuthorizationForCacheControl) {
        setRequireAuthorizationForCacheControl(requireAuthorizationForCacheControl);
        return this;
    }

    /**
     * <p>
     * Specifies whether authorization is required for a cache invalidation request. The PATCH path for this setting is
     * <code>/{method_setting_key}/caching/requireAuthorizationForCacheControl</code>, and the value is a Boolean.
     * </p>
     * 
     * @return Specifies whether authorization is required for a cache invalidation request. The PATCH path for this
     *         setting is <code>/{method_setting_key}/caching/requireAuthorizationForCacheControl</code>, and the value
     *         is a Boolean.
     */

    public Boolean isRequireAuthorizationForCacheControl() {
        return this.requireAuthorizationForCacheControl;
    }

    /**
     * <p>
     * Specifies how to handle unauthorized requests for cache invalidation. The PATCH path for this setting is
     * <code>/{method_setting_key}/caching/unauthorizedCacheControlHeaderStrategy</code>, and the available values are
     * <code>FAIL_WITH_403</code>, <code>SUCCEED_WITH_RESPONSE_HEADER</code>,
     * <code>SUCCEED_WITHOUT_RESPONSE_HEADER</code>.
     * </p>
     * 
     * @param unauthorizedCacheControlHeaderStrategy
     *        Specifies how to handle unauthorized requests for cache invalidation. The PATCH path for this setting is
     *        <code>/{method_setting_key}/caching/unauthorizedCacheControlHeaderStrategy</code>, and the available
     *        values are <code>FAIL_WITH_403</code>, <code>SUCCEED_WITH_RESPONSE_HEADER</code>,
     *        <code>SUCCEED_WITHOUT_RESPONSE_HEADER</code>.
     * @see UnauthorizedCacheControlHeaderStrategy
     */

    public void setUnauthorizedCacheControlHeaderStrategy(String unauthorizedCacheControlHeaderStrategy) {
        this.unauthorizedCacheControlHeaderStrategy = unauthorizedCacheControlHeaderStrategy;
    }

    /**
     * <p>
     * Specifies how to handle unauthorized requests for cache invalidation. The PATCH path for this setting is
     * <code>/{method_setting_key}/caching/unauthorizedCacheControlHeaderStrategy</code>, and the available values are
     * <code>FAIL_WITH_403</code>, <code>SUCCEED_WITH_RESPONSE_HEADER</code>,
     * <code>SUCCEED_WITHOUT_RESPONSE_HEADER</code>.
     * </p>
     * 
     * @return Specifies how to handle unauthorized requests for cache invalidation. The PATCH path for this setting is
     *         <code>/{method_setting_key}/caching/unauthorizedCacheControlHeaderStrategy</code>, and the available
     *         values are <code>FAIL_WITH_403</code>, <code>SUCCEED_WITH_RESPONSE_HEADER</code>,
     *         <code>SUCCEED_WITHOUT_RESPONSE_HEADER</code>.
     * @see UnauthorizedCacheControlHeaderStrategy
     */

    public String getUnauthorizedCacheControlHeaderStrategy() {
        return this.unauthorizedCacheControlHeaderStrategy;
    }

    /**
     * <p>
     * Specifies how to handle unauthorized requests for cache invalidation. The PATCH path for this setting is
     * <code>/{method_setting_key}/caching/unauthorizedCacheControlHeaderStrategy</code>, and the available values are
     * <code>FAIL_WITH_403</code>, <code>SUCCEED_WITH_RESPONSE_HEADER</code>,
     * <code>SUCCEED_WITHOUT_RESPONSE_HEADER</code>.
     * </p>
     * 
     * @param unauthorizedCacheControlHeaderStrategy
     *        Specifies how to handle unauthorized requests for cache invalidation. The PATCH path for this setting is
     *        <code>/{method_setting_key}/caching/unauthorizedCacheControlHeaderStrategy</code>, and the available
     *        values are <code>FAIL_WITH_403</code>, <code>SUCCEED_WITH_RESPONSE_HEADER</code>,
     *        <code>SUCCEED_WITHOUT_RESPONSE_HEADER</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UnauthorizedCacheControlHeaderStrategy
     */

    public MethodSetting withUnauthorizedCacheControlHeaderStrategy(String unauthorizedCacheControlHeaderStrategy) {
        setUnauthorizedCacheControlHeaderStrategy(unauthorizedCacheControlHeaderStrategy);
        return this;
    }

    /**
     * <p>
     * Specifies how to handle unauthorized requests for cache invalidation. The PATCH path for this setting is
     * <code>/{method_setting_key}/caching/unauthorizedCacheControlHeaderStrategy</code>, and the available values are
     * <code>FAIL_WITH_403</code>, <code>SUCCEED_WITH_RESPONSE_HEADER</code>,
     * <code>SUCCEED_WITHOUT_RESPONSE_HEADER</code>.
     * </p>
     * 
     * @param unauthorizedCacheControlHeaderStrategy
     *        Specifies how to handle unauthorized requests for cache invalidation. The PATCH path for this setting is
     *        <code>/{method_setting_key}/caching/unauthorizedCacheControlHeaderStrategy</code>, and the available
     *        values are <code>FAIL_WITH_403</code>, <code>SUCCEED_WITH_RESPONSE_HEADER</code>,
     *        <code>SUCCEED_WITHOUT_RESPONSE_HEADER</code>.
     * @see UnauthorizedCacheControlHeaderStrategy
     */

    public void setUnauthorizedCacheControlHeaderStrategy(UnauthorizedCacheControlHeaderStrategy unauthorizedCacheControlHeaderStrategy) {
        withUnauthorizedCacheControlHeaderStrategy(unauthorizedCacheControlHeaderStrategy);
    }

    /**
     * <p>
     * Specifies how to handle unauthorized requests for cache invalidation. The PATCH path for this setting is
     * <code>/{method_setting_key}/caching/unauthorizedCacheControlHeaderStrategy</code>, and the available values are
     * <code>FAIL_WITH_403</code>, <code>SUCCEED_WITH_RESPONSE_HEADER</code>,
     * <code>SUCCEED_WITHOUT_RESPONSE_HEADER</code>.
     * </p>
     * 
     * @param unauthorizedCacheControlHeaderStrategy
     *        Specifies how to handle unauthorized requests for cache invalidation. The PATCH path for this setting is
     *        <code>/{method_setting_key}/caching/unauthorizedCacheControlHeaderStrategy</code>, and the available
     *        values are <code>FAIL_WITH_403</code>, <code>SUCCEED_WITH_RESPONSE_HEADER</code>,
     *        <code>SUCCEED_WITHOUT_RESPONSE_HEADER</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UnauthorizedCacheControlHeaderStrategy
     */

    public MethodSetting withUnauthorizedCacheControlHeaderStrategy(UnauthorizedCacheControlHeaderStrategy unauthorizedCacheControlHeaderStrategy) {
        this.unauthorizedCacheControlHeaderStrategy = unauthorizedCacheControlHeaderStrategy.toString();
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
            sb.append("UnauthorizedCacheControlHeaderStrategy: ").append(getUnauthorizedCacheControlHeaderStrategy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MethodSetting == false)
            return false;
        MethodSetting other = (MethodSetting) obj;
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
        return hashCode;
    }

    @Override
    public MethodSetting clone() {
        try {
            return (MethodSetting) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apigateway.model.transform.MethodSettingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
