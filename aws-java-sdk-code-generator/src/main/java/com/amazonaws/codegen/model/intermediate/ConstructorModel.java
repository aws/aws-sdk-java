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

package com.amazonaws.codegen.model.intermediate;

import com.amazonaws.codegen.internal.Constants;
import com.amazonaws.codegen.internal.DocumentationUtils;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ConstructorModel extends DocumentationModel {

    private final String modelClassName;
    private final List<ArgumentModel> arguments = new LinkedList<ArgumentModel>();

    public ConstructorModel(String modelClassName) {
        this.modelClassName = modelClassName;
    }

    public List<ArgumentModel> getArguments() {
        return arguments;
    }

    public void addArgument(ArgumentModel argument) {
        this.arguments.add(argument);
    }

    public String getArgumentsDeclaration() {
        StringBuilder builder = new StringBuilder();

        Iterator<ArgumentModel> iter = arguments.iterator();
        while (iter.hasNext()) {
            ArgumentModel arg = iter.next();

            builder.append(arg.getType())
                    .append(" ")
                    .append(arg.getName());

            if (iter.hasNext()) {
                builder.append(", ");
            }
        }

        return builder.toString();
    }

    @Override
    public void setDocumentation(String documentation) {
        throw new UnsupportedOperationException(
                "Documentation for ConstructorModel is not allowed to be manually set.");
    }

    @Override
    public String getDocumentation() {
        StringBuilder docBuilder = new StringBuilder("/**");
        docBuilder.append(documentation != null ? documentation
                : String.format(DocumentationUtils.CONSTRUCTOR_DOC, modelClassName));

        for (ArgumentModel arg : arguments) {
            docBuilder.append(Constants.LINE_SEPARATOR);
            docBuilder.append("@param " + arg.getName() + " "
                    + DocumentationUtils.stripHTMLTags(arg.getDocumentation()));
        }

        docBuilder.append("*/");
        return docBuilder.toString();
    }
}
