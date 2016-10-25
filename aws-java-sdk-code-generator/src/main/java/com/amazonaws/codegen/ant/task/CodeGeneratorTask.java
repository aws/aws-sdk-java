
/*
 * Copyright (c) 2016. Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.codegen.ant.task;

import com.amazonaws.codegen.internal.Jackson;
import com.amazonaws.codegen.internal.Utils;
import com.amazonaws.codegen.model.config.BasicCodeGenConfig;
import com.amazonaws.codegen.model.config.customization.CustomizationConfig;
import com.amazonaws.codegen.model.intermediate.ServiceExamples;
import com.amazonaws.codegen.model.service.ServiceModel;
import com.amazonaws.codegen.model.service.Waiters;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Ant task interface to generate the Java client code from a C2J model
 */
public class CodeGeneratorTask {

    private static final String P_MODEL_FILE = "modelFile";
    private static final String P_EXAMPLES_FILE = "examplesFile";
    private static final String P_WAITERS_FILE = "waiterFile";
    private static final String P_CODEGEN_CONFIG_FILE = "codeGenConfigFile";
    private static final String P_CUSTOMIZATION_CONFIG_FILE = "customizationConfigFile";
    private static final String P_OUTPUT_DIRECTORY = "outputDirectory";
    private static final String MODEL_DIR_NAME = "models";


    public static void main(String[] args) throws IOException {

        final String outputDirectory = Utils.getRequiredSystemProperty(P_OUTPUT_DIRECTORY,
                "Use -DoutputDirectory={path} to specify the output directory for the code generator.");

        final Waiters waiterModel = loadOptionalConfigurationModel(
                                            Waiters.class,
                                            getWaitersFileClasspathLocation());
        final Waiters waiters = waiterModel == null ? new Waiters() : waiterModel;


        final ServiceModel serviceModel = loadConfigurationModel(
                                            ServiceModel.class,
                                            getModelFileClasspathLocation());

        final String fileNamePrefix = serviceModel.getMetadata()
                .getEndpointPrefix()
                + "-"
                + serviceModel.getMetadata().getApiVersion();

        CodeGenerator codeGenerator = new CodeGenerator(
                serviceModel,
                getServiceExamples(),
                getCodeGenConfig(),
                getCustomizationConfig(),
                outputDirectory,
                fileNamePrefix,
                waiters);
        codeGenerator.execute();
        snapshotServiceModelFile(
                fileNamePrefix, outputDirectory);
    }

    private static String getWaitersFileClasspathLocation(){
        return Utils.getOptionalSystemProperty(P_WAITERS_FILE);
    }

    private static String getModelFileClasspathLocation(){
        return Utils.getRequiredSystemProperty(P_MODEL_FILE,
                                                "No C2j Model available for code generation. " +
                                                "Use -DmodelFile={path} to specify the C2j model file.");
    }

    static File getModelDirectory(String outputDirectory) {
        File dir = new File(outputDirectory, MODEL_DIR_NAME);
        Utils.createDirectory(dir);
        return dir;
    }

    /** Snapshots the original C2J model file into "c2j.json" */
    private static void snapshotServiceModelFile(final String fileNamePrefix, final String outputDirectory)
            throws IOException {

        try (InputStream is = Utils.getRequiredResourceAsStream(CodeGeneratorTask.class,
                                                                getModelFileClasspathLocation())) {
            byte[] buf = new byte[1024 * 2];
            final File modelDir = getModelDirectory(outputDirectory);
            try (FileOutputStream fos = new FileOutputStream(
                    new File(modelDir, fileNamePrefix + "-model.json")))
            {
                int len = is.read(buf);
                while (len > -1) {
                    fos.write(buf, 0, len);
                    len = is.read(buf);
                }
            }
        }
    }

    private static BasicCodeGenConfig getCodeGenConfig() {
        String location = Utils.getRequiredSystemProperty(P_CODEGEN_CONFIG_FILE,
                "No codegen.config file available for code generation. "
                        + "Use -DcodeGenConfigFile={path} to specify the codegen.config file.");

        return loadConfigurationModel(BasicCodeGenConfig.class, location);
    }

    private static CustomizationConfig getCustomizationConfig() {
        return getCustomizationConfig(System.getProperty(P_CUSTOMIZATION_CONFIG_FILE));
    }

    /**
     * Customization config is optional so load it if it's provided otherwise
     * just return the default configuration.
     */
    private static CustomizationConfig getCustomizationConfig(String location) {
        if (Utils.isNullOrEmpty(location)) {
            location = "/customization.config";
            if (CodeGeneratorTask.class.getResource(location) == null) {
                System.out.println("No customization.config file is specified");
                return new CustomizationConfig();
            }
        }

        return loadConfigurationModel(CustomizationConfig.class, location);
    }
    
    private static ServiceExamples getServiceExamples() {
        return getServiceExamples(Utils.getOptionalSystemProperty(P_EXAMPLES_FILE));
    }

    /**
     * Retrieves service examples from the C2j source, if present.  If not,
     * a no-op instance is returned which will effectively not be serialized
     * to disk by Jackson.
     * @param location location of the C2j service examples JSON file
     * @return service examples materialized from source JSON file or a
     *         no-op instance if file does not exist.
     */
    private static ServiceExamples getServiceExamples(final String location) {
        if (Utils.isNullOrEmpty(location)) {
            return new ServiceExamples();
        }
        return loadConfigurationModel(ServiceExamples.class, location);
    }

    /**
     * Deserialize the contents of a given configuration file.
     *
     * @param clzz
     *            Class to deserialize into
     * @param configurationFileLocation
     *            Location of config file to load
     * @return Marshalled configuration class
     */
    private static <T> T loadConfigurationModel(Class<T> clzz, String configurationFileLocation) {
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
     * Deserialize the contents of a given configuration file.
     * Returns null if file doesn't exist.
     * @param clzz                      Class to deserialize into
     * @param configurationFileLocation Location of config file to load
     * @return Marshalled configuration class if file exists;
     * Null otherwise
     */
    private static <T> T loadOptionalConfigurationModel(Class<T> clzz, String configurationFileLocation) {
        try {
            return loadConfigurationModel(clzz, configurationFileLocation);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * Return an InputStream of the specified resource, failing if it can't be found.
     *
     * @param location
     *            Location of resource
     */
    private static InputStream getRequiredResourceAsStream(String location) {
        return Utils.getRequiredResourceAsStream(CodeGeneratorTask.class, location);
    }

}
