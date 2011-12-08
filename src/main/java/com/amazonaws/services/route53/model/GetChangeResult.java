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
package com.amazonaws.services.route53.model;

/**
 * <p>
 * A complex type that contains the <code>ChangeInfo</code> element.
 * </p>
 */
public class GetChangeResult {

    /**
     * A complex type that contains information about the specified change
     * batch, including the change batch ID, the status of the change, and
     * the date and time of the request.
     */
    private ChangeInfo changeInfo;

    /**
     * A complex type that contains information about the specified change
     * batch, including the change batch ID, the status of the change, and
     * the date and time of the request.
     *
     * @return A complex type that contains information about the specified change
     *         batch, including the change batch ID, the status of the change, and
     *         the date and time of the request.
     */
    public ChangeInfo getChangeInfo() {
        return changeInfo;
    }
    
    /**
     * A complex type that contains information about the specified change
     * batch, including the change batch ID, the status of the change, and
     * the date and time of the request.
     *
     * @param changeInfo A complex type that contains information about the specified change
     *         batch, including the change batch ID, the status of the change, and
     *         the date and time of the request.
     */
    public void setChangeInfo(ChangeInfo changeInfo) {
        this.changeInfo = changeInfo;
    }
    
    /**
     * A complex type that contains information about the specified change
     * batch, including the change batch ID, the status of the change, and
     * the date and time of the request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param changeInfo A complex type that contains information about the specified change
     *         batch, including the change batch ID, the status of the change, and
     *         the date and time of the request.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetChangeResult withChangeInfo(ChangeInfo changeInfo) {
        this.changeInfo = changeInfo;
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
        sb.append("ChangeInfo: " + changeInfo + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    