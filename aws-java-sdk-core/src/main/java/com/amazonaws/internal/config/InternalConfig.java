/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.internal.config;

import java.io.IOException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.amazonaws.annotation.Immutable;
import com.amazonaws.log.InternalLogApi;
import com.amazonaws.log.InternalLogFactory;
import com.amazonaws.util.ClassLoaderHelper;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Internal configuration for the AWS Java SDK.
 */
@Immutable
public class InternalConfig {

    //@formatter:off
    private static final ObjectMapper MAPPER = new ObjectMapper()
            .disable(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS)
            .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
            .configure(JsonParser.Feature.ALLOW_COMMENTS, true);
    //@formatter:on

    private static final InternalLogApi log = InternalLogFactory.getLog(InternalConfig.class);

    static final String DEFAULT_CONFIG_RESOURCE_RELATIVE_PATH = "awssdk_config_default.json";
    static final String DEFAULT_CONFIG_RESOURCE_ABSOLUTE_PATH = "/com/amazonaws/internal/config/"
            + DEFAULT_CONFIG_RESOURCE_RELATIVE_PATH;

    static final String CONFIG_OVERRIDE_RESOURCE = "awssdk_config_override.json";

    static final String ENDPOINT_DISCOVERY_CONFIG_ABSOLUTE_PATH =
            "/com/amazonaws/endpointdiscovery/endpoint-discovery.json";

    private static final String SERVICE_REGION_DELIMITOR = "/";

    private final SignerConfig defaultSignerConfig;
    private final Map<String, SignerConfig> serviceRegionSigners;
    private final Map<String, SignerConfig> regionSigners;
    private final Map<String, SignerConfig> serviceSigners;
    private final Map<String, HttpClientConfig> httpClients;

    private final List<HostRegexToRegionMapping> hostRegexToRegionMappings;

    private final String userAgentTemplate;

    private final boolean endpointDiscoveryEnabled;

    /**
     * @param defaults
     *            default configuration
     * @param override
     *            override configuration
     */
    InternalConfig(InternalConfigJsonHelper defaults,
                   InternalConfigJsonHelper override,
                   EndpointDiscoveryConfig endpointDiscoveryConfig) {
        SignerConfigJsonHelper scb = defaults.getDefaultSigner();
        this.defaultSignerConfig = scb == null ? null : scb.build();

        regionSigners = mergeSignerMap(defaults.getRegionSigners(), override.getRegionSigners(), "region");
        serviceSigners = mergeSignerMap(defaults.getServiceSigners(), override.getServiceSigners(), "service");
        serviceRegionSigners = mergeSignerMap(defaults.getServiceRegionSigners(), override.getServiceRegionSigners(),
                "service" + SERVICE_REGION_DELIMITOR + "region");
        httpClients = merge(defaults.getHttpClients(), override.getHttpClients());

        hostRegexToRegionMappings = append(override.getHostRegexToRegionMappings(),
                defaults.getHostRegexToRegionMappings());

        if (override.getUserAgentTemplate() != null) {
            userAgentTemplate = override.getUserAgentTemplate();
        } else {
            userAgentTemplate = defaults.getUserAgentTemplate();
        }

        endpointDiscoveryEnabled = endpointDiscoveryConfig.isEndpointDiscoveryEnabled();
    }

    /**
     * Returns an immutable map by merging the override signer configuration into the default signer
     * configuration for the given theme.
     *
     * @param defaults
     *            default signer configuration
     * @param override
     *            signer configurations overrides
     * @param theme
     *            used for message logging. eg region, service, region+service
     */
    private Map<String, SignerConfig> mergeSignerMap(JsonIndex<SignerConfigJsonHelper, SignerConfig>[] defaults,
                                                     JsonIndex<SignerConfigJsonHelper, SignerConfig>[] overrides,
                                                     String theme) {
        Map<String, SignerConfig> map = buildSignerMap(defaults, theme);
        Map<String, SignerConfig> mapOverride = buildSignerMap(overrides, theme);
        map.putAll(mapOverride);
        return Collections.unmodifiableMap(map);
    }

