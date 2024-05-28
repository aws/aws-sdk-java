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
package com.amazonaws.services.migrationhubconfig.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhub-config-2019-06-30/DeleteHomeRegionControl"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteHomeRegionControlRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier that's generated for each home region control. It's always a string that begins with "hrc-"
     * followed by 12 lowercase letters and numbers.
     * </p>
     */
    private String controlId;

    /**
     * <p>
     * A unique identifier that's generated for each home region control. It's always a string that begins with "hrc-"
     * followed by 12 lowercase letters and numbers.
     * </p>
     * 
     * @param controlId
     *        A unique identifier that's generated for each home region control. It's always a string that begins with
     *        "hrc-" followed by 12 lowercase letters and numbers.
     */

    public void setControlId(String controlId) {
        this.controlId = controlId;
    }

    /**
     * <p>
     * A unique identifier that's generated for each home region control. It's always a string that begins with "hrc-"
     * followed by 12 lowercase letters and numbers.
     * </p>
     * 
     * @return A unique identifier that's generated for each home region control. It's always a string that begins with
     *         "hrc-" followed by 12 lowercase letters and numbers.
     */

    public String getControlId() {
        return this.controlId;
    }

    /**
     * <p>
     * A unique identifier that's generated for each home region control. It's always a string that begins with "hrc-"
     * followed by 12 lowercase letters and numbers.
     * </p>
     * 
     * @param controlId
     *        A unique identifier that's generated for each home region control. It's always a string that begins with
     *        "hrc-" followed by 12 lowercase letters and numbers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteHomeRegionControlRequest withControlId(String controlId) {
        setControlId(controlId);
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
        if (getControlId() != null)
            sb.append("ControlId: ").append(getControlId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteHomeRegionControlRequest == false)
            return false;
        DeleteHomeRegionControlRequest other = (DeleteHomeRegionControlRequest) obj;
        if (other.getControlId() == null ^ this.getControlId() == null)
            return false;
        if (other.getControlId() != null && other.getControlId().equals(this.getControlId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getControlId() == null) ? 0 : getControlId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteHomeRegionControlRequest clone() {
        return (DeleteHomeRegionControlRequest) super.clone();
    }

}
