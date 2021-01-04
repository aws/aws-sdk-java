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
package com.amazonaws.services.greengrassv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains a list of criteria that define when and how to cancel a configuration deployment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/IoTJobAbortConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IoTJobAbortConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The list of criteria that define when and how to cancel the configuration deployment.
     * </p>
     */
    private java.util.List<IoTJobAbortCriteria> criteriaList;

    /**
     * <p>
     * The list of criteria that define when and how to cancel the configuration deployment.
     * </p>
     * 
     * @return The list of criteria that define when and how to cancel the configuration deployment.
     */

    public java.util.List<IoTJobAbortCriteria> getCriteriaList() {
        return criteriaList;
    }

    /**
     * <p>
     * The list of criteria that define when and how to cancel the configuration deployment.
     * </p>
     * 
     * @param criteriaList
     *        The list of criteria that define when and how to cancel the configuration deployment.
     */

    public void setCriteriaList(java.util.Collection<IoTJobAbortCriteria> criteriaList) {
        if (criteriaList == null) {
            this.criteriaList = null;
            return;
        }

        this.criteriaList = new java.util.ArrayList<IoTJobAbortCriteria>(criteriaList);
    }

    /**
     * <p>
     * The list of criteria that define when and how to cancel the configuration deployment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCriteriaList(java.util.Collection)} or {@link #withCriteriaList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param criteriaList
     *        The list of criteria that define when and how to cancel the configuration deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IoTJobAbortConfig withCriteriaList(IoTJobAbortCriteria... criteriaList) {
        if (this.criteriaList == null) {
            setCriteriaList(new java.util.ArrayList<IoTJobAbortCriteria>(criteriaList.length));
        }
        for (IoTJobAbortCriteria ele : criteriaList) {
            this.criteriaList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of criteria that define when and how to cancel the configuration deployment.
     * </p>
     * 
     * @param criteriaList
     *        The list of criteria that define when and how to cancel the configuration deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IoTJobAbortConfig withCriteriaList(java.util.Collection<IoTJobAbortCriteria> criteriaList) {
        setCriteriaList(criteriaList);
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
        if (getCriteriaList() != null)
            sb.append("CriteriaList: ").append(getCriteriaList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IoTJobAbortConfig == false)
            return false;
        IoTJobAbortConfig other = (IoTJobAbortConfig) obj;
        if (other.getCriteriaList() == null ^ this.getCriteriaList() == null)
            return false;
        if (other.getCriteriaList() != null && other.getCriteriaList().equals(this.getCriteriaList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCriteriaList() == null) ? 0 : getCriteriaList().hashCode());
        return hashCode;
    }

    @Override
    public IoTJobAbortConfig clone() {
        try {
            return (IoTJobAbortConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.greengrassv2.model.transform.IoTJobAbortConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
