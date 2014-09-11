/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.logs.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.logs.AWSLogs#putRetentionPolicy(PutRetentionPolicyRequest) PutRetentionPolicy operation}.
 * <p>
 * Sets the retention of the specified log group. A retention policy
 * allows you to configure the number of days you want to retain log
 * events in the specified log group.
 * </p>
 *
 * @see com.amazonaws.services.logs.AWSLogs#putRetentionPolicy(PutRetentionPolicyRequest)
 */
public class PutRetentionPolicyRequest extends AmazonWebServiceRequest implements Serializable {

    private String logGroupName;

    /**
     * Specifies the number of days you want to retain log events in the
     * specified log group. Possible values are: 1, 3, 5, 7, 14, 30, 60, 90,
     * 120, 150, 180, 365, 400, 547, 730.
     */
    private Integer retentionInDays;

    /**
     * Default constructor for a new PutRetentionPolicyRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public PutRetentionPolicyRequest() {}
    
    /**
     * Constructs a new PutRetentionPolicyRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param logGroupName
     * @param retentionInDays Specifies the number of days you want to retain
     * log events in the specified log group. Possible values are: 1, 3, 5,
     * 7, 14, 30, 60, 90, 120, 150, 180, 365, 400, 547, 730.
     */
    public PutRetentionPolicyRequest(String logGroupName, Integer retentionInDays) {
        setLogGroupName(logGroupName);
        setRetentionInDays(retentionInDays);
    }

    /**
     * Returns the value of the LogGroupName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     *
     * @return The value of the LogGroupName property for this object.
     */
    public String getLogGroupName() {
        return logGroupName;
    }
    
    /**
     * Sets the value of the LogGroupName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     *
     * @param logGroupName The new value for the LogGroupName property for this object.
     */
    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }
    
    /**
     * Sets the value of the LogGroupName property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     *
     * @param logGroupName The new value for the LogGroupName property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutRetentionPolicyRequest withLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
        return this;
    }

    /**
     * Specifies the number of days you want to retain log events in the
     * specified log group. Possible values are: 1, 3, 5, 7, 14, 30, 60, 90,
     * 120, 150, 180, 365, 400, 547, 730.
     *
     * @return Specifies the number of days you want to retain log events in the
     *         specified log group. Possible values are: 1, 3, 5, 7, 14, 30, 60, 90,
     *         120, 150, 180, 365, 400, 547, 730.
     */
    public Integer getRetentionInDays() {
        return retentionInDays;
    }
    
    /**
     * Specifies the number of days you want to retain log events in the
     * specified log group. Possible values are: 1, 3, 5, 7, 14, 30, 60, 90,
     * 120, 150, 180, 365, 400, 547, 730.
     *
     * @param retentionInDays Specifies the number of days you want to retain log events in the
     *         specified log group. Possible values are: 1, 3, 5, 7, 14, 30, 60, 90,
     *         120, 150, 180, 365, 400, 547, 730.
     */
    public void setRetentionInDays(Integer retentionInDays) {
        this.retentionInDays = retentionInDays;
    }
    
    /**
     * Specifies the number of days you want to retain log events in the
     * specified log group. Possible values are: 1, 3, 5, 7, 14, 30, 60, 90,
     * 120, 150, 180, 365, 400, 547, 730.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param retentionInDays Specifies the number of days you want to retain log events in the
     *         specified log group. Possible values are: 1, 3, 5, 7, 14, 30, 60, 90,
     *         120, 150, 180, 365, 400, 547, 730.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutRetentionPolicyRequest withRetentionInDays(Integer retentionInDays) {
        this.retentionInDays = retentionInDays;
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
        if (getLogGroupName() != null) sb.append("LogGroupName: " + getLogGroupName() + ",");
        if (getRetentionInDays() != null) sb.append("RetentionInDays: " + getRetentionInDays() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getLogGroupName() == null) ? 0 : getLogGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getRetentionInDays() == null) ? 0 : getRetentionInDays().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PutRetentionPolicyRequest == false) return false;
        PutRetentionPolicyRequest other = (PutRetentionPolicyRequest)obj;
        
        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null) return false;
        if (other.getLogGroupName() != null && other.getLogGroupName().equals(this.getLogGroupName()) == false) return false; 
        if (other.getRetentionInDays() == null ^ this.getRetentionInDays() == null) return false;
        if (other.getRetentionInDays() != null && other.getRetentionInDays().equals(this.getRetentionInDays()) == false) return false; 
        return true;
    }
    
}
    