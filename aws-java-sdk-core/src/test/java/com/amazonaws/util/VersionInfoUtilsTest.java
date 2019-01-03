/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is
 * distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either
 * express or implied. See the License for the specific language
 * governing
 * permissions and limitations under the License.
 */
package com.amazonaws.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class VersionInfoUtilsTest {

    @Test
    public void getVersion() {
        assertNotNull(VersionInfoUtils.getVersion());
    }

    @Test
    public void OSGi() {
        assertNotNull(VersionInfoUtils.class.getResource(VersionInfoUtils.VERSION_INFO_FILE));
    }

    @Test
    public void userAgent() {
        String userAgent = VersionInfoUtils.userAgent();
        assertNotNull(userAgent);
    }
}
