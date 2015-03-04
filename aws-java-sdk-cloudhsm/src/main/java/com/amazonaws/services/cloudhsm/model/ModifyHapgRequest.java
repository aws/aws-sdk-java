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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.cloudhsm.AWSCloudHSM#modifyHapg(ModifyHapgRequest) ModifyHapg operation}.
 * <p>
 * Modifies an existing high-availability partition group.
 * </p>
 *
 * @see com.amazonaws.services.cloudhsm.AWSCloudHSM#modifyHapg(ModifyHapgRequest)
 */
public class ModifyHapgRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The ARN of the high-availability partition group to modify.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws(-iso)?:cloudhsm:[a-zA-Z0-9\-]*:[0-9]{12}:hapg-[0-9a-f]{8}<br/>
     */
    private String hapgArn;

    /**
     * The new label for the high-availability partition group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]{1,64}<br/>
     */
    private String label;

    /**
     * The list of partition serial numbers to make members of the
     * high-availability partition group.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> partitionSerialList;

    /**
     * The ARN of the high-availability partition group to modify.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws(-iso)?:cloudhsm:[a-zA-Z0-9\-]*:[0-9]{12}:hapg-[0-9a-f]{8}<br/>
     *
     * @return The ARN of the high-availability partition group to modify.
     */
    public String getHapgArn() {
        return hapgArn;
    }
    
    /**
     * The ARN of the high-availability partition group to modify.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws(-iso)?:cloudhsm:[a-zA-Z0-9\-]*:[0-9]{12}:hapg-[0-9a-f]{8}<br/>
     *
     * @param hapgArn The ARN of the high-availability partition group to modify.
     */
    public void setHapgArn(String hapgArn) {
        this.hapgArn = hapgArn;
    }
    
    /**
     * The ARN of the high-availability partition group to modify.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws(-iso)?:cloudhsm:[a-zA-Z0-9\-]*:[0-9]{12}:hapg-[0-9a-f]{8}<br/>
     *
     * @param hapgArn The ARN of the high-availability partition group to modify.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyHapgRequest withHapgArn(String hapgArn) {
        this.hapgArn = hapgArn;
        return this;
    }

    /**
     * The new label for the high-availability partition group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]{1,64}<br/>
     *
     * @return The new label for the high-availability partition group.
     */
    public String getLabel() {
        return label;
    }
    
    /**
     * The new label for the high-availability partition group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]{1,64}<br/>
     *
     * @param label The new label for the high-availability partition group.
     */
    public void setLabel(String label) {
        this.label = label;
    }
    
    /**
     * The new label for the high-availability partition group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]{1,64}<br/>
     *
     * @param label The new label for the high-availability partition group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyHapgRequest withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * The list of partition serial numbers to make members of the
     * high-availability partition group.
     *
     * @return The list of partition serial numbers to make members of the
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
     * The list of partition serial numbers to make members of the
     * high-availability partition group.
     *
     * @param partitionSerialList The list of partition serial numbers to make members of the
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
     * The list of partition serial numbers to make members of the
     * high-availability partition group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param partitionSerialList The list of partition serial numbers to make members of the
     *         high-availability partition group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyHapgRequest withPartitionSerialList(String... partitionSerialList) {
        if (getPartitionSerialList() == null) setPartitionSerialList(new java.util.ArrayList<String>(partitionSerialList.length));
        for (String value : partitionSerialList) {
            getPartitionSerialList().add(value);
        }
        return this;
    }
    
    /**
     * The list of partition serial numbers to make members of the
     * high-availability partition group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param partitionSerialList The list of partition serial numbers to make members of the
     *         high-availability partition group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyHapgRequest withPartitionSerialList(java.util.Collection<String> partitionSerialList) {
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
        if (getLabel() != null) sb.append("Label: " + getLabel() + ",");
        if (getPartitionSerialList() != null) sb.append("PartitionSerialList: " + getPartitionSerialList() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ModifyHapgRequest == false) return false;
        ModifyHapgRequest other = (ModifyHapgRequest)obj;
        
        if (other.getHapgArn() == null ^ this.getHapgArn() == null) return false;
        if (other.getHapgArn() != null && other.getHapgArn().equals(this.getHapgArn()) == false) return false; 
        if (other.getLabel() == null ^ this.getLabel() == null) return false;
        if (other.getLabel() != null && other.getLabel().equals(this.getLabel()) == false) return false; 
        if (other.getPartitionSerialList() == null ^ this.getPartitionSerialList() == null) return false;
        if (other.getPartitionSerialList() != null && other.getPartitionSerialList().equals(this.getPartitionSerialList()) == false) return false; 
        return true;
    }
    
    @Override
    public ModifyHapgRequest clone() {
        
            return (ModifyHapgRequest) super.clone();
    }

}
    