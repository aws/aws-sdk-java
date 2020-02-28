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
package com.amazonaws.services.augmentedairuntime.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-a2i-runtime-2019-11-07/StartHumanLoop"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartHumanLoopResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the human loop.
     * </p>
     */
    private String humanLoopArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the human loop.
     * </p>
     * 
     * @param humanLoopArn
     *        The Amazon Resource Name (ARN) of the human loop.
     */

    public void setHumanLoopArn(String humanLoopArn) {
        this.humanLoopArn = humanLoopArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the human loop.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the human loop.
     */

    public String getHumanLoopArn() {
        return this.humanLoopArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the human loop.
     * </p>
     * 
     * @param humanLoopArn
     *        The Amazon Resource Name (ARN) of the human loop.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartHumanLoopResult withHumanLoopArn(String humanLoopArn) {
        setHumanLoopArn(humanLoopArn);
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
        if (getHumanLoopArn() != null)
            sb.append("HumanLoopArn: ").append(getHumanLoopArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartHumanLoopResult == false)
            return false;
        StartHumanLoopResult other = (StartHumanLoopResult) obj;
        if (other.getHumanLoopArn() == null ^ this.getHumanLoopArn() == null)
            return false;
        if (other.getHumanLoopArn() != null && other.getHumanLoopArn().equals(this.getHumanLoopArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHumanLoopArn() == null) ? 0 : getHumanLoopArn().hashCode());
        return hashCode;
    }

    @Override
    public StartHumanLoopResult clone() {
        try {
            return (StartHumanLoopResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
