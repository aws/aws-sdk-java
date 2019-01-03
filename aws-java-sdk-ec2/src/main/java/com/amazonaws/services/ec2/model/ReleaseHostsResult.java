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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReleaseHostsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The IDs of the Dedicated Hosts that were successfully released.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> successful;
    /**
     * <p>
     * The IDs of the Dedicated Hosts that could not be released, including an error message.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<UnsuccessfulItem> unsuccessful;

    /**
     * <p>
     * The IDs of the Dedicated Hosts that were successfully released.
     * </p>
     * 
     * @return The IDs of the Dedicated Hosts that were successfully released.
     */

    public java.util.List<String> getSuccessful() {
        if (successful == null) {
            successful = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return successful;
    }

    /**
     * <p>
     * The IDs of the Dedicated Hosts that were successfully released.
     * </p>
     * 
     * @param successful
     *        The IDs of the Dedicated Hosts that were successfully released.
     */

    public void setSuccessful(java.util.Collection<String> successful) {
        if (successful == null) {
            this.successful = null;
            return;
        }

        this.successful = new com.amazonaws.internal.SdkInternalList<String>(successful);
    }

    /**
     * <p>
     * The IDs of the Dedicated Hosts that were successfully released.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSuccessful(java.util.Collection)} or {@link #withSuccessful(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param successful
     *        The IDs of the Dedicated Hosts that were successfully released.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReleaseHostsResult withSuccessful(String... successful) {
        if (this.successful == null) {
            setSuccessful(new com.amazonaws.internal.SdkInternalList<String>(successful.length));
        }
        for (String ele : successful) {
            this.successful.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the Dedicated Hosts that were successfully released.
     * </p>
     * 
     * @param successful
     *        The IDs of the Dedicated Hosts that were successfully released.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReleaseHostsResult withSuccessful(java.util.Collection<String> successful) {
        setSuccessful(successful);
        return this;
    }

    /**
     * <p>
     * The IDs of the Dedicated Hosts that could not be released, including an error message.
     * </p>
     * 
     * @return The IDs of the Dedicated Hosts that could not be released, including an error message.
     */

    public java.util.List<UnsuccessfulItem> getUnsuccessful() {
        if (unsuccessful == null) {
            unsuccessful = new com.amazonaws.internal.SdkInternalList<UnsuccessfulItem>();
        }
        return unsuccessful;
    }

    /**
     * <p>
     * The IDs of the Dedicated Hosts that could not be released, including an error message.
     * </p>
     * 
     * @param unsuccessful
     *        The IDs of the Dedicated Hosts that could not be released, including an error message.
     */

    public void setUnsuccessful(java.util.Collection<UnsuccessfulItem> unsuccessful) {
        if (unsuccessful == null) {
            this.unsuccessful = null;
            return;
        }

        this.unsuccessful = new com.amazonaws.internal.SdkInternalList<UnsuccessfulItem>(unsuccessful);
    }

    /**
     * <p>
     * The IDs of the Dedicated Hosts that could not be released, including an error message.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUnsuccessful(java.util.Collection)} or {@link #withUnsuccessful(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param unsuccessful
     *        The IDs of the Dedicated Hosts that could not be released, including an error message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReleaseHostsResult withUnsuccessful(UnsuccessfulItem... unsuccessful) {
        if (this.unsuccessful == null) {
            setUnsuccessful(new com.amazonaws.internal.SdkInternalList<UnsuccessfulItem>(unsuccessful.length));
        }
        for (UnsuccessfulItem ele : unsuccessful) {
            this.unsuccessful.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the Dedicated Hosts that could not be released, including an error message.
     * </p>
     * 
     * @param unsuccessful
     *        The IDs of the Dedicated Hosts that could not be released, including an error message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReleaseHostsResult withUnsuccessful(java.util.Collection<UnsuccessfulItem> unsuccessful) {
        setUnsuccessful(unsuccessful);
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
        if (getSuccessful() != null)
            sb.append("Successful: ").append(getSuccessful()).append(",");
        if (getUnsuccessful() != null)
            sb.append("Unsuccessful: ").append(getUnsuccessful());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReleaseHostsResult == false)
            return false;
        ReleaseHostsResult other = (ReleaseHostsResult) obj;
        if (other.getSuccessful() == null ^ this.getSuccessful() == null)
            return false;
        if (other.getSuccessful() != null && other.getSuccessful().equals(this.getSuccessful()) == false)
            return false;
        if (other.getUnsuccessful() == null ^ this.getUnsuccessful() == null)
            return false;
        if (other.getUnsuccessful() != null && other.getUnsuccessful().equals(this.getUnsuccessful()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSuccessful() == null) ? 0 : getSuccessful().hashCode());
        hashCode = prime * hashCode + ((getUnsuccessful() == null) ? 0 : getUnsuccessful().hashCode());
        return hashCode;
    }

    @Override
    public ReleaseHostsResult clone() {
        try {
            return (ReleaseHostsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
