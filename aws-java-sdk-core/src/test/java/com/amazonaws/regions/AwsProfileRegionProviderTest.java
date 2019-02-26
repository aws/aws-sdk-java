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

import com.amazonaws.auth.profile.ProfileResourceLoader;
import com.amazonaws.auth.profile.internal.AllProfiles;
import com.amazonaws.auth.profile.internal.BasicProfile;
import com.amazonaws.auth.profile.internal.BasicProfileConfigLoader;
import com.amazonaws.auth.profile.internal.ProfileKeyConstants;
import com.amazonaws.profile.path.AwsProfileFileLocationProvider;
import com.amazonaws.util.ImmutableMapParameter;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.File;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

public class AwsProfileRegionProviderTest {

    private static final String PROFILE = "test_profile";

    @Mock
    private BasicProfileConfigLoader configLoader;

    @Mock
    private AwsProfileFileLocationProvider locationProvider;

    private AwsRegionProvider regionProvider;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        when(locationProvider.getLocation())
                .thenReturn(ProfileResourceLoader.profilesContainingOtherConfiguration().asFile());
        regionProvider = new AwsProfileRegionProvider(PROFILE, locationProvider, configLoader);
    }

    @Test
    public void nullConfigFileLocation_ProvidesNullRegion() {
        when(locationProvider.getLocation()).thenReturn(null);
        assertNull(regionProvider.getRegion());
    }

    @Test
    public void nonExistentConfigFile_ProvidesNullRegion() {
        when(locationProvider.getLocation()).thenReturn(new File("/var/tmp/this/is/invalid.txt"));
        assertNull(regionProvider.getRegion());
    }

    @Test
    public void profilesAreEmpty_ProvidesNullRegion() {
        when(configLoader.loadProfiles(any(File.class)))
                .thenReturn(new AllProfiles(new HashMap<String, BasicProfile>()));
        assertNull(regionProvider.getRegion());
    }

    @Test
    public void profilesNonEmptyButGivenProfileNotPresent_ProvidesNullRegion() {
        final String otherProfileName = "other_profile";
        final BasicProfile other_profile = new BasicProfile(otherProfileName, ImmutableMapParameter
                .of(ProfileKeyConstants.REGION, "us-east-8"));
        final AllProfiles profiles = new AllProfiles(
                ImmutableMapParameter.of(otherProfileName, other_profile));
        stubLoadProfile(profiles);
        assertNull(regionProvider.getRegion());
    }

    @Test
    public void profilePresentButRegionIsNotSet_ProvidesNullRegion() {
        final BasicProfile profile = new BasicProfile(PROFILE, new HashMap<String, String>());
        final AllProfiles profiles = new AllProfiles(ImmutableMapParameter.of(PROFILE, profile));
        stubLoadProfile(profiles);
        assertNull(regionProvider.getRegion());
    }

    @Test
    public void profilePresentButRegionIsEmpty_ProvidesNullRegion() {
        final BasicProfile profile = new BasicProfile(PROFILE, ImmutableMapParameter
                .of(ProfileKeyConstants.REGION, ""));
        final AllProfiles profiles = new AllProfiles(ImmutableMapParameter.of(PROFILE, profile));
        stubLoadProfile(profiles);
        assertNull(regionProvider.getRegion());
    }

    @Test
    public void profilePresentAndRegionIsSet_ProvidesCorrectRegion() {
        final String expectedRegion = "us-east-8";
        final BasicProfile profile = new BasicProfile(PROFILE, ImmutableMapParameter
                .of(ProfileKeyConstants.REGION, expectedRegion));
        final AllProfiles profiles = new AllProfiles(ImmutableMapParameter.of(PROFILE, profile));
        stubLoadProfile(profiles);
        assertEquals(expectedRegion, regionProvider.getRegion());
    }

    private void stubLoadProfile(AllProfiles toReturn) {
        when(configLoader.loadProfiles(any(File.class))).thenReturn(toReturn);
    }

}
