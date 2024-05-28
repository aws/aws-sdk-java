/*
 * Copyright 2011-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import static org.hamcrest.Matchers.isEmptyString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

import com.amazonaws.AmazonClientException;
import com.amazonaws.auth.profile.internal.AllProfiles;
import com.amazonaws.auth.profile.internal.BasicProfile;
import com.amazonaws.auth.profile.internal.BasicProfileConfigLoader;
import java.io.File;
import org.junit.Test;


public class BasicProfileConfigLoaderTest {

    @Test
    public void basicProfileWithAccessKeySecretKey() {
        File file = ProfileResourceLoader.basicProfile().asFile();
        BasicProfile profile = loadProfiles(file).getProfile("default");
        assertEquals("defaultAccessKey", profile.getAwsAccessIdKey());
        assertEquals("defaultSecretAccessKey", profile.getAwsSecretAccessKey());
    }

    @Test(expected = IllegalArgumentException.class)
    public void profileNameWithNoBrackets() {
        File file = ProfileResourceLoader.profileNameWithNoBraces().asFile();
        loadProfiles(file);
    }

    @Test(expected = IllegalArgumentException.class)
    public void profileNameWithNoOpeningBraces() {
        File file = ProfileResourceLoader.profileNameWithNoOpeningBraces().asFile();
        loadProfiles(file);
    }

    @Test(expected = IllegalArgumentException.class)
    public void profileNameWithNoClosingBraces() {
        File file = ProfileResourceLoader.profileNameWithNoClosingBraces().asFile();
        loadProfiles(file);
    }

    @Test(expected = AmazonClientException.class)
    public void blankProfileName() {
        File file = ProfileResourceLoader.profileNameWithSpaces().asFile();
        loadProfiles(file);
    }

    @Test(expected = AmazonClientException.class)
    public void emptyProfileName() {
        File file = ProfileResourceLoader.profilesWithNoProfileName().asFile();
        loadProfiles(file);
    }

    @Test
    public void duplicateProfile() {
        File file = ProfileResourceLoader.profilesWithSameProfileName().asFile();
        BasicProfile profile = loadProfiles(file).getProfile("test");
        assertEquals("testProfile2", profile.getAwsAccessIdKey());
        assertEquals("testProfile2", profile.getAwsSecretAccessKey());
        assertEquals("testProfile2", profile.getAwsSessionToken());
    }

    @Test
    public void duplicatePropertyPicksLastValue() {
        File file = ProfileResourceLoader.profilesWithTwoAccessKeyUnderSameProfile().asFile();
        BasicProfile profile = loadProfiles(file).getProfile("test2");
        assertEquals("testProfile3", profile.getAwsAccessIdKey());
    }

    @Test
    public void profileWithNoPropertyValue() {
        File file = ProfileResourceLoader.profileWithEmptyAccessKey().asFile();
        BasicProfile profile = loadProfiles(file).getProfile("test");
        assertThat(profile.getAwsAccessIdKey(), isEmptyString());
    }

    @Test
    public void prefixProfilesCanBeLoaded() {
        File file = ProfileResourceLoader.profileWithProfilePrefix().asFile();
        BasicProfile profile = loadProfiles(file).getProfile("test");
        assertEquals("withPrefix", profile.getAwsAccessIdKey());
    }

    @Test
    public void prefixProfilesAreLowerPriorityThanNonPrefixProfiles() {
        File file = ProfileResourceLoader.duplicateProfileWithAndWithoutProfilePrefix().asFile();
        BasicProfile profile = loadProfiles(file).getProfile("test");
        assertEquals("withoutPrefix", profile.getAwsAccessIdKey());
    }

    @Test
    public void profilesWithSubPropertiesAreSupported() {
        File file = ProfileResourceLoader.profileWithSubProperties().asFile();
        BasicProfile profile = loadProfiles(file).getProfile("test");
        assertEquals("", profile.getProperties().get("s3"));
        assertEquals("https://s3-endpoint-override.aws", profile.getProperties().get("endpoint_url"));
    }

    @Test
    public void profilesWithSubPropertiesIgnoresDuplicates() {
        File file = ProfileResourceLoader.profileWithDuplicateSubProperties().asFile();
        BasicProfile profile = loadProfiles(file).getProfile("test");
        assertEquals("", profile.getProperties().get("s3"));
        assertEquals("https://elastic-beanstalk-endpoint-override.aws", profile.getProperties().get("endpoint_url"));
    }

    @Test
    public void profilesWithServiceSectionIsSupported() {
        File file = ProfileResourceLoader.profileWithServiceSection().asFile();
        AllProfiles allProfiles = loadProfiles(file);
        BasicProfile serviceSectionAsProfile = allProfiles.getProfile("my-services");
        BasicProfile serviceSectionRaw = allProfiles.getProfiles().get("services my-services");
        assertNull(serviceSectionAsProfile);
        assertNotNull(serviceSectionRaw);
        assertEquals("https://s3-endpoint-override.aws", serviceSectionRaw.getPropertyValue("endpoint_url"));
    }

    public AllProfiles loadProfiles(File file) {
        return BasicProfileConfigLoader.INSTANCE.loadProfiles(file);
    }

}
