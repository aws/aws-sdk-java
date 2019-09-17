/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.regions;

import com.amazonaws.AmazonClientException;
import com.amazonaws.SDKGlobalConfiguration;
import com.amazonaws.util.EC2MetadataUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Attempts to load region information from the EC2 Metadata service. If the application is not
 * running on EC2 or {@link SDKGlobalConfiguration#isEc2MetadataDisabled()} returns true,
 * this provider will return null.
 */
public class InstanceMetadataRegionProvider extends AwsRegionProvider {

    private static final Log LOG = LogFactory.getLog(InstanceMetadataRegionProvider.class);

    /**
     * Cache region as it will not change during the lifetime of the JVM.
     */
    private volatile String region;

    /**
     * @throws AmazonClientException if {@link SDKGlobalConfiguration#isEc2MetadataDisabled()} is true
     */
    @Override
    public String getRegion() {
        if (SDKGlobalConfiguration.isEc2MetadataDisabled()) {
            throw new AmazonClientException("AWS_EC2_METADATA_DISABLED is set to true, not loading region from EC2 Instance "
                                         + "Metadata service");
        }

        if (region == null) {
            synchronized (this) {
                if (region == null) {
                    this.region = tryDetectRegion();
                }
            }
        }
        return region;
    }

    private String tryDetectRegion() {
        try {
            return EC2MetadataUtils.getEC2InstanceRegion();
        } catch (AmazonClientException sce) {
            LOG.debug("Ignoring failure to retrieve the region: " + sce.getMessage());
            return null;
        }
    }
}
