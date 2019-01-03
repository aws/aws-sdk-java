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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DetectStackDrift" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetectStackDriftResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the drift detection results of this operation.
     * </p>
     * <p>
     * AWS CloudFormation generates new results, with a new drift detection ID, each time this operation is run.
     * However, the number of drift results AWS CloudFormation retains for any given stack, and for how long, may vary.
     * </p>
     */
    private String stackDriftDetectionId;

    /**
     * <p>
     * The ID of the drift detection results of this operation.
     * </p>
     * <p>
     * AWS CloudFormation generates new results, with a new drift detection ID, each time this operation is run.
     * However, the number of drift results AWS CloudFormation retains for any given stack, and for how long, may vary.
     * </p>
     * 
     * @param stackDriftDetectionId
     *        The ID of the drift detection results of this operation. </p>
     *        <p>
     *        AWS CloudFormation generates new results, with a new drift detection ID, each time this operation is run.
     *        However, the number of drift results AWS CloudFormation retains for any given stack, and for how long, may
     *        vary.
     */

    public void setStackDriftDetectionId(String stackDriftDetectionId) {
        this.stackDriftDetectionId = stackDriftDetectionId;
    }

    /**
     * <p>
     * The ID of the drift detection results of this operation.
     * </p>
     * <p>
     * AWS CloudFormation generates new results, with a new drift detection ID, each time this operation is run.
     * However, the number of drift results AWS CloudFormation retains for any given stack, and for how long, may vary.
     * </p>
     * 
     * @return The ID of the drift detection results of this operation. </p>
     *         <p>
     *         AWS CloudFormation generates new results, with a new drift detection ID, each time this operation is run.
     *         However, the number of drift results AWS CloudFormation retains for any given stack, and for how long,
     *         may vary.
     */

    public String getStackDriftDetectionId() {
        return this.stackDriftDetectionId;
    }

    /**
     * <p>
     * The ID of the drift detection results of this operation.
     * </p>
     * <p>
     * AWS CloudFormation generates new results, with a new drift detection ID, each time this operation is run.
     * However, the number of drift results AWS CloudFormation retains for any given stack, and for how long, may vary.
     * </p>
     * 
     * @param stackDriftDetectionId
     *        The ID of the drift detection results of this operation. </p>
     *        <p>
     *        AWS CloudFormation generates new results, with a new drift detection ID, each time this operation is run.
     *        However, the number of drift results AWS CloudFormation retains for any given stack, and for how long, may
     *        vary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectStackDriftResult withStackDriftDetectionId(String stackDriftDetectionId) {
        setStackDriftDetectionId(stackDriftDetectionId);
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
        if (getStackDriftDetectionId() != null)
            sb.append("StackDriftDetectionId: ").append(getStackDriftDetectionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectStackDriftResult == false)
            return false;
        DetectStackDriftResult other = (DetectStackDriftResult) obj;
        if (other.getStackDriftDetectionId() == null ^ this.getStackDriftDetectionId() == null)
            return false;
        if (other.getStackDriftDetectionId() != null && other.getStackDriftDetectionId().equals(this.getStackDriftDetectionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackDriftDetectionId() == null) ? 0 : getStackDriftDetectionId().hashCode());
        return hashCode;
    }

    @Override
    public DetectStackDriftResult clone() {
        try {
            return (DetectStackDriftResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
