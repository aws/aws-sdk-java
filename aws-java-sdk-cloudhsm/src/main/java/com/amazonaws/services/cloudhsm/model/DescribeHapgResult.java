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

/**
 * <p>
 * Contains the output of the <a>DescribeHapg</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/DescribeHapg" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeHapgResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the high-availability partition group.
     * </p>
     */
    private String hapgArn;
    /**
     * <p>
     * The serial number of the high-availability partition group.
     * </p>
     */
    private String hapgSerial;
    /** <p/> */
    private com.amazonaws.internal.SdkInternalList<String> hsmsLastActionFailed;
    /** <p/> */
    private com.amazonaws.internal.SdkInternalList<String> hsmsPendingDeletion;
    /** <p/> */
    private com.amazonaws.internal.SdkInternalList<String> hsmsPendingRegistration;
    /**
     * <p>
     * The label for the high-availability partition group.
     * </p>
     */
    private String label;
    /**
     * <p>
     * The date and time the high-availability partition group was last modified.
     * </p>
     */
    private String lastModifiedTimestamp;
    /**
     * <p>
     * The list of partition serial numbers that belong to the high-availability partition group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> partitionSerialList;
    /**
     * <p>
     * The state of the high-availability partition group.
     * </p>
     */
    private String state;

    /**
     * <p>
     * The ARN of the high-availability partition group.
     * </p>
     * 
     * @param hapgArn
     *        The ARN of the high-availability partition group.
     */

    public void setHapgArn(String hapgArn) {
        this.hapgArn = hapgArn;
    }

    /**
     * <p>
     * The ARN of the high-availability partition group.
     * </p>
     * 
     * @return The ARN of the high-availability partition group.
     */

    public String getHapgArn() {
        return this.hapgArn;
    }

    /**
     * <p>
     * The ARN of the high-availability partition group.
     * </p>
     * 
     * @param hapgArn
     *        The ARN of the high-availability partition group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHapgResult withHapgArn(String hapgArn) {
        setHapgArn(hapgArn);
        return this;
    }

    /**
     * <p>
     * The serial number of the high-availability partition group.
     * </p>
     * 
     * @param hapgSerial
     *        The serial number of the high-availability partition group.
     */

    public void setHapgSerial(String hapgSerial) {
        this.hapgSerial = hapgSerial;
    }

    /**
     * <p>
     * The serial number of the high-availability partition group.
     * </p>
     * 
     * @return The serial number of the high-availability partition group.
     */

    public String getHapgSerial() {
        return this.hapgSerial;
    }

    /**
     * <p>
     * The serial number of the high-availability partition group.
     * </p>
     * 
     * @param hapgSerial
     *        The serial number of the high-availability partition group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHapgResult withHapgSerial(String hapgSerial) {
        setHapgSerial(hapgSerial);
        return this;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public java.util.List<String> getHsmsLastActionFailed() {
        if (hsmsLastActionFailed == null) {
            hsmsLastActionFailed = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return hsmsLastActionFailed;
    }

    /**
     * <p/>
     * 
     * @param hsmsLastActionFailed
     */

    public void setHsmsLastActionFailed(java.util.Collection<String> hsmsLastActionFailed) {
        if (hsmsLastActionFailed == null) {
            this.hsmsLastActionFailed = null;
            return;
        }

        this.hsmsLastActionFailed = new com.amazonaws.internal.SdkInternalList<String>(hsmsLastActionFailed);
    }

    /**
     * <p/>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHsmsLastActionFailed(java.util.Collection)} or {@link #withHsmsLastActionFailed(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param hsmsLastActionFailed
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHapgResult withHsmsLastActionFailed(String... hsmsLastActionFailed) {
        if (this.hsmsLastActionFailed == null) {
            setHsmsLastActionFailed(new com.amazonaws.internal.SdkInternalList<String>(hsmsLastActionFailed.length));
        }
        for (String ele : hsmsLastActionFailed) {
            this.hsmsLastActionFailed.add(ele);
        }
        return this;
    }

    /**
     * <p/>
     * 
     * @param hsmsLastActionFailed
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHapgResult withHsmsLastActionFailed(java.util.Collection<String> hsmsLastActionFailed) {
        setHsmsLastActionFailed(hsmsLastActionFailed);
        return this;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public java.util.List<String> getHsmsPendingDeletion() {
        if (hsmsPendingDeletion == null) {
            hsmsPendingDeletion = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return hsmsPendingDeletion;
    }

    /**
     * <p/>
     * 
     * @param hsmsPendingDeletion
     */

    public void setHsmsPendingDeletion(java.util.Collection<String> hsmsPendingDeletion) {
        if (hsmsPendingDeletion == null) {
            this.hsmsPendingDeletion = null;
            return;
        }

        this.hsmsPendingDeletion = new com.amazonaws.internal.SdkInternalList<String>(hsmsPendingDeletion);
    }

    /**
     * <p/>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHsmsPendingDeletion(java.util.Collection)} or {@link #withHsmsPendingDeletion(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param hsmsPendingDeletion
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHapgResult withHsmsPendingDeletion(String... hsmsPendingDeletion) {
        if (this.hsmsPendingDeletion == null) {
            setHsmsPendingDeletion(new com.amazonaws.internal.SdkInternalList<String>(hsmsPendingDeletion.length));
        }
        for (String ele : hsmsPendingDeletion) {
            this.hsmsPendingDeletion.add(ele);
        }
        return this;
    }

    /**
     * <p/>
     * 
     * @param hsmsPendingDeletion
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHapgResult withHsmsPendingDeletion(java.util.Collection<String> hsmsPendingDeletion) {
        setHsmsPendingDeletion(hsmsPendingDeletion);
        return this;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public java.util.List<String> getHsmsPendingRegistration() {
        if (hsmsPendingRegistration == null) {
            hsmsPendingRegistration = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return hsmsPendingRegistration;
    }

    /**
     * <p/>
     * 
     * @param hsmsPendingRegistration
     */

    public void setHsmsPendingRegistration(java.util.Collection<String> hsmsPendingRegistration) {
        if (hsmsPendingRegistration == null) {
            this.hsmsPendingRegistration = null;
            return;
        }

        this.hsmsPendingRegistration = new com.amazonaws.internal.SdkInternalList<String>(hsmsPendingRegistration);
    }

    /**
     * <p/>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHsmsPendingRegistration(java.util.Collection)} or
     * {@link #withHsmsPendingRegistration(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param hsmsPendingRegistration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHapgResult withHsmsPendingRegistration(String... hsmsPendingRegistration) {
        if (this.hsmsPendingRegistration == null) {
            setHsmsPendingRegistration(new com.amazonaws.internal.SdkInternalList<String>(hsmsPendingRegistration.length));
        }
        for (String ele : hsmsPendingRegistration) {
            this.hsmsPendingRegistration.add(ele);
        }
        return this;
    }

    /**
     * <p/>
     * 
     * @param hsmsPendingRegistration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHapgResult withHsmsPendingRegistration(java.util.Collection<String> hsmsPendingRegistration) {
        setHsmsPendingRegistration(hsmsPendingRegistration);
        return this;
    }

    /**
     * <p>
     * The label for the high-availability partition group.
     * </p>
     * 
     * @param label
     *        The label for the high-availability partition group.
     */

    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * <p>
     * The label for the high-availability partition group.
     * </p>
     * 
     * @return The label for the high-availability partition group.
     */

    public String getLabel() {
        return this.label;
    }

    /**
     * <p>
     * The label for the high-availability partition group.
     * </p>
     * 
     * @param label
     *        The label for the high-availability partition group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHapgResult withLabel(String label) {
        setLabel(label);
        return this;
    }

    /**
     * <p>
     * The date and time the high-availability partition group was last modified.
     * </p>
     * 
     * @param lastModifiedTimestamp
     *        The date and time the high-availability partition group was last modified.
     */

    public void setLastModifiedTimestamp(String lastModifiedTimestamp) {
        this.lastModifiedTimestamp = lastModifiedTimestamp;
    }

    /**
     * <p>
     * The date and time the high-availability partition group was last modified.
     * </p>
     * 
     * @return The date and time the high-availability partition group was last modified.
     */

    public String getLastModifiedTimestamp() {
        return this.lastModifiedTimestamp;
    }

    /**
     * <p>
     * The date and time the high-availability partition group was last modified.
     * </p>
     * 
     * @param lastModifiedTimestamp
     *        The date and time the high-availability partition group was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHapgResult withLastModifiedTimestamp(String lastModifiedTimestamp) {
        setLastModifiedTimestamp(lastModifiedTimestamp);
        return this;
    }

    /**
     * <p>
     * The list of partition serial numbers that belong to the high-availability partition group.
     * </p>
     * 
     * @return The list of partition serial numbers that belong to the high-availability partition group.
     */

    public java.util.List<String> getPartitionSerialList() {
        if (partitionSerialList == null) {
            partitionSerialList = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return partitionSerialList;
    }

    /**
     * <p>
     * The list of partition serial numbers that belong to the high-availability partition group.
     * </p>
     * 
     * @param partitionSerialList
     *        The list of partition serial numbers that belong to the high-availability partition group.
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
     * The list of partition serial numbers that belong to the high-availability partition group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPartitionSerialList(java.util.Collection)} or {@link #withPartitionSerialList(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param partitionSerialList
     *        The list of partition serial numbers that belong to the high-availability partition group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHapgResult withPartitionSerialList(String... partitionSerialList) {
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
     * The list of partition serial numbers that belong to the high-availability partition group.
     * </p>
     * 
     * @param partitionSerialList
     *        The list of partition serial numbers that belong to the high-availability partition group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHapgResult withPartitionSerialList(java.util.Collection<String> partitionSerialList) {
        setPartitionSerialList(partitionSerialList);
        return this;
    }

    /**
     * <p>
     * The state of the high-availability partition group.
     * </p>
     * 
     * @param state
     *        The state of the high-availability partition group.
     * @see CloudHsmObjectState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the high-availability partition group.
     * </p>
     * 
     * @return The state of the high-availability partition group.
     * @see CloudHsmObjectState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the high-availability partition group.
     * </p>
     * 
     * @param state
     *        The state of the high-availability partition group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CloudHsmObjectState
     */

    public DescribeHapgResult withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the high-availability partition group.
     * </p>
     * 
     * @param state
     *        The state of the high-availability partition group.
     * @see CloudHsmObjectState
     */

    public void setState(CloudHsmObjectState state) {
        withState(state);
    }

    /**
     * <p>
     * The state of the high-availability partition group.
     * </p>
     * 
     * @param state
     *        The state of the high-availability partition group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CloudHsmObjectState
     */

    public DescribeHapgResult withState(CloudHsmObjectState state) {
        this.state = state.toString();
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
        if (getHapgSerial() != null)
            sb.append("HapgSerial: ").append(getHapgSerial()).append(",");
        if (getHsmsLastActionFailed() != null)
            sb.append("HsmsLastActionFailed: ").append(getHsmsLastActionFailed()).append(",");
        if (getHsmsPendingDeletion() != null)
            sb.append("HsmsPendingDeletion: ").append(getHsmsPendingDeletion()).append(",");
        if (getHsmsPendingRegistration() != null)
            sb.append("HsmsPendingRegistration: ").append(getHsmsPendingRegistration()).append(",");
        if (getLabel() != null)
            sb.append("Label: ").append(getLabel()).append(",");
        if (getLastModifiedTimestamp() != null)
            sb.append("LastModifiedTimestamp: ").append(getLastModifiedTimestamp()).append(",");
        if (getPartitionSerialList() != null)
            sb.append("PartitionSerialList: ").append(getPartitionSerialList()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeHapgResult == false)
            return false;
        DescribeHapgResult other = (DescribeHapgResult) obj;
        if (other.getHapgArn() == null ^ this.getHapgArn() == null)
            return false;
        if (other.getHapgArn() != null && other.getHapgArn().equals(this.getHapgArn()) == false)
            return false;
        if (other.getHapgSerial() == null ^ this.getHapgSerial() == null)
            return false;
        if (other.getHapgSerial() != null && other.getHapgSerial().equals(this.getHapgSerial()) == false)
            return false;
        if (other.getHsmsLastActionFailed() == null ^ this.getHsmsLastActionFailed() == null)
            return false;
        if (other.getHsmsLastActionFailed() != null && other.getHsmsLastActionFailed().equals(this.getHsmsLastActionFailed()) == false)
            return false;
        if (other.getHsmsPendingDeletion() == null ^ this.getHsmsPendingDeletion() == null)
            return false;
        if (other.getHsmsPendingDeletion() != null && other.getHsmsPendingDeletion().equals(this.getHsmsPendingDeletion()) == false)
            return false;
        if (other.getHsmsPendingRegistration() == null ^ this.getHsmsPendingRegistration() == null)
            return false;
        if (other.getHsmsPendingRegistration() != null && other.getHsmsPendingRegistration().equals(this.getHsmsPendingRegistration()) == false)
            return false;
        if (other.getLabel() == null ^ this.getLabel() == null)
            return false;
        if (other.getLabel() != null && other.getLabel().equals(this.getLabel()) == false)
            return false;
        if (other.getLastModifiedTimestamp() == null ^ this.getLastModifiedTimestamp() == null)
            return false;
        if (other.getLastModifiedTimestamp() != null && other.getLastModifiedTimestamp().equals(this.getLastModifiedTimestamp()) == false)
            return false;
        if (other.getPartitionSerialList() == null ^ this.getPartitionSerialList() == null)
            return false;
        if (other.getPartitionSerialList() != null && other.getPartitionSerialList().equals(this.getPartitionSerialList()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHapgArn() == null) ? 0 : getHapgArn().hashCode());
        hashCode = prime * hashCode + ((getHapgSerial() == null) ? 0 : getHapgSerial().hashCode());
        hashCode = prime * hashCode + ((getHsmsLastActionFailed() == null) ? 0 : getHsmsLastActionFailed().hashCode());
        hashCode = prime * hashCode + ((getHsmsPendingDeletion() == null) ? 0 : getHsmsPendingDeletion().hashCode());
        hashCode = prime * hashCode + ((getHsmsPendingRegistration() == null) ? 0 : getHsmsPendingRegistration().hashCode());
        hashCode = prime * hashCode + ((getLabel() == null) ? 0 : getLabel().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTimestamp() == null) ? 0 : getLastModifiedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getPartitionSerialList() == null) ? 0 : getPartitionSerialList().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public DescribeHapgResult clone() {
        try {
            return (DescribeHapgResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
