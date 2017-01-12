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

import com.amazonaws.codegen.internal.Utils;

import java.io.PrintWriter;
import java.io.StringWriter;

import static com.amazonaws.codegen.internal.Constants.JAVA_FILE_NAME_SUFFIX;
import static com.amazonaws.codegen.internal.Utils.closeQuietly;

/**
 * Formats the generated code and write it to the underlying file. The caller should call the flush
 * method to write the contents to the file. This class is intended to be used only by the code
 * generation system and is not to be used for public use.
 */
public class CodeWriter extends StringWriter {

    private final ContentProcessor processor = ContentProcessor.chain(new UnusedImportRemover(), new JavaCodeFormatter());

    private final String dir;

    private final String file;

    /**
     * Constructor to use for .java files.
     * @param dir
     * 		    output directory where the file is to be created.
     * @param file
     * 		    name of the file without .java suffix.
     */
    public CodeWriter(String dir, String file) {
        this(dir, file, JAVA_FILE_NAME_SUFFIX);
    }

    /**
     * Constructor to use for custom file suffixes.
     *
     * @param dir
     * 		 	output directory where the file is to be created.
     * @param file
     * 			name of the file excluding suffix.
     * @param fileNameSuffix
     * 			suffix to be appended at the end of file name.
     */
    public CodeWriter(String dir, String file, String fileNameSuffix) {
        if (dir == null) {
            throw new IllegalArgumentException(
                    "Output Directory cannot be null.");
        }

        if (file == null) {
            throw new IllegalArgumentException("File name cannot be null.");
        }

        if (fileNameSuffix == null) {
            throw new IllegalArgumentException("File name suffix cannot be null.");
        }

        if (!file.endsWith(fileNameSuffix)) {
            file = file + fileNameSuffix;
        }

        this.dir = dir;
        this.file = file;
        Utils.createDirectory(dir);
    }

    /**
     * This method is expected to be called only once during the code generation process after the
     * template processing is done.
     */
    @Override
    public void flush() {

        PrintWriter out = null;
        try {
            try {
                out = new PrintWriter(Utils.createFile(dir, file), "UTF-8");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            String contents = getBuffer().toString();
            out.write(processor.apply(contents));
        } finally {
            closeQuietly(out);
        }
    }
}
