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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DetectStackResourceDrift"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetectStackResourceDriftResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about whether the resource's actual configuration has drifted from its expected template
     * configuration, including actual and expected property values and any differences detected.
     * </p>
     */
    private StackResourceDrift stackResourceDrift;

    /**
     * <p>
     * Information about whether the resource's actual configuration has drifted from its expected template
     * configuration, including actual and expected property values and any differences detected.
     * </p>
     * 
     * @param stackResourceDrift
     *        Information about whether the resource's actual configuration has drifted from its expected template
     *        configuration, including actual and expected property values and any differences detected.
     */

    public void setStackResourceDrift(StackResourceDrift stackResourceDrift) {
        this.stackResourceDrift = stackResourceDrift;
    }

    /**
     * <p>
     * Information about whether the resource's actual configuration has drifted from its expected template
     * configuration, including actual and expected property values and any differences detected.
     * </p>
     * 
     * @return Information about whether the resource's actual configuration has drifted from its expected template
     *         configuration, including actual and expected property values and any differences detected.
     */

    public StackResourceDrift getStackResourceDrift() {
        return this.stackResourceDrift;
    }

    /**
     * <p>
     * Information about whether the resource's actual configuration has drifted from its expected template
     * configuration, including actual and expected property values and any differences detected.
     * </p>
     * 
     * @param stackResourceDrift
     *        Information about whether the resource's actual configuration has drifted from its expected template
     *        configuration, including actual and expected property values and any differences detected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectStackResourceDriftResult withStackResourceDrift(StackResourceDrift stackResourceDrift) {
        setStackResourceDrift(stackResourceDrift);
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
        if (getStackResourceDrift() != null)
            sb.append("StackResourceDrift: ").append(getStackResourceDrift());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectStackResourceDriftResult == false)
            return false;
        DetectStackResourceDriftResult other = (DetectStackResourceDriftResult) obj;
        if (other.getStackResourceDrift() == null ^ this.getStackResourceDrift() == null)
            return false;
        if (other.getStackResourceDrift() != null && other.getStackResourceDrift().equals(this.getStackResourceDrift()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackResourceDrift() == null) ? 0 : getStackResourceDrift().hashCode());
        return hashCode;
    }

    @Override
    public DetectStackResourceDriftResult clone() {
        try {
            return (DetectStackResourceDriftResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
