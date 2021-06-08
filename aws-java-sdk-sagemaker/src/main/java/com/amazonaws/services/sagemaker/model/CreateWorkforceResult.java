/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateWorkforce" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateWorkforceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the workforce.
     * </p>
     */
    private String workforceArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the workforce.
     * </p>
     * 
     * @param workforceArn
     *        The Amazon Resource Name (ARN) of the workforce.
     */

    public void setWorkforceArn(String workforceArn) {
        this.workforceArn = workforceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the workforce.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the workforce.
     */

    public String getWorkforceArn() {
        return this.workforceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the workforce.
     * </p>
     * 
     * @param workforceArn
     *        The Amazon Resource Name (ARN) of the workforce.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkforceResult withWorkforceArn(String workforceArn) {
        setWorkforceArn(workforceArn);
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
        if (getWorkforceArn() != null)
            sb.append("WorkforceArn: ").append(getWorkforceArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateWorkforceResult == false)
            return false;
        CreateWorkforceResult other = (CreateWorkforceResult) obj;
        if (other.getWorkforceArn() == null ^ this.getWorkforceArn() == null)
            return false;
        if (other.getWorkforceArn() != null && other.getWorkforceArn().equals(this.getWorkforceArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkforceArn() == null) ? 0 : getWorkforceArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateWorkforceResult clone() {
        try {
            return (CreateWorkforceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
