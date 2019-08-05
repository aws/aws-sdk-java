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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeMitigationActionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The friendly name that uniquely identifies the mitigation action.
     * </p>
     */
    private String actionName;

    /**
     * <p>
     * The friendly name that uniquely identifies the mitigation action.
     * </p>
     * 
     * @param actionName
     *        The friendly name that uniquely identifies the mitigation action.
     */

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    /**
     * <p>
     * The friendly name that uniquely identifies the mitigation action.
     * </p>
     * 
     * @return The friendly name that uniquely identifies the mitigation action.
     */

    public String getActionName() {
        return this.actionName;
    }

    /**
     * <p>
     * The friendly name that uniquely identifies the mitigation action.
     * </p>
     * 
     * @param actionName
     *        The friendly name that uniquely identifies the mitigation action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMitigationActionRequest withActionName(String actionName) {
        setActionName(actionName);
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
        if (getActionName() != null)
            sb.append("ActionName: ").append(getActionName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeMitigationActionRequest == false)
            return false;
        DescribeMitigationActionRequest other = (DescribeMitigationActionRequest) obj;
        if (other.getActionName() == null ^ this.getActionName() == null)
            return false;
        if (other.getActionName() != null && other.getActionName().equals(this.getActionName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionName() == null) ? 0 : getActionName().hashCode());
        return hashCode;
    }

    @Override
    public DescribeMitigationActionRequest clone() {
        return (DescribeMitigationActionRequest) super.clone();
    }

}
