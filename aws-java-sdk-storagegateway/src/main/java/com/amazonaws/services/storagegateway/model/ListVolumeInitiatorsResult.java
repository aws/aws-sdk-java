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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * ListVolumeInitiatorsOutput
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/ListVolumeInitiators"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListVolumeInitiatorsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The host names and port numbers of all iSCSI initiators that are connected to the gateway.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> initiators;

    /**
     * <p>
     * The host names and port numbers of all iSCSI initiators that are connected to the gateway.
     * </p>
     * 
     * @return The host names and port numbers of all iSCSI initiators that are connected to the gateway.
     */

    public java.util.List<String> getInitiators() {
        if (initiators == null) {
            initiators = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return initiators;
    }

    /**
     * <p>
     * The host names and port numbers of all iSCSI initiators that are connected to the gateway.
     * </p>
     * 
     * @param initiators
     *        The host names and port numbers of all iSCSI initiators that are connected to the gateway.
     */

    public void setInitiators(java.util.Collection<String> initiators) {
        if (initiators == null) {
            this.initiators = null;
            return;
        }

        this.initiators = new com.amazonaws.internal.SdkInternalList<String>(initiators);
    }

    /**
     * <p>
     * The host names and port numbers of all iSCSI initiators that are connected to the gateway.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInitiators(java.util.Collection)} or {@link #withInitiators(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param initiators
     *        The host names and port numbers of all iSCSI initiators that are connected to the gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVolumeInitiatorsResult withInitiators(String... initiators) {
        if (this.initiators == null) {
            setInitiators(new com.amazonaws.internal.SdkInternalList<String>(initiators.length));
        }
        for (String ele : initiators) {
            this.initiators.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The host names and port numbers of all iSCSI initiators that are connected to the gateway.
     * </p>
     * 
     * @param initiators
     *        The host names and port numbers of all iSCSI initiators that are connected to the gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVolumeInitiatorsResult withInitiators(java.util.Collection<String> initiators) {
        setInitiators(initiators);
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
        if (getInitiators() != null)
            sb.append("Initiators: ").append(getInitiators());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListVolumeInitiatorsResult == false)
            return false;
        ListVolumeInitiatorsResult other = (ListVolumeInitiatorsResult) obj;
        if (other.getInitiators() == null ^ this.getInitiators() == null)
            return false;
        if (other.getInitiators() != null && other.getInitiators().equals(this.getInitiators()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInitiators() == null) ? 0 : getInitiators().hashCode());
        return hashCode;
    }

    @Override
    public ListVolumeInitiatorsResult clone() {
        try {
            return (ListVolumeInitiatorsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
