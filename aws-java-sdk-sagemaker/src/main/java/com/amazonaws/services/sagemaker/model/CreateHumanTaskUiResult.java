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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateHumanTaskUi" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateHumanTaskUiResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the human review workflow user interface you create.
     * </p>
     */
    private String humanTaskUiArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the human review workflow user interface you create.
     * </p>
     * 
     * @param humanTaskUiArn
     *        The Amazon Resource Name (ARN) of the human review workflow user interface you create.
     */

    public void setHumanTaskUiArn(String humanTaskUiArn) {
        this.humanTaskUiArn = humanTaskUiArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the human review workflow user interface you create.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the human review workflow user interface you create.
     */

    public String getHumanTaskUiArn() {
        return this.humanTaskUiArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the human review workflow user interface you create.
     * </p>
     * 
     * @param humanTaskUiArn
     *        The Amazon Resource Name (ARN) of the human review workflow user interface you create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHumanTaskUiResult withHumanTaskUiArn(String humanTaskUiArn) {
        setHumanTaskUiArn(humanTaskUiArn);
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
        if (getHumanTaskUiArn() != null)
            sb.append("HumanTaskUiArn: ").append(getHumanTaskUiArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateHumanTaskUiResult == false)
            return false;
        CreateHumanTaskUiResult other = (CreateHumanTaskUiResult) obj;
        if (other.getHumanTaskUiArn() == null ^ this.getHumanTaskUiArn() == null)
            return false;
        if (other.getHumanTaskUiArn() != null && other.getHumanTaskUiArn().equals(this.getHumanTaskUiArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHumanTaskUiArn() == null) ? 0 : getHumanTaskUiArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateHumanTaskUiResult clone() {
        try {
            return (CreateHumanTaskUiResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
