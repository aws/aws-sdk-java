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
package com.amazonaws.services.waf.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetChangeTokenStatus" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetChangeTokenStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The status of the change token.
     * </p>
     */
    private String changeTokenStatus;

    /**
     * <p>
     * The status of the change token.
     * </p>
     * 
     * @param changeTokenStatus
     *        The status of the change token.
     * @see ChangeTokenStatus
     */

    public void setChangeTokenStatus(String changeTokenStatus) {
        this.changeTokenStatus = changeTokenStatus;
    }

    /**
     * <p>
     * The status of the change token.
     * </p>
     * 
     * @return The status of the change token.
     * @see ChangeTokenStatus
     */

    public String getChangeTokenStatus() {
        return this.changeTokenStatus;
    }

    /**
     * <p>
     * The status of the change token.
     * </p>
     * 
     * @param changeTokenStatus
     *        The status of the change token.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeTokenStatus
     */

    public GetChangeTokenStatusResult withChangeTokenStatus(String changeTokenStatus) {
        setChangeTokenStatus(changeTokenStatus);
        return this;
    }

    /**
     * <p>
     * The status of the change token.
     * </p>
     * 
     * @param changeTokenStatus
     *        The status of the change token.
     * @see ChangeTokenStatus
     */

    public void setChangeTokenStatus(ChangeTokenStatus changeTokenStatus) {
        withChangeTokenStatus(changeTokenStatus);
    }

    /**
     * <p>
     * The status of the change token.
     * </p>
     * 
     * @param changeTokenStatus
     *        The status of the change token.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeTokenStatus
     */

    public GetChangeTokenStatusResult withChangeTokenStatus(ChangeTokenStatus changeTokenStatus) {
        this.changeTokenStatus = changeTokenStatus.toString();
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
        if (getChangeTokenStatus() != null)
            sb.append("ChangeTokenStatus: ").append(getChangeTokenStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetChangeTokenStatusResult == false)
            return false;
        GetChangeTokenStatusResult other = (GetChangeTokenStatusResult) obj;
        if (other.getChangeTokenStatus() == null ^ this.getChangeTokenStatus() == null)
            return false;
        if (other.getChangeTokenStatus() != null && other.getChangeTokenStatus().equals(this.getChangeTokenStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChangeTokenStatus() == null) ? 0 : getChangeTokenStatus().hashCode());
        return hashCode;
    }

    @Override
    public GetChangeTokenStatusResult clone() {
        try {
            return (GetChangeTokenStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
