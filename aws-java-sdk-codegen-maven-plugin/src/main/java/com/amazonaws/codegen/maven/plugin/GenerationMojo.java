/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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
package com.amazonaws.codegen.maven.plugin;

import java.io.File;
import java.io.IOException;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Component;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;

import com.amazonaws.codegen.ant.task.CodeGeneratorTask;

/**
 * The Maven mojo to generate Java client code using aws-java-sdk-code-generator.
 */
@Mojo(name = "generate")
public class GenerationMojo extends AbstractMojo {

    private static final String P_MODEL_FILE = "modelFile";
    private static final String P_WAITERS_FILE = "waiterFile";
    private static final String P_EXAMPLES_FILE = "examplesFile";
    private static final String P_CODEGEN_CONFIG_FILE = "codeGenConfigFile";
    private static final String P_CUSTOMIZATION_CONFIG_FILE = "customizationConfigFile";
    private static final String P_OUTPUT_DIRECTORY = "outputDirectory";

    @Parameter(property = P_MODEL_FILE, required = true, defaultValue = "code-gen/model.json")
    private String serviceModelLocation;

    @Parameter(property = P_CODEGEN_CONFIG_FILE, required = true, defaultValue = "code-gen/codegen.config")
    private String codeGenConfigLocation;

    @Parameter(property = P_WAITERS_FILE, required = false, defaultValue = "code-gen/waiters.json")
    private String waitersModelLocation;

    @Parameter(property = P_CUSTOMIZATION_CONFIG_FILE, required = false, defaultValue = "code-gen/customization.config")
    private String customizationConfigLocation;

    @Parameter(property = P_EXAMPLES_FILE, required = false, defaultValue = "code-gen/examples.json")
    private String serviceExamplesLocation;

    @Parameter(property = P_OUTPUT_DIRECTORY, required = false, defaultValue = "${project.build.directory}/generated-src")
    private String outputDirectory;

    @Parameter(property = "resourcesDirectory", defaultValue = "${basedir}/src/main/resources")
    private String resourcesDirectory;

    @Component
    private MavenProject project;

    public void execute() throws MojoExecutionException {

        try {
            ClassPathUtils.addFile(resourcesDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }

        setPropertyIfFileExists(P_MODEL_FILE, resourcesDirectory, serviceModelLocation);
        setPropertyIfFileExists(P_WAITERS_FILE, resourcesDirectory, waitersModelLocation);
        setPropertyIfFileExists(P_CODEGEN_CONFIG_FILE, resourcesDirectory, codeGenConfigLocation);
        setPropertyIfFileExists(P_CUSTOMIZATION_CONFIG_FILE, resourcesDirectory, customizationConfigLocation);
        setPropertyIfFileExists(P_EXAMPLES_FILE, resourcesDirectory, serviceExamplesLocation);

        System.setProperty(P_OUTPUT_DIRECTORY, outputDirectory);
        try {
            CodeGeneratorTask.main(new String[]{});
        } catch (IOException e) {
            e.printStackTrace();
        }

        project.addCompileSourceRoot(outputDirectory);
    }

    private void setPropertyIfFileExists(String propertyKey, String root, String location) {
        if (new File(root + File.separator + location).exists()) {
            System.setProperty(propertyKey, location);
        }
    }
}
