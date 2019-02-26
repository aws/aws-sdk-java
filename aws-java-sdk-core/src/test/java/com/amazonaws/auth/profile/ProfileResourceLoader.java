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
package com.amazonaws.auth.profile;

import java.io.File;
import java.net.URL;

/**
 * Loads profile related resource files and exposes static factory methods of the known resource
 * files for convenient access in tests.
 */
public class ProfileResourceLoader {

    private static final String PREFIX = "/resources/profileconfig/";

    private final String resourceName;

    public ProfileResourceLoader(String fileName) {
        this.resourceName = fileName;
    }

    /**
     * Load resource as a {@link File} object
     */
    public File asFile() {
        return new File(asUrl().getFile());
    }

    /**
     * Load resource as a {@link URL}
     */
    public URL asUrl() {
        return getClass().getResource(PREFIX + resourceName);
    }

    public static ProfileResourceLoader accessKeyNotSpecified() {
        return new ProfileResourceLoader("AccessKeyNotSpecified.tst");
    }

    public static ProfileResourceLoader basicProfile() {
        return new ProfileResourceLoader("BasicProfile.tst");
    }

    public static ProfileResourceLoader basicProfile2() {
        return new ProfileResourceLoader("BasicProfile2.tst");
    }

    public static ProfileResourceLoader profileNameWithNoBraces() {
        return new ProfileResourceLoader("ProfileNameWithNoBraces.tst");
    }

    public static ProfileResourceLoader profileNameWithNoClosingBraces() {
        return new ProfileResourceLoader("ProfileNameWithNoClosingBraces.tst");
    }

    public static ProfileResourceLoader profileNameWithNoOpeningBraces() {
        return new ProfileResourceLoader("ProfileNameWithNoOpeningBraces.tst");
    }

    public static ProfileResourceLoader profileNameWithSpaces() {
        return new ProfileResourceLoader("ProfileNameWithSpaces.tst");
    }

    public static ProfileResourceLoader profilesContainingOtherConfiguration() {
        return new ProfileResourceLoader("ProfilesContainingOtherConfigurations.tst");
    }

    public static ProfileResourceLoader profilesWithComments() {
        return new ProfileResourceLoader("ProfilesWithComments.tst");
    }

    public static ProfileResourceLoader profilesWithNoProfileName() {
        return new ProfileResourceLoader("ProfilesWithNoProfileName.tst");
    }

    public static ProfileResourceLoader profilesWithSameProfileName() {
        return new ProfileResourceLoader("ProfilesWithSameProfileName.tst");
    }

    public static ProfileResourceLoader profilesWithSecretAccessKeyNotSpecified() {
        return new ProfileResourceLoader("ProfilesWithSecretAccessKeyNotSpecified.tst");
    }

    public static ProfileResourceLoader profilesWithTwoAccessKeyUnderSameProfile() {
        return new ProfileResourceLoader("ProfilesWithTwoAccessKeyUnderSameProfile.tst");
    }

    public static ProfileResourceLoader profileWithEmptyAccessKey() {
        return new ProfileResourceLoader("ProfileWithEmptyAccessKey.tst");
    }

    public static ProfileResourceLoader profileWithEmptySecretKey() {
        return new ProfileResourceLoader("ProfileWithEmptySecretKey.tst");
    }

    public static ProfileResourceLoader profileWithRole() {
        return new ProfileResourceLoader("ProfileWithRole.tst");
    }

    public static ProfileResourceLoader profileWithRole2() {
        return new ProfileResourceLoader("ProfileWithRole2.tst");
    }

    public static ProfileResourceLoader profileWithSourceAfterRole() {
        return new ProfileResourceLoader("ProfileWithSourceAfterRole.tst");
    }

    public static ProfileResourceLoader roleProfileMissingSource() {
        return new ProfileResourceLoader("RoleProfileMissingSource.tst");
    }

    public static ProfileResourceLoader roleProfileWithEmptySourceName() {
        return new ProfileResourceLoader("RoleProfileWithEmptySourceName.tst");
    }

    public static ProfileResourceLoader roleProfileWithNoSourceName() {
        return new ProfileResourceLoader("RoleProfileWithNoSourceName.tst");
    }

    public static ProfileResourceLoader roleProfileWithRoleSource() {
        return new ProfileResourceLoader("RoleProfileWithRoleSource.tst");
    }

}
