/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/UpdateEndpoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateEndpointResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the new model.
     * </p>
     */
    private String desiredModelArn;

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the new model.
     * </p>
     * 
     * @param desiredModelArn
     *        The Amazon Resource Number (ARN) of the new model.
     */

    public void setDesiredModelArn(String desiredModelArn) {
        this.desiredModelArn = desiredModelArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the new model.
     * </p>
     * 
     * @return The Amazon Resource Number (ARN) of the new model.
     */

    public String getDesiredModelArn() {
        return this.desiredModelArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the new model.
     * </p>
     * 
     * @param desiredModelArn
     *        The Amazon Resource Number (ARN) of the new model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEndpointResult withDesiredModelArn(String desiredModelArn) {
        setDesiredModelArn(desiredModelArn);
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
        if (getDesiredModelArn() != null)
            sb.append("DesiredModelArn: ").append(getDesiredModelArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateEndpointResult == false)
            return false;
        UpdateEndpointResult other = (UpdateEndpointResult) obj;
        if (other.getDesiredModelArn() == null ^ this.getDesiredModelArn() == null)
            return false;
        if (other.getDesiredModelArn() != null && other.getDesiredModelArn().equals(this.getDesiredModelArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDesiredModelArn() == null) ? 0 : getDesiredModelArn().hashCode());
        return hashCode;
    }

    @Override
    public UpdateEndpointResult clone() {
        try {
            return (UpdateEndpointResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
