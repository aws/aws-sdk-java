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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.CreateInternetGatewayRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#createInternetGateway(CreateInternetGatewayRequest) CreateInternetGateway operation}.
 * <p>
 * Creates a new Internet gateway in your AWS account. After creating the Internet gateway, you then attach it to a VPC using
 * <code>AttachInternetGateway</code> . For more information about your VPC and Internet gateway, go to Amazon Virtual Private Cloud User Guide.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#createInternetGateway(CreateInternetGatewayRequest)
 */
public class CreateInternetGatewayRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<CreateInternetGatewayRequest> {

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<CreateInternetGatewayRequest> getDryRunRequest() {
        Request<CreateInternetGatewayRequest> request = new CreateInternetGatewayRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateInternetGatewayRequest == false) return false;
        CreateInternetGatewayRequest other = (CreateInternetGatewayRequest)obj;
        
        return true;
    }
    
}
    