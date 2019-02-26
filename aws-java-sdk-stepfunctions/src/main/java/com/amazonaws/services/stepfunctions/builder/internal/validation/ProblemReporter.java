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
package com.amazonaws.services.stepfunctions.builder.internal.validation;

import java.util.ArrayList;
import java.util.List;

/**
 * Captures reported problems and creates appropriate exception with all problems identified via {@link #getException()}.
 */
final class ProblemReporter {

    private final List<Problem> problems = new ArrayList<Problem>();

    /**
     * @param problem Problem to report.
     */
    public void report(Problem problem) {
        problems.add(problem);
    }

    /**
     * @return True if at least one problem has been reported. False otherwise.
     */
    public boolean hasProblems() {
        return problems.size() > 0;
    }

    /**
     * Factory method to create an exception with all problems identified in the message.
     *
     * @return ValidationException.
     */
    public ValidationException getException() {
        StringBuilder exceptionMessage = new StringBuilder();
        for (Problem problem : problems) {
            exceptionMessage.append(String.format("\n%s: %s", problem.getContext().getPath(), problem.getMessage()));
        }
        return new ValidationException(exceptionMessage.toString());
    }
}
