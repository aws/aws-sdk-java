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
package com.amazonaws.services.route53.model;

import java.io.Serializable;


/**
 * <p>
 * A complex type containing the response for the request.
 * </p>
 */
public class ChangeResourceRecordSetsResult implements Serializable {

    /**
     * A complex type that contains information about changes made to your
     * hosted zone. <p>This element contains an ID that you use when
     * performing a <a>GetChange</a> action to get detailed information about
     * the change.
     */
    private ChangeInfo changeInfo;

    /**
     * A complex type that contains information about changes made to your
     * hosted zone. <p>This element contains an ID that you use when
     * performing a <a>GetChange</a> action to get detailed information about
     * the change.
     *
     * @return A complex type that contains information about changes made to your
     *         hosted zone. <p>This element contains an ID that you use when
     *         performing a <a>GetChange</a> action to get detailed information about
     *         the change.
     */
    public ChangeInfo getChangeInfo() {
        return changeInfo;
    }
    
    /**
     * A complex type that contains information about changes made to your
     * hosted zone. <p>This element contains an ID that you use when
     * performing a <a>GetChange</a> action to get detailed information about
     * the change.
     *
     * @param changeInfo A complex type that contains information about changes made to your
     *         hosted zone. <p>This element contains an ID that you use when
     *         performing a <a>GetChange</a> action to get detailed information about
     *         the change.
     */
    public void setChangeInfo(ChangeInfo changeInfo) {
        this.changeInfo = changeInfo;
    }
    
    /**
     * A complex type that contains information about changes made to your
     * hosted zone. <p>This element contains an ID that you use when
     * performing a <a>GetChange</a> action to get detailed information about
     * the change.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param changeInfo A complex type that contains information about changes made to your
     *         hosted zone. <p>This element contains an ID that you use when
     *         performing a <a>GetChange</a> action to get detailed information about
     *         the change.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ChangeResourceRecordSetsResult withChangeInfo(ChangeInfo changeInfo) {
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
        if (getChangeInfo() != null) sb.append("ChangeInfo: " + getChangeInfo() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getChangeInfo() == null) ? 0 : getChangeInfo().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ChangeResourceRecordSetsResult == false) return false;
        ChangeResourceRecordSetsResult other = (ChangeResourceRecordSetsResult)obj;
        
        if (other.getChangeInfo() == null ^ this.getChangeInfo() == null) return false;
        if (other.getChangeInfo() != null && other.getChangeInfo().equals(this.getChangeInfo()) == false) return false; 
        return true;
    }
    
}
    