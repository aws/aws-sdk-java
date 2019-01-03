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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DetectStackDrift" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetectStackDriftRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the stack for which you want to detect drift.
     * </p>
     */
    private String stackName;
    /**
     * <p>
     * The logical names of any resources you want to use as filters.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> logicalResourceIds;

    /**
     * <p>
     * The name of the stack for which you want to detect drift.
     * </p>
     * 
     * @param stackName
     *        The name of the stack for which you want to detect drift.
     */

    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    /**
     * <p>
     * The name of the stack for which you want to detect drift.
     * </p>
     * 
     * @return The name of the stack for which you want to detect drift.
     */

    public String getStackName() {
        return this.stackName;
    }

    /**
     * <p>
     * The name of the stack for which you want to detect drift.
     * </p>
     * 
     * @param stackName
     *        The name of the stack for which you want to detect drift.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectStackDriftRequest withStackName(String stackName) {
        setStackName(stackName);
        return this;
    }

    /**
     * <p>
     * The logical names of any resources you want to use as filters.
     * </p>
     * 
     * @return The logical names of any resources you want to use as filters.
     */

    public java.util.List<String> getLogicalResourceIds() {
        if (logicalResourceIds == null) {
            logicalResourceIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return logicalResourceIds;
    }

    /**
     * <p>
     * The logical names of any resources you want to use as filters.
     * </p>
     * 
     * @param logicalResourceIds
     *        The logical names of any resources you want to use as filters.
     */

    public void setLogicalResourceIds(java.util.Collection<String> logicalResourceIds) {
        if (logicalResourceIds == null) {
            this.logicalResourceIds = null;
            return;
        }

        this.logicalResourceIds = new com.amazonaws.internal.SdkInternalList<String>(logicalResourceIds);
    }

    /**
     * <p>
     * The logical names of any resources you want to use as filters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLogicalResourceIds(java.util.Collection)} or {@link #withLogicalResourceIds(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param logicalResourceIds
     *        The logical names of any resources you want to use as filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectStackDriftRequest withLogicalResourceIds(String... logicalResourceIds) {
        if (this.logicalResourceIds == null) {
            setLogicalResourceIds(new com.amazonaws.internal.SdkInternalList<String>(logicalResourceIds.length));
        }
        for (String ele : logicalResourceIds) {
            this.logicalResourceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The logical names of any resources you want to use as filters.
     * </p>
     * 
     * @param logicalResourceIds
     *        The logical names of any resources you want to use as filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectStackDriftRequest withLogicalResourceIds(java.util.Collection<String> logicalResourceIds) {
        setLogicalResourceIds(logicalResourceIds);
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
        if (getStackName() != null)
            sb.append("StackName: ").append(getStackName()).append(",");
        if (getLogicalResourceIds() != null)
            sb.append("LogicalResourceIds: ").append(getLogicalResourceIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectStackDriftRequest == false)
            return false;
        DetectStackDriftRequest other = (DetectStackDriftRequest) obj;
        if (other.getStackName() == null ^ this.getStackName() == null)
            return false;
        if (other.getStackName() != null && other.getStackName().equals(this.getStackName()) == false)
            return false;
        if (other.getLogicalResourceIds() == null ^ this.getLogicalResourceIds() == null)
            return false;
        if (other.getLogicalResourceIds() != null && other.getLogicalResourceIds().equals(this.getLogicalResourceIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackName() == null) ? 0 : getStackName().hashCode());
        hashCode = prime * hashCode + ((getLogicalResourceIds() == null) ? 0 : getLogicalResourceIds().hashCode());
        return hashCode;
    }

    @Override
    public DetectStackDriftRequest clone() {
        return (DetectStackDriftRequest) super.clone();
    }

}
