/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codecommit.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the output of a test repository triggers operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/TestRepositoryTriggers" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestRepositoryTriggersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of triggers that were successfully tested. This list provides the names of the triggers that were
     * successfully tested, separated by commas.
     * </p>
     */
    private java.util.List<String> successfulExecutions;
    /**
     * <p>
     * The list of triggers that were not able to be tested. This list provides the names of the triggers that could not
     * be tested, separated by commas.
     * </p>
     */
    private java.util.List<RepositoryTriggerExecutionFailure> failedExecutions;

    /**
     * <p>
     * The list of triggers that were successfully tested. This list provides the names of the triggers that were
     * successfully tested, separated by commas.
     * </p>
     * 
     * @return The list of triggers that were successfully tested. This list provides the names of the triggers that
     *         were successfully tested, separated by commas.
     */

    public java.util.List<String> getSuccessfulExecutions() {
        return successfulExecutions;
    }

    /**
     * <p>
     * The list of triggers that were successfully tested. This list provides the names of the triggers that were
     * successfully tested, separated by commas.
     * </p>
     * 
     * @param successfulExecutions
     *        The list of triggers that were successfully tested. This list provides the names of the triggers that were
     *        successfully tested, separated by commas.
     */

    public void setSuccessfulExecutions(java.util.Collection<String> successfulExecutions) {
        if (successfulExecutions == null) {
            this.successfulExecutions = null;
            return;
        }

        this.successfulExecutions = new java.util.ArrayList<String>(successfulExecutions);
    }

    /**
     * <p>
     * The list of triggers that were successfully tested. This list provides the names of the triggers that were
     * successfully tested, separated by commas.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSuccessfulExecutions(java.util.Collection)} or {@link #withSuccessfulExecutions(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param successfulExecutions
     *        The list of triggers that were successfully tested. This list provides the names of the triggers that were
     *        successfully tested, separated by commas.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestRepositoryTriggersResult withSuccessfulExecutions(String... successfulExecutions) {
        if (this.successfulExecutions == null) {
            setSuccessfulExecutions(new java.util.ArrayList<String>(successfulExecutions.length));
        }
        for (String ele : successfulExecutions) {
            this.successfulExecutions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of triggers that were successfully tested. This list provides the names of the triggers that were
     * successfully tested, separated by commas.
     * </p>
     * 
     * @param successfulExecutions
     *        The list of triggers that were successfully tested. This list provides the names of the triggers that were
     *        successfully tested, separated by commas.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestRepositoryTriggersResult withSuccessfulExecutions(java.util.Collection<String> successfulExecutions) {
        setSuccessfulExecutions(successfulExecutions);
        return this;
    }

    /**
     * <p>
     * The list of triggers that were not able to be tested. This list provides the names of the triggers that could not
     * be tested, separated by commas.
     * </p>
     * 
     * @return The list of triggers that were not able to be tested. This list provides the names of the triggers that
     *         could not be tested, separated by commas.
     */

    public java.util.List<RepositoryTriggerExecutionFailure> getFailedExecutions() {
        return failedExecutions;
    }

    /**
     * <p>
     * The list of triggers that were not able to be tested. This list provides the names of the triggers that could not
     * be tested, separated by commas.
     * </p>
     * 
     * @param failedExecutions
     *        The list of triggers that were not able to be tested. This list provides the names of the triggers that
     *        could not be tested, separated by commas.
     */

    public void setFailedExecutions(java.util.Collection<RepositoryTriggerExecutionFailure> failedExecutions) {
        if (failedExecutions == null) {
            this.failedExecutions = null;
            return;
        }

        this.failedExecutions = new java.util.ArrayList<RepositoryTriggerExecutionFailure>(failedExecutions);
    }

    /**
     * <p>
     * The list of triggers that were not able to be tested. This list provides the names of the triggers that could not
     * be tested, separated by commas.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailedExecutions(java.util.Collection)} or {@link #withFailedExecutions(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param failedExecutions
     *        The list of triggers that were not able to be tested. This list provides the names of the triggers that
     *        could not be tested, separated by commas.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestRepositoryTriggersResult withFailedExecutions(RepositoryTriggerExecutionFailure... failedExecutions) {
        if (this.failedExecutions == null) {
            setFailedExecutions(new java.util.ArrayList<RepositoryTriggerExecutionFailure>(failedExecutions.length));
        }
        for (RepositoryTriggerExecutionFailure ele : failedExecutions) {
            this.failedExecutions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of triggers that were not able to be tested. This list provides the names of the triggers that could not
     * be tested, separated by commas.
     * </p>
     * 
     * @param failedExecutions
     *        The list of triggers that were not able to be tested. This list provides the names of the triggers that
     *        could not be tested, separated by commas.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestRepositoryTriggersResult withFailedExecutions(java.util.Collection<RepositoryTriggerExecutionFailure> failedExecutions) {
        setFailedExecutions(failedExecutions);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSuccessfulExecutions() != null)
            sb.append("SuccessfulExecutions: ").append(getSuccessfulExecutions()).append(",");
        if (getFailedExecutions() != null)
            sb.append("FailedExecutions: ").append(getFailedExecutions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestRepositoryTriggersResult == false)
            return false;
        TestRepositoryTriggersResult other = (TestRepositoryTriggersResult) obj;
        if (other.getSuccessfulExecutions() == null ^ this.getSuccessfulExecutions() == null)
            return false;
        if (other.getSuccessfulExecutions() != null && other.getSuccessfulExecutions().equals(this.getSuccessfulExecutions()) == false)
            return false;
        if (other.getFailedExecutions() == null ^ this.getFailedExecutions() == null)
            return false;
        if (other.getFailedExecutions() != null && other.getFailedExecutions().equals(this.getFailedExecutions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSuccessfulExecutions() == null) ? 0 : getSuccessfulExecutions().hashCode());
        hashCode = prime * hashCode + ((getFailedExecutions() == null) ? 0 : getFailedExecutions().hashCode());
        return hashCode;
    }

    @Override
    public TestRepositoryTriggersResult clone() {
        try {
            return (TestRepositoryTriggersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
