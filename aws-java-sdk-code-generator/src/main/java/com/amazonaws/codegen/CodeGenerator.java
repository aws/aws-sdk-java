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

package com.amazonaws.codegen;

import com.amazonaws.codegen.emitters.CodeEmitter;
import com.amazonaws.codegen.emitters.GeneratorTask;
import com.amazonaws.codegen.emitters.GeneratorTaskExecutor;
import com.amazonaws.codegen.emitters.GeneratorTaskParams;
import com.amazonaws.codegen.emitters.tasks.ApiGatewayGeneratorTasks;
import com.amazonaws.codegen.emitters.tasks.AwsGeneratorTasks;
import com.amazonaws.codegen.internal.Jackson;
import com.amazonaws.codegen.internal.Utils;
import com.amazonaws.codegen.model.intermediate.IntermediateModel;
import com.amazonaws.codegen.model.intermediate.Protocol;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class CodeGenerator {

    private static final String MODEL_DIR_NAME = "models";

    private final C2jModels models;
    private final String outputDirectory;
    private final String codeGenBinDirectory;
    /**
     * The prefix for the file name that contains the intermediate model.
     */
    private final String fileNamePrefix;

    public CodeGenerator(C2jModels models,
                         String outputDirectory,
                         String codeGenBinDirectory,
                         String fileNamePrefix) {
        this.models = models;
        this.outputDirectory = outputDirectory;
        this.codeGenBinDirectory = codeGenBinDirectory;
        this.fileNamePrefix = fileNamePrefix;
    }

    /**
     * load ServiceModel. load code gen configuration from individual client. load Waiters. generate intermediate model. generate
     * code.
     */
    public void execute() {
        try {
            final IntermediateModel intermediateModel =
                    new IntermediateModelBuilder(models, codeGenBinDirectory).build();

            // Dump the intermediate model to a file
            writeIntermediateModel(intermediateModel);

            emitCode(intermediateModel);

        } catch (Exception e) {
            throw new RuntimeException(
                    "Failed to generate code. Exception message : "
                    + e.getMessage(), e);

        }
    }

    private void writeIntermediateModel(IntermediateModel model)
            throws IOException {
        final File modelDir = getModelDirectory(outputDirectory);
        PrintWriter writer = null;
        try {
            File outDir = new File(outputDirectory);
            if (!outDir.exists()) {
                if (!outDir.mkdirs()) {
                    throw new RuntimeException("Failed to create "
                                               + outDir.getAbsolutePath());
                }
            }

            File outputFile = new File(modelDir, fileNamePrefix + "-intermediate.json");

            if (!outputFile.exists()) {
                if (!outputFile.createNewFile()) {
                    throw new RuntimeException("Error creating file "
                                               + outputFile.getAbsolutePath());
                }
            }

            writer = new PrintWriter(outputFile, "UTF-8");
            Jackson.write(model, writer);
        } finally {
            if (writer != null) {
                writer.flush();
                writer.close();
            }
        }
    }

    private void emitCode(IntermediateModel intermediateModel) throws Exception {
        final Iterable<GeneratorTask> generatorTasks = createGeneratorTasks(intermediateModel);
        try (CodeEmitter emitter = new CodeEmitter(generatorTasks, new GeneratorTaskExecutor())) {
            emitter.emit();
        }
    }

    private Iterable<GeneratorTask> createGeneratorTasks(IntermediateModel intermediateModel) {
        // For clients built internally, the output directory and source directory are the same.
        GeneratorTaskParams params = GeneratorTaskParams.create(intermediateModel, outputDirectory, outputDirectory);
        if (params.getModel().getMetadata().getProtocol() == Protocol.API_GATEWAY) {
            return new ApiGatewayGeneratorTasks(params);
        } else {
            return new AwsGeneratorTasks(params);
        }
    }

    public static File getModelDirectory(String outputDirectory) {
        File dir = new File(outputDirectory, MODEL_DIR_NAME);
        Utils.createDirectory(dir);
        return dir;
    }
}
