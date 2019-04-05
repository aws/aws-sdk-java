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
package com.amazonaws.regions;


import static com.amazonaws.SDKGlobalConfiguration.AWS_REGION_SYSTEM_PROPERTY;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class AwsSystemPropertyRegionProviderTest {

    @Test
    public void systemPropertySet_ReturnsSystemPropertyValueFromProvider() {
        try {
            final String expectedRegion = "some-system-prop-region";
            System.setProperty(AWS_REGION_SYSTEM_PROPERTY, expectedRegion);
            assertEquals(expectedRegion, new AwsSystemPropertyRegionProvider().getRegion());
        } finally {
            System.clearProperty(AWS_REGION_SYSTEM_PROPERTY);
        }
    }

    @Test
    public void systemPropertyNotSet_ReturnsNull() {
        assertNull(new AwsSystemPropertyRegionProvider().getRegion());
    }
}