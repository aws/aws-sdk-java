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
package utils;

import com.amazonaws.profile.path.AwsProfileFileLocationProvider;
import java.io.File;
import java.net.URL;

/**
 * Used for testing config file properties.
 */
public class TestProfileFileLocationProvider implements AwsProfileFileLocationProvider {
    private String configFileName;
    private String resourceFile;
    private URL url;

    public TestProfileFileLocationProvider(String configFileName, String resourceFile) {
        this.configFileName = configFileName;
        this.resourceFile = resourceFile;
    }

    public TestProfileFileLocationProvider(URL url) {
        this.url = url;
    }

    @Override
    public File getLocation() {
        if (url != null) {
            return new File(url.getFile());
        }

        URL url = getClass().getResource(resourceFile + configFileName);
        return new File(url.getFile());
    }
}
