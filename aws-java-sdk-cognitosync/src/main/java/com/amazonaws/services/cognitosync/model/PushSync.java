/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.cognitosync.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration options to be applied to the identity pool.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/PushSync" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PushSync implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * List of SNS platform application ARNs that could be used by clients.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> applicationArns;
    /**
     * <p>
     * A role configured to allow Cognito to call SNS on behalf of the developer.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * List of SNS platform application ARNs that could be used by clients.
     * </p>
     * 
     * @return List of SNS platform application ARNs that could be used by clients.
     */

    public java.util.List<String> getApplicationArns() {
        if (applicationArns == null) {
            applicationArns = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return applicationArns;
    }

    /**
     * <p>
     * List of SNS platform application ARNs that could be used by clients.
     * </p>
     * 
     * @param applicationArns
     *        List of SNS platform application ARNs that could be used by clients.
     */

    public void setApplicationArns(java.util.Collection<String> applicationArns) {
        if (applicationArns == null) {
            this.applicationArns = null;
            return;
        }

        this.applicationArns = new com.amazonaws.internal.SdkInternalList<String>(applicationArns);
    }

    /**
     * <p>
     * List of SNS platform application ARNs that could be used by clients.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setApplicationArns(java.util.Collection)} or {@link #withApplicationArns(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param applicationArns
     *        List of SNS platform application ARNs that could be used by clients.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PushSync withApplicationArns(String... applicationArns) {
        if (this.applicationArns == null) {
            setApplicationArns(new com.amazonaws.internal.SdkInternalList<String>(applicationArns.length));
        }
        for (String ele : applicationArns) {
            this.applicationArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of SNS platform application ARNs that could be used by clients.
     * </p>
     * 
     * @param applicationArns
     *        List of SNS platform application ARNs that could be used by clients.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PushSync withApplicationArns(java.util.Collection<String> applicationArns) {
        setApplicationArns(applicationArns);
        return this;
    }

    /**
     * <p>
     * A role configured to allow Cognito to call SNS on behalf of the developer.
     * </p>
     * 
     * @param roleArn
     *        A role configured to allow Cognito to call SNS on behalf of the developer.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * A role configured to allow Cognito to call SNS on behalf of the developer.
     * </p>
     * 
     * @return A role configured to allow Cognito to call SNS on behalf of the developer.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * A role configured to allow Cognito to call SNS on behalf of the developer.
     * </p>
     * 
     * @param roleArn
     *        A role configured to allow Cognito to call SNS on behalf of the developer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PushSync withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getApplicationArns() != null)
            sb.append("ApplicationArns: ").append(getApplicationArns()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PushSync == false)
            return false;
        PushSync other = (PushSync) obj;
        if (other.getApplicationArns() == null ^ this.getApplicationArns() == null)
            return false;
        if (other.getApplicationArns() != null && other.getApplicationArns().equals(this.getApplicationArns()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
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
    public PushSync clone() {
        try {
            return (PushSync) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cognitosync.model.transform.PushSyncMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
