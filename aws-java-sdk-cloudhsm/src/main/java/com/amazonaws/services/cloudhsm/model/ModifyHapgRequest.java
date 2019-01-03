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
package com.amazonaws.services.cloudhsm.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/ModifyHapg" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyHapgRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the high-availability partition group to modify.
     * </p>
     */
    private String hapgArn;
    /**
     * <p>
     * The new label for the high-availability partition group.
     * </p>
     */
    private String label;
    /**
     * <p>
     * The list of partition serial numbers to make members of the high-availability partition group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> partitionSerialList;

    /**
     * <p>
     * The ARN of the high-availability partition group to modify.
     * </p>
     * 
     * @param hapgArn
     *        The ARN of the high-availability partition group to modify.
     */

    public void setHapgArn(String hapgArn) {
        this.hapgArn = hapgArn;
    }

    /**
     * <p>
     * The ARN of the high-availability partition group to modify.
     * </p>
     * 
     * @return The ARN of the high-availability partition group to modify.
     */

    public String getHapgArn() {
        return this.hapgArn;
    }

    /**
     * <p>
     * The ARN of the high-availability partition group to modify.
     * </p>
     * 
     * @param hapgArn
     *        The ARN of the high-availability partition group to modify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyHapgRequest withHapgArn(String hapgArn) {
        setHapgArn(hapgArn);
        return this;
    }

    /**
     * <p>
     * The new label for the high-availability partition group.
     * </p>
     * 
     * @param label
     *        The new label for the high-availability partition group.
     */

    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * <p>
     * The new label for the high-availability partition group.
     * </p>
     * 
     * @return The new label for the high-availability partition group.
     */

    public String getLabel() {
        return this.label;
    }

    /**
     * <p>
     * The new label for the high-availability partition group.
     * </p>
     * 
     * @param label
     *        The new label for the high-availability partition group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyHapgRequest withLabel(String label) {
        setLabel(label);
        return this;
    }

    /**
     * <p>
     * The list of partition serial numbers to make members of the high-availability partition group.
     * </p>
     * 
     * @return The list of partition serial numbers to make members of the high-availability partition group.
     */

    public java.util.List<String> getPartitionSerialList() {
        if (partitionSerialList == null) {
            partitionSerialList = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return partitionSerialList;
    }

    /**
     * <p>
     * The list of partition serial numbers to make members of the high-availability partition group.
     * </p>
     * 
     * @param partitionSerialList
     *        The list of partition serial numbers to make members of the high-availability partition group.
     */

    public void setPartitionSerialList(java.util.Collection<String> partitionSerialList) {
        if (partitionSerialList == null) {
            this.partitionSerialList = null;
            return;
        }

        this.partitionSerialList = new com.amazonaws.internal.SdkInternalList<String>(partitionSerialList);
    }

    /**
     * <p>
     * The list of partition serial numbers to make members of the high-availability partition group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPartitionSerialList(java.util.Collection)} or {@link #withPartitionSerialList(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param partitionSerialList
     *        The list of partition serial numbers to make members of the high-availability partition group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyHapgRequest withPartitionSerialList(String... partitionSerialList) {
        if (this.partitionSerialList == null) {
            setPartitionSerialList(new com.amazonaws.internal.SdkInternalList<String>(partitionSerialList.length));
        }
        for (String ele : partitionSerialList) {
            this.partitionSerialList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of partition serial numbers to make members of the high-availability partition group.
     * </p>
     * 
     * @param partitionSerialList
     *        The list of partition serial numbers to make members of the high-availability partition group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyHapgRequest withPartitionSerialList(java.util.Collection<String> partitionSerialList) {
        setPartitionSerialList(partitionSerialList);
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
        if (getHapgArn() != null)
            sb.append("HapgArn: ").append(getHapgArn()).append(",");
        if (getLabel() != null)
            sb.append("Label: ").append(getLabel()).append(",");
        if (getPartitionSerialList() != null)
            sb.append("PartitionSerialList: ").append(getPartitionSerialList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyHapgRequest == false)
            return false;
        ModifyHapgRequest other = (ModifyHapgRequest) obj;
        if (other.getHapgArn() == null ^ this.getHapgArn() == null)
            return false;
        if (other.getHapgArn() != null && other.getHapgArn().equals(this.getHapgArn()) == false)
            return false;
        if (other.getLabel() == null ^ this.getLabel() == null)
            return false;
        if (other.getLabel() != null && other.getLabel().equals(this.getLabel()) == false)
            return false;
        if (other.getPartitionSerialList() == null ^ this.getPartitionSerialList() == null)
            return false;
        if (other.getPartitionSerialList() != null && other.getPartitionSerialList().equals(this.getPartitionSerialList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHapgArn() == null) ? 0 : getHapgArn().hashCode());
        hashCode = prime * hashCode + ((getLabel() == null) ? 0 : getLabel().hashCode());
        hashCode = prime * hashCode + ((getPartitionSerialList() == null) ? 0 : getPartitionSerialList().hashCode());
        return hashCode;
    }

    @Override
    public ModifyHapgRequest clone() {
        return (ModifyHapgRequest) super.clone();
    }

}
