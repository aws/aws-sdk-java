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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateActionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the action.
     * </p>
     */
    private String actionArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the action.
     * </p>
     * 
     * @param actionArn
     *        The Amazon Resource Name (ARN) of the action.
     */

    public void setActionArn(String actionArn) {
        this.actionArn = actionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the action.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the action.
     */

    public String getActionArn() {
        return this.actionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the action.
     * </p>
     * 
     * @param actionArn
     *        The Amazon Resource Name (ARN) of the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateActionResult withActionArn(String actionArn) {
        setActionArn(actionArn);
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
        if (getActionArn() != null)
            sb.append("ActionArn: ").append(getActionArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateActionResult == false)
            return false;
        UpdateActionResult other = (UpdateActionResult) obj;
        if (other.getActionArn() == null ^ this.getActionArn() == null)
            return false;
        if (other.getActionArn() != null && other.getActionArn().equals(this.getActionArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionArn() == null) ? 0 : getActionArn().hashCode());
        return hashCode;
    }

    @Override
    public UpdateActionResult clone() {
        try {
            return (UpdateActionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
