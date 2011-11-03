/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.identitymanagement.AmazonIdentityManagement#deleteVirtualMFADevice(DeleteVirtualMFADeviceRequest) DeleteVirtualMFADevice operation}.
 * <p>
 * Deletes a virtual MFA device.
 * </p>
 * <p>
 * <b>NOTE:</b>You must deactivate a user's virtual MFA device before you
 * can delete it. For information about deactivating MFA devices, see
 * DeactivateMFADevice.
 * </p>
 *
 * @see com.amazonaws.services.identitymanagement.AmazonIdentityManagement#deleteVirtualMFADevice(DeleteVirtualMFADeviceRequest)
 */
public class DeleteVirtualMFADeviceRequest extends AmazonWebServiceRequest {

    /**
     * The serial number that uniquely identifies the MFA device. For virtual
     * MFA devices, the serial number is the same as the ARN.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>9 - 256<br/>
     * <b>Pattern: </b>[\w+=/:,.@-]*<br/>
     */
    private String serialNumber;

    /**
     * The serial number that uniquely identifies the MFA device. For virtual
     * MFA devices, the serial number is the same as the ARN.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>9 - 256<br/>
     * <b>Pattern: </b>[\w+=/:,.@-]*<br/>
     *
     * @return The serial number that uniquely identifies the MFA device. For virtual
     *         MFA devices, the serial number is the same as the ARN.
     */
    public String getSerialNumber() {
        return serialNumber;
    }
    
    /**
     * The serial number that uniquely identifies the MFA device. For virtual
     * MFA devices, the serial number is the same as the ARN.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>9 - 256<br/>
     * <b>Pattern: </b>[\w+=/:,.@-]*<br/>
     *
     * @param serialNumber The serial number that uniquely identifies the MFA device. For virtual
     *         MFA devices, the serial number is the same as the ARN.
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    
    /**
     * The serial number that uniquely identifies the MFA device. For virtual
     * MFA devices, the serial number is the same as the ARN.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>9 - 256<br/>
     * <b>Pattern: </b>[\w+=/:,.@-]*<br/>
     *
     * @param serialNumber The serial number that uniquely identifies the MFA device. For virtual
     *         MFA devices, the serial number is the same as the ARN.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DeleteVirtualMFADeviceRequest withSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
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
        sb.append("SerialNumber: " + serialNumber + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    