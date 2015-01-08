/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cloudhsm.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of the DescribeHapg action.
 * </p>
 */
public class DescribeHapgResult implements Serializable {

    /**
     * The ARN of the high-availability partition group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws(-iso)?:cloudhsm:[a-zA-Z0-9\-]*:[0-9]{12}:hapg-[0-9a-f]{8}<br/>
     */
    private String hapgArn;

    /**
     * The serial number of the high-availability partition group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\w :+=./\\-]*<br/>
     */
    private String hapgSerial;

    /**
     * Contains a list of ARNs that identify the HSMs.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> hsmsLastActionFailed;

    /**
     * Contains a list of ARNs that identify the HSMs.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> hsmsPendingDeletion;

    /**
     * Contains a list of ARNs that identify the HSMs.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> hsmsPendingRegistration;

    /**
     * The label for the high-availability partition group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]{1,64}<br/>
     */
    private String label;

    /**
     * The date and time the high-availability partition group was last
     * modified.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d*<br/>
     */
    private String lastModifiedTimestamp;

    /**
     * The list of partition serial numbers that belong to the
     * high-availability partition group.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> partitionSerialList;

    /**
     * The state of the high-availability partition group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>READY, UPDATING, DEGRADED
     */
    private String state;

    /**
     * The ARN of the high-availability partition group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws(-iso)?:cloudhsm:[a-zA-Z0-9\-]*:[0-9]{12}:hapg-[0-9a-f]{8}<br/>
     *
     * @return The ARN of the high-availability partition group.
     */
    public String getHapgArn() {
        return hapgArn;
    }
    
    /**
     * The ARN of the high-availability partition group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws(-iso)?:cloudhsm:[a-zA-Z0-9\-]*:[0-9]{12}:hapg-[0-9a-f]{8}<br/>
     *
     * @param hapgArn The ARN of the high-availability partition group.
     */
    public void setHapgArn(String hapgArn) {
        this.hapgArn = hapgArn;
    }
    
    /**
     * The ARN of the high-availability partition group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws(-iso)?:cloudhsm:[a-zA-Z0-9\-]*:[0-9]{12}:hapg-[0-9a-f]{8}<br/>
     *
     * @param hapgArn The ARN of the high-availability partition group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeHapgResult withHapgArn(String hapgArn) {
        this.hapgArn = hapgArn;
        return this;
    }

    /**
     * The serial number of the high-availability partition group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\w :+=./\\-]*<br/>
     *
     * @return The serial number of the high-availability partition group.
     */
    public String getHapgSerial() {
        return hapgSerial;
    }
    
    /**
     * The serial number of the high-availability partition group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\w :+=./\\-]*<br/>
     *
     * @param hapgSerial The serial number of the high-availability partition group.
     */
    public void setHapgSerial(String hapgSerial) {
        this.hapgSerial = hapgSerial;
    }
    
    /**
     * The serial number of the high-availability partition group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\w :+=./\\-]*<br/>
     *
     * @param hapgSerial The serial number of the high-availability partition group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeHapgResult withHapgSerial(String hapgSerial) {
        this.hapgSerial = hapgSerial;
        return this;
    }

    /**
     * Contains a list of ARNs that identify the HSMs.
     *
     * @return Contains a list of ARNs that identify the HSMs.
     */
    public java.util.List<String> getHsmsLastActionFailed() {
        if (hsmsLastActionFailed == null) {
              hsmsLastActionFailed = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              hsmsLastActionFailed.setAutoConstruct(true);
        }
        return hsmsLastActionFailed;
    }
    
