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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CreateIPSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateIPSetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private String ipSetId;

    /**
     * @param ipSetId
     */

    public void setIpSetId(String ipSetId) {
        this.ipSetId = ipSetId;
    }

    /**
     * @return
     */

    public String getIpSetId() {
        return this.ipSetId;
    }

    /**
     * @param ipSetId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIPSetResult withIpSetId(String ipSetId) {
        setIpSetId(ipSetId);
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
        if (getIpSetId() != null)
            sb.append("IpSetId: ").append(getIpSetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateIPSetResult == false)
            return false;
        CreateIPSetResult other = (CreateIPSetResult) obj;
        if (other.getIpSetId() == null ^ this.getIpSetId() == null)
            return false;
        if (other.getIpSetId() != null && other.getIpSetId().equals(this.getIpSetId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpSetId() == null) ? 0 : getIpSetId().hashCode());
        return hashCode;
    }

    @Override
    public CreateIPSetResult clone() {
        try {
            return (CreateIPSetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
