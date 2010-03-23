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
 * A request to retrieve the console output for the specified instance.
 * </p>
 * <p>
 * Instance console output is buffered and posted shortly after instance
 * boot, reboot, and termination. Amazon EC2 preserves the most recent 64
 * KB output which will be available for at least one hour after the most
 * recent post.
 * </p>
 */
public class GetConsoleOutputRequest extends AmazonWebServiceRequest {
        
    /**
     * The ID of the instance for which you want console output.
     */
    private String instanceId;

    /**
     * The ID of the instance for which you want console output.
     *
     * @return The ID of the instance for which you want console output.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * The ID of the instance for which you want console output.
     *
     * @param instanceId The ID of the instance for which you want console output.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * The ID of the instance for which you want console output.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId The ID of the instance for which you want console output.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetConsoleOutputRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    
    
}
    