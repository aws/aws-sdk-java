/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.auditmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/DeleteAssessmentFramework"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteAssessmentFrameworkRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the specified framework.
     * </p>
     */
    private String frameworkId;

    /**
     * <p>
     * The identifier for the specified framework.
     * </p>
     * 
     * @param frameworkId
     *        The identifier for the specified framework.
     */

    public void setFrameworkId(String frameworkId) {
        this.frameworkId = frameworkId;
    }

    /**
     * <p>
     * The identifier for the specified framework.
     * </p>
     * 
     * @return The identifier for the specified framework.
     */

    public String getFrameworkId() {
        return this.frameworkId;
    }

    /**
     * <p>
     * The identifier for the specified framework.
     * </p>
     * 
     * @param frameworkId
     *        The identifier for the specified framework.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAssessmentFrameworkRequest withFrameworkId(String frameworkId) {
        setFrameworkId(frameworkId);
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
        if (getFrameworkId() != null)
            sb.append("FrameworkId: ").append(getFrameworkId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteAssessmentFrameworkRequest == false)
            return false;
        DeleteAssessmentFrameworkRequest other = (DeleteAssessmentFrameworkRequest) obj;
        if (other.getFrameworkId() == null ^ this.getFrameworkId() == null)
            return false;
        if (other.getFrameworkId() != null && other.getFrameworkId().equals(this.getFrameworkId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFrameworkId() == null) ? 0 : getFrameworkId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteAssessmentFrameworkRequest clone() {
        return (DeleteAssessmentFrameworkRequest) super.clone();
    }

}
