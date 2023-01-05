/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mgn.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/DisassociateApplications" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateApplicationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Application IDs list.
     * </p>
     */
    private java.util.List<String> applicationIDs;
    /**
     * <p>
     * Wave ID.
     * </p>
     */
    private String waveID;

    /**
     * <p>
     * Application IDs list.
     * </p>
     * 
     * @return Application IDs list.
     */

    public java.util.List<String> getApplicationIDs() {
        return applicationIDs;
    }

    /**
     * <p>
     * Application IDs list.
     * </p>
     * 
     * @param applicationIDs
     *        Application IDs list.
     */

    public void setApplicationIDs(java.util.Collection<String> applicationIDs) {
        if (applicationIDs == null) {
            this.applicationIDs = null;
            return;
        }

        this.applicationIDs = new java.util.ArrayList<String>(applicationIDs);
    }

    /**
     * <p>
     * Application IDs list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setApplicationIDs(java.util.Collection)} or {@link #withApplicationIDs(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param applicationIDs
     *        Application IDs list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateApplicationsRequest withApplicationIDs(String... applicationIDs) {
        if (this.applicationIDs == null) {
            setApplicationIDs(new java.util.ArrayList<String>(applicationIDs.length));
        }
        for (String ele : applicationIDs) {
            this.applicationIDs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Application IDs list.
     * </p>
     * 
     * @param applicationIDs
     *        Application IDs list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateApplicationsRequest withApplicationIDs(java.util.Collection<String> applicationIDs) {
        setApplicationIDs(applicationIDs);
        return this;
    }

    /**
     * <p>
     * Wave ID.
     * </p>
     * 
     * @param waveID
     *        Wave ID.
     */

    public void setWaveID(String waveID) {
        this.waveID = waveID;
    }

    /**
     * <p>
     * Wave ID.
     * </p>
     * 
     * @return Wave ID.
     */

    public String getWaveID() {
        return this.waveID;
    }

    /**
     * <p>
     * Wave ID.
     * </p>
     * 
     * @param waveID
     *        Wave ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateApplicationsRequest withWaveID(String waveID) {
        setWaveID(waveID);
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
        if (getApplicationIDs() != null)
            sb.append("ApplicationIDs: ").append(getApplicationIDs()).append(",");
        if (getWaveID() != null)
            sb.append("WaveID: ").append(getWaveID());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateApplicationsRequest == false)
            return false;
        DisassociateApplicationsRequest other = (DisassociateApplicationsRequest) obj;
        if (other.getApplicationIDs() == null ^ this.getApplicationIDs() == null)
            return false;
        if (other.getApplicationIDs() != null && other.getApplicationIDs().equals(this.getApplicationIDs()) == false)
            return false;
        if (other.getWaveID() == null ^ this.getWaveID() == null)
            return false;
        if (other.getWaveID() != null && other.getWaveID().equals(this.getWaveID()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationIDs() == null) ? 0 : getApplicationIDs().hashCode());
        hashCode = prime * hashCode + ((getWaveID() == null) ? 0 : getWaveID().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateApplicationsRequest clone() {
        return (DisassociateApplicationsRequest) super.clone();
    }

}
