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

package com.amazonaws.codegen.emitters;

import freemarker.template.Template;

import java.io.IOException;
import java.io.Writer;

import static com.amazonaws.codegen.internal.Utils.closeQuietly;

/**
 * Runs the template on the data model. By default the freemarker template calls the flush at the
 * end of template processing.
 */
public class FreemarkerGeneratorTask implements GeneratorTask {

    private final Writer writer;

    private final Template template;

    private final Object dataModel;


    public FreemarkerGeneratorTask(String outputDirectory, String fileName,
                                   Template template, Object dataModel) throws IOException {
        if (dataModel == null) {
            throw new IllegalArgumentException("Data model cannot be null");
        }

        this.writer = new CodeWriter(outputDirectory, fileName);
        this.template = template;
        this.dataModel = dataModel;
    }

    public FreemarkerGeneratorTask(Writer writer,
                                   Template template, Object data) throws IOException {
        if (data == null) {
            throw new IllegalArgumentException("Data model cannot be null");
        }

        this.writer = writer;
        this.template = template;
        this.dataModel = data;
    }

    @Override
    public Void call() throws Exception {
        try {
            // By default , the template calls the flush method on the writer
            // after the template is processed.
            // http://freemarker.org/docs/api/freemarker/template/Template.html#process-java.lang.Object-java.io.Writer-
            template.process(dataModel, writer);
        } finally {
            closeQuietly(writer);
        }
        return null;
    }
}
