/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.auth.profile;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import com.amazonaws.auth.profile.internal.BasicProfile;
import com.amazonaws.auth.profile.internal.BasicProfileConfigFileLoader;
import java.net.URL;
import org.junit.Test;
import utils.TestProfileFileLocationProvider;

public class BasicProfileConfigFileLoaderTest {

    @Test
    public void basicProfileConfig() {
        URL url = ProfileResourceLoader.basicConfigProfile().asUrl();

        BasicProfileConfigFileLoader loader = new BasicProfileConfigFileLoader(new TestProfileFileLocationProvider(url));
        BasicProfile profile = loader.getProfile();

        assertEquals("bar", profile.getPropertyValue("foo"));
        assertEquals("world", profile.getPropertyValue("hello"));
    }

    @Test
    public void invalidProfile_shouldReturnNull() {
        URL url = ProfileResourceLoader.profileNameWithNoOpeningBraces().asUrl();

        BasicProfileConfigFileLoader loader = new BasicProfileConfigFileLoader(new TestProfileFileLocationProvider(url));
        BasicProfile profile = loader.getProfile();
        assertNull(profile);
    }
}
