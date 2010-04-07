/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A request to retrieve the encrypted administrator password for the
 * instances running Windows.
 * </p>
 * <p>
 * The Windows password is only generated the first time an AMI is
 * launched. It is not generated for rebundled AMIs or after the password
 * is changed on an instance. The password is encrypted using the key
 * pair that you provided.
 * </p>
 */
public class GetPasswordDataRequest extends AmazonWebServiceRequest {

    /**
     * The ID of the instance for which you want the Windows administrator
     * password.
     */
    private String instanceId;

    /**
     * The ID of the instance for which you want the Windows administrator
     * password.
     *
     * @return The ID of the instance for which you want the Windows administrator
     *         password.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * The ID of the instance for which you want the Windows administrator
     * password.
     *
     * @param instanceId The ID of the instance for which you want the Windows administrator
     *         password.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * The ID of the instance for which you want the Windows administrator
     * password.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId The ID of the instance for which you want the Windows administrator
     *         password.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetPasswordDataRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    
    
}
    