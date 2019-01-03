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

/**
 * Builder class for HostRegexToRegionMapping which exposes its property
 * setters.
 */
public class HostRegexToRegionMappingJsonHelper implements Builder<HostRegexToRegionMapping> {

    private String hostNameRegex;
    private String regionName;

    public HostRegexToRegionMappingJsonHelper() {}

    public String getHostNameRegex() {
        return hostNameRegex;
    }

    public void setHostNameRegex(String hostNameRegex) {
        this.hostNameRegex = hostNameRegex;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    @Override
    public HostRegexToRegionMapping build() {
        return new HostRegexToRegionMapping(hostNameRegex, regionName);
    }

}
