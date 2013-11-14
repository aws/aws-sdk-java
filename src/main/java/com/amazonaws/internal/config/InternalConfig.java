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
package com.amazonaws.internal.config;

import java.io.IOException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.annotation.Immutable;

import com.amazonaws.regions.Regions;
import com.amazonaws.util.json.Jackson;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

/**
 * Internal configuration for the AWS Java SDK.
 */
@Immutable
public class InternalConfig {
    private static final Log log = LogFactory.getLog(InternalConfig.class);
    static final String DEFAULT_CONFIG_RESOURCE = "awssdk_config.json";
    static final String CONFIG_OVERRIDE_RESOURCE = "awssdk_config_override.json";
    private static final String SERVICE_REGION_DELIMITOR = "/";

    private final SignerConfig defaultSignerConfig;
    private final Map<String, SignerConfig> serviceRegionSigners;
    private final Map<String, SignerConfig> regionSigners;
    private final Map<String, SignerConfig> serviceSigners;

    /**
     * @param defaults default configuration
     * @param override override configuration 
     */
    InternalConfig(InternalConfigJsonHelper defaults, InternalConfigJsonHelper override) {
        SignerConfigJsonHelper scb = defaults.getDefaultSigner();
        this.defaultSignerConfig = scb == null ? null : scb.build();
        regionSigners = mergeSignerMap(defaults.getRegionSigners(),
            override.getRegionSigners(), "region");
        serviceSigners = mergeSignerMap(defaults.getServiceSigners(),
            override.getServiceSigners(), "service");
        serviceRegionSigners = mergeSignerMap(defaults.getServiceRegionSigners(),
            override.getServiceRegionSigners(), 
            "service" + SERVICE_REGION_DELIMITOR + "region");
    }

    /**
     * Returns an immutable map by merging the override signer configuration
     * into the default signer configuration for the given theme.
     * 
     * @param defaults
     *            default signer configuration
     * @param override
     *            signer configurations overrides
     * @param theme
     *            used for message logging. eg region, service, region+service
     */
    private Map<String, SignerConfig> mergeSignerMap(SignerJsonIndex[] defaults,
            SignerJsonIndex[] overrides, String theme) {
        Map<String, SignerConfig> map = buildSignerMap(defaults, theme);
        Map<String, SignerConfig> mapOverride = buildSignerMap(overrides, theme);
        map.putAll(mapOverride);
        return Collections.unmodifiableMap(map);
    }

    /**
     * Builds and returns a signer configuration map.
     * 
     * @param signerIndexes
     *            signer configuration entries loaded from JSON
     * @param theme
     *            used for message logging. eg region, service, region+service
     */
    private Map<String, SignerConfig> buildSignerMap(
            SignerJsonIndex[] signerIndexes, String theme) {
        Map<String, SignerConfig> map = new HashMap<String, SignerConfig>();
        if (signerIndexes != null) {
            for (SignerJsonIndex index: signerIndexes) {
                String region = index.getKey();
                SignerConfig prev = map.put(region, index.newSignerConfig());
                if (prev != null) {
                    log.warn("Duplicate definition of signer for " + theme + " "
                            + index.getKey());
                }
            }
        }
        return map;
    }

    /**
     * Returns the signer configuration for the specified service, not
     * specific to any region.
     */
    public SignerConfig getSignerConfig(String serviceName) {
        return getSignerConfig(serviceName, null);
    }

    /**
     * Returns the signer configuration for the specified service name and
     * an optional region name.
     * @param serviceName must not be null
     * @param regionName similar to the region name in {@link Regions};
     * can be null.
     * @return the signer
     */
    public SignerConfig getSignerConfig(String serviceName, String regionName) {
        if (serviceName == null)
            throw new IllegalArgumentException();
        SignerConfig signerConfig = null;
        if (regionName != null) {
            // Service+Region signer config has the highest precedence
            String key = serviceName + SERVICE_REGION_DELIMITOR +regionName;
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

    static InternalConfigJsonHelper loadfrom(URL url) throws JsonParseException,
    JsonMappingException, IOException {
        InternalConfigJsonHelper target = Jackson.getObjectMapper()
                .readValue(url, InternalConfigJsonHelper.class);
        return target;
    }

    /**
     * Loads and returns the AWS Java SDK internal configuration from the
     * classpath.
     */
    static InternalConfig load() throws JsonParseException,
        JsonMappingException, IOException {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        URL url = loader.getResource(DEFAULT_CONFIG_RESOURCE);
        InternalConfigJsonHelper config = loadfrom(url);
        InternalConfigJsonHelper configOverride;
        URL overrideUrl = loader.getResource(CONFIG_OVERRIDE_RESOURCE);
        if (overrideUrl == null) {
            log.debug("Configuration override " + CONFIG_OVERRIDE_RESOURCE
                    + " not found.");
            configOverride = new InternalConfigJsonHelper();
        } else {
            configOverride = loadfrom(overrideUrl);
        }
        return new InternalConfig(config, configOverride);
    }
    
    // For debugging purposes
    void dump() {
        StringBuilder sb = new StringBuilder().append("defaultSignerConfig: ")
                .append(defaultSignerConfig).append("\n")
                .append("serviceRegionSigners: ").append(serviceRegionSigners)
                .append("\n").append("regionSigners: ").append(regionSigners)
                .append("\n").append("serviceSigners: ").append(serviceSigners);
        log.debug(sb.toString());
    }

    public static class Factory {
        private static final InternalConfig SINGELTON;
        static {
            InternalConfig config = null;
            try {
                config = InternalConfig.load();
            } catch(RuntimeException ex) {
                throw ex;
            } catch(Exception ex) {
                throw new IllegalStateException(
                        "Fatal: Failed to load the internal config for AWS Java SDK",
                        ex);
            }
            SINGELTON = config;
        }
        /**
         * Returns a non-null and immutable instance of the AWS SDK internal
         * configuration.
         */
        public static InternalConfig getInternalConfig() { return SINGELTON; }
    }
}
