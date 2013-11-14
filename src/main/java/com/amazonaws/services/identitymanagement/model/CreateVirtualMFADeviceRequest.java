/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.identitymanagement.AmazonIdentityManagement#createVirtualMFADevice(CreateVirtualMFADeviceRequest) CreateVirtualMFADevice operation}.
 * <p>
 * Creates a new virtual MFA device for the AWS account. After creating the virtual MFA, use <a
 * href="http://docs.aws.amazon.com/IAM/latest/APIReference/API_EnableMFADevice.html"> EnableMFADevice </a> to attach the MFA device to an IAM user. For
 * more information about creating and working with virtual MFA devices, go to <a
 * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_VirtualMFA.html"> Using a Virtual MFA Device </a> in <i>Using AWS Identity and
 * Access Management</i> .
 * </p>
 * <p>
 * For information about limits on the number of MFA devices you can create, see <a
 * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?LimitationsOnEntities.html"> Limitations on Entities </a> in <i>Using AWS Identity
 * and Access Management</i> .
 * </p>
 * <p>
 * <b>IMPORTANT:</b>The seed information contained in the QR code and the Base32 string should be treated like any other secret access information, such
 * as your AWS access keys or your passwords. After you provision your virtual device, you should ensure that the information is destroyed following
 * secure procedures.
 * </p>
 *
 * @see com.amazonaws.services.identitymanagement.AmazonIdentityManagement#createVirtualMFADevice(CreateVirtualMFADeviceRequest)
 */
public class CreateVirtualMFADeviceRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The path for the virtual MFA device. For more information about paths,
     * see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     * target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     * Identity and Access Management</i>. <p>This parameter is optional. If
     * it is not included, it defaults to a slash (/).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     */
    private String path;

    /**
     * The name of the virtual MFA device. Use with path to uniquely identify
     * a virtual MFA device.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     */
    private String virtualMFADeviceName;

    /**
     * The path for the virtual MFA device. For more information about paths,
     * see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     * target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     * Identity and Access Management</i>. <p>This parameter is optional. If
     * it is not included, it defaults to a slash (/).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     *
     * @return The path for the virtual MFA device. For more information about paths,
     *         see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     *         target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     *         Identity and Access Management</i>. <p>This parameter is optional. If
     *         it is not included, it defaults to a slash (/).
     */
    public String getPath() {
        return path;
    }
    
    /**
     * The path for the virtual MFA device. For more information about paths,
     * see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     * target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     * Identity and Access Management</i>. <p>This parameter is optional. If
     * it is not included, it defaults to a slash (/).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     *
     * @param path The path for the virtual MFA device. For more information about paths,
     *         see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     *         target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     *         Identity and Access Management</i>. <p>This parameter is optional. If
     *         it is not included, it defaults to a slash (/).
     */
    public void setPath(String path) {
        this.path = path;
    }
    
    /**
     * The path for the virtual MFA device. For more information about paths,
     * see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     * target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     * Identity and Access Management</i>. <p>This parameter is optional. If
     * it is not included, it defaults to a slash (/).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     *
     * @param path The path for the virtual MFA device. For more information about paths,
     *         see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     *         target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     *         Identity and Access Management</i>. <p>This parameter is optional. If
     *         it is not included, it defaults to a slash (/).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateVirtualMFADeviceRequest withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * The name of the virtual MFA device. Use with path to uniquely identify
     * a virtual MFA device.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @return The name of the virtual MFA device. Use with path to uniquely identify
     *         a virtual MFA device.
     */
    public String getVirtualMFADeviceName() {
        return virtualMFADeviceName;
    }
    
    /**
     * The name of the virtual MFA device. Use with path to uniquely identify
     * a virtual MFA device.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param virtualMFADeviceName The name of the virtual MFA device. Use with path to uniquely identify
     *         a virtual MFA device.
     */
    public void setVirtualMFADeviceName(String virtualMFADeviceName) {
        this.virtualMFADeviceName = virtualMFADeviceName;
    }
    
    /**
     * The name of the virtual MFA device. Use with path to uniquely identify
     * a virtual MFA device.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param virtualMFADeviceName The name of the virtual MFA device. Use with path to uniquely identify
     *         a virtual MFA device.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateVirtualMFADeviceRequest withVirtualMFADeviceName(String virtualMFADeviceName) {
        this.virtualMFADeviceName = virtualMFADeviceName;
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
        if (getPath() != null) sb.append("Path: " + getPath() + ",");
        if (getVirtualMFADeviceName() != null) sb.append("VirtualMFADeviceName: " + getVirtualMFADeviceName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode()); 
        hashCode = prime * hashCode + ((getVirtualMFADeviceName() == null) ? 0 : getVirtualMFADeviceName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateVirtualMFADeviceRequest == false) return false;
        CreateVirtualMFADeviceRequest other = (CreateVirtualMFADeviceRequest)obj;
        
        if (other.getPath() == null ^ this.getPath() == null) return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false) return false; 
        if (other.getVirtualMFADeviceName() == null ^ this.getVirtualMFADeviceName() == null) return false;
        if (other.getVirtualMFADeviceName() != null && other.getVirtualMFADeviceName().equals(this.getVirtualMFADeviceName()) == false) return false; 
        return true;
    }
    
}
    