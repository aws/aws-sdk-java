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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DeleteActionTarget" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteActionTargetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the custom action target to delete.
     * </p>
     */
    private String actionTargetArn;

    /**
     * <p>
     * The ARN of the custom action target to delete.
     * </p>
     * 
     * @param actionTargetArn
     *        The ARN of the custom action target to delete.
     */

    public void setActionTargetArn(String actionTargetArn) {
        this.actionTargetArn = actionTargetArn;
    }

    /**
     * <p>
     * The ARN of the custom action target to delete.
     * </p>
     * 
     * @return The ARN of the custom action target to delete.
     */

    public String getActionTargetArn() {
        return this.actionTargetArn;
    }

    /**
     * <p>
     * The ARN of the custom action target to delete.
     * </p>
     * 
     * @param actionTargetArn
     *        The ARN of the custom action target to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteActionTargetRequest withActionTargetArn(String actionTargetArn) {
        setActionTargetArn(actionTargetArn);
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
        if (getActionTargetArn() != null)
            sb.append("ActionTargetArn: ").append(getActionTargetArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteActionTargetRequest == false)
            return false;
        DeleteActionTargetRequest other = (DeleteActionTargetRequest) obj;
        if (other.getActionTargetArn() == null ^ this.getActionTargetArn() == null)
            return false;
        if (other.getActionTargetArn() != null && other.getActionTargetArn().equals(this.getActionTargetArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionTargetArn() == null) ? 0 : getActionTargetArn().hashCode());
        return hashCode;
    }

    @Override
    public DeleteActionTargetRequest clone() {
        return (DeleteActionTargetRequest) super.clone();
    }

}
