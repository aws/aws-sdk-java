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

import com.amazonaws.codegen.internal.Constants;

import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.ToolFactory;
import org.eclipse.jdt.core.formatter.CodeFormatter;
import org.eclipse.jdt.core.formatter.DefaultCodeFormatterConstants;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocument;
import org.eclipse.text.edits.TextEdit;

import java.util.HashMap;
import java.util.Map;

/**
 * Formats the generated java source code. Uses Eclipse JDT core plugin from the Eclipse SDK.
 */
@SuppressWarnings("unchecked")
public class JavaCodeFormatter implements ContentProcessor {

    private final CodeFormatter codeFormatter;

    private static final Map<String, Object> DEFAULT_FORMATTER_OPTIONS;

    static {
        DEFAULT_FORMATTER_OPTIONS = DefaultCodeFormatterConstants.getEclipseDefaultSettings();

        DEFAULT_FORMATTER_OPTIONS.put(JavaCore.COMPILER_COMPLIANCE, JavaCore.VERSION_1_8);
        DEFAULT_FORMATTER_OPTIONS.put(JavaCore.COMPILER_CODEGEN_TARGET_PLATFORM, JavaCore.VERSION_1_8);
        DEFAULT_FORMATTER_OPTIONS.put(JavaCore.COMPILER_SOURCE, JavaCore.VERSION_1_8);
        DEFAULT_FORMATTER_OPTIONS.put(DefaultCodeFormatterConstants.FORMATTER_TAB_CHAR,
                JavaCore.SPACE);
        DEFAULT_FORMATTER_OPTIONS.put(
                DefaultCodeFormatterConstants.FORMATTER_COMMENT_INDENT_PARAMETER_DESCRIPTION,
                DefaultCodeFormatterConstants.FALSE);
        DEFAULT_FORMATTER_OPTIONS.put(
                DefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_ENUM_CONSTANTS,
                DefaultCodeFormatterConstants.createAlignmentValue(true,
                        DefaultCodeFormatterConstants.WRAP_ONE_PER_LINE,
                        DefaultCodeFormatterConstants.INDENT_ON_COLUMN));
        DEFAULT_FORMATTER_OPTIONS.put(
                DefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_PARAMETERS_IN_CONSTRUCTOR_DECLARATION,
                DefaultCodeFormatterConstants.createAlignmentValue(false,
                        DefaultCodeFormatterConstants.WRAP_COMPACT,
                        DefaultCodeFormatterConstants.INDENT_DEFAULT));
        // Formats custom file headers if provided
        DEFAULT_FORMATTER_OPTIONS
                .put(DefaultCodeFormatterConstants.FORMATTER_COMMENT_FORMAT_HEADER,
                        DefaultCodeFormatterConstants.TRUE);
        DEFAULT_FORMATTER_OPTIONS.put(DefaultCodeFormatterConstants.FORMATTER_LINE_SPLIT, "160");
        DEFAULT_FORMATTER_OPTIONS.put(DefaultCodeFormatterConstants.FORMATTER_COMMENT_LINE_LENGTH, "120");
    }

    /**
     * Creates a JavaCodeFormatter using the default formatter options.
     */
    public JavaCodeFormatter() {
        this(new HashMap<>());
    }

    /**
     * Creates a JavaCodeFormatter using the default formatter options and
     * optionally applying user provided options on top.
     *
     * @param overrideOptions user provided options to apply on top of defaults
     */
    public JavaCodeFormatter(final Map<String, Object> overrideOptions) {
        Map formatterOptions = new HashMap<>(DEFAULT_FORMATTER_OPTIONS);
        if (overrideOptions != null) {
            formatterOptions.putAll(overrideOptions);
        }

        this.codeFormatter = ToolFactory.createCodeFormatter(formatterOptions,
                ToolFactory.M_FORMAT_EXISTING);
    }

    public String apply(String contents) {
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
