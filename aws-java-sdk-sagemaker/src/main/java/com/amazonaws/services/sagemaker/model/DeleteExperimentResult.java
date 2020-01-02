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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteExperiment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteExperimentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the experiment that is being deleted.
     * </p>
     */
    private String experimentArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the experiment that is being deleted.
     * </p>
     * 
     * @param experimentArn
     *        The Amazon Resource Name (ARN) of the experiment that is being deleted.
     */

    public void setExperimentArn(String experimentArn) {
        this.experimentArn = experimentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the experiment that is being deleted.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the experiment that is being deleted.
     */

    public String getExperimentArn() {
        return this.experimentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the experiment that is being deleted.
     * </p>
     * 
     * @param experimentArn
     *        The Amazon Resource Name (ARN) of the experiment that is being deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteExperimentResult withExperimentArn(String experimentArn) {
        setExperimentArn(experimentArn);
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
        if (getExperimentArn() != null)
            sb.append("ExperimentArn: ").append(getExperimentArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteExperimentResult == false)
            return false;
        DeleteExperimentResult other = (DeleteExperimentResult) obj;
        if (other.getExperimentArn() == null ^ this.getExperimentArn() == null)
            return false;
        if (other.getExperimentArn() != null && other.getExperimentArn().equals(this.getExperimentArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExperimentArn() == null) ? 0 : getExperimentArn().hashCode());
        return hashCode;
    }

    @Override
    public DeleteExperimentResult clone() {
        try {
            return (DeleteExperimentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
