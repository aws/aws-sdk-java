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
package com.amazonaws.services.cognitosync.model;

import java.io.Serializable;

/**
 * <p>
 * Configuration options to be applied to the identity pool.
 * </p>
 */
public class PushSync implements Serializable {

    /**
     * List of SNS platform application ARNs that could be used by clients.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> applicationArns;

    /**
     * A role configured to allow Cognito to call SNS on behalf of the
     * developer.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws:iam::\d+:role/.*<br/>
     */
    private String roleArn;

    /**
     * List of SNS platform application ARNs that could be used by clients.
     *
     * @return List of SNS platform application ARNs that could be used by clients.
     */
    public java.util.List<String> getApplicationArns() {
        if (applicationArns == null) {
              applicationArns = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              applicationArns.setAutoConstruct(true);
        }
        return applicationArns;
    }
    
    /**
     * List of SNS platform application ARNs that could be used by clients.
     *
     * @param applicationArns List of SNS platform application ARNs that could be used by clients.
     */
    public void setApplicationArns(java.util.Collection<String> applicationArns) {
        if (applicationArns == null) {
            this.applicationArns = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> applicationArnsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(applicationArns.size());
        applicationArnsCopy.addAll(applicationArns);
        this.applicationArns = applicationArnsCopy;
    }
    
    /**
     * List of SNS platform application ARNs that could be used by clients.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param applicationArns List of SNS platform application ARNs that could be used by clients.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PushSync withApplicationArns(String... applicationArns) {
        if (getApplicationArns() == null) setApplicationArns(new java.util.ArrayList<String>(applicationArns.length));
        for (String value : applicationArns) {
            getApplicationArns().add(value);
        }
        return this;
    }
    
    /**
     * List of SNS platform application ARNs that could be used by clients.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param applicationArns List of SNS platform application ARNs that could be used by clients.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PushSync withApplicationArns(java.util.Collection<String> applicationArns) {
        if (applicationArns == null) {
            this.applicationArns = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> applicationArnsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(applicationArns.size());
            applicationArnsCopy.addAll(applicationArns);
            this.applicationArns = applicationArnsCopy;
        }

        return this;
    }

    /**
     * A role configured to allow Cognito to call SNS on behalf of the
     * developer.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws:iam::\d+:role/.*<br/>
     *
     * @return A role configured to allow Cognito to call SNS on behalf of the
     *         developer.
     */
    public String getRoleArn() {
        return roleArn;
    }
    
    /**
     * A role configured to allow Cognito to call SNS on behalf of the
     * developer.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws:iam::\d+:role/.*<br/>
     *
     * @param roleArn A role configured to allow Cognito to call SNS on behalf of the
     *         developer.
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }
    
    /**
     * A role configured to allow Cognito to call SNS on behalf of the
     * developer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws:iam::\d+:role/.*<br/>
     *
     * @param roleArn A role configured to allow Cognito to call SNS on behalf of the
     *         developer.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PushSync withRoleArn(String roleArn) {
        this.roleArn = roleArn;
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
        if (getApplicationArns() != null) sb.append("ApplicationArns: " + getApplicationArns() + ",");
        if (getRoleArn() != null) sb.append("RoleArn: " + getRoleArn() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getApplicationArns() == null) ? 0 : getApplicationArns().hashCode()); 
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PushSync == false) return false;
        PushSync other = (PushSync)obj;
        
        if (other.getApplicationArns() == null ^ this.getApplicationArns() == null) return false;
        if (other.getApplicationArns() != null && other.getApplicationArns().equals(this.getApplicationArns()) == false) return false; 
        if (other.getRoleArn() == null ^ this.getRoleArn() == null) return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false) return false; 
        return true;
    }
    
}
    