    /**
     * Contains a list of ARNs that identify the HSMs.
     *
     * @param hsmsLastActionFailed Contains a list of ARNs that identify the HSMs.
     */
    public void setHsmsLastActionFailed(java.util.Collection<String> hsmsLastActionFailed) {
        if (hsmsLastActionFailed == null) {
            this.hsmsLastActionFailed = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> hsmsLastActionFailedCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(hsmsLastActionFailed.size());
        hsmsLastActionFailedCopy.addAll(hsmsLastActionFailed);
        this.hsmsLastActionFailed = hsmsLastActionFailedCopy;
    }
    
    /**
     * Contains a list of ARNs that identify the HSMs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hsmsLastActionFailed Contains a list of ARNs that identify the HSMs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeHapgResult withHsmsLastActionFailed(String... hsmsLastActionFailed) {
        if (getHsmsLastActionFailed() == null) setHsmsLastActionFailed(new java.util.ArrayList<String>(hsmsLastActionFailed.length));
        for (String value : hsmsLastActionFailed) {
            getHsmsLastActionFailed().add(value);
        }
        return this;
    }
    
    /**
     * Contains a list of ARNs that identify the HSMs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hsmsLastActionFailed Contains a list of ARNs that identify the HSMs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeHapgResult withHsmsLastActionFailed(java.util.Collection<String> hsmsLastActionFailed) {
        if (hsmsLastActionFailed == null) {
            this.hsmsLastActionFailed = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> hsmsLastActionFailedCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(hsmsLastActionFailed.size());
            hsmsLastActionFailedCopy.addAll(hsmsLastActionFailed);
            this.hsmsLastActionFailed = hsmsLastActionFailedCopy;
        }

        return this;
    }

    /**
     * Contains a list of ARNs that identify the HSMs.
     *
     * @return Contains a list of ARNs that identify the HSMs.
     */
    public java.util.List<String> getHsmsPendingDeletion() {
        if (hsmsPendingDeletion == null) {
              hsmsPendingDeletion = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              hsmsPendingDeletion.setAutoConstruct(true);
        }
        return hsmsPendingDeletion;
    }
    
    /**
     * Contains a list of ARNs that identify the HSMs.
     *
     * @param hsmsPendingDeletion Contains a list of ARNs that identify the HSMs.
     */
    public void setHsmsPendingDeletion(java.util.Collection<String> hsmsPendingDeletion) {
        if (hsmsPendingDeletion == null) {
            this.hsmsPendingDeletion = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> hsmsPendingDeletionCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(hsmsPendingDeletion.size());
        hsmsPendingDeletionCopy.addAll(hsmsPendingDeletion);
        this.hsmsPendingDeletion = hsmsPendingDeletionCopy;
    }
    
    /**
     * Contains a list of ARNs that identify the HSMs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hsmsPendingDeletion Contains a list of ARNs that identify the HSMs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeHapgResult withHsmsPendingDeletion(String... hsmsPendingDeletion) {
        if (getHsmsPendingDeletion() == null) setHsmsPendingDeletion(new java.util.ArrayList<String>(hsmsPendingDeletion.length));
        for (String value : hsmsPendingDeletion) {
            getHsmsPendingDeletion().add(value);
        }
        return this;
    }
    
    /**
     * Contains a list of ARNs that identify the HSMs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hsmsPendingDeletion Contains a list of ARNs that identify the HSMs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeHapgResult withHsmsPendingDeletion(java.util.Collection<String> hsmsPendingDeletion) {
        if (hsmsPendingDeletion == null) {
            this.hsmsPendingDeletion = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> hsmsPendingDeletionCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(hsmsPendingDeletion.size());
            hsmsPendingDeletionCopy.addAll(hsmsPendingDeletion);
            this.hsmsPendingDeletion = hsmsPendingDeletionCopy;
        }

        return this;
    }

    /**
     * Contains a list of ARNs that identify the HSMs.
     *
     * @return Contains a list of ARNs that identify the HSMs.
     */
    public java.util.List<String> getHsmsPendingRegistration() {
        if (hsmsPendingRegistration == null) {
              hsmsPendingRegistration = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              hsmsPendingRegistration.setAutoConstruct(true);
        }
        return hsmsPendingRegistration;
    }
    
    /**
     * Contains a list of ARNs that identify the HSMs.
     *
     * @param hsmsPendingRegistration Contains a list of ARNs that identify the HSMs.
     */
    public void setHsmsPendingRegistration(java.util.Collection<String> hsmsPendingRegistration) {
        if (hsmsPendingRegistration == null) {
            this.hsmsPendingRegistration = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> hsmsPendingRegistrationCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(hsmsPendingRegistration.size());
        hsmsPendingRegistrationCopy.addAll(hsmsPendingRegistration);
        this.hsmsPendingRegistration = hsmsPendingRegistrationCopy;
    }
    
    /**
     * Contains a list of ARNs that identify the HSMs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hsmsPendingRegistration Contains a list of ARNs that identify the HSMs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeHapgResult withHsmsPendingRegistration(String... hsmsPendingRegistration) {
        if (getHsmsPendingRegistration() == null) setHsmsPendingRegistration(new java.util.ArrayList<String>(hsmsPendingRegistration.length));
        for (String value : hsmsPendingRegistration) {
            getHsmsPendingRegistration().add(value);
        }
        return this;
    }
    
    /**
     * Contains a list of ARNs that identify the HSMs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hsmsPendingRegistration Contains a list of ARNs that identify the HSMs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeHapgResult withHsmsPendingRegistration(java.util.Collection<String> hsmsPendingRegistration) {
        if (hsmsPendingRegistration == null) {
            this.hsmsPendingRegistration = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> hsmsPendingRegistrationCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(hsmsPendingRegistration.size());
            hsmsPendingRegistrationCopy.addAll(hsmsPendingRegistration);
            this.hsmsPendingRegistration = hsmsPendingRegistrationCopy;
        }

        return this;
    }

    /**
     * The label for the high-availability partition group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]{1,64}<br/>
     *
     * @return The label for the high-availability partition group.
     */
    public String getLabel() {
        return label;
    }
    
    /**
     * The label for the high-availability partition group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]{1,64}<br/>
     *
     * @param label The label for the high-availability partition group.
     */
    public void setLabel(String label) {
        this.label = label;
    }
    
    /**
     * The label for the high-availability partition group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]{1,64}<br/>
     *
     * @param label The label for the high-availability partition group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeHapgResult withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * The date and time the high-availability partition group was last
     * modified.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d*<br/>
     *
     * @return The date and time the high-availability partition group was last
     *         modified.
     */
    public String getLastModifiedTimestamp() {
        return lastModifiedTimestamp;
    }
    
    /**
     * The date and time the high-availability partition group was last
     * modified.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d*<br/>
     *
     * @param lastModifiedTimestamp The date and time the high-availability partition group was last
     *         modified.
     */
    public void setLastModifiedTimestamp(String lastModifiedTimestamp) {
        this.lastModifiedTimestamp = lastModifiedTimestamp;
    }
    
    /**
     * The date and time the high-availability partition group was last
     * modified.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d*<br/>
     *
     * @param lastModifiedTimestamp The date and time the high-availability partition group was last
     *         modified.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeHapgResult withLastModifiedTimestamp(String lastModifiedTimestamp) {
        this.lastModifiedTimestamp = lastModifiedTimestamp;
        return this;
    }

    /**
     * The list of partition serial numbers that belong to the
     * high-availability partition group.
     *
     * @return The list of partition serial numbers that belong to the
     *         high-availability partition group.
     */
    public java.util.List<String> getPartitionSerialList() {
        if (partitionSerialList == null) {
              partitionSerialList = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              partitionSerialList.setAutoConstruct(true);
        }
        return partitionSerialList;
    }
    
    /**
     * The list of partition serial numbers that belong to the
     * high-availability partition group.
     *
     * @param partitionSerialList The list of partition serial numbers that belong to the
     *         high-availability partition group.
     */
    public void setPartitionSerialList(java.util.Collection<String> partitionSerialList) {
        if (partitionSerialList == null) {
            this.partitionSerialList = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> partitionSerialListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(partitionSerialList.size());
        partitionSerialListCopy.addAll(partitionSerialList);
        this.partitionSerialList = partitionSerialListCopy;
    }
    
    /**
     * The list of partition serial numbers that belong to the
     * high-availability partition group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param partitionSerialList The list of partition serial numbers that belong to the
     *         high-availability partition group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeHapgResult withPartitionSerialList(String... partitionSerialList) {
        if (getPartitionSerialList() == null) setPartitionSerialList(new java.util.ArrayList<String>(partitionSerialList.length));
        for (String value : partitionSerialList) {
            getPartitionSerialList().add(value);
        }
        return this;
    }
    
    /**
     * The list of partition serial numbers that belong to the
     * high-availability partition group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param partitionSerialList The list of partition serial numbers that belong to the
     *         high-availability partition group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeHapgResult withPartitionSerialList(java.util.Collection<String> partitionSerialList) {
        if (partitionSerialList == null) {
            this.partitionSerialList = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> partitionSerialListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(partitionSerialList.size());
            partitionSerialListCopy.addAll(partitionSerialList);
            this.partitionSerialList = partitionSerialListCopy;
        }

        return this;
    }

    /**
     * The state of the high-availability partition group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>READY, UPDATING, DEGRADED
     *
     * @return The state of the high-availability partition group.
     *
     * @see CloudHsmObjectState
     */
    public String getState() {
        return state;
    }
    
    /**
     * The state of the high-availability partition group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>READY, UPDATING, DEGRADED
     *
     * @param state The state of the high-availability partition group.
     *
     * @see CloudHsmObjectState
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * The state of the high-availability partition group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>READY, UPDATING, DEGRADED
     *
     * @param state The state of the high-availability partition group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see CloudHsmObjectState
     */
    public DescribeHapgResult withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * The state of the high-availability partition group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>READY, UPDATING, DEGRADED
     *
     * @param state The state of the high-availability partition group.
     *
     * @see CloudHsmObjectState
     */
    public void setState(CloudHsmObjectState state) {
        this.state = state.toString();
    }
    
    /**
     * The state of the high-availability partition group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>READY, UPDATING, DEGRADED
     *
     * @param state The state of the high-availability partition group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see CloudHsmObjectState
     */
    public DescribeHapgResult withState(CloudHsmObjectState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getHapgArn() != null) sb.append("HapgArn: " + getHapgArn() + ",");
        if (getHapgSerial() != null) sb.append("HapgSerial: " + getHapgSerial() + ",");
        if (getHsmsLastActionFailed() != null) sb.append("HsmsLastActionFailed: " + getHsmsLastActionFailed() + ",");
        if (getHsmsPendingDeletion() != null) sb.append("HsmsPendingDeletion: " + getHsmsPendingDeletion() + ",");
        if (getHsmsPendingRegistration() != null) sb.append("HsmsPendingRegistration: " + getHsmsPendingRegistration() + ",");
        if (getLabel() != null) sb.append("Label: " + getLabel() + ",");
        if (getLastModifiedTimestamp() != null) sb.append("LastModifiedTimestamp: " + getLastModifiedTimestamp() + ",");
        if (getPartitionSerialList() != null) sb.append("PartitionSerialList: " + getPartitionSerialList() + ",");
        if (getState() != null) sb.append("State: " + getState() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeHapgResult == false) return false;
        DescribeHapgResult other = (DescribeHapgResult)obj;
        
        if (other.getHapgArn() == null ^ this.getHapgArn() == null) return false;
        if (other.getHapgArn() != null && other.getHapgArn().equals(this.getHapgArn()) == false) return false; 
        if (other.getHapgSerial() == null ^ this.getHapgSerial() == null) return false;
        if (other.getHapgSerial() != null && other.getHapgSerial().equals(this.getHapgSerial()) == false) return false; 
        if (other.getHsmsLastActionFailed() == null ^ this.getHsmsLastActionFailed() == null) return false;
        if (other.getHsmsLastActionFailed() != null && other.getHsmsLastActionFailed().equals(this.getHsmsLastActionFailed()) == false) return false; 
        if (other.getHsmsPendingDeletion() == null ^ this.getHsmsPendingDeletion() == null) return false;
        if (other.getHsmsPendingDeletion() != null && other.getHsmsPendingDeletion().equals(this.getHsmsPendingDeletion()) == false) return false; 
        if (other.getHsmsPendingRegistration() == null ^ this.getHsmsPendingRegistration() == null) return false;
        if (other.getHsmsPendingRegistration() != null && other.getHsmsPendingRegistration().equals(this.getHsmsPendingRegistration()) == false) return false; 
        if (other.getLabel() == null ^ this.getLabel() == null) return false;
        if (other.getLabel() != null && other.getLabel().equals(this.getLabel()) == false) return false; 
        if (other.getLastModifiedTimestamp() == null ^ this.getLastModifiedTimestamp() == null) return false;
        if (other.getLastModifiedTimestamp() != null && other.getLastModifiedTimestamp().equals(this.getLastModifiedTimestamp()) == false) return false; 
        if (other.getPartitionSerialList() == null ^ this.getPartitionSerialList() == null) return false;
        if (other.getPartitionSerialList() != null && other.getPartitionSerialList().equals(this.getPartitionSerialList()) == false) return false; 
        if (other.getState() == null ^ this.getState() == null) return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false) return false; 
        return true;
    }
    
}
    