    private <C extends Builder<T>, T> Map<String, T> merge(JsonIndex<C, T>[] defaults, JsonIndex<C, T>[] overrides) {
        Map<String, T> map = buildMap(defaults);
        Map<String, T> mapOverride = buildMap(overrides);
        map.putAll(mapOverride);
        return Collections.unmodifiableMap(map);
    }

    private <C extends Builder<T>, T> Map<String, T> buildMap(JsonIndex<C, T>[] signerIndexes) {
        Map<String, T> map = new HashMap<String, T>();
        if (signerIndexes != null) {
            for (JsonIndex<C, T> index : signerIndexes) {
                String region = index.getKey();
                T prev = map.put(region, index.newReadOnlyConfig());
                if (prev != null) {
                    log.warn("Duplicate definition of signer for " + index.getKey());
                }
            }
        }
        return map;
    }

    private <C extends Builder<T>, T> List<T> append(C[] defaults, C[] overrides) {
        List<T> list = new LinkedList<T>();
        if (defaults != null) {
            for (C builder : defaults) {
                list.add(builder.build());
            }
        }
        if (overrides != null) {
            for (C builder : overrides) {
                list.add(builder.build());
            }
        }
        return list;
    }

    /**
     * Builds and returns a signer configuration map.
     *
     * @param signerIndexes
     *            signer configuration entries loaded from JSON
     * @param theme
     *            used for message logging. eg region, service, region+service
     */
    private Map<String, SignerConfig> buildSignerMap(JsonIndex<SignerConfigJsonHelper, SignerConfig>[] signerIndexes,
                                                     String theme) {
        Map<String, SignerConfig> map = new HashMap<String, SignerConfig>();
        if (signerIndexes != null) {
            for (JsonIndex<SignerConfigJsonHelper, SignerConfig> index : signerIndexes) {
                String region = index.getKey();
                SignerConfig prev = map.put(region, index.newReadOnlyConfig());
                if (prev != null) {
                    log.warn("Duplicate definition of signer for " + theme + " " + index.getKey());
                }
            }
        }
        return map;
    }

    /**
     * Returns the signer configuration for the specified service, not specific to any region.
     */
    public SignerConfig getSignerConfig(String serviceName) {
        return getSignerConfig(serviceName, null);
    }

    /**
     * Returns the http client configuration for the http client name.
     */
    public HttpClientConfig getHttpClientConfig(String httpClientName) {
        return httpClients.get(httpClientName);
    }

    /**
     * Returns the signer configuration for the specified service name and an optional region name.
     * 
     * @param serviceName
     *            must not be null
     * @param regionName
     *            similar to the region name in <code>Regions</code>; can be null.
     * @return the signer
     */
    public SignerConfig getSignerConfig(String serviceName, String regionName) {
        if (serviceName == null)
            throw new IllegalArgumentException();
        SignerConfig signerConfig = null;
        if (regionName != null) {
            // Service+Region signer config has the highest precedence
            String key = serviceName + SERVICE_REGION_DELIMITOR + regionName;
            signerConfig = serviceRegionSigners.get(key);
            if (signerConfig != null) {
                return signerConfig;
            }
            // Region signer config has the 2nd highest precedence
            signerConfig = regionSigners.get(regionName);
            if (signerConfig != null) {
                return signerConfig;
            }
        }
        // Service signer config has the 3rd highest precedence
        signerConfig = serviceSigners.get(serviceName);
        // Fall back to the default
        return signerConfig == null ? defaultSignerConfig : signerConfig;
    }

    /**
     * @return all the host-name-regex to region-name mappings.
     */
    public List<HostRegexToRegionMapping> getHostRegexToRegionMappings() {
        return Collections.unmodifiableList(hostRegexToRegionMappings);
    }

    /**
     * @return the custom user agent template, if configured
     */
    public String getUserAgentTemplate() {
        return userAgentTemplate;
    }

    public boolean endpointDiscoveryEnabled() {
        return endpointDiscoveryEnabled;
    }

