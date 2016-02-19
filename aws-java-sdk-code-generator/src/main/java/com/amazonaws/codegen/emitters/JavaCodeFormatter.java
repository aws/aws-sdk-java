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

import java.util.Map;

import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.ToolFactory;
import org.eclipse.jdt.core.formatter.CodeFormatter;
import org.eclipse.jdt.core.formatter.DefaultCodeFormatterConstants;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocument;
import org.eclipse.text.edits.TextEdit;

import com.amazonaws.codegen.internal.Constants;

/**
 * Formats the generated java source code. Uses Eclipse JDT core plugin from the Eclipse SDK.
 */
@SuppressWarnings("unchecked")
public class JavaCodeFormatter {

    private final CodeFormatter codeFormatter;

    @SuppressWarnings("rawtypes")
    private static final Map options;

    static {
        options = DefaultCodeFormatterConstants.getEclipseDefaultSettings();

        options.put(JavaCore.COMPILER_COMPLIANCE, JavaCore.VERSION_1_6);
        options.put(JavaCore.COMPILER_CODEGEN_TARGET_PLATFORM,
                JavaCore.VERSION_1_6);
        options.put(JavaCore.COMPILER_SOURCE, JavaCore.VERSION_1_6);
        options.put(DefaultCodeFormatterConstants.FORMATTER_TAB_CHAR,
                JavaCore.SPACE);
        options.put(
                DefaultCodeFormatterConstants.FORMATTER_COMMENT_INDENT_PARAMETER_DESCRIPTION,
                DefaultCodeFormatterConstants.FALSE);
        options.put(
                DefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_ENUM_CONSTANTS,
                DefaultCodeFormatterConstants.createAlignmentValue(true,
                        DefaultCodeFormatterConstants.WRAP_ONE_PER_LINE,
                        DefaultCodeFormatterConstants.INDENT_ON_COLUMN));
        options.put(
                DefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_PARAMETERS_IN_CONSTRUCTOR_DECLARATION,
                DefaultCodeFormatterConstants.createAlignmentValue(false,
                        DefaultCodeFormatterConstants.WRAP_COMPACT,
                        DefaultCodeFormatterConstants.INDENT_DEFAULT));
    }

    public JavaCodeFormatter() {

        this.codeFormatter = ToolFactory.createCodeFormatter(options,
                ToolFactory.M_FORMAT_EXISTING);
        if (codeFormatter == null) {
            throw new RuntimeException(
                    "Unable to create code formatter to format the generated code.");
        }
    }

    public String format(String contents) {
        final TextEdit edit = codeFormatter.format(
                CodeFormatter.K_COMPILATION_UNIT
                        | CodeFormatter.F_INCLUDE_COMMENTS, contents, 0,
                contents.length(), 0, Constants.LINE_SEPARATOR);

        if (edit == null) {
            // TODO log a fatal or warning here. Throwing an exception is causing the actual freemarker error to be lost
            return contents;
        }

        IDocument document = new Document(contents);

        try {
            edit.apply(document);
        } catch (Exception e) {
            throw new RuntimeException(
                    "Failed to format the generated source code.", e);
        }

        return document.get();
    }
}
