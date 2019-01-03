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
package com.amazonaws.codegen.emitters;

import com.amazonaws.codegen.internal.Freemarker;
import com.amazonaws.codegen.model.intermediate.IntermediateModel;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Parameters for generator tasks.
 */
public class GeneratorTaskParams {

    private final Freemarker freemarker;
    private final IntermediateModel model;
    private final GeneratorPathProvider pathProvider;
    private final Log log = LogFactory.getLog(GeneratorTaskParams.class);

    public static GeneratorTaskParams create(IntermediateModel model, String outputDirectory, String sourceDirectory) {
        final GeneratorPathProvider pathProvider = new GeneratorPathProvider(model, outputDirectory, sourceDirectory);
        return new GeneratorTaskParams(Freemarker.create(model), model, pathProvider);
    }

    private GeneratorTaskParams(Freemarker freemarker,
                               IntermediateModel model,
                               GeneratorPathProvider pathProvider) {
        this.freemarker = freemarker;
        this.model = model;
        this.pathProvider = pathProvider;
    }

    /**
     * @return Freemarker processing engine
     */
    public Freemarker getFreemarker() {
        return freemarker;
    }

    /**
     * @return Built intermediate model
     */
    public IntermediateModel getModel() {
        return model;
    }

    /**
     * @return Provider for common paths.
     */
    public GeneratorPathProvider getPathProvider() {
        return pathProvider;
    }

    /**
     * @return Logger
     */
    public Log getLog() {
        return log;
    }
}