    static <T> T loadfrom(URL url, Class<T> clazz) throws JsonParseException, JsonMappingException, IOException {
        if (url == null)
            throw new IllegalArgumentException();
        T target = MAPPER.readValue(url, clazz);
        return target;
    }

    /**
     * Loads and returns the AWS Java SDK internal configuration from the classpath.
     */
    static InternalConfig load() throws JsonParseException, JsonMappingException, IOException {
        URL configUrl = getResource(DEFAULT_CONFIG_RESOURCE_RELATIVE_PATH, true, false);
        if (configUrl == null) {
            configUrl = getResource(DEFAULT_CONFIG_RESOURCE_ABSOLUTE_PATH, false, false);
        }

        InternalConfigJsonHelper config = loadfrom(configUrl, InternalConfigJsonHelper.class);
        InternalConfigJsonHelper configOverride;

        URL overrideUrl = getResource(CONFIG_OVERRIDE_RESOURCE, false, true);
        if (overrideUrl == null) {
            overrideUrl = getResource(CONFIG_OVERRIDE_RESOURCE, false, false);
        }
        if (overrideUrl == null) {
            log.debug("Configuration override " + CONFIG_OVERRIDE_RESOURCE + " not found.");
            configOverride = new InternalConfigJsonHelper();
        } else {
            configOverride = loadfrom(overrideUrl, InternalConfigJsonHelper.class);
        }

        EndpointDiscoveryConfig endpointDiscoveryConfig = new EndpointDiscoveryConfig();

        URL endpointDiscoveryConfigUrl = getResource(ENDPOINT_DISCOVERY_CONFIG_ABSOLUTE_PATH, false, false);

        if (endpointDiscoveryConfigUrl != null) {
            endpointDiscoveryConfig = loadfrom(endpointDiscoveryConfigUrl, EndpointDiscoveryConfig.class);
        }

        InternalConfig merged = new InternalConfig(config, configOverride, endpointDiscoveryConfig);
        merged.setDefaultConfigFileLocation(configUrl);
        merged.setOverrideConfigFileLocation(overrideUrl);
        return merged;
    }

    private static URL getResource(String path, boolean classesFirst, boolean addLeadingSlash) {
        path = addLeadingSlash ? "/" + path : path;

        URL resourceUrl = ClassLoaderHelper.getResource(path, classesFirst, InternalConfig.class);

        return resourceUrl;
    }

    /*
     * For debugging purposes
     */

    private URL defaultConfigFileLocation;
    private URL overrideConfigFileLocation;

    public URL getDefaultConfigFileLocation() {
        return defaultConfigFileLocation;
    }

    public URL getOverrideConfigFileLocation() {
        return overrideConfigFileLocation;
    }

    void setDefaultConfigFileLocation(URL url) {
        this.defaultConfigFileLocation = url;
    }

    void setOverrideConfigFileLocation(URL url) {
        this.overrideConfigFileLocation = url;
    }

    void dump() {
        StringBuilder sb = new StringBuilder().append("defaultSignerConfig: ").append(defaultSignerConfig).append("\n")
                .append("serviceRegionSigners: ").append(serviceRegionSigners).append("\n").append("regionSigners: ")
                .append(regionSigners).append("\n").append("serviceSigners: ").append(serviceSigners).append("\n")
                .append("userAgentTemplate: ").append(userAgentTemplate);
        log.debug(sb.toString());
    }

    public static class Factory {
        private static final InternalConfig SINGELTON;

        static {
            InternalConfig config = null;
            try {
                config = InternalConfig.load();
            } catch (RuntimeException ex) {
                throw ex;
            } catch (Exception ex) {
                throw new IllegalStateException("Fatal: Failed to load the internal config for AWS Java SDK", ex);
            }
            SINGELTON = config;
        }

        /**
         * Returns a non-null and immutable instance of the AWS SDK internal configuration.
         */
        public static InternalConfig getInternalConfig() {
            return SINGELTON;
        }
    }
}
