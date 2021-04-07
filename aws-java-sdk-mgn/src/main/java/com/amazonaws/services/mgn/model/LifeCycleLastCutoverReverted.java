/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Lifecycle last Cutover reverted.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/LifeCycleLastCutoverReverted" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LifeCycleLastCutoverReverted implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Lifecycle last Cutover reverted API call date time.
     * </p>
     */
    private String apiCallDateTime;

    /**
     * <p>
     * Lifecycle last Cutover reverted API call date time.
     * </p>
     * 
     * @param apiCallDateTime
     *        Lifecycle last Cutover reverted API call date time.
     */

    public void setApiCallDateTime(String apiCallDateTime) {
        this.apiCallDateTime = apiCallDateTime;
    }

    /**
     * <p>
     * Lifecycle last Cutover reverted API call date time.
     * </p>
     * 
     * @return Lifecycle last Cutover reverted API call date time.
     */

    public String getApiCallDateTime() {
        return this.apiCallDateTime;
    }

    /**
     * <p>
     * Lifecycle last Cutover reverted API call date time.
     * </p>
     * 
     * @param apiCallDateTime
     *        Lifecycle last Cutover reverted API call date time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifeCycleLastCutoverReverted withApiCallDateTime(String apiCallDateTime) {
        setApiCallDateTime(apiCallDateTime);
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
        if (getApiCallDateTime() != null)
            sb.append("ApiCallDateTime: ").append(getApiCallDateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LifeCycleLastCutoverReverted == false)
            return false;
        LifeCycleLastCutoverReverted other = (LifeCycleLastCutoverReverted) obj;
        if (other.getApiCallDateTime() == null ^ this.getApiCallDateTime() == null)
            return false;
        if (other.getApiCallDateTime() != null && other.getApiCallDateTime().equals(this.getApiCallDateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApiCallDateTime() == null) ? 0 : getApiCallDateTime().hashCode());
        return hashCode;
    }

    @Override
    public LifeCycleLastCutoverReverted clone() {
        try {
            return (LifeCycleLastCutoverReverted) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mgn.model.transform.LifeCycleLastCutoverRevertedMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
