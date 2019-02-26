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

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.stream.Collectors.toSet;

public class UnusedImportRemover implements ContentProcessor {
    private static Pattern IMPORT_PATTERN = Pattern.compile("import(?:\\s+)(?:static\\s+)?(.*)(?:\\s*);");

    @Override
    public String apply(String content) {
        return findUnusedImports(content).stream().map(this::removeImportFunction).reduce(Function.identity(), Function::andThen).apply(content);
    }

    private Function<String, String> removeImportFunction(String importToRemove) {
        return c -> c.replaceFirst(findSpecificImportRegex(importToRemove), "");
    }

    private Set<String> findUnusedImports(String content) {
        return findImports(content).stream().filter(isUnused(content)).collect(toSet());
    }

    private List<String> findImports(String content) {
        Matcher m = IMPORT_PATTERN.matcher(content);
        final List<String> imports = new ArrayList<>();
        while(m.find()) {
            imports.add(m.group(1));
        }
        return imports;
    }

    private String removeAllImports(String content) {
        return content.replaceAll(IMPORT_PATTERN.pattern(), "");
    }

    private Predicate<String> isUnused(String content) {
        String contentWithoutImports = removeAllImports(content);
        return importToCheck -> !importToCheck.contains("*") && (isNotReferenced(contentWithoutImports, importToCheck) || isDuplicate(content, importToCheck));
    }

    private boolean isNotReferenced(String contentWithoutImports, String importToCheck) {
        String symbol = importToCheck.substring(importToCheck.lastIndexOf(".") + 1);
        return !Pattern.compile(String.format("\\b%s\\b", symbol)).matcher(contentWithoutImports).find();
    }

    private boolean isDuplicate(String content, String importToCheck) {
        Matcher m = Pattern.compile(findSpecificImportRegex(importToCheck)).matcher(content);
        return m.find() && m.find();
    }

    private String findSpecificImportRegex(String specificImport) {
        return String.format("import(?:\\s+)(?:static )?(?:%s)(?:\\s*);", specificImport);
    }
}