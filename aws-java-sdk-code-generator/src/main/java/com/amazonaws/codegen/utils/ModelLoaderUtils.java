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
package com.amazonaws.codegen.utils;

import com.amazonaws.codegen.internal.Jackson;
import com.amazonaws.codegen.internal.Utils;
import com.amazonaws.codegen.model.service.ServiceModel;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;

public class ModelLoaderUtils {

    public static ServiceModel loadModel(String modelLocation) {
        return loadConfigurationModel(ServiceModel.class, modelLocation);
    }

    /**
     * Deserialize the contents of a given configuration file.
     *
     * @param clzz                      Class to deserialize into
     * @param configurationFileLocation Location of config file to load
     * @return Marshalled configuration class
     */
    public static <T> T loadConfigurationModel(Class<T> clzz, String configurationFileLocation) {
        System.out.println("Loading config file " + configurationFileLocation);
        InputStream fileContents = null;
        try {
            fileContents = getRequiredResourceAsStream(configurationFileLocation);
            return Jackson.load(clzz, fileContents);
        } catch (IOException e) {
            System.err.println("Failed to read the configuration file " + configurationFileLocation);
            throw new RuntimeException(e);
        } finally {
            if (fileContents != null) {
                Utils.closeQuietly(fileContents);
            }
        }
    }

    /**
     * Return an InputStream of the specified resource, failing if it can't be found.
     *
     * @param location Location of resource
     */
    public static InputStream getRequiredResourceAsStream(String location) {
        return Utils.getRequiredResourceAsStream(ModelLoaderUtils.class, location);
    }

    public static <T> T loadModel(Class<T> clzz, File file) {
        try {
            return Jackson.load(clzz, file);
        } catch (IOException e) {
            System.err.println("Failed to read the configuration file " + file.getAbsolutePath());
            throw new RuntimeException(e);
        }
    }

    public static <T> Optional<T> loadOptionalModel(Class<T> clzz, File file) {
        if (!file.exists()) {
            return Optional.empty();
        }
        return Optional.of(loadModel(clzz, file));
    }
}
