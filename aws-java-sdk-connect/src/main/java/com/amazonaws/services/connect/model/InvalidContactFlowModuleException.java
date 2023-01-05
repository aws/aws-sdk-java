/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.connect.model;

import javax.annotation.Generated;

/**
 * <p>
 * The problems with the module. Please fix before trying again.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvalidContactFlowModuleException extends com.amazonaws.services.connect.model.AmazonConnectException {
    private static final long serialVersionUID = 1L;

    private java.util.List<ProblemDetail> problems;

    /**
     * Constructs a new InvalidContactFlowModuleException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InvalidContactFlowModuleException(String message) {
        super(message);
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Problems")
    public java.util.List<ProblemDetail> getProblems() {
        return problems;
    }

    /**
     * @param problems
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Problems")
    public void setProblems(java.util.Collection<ProblemDetail> problems) {
        if (problems == null) {
            this.problems = null;
            return;
        }

        this.problems = new java.util.ArrayList<ProblemDetail>(problems);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProblems(java.util.Collection)} or {@link #withProblems(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param problems
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidContactFlowModuleException withProblems(ProblemDetail... problems) {
        if (this.problems == null) {
            setProblems(new java.util.ArrayList<ProblemDetail>(problems.length));
        }
        for (ProblemDetail ele : problems) {
            this.problems.add(ele);
        }
        return this;
    }

    /**
     * @param problems
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidContactFlowModuleException withProblems(java.util.Collection<ProblemDetail> problems) {
        setProblems(problems);
        return this;
    }

}
