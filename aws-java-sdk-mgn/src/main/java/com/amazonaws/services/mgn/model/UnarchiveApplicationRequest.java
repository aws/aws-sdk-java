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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/UnarchiveApplication" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UnarchiveApplicationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Application ID.
     * </p>
     */
    private String applicationID;

    /**
     * <p>
     * Application ID.
     * </p>
     * 
     * @param applicationID
     *        Application ID.
     */

    public void setApplicationID(String applicationID) {
        this.applicationID = applicationID;
    }

    /**
     * <p>
     * Application ID.
     * </p>
     * 
     * @return Application ID.
     */

    public String getApplicationID() {
        return this.applicationID;
    }

    /**
     * <p>
     * Application ID.
     * </p>
     * 
     * @param applicationID
     *        Application ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnarchiveApplicationRequest withApplicationID(String applicationID) {
        setApplicationID(applicationID);
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
        if (getApplicationID() != null)
            sb.append("ApplicationID: ").append(getApplicationID());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UnarchiveApplicationRequest == false)
            return false;
        UnarchiveApplicationRequest other = (UnarchiveApplicationRequest) obj;
        if (other.getApplicationID() == null ^ this.getApplicationID() == null)
            return false;
        if (other.getApplicationID() != null && other.getApplicationID().equals(this.getApplicationID()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationID() == null) ? 0 : getApplicationID().hashCode());
        return hashCode;
    }

    @Override
    public UnarchiveApplicationRequest clone() {
        return (UnarchiveApplicationRequest) super.clone();
    }

}
